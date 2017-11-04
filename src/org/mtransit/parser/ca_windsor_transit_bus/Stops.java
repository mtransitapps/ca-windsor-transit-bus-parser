package org.mtransit.parser.ca_windsor_transit_bus;

import java.util.HashMap;

public class Stops {
	public static HashMap<String, String> ALL_STOPS;
	static {
		HashMap<String, String> allStops = new HashMap<String, String>();
		// rm -r input/gtfs
		// unzip input/gtfs.zip -d input/gtfs
		// awk -F "\"*,\"*" '{print "allStops.put(\"" $2 "\", \"" $1"\"); // " $3}' input/gtfs/stops.txt > output/output.java
		allStops.put("1000", "1"); // Windsor Transit Terminal
		allStops.put("1002", "2"); // Ouellette at Chatham
		allStops.put("1004", "3"); // Ouellette at Park
		allStops.put("1006", "4"); // Ouellette at Wyandotte
		allStops.put("1008", "5"); // Ouellette at Elliott
		allStops.put("1010", "6"); // Ouellette at Erie
		allStops.put("1012", "7"); // Ouellette at Pine
		allStops.put("1014", "8"); // Ouellette at Giles
		allStops.put("1016", "9"); // Ouellette at Montrose
		allStops.put("1018", "10"); // Ouellette at Ellis
		allStops.put("1020", "11"); // Ouellette at Shepherd
		allStops.put("1022", "12"); // Ouellette at Hanna
		allStops.put("1024", "13"); // Tecumseh E at Ouellette
		allStops.put("1027", "14"); // Tecumseh E at McDougall
		allStops.put("1029", "15"); // Howard at Tecumseh E
		allStops.put("1031", "16"); // Howard at Logan
		allStops.put("1033", "17"); // Howard at Foch
		allStops.put("1036", "18"); // Howard at Memorial
		allStops.put("1037", "19"); // Howard at Eugenie
		allStops.put("1040", "20"); // Howard at McDougall
		allStops.put("1043", "21"); // Howard at Edinborough
		allStops.put("1045", "22"); // Howard at Charles
		allStops.put("1047", "23"); // Howard at Grand Marais
		allStops.put("1049", "24"); // Howard at Roundhouse
		allStops.put("1050", "25"); // Sydney at Windsor Commons
		allStops.put("1051", "26"); // Devonshire Mall at Moxies
		allStops.put("1048", "27"); // Howard at Devonshire Mall
		allStops.put("1046", "28"); // Howard at Grand Marais
		allStops.put("1044", "29"); // Howard at Charles
		allStops.put("1042", "30"); // Howard at Edinborough
		allStops.put("1041", "31"); // Howard at McDougall
		allStops.put("1039", "32"); // Howard at Hildegard
		allStops.put("1038", "33"); // Howard at Eugenie
		allStops.put("1035", "34"); // Howard at Lens
		allStops.put("1034", "35"); // Howard at Foch
		allStops.put("1032", "36"); // Howard at Logan
		allStops.put("1030", "37"); // Tecumseh E at Howard
		allStops.put("1028", "38"); // Tecumseh E at McDougall
		allStops.put("1026", "39"); // Tecumseh E at Goyeau
		allStops.put("1025", "40"); // Ouellette at Tecumseh E
		allStops.put("1023", "41"); // Ouellette at Hanna
		allStops.put("1021", "42"); // Ouellette at Shepherd
		allStops.put("1019", "43"); // Ouellette at Ellis
		allStops.put("1017", "44"); // Ouellette at Montrose
		allStops.put("1015", "45"); // Ouellette at Giles
		allStops.put("1013", "46"); // Ouellette at Pine
		allStops.put("1011", "47"); // Ouellette at Erie
		allStops.put("1009", "48"); // Ouellette at Ouellette Manor
		allStops.put("1007", "49"); // Ouellette at Elliott
		allStops.put("1005", "50"); // Ouellette at Wyandotte
		allStops.put("1003", "51"); // Ouellette at Park
		allStops.put("1001", "52"); // Chatham at Ouellette
		allStops.put("1881", "53"); // Marentette at Division
		allStops.put("1879", "54"); // Marentette at Foster
		allStops.put("2114", "55"); // Marentette at Sydney
		allStops.put("2109", "56"); // E.C. Row Ave at Devon
		allStops.put("2110", "57"); // Marentette at E.C. Row Ave
		allStops.put("2111", "58"); // Marentette at Sydney
		allStops.put("1052", "59"); // College Ave. at Community Centre
		allStops.put("1053", "60"); // College at South
		allStops.put("1054", "61"); // College at Prince
		allStops.put("1056", "62"); // Prince at Barrymore
		allStops.put("1057", "63"); // Prince at Mulford
		allStops.put("1058", "64"); // Prince at Vaughan
		allStops.put("1059", "65"); // Prince at Glenfield
		allStops.put("1060", "66"); // Prince at Whitney
		allStops.put("1062", "67"); // Felix at Tecumseh
		allStops.put("1063", "68"); // Felix at Manchester
		allStops.put("1064", "69"); // Felix at Girardot
		allStops.put("1065", "70"); // Felix at Millen
		allStops.put("1067", "71"); // Felix at College
		allStops.put("1069", "72"); // Felix at Linwood
		allStops.put("1071", "73"); // Mill at Donnelly
		allStops.put("1073", "74"); // Mill at Sandwich
		allStops.put("1075", "75"); // Sandwich at Detroit
		allStops.put("1055", "76"); // Sandwich at University
		allStops.put("1078", "77"); // University at Huron Church
		allStops.put("1080", "78"); // University at Patricia
		allStops.put("1082", "79"); // University at California
		allStops.put("1085", "80"); // University at Randolph
		allStops.put("1087", "81"); // University at Partington
		allStops.put("1089", "82"); // University at Campbell
		allStops.put("2136", "83"); // University at Curry
		allStops.put("1092", "84"); // University at Cameron
		allStops.put("1094", "85"); // University at Wellington
		allStops.put("1096", "86"); // University at Crawford
		allStops.put("1098", "87"); // University at Caron
		allStops.put("1100", "88"); // University at Bruce
		allStops.put("2137", "89"); // University at Church
		allStops.put("1101", "90"); // Victoria at University
		allStops.put("1103", "91"); // Windsor Transit Terminal
		allStops.put("1106", "92"); // Tecumseh at Howard
		allStops.put("1109", "93"); // Tecumseh at Marentette
		allStops.put("1111", "94"); // Tecumseh at Parent
		allStops.put("1113", "95"); // Tecumseh at Forest
		allStops.put("1115", "96"); // Tecumseh at Parkwood
		allStops.put("1117", "97"); // Tecumseh at Moy
		allStops.put("1119", "98"); // Tecumseh at Lincoln
		allStops.put("1121", "99"); // Tecumseh at Kildare
		allStops.put("1123", "100"); // Tecumseh at Byng
		allStops.put("1125", "101"); // Tecumseh at Walker
		allStops.put("1128", "102"); // Tecumseh at Cadillac
		allStops.put("1130", "103"); // Tecumseh at Chandler
		allStops.put("1132", "104"); // Tecumseh at Meldrum
		allStops.put("1134", "105"); // Tecumseh at Central
		allStops.put("1135", "106"); // Tecumseh at Aubin
		allStops.put("1137", "107"); // Tecumseh at George
		allStops.put("1139", "108"); // Tecumseh at Rossini
		allStops.put("1142", "109"); // Tecumseh at Francois
		allStops.put("1144", "110"); // Tecumseh at Pillette
		allStops.put("1146", "111"); // Tecumseh at Norman
		allStops.put("1148", "112"); // Tecumseh at Westminster
		allStops.put("1150", "113"); // Tecumseh at Ford
		allStops.put("1152", "114"); // Rivard at Tecumseh
		allStops.put("1153", "115"); // Rivard at Adstoll
		allStops.put("1156", "116"); // Rivard at Rose
		allStops.put("1157", "117"); // Rose at Jos St. Louis
		allStops.put("1161", "118"); // Rose atLloyd George
		allStops.put("1163", "119"); // Roseville at Thornberry
		allStops.put("1165", "120"); // Roseville at Thornberry
		allStops.put("1167", "121"); // Roseville at Charlie Brooks
		allStops.put("1169", "122"); // Roseville at Tecumseh
		allStops.put("1171", "123"); // Tecumseh Rd. at Eastpark Plaza
		allStops.put("1173", "124"); // Tecumseh Mall Rear Entrance
		allStops.put("1175", "125"); // Tecumseh at Lauzon Parkway
		allStops.put("1177", "126"); // Tecumseh at Annie
		allStops.put("1179", "127"); // Tecumseh at Lauzon
		allStops.put("1181", "128"); // Tecumseh at Canadian Tire
		allStops.put("1183", "129"); // Tecumseh at Rafih
		allStops.put("1185", "130"); // Tecumseh at Penang
		allStops.put("1187", "131"); // Tecumseh at Metro Plaza
		allStops.put("1189", "132"); // Forest Glade at Tecumseh
		allStops.put("1191", "133"); // Forest Glade at Esplanade
		allStops.put("1193", "134"); // Forest Glade at Ridge
		allStops.put("1195", "135"); // Forest Glade at Wildwood
		allStops.put("1197", "136"); // Forest Glade at Mulberry
		allStops.put("1205", "137"); // Forest Glade at Elmwood
		allStops.put("1204", "138"); // Wildwood at Rosebriar
		allStops.put("1202", "139"); // Wildwood at Hemlock
		allStops.put("1201", "140"); // Wildwood at Midfield
		allStops.put("1200", "141"); // Wildwood at Forest Glade
		allStops.put("1199", "142"); // Wildwood at Beachdale
		allStops.put("1198", "143"); // Wildwood at Apple
		allStops.put("1196", "144"); // Wildwood at Forest Glade
		allStops.put("1194", "145"); // Forest Glade at Ridge
		allStops.put("1192", "146"); // Forest Glade at Eastcourt
		allStops.put("1190", "147"); // Forest Glade at Tecumseh
		allStops.put("1188", "148"); // Tecumseh at Forest Glade
		allStops.put("1186", "149"); // Tecumseh at Penang
		allStops.put("1184", "150"); // Tecumseh at Rafih
		allStops.put("1182", "151"); // Tecumseh at Food Basics
		allStops.put("1180", "152"); // Tecumseh at Lauzon
		allStops.put("1178", "153"); // Tecumseh at Annie
		allStops.put("1176", "154"); // Tecumseh at Lauzon Parkway
		allStops.put("1174", "155"); // Tecumseh Mall Rear Entrance
		allStops.put("1172", "156"); // Tecumseh at Walmart
		allStops.put("1170", "157"); // Roseville at Tecumseh
		allStops.put("1168", "158"); // Roseville at Charlie Brooks
		allStops.put("1166", "159"); // Roseville at Thornberry
		allStops.put("1164", "160"); // Roseville at Thornberry
		allStops.put("1162", "161"); // Rose at Jefferson
		allStops.put("1160", "162"); // Rose at Clemenceau
		allStops.put("1158", "163"); // Rose at Rivard
		allStops.put("1155", "164"); // Rivard at Adstoll
		allStops.put("2139", "165"); // Rivard at Tecumseh
		allStops.put("1151", "166"); // Tecumseh at Ford
		allStops.put("1149", "167"); // Tecumseh at Buckingham
		allStops.put("1147", "168"); // Tecumseh at Westminster
		allStops.put("1145", "169"); // Tecumseh at Norman
		allStops.put("1143", "170"); // Tecumseh at Pillette
		allStops.put("1141", "171"); // Tecumseh at Ellrose
		allStops.put("1203", "172"); // Tecumseh at Francois
		allStops.put("1140", "173"); // Tecumseh at Rossini
		allStops.put("1138", "174"); // Tecumseh at George
		allStops.put("1136", "175"); // Tecumseh at Westcott
		allStops.put("1133", "176"); // Tecumseh at Central
		allStops.put("1131", "177"); // Tecumseh at Meldrum
		allStops.put("1129", "178"); // Tecumseh at Chandler
		allStops.put("1127", "179"); // Tecumseh at Hickory
		allStops.put("1126", "180"); // Tecumseh at Factoria
		allStops.put("1124", "181"); // Tecumseh at Turner
		allStops.put("1122", "182"); // Tecumseh at Durham
		allStops.put("1120", "183"); // Tecumseh at Kildare
		allStops.put("1118", "184"); // Tecumseh at Lincoln
		allStops.put("1114", "185"); // Tecumseh at Hall
		allStops.put("1112", "186"); // Tecumseh at Benjamin
		allStops.put("1110", "187"); // Tecumseh at Parent
		allStops.put("1107", "188"); // Tecumseh a Windsor Health Centre
		allStops.put("1105", "189"); // Tecumseh at Howard
		allStops.put("1104", "190"); // University at Ouellette
		allStops.put("1102", "191"); // Transit Terminal at Chatham
		allStops.put("1099", "192"); // University at Bruce
		allStops.put("1097", "193"); // University at Caron
		allStops.put("1095", "194"); // University at Crawford
		allStops.put("1093", "195"); // University at Elm
		allStops.put("1091", "196"); // University at Cameron
		allStops.put("1090", "197"); // University at Curry
		allStops.put("1088", "198"); // University at Campbell
		allStops.put("1086", "199"); // University at Bridge
		allStops.put("1084", "200"); // University at Randolph
		allStops.put("1083", "201"); // University at Askin
		allStops.put("1081", "202"); // University at Patricia
		allStops.put("1079", "203"); // University at Huron Church
		allStops.put("1077", "204"); // Riverside at Rosedale
		allStops.put("1074", "205"); // Sandwich at Detroit
		allStops.put("1072", "206"); // Mill at Sandwich
		allStops.put("1070", "207"); // Mill at Wyandotte
		allStops.put("1068", "208"); // Felix at Linwood
		allStops.put("1066", "209"); // College at Felix
		allStops.put("1928", "210"); // Lincoln at Tecumseh
		allStops.put("1206", "211"); // College Ave. at Community Centre
		allStops.put("1116", "212"); // Prince at King
		allStops.put("1211", "213"); // Prince at Peter
		allStops.put("1213", "214"); // Sandwich at Watkins
		allStops.put("1215", "215"); // Sandwich at South
		allStops.put("1217", "216"); // Sandwich at Chippawa
		allStops.put("1219", "217"); // Sandwich at Brock
		allStops.put("1222", "218"); // Wyandotte at Mill
		allStops.put("1224", "219"); // Wyandotte at Rosedale
		allStops.put("1226", "220"); // Wyandotte at Huron Church
		allStops.put("1228", "221"); // Wyandotte at Sunset
		allStops.put("1231", "222"); // Wyandotte at Randolph
		allStops.put("1233", "223"); // Wyandotte at Bridge
		allStops.put("1235", "224"); // Wyandotte at Campbell
		allStops.put("1237", "225"); // Wyandotte at McKay
		allStops.put("1239", "226"); // Wyandotte at Wellington
		allStops.put("1241", "227"); // Wyandotte at Crawford
		allStops.put("1243", "228"); // Wyandotte at Caron
		allStops.put("1245", "229"); // Wyandotte at Bruce
		allStops.put("1248", "230"); // Wyandotte at Victoria
		allStops.put("1250", "231"); // Wyandotte at Ouellette
		allStops.put("1251", "232"); // Wyandotte at Dufferin
		allStops.put("1253", "233"); // Wyandotte at Windsor
		allStops.put("1255", "234"); // Wyandotte at McDougall
		allStops.put("1257", "235"); // Wyandotte at Glengarry
		allStops.put("1258", "236"); // Wyandotte at Aylmer
		allStops.put("1261", "237"); // Wyandotte at Marentette
		allStops.put("1263", "238"); // Wyandotte at Parent
		allStops.put("1265", "239"); // Wyandotte at Marion
		allStops.put("1267", "240"); // Wyandotte at Hall
		allStops.put("1269", "241"); // Wyandotte at Gladstone
		allStops.put("1270", "242"); // Wyandotte at Lincoln
		allStops.put("1273", "243"); // Wyandotte at Devonshire
		allStops.put("1274", "244"); // Wyandotte at Monmouth
		allStops.put("1276", "245"); // Wyandotte at Walker
		allStops.put("1278", "246"); // Wyandotte at Albert
		allStops.put("1280", "247"); // Wyandotte at Drouillard
		allStops.put("1282", "248"); // Wyandotte at Belleview
		allStops.put("1284", "249"); // Wyandotte at Strabane
		allStops.put("1286", "250"); // Wyandotte at Sterling
		allStops.put("1288", "251"); // Wyandotte at George
		allStops.put("1290", "252"); // Wyandotte at Rossini
		allStops.put("1292", "253"); // Wyandotte at Jos. Janisse
		allStops.put("1294", "254"); // Wyandotte at Pillette
		allStops.put("1296", "255"); // Wyandotte at Raymo
		allStops.put("1298", "256"); // Wyandotte at Westminster
		allStops.put("1300", "257"); // Wyandotte at Ford
		allStops.put("1301", "258"); // Wyandotte at Prado
		allStops.put("1303", "259"); // Wyandotte at St. Louis
		allStops.put("1306", "260"); // Wyandotte at Jefferson
		allStops.put("1308", "261"); // Wyandotte at Victor
		allStops.put("1311", "262"); // Wyandotte at St. Marys
		allStops.put("1315", "263"); // Wyandotte at St. Rose
		allStops.put("1317", "264"); // Wyandotte at Edward
		allStops.put("1318", "265"); // Wyandotte at Fairview
		allStops.put("1320", "266"); // Wyandotte at Matthew Brady
		allStops.put("1324", "267"); // Lauzon at Wyandotte
		allStops.put("1326", "268"); // Lauzon at Cedarview
		allStops.put("1328", "269"); // Lauzon at Clairview
		allStops.put("1330", "270"); // Lauzon at Riverside
		allStops.put("1333", "271"); // Riverside at Watson
		allStops.put("1337", "272"); // Riverside at Bayview Towers
		allStops.put("1339", "273"); // Riverside at St Clair Towers
		allStops.put("1341", "274"); // Riverside at Island View Towers
		allStops.put("1343", "275"); // Riverside at Westchester
		allStops.put("1345", "276"); // Riverdale at Cedarview
		allStops.put("1347", "277"); // Riverdale at Menard
		allStops.put("1349", "278"); // Riverdale at Wyandotte
		allStops.put("1351", "279"); // Riverdale at Jerome
		allStops.put("1353", "280"); // Riverdale at St. Rose
		allStops.put("1356", "281"); // Little River Acres at Abbey
		allStops.put("1358", "282"); // Little River Acres at Aire
		allStops.put("1360", "283"); // Little RiverAcres at Copperfield
		allStops.put("1362", "284"); // Little River Acres at East Moor
		allStops.put("1364", "285"); // Little RiverAcres at LittleRiver
		allStops.put("1365", "286"); // Little River at Laporte
		allStops.put("1366", "287"); // Lauzon Road at Edgar
		allStops.put("1367", "288"); // Lauzon Rd. at ABC Day Nursery
		allStops.put("1369", "289"); // Lauzon at Tranby
		allStops.put("1371", "290"); // Lauzon Parkway at Lauzon Line
		allStops.put("1373", "291"); // Lauzon Parkway at VIA Tracks
		allStops.put("1375", "292"); // Tecumseh Mall Rear Entrance
		allStops.put("1374", "293"); // Lauzon Parkway at Lauzon Line
		allStops.put("1372", "294"); // Lauzon at Tranby
		allStops.put("1370", "295"); // Lauzon at Trinity Towers
		allStops.put("1368", "296"); // Lauzon at Little River
		allStops.put("1076", "297"); // Little River at Adair
		allStops.put("1363", "298"); // Little River Acres at Little Riv
		allStops.put("1361", "299"); // Little River Acres at East Moor
		allStops.put("1359", "300"); // Little River Acres at Cottage
		allStops.put("1355", "301"); // Little River Acres at Aire
		allStops.put("1354", "302"); // Little RiverAcres at LittleRiver
		allStops.put("1352", "303"); // Riverdale at St. Rose
		allStops.put("1350", "304"); // Riverdale at Jerome
		allStops.put("1348", "305"); // Riverdale at Wyandotte
		allStops.put("1346", "306"); // Riverdale at Menard
		allStops.put("1344", "307"); // Riverdale at Riverside
		allStops.put("1342", "308"); // Riverside at Marina
		allStops.put("1340", "309"); // Riverside at Solidarity Towers
		allStops.put("1338", "310"); // Riverside at Riverside Towers
		allStops.put("1336", "311"); // Riverside at Shoreline Towers
		allStops.put("1334", "312"); // Riverside at Dieppe
		allStops.put("1329", "313"); // Riverside Dr. E. at Lauzon
		allStops.put("1327", "314"); // Lauzon at Cecile
		allStops.put("1325", "315"); // Lauzon at Cedarview
		allStops.put("1323", "316"); // Lauzon at Wyandotte
		allStops.put("1321", "317"); // Wyandotte at Matthew Brady
		allStops.put("1319", "318"); // Wyandotte at Fairview
		allStops.put("1316", "319"); // Wyandotte at Vernon
		allStops.put("1314", "320"); // Wyandotte at St. Rose
		allStops.put("1312", "321"); // Wyandotte at Janisse
		allStops.put("1309", "322"); // Wyandotte at Homedale
		allStops.put("1310", "323"); // Wyandotte at Patrice
		allStops.put("1307", "324"); // Wyandotte at Jefferson
		allStops.put("1304", "325"); // Wyandotte at Reedmere
		allStops.put("1302", "326"); // Wyandotte at Villaire
		allStops.put("1299", "327"); // Wyandotte at Ford
		allStops.put("1297", "328"); // Wyandotte at Westminster
		allStops.put("1295", "329"); // Wyandotte at Dawson
		allStops.put("1293", "330"); // Wyandotte at Pillette
		allStops.put("1291", "331"); // Wyandotte at Jos. Janisse
		allStops.put("1289", "332"); // Wyandotte at Rossini
		allStops.put("1287", "333"); // Wyandotte at George
		allStops.put("1285", "334"); // Wyandotte at Sterling
		allStops.put("1283", "335"); // Wyandotte at Strabane
		allStops.put("1281", "336"); // Wyandotte at Belleview
		allStops.put("1279", "337"); // Wyandotte at Drouillard
		allStops.put("1277", "338"); // Wyandotte at St. Luke
		allStops.put("1275", "339"); // Wyandotte at Walker
		allStops.put("1272", "340"); // Wyandotte at Devonshire
		allStops.put("1271", "341"); // Wyandotte at Chilver
		allStops.put("1268", "342"); // Wyandotte at Gladstone
		allStops.put("1266", "343"); // Wyandotte at Hall
		allStops.put("1264", "344"); // Wyandotte at Langlois
		allStops.put("1260", "345"); // Wyandotte at Marentette
		allStops.put("1259", "346"); // Wyandotte at Louis
		allStops.put("1256", "347"); // Wyandotte at Glengarry
		allStops.put("1254", "348"); // Wyandotte at McDougall
		allStops.put("1252", "349"); // Wyandotte at Goyeau
		allStops.put("1249", "350"); // Wyandotte at Ouellette
		allStops.put("1247", "351"); // Wyandotte at Victoria
		allStops.put("1244", "352"); // Wyandotte at Bruce
		allStops.put("1242", "353"); // Wyandotte at Janette
		allStops.put("1240", "354"); // Wyandotte at Crawford
		allStops.put("1238", "355"); // Wyandotte at Wellington
		allStops.put("1236", "356"); // Wyandotte at McKay
		allStops.put("1234", "357"); // Wyandotte at Campbell
		allStops.put("1232", "358"); // Wyandotte at Bridge
		allStops.put("1230", "359"); // Wyandotte at Randolph
		allStops.put("1229", "360"); // Wyandotte at California
		allStops.put("1227", "361"); // Wyandotte at Patricia
		allStops.put("1223", "362"); // Wyandotte at Rosedale
		allStops.put("1221", "363"); // Wyandotte at Mill
		allStops.put("1220", "364"); // Mill at Peter
		allStops.put("1218", "365"); // Sandwich at Brock
		allStops.put("1216", "366"); // Sandwich at Chippawa
		allStops.put("1214", "367"); // Sandwich at South
		allStops.put("1212", "368"); // Sandwich at Watkins
		allStops.put("1210", "369"); // Prince at Peter
		allStops.put("1209", "370"); // Prince at King
		allStops.put("1208", "371"); // College at Prince
		allStops.put("1207", "372"); // College at South
		allStops.put("Sto125649", "373"); // Wyandotte at Metro
		allStops.put("1324", "374"); // Lauzon at Wyandotte
		allStops.put("1376", "375"); // College Ave. at Community Centre
		allStops.put("1377", "376"); // South at College
		allStops.put("1378", "377"); // South at Wells
		allStops.put("1379", "378"); // Girardot at South
		allStops.put("1380", "379"); // Girardot at Strathmore
		allStops.put("1383", "380"); // Connaught at Chappell
		allStops.put("1386", "381"); // Sun Valley at Greenview
		allStops.put("1388", "382"); // Sun Valley at Malden
		allStops.put("1389", "383"); // Brunet at Industrial
		allStops.put("1391", "384"); // Industrial at Ambassador
		allStops.put("1392", "385"); // Ambassador at Urgent Care
		allStops.put("1393", "386"); // Ambassador at Malden
		allStops.put("1394", "387"); // Daytona at Malden
		allStops.put("1395", "388"); // Daytona at Totten
		allStops.put("1397", "389"); // Northway at Algonquin
		allStops.put("1399", "390"); // Tecumseh at Northway
		allStops.put("1401", "391"); // Tecumseh at California
		allStops.put("1403", "392"); // Tecumseh at Randolph
		allStops.put("1405", "393"); // Tecumseh at Bridge
		allStops.put("1408", "394"); // Tecumseh at Campbell
		allStops.put("1410", "395"); // Tecumseh at Curry
		allStops.put("1413", "396"); // Crawford at Tecumseh
		allStops.put("1416", "397"); // Crawford at Grove
		allStops.put("1418", "398"); // Crawford at Erie
		allStops.put("1420", "399"); // Crawford at College
		allStops.put("1422", "400"); // Crawford at Elliott
		allStops.put("1425", "401"); // Crawford at Wyandotte
		allStops.put("1429", "402"); // Erie at Ouellette
		allStops.put("1430", "403"); // Erie at Goyeau
		allStops.put("1431", "404"); // Erie at McDougall
		allStops.put("1435", "405"); // Erie at Howard
		allStops.put("1437", "406"); // Erie at Louis
		allStops.put("1438", "407"); // Erie at Elsmere
		allStops.put("1441", "408"); // Erie at Marion
		allStops.put("1444", "409"); // Erie at Hall
		allStops.put("1914", "410"); // Gladstone at Erie
		allStops.put("1447", "411"); // Richmond at Lincoln
		allStops.put("1449", "412"); // Richmond at Kildare
		allStops.put("1451", "413"); // Richmond at Argyle
		allStops.put("1452", "414"); // Richmond at Walker
		allStops.put("1455", "415"); // Richmond at St. Luke
		allStops.put("1457", "416"); // Richmond at Drouillard
		allStops.put("1459", "417"); // Drouillard at Ontario
		allStops.put("1461", "418"); // Drouillard at Franklin
		allStops.put("1322", "419"); // Drouillard at Metcalfe
		allStops.put("1464", "420"); // Drouillard at Seminole
		allStops.put("1466", "421"); // Drouillard at Reginald
		allStops.put("1468", "422"); // Drouillard at Alice
		allStops.put("1470", "423"); // Drouillard at Milloy
		allStops.put("1472", "424"); // Drouillard at Tecumseh
		allStops.put("1474", "425"); // George at Tecumseh
		allStops.put("1331", "426"); // George at Guy
		allStops.put("1476", "427"); // George at Milloy
		allStops.put("1478", "428"); // George at Alice
		allStops.put("1480", "429"); // George at Reginald
		allStops.put("1572", "430"); // Seminole at George
		allStops.put("1574", "431"); // Seminole at Rossini
		allStops.put("1577", "432"); // Seminole at Francois
		allStops.put("1483", "433"); // Seminole at Pillette
		allStops.put("1485", "434"); // Pillette at Reginald
		allStops.put("1487", "435"); // Pillette at Alice
		allStops.put("1489", "436"); // Pillette at Milloy
		allStops.put("1491", "437"); // Pillette at Guy
		allStops.put("1493", "438"); // Pillette at Tecumseh
		allStops.put("1495", "439"); // Pillette at Adstoll
		allStops.put("1497", "440"); // Pillette at Grand Marais
		allStops.put("1501", "441"); // Pillette at Plymouth
		allStops.put("1503", "442"); // Plymouth at Robert
		allStops.put("1505", "443"); // Plymouth at Tourangeau
		allStops.put("1506", "444"); // Plymouth at Grand Marais
		allStops.put("1507", "445"); // Central at Temple
		allStops.put("1508", "446"); // Mannheim at Deziel
		allStops.put("1509", "447"); // St. Etienne at Kautex
		allStops.put("1510", "448"); // Kautex at Deziel
		allStops.put("1511", "449"); // Deziel at Mannheim
		allStops.put("1512", "450"); // Deziel at Central
		allStops.put("1513", "451"); // Rhodes at Wheelton
		allStops.put("1514", "452"); // Rhodes at Electricity
		allStops.put("1515", "453"); // Rhodes at Jamieson
		allStops.put("1516", "454"); // Rhodes at Enwin
		allStops.put("1517", "455"); // Rhodes at Pillette
		allStops.put("1518", "456"); // Rhodes at Fuller Construction
		allStops.put("1335", "457"); // Rhodes at Jefferson
		allStops.put("1357", "458"); // Jefferson at E.C. Row
		allStops.put("1519", "459"); // North Service at Jefferson
		allStops.put("1520", "460"); // North Service at Clemenceau
		allStops.put("1521", "461"); // North Service at Tracks
		allStops.put("1522", "462"); // North Service Road at Pillette
		allStops.put("1332", "463"); // Service Road at Electrical Union
		allStops.put("1524", "464"); // Transit Centre Front Entrance
		allStops.put("1504", "465"); // N. Service at Central
		allStops.put("1502", "466"); // Grand Marais at Allyson
		allStops.put("1500", "467"); // Grand Marais at Tourangeau
		allStops.put("1498", "468"); // Grand Marais at Bernard
		allStops.put("1496", "469"); // Grand Marais at Pillette
		allStops.put("1494", "470"); // Pillette at Adstoll
		allStops.put("1492", "471"); // Pillette at Tecumseh
		allStops.put("1490", "472"); // Pillette at Guy
		allStops.put("1488", "473"); // Pillette at Milloy
		allStops.put("1486", "474"); // Pillette at Alice
		allStops.put("1484", "475"); // Pillette at Reginald
		allStops.put("1580", "476"); // Seminole at Pillette
		allStops.put("1578", "477"); // Seminole at Ellrose
		allStops.put("1576", "478"); // Seminole at Bernard
		allStops.put("1481", "479"); // George at Seminole
		allStops.put("1479", "480"); // George at Reginald
		allStops.put("1477", "481"); // George at Alice
		allStops.put("1475", "482"); // George at Milloy
		allStops.put("1313", "483"); // George at Guy
		allStops.put("1471", "484"); // Hickory at Tecumseh
		allStops.put("1469", "485"); // Hickory at Milloy
		allStops.put("1467", "486"); // Drouillard at Alice
		allStops.put("1465", "487"); // Drouillard at Reginald
		allStops.put("1463", "488"); // Drouillard at Seminole
		allStops.put("1462", "489"); // Drouillard at Metcalfe
		allStops.put("1460", "490"); // Drouillard at Franklin
		allStops.put("1458", "491"); // Drouillard at Ontario
		allStops.put("1456", "492"); // Richmond at Drouillard
		allStops.put("1454", "493"); // Richmond at St. Luke
		allStops.put("1453", "494"); // Richmond at Walker
		allStops.put("1450", "495"); // Richmond at Monmouth
		allStops.put("1448", "496"); // Richmond at Chilver
		allStops.put("1446", "497"); // Richmond at Lincoln
		allStops.put("1445", "498"); // Erie at Lincoln
		allStops.put("1443", "499"); // Erie at Moy
		allStops.put("1442", "500"); // Erie at Marion
		allStops.put("1440", "501"); // Erie at Elsmere
		allStops.put("1436", "502"); // Erie at Louis
		allStops.put("1434", "503"); // Erie at Howard
		allStops.put("1432", "504"); // Erie at McDougall
		allStops.put("1426", "505"); // Erie at Goyeau
		allStops.put("1428", "506"); // Erie at Ouellette
		allStops.put("1424", "507"); // Crawford at Wyandotte
		allStops.put("1423", "508"); // Crawford at Elliott
		allStops.put("1421", "509"); // Crawford at College
		allStops.put("1419", "510"); // Crawford at Erie
		allStops.put("1417", "511"); // Crawford at Grove
		allStops.put("1414", "512"); // Crawford at Tecumseh
		allStops.put("1412", "513"); // Tecumseh at Crawford
		allStops.put("1411", "514"); // Tecumseh at McKay
		allStops.put("1407", "515"); // Tecumseh at Campbell
		allStops.put("1406", "516"); // Tecumseh at Bridge
		allStops.put("1404", "517"); // Tecumseh at Randolph
		allStops.put("1402", "518"); // Tecumseh at California
		allStops.put("1400", "519"); // Tecumseh at Northway
		allStops.put("1398", "520"); // Tecumseh at Huron Church
		allStops.put("1396", "521"); // Tecumseh at Felix
		allStops.put("2051", "522"); // Transit Terminal at Chatham
		allStops.put("1425", "523"); // Crawford at Wyandotte
		allStops.put("1656", "524"); // Essex Way at Meadowbrook
		allStops.put("1660", "525"); // Cantelon at Kew
		allStops.put("1659", "526"); // Cantelon at Lauzon Parkway
		allStops.put("1658", "527"); // Forest Glade at Lauzon Parkway
		allStops.put("1657", "528"); // Forest Glade at Lauzon
		allStops.put("1655", "529"); // Beachdale at Chestnut
		allStops.put("1653", "530"); // Esplanade at Beachdale
		allStops.put("1651", "531"); // Esplanade at Ridge
		allStops.put("1649", "532"); // Esplanade at Lilac
		allStops.put("1647", "533"); // Lilac at Lauzon
		allStops.put("1645", "534"); // Lauzon Road at Hawthorne
		allStops.put("1643", "535"); // Lauzon Road at Yolanda
		allStops.put("1639", "536"); // Clemenceau at Rose
		allStops.put("1637", "537"); // Clemenceau at Joinville
		allStops.put("1635", "538"); // Clemenceau at Haig
		allStops.put("1633", "539"); // Clemenceau at Grand
		allStops.put("1631", "540"); // Clemenceau at Roosevelt
		allStops.put("1629", "541"); // Queen Elizabeth at Clemenceau
		allStops.put("1626", "542"); // Queen Elizabeth at Grandview
		allStops.put("1623", "543"); // Queen Elizabeth at Clarence
		allStops.put("1621", "544"); // Rivard at Queen Elizabeth
		allStops.put("1619", "545"); // Rivard at Library
		allStops.put("1617", "546"); // Rivard at Grand
		allStops.put("1615", "547"); // Rivard at Haig
		allStops.put("1613", "548"); // Rivard at Joinville
		allStops.put("1611", "549"); // Rivard at Rose
		allStops.put("1609", "550"); // Ford at Empress
		allStops.put("1607", "551"); // Ford at Coronation
		allStops.put("1605", "552"); // Ford at Lassaline
		allStops.put("1603", "553"); // Ford at Reginald
		allStops.put("1601", "554"); // South National at Ford
		allStops.put("1599", "555"); // South National at Ferndale
		allStops.put("1597", "556"); // South National at Balfour
		allStops.put("1595", "557"); // Jefferson at South National
		allStops.put("1593", "558"); // Jefferson at Edgar
		allStops.put("1591", "559"); // Jefferson at Raymond
		allStops.put("1589", "560"); // Jefferson at Ontario
		allStops.put("1588", "561"); // Pillette at Wyandotte
		allStops.put("1586", "562"); // Pillette at Ontario
		allStops.put("1584", "563"); // Pillette at South National
		allStops.put("1582", "564"); // Pillette at Metcalfe
		allStops.put("1573", "565"); // Seminole at George
		allStops.put("1570", "566"); // Seminole at Central
		allStops.put("1568", "567"); // Seminole at Chandler
		allStops.put("1566", "568"); // Seminole at Drouillard
		allStops.put("1564", "569"); // Seminole at Albert
		allStops.put("1562", "570"); // Seminole at Walker
		allStops.put("1560", "571"); // Ottawa at Monmouth
		allStops.put("1557", "572"); // Ottawa at Kildare
		allStops.put("1555", "573"); // Ottawa at Lincoln
		allStops.put("1552", "574"); // Ottawa at Gladstone
		allStops.put("1550", "575"); // Ottawa at Hall
		allStops.put("1548", "576"); // Ottawa at Benjamin
		allStops.put("1545", "577"); // Parent at Ottawa
		allStops.put("1543", "578"); // Giles at Elsmere
		allStops.put("1541", "579"); // Giles at Louis
		allStops.put("1539", "580"); // Giles at Howard
		allStops.put("1536", "581"); // Giles at McDougall
		allStops.put("1534", "582"); // Giles at Windsor
		allStops.put("1532", "583"); // Giles at Ouellette
		allStops.put("1529", "584"); // Transit Windsor Terminal
		allStops.put("1662", "585"); // Walker at Ontario
		allStops.put("2064", "586"); // Parent at Giles
		allStops.put("1531", "587"); // Giles at Ouellette
		allStops.put("1533", "588"); // Giles at Goyeau
		allStops.put("1535", "589"); // Giles at McDougall
		allStops.put("1538", "590"); // Giles at Howard
		allStops.put("1542", "591"); // Giles at Marentette
		allStops.put("1544", "592"); // Giles at Parent
		allStops.put("1546", "593"); // Ottawa at Parent
		allStops.put("1549", "594"); // Ottawa at Pierre
		allStops.put("1551", "595"); // Ottawa at Moy
		allStops.put("1553", "596"); // Ottawa at Gladstone
		allStops.put("1554", "597"); // Ottawa at Lincoln
		allStops.put("1556", "598"); // Ottawa at Kildare
		allStops.put("1559", "599"); // Ottawa at Walker
		allStops.put("1561", "600"); // Seminole at Walker
		allStops.put("1563", "601"); // Seminole at Albert
		allStops.put("1565", "602"); // Seminole at Drouillard
		allStops.put("1567", "603"); // Seminole at Chandler
		allStops.put("1569", "604"); // Seminole at Central
		allStops.put("1571", "605"); // Seminole at Westcott
		allStops.put("1579", "606"); // Pillette at Seminole
		allStops.put("1581", "607"); // Pillette at Metcalfe
		allStops.put("1583", "608"); // Pillette at South National
		allStops.put("1585", "609"); // Pillette at Ontario
		allStops.put("1587", "610"); // Pillette at Wyandotte
		allStops.put("1590", "611"); // Jefferson at Ontario
		allStops.put("1592", "612"); // Jefferson at Raymond
		allStops.put("1594", "613"); // Jefferson at Edgar
		allStops.put("1596", "614"); // South National at Jefferson
		allStops.put("1598", "615"); // South National at Balfour
		allStops.put("1600", "616"); // South National at Ferndale
		allStops.put("1602", "617"); // South National at Ford
		allStops.put("1604", "618"); // Ford at Reginald
		allStops.put("1606", "619"); // Ford at Lassaline
		allStops.put("1608", "620"); // Ford at Coronation
		allStops.put("1610", "621"); // Ford at Empress
		allStops.put("1612", "622"); // Rivard at Joinville
		allStops.put("1614", "623"); // Rivard at Haig
		allStops.put("1616", "624"); // Rivard at Grand
		allStops.put("1618", "625"); // Rivard at Ambassador Church
		allStops.put("1620", "626"); // Rivard at Queen Elizabeth
		allStops.put("1622", "627"); // Queen Elizabeth at Clarence
		allStops.put("1625", "628"); // Queen Elizabeth at Harmony
		allStops.put("1628", "629"); // Queen Elizabeth at Clemenceau
		allStops.put("1630", "630"); // Clemenceau at Roosevelt
		allStops.put("1632", "631"); // Clemenceau at Grand
		allStops.put("1634", "632"); // Clemenceau at Haig
		allStops.put("1636", "633"); // Clemenceau at Joinville
		allStops.put("1159", "634"); // Rose at Clemenceau
		allStops.put("1642", "635"); // Lauzon Rd. at Yolanda
		allStops.put("1644", "636"); // Lauzon Rd. at Hawthorne
		allStops.put("1646", "637"); // Hawthorne at Sycamore
		allStops.put("1648", "638"); // Meadowbrook at Hawthorne
		allStops.put("1650", "639"); // Meadowbrook at Parkside Estates
		allStops.put("1652", "640"); // Meadowbrook at Optimist Park
		allStops.put("1654", "641"); // Meadowbrook at Essex Way
		allStops.put("2063", "642"); // Giles at Parent
		allStops.put("1661", "643"); // Walker at Ontario
		allStops.put("1734", "644"); // St. Clair College Front Entrance
		allStops.put("1817", "645"); // Cousineau at Cousineau Circle
		allStops.put("1816", "646"); // Cousineau at Mount Royal
		allStops.put("1814", "647"); // Cousineau at Casgrain
		allStops.put("1813", "648"); // Cousineau at Country Club
		allStops.put("1809", "649"); // Country Club at Hunt Club
		allStops.put("1807", "650"); // Country Club at Shade Tree
		allStops.put("1804", "651"); // Country Club at Lake Trail
		allStops.put("1800", "652"); // Howard at North Talbot
		allStops.put("1799", "653"); // Howard at Wallace
		allStops.put("1797", "654"); // Howard at Ducharme
		allStops.put("1794", "655"); // Howard at Morand
		allStops.put("1792", "656"); // Cabana at Howard
		allStops.put("1791", "657"); // Cabana at Huntington
		allStops.put("1788", "658"); // Cabana at Dougall
		allStops.put("1786", "659"); // Dougall at Granada
		allStops.put("1784", "660"); // Dougall at Medina
		allStops.put("1782", "661"); // Dougall at Beals
		allStops.put("1387", "662"); // Dougall at Liberty
		allStops.put("1780", "663"); // Dougall at Norfolk
		allStops.put("1777", "664"); // Dougall at Nottingham Walmart
		allStops.put("1390", "665"); // Dougall Town Centre
		allStops.put("1775", "666"); // Dougall at West Grand
		allStops.put("1773", "667"); // Dougall at South Cameron
		allStops.put("1771", "668"); // Eugenie at Dougall
		allStops.put("1769", "669"); // Dougall at Rose Bowl
		allStops.put("1767", "670"); // Dougall at Dougall Square
		allStops.put("1763", "671"); // Dougall at Brentwood
		allStops.put("1761", "672"); // Dougall at Wear
		allStops.put("1759", "673"); // Tecumseh at York
		allStops.put("1757", "674"); // Bruce at Hanna
		allStops.put("1753", "675"); // Bruce at Shepherd
		allStops.put("1751", "676"); // Bruce at Clinton
		allStops.put("1749", "677"); // Bruce at Giles
		allStops.put("1747", "678"); // Bruce at Pine
		allStops.put("1745", "679"); // Bruce at Erie
		allStops.put("1433", "680"); // Bruce at Caroline
		allStops.put("1743", "681"); // Bruce at Elliott
		allStops.put("1742", "682"); // Bruce at Wyandotte
		allStops.put("1740", "683"); // Bruce at Park
		allStops.put("1738", "684"); // Bruce at University
		allStops.put("1737", "685"); // Transit Terminal at Chatham
		allStops.put("1739", "686"); // Janette at Park
		allStops.put("1741", "687"); // Janette at Wyandotte
		allStops.put("1382", "688"); // Janette at Elliott
		allStops.put("1384", "689"); // Janette at Caroline
		allStops.put("1385", "690"); // Erie at Janette
		allStops.put("1744", "691"); // Erie at Church
		allStops.put("1746", "692"); // Dougall at Pine
		allStops.put("1748", "693"); // Dougall at Giles
		allStops.put("1750", "694"); // Dougall at Montrose
		allStops.put("1752", "695"); // Dougall at Ellis
		allStops.put("1754", "696"); // Dougall at Shepherd
		allStops.put("1756", "697"); // Dougall at Hanna
		allStops.put("1758", "698"); // Dougall at Tecumseh
		allStops.put("1760", "699"); // Dougall at Wear
		allStops.put("1762", "700"); // Dougall at Jackson Park
		allStops.put("1764", "701"); // Dougall at Windsor Sportsmen
		allStops.put("1766", "702"); // Dougall at Dorwin Plaza
		allStops.put("1768", "703"); // Dougall at Dougall Plaza
		allStops.put("1770", "704"); // Eugenie at Pellisier
		allStops.put("1774", "705"); // Dougall at South Cameron
		allStops.put("1776", "706"); // Dougall at West Grand
		allStops.put("1778", "707"); // Dougall at Nottingham Walmart
		allStops.put("1779", "708"); // Dougall at Norfolk
		allStops.put("1781", "709"); // Dougall at Liberty
		allStops.put("1783", "710"); // Dougall at Beals
		allStops.put("1785", "711"); // Dougall at Medina
		allStops.put("1787", "712"); // Dougall at Granada
		allStops.put("1789", "713"); // Cabana at Dougall
		allStops.put("1790", "714"); // Cabana at Huntington
		allStops.put("1793", "715"); // Cabana at Howard
		allStops.put("1795", "716"); // Howard at Morand
		allStops.put("1796", "717"); // Howard at Ducharme
		allStops.put("1798", "718"); // Howard at Wallace
		allStops.put("1801", "719"); // Howard at Neal
		allStops.put("1803", "720"); // Country Club at Tournament
		allStops.put("1806", "721"); // Country Club at Rodfam
		allStops.put("1808", "722"); // Country Club at Hunt Club
		allStops.put("1810", "723"); // Country Club at Cousineau
		allStops.put("1812", "724"); // Cousineau at Casgrain
		allStops.put("1815", "725"); // Cousineau at Mt. Royal
		allStops.put("1732", "726"); // Cousineau at Highway 3
		allStops.put("1817", "727"); // Cousineau at Highway 3
		allStops.put("1869", "728"); // Cabana at McGraw
		allStops.put("1867", "729"); // Cabana at Dominion
		allStops.put("1736", "730"); // Geraedts at St. Clair Residence
		allStops.put("1866", "731"); // Cabana at Geraedts
		allStops.put("1868", "732"); // Cabana at Longfellow
		allStops.put("1870", "733"); // Cabana at McGraw
		allStops.put("1997", "734"); // Sixth Concession at North Talbot
		allStops.put("1993", "735"); // Sixth Concession at Holburn
		allStops.put("1991", "736"); // Holburn at Spago
		allStops.put("1989", "737"); // Ducharme at Holburn
		allStops.put("1987", "738"); // Ducharme at Canberra
		allStops.put("1985", "739"); // Ducharme at Periwinkle
		allStops.put("1983", "740"); // Ducharme at Fontana
		allStops.put("1981", "741"); // Ducharme at Lavender
		allStops.put("1979", "742"); // Ducharme at Walker
		allStops.put("1977", "743"); // Walker at Provincial
		allStops.put("1975", "744"); // Walker at 7th Concession
		allStops.put("1973", "745"); // Walker at Walker Crossings
		allStops.put("1971", "746"); // Walker at Canadian Tire
		allStops.put("1969", "747"); // Walker at Ferrari Plaza
		allStops.put("1966", "748"); // Walker at Division
		allStops.put("1964", "749"); // Walker at Moxlay
		allStops.put("1963", "750"); // Walker at Airport
		allStops.put("1961", "751"); // Walker at Melinda
		allStops.put("1959", "752"); // Walker at Calderwood
		allStops.put("1957", "753"); // Walker at Lappan
		allStops.put("1955", "754"); // Walker at Foster
		allStops.put("1953", "755"); // Walker at Seymour
		allStops.put("1951", "756"); // Walker at Sydney
		allStops.put("1949", "757"); // Walker at Digby
		allStops.put("1947", "758"); // Walker at Parkdale
		allStops.put("1945", "759"); // Walker at Grand Marais
		allStops.put("1943", "760"); // Walker at St. Julien
		allStops.put("1941", "761"); // Walker at Somme
		allStops.put("1939", "762"); // Ypres at Turner
		allStops.put("1937", "763"); // Ypres at Kildare
		allStops.put("1935", "764"); // Ypres at Lincoln
		allStops.put("1933", "765"); // Lincoln at Vimy
		allStops.put("1931", "766"); // Lincoln at Lens
		allStops.put("1929", "767"); // Lincoln at Tecumseh
		allStops.put("1805", "768"); // Lincoln at Mohawk
		allStops.put("1927", "769"); // Lincoln at Seneca
		allStops.put("1925", "770"); // Lincoln at ETR Rail Tracks
		allStops.put("1923", "771"); // Lincoln at Shepherd
		allStops.put("1921", "772"); // Lincoln at Ottawa
		allStops.put("1919", "773"); // Lincoln at Ontario
		allStops.put("1917", "774"); // Lincoln at Richmond
		allStops.put("1915", "775"); // Lincoln at Erie
		allStops.put("1913", "776"); // Lincoln at Niagara
		allStops.put("1911", "777"); // Lincoln at Cataraqui
		allStops.put("1909", "778"); // Lincoln at Wyandotte
		allStops.put("1907", "779"); // Lincoln at Assumption
		allStops.put("1811", "780"); // Riverside at Gladstone
		allStops.put("1905", "781"); // Riverside at Hall
		allStops.put("1802", "782"); // Riverside at Langlois
		allStops.put("1903", "783"); // Riverside at Parent
		allStops.put("1901", "784"); // Riverside at Aylmer
		allStops.put("1899", "785"); // Riverside at McDougall
		allStops.put("1898", "786"); // Riverside at Goyeau
		allStops.put("1896", "787"); // Ferry at Riverside
		allStops.put("1894", "788"); // Transit Terminal Church at Pitt
		allStops.put("1895", "789"); // Riverside at Ouellette
		allStops.put("1897", "790"); // Riverside at McDougall
		allStops.put("1900", "791"); // Riverside at Aylmer
		allStops.put("1902", "792"); // Riverside at Parent
		allStops.put("1818", "793"); // Riverside at Langlois
		allStops.put("1904", "794"); // Riverside at Hall
		allStops.put("1864", "795"); // Riverside at Gladstone
		allStops.put("1906", "796"); // Gladstone at Assumption
		allStops.put("1908", "797"); // Gladstone at Wyandotte
		allStops.put("1910", "798"); // Gladstone at Cataraqui
		allStops.put("1912", "799"); // Gladstone at Niagara
		allStops.put("1916", "800"); // Gladstone at Richmond
		allStops.put("1918", "801"); // Gladstone at Giles
		allStops.put("1920", "802"); // Gladstone at Ottawa
		allStops.put("1865", "803"); // Gladstone at Ellis
		allStops.put("1922", "804"); // Shepherd at Lincoln
		allStops.put("1924", "805"); // Lincoln at ETR Rail Tracks
		allStops.put("1926", "806"); // Lincoln at Seneca
		allStops.put("1930", "807"); // Lincoln at Lens
		allStops.put("1932", "808"); // Lincoln at Vimy
		allStops.put("1934", "809"); // Lincoln at Ypres
		allStops.put("1936", "810"); // Ypres at Kildare
		allStops.put("1938", "811"); // Ypres at Turner
		allStops.put("1940", "812"); // Walker at Somme
		allStops.put("1942", "813"); // Walker at St. Julien
		allStops.put("1944", "814"); // Walker at Grand Marais
		allStops.put("1946", "815"); // Walker at Parkdale
		allStops.put("1948", "816"); // Walker at Digby
		allStops.put("1950", "817"); // Walker at Sydney
		allStops.put("1952", "818"); // Walker at Seymour
		allStops.put("1954", "819"); // Walker at Foster
		allStops.put("1956", "820"); // Walker at Lappan
		allStops.put("1958", "821"); // Walker at Calderwood
		allStops.put("1960", "822"); // Walker at Melinda
		allStops.put("1962", "823"); // Walker at Ledyard
		allStops.put("1772", "824"); // Walker at Moxley
		allStops.put("1965", "825"); // Walker at Division
		allStops.put("1967", "826"); // Walker at Home Depot Plaza
		allStops.put("1970", "827"); // Walker at Canada Post
		allStops.put("1972", "828"); // Walker at Best Buy
		allStops.put("1974", "829"); // Walker at Costco
		allStops.put("1976", "830"); // Walker at Legacy Park
		allStops.put("1978", "831"); // Walker at Provincial
		allStops.put("1980", "832"); // Walker at Ducharme
		allStops.put("1982", "833"); // Walker at Highway 401
		allStops.put("1984", "834"); // Walker at U-Haul
		allStops.put("1986", "835"); // Walker at North Talbot
		allStops.put("1988", "836"); // North Talbot at Halford
		allStops.put("1990", "837"); // North Talbot at Burke
		allStops.put("1992", "838"); // North Talbot at Dumouchelle
		allStops.put("1994", "839"); // North Talbot at Old West
		allStops.put("1995", "840"); // North Talbot at Pioneer
		allStops.put("1968", "841"); // Airport at Front Entrance
		allStops.put("2052", "842"); // Ferry at Riverside
		allStops.put("2055", "843"); // Glengarry at University
		allStops.put("2057", "844"); // Glengarry at Wyandotte
		allStops.put("2059", "845"); // Howard at Elliott
		allStops.put("2065", "846"); // Parent at Ottawa
		allStops.put("2066", "847"); // Parent at Ellis
		allStops.put("2068", "848"); // Parent at Shepherd
		allStops.put("2070", "849"); // Parent at Hanna
		allStops.put("1108", "850"); // Tecumseh at Marentette
		allStops.put("2075", "851"); // Eugenie at Howard
		allStops.put("2076", "852"); // Eugenie at Lillian
		allStops.put("2080", "853"); // South Pacific at Parent
		allStops.put("2082", "854"); // South Pacific at Jeremiah
		allStops.put("2084", "855"); // Southdale at South Pacific
		allStops.put("2086", "856"); // Southdale at Southridge
		allStops.put("2088", "857"); // Slater at Southdale
		allStops.put("2092", "858"); // Slater at Grand Marais
		allStops.put("2094", "859"); // Grand Marais at Southdale
		allStops.put("2096", "860"); // Grand Marais at Garvey
		allStops.put("2098", "861"); // Grand Marais at South Pacific
		allStops.put("2100", "862"); // Grand Marais at Langlois
		allStops.put("2102", "863"); // N. Service Rd.at Langlois
		allStops.put("2104", "864"); // N. Service Rd. at Conservation
		allStops.put("2106", "865"); // E.C. Row Ave at Conservation
		allStops.put("2108", "866"); // E.C. Row Ave at Parkwood
		allStops.put("1765", "867"); // Sydney at Windsor Commons
		allStops.put("1877", "868"); // Devonshire Mall at Moxies
		allStops.put("2113", "869"); // Marentette at EC Row Ave
		allStops.put("2112", "870"); // E.C. Row Ave at Devon
		allStops.put("2105", "871"); // E.C Row Ave at Conservation
		allStops.put("2103", "872"); // N. Service Rd.at Alderbrook
		allStops.put("2101", "873"); // N. Service Rd. at Langlois
		allStops.put("2099", "874"); // Grand Marais at Langlois
		allStops.put("2097", "875"); // Grand Marais at South Pacific
		allStops.put("2095", "876"); // Grand Marais at Garvey
		allStops.put("2093", "877"); // Slater at Hartford
		allStops.put("2089", "878"); // Slater at Southdale
		allStops.put("2087", "879"); // Southdale at Bramley
		allStops.put("2085", "880"); // South Pacific at Southdale
		allStops.put("2083", "881"); // South Pacific at Jeremiah
		allStops.put("2081", "882"); // South Pacific at Parent
		allStops.put("2079", "883"); // Eugenie at South Pacific
		allStops.put("2077", "884"); // Eugenie at Remington
		allStops.put("2074", "885"); // Howard at Tecumseh
		allStops.put("2073", "886"); // Parent at Tecumseh
		allStops.put("2071", "887"); // Parent at Hanna
		allStops.put("2069", "888"); // Parent at Shepherd
		allStops.put("2067", "889"); // Parent at Ellis
		allStops.put("2061", "890"); // Howard at Erie
		allStops.put("2060", "891"); // Howard at Elliott
		allStops.put("2058", "892"); // Aylmer at Wyandotte
		allStops.put("2056", "893"); // Aylmer at Assumption
		allStops.put("2054", "894"); // Chatham at Glengarry
		allStops.put("2053", "895"); // Chatham at Goyeau
		allStops.put("2106", "896"); // Conservation at E.C. Row Ave
		allStops.put("2103", "897"); // N. Service Rd.at Jennifer
		allStops.put("2135", "898"); // Rosa Parks Transit Center
		allStops.put("2134", "899"); // Michigan at Washington
		allStops.put("2132", "900"); // Griswold at Congress
		allStops.put("2124", "901"); // Tunnel Platform at Mariner's
		allStops.put("2122", "902"); // McDougall at Wyandotte
		allStops.put("2120", "903"); // McDougall at University Avenue
		allStops.put("1755", "904"); // Chatham at Goyeau
		allStops.put("1831", "905"); // Chatham at Ouellette
		allStops.put("2116", "906"); // Windsor Transit Terminal
		allStops.put("2117", "907"); // Goyeau at Pitt
		allStops.put("2118", "908"); // City Hall Square
		allStops.put("2119", "909"); // Canada Tunnel Plaza Duty Free
		allStops.put("2126", "910"); // Congress at Beaubien
		allStops.put("2127", "911"); // Congress at Randolph
		allStops.put("2129", "912"); // Washington at Jefferson
		allStops.put("2130", "913"); // Fort at Cass
		allStops.put("2131", "914"); // Cass at Lafayette
		allStops.put("1665", "915"); // Riverside at Caron
		allStops.put("1525", "916"); // Crawford at Riverside
		allStops.put("1527", "917"); // Crawford at University
		allStops.put("1528", "918"); // Crawford at University
		allStops.put("1526", "919"); // Crawford at Riverside
		allStops.put("1664", "920"); // Riverside at Caron
		allStops.put("1893", "921"); // Legacy Park at Sears Home
		allStops.put("1892", "922"); // Division at Walker
		allStops.put("1537", "923"); // Division at Bliss
		allStops.put("1890", "924"); // Division at Woodward
		allStops.put("1889", "925"); // Division at Conservation Area
		allStops.put("1887", "926"); // Division at Clarke
		allStops.put("1876", "927"); // Howard at Kenilworth
		allStops.put("1874", "928"); // Howard at Maguire
		allStops.put("1871", "929"); // Cabana at Dougall
		allStops.put("1540", "930"); // Cabana at Granada
		allStops.put("1547", "931"); // Cabana at Casgrain
		allStops.put("1863", "932"); // Geraedts at St. Clair Residence
		allStops.put("1862", "933"); // Cabana at Geraedts
		allStops.put("1860", "934"); // Cabana at Randolph
		allStops.put("1638", "935"); // Cabana at Askin
		allStops.put("1858", "936"); // Cabana at Northway
		allStops.put("1627", "937"); // Todd Lane at Tenth
		allStops.put("1854", "938"); // Todd Lane at Ninth
		allStops.put("1624", "939"); // Todd Lane at Oxley
		allStops.put("1852", "940"); // Todd Lane at Canada
		allStops.put("1850", "941"); // Todd Lane at Fifth
		allStops.put("1848", "942"); // Todd Lane at Third
		allStops.put("1847", "943"); // Malden at Orford
		allStops.put("1845", "944"); // Malden at Delmar
		allStops.put("1843", "945"); // Sprucewood at Malden
		allStops.put("1575", "946"); // Sprucewood at Newman
		allStops.put("1841", "947"); // Sprucewood at Woodmont
		allStops.put("1839", "948"); // Sprucewood at Abbott
		allStops.put("1837", "949"); // Sprucewood at Kingsley
		allStops.put("1558", "950"); // Sprucewood at Matchette
		allStops.put("1833", "951"); // Marigold at Weaver
		allStops.put("1830", "952"); // Matchette at Titcombe
		allStops.put("1828", "953"); // Matchette at Armanda
		allStops.put("1826", "954"); // Matchette at Carmichael
		allStops.put("1824", "955"); // Matchette at Chappell
		allStops.put("1822", "956"); // Prince at Vaughan
		allStops.put("1821", "957"); // Prince at Mulford
		allStops.put("1820", "958"); // Prince at Wells
		allStops.put("1819", "959"); // College Ave. at Community Centre
		allStops.put("1823", "960"); // Matchette at Chappell
		allStops.put("1825", "961"); // Matchette at Carmichael
		allStops.put("1827", "962"); // Matchette at Broadway
		allStops.put("1829", "963"); // Matchette at Titcombe
		allStops.put("1835", "964"); // Sprucewood at Matchette
		allStops.put("1836", "965"); // Sprucewood at Kingsley
		allStops.put("1838", "966"); // Sprucewood at Abbott
		allStops.put("1840", "967"); // Sprucewood at Woodmont
		allStops.put("1482", "968"); // Sprucewood at Newman
		allStops.put("1842", "969"); // Sprucewood at Malden
		allStops.put("1844", "970"); // Malden at Delmar
		allStops.put("1846", "971"); // Malden at Todd Lane
		allStops.put("1849", "972"); // Todd Lane at Elmdale
		allStops.put("1851", "973"); // Todd Lane at Wayne
		allStops.put("1853", "974"); // Todd Lane at Canada
		allStops.put("1499", "975"); // Todd Lane at Bishop
		allStops.put("1855", "976"); // Todd Lane at Ninth
		allStops.put("1856", "977"); // Todd Lane at Tenth
		allStops.put("1857", "978"); // Cabana at Northway
		allStops.put("1523", "979"); // Cabana at Borrelli
		allStops.put("1859", "980"); // Cabana at Southwinds
		allStops.put("1861", "981"); // Cabana at Roxborough
		allStops.put("1473", "982"); // Cabana at Casgrain
		allStops.put("1415", "983"); // Cabana at Granada
		allStops.put("1872", "984"); // Howard at Cabana
		allStops.put("1873", "985"); // Howard at Maguire
		allStops.put("1875", "986"); // Howard at Kenilworth
		allStops.put("1880", "987"); // Marentette at Foster
		allStops.put("1882", "988"); // Marentette at Division
		allStops.put("1883", "989"); // Provincial at Clarke
		allStops.put("1409", "990"); // Provincial at Cabana
		allStops.put("1884", "991"); // Provincial at Humane Society
		allStops.put("1885", "992"); // Provincial at Sixth Concession
		allStops.put("1886", "993"); // Provincial at Lone Pine
		allStops.put("1888", "994"); // Provincial at Monarch Basics
		allStops.put("1891", "995"); // Provincial at Legacy Park
		allStops.put("1735", "996"); // Glenwood at Cabana
		allStops.put("1246", "997"); // Glenwood at St. Gabriel
		allStops.put("1733", "998"); // Beals at Roxborough
		allStops.put("1731", "999"); // Beals at Rankin
		allStops.put("1729", "1000"); // Rankin at Liberty
		allStops.put("1727", "1001"); // Norfolk at Rankin
		allStops.put("1724", "1002"); // Norfolk at California
		allStops.put("1722", "1003"); // California at Grand Marais
		allStops.put("1720", "1004"); // Grand Marais at Northway
		allStops.put("1718", "1005"); // Labelle at Northway
		allStops.put("1716", "1006"); // Labelle at California
		allStops.put("1714", "1007"); // Labelle at St. Patricks
		allStops.put("1710", "1008"); // Labelle at Orion
		allStops.put("1709", "1009"); // Labelle at Everts
		allStops.put("1707", "1010"); // Labelle at Dominion
		allStops.put("1705", "1011"); // Dominion at E.C. Row
		allStops.put("1704", "1012"); // Dominion at Northwood
		allStops.put("1701", "1013"); // Dominion at Holy Names
		allStops.put("1699", "1014"); // Dominion at Ojibway
		allStops.put("1697", "1015"); // Dominion at McKay
		allStops.put("1695", "1016"); // Dominion at Arcadia
		allStops.put("1693", "1017"); // Campbell at Totten
		allStops.put("1691", "1018"); // Campbell at Curry
		allStops.put("1154", "1019"); // Campbell at Mark
		allStops.put("1688", "1020"); // Campbell at Tecumseh
		allStops.put("1686", "1021"); // Campbell at Pelletier
		allStops.put("1684", "1022"); // Campbell at Taylor
		allStops.put("1682", "1023"); // Campbell at Grove
		allStops.put("1680", "1024"); // Campbell at Adanac
		allStops.put("1678", "1025"); // Campbell at College
		allStops.put("1676", "1026"); // Campbell at Rooney
		allStops.put("1674", "1027"); // Campbell at Wyandotte
		allStops.put("1381", "1028"); // Campbell at Martindale
		allStops.put("1672", "1029"); // Campbell at University
		allStops.put("1670", "1030"); // Campbell at Riverside
		allStops.put("1668", "1031"); // Riverside at McKay
		allStops.put("1666", "1032"); // Riverside at Oak
		allStops.put("1663", "1033"); // Windsor Transit Terminal
		allStops.put("1667", "1034"); // Riverside at Oak
		allStops.put("1669", "1035"); // Riverside at McKay
		allStops.put("1671", "1036"); // Campbell at Riverside
		allStops.put("1673", "1037"); // Campbell at University
		allStops.put("1305", "1038"); // Campbell at Martindale
		allStops.put("1675", "1039"); // Campbell at Wyandotte
		allStops.put("1677", "1040"); // Campbell at Rooney
		allStops.put("1679", "1041"); // Campbell at College
		allStops.put("1681", "1042"); // Campbell at Adanac
		allStops.put("1683", "1043"); // Campbell at Grove
		allStops.put("1685", "1044"); // Campbell at Taylor
		allStops.put("1687", "1045"); // Campbell at Pelletier
		allStops.put("1689", "1046"); // Campbell at Tecumseh
		allStops.put("1690", "1047"); // Campbell at Everts
		allStops.put("1692", "1048"); // Campbell at Curry
		allStops.put("1694", "1049"); // Dominion at Totten
		allStops.put("1696", "1050"); // Dominion at Arcadia
		allStops.put("1698", "1051"); // Dominion at McKay
		allStops.put("1700", "1052"); // Dominion at Ojibway
		allStops.put("1702", "1053"); // Dominion at Holy Names
		allStops.put("1703", "1054"); // Dominion at Northwood
		allStops.put("1706", "1055"); // Dominion at E.C. Row
		allStops.put("1708", "1056"); // Dominion at Labelle
		allStops.put("1711", "1057"); // Dominion at Grand Marais
		allStops.put("1713", "1058"); // Dominion at Norfolk
		allStops.put("1715", "1059"); // Dominion at Richardie
		allStops.put("1717", "1060"); // Dominion at Beals
		allStops.put("1719", "1061"); // Dominion at Roselawn
		allStops.put("1721", "1062"); // Dominion at Cabana
		allStops.put("1723", "1063"); // Mount Royal at Cabana
		allStops.put("1725", "1064"); // Mount Royal at Villa Maria North
		allStops.put("1726", "1065"); // Mount Royal at Villa Maria South
		allStops.put("1728", "1066"); // Mount Royal at Mitchell
		allStops.put("1730", "1067"); // Mount Royal at Cousineau
		allStops.put("1998", "1068"); // Tecumseh Mall Rear Entrance
		allStops.put("2007", "1069"); // Lauzon Rd. at Lilac
		allStops.put("1999", "1070"); // Lauzon at Vince
		allStops.put("2000", "1071"); // Lauzon at Forest Glade
		allStops.put("2001", "1072"); // Forest Glade at Meadowbrook
		allStops.put("2002", "1073"); // Anchor at Twin Oaks
		allStops.put("2003", "1074"); // Anchor at Green Shield
		allStops.put("2004", "1075"); // Anchor at CS Wind
		allStops.put("2006", "1076"); // Anchor at Jamison Entrance
		allStops.put("2005", "1077"); // Banwell at Wildwood
		allStops.put("2022", "1078"); // Banwell at Palmetto
		allStops.put("2024", "1079"); // Banwell at Tecumseh
		allStops.put("2028", "1080"); // McHugh at Questa
		allStops.put("2030", "1081"); // McHugh at Trappers
		allStops.put("2031", "1082"); // McHugh at Venetian
		allStops.put("2033", "1083"); // McHugh at Clover
		allStops.put("2034", "1084"); // McHugh at Cypress
		allStops.put("2039", "1085"); // WFCU Centre Main Entrance
		allStops.put("2041", "1086"); // McHugh at Darfield
		allStops.put("2043", "1087"); // Lauzon Rd. at McHugh
		allStops.put("2050", "1088"); // McHugh at Lauzon
		allStops.put("2049", "1089"); // McHugh at Darfield
		allStops.put("2048", "1090"); // WFCU Centre Main Entrance
		allStops.put("2046", "1091"); // McHugh at Cypress
		allStops.put("2045", "1092"); // McHugh at Clover
		allStops.put("2042", "1093"); // Clover at Firgrove
		allStops.put("2040", "1094"); // Clover at Little River
		allStops.put("2037", "1095"); // Little River at Pearson
		allStops.put("2035", "1096"); // Little River at Chateau
		allStops.put("2032", "1097"); // Little River at Banwell
		allStops.put("2029", "1098"); // Little River at Jarvis
		allStops.put("2027", "1099"); // Cora Greenwood at Little River
		allStops.put("2025", "1100"); // Cora Green at Castle Hill
		allStops.put("2023", "1101"); // Cora Green at Dillon
		allStops.put("2021", "1102"); // Cora Green at Riverside
		allStops.put("2020", "1103"); // Riverside at Jarvis
		allStops.put("2019", "1104"); // Greenpark at Amalfi
		allStops.put("2018", "1105"); // Wyandotte at Greenpark
		allStops.put("2017", "1106"); // Wyandotte at Clover
		allStops.put("2016", "1107"); // Wyandotte at Florence
		allStops.put("2015", "1108"); // Wyandotte at Martinique
		allStops.put("2014", "1109"); // Wyandotte at Greendale
		allStops.put("2013", "1110"); // Wyandotte at Westchester
		allStops.put("2012", "1111"); // Wyandotte at Isack
		allStops.put("2011", "1112"); // Wyandotte at Riverside Plaza
		allStops.put("2010", "1113"); // Wyandotte at Watson
		allStops.put("2009", "1114"); // Lauzon Rd. at Wyandotte
		allStops.put("2008", "1115"); // Lauzon Road at St. Rose
		allStops.put("2047", "1116"); // McHugh at Mickey Renuad Way
		allStops.put("2038", "1117"); // McHugh at Micky Renaud Way
		allStops.put("2185", "1118"); // Morton at Ojibway
		allStops.put("2186", "1119"); // Front at River
		allStops.put("2187", "1120"); // Front at Antaya
		allStops.put("2188", "1121"); // Front at Reaume
		allStops.put("2189", "1122"); // Front at Riverview
		allStops.put("2190", "1123"); // Front at Bouffard
		allStops.put("2191", "1124"); // Front at Huron
		allStops.put("2192", "1125"); // Front at Laurier
		allStops.put("2193", "1126"); // Front at Adams
		allStops.put("2194", "1127"); // Front at Boismier
		allStops.put("2195", "1128"); // International at Front
		allStops.put("2196", "1129"); // Michigan at International
		allStops.put("2197", "1130"); // Michigan at Fields
		allStops.put("2198", "1131"); // Michigan at Delaware
		allStops.put("2199", "1132"); // Michigan at Laurier
		allStops.put("2200", "1133"); // Laurier at Hazel
		allStops.put("2201", "1134"); // Laurier at Alfred
		allStops.put("2202", "1135"); // Laurier at Mayfair
		allStops.put("2203", "1136"); // Laurier at Marquette
		allStops.put("2204", "1137"); // Laurier at Matchette
		allStops.put("2205", "1138"); // Laurier at First
		allStops.put("2206", "1139"); // Laurier at Selkirk
		allStops.put("2207", "1140"); // Laurier at Tacoma
		allStops.put("2208", "1141"); // Laurier at Malden
		allStops.put("2168", "1142"); // Vollmer Centre Front Entrance
		allStops.put("2169", "1143"); // Mike Raymond at Malden
		allStops.put("2170", "1144"); // Malden at Laurier
		allStops.put("2171", "1145"); // Malden at Bouffard
		allStops.put("2172", "1146"); // Malden at Rosati
		allStops.put("2209", "1147"); // Malden at Reaume
		allStops.put("2210", "1148"); // Malden at Valiant
		allStops.put("2211", "1149"); // Malden at Stuart
		allStops.put("2212", "1150"); // Malden at Edgemore
		allStops.put("2213", "1151"); // Malden at Grillo
		allStops.put("2214", "1152"); // Malden at Normandy
		allStops.put("2215", "1153"); // Delmar at Trinity
		allStops.put("2216", "1154"); // Ellis at Normandy
		allStops.put("2217", "1155"); // Normandy at Seventh
		allStops.put("2218", "1156"); // Normandy at Tenth
		allStops.put("2219", "1157"); // Normandy at Thirteenth
		allStops.put("2220", "1158"); // Normandy at Huron Church
		allStops.put("2221", "1159"); // Huron Church at Disputed
		allStops.put("2222", "1160"); // Huron Church at Skinner
		allStops.put("2223", "1161"); // Sandwich West at Huron Church
		allStops.put("2224", "1162"); // Sandwich West at Mary
		allStops.put("2225", "1163"); // Sandwich West at D'Amore
		allStops.put("2226", "1164"); // Sandwich West at Durocher
		allStops.put("2227", "1165"); // Sandwich West at Lovell
		allStops.put("2228", "1166"); // Heritage at Sandwich West
		allStops.put("2229", "1167"); // Heritage at Rushwood
		allStops.put("2230", "1168"); // Heritage at Rushwood
		allStops.put("2231", "1169"); // Heritage at Blackthorn
		allStops.put("2232", "1170"); // Heritage at Sixth Concession
		allStops.put("2233", "1171"); // Sixth Concession at Montgomery
		allStops.put("2140", "1172"); // St Clair Front Entrance
		allStops.put("2141", "1173"); // Montgomery at Surrey
		allStops.put("2142", "1174"); // Montgomery at Eastbourne
		allStops.put("2143", "1175"); // Heritage at Winfield
		allStops.put("2144", "1176"); // Heritage at Winfield
		allStops.put("2145", "1177"); // Heritage at Rushwood
		allStops.put("2146", "1178"); // Heritage at Rushwood
		allStops.put("2147", "1179"); // Heritage at Sandwich West
		allStops.put("2148", "1180"); // Sandwich West at Lovell
		allStops.put("2149", "1181"); // Sandwich West at Durocher
		allStops.put("2150", "1182"); // Sandwich West at D'Amore
		allStops.put("2151", "1183"); // Sandwich West at Mary
		allStops.put("2152", "1184"); // Sandwich West at Huron Church
		allStops.put("2153", "1185"); // Huron Church at Skinner
		allStops.put("2154", "1186"); // Huron Church at Cousineau
		allStops.put("2155", "1187"); // Normandy at Huron Church
		allStops.put("2156", "1188"); // Normandy at Twelfth
		allStops.put("2157", "1189"); // Normandy at Tenth
		allStops.put("2158", "1190"); // Normandy at Seventh
		allStops.put("2159", "1191"); // Ellis at Normandy
		allStops.put("2160", "1192"); // Delmar at Trinity
		allStops.put("2161", "1193"); // Malden at Normandy
		allStops.put("2162", "1194"); // Malden at Morton
		allStops.put("2163", "1195"); // Malden at Edgemore
		allStops.put("2164", "1196"); // Malden at Outram
		allStops.put("2165", "1197"); // Malden at Monty
		allStops.put("2166", "1198"); // Malden at Rosati
		allStops.put("2167", "1199"); // Malden at Bouffard
		allStops.put("2173", "1200"); // Reaume at Malden
		allStops.put("2174", "1201"); // Reaume at Woodbridge
		allStops.put("2175", "1202"); // Reaume at Deerview
		allStops.put("2176", "1203"); // Reaume at Piruzza
		allStops.put("2177", "1204"); // Reaume at Matchette
		allStops.put("2178", "1205"); // Matchette at Monty
		allStops.put("2179", "1206"); // Matchette at Minto
		allStops.put("2180", "1207"); // Morton at Matchette
		allStops.put("2181", "1208"); // Morton at Quick
		allStops.put("2182", "1209"); // Morton at Wales
		allStops.put("2183", "1210"); // Morton at Ramblewood
		allStops.put("2184", "1211"); // Morton at Ramblewood
		ALL_STOPS = allStops;
	}
}
