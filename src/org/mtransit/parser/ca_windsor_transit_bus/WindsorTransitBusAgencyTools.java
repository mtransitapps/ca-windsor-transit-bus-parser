package org.mtransit.parser.ca_windsor_transit_bus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.mtransit.parser.DefaultAgencyTools;
import org.mtransit.parser.Pair;
import org.mtransit.parser.SplitUtils;
import org.mtransit.parser.Utils;
import org.mtransit.parser.SplitUtils.RouteTripSpec;
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
import org.mtransit.parser.mt.data.MTripStop;
import org.mtransit.parser.CleanUtils;
import org.mtransit.parser.mt.data.MTrip;

// http://www.citywindsor.ca/opendata/Pages/Open-Data-Catalogue.aspx
// http://www.citywindsor.ca/opendata/Lists/OpenData/Attachments/34/google_transit.zip
public class WindsorTransitBusAgencyTools extends DefaultAgencyTools {

	public static void main(String[] args) {
		if (args == null || args.length == 0) {
			args = new String[3];
			args[0] = "input/gtfs.zip";
			args[1] = "../../mtransitapps/ca-windsor-transit-bus-android/res/raw/";
			args[2] = ""; // files-prefix
		}
		new WindsorTransitBusAgencyTools().start(args);
	}

	private HashSet<String> serviceIds;

	@Override
	public void start(String[] args) {
		System.out.printf("\nGenerating Windsor Transit bus data...");
		long start = System.currentTimeMillis();
		this.serviceIds = extractUsefulServiceIds(args, this);
		super.start(args);
		System.out.printf("\nGenerating Windsor Transit bus data... DONE in %s.\n", Utils.getPrettyDuration(System.currentTimeMillis() - start));
	}

	@Override
	public boolean excludeCalendar(GCalendar gCalendar) {
		if (this.serviceIds != null) {
			return excludeUselessCalendar(gCalendar, this.serviceIds);
		}
		return super.excludeCalendar(gCalendar);
	}

	@Override
	public boolean excludeCalendarDate(GCalendarDate gCalendarDates) {
		if (this.serviceIds != null) {
			return excludeUselessCalendarDate(gCalendarDates, this.serviceIds);
		}
		return super.excludeCalendarDate(gCalendarDates);
	}

	@Override
	public boolean excludeTrip(GTrip gTrip) {
		if (this.serviceIds != null) {
			return excludeUselessTrip(gTrip, this.serviceIds);
		}
		return super.excludeTrip(gTrip);
	}

	@Override
	public Integer getAgencyRouteType() {
		return MAgency.ROUTE_TYPE_BUS;
	}

	private static final Pattern DIGITS = Pattern.compile("[\\d]+");

	private static final String A = "A";
	private static final String C = "C";
	private static final String W = "W";

	private static final String RSN_TUNNEL_BUS = "2222";

	private static final long TUNNEL_BUS_RID = 9L;
	private static final String TUNNEL_BUS_RSN = "Tunnel";
	private static final String TUNNEL_BUS_RLN = "Tunnel Bus";

	private static final long RID_ID_A = 10000l;
	private static final long RID_ID_C = 30000l;
	private static final long RID_ID_W = 230000l;

	@Override
	public long getRouteId(GRoute gRoute) {
		if (RSN_TUNNEL_BUS.equalsIgnoreCase(gRoute.getRouteShortName())) {
			return TUNNEL_BUS_RID;
		}
		if (Utils.isDigitsOnly(gRoute.getRouteShortName())) {
			return Long.parseLong(gRoute.getRouteShortName()); // use route short name as route ID
		}
		Matcher matcher = DIGITS.matcher(gRoute.getRouteShortName());
		if (matcher.find()) {
			long id = Long.parseLong(matcher.group());
			if (gRoute.getRouteShortName().endsWith(A)) {
				return RID_ID_A + id;
			} else if (gRoute.getRouteShortName().endsWith(C)) {
				return RID_ID_C + id;
			} else if (gRoute.getRouteShortName().endsWith(W)) {
				return RID_ID_W + id;
			}
		}
		System.out.println("Unexpected route ID " + gRoute);
		System.exit(-1);
		return -1l;
	}

	@Override
	public String getRouteShortName(GRoute gRoute) {
		if (RSN_TUNNEL_BUS.equalsIgnoreCase(gRoute.getRouteShortName())) {
			return TUNNEL_BUS_RSN;
		}
		return super.getRouteShortName(gRoute);
	}

	@Override
	public String getRouteLongName(GRoute gRoute) {
		if (RSN_TUNNEL_BUS.equalsIgnoreCase(gRoute.getRouteShortName())) {
			return TUNNEL_BUS_RLN;
		}
		String routeLongName = gRoute.getRouteLongName();
		routeLongName = routeLongName.toLowerCase(Locale.ENGLISH);
		return CleanUtils.cleanLabel(routeLongName);
	}

	private static final String AGENCY_COLOR_BLUE = "009AD6"; // BLUE (from web site logo)
	private static final String AGENCY_COLOR = AGENCY_COLOR_BLUE;

	@Override
	public String getAgencyColor() {
		return AGENCY_COLOR;
	}

	private static final String RSN_1A = "1A";
	private static final String RSN_1C = "1C";
	private static final String RSN_3W = "3W";

	private static final String COLOR_B50C43 = "B50C43";
	private static final String COLOR_4E1E18 = "4E1E18";
	private static final String COLOR_CE910E = "CE910E";
	private static final String COLOR_ED1248 = "ED1248";
	private static final String COLOR_F68312 = "F68312";
	private static final String COLOR_FEDF3F = "FEDF3F";
	private static final String COLOR_65C1EF = "65C1EF";
	private static final String COLOR_222771 = "222771";
	private static final String COLOR_FBC1A0 = "FBC1A0";
	private static final String COLOR_184A31 = "184A31";
	private static final String COLOR_87CF32 = "87CF32";
	private static final String COLOR_F0319A = "F0319A";
	private static final String COLOR_A67AC4 = "A67AC4";

	@Override
	public String getRouteColor(GRoute gRoute) {
		if (Utils.isDigitsOnly(gRoute.getRouteShortName())) {
			switch (Integer.parseInt(gRoute.getRouteShortName())) {
			// @formatter:off
			case 2: return COLOR_F68312;
			case 3: return COLOR_FEDF3F; // COLOR_FFF44C;
			case 4: return COLOR_65C1EF;
			case 5: return COLOR_222771;
			case 6: return COLOR_FBC1A0;
			case 7: return COLOR_184A31;
			case 8: return COLOR_87CF32;
			case 10: return COLOR_F0319A;
			case 14: return COLOR_A67AC4;
			// @formatter:on
			}
		}
		if (RSN_1A.equalsIgnoreCase(gRoute.getRouteShortName())) {
			return COLOR_B50C43;
		} else if (RSN_1C.equalsIgnoreCase(gRoute.getRouteShortName())) {
			return COLOR_4E1E18;
		} else if (RSN_3W.equalsIgnoreCase(gRoute.getRouteShortName())) {
			return COLOR_CE910E;
		}
		if (RSN_TUNNEL_BUS.equalsIgnoreCase(gRoute.getRouteShortName())) {
			return COLOR_ED1248;
		}
		System.out.printf("\nUnexpected route color %s!\n", gRoute);
		System.exit(-1);
		return null;
	}

	private static HashMap<Long, RouteTripSpec> ALL_ROUTE_TRIPS2;
	static {
		HashMap<Long, RouteTripSpec> map2 = new HashMap<Long, RouteTripSpec>();
		map2.put(1L + RID_ID_A, new RouteTripSpec(1L + RID_ID_A, // 1A
				MDirectionType.NORTH.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.NORTH.getId(), // Downtown Transit Terminal
				MDirectionType.SOUTH.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.SOUTH.getId()) // Devonshire Mall
				.addTripSort(MDirectionType.NORTH.intValue(), //
						Arrays.asList(new String[] { //
						"26", // Devonshire Mall at Moxies
								"1", // Windsor Transit Terminal
						})) //
				.addTripSort(MDirectionType.SOUTH.intValue(), //
						Arrays.asList(new String[] { //
						"1", // Windsor Transit Terminal
								"24", // ==
								"25", // !=
								"53", // !=
								"58", // !=
								"26", // Devonshire Mall at Moxies
						})) //
				.compileBothTripSort());
		map2.put(1L + RID_ID_C, new RouteTripSpec(1L + RID_ID_C, // 1C
				MDirectionType.EAST.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.EAST.getId(), // Forest Glade
				MDirectionType.WEST.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.WEST.getId()) // College Ave Community Ctr
				.addTripSort(MDirectionType.EAST.intValue(), //
						Arrays.asList(new String[] { //
						"134", // College Ave. at Community Centre
								"147", // Felix at College
								"159", // University at Curry
								"199", // Tecumseh Mall Rear Entrance
								"59", // Forest Glade at Mulberry
						})) //
				.addTripSort(MDirectionType.WEST.intValue(), //
						Arrays.asList(new String[] { //
						"59", // Forest Glade at Mulberry
								"64", // Wildwood at Forest Glade
								"103", // Tecumseh at Factoria
								"134", // College Ave. at Community Centre
						})) //
				.compileBothTripSort());
		map2.put(2L, new RouteTripSpec(2L, //
				MDirectionType.EAST.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.EAST.getId(), // Tecumseh Mall
				MDirectionType.WEST.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.WEST.getId()) // College Ave Community Ctr
				.addTripSort(MDirectionType.EAST.intValue(), //
						Arrays.asList(new String[] { //
						"292", // College Ave. at Community Centre
								"303", // Wyandotte at Randolph
								"211", // Tecumseh Mall Rear Entrance
						})) //
				.addTripSort(MDirectionType.WEST.intValue(), //
						Arrays.asList(new String[] { //
						"211", // Tecumseh Mall Rear Entrance
								"292", // College Ave. at Community Centre
						})) //
				.compileBothTripSort());
		map2.put(3L, new RouteTripSpec(3L, //
				MDirectionType.EAST.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.EAST.getId(), // Transit Ctr
				MDirectionType.WEST.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.WEST.getId()) // College Ave Community Ctr
				.addTripSort(MDirectionType.EAST.intValue(), //
						Arrays.asList(new String[] { //
						"373", // College Ave. at Community Centre <= START
								"388", // Tecumseh at Northway
								"311", // !=
								"463", // != Transit Terminal at Chatham <= START
								"3", // !=
								"4", // ==
								"179", // ++
								"180", // == Tecumseh at Central
								"423", // ++
								"442", // ==
								"443", // !=
								"461", // !=
								"462", // == Transit Centre Front Entrance
						})) //
				.addTripSort(MDirectionType.WEST.intValue(), //
						Arrays.asList(new String[] { //
						"462", // Transit Centre Front Entrance
								"464", // !=
								"98", // ++
								"99", // != Tecumseh at Central
								"180", // != Tecumseh at Central
								"100", // ++
								"519", // ++
								"520", // Tecumseh at Felix
								"146", // ++
								"373", // College Ave. at Community Centre
						})) //
				.compileBothTripSort());
		map2.put(3L + RID_ID_W, new RouteTripSpec(3L + RID_ID_W, // 3W
				MDirectionType.EAST.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.EAST.getId(), // Downtown Transit Terminal
				MDirectionType.WEST.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.WEST.getId()) // College Ave Community Ctr
				.addTripSort(MDirectionType.EAST.intValue(), //
						Arrays.asList(new String[] { //
						"373", // College Ave. at Community Centre
								"388", // Tecumseh at Northway
								"463", // Transit Terminal at Chatham
						})) //
				.addTripSort(MDirectionType.WEST.intValue(), //
						Arrays.asList(new String[] { //
						"463", // Transit Terminal at Chatham
								"520", // Tecumseh at Felix
								"373", // College Ave. at Community Centre
						})) //
				.compileBothTripSort());
		map2.put(4L, new RouteTripSpec(4L, //
				MDirectionType.EAST.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.EAST.getId(), // Meadowbrook via Tecumseh Mall
				MDirectionType.WEST.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.WEST.getId()) // Downtown Transit Terminal
				.addTripSort(MDirectionType.EAST.intValue(), //
						Arrays.asList(new String[] { //
						"573", // Transit Windsor Terminal
								"5", // ==
								"6", // !=
								"628", // !=
								"400", // !=
								"574", // !=
								"575", // ==
								"581", // ==
								"582", // !=
								"417", // !=
								"629", // !=
								"630", // !=
								"583", // ==
								"617", // Lauzon Rd. at Hawthorne
								"521", // Essex Way at Meadowbrook
						})) //
				.addTripSort(MDirectionType.WEST.intValue(), //
						Arrays.asList(new String[] { //
						"521", // Essex Way at Meadowbrook
								"529", // Lauzon Road at Hawthorne
								"563", // ==
								"633", // !=
								"634", // !=
								"488", // !=
								"564", // !=
								"565", // ==
								"571", // ==
								"572", // !=
								"505", // !=
								"635", // !=
								"47", // !=
								"48", // ==
								"573", // Transit Windsor Terminal
						})) //
				.compileBothTripSort());
		map2.put(5L, new RouteTripSpec(5L, //
				MDirectionType.NORTH.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.NORTH.getId(), // Downtown Transit Terminal
				MDirectionType.SOUTH.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.SOUTH.getId()) // St Clair College
				.addTripSort(MDirectionType.NORTH.intValue(), //
						Arrays.asList(new String[] { //
						"641", // St. Clair College Front Entrance
								"1007", // Labelle at Dominion
								"1030", // Windsor Transit Terminal
						})) //
				.addTripSort(MDirectionType.SOUTH.intValue(), //
						Arrays.asList(new String[] { //
						"1030", // Windsor Transit Terminal
								"641", // St. Clair College Front Entrance
						})) //
				.compileBothTripSort());
		map2.put(6L, new RouteTripSpec(6L, //
				MDirectionType.NORTH.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.NORTH.getId(), // Downtown Transit Terminal
				MDirectionType.SOUTH.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.SOUTH.getId()) // St Clair College
				.addTripSort(MDirectionType.NORTH.intValue(), //
						Arrays.asList(new String[] { //
						"641", // St. Clair College Front Entrance
								"682", // Transit Terminal at Chatham
						})) //
				.addTripSort(MDirectionType.SOUTH.intValue(), //
						Arrays.asList(new String[] { //
						"682", // Transit Terminal at Chatham
								"641", // St. Clair College Front Entrance
						})) //
				.compileBothTripSort());
		map2.put(7L, new RouteTripSpec(7L, //
				MDirectionType.EAST.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.EAST.getId(), // South Walker Rd
				MDirectionType.WEST.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.WEST.getId()) // College Ave Community Ctr
				.addTripSort(MDirectionType.EAST.intValue(), //
						Arrays.asList(new String[] { //
						"952", // College Ave. at Community Centre
								"987", // Provincial at Humane Society
								"911", // Legacy Park at Sears Home
						})) //
				.addTripSort(MDirectionType.WEST.intValue(), //
						Arrays.asList(new String[] { //
						"911", // Legacy Park at Sears Home
								"26", // Devonshire Mall at Moxies
								"952", // College Ave. at Community Centre
						})) //
				.compileBothTripSort());
		map2.put(8L, new RouteTripSpec(8L, //
				MDirectionType.NORTH.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.NORTH.getId(), // Downtown Transit Terminal
				MDirectionType.SOUTH.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.SOUTH.getId()) // South Walker Rd
				.addTripSort(MDirectionType.NORTH.intValue(), //
						Arrays.asList(new String[] { //
						"724", // Sixth Concession at North Talbot
								"737", // ==
								"832", // !=
								"738", // ==
								"778", // Transit Terminal Church at Pitt
						})) //
				.addTripSort(MDirectionType.SOUTH.intValue(), //
						Arrays.asList(new String[] { //
						"778", // Transit Terminal Church at Pitt
								"804", // ++
								"724", // Sixth Concession at North Talbot
						})) //
				.compileBothTripSort());
		map2.put(TUNNEL_BUS_RID, new RouteTripSpec(TUNNEL_BUS_RID, // 9 - Tunnel Bus
				MDirectionType.NORTH.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.NORTH.getId(), // Detroit
				MDirectionType.SOUTH.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.SOUTH.getId()) // Windsor Transit Terminal
				.addTripSort(MDirectionType.NORTH.intValue(), //
						Arrays.asList(new String[] { //
						"895", // Windsor Transit Terminal
								"887", // Rosa Parks Transit Center
						})) //
				.addTripSort(MDirectionType.SOUTH.intValue(), //
						Arrays.asList(new String[] { //
						"887", // Rosa Parks Transit Center
								"893", // Chatham at Goyeau
								"895", // Windsor Transit Terminal
						})) //
				.compileBothTripSort());
		map2.put(10L, new RouteTripSpec(10L, //
				MDirectionType.NORTH.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.NORTH.getId(), // North Loop
				MDirectionType.SOUTH.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.SOUTH.getId()) // South Loop
				.addTripSort(MDirectionType.NORTH.intValue(), //
						Arrays.asList(new String[] { //
						"211", // Tecumseh Mall Rear Entrance
								"212", // ++
								"1086", // ==
								"1114", // !=
								"1087", // !=
								"1088", // ==
								"372", // ++
								"1065", // Tecumseh Mall Rear Entrance
						})) //
				.addTripSort(MDirectionType.SOUTH.intValue(), //
						Arrays.asList(new String[] { //
						"1065", // Tecumseh Mall Rear Entrance
								"200", // ++
								"1081", // ==
								"1113", // !=
								"1082", // !=
								"1083", // ==
								"372", // ++
								"211", // Tecumseh Mall Rear Entrance
						})) //
				.compileBothTripSort());
		map2.put(14L, new RouteTripSpec(14L, //
				MDirectionType.NORTH.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.NORTH.getId(), // Downtown Transit Terminal
				MDirectionType.SOUTH.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.SOUTH.getId()) // Devonshire Mall
				.addTripSort(MDirectionType.NORTH.intValue(), //
						Arrays.asList(new String[] { //
						"833", // Devonshire Mall at Moxies
								"463", // Transit Terminal at Chatham
						})) //
				.addTripSort(MDirectionType.SOUTH.intValue(), //
						Arrays.asList(new String[] { //
						"463", // Transit Terminal at Chatham
								"833", // Devonshire Mall at Moxies
						})) //
				.compileBothTripSort());
		ALL_ROUTE_TRIPS2 = map2;
	}

	@Override
	public int compareEarly(long routeId, List<MTripStop> list1, List<MTripStop> list2, MTripStop ts1, MTripStop ts2, GStop ts1GStop, GStop ts2GStop) {
		if (ALL_ROUTE_TRIPS2.containsKey(routeId)) {
			return ALL_ROUTE_TRIPS2.get(routeId).compare(routeId, list1, list2, ts1, ts2, ts1GStop, ts2GStop);
		}
		return super.compareEarly(routeId, list1, list2, ts1, ts2, ts1GStop, ts2GStop);
	}

	@Override
	public ArrayList<MTrip> splitTrip(MRoute mRoute, GTrip gTrip, GSpec gtfs) {
		if (ALL_ROUTE_TRIPS2.containsKey(mRoute.getId())) {
			return ALL_ROUTE_TRIPS2.get(mRoute.getId()).getAllTrips();
		}
		return super.splitTrip(mRoute, gTrip, gtfs);
	}

	@Override
	public Pair<Long[], Integer[]> splitTripStop(MRoute mRoute, GTrip gTrip, GTripStop gTripStop, ArrayList<MTrip> splitTrips, GSpec routeGTFS) {
		if (ALL_ROUTE_TRIPS2.containsKey(mRoute.getId())) {
			return SplitUtils.splitTripStop(mRoute, gTrip, gTripStop, routeGTFS, ALL_ROUTE_TRIPS2.get(mRoute.getId()));
		}
		return super.splitTripStop(mRoute, gTrip, gTripStop, splitTrips, routeGTFS);
	}

	@Override
	public void setTripHeadsign(MRoute mRoute, MTrip mTrip, GTrip gTrip, GSpec gtfs) {
		if (ALL_ROUTE_TRIPS2.containsKey(mRoute.getId())) {
			return; // split
		}
		System.out.printf("\nUnexpected trip (unexpected route ID: %s): %s\n", mRoute.getId(), gTrip);
		System.exit(-1);
	}

	@Override
	public String cleanTripHeadsign(String tripHeadsign) {
		tripHeadsign = CleanUtils.cleanStreetTypes(tripHeadsign);
		return CleanUtils.cleanLabel(tripHeadsign);
	}

	@Override
	public String cleanStopName(String gStopName) {
		gStopName = CleanUtils.CLEAN_AT.matcher(gStopName).replaceAll(CleanUtils.CLEAN_AT_REPLACEMENT);
		gStopName = CleanUtils.cleanStreetTypes(gStopName);
		return CleanUtils.cleanLabel(gStopName);
	}

	@Override
	public int getStopId(GStop gStop) {
		return Integer.parseInt(gStop.getStopCode()); // use stop code as stop ID
	}
}
