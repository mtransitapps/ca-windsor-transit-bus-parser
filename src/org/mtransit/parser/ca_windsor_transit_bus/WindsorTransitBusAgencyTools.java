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
// https://opendata.citywindsor.ca/Uploads/google_transit.zip
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

	private static HashMap<Long, RouteTripSpec> ALL_ROUTE_TRIPS2;
	static {
		HashMap<Long, RouteTripSpec> map2 = new HashMap<Long, RouteTripSpec>();
		map2.put(1L + RID_ID_A, new RouteTripSpec(1L + RID_ID_A, // 1A
				MDirectionType.NORTH.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.NORTH.getId(), // Downtown Transit Terminal
				MDirectionType.SOUTH.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.SOUTH.getId()) // Devonshire Mall
				.addTripSort(MDirectionType.NORTH.intValue(), //
						Arrays.asList(new String[] { //
						Stops.ALL_STOPS.get("1051"), // Devonshire Mall at Moxies
								Stops.ALL_STOPS.get("1000"), // Windsor Transit Terminal
						})) //
				.addTripSort(MDirectionType.SOUTH.intValue(), //
						Arrays.asList(new String[] { //
						Stops.ALL_STOPS.get("1000"), // Windsor Transit Terminal
								Stops.ALL_STOPS.get("1049"), // == Howard at Roundhouse
								Stops.ALL_STOPS.get("1050"), // != Sydney at Windsor Commons
								Stops.ALL_STOPS.get("1881"), // != Marentette at Division
								Stops.ALL_STOPS.get("2111"), // != Marentette at Sydney
								Stops.ALL_STOPS.get("1051"), // Devonshire Mall at Moxies
						})) //
				.compileBothTripSort());
		map2.put(1L + RID_ID_C, new RouteTripSpec(1L + RID_ID_C, // 1C
				MDirectionType.EAST.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.EAST.getId(), // Forest Glade
				MDirectionType.WEST.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.WEST.getId()) // College Ave Community Ctr
				.addTripSort(MDirectionType.EAST.intValue(), //
						Arrays.asList(new String[] { //
						Stops.ALL_STOPS.get("1052"), // College Ave. at Community Centre
								Stops.ALL_STOPS.get("2136"), // University at Curry
								Stops.ALL_STOPS.get("1173"), // Tecumseh Mall Rear Entrance
								Stops.ALL_STOPS.get("1197"), // Forest Glade at Mulberry
						})) //
				.addTripSort(MDirectionType.WEST.intValue(), //
						Arrays.asList(new String[] { //
						Stops.ALL_STOPS.get("1197"), // Forest Glade at Mulberry
								Stops.ALL_STOPS.get("1126"), // Tecumseh at Factoria
								Stops.ALL_STOPS.get("1052"), // College Ave. at Community Centre
						})) //
				.compileBothTripSort());
		map2.put(2L, new RouteTripSpec(2L, //
				MDirectionType.EAST.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.EAST.getId(), // Tecumseh Mall
				MDirectionType.WEST.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.WEST.getId()) // College Ave Community Ctr
				.addTripSort(MDirectionType.EAST.intValue(), //
						Arrays.asList(new String[] { //
						Stops.ALL_STOPS.get("1206"), // College Ave. at Community Centre
								Stops.ALL_STOPS.get("1231"), // Wyandotte at Randolph
								Stops.ALL_STOPS.get("1375"), // Tecumseh Mall Rear Entrance
						})) //
				.addTripSort(MDirectionType.WEST.intValue(), //
						Arrays.asList(new String[] { //
						Stops.ALL_STOPS.get("1375"), // Tecumseh Mall Rear Entrance
								Stops.ALL_STOPS.get("1206"), // College Ave. at Community Centre
						})) //
				.compileBothTripSort());
		map2.put(3L, new RouteTripSpec(3L, //
				MDirectionType.EAST.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.EAST.getId(), // Transit Ctr
				MDirectionType.WEST.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.WEST.getId()) // College Ave Community Ctr
				.addTripSort(MDirectionType.EAST.intValue(), //
						Arrays.asList(new String[] { //
						Stops.ALL_STOPS.get("1376"), // College Ave. at Community Centre <= START
								Stops.ALL_STOPS.get("1399"), // Tecumseh at Northway
								Stops.ALL_STOPS.get("1248"), // !=
								Stops.ALL_STOPS.get("2051"), // != Transit Terminal at Chatham <= START
								Stops.ALL_STOPS.get("1132"), // ++ Tecumseh at Meldrum
								Stops.ALL_STOPS.get("1134"), // Tecumseh at Central
								Stops.ALL_STOPS.get("1474"), // ++ George at Tecumseh
								Stops.ALL_STOPS.get("1524"), // Transit Centre Front Entrance
						})) //
				.addTripSort(MDirectionType.WEST.intValue(), //
						Arrays.asList(new String[] { //
						Stops.ALL_STOPS.get("1524"), // Transit Centre Front Entrance
								Stops.ALL_STOPS.get("1504"), // ++ N. Service at Central
								Stops.ALL_STOPS.get("1396"), // Tecumseh at Felix
								Stops.ALL_STOPS.get("1376"), // College Ave. at Community Centre
						})) //
				.compileBothTripSort());
		map2.put(3L + RID_ID_W, new RouteTripSpec(3L + RID_ID_W, // 3W
				MDirectionType.EAST.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.EAST.getId(), // Downtown Transit Terminal
				MDirectionType.WEST.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.WEST.getId()) // College Ave Community Ctr
				.addTripSort(MDirectionType.EAST.intValue(), //
						Arrays.asList(new String[] { //
						Stops.ALL_STOPS.get("1376"), // College Ave. at Community Centre
								Stops.ALL_STOPS.get("2051"), // Transit Terminal at Chatham
						})) //
				.addTripSort(MDirectionType.WEST.intValue(), //
						Arrays.asList(new String[] { //
						Stops.ALL_STOPS.get("2051"), // Transit Terminal at Chatham
								Stops.ALL_STOPS.get("1396"), // Tecumseh at Felix
								Stops.ALL_STOPS.get("1376"), // College Ave. at Community Centre
						})) //
				.compileBothTripSort());
		map2.put(4L, new RouteTripSpec(4L, //
				MDirectionType.EAST.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.EAST.getId(), // Meadowbrook via Tecumseh Mall
				MDirectionType.WEST.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.WEST.getId()) // Downtown Transit Terminal
				.addTripSort(MDirectionType.EAST.intValue(), //
						Arrays.asList(new String[] { //
						Stops.ALL_STOPS.get("1529"), // Transit Windsor Terminal
								Stops.ALL_STOPS.get("1008"), // == Ouellette at Elliott
								Stops.ALL_STOPS.get("1010"), // != Ouellette at Erie
								Stops.ALL_STOPS.get("1544"), // != Giles at Parent
								Stops.ALL_STOPS.get("1429"), // != Erie at Ouellette
								Stops.ALL_STOPS.get("2063"), // != Giles at Parent
								Stops.ALL_STOPS.get("1546"), // == Ottawa at Parent
								Stops.ALL_STOPS.get("1559"), // == Ottawa at Walker
								Stops.ALL_STOPS.get("1661"), // != Walker at Ontario
								Stops.ALL_STOPS.get("1322"), // != Drouillard at Metcalfe
								Stops.ALL_STOPS.get("1561"), // != Seminole at Walker
								Stops.ALL_STOPS.get("1563"), // != Seminole at Albert
								Stops.ALL_STOPS.get("1565"), // == Seminole at Drouillard
								Stops.ALL_STOPS.get("1644"), // Lauzon Rd. at Hawthorne
								Stops.ALL_STOPS.get("1656"), // Essex Way at Meadowbrook
						})) //
				.addTripSort(MDirectionType.WEST.intValue(), //
						Arrays.asList(new String[] { //
						Stops.ALL_STOPS.get("1656"), // Essex Way at Meadowbrook
								Stops.ALL_STOPS.get("1566"), // == Seminole at Drouillard
								Stops.ALL_STOPS.get("1564"), // != Seminole at Albert
								Stops.ALL_STOPS.get("1562"), // != Seminole at Walker
								Stops.ALL_STOPS.get("1462"), // != Drouillard at Metcalfe
								Stops.ALL_STOPS.get("2063"), // != Giles at Parent
								Stops.ALL_STOPS.get("1560"), // == Ottawa at Monmouth
								Stops.ALL_STOPS.get("1545"), // == Parent at Ottawa
								Stops.ALL_STOPS.get("2064"), // != Parent at Giles
								Stops.ALL_STOPS.get("1428"), // != Erie at Ouellette
								Stops.ALL_STOPS.get("1543"), // != Giles at Elsmere
								Stops.ALL_STOPS.get("1011"), // != Ouellette at Erie
								Stops.ALL_STOPS.get("1009"), // == Ouellette at Ouellette Manor
								Stops.ALL_STOPS.get("1529"), // Transit Windsor Terminal
						})) //
				.compileBothTripSort());
		map2.put(5L, new RouteTripSpec(5L, //
				MDirectionType.NORTH.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.NORTH.getId(), // Downtown Transit Terminal
				MDirectionType.SOUTH.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.SOUTH.getId()) // St Clair College
				.addTripSort(MDirectionType.NORTH.intValue(), //
						Arrays.asList(new String[] { //
						Stops.ALL_STOPS.get("1734"), // St. Clair College Front Entrance
								Stops.ALL_STOPS.get("1663"), // Windsor Transit Terminal
						})) //
				.addTripSort(MDirectionType.SOUTH.intValue(), //
						Arrays.asList(new String[] { //
						Stops.ALL_STOPS.get("1663"), // Windsor Transit Terminal
								Stops.ALL_STOPS.get("1734"), // St. Clair College Front Entrance
						})) //
				.compileBothTripSort());
		map2.put(6L, new RouteTripSpec(6L, //
				MDirectionType.NORTH.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.NORTH.getId(), // Downtown Transit Terminal
				MDirectionType.SOUTH.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.SOUTH.getId()) // St Clair College
				.addTripSort(MDirectionType.NORTH.intValue(), //
						Arrays.asList(new String[] { //
						Stops.ALL_STOPS.get("1734"), // == St. Clair College Front Entrance
								Stops.ALL_STOPS.get("1736"), // != Geraedts at St. Clair Residence
								Stops.ALL_STOPS.get("1870"), // != Cabana at McGraw
								Stops.ALL_STOPS.get("1817"), // != Cousineau at Cousineau Circle
								Stops.ALL_STOPS.get("1788"), // != Cabana at Dougall
								Stops.ALL_STOPS.get("1786"), // == Dougall at Granada
								Stops.ALL_STOPS.get("1737"), // Transit Terminal at Chatham
						})) //
				.addTripSort(MDirectionType.SOUTH.intValue(), //
						Arrays.asList(new String[] { //
						Stops.ALL_STOPS.get("1737"), // Transit Terminal at Chatham
								Stops.ALL_STOPS.get("1787"), // == Dougall at Granada
								Stops.ALL_STOPS.get("1789"), // != Cabana at Dougall
								Stops.ALL_STOPS.get("1732"), // !-= Cousineau at Highway 3
								Stops.ALL_STOPS.get("1869"), // != Cabana at McGraw
								Stops.ALL_STOPS.get("1867"), // !-= Cabana at Dominion
								Stops.ALL_STOPS.get("1734"), // St. Clair College Front Entrance
						})) //
				.compileBothTripSort());
		map2.put(7L, new RouteTripSpec(7L, //
				MDirectionType.EAST.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.EAST.getId(), // South Walker Rd
				MDirectionType.WEST.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.WEST.getId()) // College Ave Community Ctr
				.addTripSort(MDirectionType.EAST.intValue(), //
						Arrays.asList(new String[] { //
						Stops.ALL_STOPS.get("1819"), // College Ave. at Community Centre
								Stops.ALL_STOPS.get("1884"), // Provincial at Humane Society
								Stops.ALL_STOPS.get("1893"), // Legacy Park at Sears Home
						})) //
				.addTripSort(MDirectionType.WEST.intValue(), //
						Arrays.asList(new String[] { //
						Stops.ALL_STOPS.get("1893"), // Legacy Park at Sears Home
								Stops.ALL_STOPS.get("1819"), // College Ave. at Community Centre
						})) //
				.compileBothTripSort());
		map2.put(8L, new RouteTripSpec(8L, //
				MDirectionType.NORTH.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.NORTH.getId(), // Downtown Transit Terminal
				MDirectionType.SOUTH.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.SOUTH.getId()) // South Walker Rd
				.addTripSort(MDirectionType.NORTH.intValue(), //
						Arrays.asList(new String[] { //
						Stops.ALL_STOPS.get("1997"), // Sixth Concession at North Talbot
								Stops.ALL_STOPS.get("1894"), // Transit Terminal Church at Pitt
						})) //
				.addTripSort(MDirectionType.SOUTH.intValue(), //
						Arrays.asList(new String[] { //
						Stops.ALL_STOPS.get("1894"), // Transit Terminal Church at Pitt
								Stops.ALL_STOPS.get("1997"), // Sixth Concession at North Talbot
						})) //
				.compileBothTripSort());
		map2.put(TUNNEL_BUS_RID, new RouteTripSpec(TUNNEL_BUS_RID, // 9 - Tunnel Bus
				MDirectionType.NORTH.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.NORTH.getId(), // Detroit
				MDirectionType.SOUTH.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.SOUTH.getId()) // Windsor Transit Terminal
				.addTripSort(MDirectionType.NORTH.intValue(), //
						Arrays.asList(new String[] { //
						Stops.ALL_STOPS.get("2116"), // Windsor Transit Terminal
								Stops.ALL_STOPS.get("2135"), // Rosa Parks Transit Center
						})) //
				.addTripSort(MDirectionType.SOUTH.intValue(), //
						Arrays.asList(new String[] { //
						Stops.ALL_STOPS.get("2135"), // Rosa Parks Transit Center
								Stops.ALL_STOPS.get("2120"), // McDougall at University Avenue
								Stops.ALL_STOPS.get("2116"), // Windsor Transit Terminal
						})) //
				.compileBothTripSort());
		map2.put(10L, new RouteTripSpec(10L, //
				MDirectionType.NORTH.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.NORTH.getId(), // North Loop
				MDirectionType.SOUTH.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.SOUTH.getId()) // South Loop
				.addTripSort(MDirectionType.NORTH.intValue(), //
						Arrays.asList(new String[] { //
						Stops.ALL_STOPS.get("1375"), // Tecumseh Mall Rear Entrance
								Stops.ALL_STOPS.get("2049"), // == McHugh at Darfield
								Stops.ALL_STOPS.get("2048"), // != WFCU Centre Main Entrance
								Stops.ALL_STOPS.get("2047"), // != McHugh at Mickey Renuad Way
								Stops.ALL_STOPS.get("2046"), // == McHugh at Cypress
								Stops.ALL_STOPS.get("1998"), // Tecumseh Mall Rear Entrance
						})) //
				.addTripSort(MDirectionType.SOUTH.intValue(), //
						Arrays.asList(new String[] { //
						Stops.ALL_STOPS.get("1998"), // Tecumseh Mall Rear Entrance
								Stops.ALL_STOPS.get("2034"), // == McHugh at Cypress
								Stops.ALL_STOPS.get("2038"), // != McHugh at Micky Renaud Way
								Stops.ALL_STOPS.get("2039"), // != WFCU Centre Main Entrance
								Stops.ALL_STOPS.get("2041"), // == McHugh at Darfield
								Stops.ALL_STOPS.get("1375"), // Tecumseh Mall Rear Entrance
						})) //
				.compileBothTripSort());
		map2.put(14L, new RouteTripSpec(14L, //
				MDirectionType.NORTH.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.NORTH.getId(), // Downtown Transit Terminal
				MDirectionType.SOUTH.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.SOUTH.getId()) // Devonshire Mall
				.addTripSort(MDirectionType.NORTH.intValue(), //
						Arrays.asList(new String[] { //
						Stops.ALL_STOPS.get("1877"), // Devonshire Mall at Moxies
								Stops.ALL_STOPS.get("2051"), // Transit Terminal at Chatham
						})) //
				.addTripSort(MDirectionType.SOUTH.intValue(), //
						Arrays.asList(new String[] { //
						Stops.ALL_STOPS.get("2051"), // Transit Terminal at Chatham
								Stops.ALL_STOPS.get("1877"), // Devonshire Mall at Moxies
						})) //
				.compileBothTripSort());
		map2.put(25L, new RouteTripSpec(25L, //
				MDirectionType.EAST.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.EAST.getId(), // St Clair College
				MDirectionType.WEST.intValue(), MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.WEST.getId()) // Morton @ Ojibway
				.addTripSort(MDirectionType.EAST.intValue(), //
						Arrays.asList(new String[] { //
						Stops.ALL_STOPS.get("2185"), // Morton at Ojibway
								Stops.ALL_STOPS.get("2140"), // St Clair Front Entrance
						})) //
				.addTripSort(MDirectionType.WEST.intValue(), //
						Arrays.asList(new String[] { //
						Stops.ALL_STOPS.get("2140"), // St Clair Front Entrance
								Stops.ALL_STOPS.get("2185"), // Morton at Ojibway
						})) //
				.compileBothTripSort());
		ALL_ROUTE_TRIPS2 = map2;
	}

	@Override
	public int compareEarly(long routeId, List<MTripStop> list1, List<MTripStop> list2, MTripStop ts1, MTripStop ts2, GStop ts1GStop, GStop ts2GStop) {
		if (ALL_ROUTE_TRIPS2.containsKey(routeId)) {
			return ALL_ROUTE_TRIPS2.get(routeId).compare(routeId, list1, list2, ts1, ts2, ts1GStop, ts2GStop, this);
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
			return SplitUtils.splitTripStop(mRoute, gTrip, gTripStop, routeGTFS, ALL_ROUTE_TRIPS2.get(mRoute.getId()), this);
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
		if ("Sto125649".equals(gStop.getStopCode())) {
			return 125649;
		}
		return Integer.parseInt(gStop.getStopCode()); // use stop code as stop ID
	}

	@Override
	public String getStopCode(GStop gStop) {
		if ("Sto125649".equals(gStop.getStopCode())) {
			return "125649";
		}
		return super.getStopCode(gStop);
	}
}
