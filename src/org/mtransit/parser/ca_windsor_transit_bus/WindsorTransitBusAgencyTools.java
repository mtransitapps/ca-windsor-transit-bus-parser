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
		if ("NotinService".equals(gTrip.getTripHeadsign())) {
			return true; // EXCLUDE
		}
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

	@Override
	public String getRouteColor(GRoute gRoute) {
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
			case 25: return  "163A79";
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
		if (isGoodEnoughAccepted()) {
			return null;
		}
		System.out.printf("\nUnexpected route color %s!\n", gRoute);
		System.exit(-1);
		return null;
	}

	private static final String STOP_1000 = "1";
	private static final String STOP_1008 = "5";
	private static final String STOP_1009 = "48";
	private static final String STOP_1010 = "6";
	private static final String STOP_1011 = "47";
	private static final String STOP_1049 = "24";
	private static final String STOP_1050 = "25";
	private static final String STOP_1051 = "26";
	private static final String STOP_1052 = "59";
	private static final String STOP_1126 = "180";
	private static final String STOP_1132 = "104";
	private static final String STOP_1134 = "105";
	private static final String STOP_1173 = "124";
	private static final String STOP_1197 = "136";
	private static final String STOP_1206 = "291";
	private static final String STOP_1231 = "302";
	private static final String STOP_1248 = "310";
	private static final String STOP_1322 = "416";
	private static final String STOP_1375 = "210";
	private static final String STOP_1376 = "372";
	private static final String STOP_1396 = "518";
	private static final String STOP_1399 = "387";
	private static final String STOP_1428 = "503";
	private static final String STOP_1429 = "399";
	private static final String STOP_1462 = "486";
	private static final String STOP_1474 = "422";
	private static final String STOP_1504 = "462";
	private static final String STOP_1524 = "461";
	private static final String STOP_1529 = "520";
	private static final String STOP_1543 = "630";
	private static final String STOP_1544 = "526";
	private static final String STOP_1545 = "629";
	private static final String STOP_1546 = "527";
	private static final String STOP_1559 = "533";
	private static final String STOP_1560 = "623";
	private static final String STOP_1561 = "534";
	private static final String STOP_1562 = "622";
	private static final String STOP_1563 = "535";
	private static final String STOP_1564 = "621";
	private static final String STOP_1565 = "536";
	private static final String STOP_1566 = "620";
	private static final String STOP_1644 = "570";
	private static final String STOP_1656 = "576";
	private static final String STOP_1661 = "639";
	private static final String STOP_1662 = "636";
	private static final String STOP_1663 = "1027";
	private static final String STOP_1734 = "640";
	private static final String STOP_1737 = "681";
	private static final String STOP_1819 = "950";
	private static final String STOP_1877 = "858";
	private static final String STOP_1881 = "53";
	private static final String STOP_1884 = "985";
	private static final String STOP_1893 = "909";
	private static final String STOP_1894 = "723";
	private static final String STOP_1997 = "777";
	private static final String STOP_1998 = "1090";
	private static final String STOP_2034 = "1106";
	private static final String STOP_2038 = "1111";
	private static final String STOP_2039 = "1107";
	private static final String STOP_2041 = "1108";
	private static final String STOP_2046 = "1065";
	private static final String STOP_2047 = "1110";
	private static final String STOP_2048 = "1064";
	private static final String STOP_2049 = "1063";
	private static final String STOP_2051 = "519";
	private static final String STOP_2063 = "638";
	private static final String STOP_2064 = "637";
	private static final String STOP_2111 = "58";
	private static final String STOP_2116 = "894";
	private static final String STOP_2120 = "891";
	private static final String STOP_2135 = "886";
	private static final String STOP_2136 = "83";
	private static final String STOP_2140 = "1112";
	private static final String STOP_2185 = "1157";

	private static HashMap<Long, RouteTripSpec> ALL_ROUTE_TRIPS2;
	static {
		HashMap<Long, RouteTripSpec> map2 = new HashMap<Long, RouteTripSpec>();
		map2.put(1L + RID_ID_A, new RouteTripSpec(1L + RID_ID_A, // 1A
				MDirectionType.NORTH.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.NORTH.getId(), // Downtown Transit Terminal
				MDirectionType.SOUTH.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.SOUTH.getId()) // Devonshire Mall
				.addTripSort(MDirectionType.NORTH.intValue(), //
						Arrays.asList(new String[] { //
						STOP_1051, // Devonshire Mall at Moxies
								STOP_1000, // Windsor Transit Terminal
						})) //
				.addTripSort(MDirectionType.SOUTH.intValue(), //
						Arrays.asList(new String[] { //
						STOP_1000, // Windsor Transit Terminal
								STOP_1049, // == Howard at Roundhouse
								STOP_1050, // != Sydney at Windsor Commons
								STOP_1881, // != Marentette at Division
								STOP_2111, // != Marentette at Sydney
								STOP_1051, // Devonshire Mall at Moxies
						})) //
				.compileBothTripSort());
		map2.put(1L + RID_ID_C, new RouteTripSpec(1L + RID_ID_C, // 1C
				MDirectionType.EAST.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.EAST.getId(), // Forest Glade
				MDirectionType.WEST.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.WEST.getId()) // College Ave Community Ctr
				.addTripSort(MDirectionType.EAST.intValue(), //
						Arrays.asList(new String[] { //
						STOP_1052, // College Ave. at Community Centre
								STOP_2136, // University at Curry
								STOP_1173, // Tecumseh Mall Rear Entrance
								STOP_1197, // Forest Glade at Mulberry
						})) //
				.addTripSort(MDirectionType.WEST.intValue(), //
						Arrays.asList(new String[] { //
						STOP_1197, // Forest Glade at Mulberry
								STOP_1126, // Tecumseh at Factoria
								STOP_1052, // College Ave. at Community Centre
						})) //
				.compileBothTripSort());
		map2.put(2L, new RouteTripSpec(2L, //
				MDirectionType.EAST.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.EAST.getId(), // Tecumseh Mall
				MDirectionType.WEST.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.WEST.getId()) // College Ave Community Ctr
				.addTripSort(MDirectionType.EAST.intValue(), //
						Arrays.asList(new String[] { //
						STOP_1206, // College Ave. at Community Centre
								STOP_1231, // Wyandotte at Randolph
								STOP_1375, // Tecumseh Mall Rear Entrance
						})) //
				.addTripSort(MDirectionType.WEST.intValue(), //
						Arrays.asList(new String[] { //
						STOP_1375, // Tecumseh Mall Rear Entrance
								STOP_1206, // College Ave. at Community Centre
						})) //
				.compileBothTripSort());
		map2.put(3L, new RouteTripSpec(3L, //
				MDirectionType.EAST.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.EAST.getId(), // Transit Ctr
				MDirectionType.WEST.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.WEST.getId()) // College Ave Community Ctr
				.addTripSort(MDirectionType.EAST.intValue(), //
						Arrays.asList(new String[] { //
						STOP_1376, // College Ave. at Community Centre <= START
								STOP_1399, // Tecumseh at Northway
								STOP_1248, // !=
								STOP_2051, // != Transit Terminal at Chatham <= START
								STOP_1132, // ++ Tecumseh at Meldrum
								STOP_1134, // Tecumseh at Central
								STOP_1474, // ++ George at Tecumseh
								STOP_1524, // Transit Centre Front Entrance
						})) //
				.addTripSort(MDirectionType.WEST.intValue(), //
						Arrays.asList(new String[] { //
						STOP_1524, // Transit Centre Front Entrance
								STOP_1504, // ++ N. Service at Central
								STOP_1396, // Tecumseh at Felix
								STOP_1376, // College Ave. at Community Centre
						})) //
				.compileBothTripSort());
		map2.put(3L + RID_ID_W, new RouteTripSpec(3L + RID_ID_W, // 3W
				MDirectionType.EAST.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.EAST.getId(), // Downtown Transit Terminal
				MDirectionType.WEST.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.WEST.getId()) // College Ave Community Ctr
				.addTripSort(MDirectionType.EAST.intValue(), //
						Arrays.asList(new String[] { //
						STOP_1376, // College Ave. at Community Centre
								STOP_2051, // Transit Terminal at Chatham
						})) //
				.addTripSort(MDirectionType.WEST.intValue(), //
						Arrays.asList(new String[] { //
						STOP_2051, // Transit Terminal at Chatham
								STOP_1396, // Tecumseh at Felix
								STOP_1376, // College Ave. at Community Centre
						})) //
				.compileBothTripSort());
		map2.put(4L, new RouteTripSpec(4L, //
				MDirectionType.EAST.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.EAST.getId(), // Meadowbrook via Tecumseh Mall
				MDirectionType.WEST.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.WEST.getId()) // Downtown Transit Terminal
				.addTripSort(MDirectionType.EAST.intValue(), //
						Arrays.asList(new String[] { //
						STOP_1529, // Transit Windsor Terminal
								STOP_1008, // == Ouellette at Elliott
								STOP_1010, // != Ouellette at Erie
								STOP_1544, // != Giles at Parent
								STOP_1429, // != Erie at Ouellette
								STOP_2063, // != Giles at Parent
								STOP_1546, // == Ottawa at Parent
								STOP_1559, // == Ottawa at Walker
								STOP_1661, // != Walker at Ontario
								STOP_1322, // != Drouillard at Metcalfe
								STOP_1561, // != Seminole at Walker
								STOP_1563, // != Seminole at Albert
								STOP_1565, // == Seminole at Drouillard
								STOP_1644, // Lauzon Rd. at Hawthorne
								STOP_1656, // Essex Way at Meadowbrook
						})) //
				.addTripSort(MDirectionType.WEST.intValue(), //
						Arrays.asList(new String[] { //
						STOP_1656, // Essex Way at Meadowbrook
								STOP_1566, // == Seminole at Drouillard
								STOP_1564, // != Seminole at Albert
								STOP_1562, // != Seminole at Walker
								STOP_1462, // != Drouillard at Metcalfe
								STOP_1662, // != Walker at Ontario
								STOP_1560, // == Ottawa at Monmouth
								STOP_1545, // == Parent at Ottawa
								STOP_2064, // != Parent at Giles
								STOP_1428, // != Erie at Ouellette
								STOP_1543, // != Giles at Elsmere
								STOP_1011, // != Ouellette at Erie
								STOP_1009, // == Ouellette at Ouellette Manor
								STOP_1529, // "1529", // Transit Windsor Terminal
						})) //
				.compileBothTripSort());
		map2.put(5L, new RouteTripSpec(5L, //
				MDirectionType.NORTH.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.NORTH.getId(), // Downtown Transit Terminal
				MDirectionType.SOUTH.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.SOUTH.getId()) // St Clair College
				.addTripSort(MDirectionType.NORTH.intValue(), //
						Arrays.asList(new String[] { //
						STOP_1734, // St. Clair College Front Entrance
								STOP_1663, // Windsor Transit Terminal
						})) //
				.addTripSort(MDirectionType.SOUTH.intValue(), //
						Arrays.asList(new String[] { //
						STOP_1663, // Windsor Transit Terminal
								STOP_1734, // St. Clair College Front Entrance
						})) //
				.compileBothTripSort());
		map2.put(6L, new RouteTripSpec(6L, //
				MDirectionType.NORTH.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.NORTH.getId(), // Downtown Transit Terminal
				MDirectionType.SOUTH.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.SOUTH.getId()) // St Clair College
				.addTripSort(MDirectionType.NORTH.intValue(), //
						Arrays.asList(new String[] { //
						STOP_1734, // St. Clair College Front Entrance
								STOP_1737, // Transit Terminal at Chatham
						})) //
				.addTripSort(MDirectionType.SOUTH.intValue(), //
						Arrays.asList(new String[] { //
						STOP_1737, // Transit Terminal at Chatham
								STOP_1734, // St. Clair College Front Entrance
						})) //
				.compileBothTripSort());
		map2.put(7L, new RouteTripSpec(7L, //
				MDirectionType.EAST.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.EAST.getId(), // South Walker Rd
				MDirectionType.WEST.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.WEST.getId()) // College Ave Community Ctr
				.addTripSort(MDirectionType.EAST.intValue(), //
						Arrays.asList(new String[] { //
						STOP_1819, // College Ave. at Community Centre
								STOP_1884, // Provincial at Humane Society
								STOP_1893, // Legacy Park at Sears Home
						})) //
				.addTripSort(MDirectionType.WEST.intValue(), //
						Arrays.asList(new String[] { //
						STOP_1893, // Legacy Park at Sears Home
								STOP_1819, // College Ave. at Community Centre
						})) //
				.compileBothTripSort());
		map2.put(8L, new RouteTripSpec(8L, //
				MDirectionType.NORTH.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.NORTH.getId(), // Downtown Transit Terminal
				MDirectionType.SOUTH.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.SOUTH.getId()) // South Walker Rd
				.addTripSort(MDirectionType.NORTH.intValue(), //
						Arrays.asList(new String[] { //
						STOP_1997, // " Sixth Concession at North Talbot
								STOP_1894, // Transit Terminal Church at Pitt
						})) //
				.addTripSort(MDirectionType.SOUTH.intValue(), //
						Arrays.asList(new String[] { //
						STOP_1894, // Transit Terminal Church at Pitt
								STOP_1997, // Sixth Concession at North Talbot
						})) //
				.compileBothTripSort());
		map2.put(TUNNEL_BUS_RID, new RouteTripSpec(TUNNEL_BUS_RID, // 9 - Tunnel Bus
				MDirectionType.NORTH.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.NORTH.getId(), // Detroit
				MDirectionType.SOUTH.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.SOUTH.getId()) // Windsor Transit Terminal
				.addTripSort(MDirectionType.NORTH.intValue(), //
						Arrays.asList(new String[] { //
						STOP_2116, // Windsor Transit Terminal
								STOP_2135, // Rosa Parks Transit Center
						})) //
				.addTripSort(MDirectionType.SOUTH.intValue(), //
						Arrays.asList(new String[] { //
						STOP_2135, // Rosa Parks Transit Center
								STOP_2120, // McDougall at University Avenue
								STOP_2116, // Windsor Transit Terminal
						})) //
				.compileBothTripSort());
		map2.put(10L, new RouteTripSpec(10L, //
				MDirectionType.NORTH.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.NORTH.getId(), // North Loop
				MDirectionType.SOUTH.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.SOUTH.getId()) // South Loop
				.addTripSort(MDirectionType.NORTH.intValue(), //
						Arrays.asList(new String[] { //
						STOP_1375, // Tecumseh Mall Rear Entrance
								STOP_2049, // == McHugh at Darfield
								STOP_2048, // != WFCU Centre Main Entrance
								STOP_2047, // != McHugh at Mickey Renuad Way
								STOP_2046, // == McHugh at Cypress
								STOP_1998, // Tecumseh Mall Rear Entrance
						})) //
				.addTripSort(MDirectionType.SOUTH.intValue(), //
						Arrays.asList(new String[] { //
						STOP_1998, // Tecumseh Mall Rear Entrance
								STOP_2034, // == McHugh at Cypress
								STOP_2038, // != McHugh at Micky Renaud Way
								STOP_2039, // != WFCU Centre Main Entrance
								STOP_2041, // == McHugh at Darfield
								STOP_1375, // Tecumseh Mall Rear Entrance
						})) //
				.compileBothTripSort());
		map2.put(14L, new RouteTripSpec(14L, //
				MDirectionType.NORTH.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.NORTH.getId(), // Downtown Transit Terminal
				MDirectionType.SOUTH.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.SOUTH.getId()) // Devonshire Mall
				.addTripSort(MDirectionType.NORTH.intValue(), //
						Arrays.asList(new String[] { //
						STOP_1877, // Devonshire Mall at Moxies
								STOP_2051, // Transit Terminal at Chatham
						})) //
				.addTripSort(MDirectionType.SOUTH.intValue(), //
						Arrays.asList(new String[] { //
						STOP_2051, // Transit Terminal at Chatham
								STOP_1877, // Devonshire Mall at Moxies
						})) //
				.compileBothTripSort());
		map2.put(25L, new RouteTripSpec(25L, //
				MDirectionType.EAST.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.EAST.getId(), // St Clair College
				MDirectionType.WEST.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.WEST.getId()) // Morton @ Ojibway
				.addTripSort(MDirectionType.EAST.intValue(), //
						Arrays.asList(new String[] { //
						STOP_2185, // Morton at Ojibway
								STOP_2140, // St Clair Front Entrance
						})) //
				.addTripSort(MDirectionType.WEST.intValue(), //
						Arrays.asList(new String[] { //
						STOP_2140, // St Clair Front Entrance
								STOP_2185, // Morton at Ojibway
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
		if (isGoodEnoughAccepted()) {
			mTrip.setHeadsignString(cleanTripHeadsign(gTrip.getTripHeadsign()), gTrip.getDirectionId() == null ? 0 : gTrip.getDirectionId());
			return;
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
