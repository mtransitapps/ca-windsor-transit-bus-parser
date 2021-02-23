package org.mtransit.parser.ca_windsor_transit_bus;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.mtransit.commons.CharUtils;
import org.mtransit.commons.CleanUtils;
import org.mtransit.commons.StringUtils;
import org.mtransit.parser.DefaultAgencyTools;
import org.mtransit.parser.MTLog;
import org.mtransit.parser.gtfs.data.GRoute;
import org.mtransit.parser.gtfs.data.GStop;
import org.mtransit.parser.gtfs.data.GTrip;
import org.mtransit.parser.mt.data.MAgency;
import org.mtransit.parser.mt.data.MTrip;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

import static org.mtransit.parser.StringUtils.EMPTY;

// https://opendata.citywindsor.ca/Opendata/Details/218
// https://opendata.citywindsor.ca/Uploads/google_transit.zip
// https://windsor.mapstrat.com/current/
// https://windsor.mapstrat.com/current/google_transit.zip
public class WindsorTransitBusAgencyTools extends DefaultAgencyTools {

	public static void main(@NotNull String[] args) {
		new WindsorTransitBusAgencyTools().start(args);
	}

	@Override
	public boolean defaultExcludeEnabled() {
		return true;
	}

	@NotNull
	@Override
	public String getAgencyName() {
		return "Transit Windsor";
	}

	@Override
	public boolean excludeTrip(@NotNull GTrip gTrip) {
		if ("notinservice".equalsIgnoreCase(gTrip.getTripHeadsign())
				|| "not in service".equalsIgnoreCase(gTrip.getTripHeadsign())) {
			return true; // EXCLUDE
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
	public String cleanRouteLongName(@NotNull String routeLongName) {
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
			if (CharUtils.isDigitsOnly(gRoute.getRouteShortName())) {
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

	@Override
	public boolean allowNonDescriptiveHeadSigns(long routeId) {
		if (routeId == ROUTE_ID_0 + 13L) { // 10
			return true; // because 2 direction_id w/ same head-sign & last stop
		}
		return super.allowNonDescriptiveHeadSigns(routeId);
	}

	@Override
	public boolean directionFinderEnabled() {
		return true;
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

	private static final Pattern RLN_RSN_ = Pattern.compile("(^[a-z]+[\\d]+$)", Pattern.CASE_INSENSITIVE);

	@NotNull
	@Override
	public String cleanTripHeadsign(@NotNull String tripHeadsign) {
		tripHeadsign = RLN_RSN_.matcher(tripHeadsign).replaceAll(EMPTY);
		tripHeadsign = RSN_BOUNDS_.matcher(tripHeadsign).replaceAll(RSN_BOUNDS_REPLACEMENT);
		tripHeadsign = WINDSOR_TT_.matcher(tripHeadsign).replaceAll(WINDSOR_TT_REPLACEMENT);
		tripHeadsign = HDGH_.matcher(tripHeadsign).replaceAll(HDGH_REPLACEMENT);
		tripHeadsign = ALL_ENTRANCE_.matcher(tripHeadsign).replaceAll(EMPTY);
		tripHeadsign = CleanUtils.cleanBounds(tripHeadsign);
		tripHeadsign = CleanUtils.cleanNumbers(tripHeadsign);
		tripHeadsign = CleanUtils.cleanStreetTypes(tripHeadsign);
		return CleanUtils.cleanLabel(tripHeadsign);
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
