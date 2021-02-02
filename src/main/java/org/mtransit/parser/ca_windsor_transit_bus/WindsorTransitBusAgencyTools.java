package org.mtransit.parser.ca_windsor_transit_bus;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.mtransit.commons.StrategicMappingCommons;
import org.mtransit.parser.CleanUtils;
import org.mtransit.parser.DefaultAgencyTools;
import org.mtransit.parser.MTLog;
import org.mtransit.parser.Pair;
import org.mtransit.parser.SplitUtils;
import org.mtransit.parser.SplitUtils.RouteTripSpec;
import org.mtransit.parser.StringUtils;
import org.mtransit.parser.Utils;
import org.mtransit.parser.gtfs.data.GCalendar;
import org.mtransit.parser.gtfs.data.GCalendarDate;
import org.mtransit.parser.gtfs.data.GRoute;
import org.mtransit.parser.gtfs.data.GSpec;
import org.mtransit.parser.gtfs.data.GStop;
import org.mtransit.parser.gtfs.data.GTrip;
import org.mtransit.parser.gtfs.data.GTripStop;
import org.mtransit.parser.mt.data.MAgency;
import org.mtransit.parser.mt.data.MDirectionType;
import org.mtransit.parser.mt.data.MRoute;
import org.mtransit.parser.mt.data.MTrip;
import org.mtransit.parser.mt.data.MTripStop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

import static org.mtransit.parser.StringUtils.EMPTY;

// https://opendata.citywindsor.ca/Opendata/Details/218
// https://opendata.citywindsor.ca/Uploads/google_transit.zip
// https://windsor.mapstrat.com/current/
// https://windsor.mapstrat.com/current/google_transit.zip
public class WindsorTransitBusAgencyTools extends DefaultAgencyTools {

	public static void main(@Nullable String[] args) {
		if (args == null || args.length == 0) {
			args = new String[3];
			args[0] = "input/gtfs.zip";
			args[1] = "../../mtransitapps/ca-windsor-transit-bus-android/res/raw/";
			args[2] = ""; // files-prefix
		}
		new WindsorTransitBusAgencyTools().start(args);
	}

	@Nullable
	private HashSet<Integer> serviceIdInts;

	@Override
	public void start(@NotNull String[] args) {
		MTLog.log("Generating Windsor Transit bus data...");
		long start = System.currentTimeMillis();
		this.serviceIdInts = extractUsefulServiceIdInts(args, this, true);
		super.start(args);
		MTLog.log("Generating Windsor Transit bus data... DONE in %s.", Utils.getPrettyDuration(System.currentTimeMillis() - start));
	}

	@Override
	public boolean excludingAll() {
		return this.serviceIdInts != null && this.serviceIdInts.isEmpty();
	}

	@Override
	public boolean excludeCalendar(@NotNull GCalendar gCalendar) {
		if (this.serviceIdInts != null) {
			return excludeUselessCalendarInt(gCalendar, this.serviceIdInts);
		}
		return super.excludeCalendar(gCalendar);
	}

	@Override
	public boolean excludeCalendarDate(@NotNull GCalendarDate gCalendarDates) {
		if (this.serviceIdInts != null) {
			return excludeUselessCalendarDateInt(gCalendarDates, this.serviceIdInts);
		}
		return super.excludeCalendarDate(gCalendarDates);
	}

	@Override
	public boolean excludeTrip(@NotNull GTrip gTrip) {
		if ("notinservice".equalsIgnoreCase(gTrip.getTripHeadsign())
				|| "not in service".equalsIgnoreCase(gTrip.getTripHeadsign())) {
			return true; // EXCLUDE
		}
		if (this.serviceIdInts != null) {
			return excludeUselessTripInt(gTrip, this.serviceIdInts);
		}
		return super.excludeTrip(gTrip);
	}

	@NotNull
	@Override
	public Integer getAgencyRouteType() {
		return MAgency.ROUTE_TYPE_BUS;
	}

	private static final String RSN_TUNNEL_BUS = "2222";

	@Override
	public long getRouteId(@NotNull GRoute gRoute) { // route_id used by GTFS-RT
		return super.getRouteId(gRoute);
	}

	@Nullable
	@Override
	public String getRouteShortName(@NotNull GRoute gRoute) {
		return super.getRouteShortName(gRoute); // used by Real-Time API
	}

	@NotNull
	@Override
	public String getRouteLongName(@NotNull GRoute gRoute) {
		String routeLongName = gRoute.getRouteLongNameOrDefault();
		routeLongName = CleanUtils.toLowerCaseUpperCaseWords(Locale.ENGLISH, routeLongName);
		return CleanUtils.cleanLabel(routeLongName);
	}

	private static final String AGENCY_COLOR_BLUE = "009AD6"; // BLUE (from web site logo)
	private static final String AGENCY_COLOR = AGENCY_COLOR_BLUE;

	@NotNull
	@Override
	public String getAgencyColor() {
		return AGENCY_COLOR;
	}

	private static final String RSN_1A = "1A";
	private static final String RSN_1C = "1C";
	private static final String RSN_3W = "3W";

	@Nullable
	@Override
	public String getRouteColor(@NotNull GRoute gRoute) {
		if (StringUtils.isEmpty(gRoute.getRouteColor())) {
			if (Utils.isDigitsOnly(gRoute.getRouteShortName())) {
				switch (Integer.parseInt(gRoute.getRouteShortName())) {
				// @formatter:off
                case 2: return "F68312";
                case 3: return "FEDF3F"; // "FFF44C";
                case 4: return "65C1EF";
                case 5: return "222771";
                case 6: return "FBC1A0";
                case 7: return "184A31";
                case 8: return "87CF32";
                case 10: return "F0319A";
                case 14: return "A67AC4";
                case 25: return "163A79";
                case 42: return "8000FF";
                // @formatter:on
				}
			}
			if (RSN_1A.equalsIgnoreCase(gRoute.getRouteShortName())) {
				return "B50C43";
			} else if (RSN_1C.equalsIgnoreCase(gRoute.getRouteShortName())) {
				return "4E1E18";
			} else if (RSN_3W.equalsIgnoreCase(gRoute.getRouteShortName())) {
				return "CE910E";
			}
			if (RSN_TUNNEL_BUS.equalsIgnoreCase(gRoute.getRouteShortName())) {
				return "ED1248";
			}
			throw new MTLog.Fatal("Unexpected route color %s!", gRoute);
		}
		return super.getRouteColor(gRoute);
	}

	private static final long ROUTE_ID_0 = 15L;

	private static final HashMap<Long, RouteTripSpec> ALL_ROUTE_TRIPS2;

	static {
		HashMap<Long, RouteTripSpec> map2 = new HashMap<>();
		//noinspection deprecation
		map2.put(ROUTE_ID_0 + 13L, new RouteTripSpec(ROUTE_ID_0 + 13L, // 10
				StrategicMappingCommons.NORTH, MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.NORTH.getId(), // North Loop
				StrategicMappingCommons.SOUTH, MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.SOUTH.getId()) // South Loop
				.addTripSort(StrategicMappingCommons.NORTH, //
						Arrays.asList( //
								Stops.getALL_STOPS().get("1375"), // Tecumseh Mall Rear Entrance
								Stops.getALL_STOPS().get("2049"), // == McHugh at Darfield
								Stops.getALL_STOPS().get("2048"), // != WFCU Centre Main Entrance
								Stops.getALL_STOPS().get("2047"), // != McHugh at Mickey Renuad Way
								Stops.getALL_STOPS().get("2046"), // == McHugh at Cypress
								Stops.getALL_STOPS().get("1998") // Tecumseh Mall Rear Entrance
						)) //
				.addTripSort(StrategicMappingCommons.SOUTH, //
						Arrays.asList( //
								Stops.getALL_STOPS().get("1998"), // Tecumseh Mall Rear Entrance
								Stops.getALL_STOPS().get("2034"), // == McHugh at Cypress
								Stops.getALL_STOPS().get("2038"), // != McHugh at Micky Renaud Way
								Stops.getALL_STOPS().get("2039"), // != WFCU Centre Main Entrance
								Stops.getALL_STOPS().get("2041"), // == McHugh at Darfield
								Stops.getALL_STOPS().get("1375") // Tecumseh Mall Rear Entrance
						)) //
				.compileBothTripSort());
		ALL_ROUTE_TRIPS2 = map2;
	}

	@Override
	public int compareEarly(long routeId, @NotNull List<MTripStop> list1, @NotNull List<MTripStop> list2, @NotNull MTripStop ts1, @NotNull MTripStop ts2, @NotNull GStop ts1GStop, @NotNull GStop ts2GStop) {
		if (ALL_ROUTE_TRIPS2.containsKey(routeId)) {
			return ALL_ROUTE_TRIPS2.get(routeId).compare(routeId, list1, list2, ts1, ts2, ts1GStop, ts2GStop, this);
		}
		return super.compareEarly(routeId, list1, list2, ts1, ts2, ts1GStop, ts2GStop);
	}

	@NotNull
	@Override
	public ArrayList<MTrip> splitTrip(@NotNull MRoute mRoute, @Nullable GTrip gTrip, @NotNull GSpec gtfs) {
		if (ALL_ROUTE_TRIPS2.containsKey(mRoute.getId())) {
			return ALL_ROUTE_TRIPS2.get(mRoute.getId()).getAllTrips();
		}
		return super.splitTrip(mRoute, gTrip, gtfs);
	}

	@NotNull
	@Override
	public Pair<Long[], Integer[]> splitTripStop(@NotNull MRoute mRoute, @NotNull GTrip gTrip, @NotNull GTripStop gTripStop, @NotNull ArrayList<MTrip> splitTrips, @NotNull GSpec routeGTFS) {
		if (ALL_ROUTE_TRIPS2.containsKey(mRoute.getId())) {
			return SplitUtils.splitTripStop(mRoute, gTrip, gTripStop, routeGTFS, ALL_ROUTE_TRIPS2.get(mRoute.getId()), this);
		}
		return super.splitTripStop(mRoute, gTrip, gTripStop, splitTrips, routeGTFS);
	}

	@Override
	public void setTripHeadsign(@NotNull MRoute mRoute, @NotNull MTrip mTrip, @NotNull GTrip gTrip, @NotNull GSpec gtfs) {
		if (ALL_ROUTE_TRIPS2.containsKey(mRoute.getId())) {
			return; // split
		}
		mTrip.setHeadsignString(
				cleanTripHeadsign(gTrip.getTripHeadsignOrDefault()),
				gTrip.getDirectionIdOrDefault()
		);
	}

	@Override
	public boolean directionFinderEnabled() {
		return true;
	}

	@Override
	public boolean directionFinderEnabled(long routeId, @NotNull GRoute gRoute) {
		if (routeId == ROUTE_ID_0 + 13) { // 10
			return false; // because 2 direction_id w/ same head-sign & last stop (2 different loops)
		}
		return super.directionFinderEnabled(routeId, gRoute);
	}

	@NotNull
	@Override
	public String cleanDirectionHeadsign(boolean fromStopName, @NotNull String directionHeadSign) {
		directionHeadSign = super.cleanDirectionHeadsign(fromStopName, directionHeadSign);
		if (fromStopName) {
			directionHeadSign = WINDSOR_TT_.matcher(directionHeadSign).replaceAll(WINDSOR_TT_REPLACEMENT);
		}
		return directionHeadSign;
	}

	@NotNull
	@Override
	public List<Integer> getDirectionTypes() {
		return Arrays.asList(
				MTrip.HEADSIGN_TYPE_DIRECTION,
				MTrip.HEADSIGN_TYPE_STRING
		);
	}

	private static final Pattern HDGH_ = CleanUtils.cleanWords("hotel dieu grace healthcare");
	private static final String HDGH_REPLACEMENT = CleanUtils.cleanWordsReplacement("HDGH");

	private static final Pattern ALL_ENTRANCE_ = CleanUtils.cleanWords("rear entrance", "front entrance");

	private static final Pattern WINDSOR_TT_ = CleanUtils.cleanWords(
			"transit windsor terminal", "transit windsor term",
			"transit terminal", "transit term"
	);
	private static final String WINDSOR_TT_REPLACEMENT = CleanUtils.cleanWordsReplacement("Windsor Transit Terminal");

	private static final Pattern RSN_BOUNDS_ = Pattern.compile("(^\\d+ (eastbound|westbound|northbound|southbound|e|w|n|s))", Pattern.CASE_INSENSITIVE);
	private static final String RSN_BOUNDS_REPLACEMENT = "$2";

	@NotNull
	@Override
	public String cleanTripHeadsign(@NotNull String tripHeadsign) {
		tripHeadsign = RSN_BOUNDS_.matcher(tripHeadsign).replaceAll(RSN_BOUNDS_REPLACEMENT);
		tripHeadsign = WINDSOR_TT_.matcher(tripHeadsign).replaceAll(WINDSOR_TT_REPLACEMENT);
		tripHeadsign = HDGH_.matcher(tripHeadsign).replaceAll(HDGH_REPLACEMENT);
		tripHeadsign = ALL_ENTRANCE_.matcher(tripHeadsign).replaceAll(EMPTY);
		tripHeadsign = CleanUtils.cleanBounds(tripHeadsign);
		tripHeadsign = CleanUtils.cleanNumbers(tripHeadsign);
		tripHeadsign = CleanUtils.cleanStreetTypes(tripHeadsign);
		return CleanUtils.cleanLabel(tripHeadsign);
	}

	@Override
	public boolean mergeHeadsign(@NotNull MTrip mTrip, @NotNull MTrip mTripToMerge) {
		throw new MTLog.Fatal("Unexpected trip to merge %s VS %s!", mTrip, mTripToMerge);
	}

	@NotNull
	@Override
	public String cleanStopName(@NotNull String gStopName) {
		gStopName = CleanUtils.CLEAN_AND.matcher(gStopName).replaceAll(CleanUtils.CLEAN_AND_REPLACEMENT);
		gStopName = CleanUtils.CLEAN_AT.matcher(gStopName).replaceAll(CleanUtils.CLEAN_AT_REPLACEMENT);
		gStopName = CleanUtils.cleanBounds(gStopName);
		gStopName = CleanUtils.cleanNumbers(gStopName);
		gStopName = CleanUtils.cleanStreetTypes(gStopName);
		return CleanUtils.cleanLabel(gStopName);
	}

	@Override
	public int getStopId(@NotNull GStop gStop) { // used by GTFS-RT
		return super.getStopId(gStop);
	}

	@NotNull
	@Override
	public String getStopCode(@NotNull GStop gStop) { // used by StrategicMapping API
		if ("Sto125649".equals(gStop.getStopCode())) {
			return "77" + "1262"; // Wyandotte @ Metro
		}
		if (!gStop.getStopCode().startsWith("77")) {
			return "77" + gStop.getStopCode();
		}
		return super.getStopCode(gStop);
	}
}
