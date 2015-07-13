package org.mtransit.parser.ca_windsor_transit_bus;

import java.util.HashSet;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.mtransit.parser.DefaultAgencyTools;
import org.mtransit.parser.Utils;
import org.mtransit.parser.gtfs.data.GCalendar;
import org.mtransit.parser.gtfs.data.GCalendarDate;
import org.mtransit.parser.gtfs.data.GRoute;
import org.mtransit.parser.gtfs.data.GSpec;
import org.mtransit.parser.gtfs.data.GTrip;
import org.mtransit.parser.mt.data.MAgency;
import org.mtransit.parser.mt.data.MRoute;
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

	private static final String RSN_TUNNEL_BUS = "TunnelBus";
	private static final long TUNNEL_BUS_RID = 999999l;

	private static final long RID_ID_A = 10000l;
	private static final long RID_ID_C = 30000l;
	private static final long RID_ID_W = 230000l;

	@Override
	public long getRouteId(GRoute gRoute) {
		if (Utils.isDigitsOnly(gRoute.route_short_name)) {
			return Long.parseLong(gRoute.route_short_name); // use route short name as route ID
		}
		if (RSN_TUNNEL_BUS.equalsIgnoreCase(gRoute.route_short_name)) {
			return TUNNEL_BUS_RID;
		}
		Matcher matcher = DIGITS.matcher(gRoute.route_short_name);
		matcher.find();
		long id = Long.parseLong(matcher.group());
		if (gRoute.route_short_name.endsWith(A)) {
			return RID_ID_A + id;
		} else if (gRoute.route_short_name.endsWith(C)) {
			return RID_ID_C + id;
		} else if (gRoute.route_short_name.endsWith(W)) {
			return RID_ID_W + id;
		}
		System.out.println("Unexpected route ID " + gRoute);
		System.exit(-1);
		return -1l;
	}

	private static final String TUNNEL = "Tunnel";

	@Override
	public String getRouteShortName(GRoute gRoute) {
		if (RSN_TUNNEL_BUS.equalsIgnoreCase(gRoute.route_short_name)) {
			return TUNNEL;
		}
		return super.getRouteShortName(gRoute);
	}

	@Override
	public String getRouteLongName(GRoute gRoute) {
		String routeLongName = gRoute.route_long_name;
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
	private static final String COLOR_FFF44C = "FFF44C";
	private static final String COLOR_65C1EF = "65C1EF";
	private static final String COLOR_222771 = "222771";
	private static final String COLOR_FBC1A0 = "FBC1A0";
	private static final String COLOR_184A31 = "184A31";
	private static final String COLOR_87CF32 = "87CF32";
	private static final String COLOR_F0319A = "F0319A";
	private static final String COLOR_A67AC4 = "A67AC4";

	@Override
	public String getRouteColor(GRoute gRoute) {
		if (Utils.isDigitsOnly(gRoute.route_short_name)) {
			switch (Integer.parseInt(gRoute.route_short_name)) {
			// @formatter:off
    			case 2: return COLOR_F68312;
    			case 3: return COLOR_FFF44C;
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
		if (RSN_1A.equalsIgnoreCase(gRoute.route_short_name)) {
			return COLOR_B50C43;
		} else if (RSN_1C.equalsIgnoreCase(gRoute.route_short_name)) {
			return COLOR_4E1E18;
		} else if (RSN_3W.equalsIgnoreCase(gRoute.route_short_name)) {
			return COLOR_CE910E;
		}
		if (RSN_TUNNEL_BUS.equalsIgnoreCase(gRoute.route_short_name)) {
			return COLOR_ED1248;
		}
		System.out.println("Unexpected route color " + gRoute);
		System.exit(-1);
		return null;
	}

	@Override
	public void setTripHeadsign(MRoute mRoute, MTrip mTrip, GTrip gTrip, GSpec gtfs) {
		mTrip.setHeadsignString(cleanTripHeadsign(gTrip.trip_headsign), gTrip.direction_id);
	}

	@Override
	public String cleanTripHeadsign(String tripHeadsign) {
		tripHeadsign = CleanUtils.cleanStreetTypes(tripHeadsign);
		return CleanUtils.cleanLabel(tripHeadsign);
	}

	private static final Pattern AT = Pattern.compile("( at )", Pattern.CASE_INSENSITIVE);

	private static final String AT_REPLACEMENT = " / ";

	@Override
	public String cleanStopName(String gStopName) {
		gStopName = AT.matcher(gStopName).replaceAll(AT_REPLACEMENT);
		gStopName = CleanUtils.cleanStreetTypes(gStopName);
		return CleanUtils.cleanLabel(gStopName);
	}
}
