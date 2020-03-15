package org.mtransit.parser.ca_windsor_transit_bus;

import org.jetbrains.annotations.NotNull;
import org.mtransit.commons.StrategicMappingCommons;
import org.mtransit.parser.CleanUtils;
import org.mtransit.parser.DefaultAgencyTools;
import org.mtransit.parser.MTLog;
import org.mtransit.parser.Pair;
import org.mtransit.parser.SplitUtils;
import org.mtransit.parser.SplitUtils.RouteTripSpec;
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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
		MTLog.log("Generating Windsor Transit bus data...");
		long start = System.currentTimeMillis();
		this.serviceIds = extractUsefulServiceIds(args, this, true);
		super.start(args);
		MTLog.log("Generating Windsor Transit bus data... DONE in %s.", Utils.getPrettyDuration(System.currentTimeMillis() - start));
	}

	@Override
	public boolean excludingAll() {
		return this.serviceIds != null && this.serviceIds.isEmpty();
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

	private static final long RID_ID_A = 10_000L;
	private static final long RID_ID_C = 30_000L;
	private static final long RID_ID_W = 230_000L;

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
		MTLog.logFatal("Unexpected route ID for %s!", gRoute);
		return -1L;
	}

	@Override
	public String getRouteShortName(GRoute gRoute) {
		return super.getRouteShortName(gRoute); // used by Real-Time API
	}

	@Override
	public String getRouteLongName(GRoute gRoute) {
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
		if (isGoodEnoughAccepted()) {
			return null;
		}
		MTLog.logFatal("Unexpected route color %s!", gRoute);
		return null;
	}

	private static HashMap<Long, RouteTripSpec> ALL_ROUTE_TRIPS2;

	static {
		HashMap<Long, RouteTripSpec> map2 = new HashMap<>();
		map2.put(1L + RID_ID_A, new RouteTripSpec(1L + RID_ID_A, // 1A
				StrategicMappingCommons.NORTH, MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.NORTH.getId(), // Downtown Transit Terminal
				StrategicMappingCommons.SOUTH, MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.SOUTH.getId()) // Devonshire Mall
				.addTripSort(StrategicMappingCommons.NORTH, //
						Arrays.asList(//
								Stops.getALL_STOPS().get("1051"), // Devonshire Mall at Moxies
								Stops.getALL_STOPS().get("1000") // Windsor Transit Terminal
						)) //
				.addTripSort(StrategicMappingCommons.SOUTH, //
						Arrays.asList(//
								Stops.getALL_STOPS().get("1000"), // Windsor Transit Terminal
								Stops.getALL_STOPS().get("1049"), // == Howard at Roundhouse
								Stops.getALL_STOPS().get("1050"), // != Sydney at Windsor Commons
								Stops.getALL_STOPS().get("1881"), // != Marentette at Division
								Stops.getALL_STOPS().get("2111"), // != Marentette at Sydney
								Stops.getALL_STOPS().get("1051") // Devonshire Mall at Moxies
						)) //
				.compileBothTripSort());
		map2.put(1L + RID_ID_C, new RouteTripSpec(1L + RID_ID_C, // 1C
				StrategicMappingCommons.EAST, MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.EAST.getId(), // Forest Glade
				StrategicMappingCommons.WEST, MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.WEST.getId()) // College Ave Community Ctr / Tayfour Campus
				.addTripSort(StrategicMappingCommons.EAST, //
						Arrays.asList(//
								Stops.getALL_STOPS().get("1834"), // Tayfour Campus Terminal <=
								Stops.getALL_STOPS().get("1052"), // College Ave. at Community Centre <=
								Stops.getALL_STOPS().get("2136"), // University at Curry
								Stops.getALL_STOPS().get("1173"), // Tecumseh Mall Rear Entrance
								Stops.getALL_STOPS().get("1197") // Forest Glade at Mulberry
						)) //
				.addTripSort(StrategicMappingCommons.WEST, //
						Arrays.asList(//
								Stops.getALL_STOPS().get("1197"), // Forest Glade at Mulberry
								Stops.getALL_STOPS().get("1126"), // Tecumseh at Factoria
								Stops.getALL_STOPS().get("1052"), // College Ave. at Community Centre =>
								Stops.getALL_STOPS().get("1834") // Tayfour Campus Terminal =>
						)) //
				.compileBothTripSort());
		map2.put(2L, new RouteTripSpec(2L, //
				StrategicMappingCommons.EAST, MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.EAST.getId(), // Tecumseh Mall
				StrategicMappingCommons.WEST, MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.WEST.getId()) // Tecumseh Mall
				.addTripSort(StrategicMappingCommons.EAST, //
						Arrays.asList(//
								Stops.getALL_STOPS().get("1878"), // != Hotel Dieu Grace Healthcare <=
								Stops.getALL_STOPS().get("2062"), // == Prince at Wells
								Stops.getALL_STOPS().get("2090"), // != Prince at College
								Stops.getALL_STOPS().get("1072"), // != Mill at Sandwich
								Stops.getALL_STOPS().get("2072"), // !=  College at Prince
								Stops.getALL_STOPS().get("1073"), // != Mill at Sandwich
								Stops.getALL_STOPS().get("1222"), // == Wyandotte at Mill
								Stops.getALL_STOPS().get("1834"), // != Hotel Dieu Grace Healthcare <=
								Stops.getALL_STOPS().get("2036"), // == Prince at Tecumseh
								Stops.getALL_STOPS().get("1231"), // Wyandotte at Randolph
								Stops.getALL_STOPS().get("1375") // Tecumseh Mall Rear Entrance
						)) //
				.addTripSort(StrategicMappingCommons.WEST, //
						Arrays.asList(//
								Stops.getALL_STOPS().get("1375"), // Tecumseh Mall Rear Entrance
								Stops.getALL_STOPS().get("1220"), // == Mill at Peter
								Stops.getALL_STOPS().get("1070"), // != Mill at Wyandotte
								Stops.getALL_STOPS().get("1054"), // != College at Prince
								Stops.getALL_STOPS().get("1218"), // != Sandwich at Brock
								Stops.getALL_STOPS().get("2091"), // != Prince at College
								Stops.getALL_STOPS().get("2107"), // == Prince at Wells
								Stops.getALL_STOPS().get("2121"), // == Prince at Matchette
								Stops.getALL_STOPS().get("1834"), // != Hotel Dieu Grace Healthcare =>
								Stops.getALL_STOPS().get("1878") // != Hotel Dieu Grace Healthcare =>
						)) //
				.compileBothTripSort());
		map2.put(3L, new RouteTripSpec(3L, //
				StrategicMappingCommons.EAST, MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.EAST.getId(), // Transit Ctr
				StrategicMappingCommons.WEST, MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.WEST.getId()) // College Ave Community Ctr
				.addTripSort(StrategicMappingCommons.EAST, //
						Arrays.asList(//
								Stops.getALL_STOPS().get("1834"), // Tayfour Campus Terminal <=
								Stops.getALL_STOPS().get("1399"), // ++ Tecumseh at Northway
								Stops.getALL_STOPS().get("1248"), // != Wyandotte at Victoria
								Stops.getALL_STOPS().get("2051"), // != Transit Terminal at Chatham <= START
								Stops.getALL_STOPS().get("1004"), // != Ouellette at Park
								Stops.getALL_STOPS().get("1006"), // == Ouellette at Wyandotte
								Stops.getALL_STOPS().get("1132"), // ++ Tecumseh at Meldrum
								Stops.getALL_STOPS().get("1134"), // ++ Tecumseh at Central
								Stops.getALL_STOPS().get("1474"), // ++ George at Tecumseh
								Stops.getALL_STOPS().get("1506"), // === Plymouth at Grand Marais
								Stops.getALL_STOPS().get("1507"), // !== Central at Temple
								Stops.getALL_STOPS().get("1522"), // == North Service Road at Pillette
								Stops.getALL_STOPS().get("1332"), // xx Service Road at Electrical Union #WTF
								Stops.getALL_STOPS().get("1530"), // != North Service Road at Purolator
								Stops.getALL_STOPS().get("1332"), // !== xx Service Road at Electrical Union
								Stops.getALL_STOPS().get("1524") // === Transit Centre Front Entrance
						)) //
				.addTripSort(StrategicMappingCommons.WEST, //
						Arrays.asList(//
								Stops.getALL_STOPS().get("1524"), // Transit Centre Front Entrance
								Stops.getALL_STOPS().get("1504"), // ++ N. Service at Central
								Stops.getALL_STOPS().get("1396"), // Tecumseh at Felix
								Stops.getALL_STOPS().get("1834") // Tayfour Campus Terminal =>
						)) //
				.compileBothTripSort());
		map2.put(3L + RID_ID_W, new RouteTripSpec(3L + RID_ID_W, // 3W
				StrategicMappingCommons.EAST, MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.EAST.getId(), // Downtown Transit Terminal
				StrategicMappingCommons.WEST, MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.WEST.getId()) // College Ave Community Ctr / Tayfour Campus
				.addTripSort(StrategicMappingCommons.EAST, //
						Arrays.asList(//
								Stops.getALL_STOPS().get("1834"), // Tayfour Campus Terminal <=
								Stops.getALL_STOPS().get("1376"), // College Ave. at Community Centre <=
								Stops.getALL_STOPS().get("2051") // Transit Terminal at Chatham
						)) //
				.addTripSort(StrategicMappingCommons.WEST, //
						Arrays.asList(//
								Stops.getALL_STOPS().get("2051"), // Transit Terminal at Chatham
								Stops.getALL_STOPS().get("1396"), // Tecumseh at Felix
								Stops.getALL_STOPS().get("1376"), // College Ave. at Community Centre =>
								Stops.getALL_STOPS().get("1834") // Tayfour Campus Terminal =>
						)) //
				.compileBothTripSort());
		map2.put(4L, new RouteTripSpec(4L, //
				StrategicMappingCommons.EAST, MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.EAST.getId(), // Meadowbrook via Tecumseh Mall
				StrategicMappingCommons.WEST, MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.WEST.getId()) // Downtown Transit Terminal
				.addTripSort(StrategicMappingCommons.EAST, //
						Arrays.asList(//
								Stops.getALL_STOPS().get("1529"), // Transit Windsor Terminal
								Stops.getALL_STOPS().get("1008"), // == Ouellette at Elliott
								Stops.getALL_STOPS().get("1010"), // != Ouellette at Erie
								Stops.getALL_STOPS().get("1544"), // != Giles at Parent
								Stops.getALL_STOPS().get("1429"), // != Erie at Ouellette
								Stops.getALL_STOPS().get("2063"), // != Giles at Parent
								Stops.getALL_STOPS().get("1546"), // == Ottawa at Parent
								Stops.getALL_STOPS().get("1559"), // == Ottawa at Walker
								Stops.getALL_STOPS().get("1661"), // != Walker at Ontario
								Stops.getALL_STOPS().get("1322"), // != Drouillard at Metcalfe
								Stops.getALL_STOPS().get("1561"), // != Seminole at Walker
								Stops.getALL_STOPS().get("1563"), // != Seminole at Albert
								Stops.getALL_STOPS().get("1565"), // == Seminole at Drouillard
								Stops.getALL_STOPS().get("1644"), // Lauzon Rd. at Hawthorne
								Stops.getALL_STOPS().get("1656") // Essex Way at Meadowbrook
						)) //
				.addTripSort(StrategicMappingCommons.WEST, //
						Arrays.asList(//
								Stops.getALL_STOPS().get("1656"), // Essex Way at Meadowbrook
								Stops.getALL_STOPS().get("1566"), // == Seminole at Drouillard
								Stops.getALL_STOPS().get("1564"), // != Seminole at Albert
								Stops.getALL_STOPS().get("1562"), // != Seminole at Walker
								Stops.getALL_STOPS().get("1462"), // != Drouillard at Metcalfe
								Stops.getALL_STOPS().get("2063"), // != Giles at Parent
								Stops.getALL_STOPS().get("1560"), // == Ottawa at Monmouth
								Stops.getALL_STOPS().get("1545"), // == Parent at Ottawa
								Stops.getALL_STOPS().get("2064"), // != Parent at Giles
								Stops.getALL_STOPS().get("1428"), // != Erie at Ouellette
								Stops.getALL_STOPS().get("1543"), // != Giles at Elsmere
								Stops.getALL_STOPS().get("1011"), // != Ouellette at Erie
								Stops.getALL_STOPS().get("1009"), // == Ouellette at Ouellette Manor
								Stops.getALL_STOPS().get("1529") // Transit Windsor Terminal
						)) //
				.compileBothTripSort());
		map2.put(5L, new RouteTripSpec(5L, //
				StrategicMappingCommons.NORTH, MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.NORTH.getId(), // Downtown Transit Terminal
				StrategicMappingCommons.SOUTH, MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.SOUTH.getId()) // St Clair College
				.addTripSort(StrategicMappingCommons.NORTH, //
						Arrays.asList(//
								Stops.getALL_STOPS().get("1734"), // St. Clair College Front Entrance
								Stops.getALL_STOPS().get("1663") // Windsor Transit Terminal
						)) //
				.addTripSort(StrategicMappingCommons.SOUTH, //
						Arrays.asList(//
								Stops.getALL_STOPS().get("1663"), // Windsor Transit Terminal
								Stops.getALL_STOPS().get("1734") // St. Clair College Front Entrance
						)) //
				.compileBothTripSort());
		map2.put(6L, new RouteTripSpec(6L, //
				StrategicMappingCommons.NORTH, MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.NORTH.getId(), // Downtown Transit Terminal
				StrategicMappingCommons.SOUTH, MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.SOUTH.getId()) // St Clair College
				.addTripSort(StrategicMappingCommons.NORTH, //
						Arrays.asList(//
								Stops.getALL_STOPS().get("1734"), // == St. Clair College Front Entrance
								Stops.getALL_STOPS().get("1736"), // != Geraedts at St. Clair Residence
								Stops.getALL_STOPS().get("1870"), // != Cabana at McGraw
								Stops.getALL_STOPS().get("1817"), // != Cousineau at Cousineau Circle
								Stops.getALL_STOPS().get("1788"), // != Cabana at Dougall
								Stops.getALL_STOPS().get("1786"), // == Dougall at Granada
								Stops.getALL_STOPS().get("1737") // Transit Terminal at Chatham
						)) //
				.addTripSort(StrategicMappingCommons.SOUTH, //
						Arrays.asList(//
								Stops.getALL_STOPS().get("1737"), // Transit Terminal at Chatham
								Stops.getALL_STOPS().get("1787"), // == Dougall at Granada
								Stops.getALL_STOPS().get("1789"), "715", // != Cabana at Dougall
								Stops.getALL_STOPS().get("1732"), // !-= Cousineau at Highway 3
								Stops.getALL_STOPS().get("1869"), // != Cabana at McGraw
								Stops.getALL_STOPS().get("1867"), // !-= Cabana at Dominion
								Stops.getALL_STOPS().get("1734") // St. Clair College Front Entrance
						)) //
				.compileBothTripSort());
		map2.put(7L, new RouteTripSpec(7L, //
				StrategicMappingCommons.EAST, MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.EAST.getId(), // South Walker Rd
				StrategicMappingCommons.WEST, MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.WEST.getId()) // Tayfour Campus / College Ave Community Ctr
				.addTripSort(StrategicMappingCommons.EAST, //
						Arrays.asList(//
								Stops.getALL_STOPS().get("1878"), // Tayfour Campus Terminal <=
								Stops.getALL_STOPS().get("1819"), // College Ave. at Community Centre <=
								Stops.getALL_STOPS().get("1884"), // Provincial at Humane Society
								Stops.getALL_STOPS().get("1893") // Legacy Park at Sears Home
						)) //
				.addTripSort(StrategicMappingCommons.WEST, //
						Arrays.asList(//
								Stops.getALL_STOPS().get("1893"), // Legacy Park at Sears Home
								Stops.getALL_STOPS().get("1051"), // Devonshire Mall at Moxies
								Stops.getALL_STOPS().get("1819"), // College Ave. at Community Centre =>
								Stops.getALL_STOPS().get("1878") // Tayfour Campus Terminal =>
						)) //
				.compileBothTripSort());
		map2.put(8L, new RouteTripSpec(8L, //
				StrategicMappingCommons.NORTH, MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.NORTH.getId(), // Downtown Transit Terminal
				StrategicMappingCommons.SOUTH, MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.SOUTH.getId()) // South Walker Rd
				.addTripSort(StrategicMappingCommons.NORTH, //
						Arrays.asList(//
								Stops.getALL_STOPS().get("1997"), // Sixth Concession at North Talbot
								Stops.getALL_STOPS().get("1894") // Transit Terminal Church at Pitt
						)) //
				.addTripSort(StrategicMappingCommons.SOUTH, //
						Arrays.asList(//
								Stops.getALL_STOPS().get("1894"), // Transit Terminal Church at Pitt
								Stops.getALL_STOPS().get("1997") // Sixth Concession at North Talbot
						)) //
				.compileBothTripSort());
		map2.put(TUNNEL_BUS_RID, new RouteTripSpec(TUNNEL_BUS_RID, // 9 - Tunnel Bus
				StrategicMappingCommons.NORTH, MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.NORTH.getId(), // Detroit
				StrategicMappingCommons.SOUTH, MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.SOUTH.getId()) // Windsor Transit Terminal
				.addTripSort(StrategicMappingCommons.NORTH, //
						Arrays.asList(//
								Stops.getALL_STOPS().get("2116"), // Windsor Transit Terminal
								Stops.getALL_STOPS().get("2239"), // == Grand River at 2nd
								Stops.getALL_STOPS().get("1427") // != LCA =>
						)) //
				.addTripSort(StrategicMappingCommons.SOUTH, //
						Arrays.asList(//
								Stops.getALL_STOPS().get("1427"), // != LCA <=
								Stops.getALL_STOPS().get("2241"), // == Cass at Bagley
								Stops.getALL_STOPS().get("2116") // Windsor Transit Terminal
						)) //
				.compileBothTripSort());
		map2.put(10L, new RouteTripSpec(10L, //
				StrategicMappingCommons.NORTH, MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.NORTH.getId(), // North Loop
				StrategicMappingCommons.SOUTH, MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.SOUTH.getId()) // South Loop
				.addTripSort(StrategicMappingCommons.NORTH, //
						Arrays.asList(//
								Stops.getALL_STOPS().get("1375"), // Tecumseh Mall Rear Entrance
								Stops.getALL_STOPS().get("2049"), // == McHugh at Darfield
								Stops.getALL_STOPS().get("2048"), // != WFCU Centre Main Entrance
								Stops.getALL_STOPS().get("2047"), // != McHugh at Mickey Renuad Way
								Stops.getALL_STOPS().get("2046"), // == McHugh at Cypress
								Stops.getALL_STOPS().get("1998") // Tecumseh Mall Rear Entrance
						)) //
				.addTripSort(StrategicMappingCommons.SOUTH, //
						Arrays.asList(//
								Stops.getALL_STOPS().get("1998"), // Tecumseh Mall Rear Entrance
								Stops.getALL_STOPS().get("2034"), // == McHugh at Cypress
								Stops.getALL_STOPS().get("2038"), // != McHugh at Micky Renaud Way
								Stops.getALL_STOPS().get("2039"), // != WFCU Centre Main Entrance
								Stops.getALL_STOPS().get("2041"), // == McHugh at Darfield
								Stops.getALL_STOPS().get("1375") // Tecumseh Mall Rear Entrance
						)) //
				.compileBothTripSort());
		map2.put(14L, new RouteTripSpec(14L, //
				StrategicMappingCommons.NORTH, MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.NORTH.getId(), // Downtown Transit Terminal
				StrategicMappingCommons.SOUTH, MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.SOUTH.getId()) // Devonshire Mall
				.addTripSort(StrategicMappingCommons.NORTH, //
						Arrays.asList(//
								Stops.getALL_STOPS().get("1877"), // Devonshire Mall at Moxies
								Stops.getALL_STOPS().get("2051") // Transit Terminal at Chatham
						)) //
				.addTripSort(StrategicMappingCommons.SOUTH, //
						Arrays.asList(//
								Stops.getALL_STOPS().get("2051"), // Transit Terminal at Chatham
								Stops.getALL_STOPS().get("1877") // Devonshire Mall at Moxies
						)) //
				.compileBothTripSort());
		map2.put(25L, new RouteTripSpec(25L, //
				StrategicMappingCommons.EAST, MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.EAST.getId(), // St Clair College
				StrategicMappingCommons.WEST, MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.WEST.getId()) // Morton @ Ojibway
				.addTripSort(StrategicMappingCommons.EAST, //
						Arrays.asList(//
								Stops.getALL_STOPS().get("2185"), // Morton at Ojibway
								Stops.getALL_STOPS().get("1734") // St Clair Front Entrance
						)) //
				.addTripSort(StrategicMappingCommons.WEST, //
						Arrays.asList(//
								Stops.getALL_STOPS().get("1734"), // St Clair Front Entrance
								Stops.getALL_STOPS().get("2185") // Morton at Ojibway
						)) //
				.compileBothTripSort());
		map2.put(42L, new RouteTripSpec(42L, //
				StrategicMappingCommons.NORTH, MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.NORTH.getId(), // Essex
				StrategicMappingCommons.SOUTH, MTrip.HEADSIGN_TYPE_DIRECTION, MDirectionType.SOUTH.getId()) // Leamington
				.addTripSort(StrategicMappingCommons.NORTH, //
						Arrays.asList(//
								Stops.getALL_STOPS().get("2248"), // Leamington Kinsmen Recreation Co
								Stops.getALL_STOPS().get("LEM"), // LEAMINGTON KINSMEN REC COMPLEX
								Stops.getALL_STOPS().get("1734") // St. Clair College Front Entrance
						)) //
				.addTripSort(StrategicMappingCommons.SOUTH, //
						Arrays.asList(//
								Stops.getALL_STOPS().get("1734"), // St. Clair College Front Entrance
								Stops.getALL_STOPS().get("LEM"), // LEAMINGTON KINSMEN REC COMPLEX
								Stops.getALL_STOPS().get("2248") // Leamington Kinsmen Recreation Co
						)) //
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
		MTLog.logFatal("Unexpected trip (unexpected route ID: %s): %s", mRoute.getId(), gTrip);
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
			return 1262; // Wyandotte @ Metro
		}
		if ("LEM".equals(gStop.getStopCode())) {
			return 2248; // Leamington Kinsmen Recreation Co
		}
		return Integer.parseInt(gStop.getStopCode()); // use stop code as stop ID
	}

	// STOP CODE USED BY REAL-TIME API
	@NotNull
	@Override
	public String getStopCode(GStop gStop) {
		if ("Sto125649".equals(gStop.getStopCode())) {
			return "77" + "1262"; // Wyandotte @ Metro
		}
		if (!gStop.getStopCode().startsWith("77")) {
			return "77" + gStop.getStopCode();
		}
		return super.getStopCode(gStop);
	}
}
