package org.mtransit.parser.ca_windsor_transit_bus;

import java.util.HashMap;

public class Stops {
	public static HashMap<String, String> ALL_STOPS;
	static {
		HashMap<String, String> allStops = new HashMap<String, String>();
		// rm -r input/gtfs
		// unzip input/gtfs.zip -d input/gtfs
		// awk -F "\"*,\"*" '{print "allStops.put(\"" $2 "\", \"" $1"\"); // " $3}' input/gtfs/stops.txt > output/output.java
		allStops.put("1051", "1"); // Devonshire Mall at Moxies
		allStops.put("1048", "2"); // Howard at Devonshire Mall
		allStops.put("1046", "3"); // Howard at Grand Marais
		allStops.put("1044", "4"); // Howard at Charles
		allStops.put("1042", "5"); // Howard at Edinborough
		allStops.put("1041", "6"); // Howard at McDougall
		allStops.put("1039", "7"); // Howard at Hildegard
		allStops.put("1038", "8"); // Howard at Eugenie
		allStops.put("1035", "9"); // Howard at Lens
		allStops.put("1034", "10"); // Howard at Foch
		allStops.put("1032", "11"); // Howard at Logan
		allStops.put("1030", "12"); // Tecumseh E at Howard
		allStops.put("1028", "13"); // Tecumseh E at McDougall
		allStops.put("1026", "14"); // Tecumseh E at Goyeau
		allStops.put("1025", "15"); // Ouellette at Tecumseh E
		allStops.put("1023", "16"); // Ouellette at Hanna
		allStops.put("1021", "17"); // Ouellette at Shepherd
		allStops.put("1019", "18"); // Ouellette at Ellis
		allStops.put("1017", "19"); // Ouellette at Montrose
		allStops.put("1015", "20"); // Ouellette at Giles
		allStops.put("1013", "21"); // Ouellette at Pine
		allStops.put("1011", "22"); // Ouellette at Erie
		allStops.put("1009", "23"); // Ouellette at Ouellette Manor
		allStops.put("1007", "24"); // Ouellette at Elliott
		allStops.put("1005", "25"); // Ouellette at Wyandotte
		allStops.put("1003", "26"); // Ouellette at Park
		allStops.put("1001", "27"); // Chatham at Ouellette
		allStops.put("1000", "28"); // Windsor Transit Terminal
		allStops.put("1002", "29"); // Ouellette at Chatham
		allStops.put("1004", "30"); // Ouellette at Park
		allStops.put("1006", "31"); // Ouellette at Wyandotte
		allStops.put("1008", "32"); // Ouellette at Elliott
		allStops.put("1010", "33"); // Ouellette at Erie
		allStops.put("1012", "34"); // Ouellette at Pine
		allStops.put("1014", "35"); // Ouellette at Giles
		allStops.put("1016", "36"); // Ouellette at Montrose
		allStops.put("1018", "37"); // Ouellette at Ellis
		allStops.put("1020", "38"); // Ouellette at Shepherd
		allStops.put("1022", "39"); // Ouellette at Hanna
		allStops.put("1024", "40"); // Tecumseh E at Ouellette
		allStops.put("1027", "41"); // Tecumseh E at McDougall
		allStops.put("1029", "42"); // Howard at Tecumseh E
		allStops.put("1031", "43"); // Howard at Logan
		allStops.put("1033", "44"); // Howard at Foch
		allStops.put("1036", "45"); // Howard at Memorial
		allStops.put("1037", "46"); // Howard at Eugenie
		allStops.put("1040", "47"); // Howard at McDougall
		allStops.put("1043", "48"); // Howard at Edinborough
		allStops.put("1045", "49"); // Howard at Charles
		allStops.put("1047", "50"); // Howard at Grand Marais
		allStops.put("1049", "51"); // Howard at Roundhouse
		allStops.put("1050", "52"); // Sydney at Windsor Commons
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
		allStops.put("1375", "210"); // Tecumseh Mall Rear Entrance
		allStops.put("1374", "211"); // Lauzon Parkway at Lauzon Line
		allStops.put("1372", "212"); // Lauzon at Tranby
		allStops.put("1370", "213"); // Lauzon at Trinity Towers
		allStops.put("1368", "214"); // Lauzon at Little River
		allStops.put("1076", "215"); // Little River at Adair
		allStops.put("1363", "216"); // Little River Acres at Little Riv
		allStops.put("1361", "217"); // Little River Acres at East Moor
		allStops.put("1359", "218"); // Little River Acres at Cottage
		allStops.put("1355", "219"); // Little River Acres at Aire
		allStops.put("1354", "220"); // Little RiverAcres at LittleRiver
		allStops.put("1352", "221"); // Riverdale at St. Rose
		allStops.put("1350", "222"); // Riverdale at Jerome
		allStops.put("1348", "223"); // Riverdale at Wyandotte
		allStops.put("1346", "224"); // Riverdale at Menard
		allStops.put("1344", "225"); // Riverdale at Riverside
		allStops.put("1342", "226"); // Riverside at Marina
		allStops.put("1340", "227"); // Riverside at Solidarity Towers
		allStops.put("1338", "228"); // Riverside at Riverside Towers
		allStops.put("1336", "229"); // Riverside at Shoreline Towers
		allStops.put("1334", "230"); // Riverside at Dieppe
		allStops.put("1329", "231"); // Riverside Dr. E. at Lauzon
		allStops.put("1327", "232"); // Lauzon at Cecile
		allStops.put("1325", "233"); // Lauzon at Cedarview
		allStops.put("1323", "234"); // Lauzon at Wyandotte
		allStops.put("1321", "235"); // Wyandotte at Matthew Brady
		allStops.put("1319", "236"); // Wyandotte at Fairview
		allStops.put("1316", "237"); // Wyandotte at Vernon
		allStops.put("1314", "238"); // Wyandotte at St. Rose
		allStops.put("Sto125649", "239"); // Wyandotte at Metro
		allStops.put("1312", "240"); // Wyandotte at Janisse
		allStops.put("1309", "241"); // Wyandotte at Homedale
		allStops.put("1310", "242"); // Wyandotte at Patrice
		allStops.put("1307", "243"); // Wyandotte at Jefferson
		allStops.put("1304", "244"); // Wyandotte at Reedmere
		allStops.put("1302", "245"); // Wyandotte at Villaire
		allStops.put("1299", "246"); // Wyandotte at Ford
		allStops.put("1297", "247"); // Wyandotte at Westminster
		allStops.put("1295", "248"); // Wyandotte at Dawson
		allStops.put("1293", "249"); // Wyandotte at Pillette
		allStops.put("1291", "250"); // Wyandotte at Jos. Janisse
		allStops.put("1289", "251"); // Wyandotte at Rossini
		allStops.put("1287", "252"); // Wyandotte at George
		allStops.put("1285", "253"); // Wyandotte at Sterling
		allStops.put("1283", "254"); // Wyandotte at Strabane
		allStops.put("1281", "255"); // Wyandotte at Belleview
		allStops.put("1279", "256"); // Wyandotte at Drouillard
		allStops.put("1277", "257"); // Wyandotte at St. Luke
		allStops.put("1275", "258"); // Wyandotte at Walker
		allStops.put("1272", "259"); // Wyandotte at Devonshire
		allStops.put("1271", "260"); // Wyandotte at Chilver
		allStops.put("1268", "261"); // Wyandotte at Gladstone
		allStops.put("1266", "262"); // Wyandotte at Hall
		allStops.put("1264", "263"); // Wyandotte at Langlois
		allStops.put("1260", "264"); // Wyandotte at Marentette
		allStops.put("1259", "265"); // Wyandotte at Louis
		allStops.put("1256", "266"); // Wyandotte at Glengarry
		allStops.put("1254", "267"); // Wyandotte at McDougall
		allStops.put("1252", "268"); // Wyandotte at Goyeau
		allStops.put("1249", "269"); // Wyandotte at Ouellette
		allStops.put("1247", "270"); // Wyandotte at Victoria
		allStops.put("1244", "271"); // Wyandotte at Bruce
		allStops.put("1242", "272"); // Wyandotte at Janette
		allStops.put("1240", "273"); // Wyandotte at Crawford
		allStops.put("1238", "274"); // Wyandotte at Wellington
		allStops.put("1236", "275"); // Wyandotte at McKay
		allStops.put("1234", "276"); // Wyandotte at Campbell
		allStops.put("1232", "277"); // Wyandotte at Bridge
		allStops.put("1230", "278"); // Wyandotte at Randolph
		allStops.put("1229", "279"); // Wyandotte at California
		allStops.put("1227", "280"); // Wyandotte at Patricia
		allStops.put("1223", "281"); // Wyandotte at Rosedale
		allStops.put("1221", "282"); // Wyandotte at Mill
		allStops.put("1220", "283"); // Mill at Peter
		allStops.put("1218", "284"); // Sandwich at Brock
		allStops.put("1216", "285"); // Sandwich at Chippawa
		allStops.put("1214", "286"); // Sandwich at South
		allStops.put("1212", "287"); // Sandwich at Watkins
		allStops.put("1210", "288"); // Prince at Peter
		allStops.put("1209", "289"); // Prince at King
		allStops.put("1208", "290"); // College at Prince
		allStops.put("1207", "291"); // College at South
		allStops.put("1206", "292"); // College Ave. at Community Centre
		allStops.put("1116", "293"); // Prince at King
		allStops.put("1211", "294"); // Prince at Peter
		allStops.put("1213", "295"); // Sandwich at Watkins
		allStops.put("1215", "296"); // Sandwich at South
		allStops.put("1217", "297"); // Sandwich at Chippawa
		allStops.put("1219", "298"); // Sandwich at Brock
		allStops.put("1222", "299"); // Wyandotte at Mill
		allStops.put("1224", "300"); // Wyandotte at Rosedale
		allStops.put("1226", "301"); // Wyandotte at Huron Church
		allStops.put("1228", "302"); // Wyandotte at Sunset
		allStops.put("1231", "303"); // Wyandotte at Randolph
		allStops.put("1233", "304"); // Wyandotte at Bridge
		allStops.put("1235", "305"); // Wyandotte at Campbell
		allStops.put("1237", "306"); // Wyandotte at McKay
		allStops.put("1239", "307"); // Wyandotte at Wellington
		allStops.put("1241", "308"); // Wyandotte at Crawford
		allStops.put("1243", "309"); // Wyandotte at Caron
		allStops.put("1245", "310"); // Wyandotte at Bruce
		allStops.put("1248", "311"); // Wyandotte at Victoria
		allStops.put("1250", "312"); // Wyandotte at Ouellette
		allStops.put("1251", "313"); // Wyandotte at Dufferin
		allStops.put("1253", "314"); // Wyandotte at Windsor
		allStops.put("1255", "315"); // Wyandotte at McDougall
		allStops.put("1257", "316"); // Wyandotte at Glengarry
		allStops.put("1258", "317"); // Wyandotte at Aylmer
		allStops.put("1261", "318"); // Wyandotte at Marentette
		allStops.put("1263", "319"); // Wyandotte at Parent
		allStops.put("1265", "320"); // Wyandotte at Marion
		allStops.put("1267", "321"); // Wyandotte at Hall
		allStops.put("1269", "322"); // Wyandotte at Gladstone
		allStops.put("1270", "323"); // Wyandotte at Lincoln
		allStops.put("1273", "324"); // Wyandotte at Devonshire
		allStops.put("1274", "325"); // Wyandotte at Monmouth
		allStops.put("1276", "326"); // Wyandotte at Walker
		allStops.put("1278", "327"); // Wyandotte at Albert
		allStops.put("1280", "328"); // Wyandotte at Drouillard
		allStops.put("1282", "329"); // Wyandotte at Belleview
		allStops.put("1284", "330"); // Wyandotte at Strabane
		allStops.put("1286", "331"); // Wyandotte at Sterling
		allStops.put("1288", "332"); // Wyandotte at George
		allStops.put("1290", "333"); // Wyandotte at Rossini
		allStops.put("1292", "334"); // Wyandotte at Jos. Janisse
		allStops.put("1294", "335"); // Wyandotte at Pillette
		allStops.put("1296", "336"); // Wyandotte at Raymo
		allStops.put("1298", "337"); // Wyandotte at Westminster
		allStops.put("1300", "338"); // Wyandotte at Ford
		allStops.put("1301", "339"); // Wyandotte at Prado
		allStops.put("1303", "340"); // Wyandotte at St. Louis
		allStops.put("1306", "341"); // Wyandotte at Jefferson
		allStops.put("1308", "342"); // Wyandotte at Victor
		allStops.put("1311", "343"); // Wyandotte at St. Marys
		allStops.put("1315", "344"); // Wyandotte at St. Rose
		allStops.put("1317", "345"); // Wyandotte at Edward
		allStops.put("1318", "346"); // Wyandotte at Fairview
		allStops.put("1320", "347"); // Wyandotte at Matthew Brady
		allStops.put("1324", "348"); // Lauzon at Wyandotte
		allStops.put("1326", "349"); // Lauzon at Cedarview
		allStops.put("1328", "350"); // Lauzon at Clairview
		allStops.put("1330", "351"); // Lauzon at Riverside
		allStops.put("1333", "352"); // Riverside at Watson
		allStops.put("1337", "353"); // Riverside at Bayview Towers
		allStops.put("1339", "354"); // Riverside at St Clair Towers
		allStops.put("1341", "355"); // Riverside at Island View Towers
		allStops.put("1343", "356"); // Riverside at Westchester
		allStops.put("1345", "357"); // Riverdale at Cedarview
		allStops.put("1347", "358"); // Riverdale at Menard
		allStops.put("1349", "359"); // Riverdale at Wyandotte
		allStops.put("1351", "360"); // Riverdale at Jerome
		allStops.put("1353", "361"); // Riverdale at St. Rose
		allStops.put("1356", "362"); // Little River Acres at Abbey
		allStops.put("1358", "363"); // Little River Acres at Aire
		allStops.put("1360", "364"); // Little RiverAcres at Copperfield
		allStops.put("1362", "365"); // Little River Acres at East Moor
		allStops.put("1364", "366"); // Little RiverAcres at LittleRiver
		allStops.put("1365", "367"); // Little River at Laporte
		allStops.put("1366", "368"); // Lauzon Road at Edgar
		allStops.put("1367", "369"); // Lauzon Rd. at ABC Day Nursery
		allStops.put("1369", "370"); // Lauzon at Tranby
		allStops.put("1371", "371"); // Lauzon Parkway at Lauzon Line
		allStops.put("1373", "372"); // Lauzon Parkway at VIA Tracks
		allStops.put("1376", "373"); // College Ave. at Community Centre
		allStops.put("1377", "374"); // South at College
		allStops.put("1378", "375"); // South at Wells
		allStops.put("1379", "376"); // Girardot at South
		allStops.put("1380", "377"); // Girardot at Strathmore
		allStops.put("1383", "378"); // Connaught at Chappell
		allStops.put("1386", "379"); // Sun Valley at Greenview
		allStops.put("1388", "380"); // Sun Valley at Malden
		allStops.put("1389", "381"); // Brunet at Industrial
		allStops.put("1391", "382"); // Industrial at Ambassador
		allStops.put("1392", "383"); // Ambassador at Urgent Care
		allStops.put("1393", "384"); // Ambassador at Malden
		allStops.put("1394", "385"); // Daytona at Malden
		allStops.put("1395", "386"); // Daytona at Totten
		allStops.put("1397", "387"); // Northway at Algonquin
		allStops.put("1399", "388"); // Tecumseh at Northway
		allStops.put("1401", "389"); // Tecumseh at California
		allStops.put("1403", "390"); // Tecumseh at Randolph
		allStops.put("1405", "391"); // Tecumseh at Bridge
		allStops.put("1408", "392"); // Tecumseh at Campbell
		allStops.put("1410", "393"); // Tecumseh at Curry
		allStops.put("1413", "394"); // Crawford at Tecumseh
		allStops.put("1416", "395"); // Crawford at Grove
		allStops.put("1418", "396"); // Crawford at Erie
		allStops.put("1420", "397"); // Crawford at College
		allStops.put("1422", "398"); // Crawford at Elliott
		allStops.put("1425", "399"); // Crawford at Wyandotte
		allStops.put("1429", "400"); // Erie at Ouellette
		allStops.put("1430", "401"); // Erie at Goyeau
		allStops.put("1431", "402"); // Erie at McDougall
		allStops.put("1435", "403"); // Erie at Howard
		allStops.put("1437", "404"); // Erie at Louis
		allStops.put("1438", "405"); // Erie at Elsmere
		allStops.put("1441", "406"); // Erie at Marion
		allStops.put("1444", "407"); // Erie at Hall
		allStops.put("1914", "408"); // Gladstone at Erie
		allStops.put("1447", "409"); // Richmond at Lincoln
		allStops.put("1449", "410"); // Richmond at Kildare
		allStops.put("1451", "411"); // Richmond at Argyle
		allStops.put("1452", "412"); // Richmond at Walker
		allStops.put("1455", "413"); // Richmond at St. Luke
		allStops.put("1457", "414"); // Richmond at Drouillard
		allStops.put("1459", "415"); // Drouillard at Ontario
		allStops.put("1461", "416"); // Drouillard at Franklin
		allStops.put("1322", "417"); // Drouillard at Metcalfe
		allStops.put("1464", "418"); // Drouillard at Seminole
		allStops.put("1466", "419"); // Drouillard at Reginald
		allStops.put("1468", "420"); // Drouillard at Alice
		allStops.put("1470", "421"); // Drouillard at Milloy
		allStops.put("1472", "422"); // Drouillard at Tecumseh
		allStops.put("1474", "423"); // George at Tecumseh
		allStops.put("1331", "424"); // George at Guy
		allStops.put("1476", "425"); // George at Milloy
		allStops.put("1478", "426"); // George at Alice
		allStops.put("1480", "427"); // George at Reginald
		allStops.put("1572", "428"); // Seminole at George
		allStops.put("1574", "429"); // Seminole at Rossini
		allStops.put("1577", "430"); // Seminole at Francois
		allStops.put("1483", "431"); // Seminole at Pillette
		allStops.put("1485", "432"); // Pillette at Reginald
		allStops.put("1487", "433"); // Pillette at Alice
		allStops.put("1489", "434"); // Pillette at Milloy
		allStops.put("1491", "435"); // Pillette at Guy
		allStops.put("1493", "436"); // Pillette at Tecumseh
		allStops.put("1495", "437"); // Pillette at Adstoll
		allStops.put("1497", "438"); // Pillette at Grand Marais
		allStops.put("1501", "439"); // Pillette at Plymouth
		allStops.put("1503", "440"); // Plymouth at Robert
		allStops.put("1505", "441"); // Plymouth at Tourangeau
		allStops.put("1506", "442"); // Plymouth at Grand Marais
		allStops.put("1507", "443"); // Central at Temple
		allStops.put("1508", "444"); // Mannheim at Deziel
		allStops.put("1509", "445"); // St. Etienne at Kautex
		allStops.put("1510", "446"); // Kautex at Deziel
		allStops.put("1511", "447"); // Deziel at Mannheim
		allStops.put("1512", "448"); // Deziel at Central
		allStops.put("1513", "449"); // Rhodes at Wheelton
		allStops.put("1514", "450"); // Rhodes at Electricity
		allStops.put("1515", "451"); // Rhodes at Jamieson
		allStops.put("1516", "452"); // Rhodes at Enwin
		allStops.put("1517", "453"); // Rhodes at Pillette
		allStops.put("1518", "454"); // Rhodes at Fuller Construction
		allStops.put("1335", "455"); // Rhodes at Jefferson
		allStops.put("1357", "456"); // Jefferson at E.C. Row
		allStops.put("1519", "457"); // North Service at Jefferson
		allStops.put("1520", "458"); // North Service at Clemenceau
		allStops.put("1521", "459"); // North Service at Tracks
		allStops.put("1522", "460"); // North Service Road at Pillette
		allStops.put("1332", "461"); // Service Road at Electrical Union
		allStops.put("1524", "462"); // Transit Centre Front Entrance
		allStops.put("2051", "463"); // Transit Terminal at Chatham
		allStops.put("1504", "464"); // N. Service at Central
		allStops.put("1502", "465"); // Grand Marais at Allyson
		allStops.put("1500", "466"); // Grand Marais at Tourangeau
		allStops.put("1498", "467"); // Grand Marais at Bernard
		allStops.put("1496", "468"); // Grand Marais at Pillette
		allStops.put("1494", "469"); // Pillette at Adstoll
		allStops.put("1492", "470"); // Pillette at Tecumseh
		allStops.put("1490", "471"); // Pillette at Guy
		allStops.put("1488", "472"); // Pillette at Milloy
		allStops.put("1486", "473"); // Pillette at Alice
		allStops.put("1484", "474"); // Pillette at Reginald
		allStops.put("1580", "475"); // Seminole at Pillette
		allStops.put("1578", "476"); // Seminole at Ellrose
		allStops.put("1576", "477"); // Seminole at Bernard
		allStops.put("1481", "478"); // George at Seminole
		allStops.put("1479", "479"); // George at Reginald
		allStops.put("1477", "480"); // George at Alice
		allStops.put("1475", "481"); // George at Milloy
		allStops.put("1313", "482"); // George at Guy
		allStops.put("1471", "483"); // Hickory at Tecumseh
		allStops.put("1469", "484"); // Hickory at Milloy
		allStops.put("1467", "485"); // Drouillard at Alice
		allStops.put("1465", "486"); // Drouillard at Reginald
		allStops.put("1463", "487"); // Drouillard at Seminole
		allStops.put("1462", "488"); // Drouillard at Metcalfe
		allStops.put("1460", "489"); // Drouillard at Franklin
		allStops.put("1458", "490"); // Drouillard at Ontario
		allStops.put("1456", "491"); // Richmond at Drouillard
		allStops.put("1454", "492"); // Richmond at St. Luke
		allStops.put("1453", "493"); // Richmond at Walker
		allStops.put("1450", "494"); // Richmond at Monmouth
		allStops.put("1448", "495"); // Richmond at Chilver
		allStops.put("1446", "496"); // Richmond at Lincoln
		allStops.put("1445", "497"); // Erie at Lincoln
		allStops.put("1443", "498"); // Erie at Moy
		allStops.put("1442", "499"); // Erie at Marion
		allStops.put("1440", "500"); // Erie at Elsmere
		allStops.put("1436", "501"); // Erie at Louis
		allStops.put("1434", "502"); // Erie at Howard
		allStops.put("1432", "503"); // Erie at McDougall
		allStops.put("1426", "504"); // Erie at Goyeau
		allStops.put("1428", "505"); // Erie at Ouellette
		allStops.put("1424", "506"); // Crawford at Wyandotte
		allStops.put("1423", "507"); // Crawford at Elliott
		allStops.put("1421", "508"); // Crawford at College
		allStops.put("1419", "509"); // Crawford at Erie
		allStops.put("1417", "510"); // Crawford at Grove
		allStops.put("1414", "511"); // Crawford at Tecumseh
		allStops.put("1412", "512"); // Tecumseh at Crawford
		allStops.put("1411", "513"); // Tecumseh at McKay
		allStops.put("1407", "514"); // Tecumseh at Campbell
		allStops.put("1406", "515"); // Tecumseh at Bridge
		allStops.put("1404", "516"); // Tecumseh at Randolph
		allStops.put("1402", "517"); // Tecumseh at California
		allStops.put("1400", "518"); // Tecumseh at Northway
		allStops.put("1398", "519"); // Tecumseh at Huron Church
		allStops.put("1396", "520"); // Tecumseh at Felix
		allStops.put("1529", "521"); // Transit Windsor Terminal
		allStops.put("1531", "522"); // Giles at Ouellette
		allStops.put("1533", "523"); // Giles at Goyeau
		allStops.put("1535", "524"); // Giles at McDougall
		allStops.put("1538", "525"); // Giles at Howard
		allStops.put("1542", "526"); // Giles at Marentette
		allStops.put("1544", "527"); // Giles at Parent
		allStops.put("1546", "528"); // Ottawa at Parent
		allStops.put("1549", "529"); // Ottawa at Pierre
		allStops.put("1551", "530"); // Ottawa at Moy
		allStops.put("1553", "531"); // Ottawa at Gladstone
		allStops.put("1554", "532"); // Ottawa at Lincoln
		allStops.put("1556", "533"); // Ottawa at Kildare
		allStops.put("1559", "534"); // Ottawa at Walker
		allStops.put("1561", "535"); // Seminole at Walker
		allStops.put("1563", "536"); // Seminole at Albert
		allStops.put("1565", "537"); // Seminole at Drouillard
		allStops.put("1567", "538"); // Seminole at Chandler
		allStops.put("1569", "539"); // Seminole at Central
		allStops.put("1571", "540"); // Seminole at Westcott
		allStops.put("1579", "541"); // Pillette at Seminole
		allStops.put("1581", "542"); // Pillette at Metcalfe
		allStops.put("1583", "543"); // Pillette at South National
		allStops.put("1585", "544"); // Pillette at Ontario
		allStops.put("1587", "545"); // Pillette at Wyandotte
		allStops.put("1590", "546"); // Jefferson at Ontario
		allStops.put("1592", "547"); // Jefferson at Raymond
		allStops.put("1594", "548"); // Jefferson at Edgar
		allStops.put("1596", "549"); // South National at Jefferson
		allStops.put("1598", "550"); // South National at Balfour
		allStops.put("1600", "551"); // South National at Ferndale
		allStops.put("1602", "552"); // South National at Ford
		allStops.put("1604", "553"); // Ford at Reginald
		allStops.put("1606", "554"); // Ford at Lassaline
		allStops.put("1608", "555"); // Ford at Coronation
		allStops.put("1610", "556"); // Ford at Empress
		allStops.put("1612", "557"); // Rivard at Joinville
		allStops.put("1614", "558"); // Rivard at Haig
		allStops.put("1616", "559"); // Rivard at Grand
		allStops.put("1618", "560"); // Rivard at Ambassador Church
		allStops.put("1620", "561"); // Rivard at Queen Elizabeth
		allStops.put("1622", "562"); // Queen Elizabeth at Clarence
		allStops.put("1625", "563"); // Queen Elizabeth at Harmony
		allStops.put("1628", "564"); // Queen Elizabeth at Clemenceau
		allStops.put("1630", "565"); // Clemenceau at Roosevelt
		allStops.put("1632", "566"); // Clemenceau at Grand
		allStops.put("1634", "567"); // Clemenceau at Haig
		allStops.put("1636", "568"); // Clemenceau at Joinville
		allStops.put("1159", "569"); // Rose at Clemenceau
		allStops.put("1642", "570"); // Lauzon Rd. at Yolanda
		allStops.put("1644", "571"); // Lauzon Rd. at Hawthorne
		allStops.put("1646", "572"); // Hawthorne at Sycamore
		allStops.put("1648", "573"); // Meadowbrook at Hawthorne
		allStops.put("1650", "574"); // Meadowbrook at Parkside Estates
		allStops.put("1652", "575"); // Meadowbrook at Optimist Park
		allStops.put("1654", "576"); // Meadowbrook at Essex Way
		allStops.put("1656", "577"); // Essex Way at Meadowbrook
		allStops.put("2063", "578"); // Giles at Parent
		allStops.put("1661", "579"); // Walker at Ontario
		allStops.put("1660", "580"); // Cantelon at Kew
		allStops.put("1659", "581"); // Cantelon at Lauzon Parkway
		allStops.put("1658", "582"); // Forest Glade at Lauzon Parkway
		allStops.put("1657", "583"); // Forest Glade at Lauzon
		allStops.put("1655", "584"); // Beachdale at Chestnut
		allStops.put("1653", "585"); // Esplanade at Beachdale
		allStops.put("1651", "586"); // Esplanade at Ridge
		allStops.put("1649", "587"); // Esplanade at Lilac
		allStops.put("1647", "588"); // Lilac at Lauzon
		allStops.put("1645", "589"); // Lauzon Road at Hawthorne
		allStops.put("1643", "590"); // Lauzon Road at Yolanda
		allStops.put("1639", "591"); // Clemenceau at Rose
		allStops.put("1637", "592"); // Clemenceau at Joinville
		allStops.put("1635", "593"); // Clemenceau at Haig
		allStops.put("1633", "594"); // Clemenceau at Grand
		allStops.put("1631", "595"); // Clemenceau at Roosevelt
		allStops.put("1629", "596"); // Queen Elizabeth at Clemenceau
		allStops.put("1626", "597"); // Queen Elizabeth at Grandview
		allStops.put("1623", "598"); // Queen Elizabeth at Clarence
		allStops.put("1621", "599"); // Rivard at Queen Elizabeth
		allStops.put("1619", "600"); // Rivard at Library
		allStops.put("1617", "601"); // Rivard at Grand
		allStops.put("1615", "602"); // Rivard at Haig
		allStops.put("1613", "603"); // Rivard at Joinville
		allStops.put("1611", "604"); // Rivard at Rose
		allStops.put("1609", "605"); // Ford at Empress
		allStops.put("1607", "606"); // Ford at Coronation
		allStops.put("1605", "607"); // Ford at Lassaline
		allStops.put("1603", "608"); // Ford at Reginald
		allStops.put("1601", "609"); // South National at Ford
		allStops.put("1599", "610"); // South National at Ferndale
		allStops.put("1597", "611"); // South National at Balfour
		allStops.put("1595", "612"); // Jefferson at South National
		allStops.put("1593", "613"); // Jefferson at Edgar
		allStops.put("1591", "614"); // Jefferson at Raymond
		allStops.put("1589", "615"); // Jefferson at Ontario
		allStops.put("1588", "616"); // Pillette at Wyandotte
		allStops.put("1586", "617"); // Pillette at Ontario
		allStops.put("1584", "618"); // Pillette at South National
		allStops.put("1582", "619"); // Pillette at Metcalfe
		allStops.put("1573", "620"); // Seminole at George
		allStops.put("1570", "621"); // Seminole at Central
		allStops.put("1568", "622"); // Seminole at Chandler
		allStops.put("1566", "623"); // Seminole at Drouillard
		allStops.put("1564", "624"); // Seminole at Albert
		allStops.put("1562", "625"); // Seminole at Walker
		allStops.put("1560", "626"); // Ottawa at Monmouth
		allStops.put("1557", "627"); // Ottawa at Kildare
		allStops.put("1555", "628"); // Ottawa at Lincoln
		allStops.put("1552", "629"); // Ottawa at Gladstone
		allStops.put("1550", "630"); // Ottawa at Hall
		allStops.put("1548", "631"); // Ottawa at Benjamin
		allStops.put("1545", "632"); // Parent at Ottawa
		allStops.put("1543", "633"); // Giles at Elsmere
		allStops.put("1541", "634"); // Giles at Louis
		allStops.put("1539", "635"); // Giles at Howard
		allStops.put("1536", "636"); // Giles at McDougall
		allStops.put("1534", "637"); // Giles at Windsor
		allStops.put("1532", "638"); // Giles at Ouellette
		allStops.put("1662", "639"); // Walker at Ontario
		allStops.put("2064", "640"); // Parent at Giles
		allStops.put("1737", "641"); // Transit Terminal at Chatham
		allStops.put("1739", "642"); // Janette at Park
		allStops.put("1741", "643"); // Janette at Wyandotte
		allStops.put("1382", "644"); // Janette at Elliott
		allStops.put("1384", "645"); // Janette at Caroline
		allStops.put("1385", "646"); // Erie at Janette
		allStops.put("1744", "647"); // Erie at Church
		allStops.put("1746", "648"); // Dougall at Pine
		allStops.put("1748", "649"); // Dougall at Giles
		allStops.put("1750", "650"); // Dougall at Montrose
		allStops.put("1752", "651"); // Dougall at Ellis
		allStops.put("1754", "652"); // Dougall at Shepherd
		allStops.put("1756", "653"); // Dougall at Hanna
		allStops.put("1758", "654"); // Dougall at Tecumseh
		allStops.put("1760", "655"); // Dougall at Wear
		allStops.put("1762", "656"); // Dougall at Jackson Park
		allStops.put("1764", "657"); // Dougall at Windsor Sportsmen
		allStops.put("1766", "658"); // Dougall at Dorwin Plaza
		allStops.put("1768", "659"); // Dougall at Dougall Plaza
		allStops.put("1770", "660"); // Eugenie at Pellisier
		allStops.put("1774", "661"); // Dougall at South Cameron
		allStops.put("1776", "662"); // Dougall at West Grand
		allStops.put("1778", "663"); // Dougall at Nottingham Walmart
		allStops.put("1779", "664"); // Dougall at Norfolk
		allStops.put("1781", "665"); // Dougall at Liberty
		allStops.put("1783", "666"); // Dougall at Beals
		allStops.put("1785", "667"); // Dougall at Medina
		allStops.put("1787", "668"); // Dougall at Granada
		allStops.put("1789", "669"); // Cabana at Dougall
		allStops.put("1790", "670"); // Cabana at Huntington
		allStops.put("1793", "671"); // Cabana at Howard
		allStops.put("1795", "672"); // Howard at Morand
		allStops.put("1796", "673"); // Howard at Ducharme
		allStops.put("1798", "674"); // Howard at Wallace
		allStops.put("1801", "675"); // Howard at Neal
		allStops.put("1803", "676"); // Country Club at Tournament
		allStops.put("1806", "677"); // Country Club at Rodfam
		allStops.put("1808", "678"); // Country Club at Hunt Club
		allStops.put("1810", "679"); // Country Club at Cousineau
		allStops.put("1812", "680"); // Cousineau at Casgrain
		allStops.put("1815", "681"); // Cousineau at Mt. Royal
		allStops.put("1732", "682"); // Cousineau at Highway 3
		allStops.put("1734", "683"); // St. Clair College Front Entrance
		allStops.put("1817", "684"); // Cousineau at Highway 3
		allStops.put("1816", "685"); // Cousineau at Mount Royal
		allStops.put("1814", "686"); // Cousineau at Casgrain
		allStops.put("1813", "687"); // Cousineau at Country Club
		allStops.put("1809", "688"); // Country Club at Hunt Club
		allStops.put("1807", "689"); // Country Club at Shade Tree
		allStops.put("1804", "690"); // Country Club at Lake Trail
		allStops.put("1800", "691"); // Howard at North Talbot
		allStops.put("1799", "692"); // Howard at Wallace
		allStops.put("1797", "693"); // Howard at Ducharme
		allStops.put("1794", "694"); // Howard at Morand
		allStops.put("1792", "695"); // Cabana at Howard
		allStops.put("1791", "696"); // Cabana at Huntington
		allStops.put("1788", "697"); // Cabana at Dougall
		allStops.put("1786", "698"); // Dougall at Granada
		allStops.put("1784", "699"); // Dougall at Medina
		allStops.put("1782", "700"); // Dougall at Beals
		allStops.put("1387", "701"); // Dougall at Liberty
		allStops.put("1780", "702"); // Dougall at Norfolk
		allStops.put("1777", "703"); // Dougall at Nottingham Walmart
		allStops.put("1390", "704"); // Dougall Town Centre
		allStops.put("1775", "705"); // Dougall at West Grand
		allStops.put("1773", "706"); // Dougall at South Cameron
		allStops.put("1771", "707"); // Eugenie at Dougall
		allStops.put("1769", "708"); // Dougall at Rose Bowl
		allStops.put("1767", "709"); // Dougall at Dougall Square
		allStops.put("1763", "710"); // Dougall at Brentwood
		allStops.put("1761", "711"); // Dougall at Wear
		allStops.put("1759", "712"); // Tecumseh at York
		allStops.put("1757", "713"); // Bruce at Hanna
		allStops.put("1753", "714"); // Bruce at Shepherd
		allStops.put("1751", "715"); // Bruce at Clinton
		allStops.put("1749", "716"); // Bruce at Giles
		allStops.put("1747", "717"); // Bruce at Pine
		allStops.put("1745", "718"); // Bruce at Erie
		allStops.put("1433", "719"); // Bruce at Caroline
		allStops.put("1743", "720"); // Bruce at Elliott
		allStops.put("1742", "721"); // Bruce at Wyandotte
		allStops.put("1740", "722"); // Bruce at Park
		allStops.put("1738", "723"); // Bruce at University
		allStops.put("1869", "724"); // Cabana at McGraw
		allStops.put("1867", "725"); // Cabana at Dominion
		allStops.put("1736", "726"); // Geraedts at St. Clair Residence
		allStops.put("1866", "727"); // Cabana at Geraedts
		allStops.put("1868", "728"); // Cabana at Longfellow
		allStops.put("1870", "729"); // Cabana at McGraw
		allStops.put("1894", "730"); // Transit Terminal Church at Pitt
		allStops.put("1895", "731"); // Riverside at Ouellette
		allStops.put("1897", "732"); // Riverside at McDougall
		allStops.put("1900", "733"); // Riverside at Aylmer
		allStops.put("1902", "734"); // Riverside at Parent
		allStops.put("1818", "735"); // Riverside at Langlois
		allStops.put("1904", "736"); // Riverside at Hall
		allStops.put("1864", "737"); // Riverside at Gladstone
		allStops.put("1906", "738"); // Gladstone at Assumption
		allStops.put("1908", "739"); // Gladstone at Wyandotte
		allStops.put("1910", "740"); // Gladstone at Cataraqui
		allStops.put("1912", "741"); // Gladstone at Niagara
		allStops.put("1916", "742"); // Gladstone at Richmond
		allStops.put("1918", "743"); // Gladstone at Giles
		allStops.put("1920", "744"); // Gladstone at Ottawa
		allStops.put("1865", "745"); // Gladstone at Ellis
		allStops.put("1922", "746"); // Shepherd at Lincoln
		allStops.put("1924", "747"); // Lincoln at ETR Rail Tracks
		allStops.put("1926", "748"); // Lincoln at Seneca
		allStops.put("1928", "749"); // Lincoln at Tecumseh
		allStops.put("1930", "750"); // Lincoln at Lens
		allStops.put("1932", "751"); // Lincoln at Vimy
		allStops.put("1934", "752"); // Lincoln at Ypres
		allStops.put("1936", "753"); // Ypres at Kildare
		allStops.put("1938", "754"); // Ypres at Turner
		allStops.put("1940", "755"); // Walker at Somme
		allStops.put("1942", "756"); // Walker at St. Julien
		allStops.put("1944", "757"); // Walker at Grand Marais
		allStops.put("1946", "758"); // Walker at Parkdale
		allStops.put("1948", "759"); // Walker at Digby
		allStops.put("1950", "760"); // Walker at Sydney
		allStops.put("1952", "761"); // Walker at Seymour
		allStops.put("1954", "762"); // Walker at Foster
		allStops.put("1956", "763"); // Walker at Lappan
		allStops.put("1958", "764"); // Walker at Calderwood
		allStops.put("1960", "765"); // Walker at Melinda
		allStops.put("1962", "766"); // Walker at Ledyard
		allStops.put("1772", "767"); // Walker at Moxley
		allStops.put("1965", "768"); // Walker at Division
		allStops.put("1967", "769"); // Walker at Home Depot Plaza
		allStops.put("1970", "770"); // Walker at Canada Post
		allStops.put("1972", "771"); // Walker at Best Buy
		allStops.put("1974", "772"); // Walker at Costco
		allStops.put("1976", "773"); // Walker at Legacy Park
		allStops.put("1978", "774"); // Walker at Provincial
		allStops.put("1980", "775"); // Walker at Ducharme
		allStops.put("1982", "776"); // Walker at Highway 401
		allStops.put("1984", "777"); // Walker at U-Haul
		allStops.put("1986", "778"); // Walker at North Talbot
		allStops.put("1988", "779"); // North Talbot at Halford
		allStops.put("1990", "780"); // North Talbot at Burke
		allStops.put("1992", "781"); // North Talbot at Dumouchelle
		allStops.put("1994", "782"); // North Talbot at Old West
		allStops.put("1995", "783"); // North Talbot at Pioneer
		allStops.put("1997", "784"); // Sixth Concession at North Talbot
		allStops.put("1993", "785"); // Sixth Concession at Holburn
		allStops.put("1991", "786"); // Holburn at Spago
		allStops.put("1989", "787"); // Ducharme at Holburn
		allStops.put("1987", "788"); // Ducharme at Canberra
		allStops.put("1985", "789"); // Ducharme at Periwinkle
		allStops.put("1983", "790"); // Ducharme at Fontana
		allStops.put("1981", "791"); // Ducharme at Lavender
		allStops.put("1979", "792"); // Ducharme at Walker
		allStops.put("1977", "793"); // Walker at Provincial
		allStops.put("1975", "794"); // Walker at 7th Concession
		allStops.put("1973", "795"); // Walker at Walker Crossings
		allStops.put("1971", "796"); // Walker at Canadian Tire
		allStops.put("1969", "797"); // Walker at Ferrari Plaza
		allStops.put("1968", "798"); // Airport at Front Entrance
		allStops.put("1966", "799"); // Walker at Division
		allStops.put("1964", "800"); // Walker at Moxlay
		allStops.put("1963", "801"); // Walker at Airport
		allStops.put("1961", "802"); // Walker at Melinda
		allStops.put("1959", "803"); // Walker at Calderwood
		allStops.put("1957", "804"); // Walker at Lappan
		allStops.put("1955", "805"); // Walker at Foster
		allStops.put("1953", "806"); // Walker at Seymour
		allStops.put("1951", "807"); // Walker at Sydney
		allStops.put("1949", "808"); // Walker at Digby
		allStops.put("1947", "809"); // Walker at Parkdale
		allStops.put("1945", "810"); // Walker at Grand Marais
		allStops.put("1943", "811"); // Walker at St. Julien
		allStops.put("1941", "812"); // Walker at Somme
		allStops.put("1939", "813"); // Ypres at Turner
		allStops.put("1937", "814"); // Ypres at Kildare
		allStops.put("1935", "815"); // Ypres at Lincoln
		allStops.put("1933", "816"); // Lincoln at Vimy
		allStops.put("1931", "817"); // Lincoln at Lens
		allStops.put("1929", "818"); // Lincoln at Tecumseh
		allStops.put("1805", "819"); // Lincoln at Mohawk
		allStops.put("1927", "820"); // Lincoln at Seneca
		allStops.put("1925", "821"); // Lincoln at ETR Rail Tracks
		allStops.put("1923", "822"); // Lincoln at Shepherd
		allStops.put("1921", "823"); // Lincoln at Ottawa
		allStops.put("1919", "824"); // Lincoln at Ontario
		allStops.put("1917", "825"); // Lincoln at Richmond
		allStops.put("1915", "826"); // Lincoln at Erie
		allStops.put("1913", "827"); // Lincoln at Niagara
		allStops.put("1911", "828"); // Lincoln at Cataraqui
		allStops.put("1909", "829"); // Lincoln at Wyandotte
		allStops.put("1907", "830"); // Lincoln at Assumption
		allStops.put("1811", "831"); // Riverside at Gladstone
		allStops.put("1905", "832"); // Riverside at Hall
		allStops.put("1802", "833"); // Riverside at Langlois
		allStops.put("1903", "834"); // Riverside at Parent
		allStops.put("1901", "835"); // Riverside at Aylmer
		allStops.put("1899", "836"); // Riverside at McDougall
		allStops.put("1898", "837"); // Riverside at Goyeau
		allStops.put("1896", "838"); // Ferry at Riverside
		allStops.put("1877", "839"); // Devonshire Mall at Moxies
		allStops.put("2113", "840"); // Marentette at EC Row Ave
		allStops.put("2112", "841"); // E.C. Row Ave at Devon
		allStops.put("2105", "842"); // E.C Row Ave at Conservation
		allStops.put("2103", "843"); // N. Service Rd.at Jennifer
		allStops.put("2101", "844"); // N. Service Rd. at Langlois
		allStops.put("2099", "845"); // Grand Marais at Langlois
		allStops.put("2097", "846"); // Grand Marais at South Pacific
		allStops.put("2095", "847"); // Grand Marais at Garvey
		allStops.put("2093", "848"); // Slater at Hartford
		allStops.put("2089", "849"); // Slater at Southdale
		allStops.put("2087", "850"); // Southdale at Bramley
		allStops.put("2085", "851"); // South Pacific at Southdale
		allStops.put("2083", "852"); // South Pacific at Jeremiah
		allStops.put("2081", "853"); // South Pacific at Parent
		allStops.put("2079", "854"); // Eugenie at South Pacific
		allStops.put("2077", "855"); // Eugenie at Remington
		allStops.put("2074", "856"); // Howard at Tecumseh
		allStops.put("2073", "857"); // Parent at Tecumseh
		allStops.put("2071", "858"); // Parent at Hanna
		allStops.put("2069", "859"); // Parent at Shepherd
		allStops.put("2067", "860"); // Parent at Ellis
		allStops.put("2061", "861"); // Howard at Erie
		allStops.put("2060", "862"); // Howard at Elliott
		allStops.put("2058", "863"); // Aylmer at Wyandotte
		allStops.put("2056", "864"); // Aylmer at Assumption
		allStops.put("2054", "865"); // Chatham at Glengarry
		allStops.put("2053", "866"); // Chatham at Goyeau
		allStops.put("2052", "867"); // Ferry at Riverside
		allStops.put("2055", "868"); // Glengarry at University
		allStops.put("2057", "869"); // Glengarry at Wyandotte
		allStops.put("2059", "870"); // Howard at Elliott
		allStops.put("2065", "871"); // Parent at Ottawa
		allStops.put("2066", "872"); // Parent at Ellis
		allStops.put("2068", "873"); // Parent at Shepherd
		allStops.put("2070", "874"); // Parent at Hanna
		allStops.put("1108", "875"); // Tecumseh at Marentette
		allStops.put("2075", "876"); // Eugenie at Howard
		allStops.put("2076", "877"); // Eugenie at Lillian
		allStops.put("2080", "878"); // South Pacific at Parent
		allStops.put("2082", "879"); // South Pacific at Jeremiah
		allStops.put("2084", "880"); // Southdale at South Pacific
		allStops.put("2086", "881"); // Southdale at Southridge
		allStops.put("2088", "882"); // Slater at Southdale
		allStops.put("2092", "883"); // Slater at Grand Marais
		allStops.put("2094", "884"); // Grand Marais at Southdale
		allStops.put("2096", "885"); // Grand Marais at Garvey
		allStops.put("2098", "886"); // Grand Marais at South Pacific
		allStops.put("2100", "887"); // Grand Marais at Langlois
		allStops.put("2102", "888"); // N. Service Rd.at Langlois
		allStops.put("2104", "889"); // N. Service Rd. at Conservation
		allStops.put("2106", "890"); // Conservation at E.C. Row Ave
		allStops.put("2108", "891"); // E.C. Row Ave at Parkwood
		allStops.put("1765", "892"); // Sydney at Windsor Commons
		allStops.put("2135", "893"); // Rosa Parks Transit Center
		allStops.put("2134", "894"); // Michigan at Washington
		allStops.put("2132", "895"); // Griswold at Congress
		allStops.put("2124", "896"); // Tunnel Platform at Mariner's
		allStops.put("2122", "897"); // McDougall at Wyandotte
		allStops.put("2120", "898"); // McDougall at University Avenue
		allStops.put("1755", "899"); // Chatham at Goyeau
		allStops.put("1831", "900"); // Chatham at Ouellette
		allStops.put("2116", "901"); // Windsor Transit Terminal
		allStops.put("2117", "902"); // Goyeau at Pitt
		allStops.put("2118", "903"); // City Hall Square
		allStops.put("2119", "904"); // Canada Tunnel Plaza Duty Free
		allStops.put("2126", "905"); // Congress at Beaubien
		allStops.put("2127", "906"); // Congress at Randolph
		allStops.put("2129", "907"); // Washington at Jefferson
		allStops.put("2130", "908"); // Fort at Cass
		allStops.put("2131", "909"); // Cass at Lafayette
		allStops.put("1528", "910"); // Crawford at University
		allStops.put("1526", "911"); // Crawford at Riverside
		allStops.put("1664", "912"); // Riverside at Caron
		allStops.put("1665", "913"); // Riverside at Caron
		allStops.put("1525", "914"); // Crawford at Riverside
		allStops.put("1527", "915"); // Crawford at University
		allStops.put("1819", "916"); // College Ave. at Community Centre
		allStops.put("1823", "917"); // Matchette at Chappell
		allStops.put("1825", "918"); // Matchette at Carmichael
		allStops.put("1827", "919"); // Matchette at Broadway
		allStops.put("1829", "920"); // Matchette at Titcombe
		allStops.put("1833", "921"); // Marigold at Weaver
		allStops.put("1835", "922"); // Sprucewood at Matchette
		allStops.put("1836", "923"); // Sprucewood at Kingsley
		allStops.put("1838", "924"); // Sprucewood at Abbott
		allStops.put("1840", "925"); // Sprucewood at Woodmont
		allStops.put("1482", "926"); // Sprucewood at Newman
		allStops.put("1842", "927"); // Sprucewood at Malden
		allStops.put("1844", "928"); // Malden at Delmar
		allStops.put("1846", "929"); // Malden at Todd Lane
		allStops.put("1849", "930"); // Todd Lane at Elmdale
		allStops.put("1851", "931"); // Todd Lane at Wayne
		allStops.put("1853", "932"); // Todd Lane at Canada
		allStops.put("1499", "933"); // Todd Lane at Bishop
		allStops.put("1855", "934"); // Todd Lane at Ninth
		allStops.put("1856", "935"); // Todd Lane at Tenth
		allStops.put("1857", "936"); // Cabana at Northway
		allStops.put("1523", "937"); // Cabana at Borrelli
		allStops.put("1859", "938"); // Cabana at Southwinds
		allStops.put("1861", "939"); // Cabana at Roxborough
		allStops.put("1863", "940"); // Geraedts at St. Clair Residence
		allStops.put("1473", "941"); // Cabana at Casgrain
		allStops.put("1415", "942"); // Cabana at Granada
		allStops.put("1872", "943"); // Howard at Cabana
		allStops.put("1873", "944"); // Howard at Maguire
		allStops.put("1875", "945"); // Howard at Kenilworth
		allStops.put("1880", "946"); // Marentette at Foster
		allStops.put("1882", "947"); // Marentette at Division
		allStops.put("1883", "948"); // Provincial at Clarke
		allStops.put("1409", "949"); // Provincial at Cabana
		allStops.put("1884", "950"); // Provincial at Humane Society
		allStops.put("1885", "951"); // Provincial at Sixth Concession
		allStops.put("1886", "952"); // Provincial at Lone Pine
		allStops.put("1888", "953"); // Provincial at Monarch Basics
		allStops.put("1891", "954"); // Provincial at Legacy Park
		allStops.put("1893", "955"); // Legacy Park at Sears Home
		allStops.put("1892", "956"); // Division at Walker
		allStops.put("1537", "957"); // Division at Bliss
		allStops.put("1890", "958"); // Division at Woodward
		allStops.put("1889", "959"); // Division at Conservation Area
		allStops.put("1887", "960"); // Division at Clarke
		allStops.put("1876", "961"); // Howard at Kenilworth
		allStops.put("1874", "962"); // Howard at Maguire
		allStops.put("1871", "963"); // Cabana at Dougall
		allStops.put("1540", "964"); // Cabana at Granada
		allStops.put("1547", "965"); // Cabana at Casgrain
		allStops.put("1862", "966"); // Cabana at Geraedts
		allStops.put("1860", "967"); // Cabana at Randolph
		allStops.put("1638", "968"); // Cabana at Askin
		allStops.put("1858", "969"); // Cabana at Northway
		allStops.put("1627", "970"); // Todd Lane at Tenth
		allStops.put("1854", "971"); // Todd Lane at Ninth
		allStops.put("1624", "972"); // Todd Lane at Oxley
		allStops.put("1852", "973"); // Todd Lane at Canada
		allStops.put("1850", "974"); // Todd Lane at Fifth
		allStops.put("1848", "975"); // Todd Lane at Third
		allStops.put("1847", "976"); // Malden at Orford
		allStops.put("1845", "977"); // Malden at Delmar
		allStops.put("1843", "978"); // Sprucewood at Malden
		allStops.put("1575", "979"); // Sprucewood at Newman
		allStops.put("1841", "980"); // Sprucewood at Woodmont
		allStops.put("1839", "981"); // Sprucewood at Abbott
		allStops.put("1837", "982"); // Sprucewood at Kingsley
		allStops.put("1558", "983"); // Sprucewood at Matchette
		allStops.put("1830", "984"); // Matchette at Titcombe
		allStops.put("1828", "985"); // Matchette at Armanda
		allStops.put("1826", "986"); // Matchette at Carmichael
		allStops.put("1824", "987"); // Matchette at Chappell
		allStops.put("1822", "988"); // Prince at Vaughan
		allStops.put("1821", "989"); // Prince at Mulford
		allStops.put("1820", "990"); // Prince at Wells
		allStops.put("1663", "991"); // Windsor Transit Terminal
		allStops.put("1667", "992"); // Riverside at Oak
		allStops.put("1669", "993"); // Riverside at McKay
		allStops.put("1671", "994"); // Campbell at Riverside
		allStops.put("1673", "995"); // Campbell at University
		allStops.put("1305", "996"); // Campbell at Martindale
		allStops.put("1675", "997"); // Campbell at Wyandotte
		allStops.put("1677", "998"); // Campbell at Rooney
		allStops.put("1679", "999"); // Campbell at College
		allStops.put("1681", "1000"); // Campbell at Adanac
		allStops.put("1683", "1001"); // Campbell at Grove
		allStops.put("1685", "1002"); // Campbell at Taylor
		allStops.put("1687", "1003"); // Campbell at Pelletier
		allStops.put("1689", "1004"); // Campbell at Tecumseh
		allStops.put("1690", "1005"); // Campbell at Everts
		allStops.put("1692", "1006"); // Campbell at Curry
		allStops.put("1694", "1007"); // Dominion at Totten
		allStops.put("1696", "1008"); // Dominion at Arcadia
		allStops.put("1698", "1009"); // Dominion at McKay
		allStops.put("1700", "1010"); // Dominion at Ojibway
		allStops.put("1702", "1011"); // Dominion at Holy Names
		allStops.put("1703", "1012"); // Dominion at Northwood
		allStops.put("1706", "1013"); // Dominion at E.C. Row
		allStops.put("1708", "1014"); // Dominion at Labelle
		allStops.put("1711", "1015"); // Dominion at Grand Marais
		allStops.put("1713", "1016"); // Dominion at Norfolk
		allStops.put("1715", "1017"); // Dominion at Richardie
		allStops.put("1717", "1018"); // Dominion at Beals
		allStops.put("1719", "1019"); // Dominion at Roselawn
		allStops.put("1721", "1020"); // Dominion at Cabana
		allStops.put("1723", "1021"); // Mount Royal at Cabana
		allStops.put("1725", "1022"); // Mount Royal at Villa Maria North
		allStops.put("1726", "1023"); // Mount Royal at Villa Maria South
		allStops.put("1728", "1024"); // Mount Royal at Mitchell
		allStops.put("1730", "1025"); // Mount Royal at Cousineau
		allStops.put("1735", "1026"); // Glenwood at Cabana
		allStops.put("1246", "1027"); // Glenwood at St. Gabriel
		allStops.put("1733", "1028"); // Beals at Roxborough
		allStops.put("1731", "1029"); // Beals at Rankin
		allStops.put("1729", "1030"); // Rankin at Liberty
		allStops.put("1727", "1031"); // Norfolk at Rankin
		allStops.put("1724", "1032"); // Norfolk at California
		allStops.put("1722", "1033"); // California at Grand Marais
		allStops.put("1720", "1034"); // Grand Marais at Northway
		allStops.put("1718", "1035"); // Labelle at Northway
		allStops.put("1716", "1036"); // Labelle at California
		allStops.put("1714", "1037"); // Labelle at St. Patricks
		allStops.put("1710", "1038"); // Labelle at Orion
		allStops.put("1709", "1039"); // Labelle at Everts
		allStops.put("1707", "1040"); // Labelle at Dominion
		allStops.put("1705", "1041"); // Dominion at E.C. Row
		allStops.put("1704", "1042"); // Dominion at Northwood
		allStops.put("1701", "1043"); // Dominion at Holy Names
		allStops.put("1699", "1044"); // Dominion at Ojibway
		allStops.put("1697", "1045"); // Dominion at McKay
		allStops.put("1695", "1046"); // Dominion at Arcadia
		allStops.put("1693", "1047"); // Campbell at Totten
		allStops.put("1691", "1048"); // Campbell at Curry
		allStops.put("1154", "1049"); // Campbell at Mark
		allStops.put("1688", "1050"); // Campbell at Tecumseh
		allStops.put("1686", "1051"); // Campbell at Pelletier
		allStops.put("1684", "1052"); // Campbell at Taylor
		allStops.put("1682", "1053"); // Campbell at Grove
		allStops.put("1680", "1054"); // Campbell at Adanac
		allStops.put("1678", "1055"); // Campbell at College
		allStops.put("1676", "1056"); // Campbell at Rooney
		allStops.put("1674", "1057"); // Campbell at Wyandotte
		allStops.put("1381", "1058"); // Campbell at Martindale
		allStops.put("1672", "1059"); // Campbell at University
		allStops.put("1670", "1060"); // Campbell at Riverside
		allStops.put("1668", "1061"); // Riverside at McKay
		allStops.put("1666", "1062"); // Riverside at Oak
		allStops.put("1998", "1063"); // Tecumseh Mall Rear Entrance
		allStops.put("2007", "1064"); // Lauzon Rd. at Lilac
		allStops.put("1999", "1065"); // Lauzon at Vince
		allStops.put("2000", "1066"); // Lauzon at Forest Glade
		allStops.put("2001", "1067"); // Forest Glade at Meadowbrook
		allStops.put("2002", "1068"); // Anchor at Twin Oaks
		allStops.put("2003", "1069"); // Anchor at Green Shield
		allStops.put("2004", "1070"); // Anchor at CS Wind
		allStops.put("2006", "1071"); // Anchor at Jamison Entrance
		allStops.put("2005", "1072"); // Banwell at Wildwood
		allStops.put("2022", "1073"); // Banwell at Palmetto
		allStops.put("2024", "1074"); // Banwell at Tecumseh
		allStops.put("2028", "1075"); // McHugh at Questa
		allStops.put("2030", "1076"); // McHugh at Trappers
		allStops.put("2031", "1077"); // McHugh at Venetian
		allStops.put("2033", "1078"); // McHugh at Clover
		allStops.put("2034", "1079"); // McHugh at Cypress
		allStops.put("2039", "1080"); // WFCU Centre Main Entrance
		allStops.put("2041", "1081"); // McHugh at Darfield
		allStops.put("2043", "1082"); // Lauzon Rd. at McHugh
		allStops.put("2038", "1083"); // McHugh at Micky Renaud Way
		allStops.put("2050", "1084"); // McHugh at Lauzon
		allStops.put("2049", "1085"); // McHugh at Darfield
		allStops.put("2048", "1086"); // WFCU Centre Main Entrance
		allStops.put("2046", "1087"); // McHugh at Cypress
		allStops.put("2045", "1088"); // McHugh at Clover
		allStops.put("2042", "1089"); // Clover at Firgrove
		allStops.put("2040", "1090"); // Clover at Little River
		allStops.put("2037", "1091"); // Little River at Pearson
		allStops.put("2035", "1092"); // Little River at Chateau
		allStops.put("2032", "1093"); // Little River at Banwell
		allStops.put("2029", "1094"); // Little River at Jarvis
		allStops.put("2027", "1095"); // Cora Greenwood at Little River
		allStops.put("2025", "1096"); // Cora Green at Castle Hill
		allStops.put("2023", "1097"); // Cora Green at Dillon
		allStops.put("2021", "1098"); // Cora Green at Riverside
		allStops.put("2020", "1099"); // Riverside at Jarvis
		allStops.put("2019", "1100"); // Greenpark at Amalfi
		allStops.put("2018", "1101"); // Wyandotte at Greenpark
		allStops.put("2017", "1102"); // Wyandotte at Clover
		allStops.put("2016", "1103"); // Wyandotte at Florence
		allStops.put("2015", "1104"); // Wyandotte at Martinique
		allStops.put("2014", "1105"); // Wyandotte at Greendale
		allStops.put("2013", "1106"); // Wyandotte at Westchester
		allStops.put("2012", "1107"); // Wyandotte at Isack
		allStops.put("2011", "1108"); // Wyandotte at Riverside Plaza
		allStops.put("2010", "1109"); // Wyandotte at Watson
		allStops.put("2009", "1110"); // Lauzon Rd. at Wyandotte
		allStops.put("2008", "1111"); // Lauzon Road at St. Rose
		allStops.put("2047", "1112"); // McHugh at Mickey Renuad Way
		allStops.put("2140", "1113"); // St Clair Front Entrance
		allStops.put("2141", "1114"); // Montgomery at Surrey
		allStops.put("2142", "1115"); // Montgomery at Eastbourne
		allStops.put("2143", "1116"); // Heritage at Winfield
		allStops.put("2144", "1117"); // Heritage at Winfield
		allStops.put("2145", "1118"); // Heritage at Rushwood
		allStops.put("2146", "1119"); // Heritage at Rushwood
		allStops.put("2147", "1120"); // Heritage at Sandwich West
		allStops.put("2148", "1121"); // Sandwich West at Lovell
		allStops.put("2149", "1122"); // Sandwich West at Durocher
		allStops.put("2150", "1123"); // Sandwich West at D'Amore
		allStops.put("2151", "1124"); // Sandwich West at Mary
		allStops.put("2152", "1125"); // Sandwich West at Huron Church
		allStops.put("2153", "1126"); // Huron Church at Skinner
		allStops.put("2154", "1127"); // Huron Church at Cousineau
		allStops.put("2155", "1128"); // Normandy at Huron Church
		allStops.put("2156", "1129"); // Normandy at Twelfth
		allStops.put("2157", "1130"); // Normandy at Tenth
		allStops.put("2158", "1131"); // Normandy at Seventh
		allStops.put("2159", "1132"); // Ellis at Normandy
		allStops.put("2160", "1133"); // Delmar at Trinity
		allStops.put("2161", "1134"); // Malden at Normandy
		allStops.put("2162", "1135"); // Malden at Morton
		allStops.put("2163", "1136"); // Malden at Edgemore
		allStops.put("2164", "1137"); // Malden at Outram
		allStops.put("2165", "1138"); // Malden at Monty
		allStops.put("2166", "1139"); // Malden at Rosati
		allStops.put("2167", "1140"); // Malden at Bouffard
		allStops.put("2168", "1141"); // Vollmer Centre Front Entrance
		allStops.put("2169", "1142"); // Mike Raymond at Malden
		allStops.put("2170", "1143"); // Malden at Laurier
		allStops.put("2171", "1144"); // Malden at Bouffard
		allStops.put("2172", "1145"); // Malden at Rosati
		allStops.put("2173", "1146"); // Reaume at Malden
		allStops.put("2174", "1147"); // Reaume at Woodbridge
		allStops.put("2175", "1148"); // Reaume at Deerview
		allStops.put("2176", "1149"); // Reaume at Piruzza
		allStops.put("2177", "1150"); // Reaume at Matchette
		allStops.put("2178", "1151"); // Matchette at Monty
		allStops.put("2179", "1152"); // Matchette at Minto
		allStops.put("2180", "1153"); // Morton at Matchette
		allStops.put("2181", "1154"); // Morton at Quick
		allStops.put("2182", "1155"); // Morton at Wales
		allStops.put("2183", "1156"); // Morton at Ramblewood
		allStops.put("2184", "1157"); // Morton at Ramblewood
		allStops.put("2185", "1158"); // Morton at Ojibway
		allStops.put("2186", "1159"); // Front at River
		allStops.put("2187", "1160"); // Front at Antaya
		allStops.put("2188", "1161"); // Front at Reaume
		allStops.put("2189", "1162"); // Front at Riverview
		allStops.put("2190", "1163"); // Front at Bouffard
		allStops.put("2191", "1164"); // Front at Huron
		allStops.put("2192", "1165"); // Front at Laurier
		allStops.put("2193", "1166"); // Front at Adams
		allStops.put("2194", "1167"); // Front at Boismier
		allStops.put("2195", "1168"); // International at Front
		allStops.put("2196", "1169"); // Michigan at International
		allStops.put("2197", "1170"); // Michigan at Fields
		allStops.put("2198", "1171"); // Michigan at Delaware
		allStops.put("2199", "1172"); // Michigan at Laurier
		allStops.put("2200", "1173"); // Laurier at Hazel
		allStops.put("2201", "1174"); // Laurier at Alfred
		allStops.put("2202", "1175"); // Laurier at Mayfair
		allStops.put("2203", "1176"); // Laurier at Marquette
		allStops.put("2204", "1177"); // Laurier at Matchette
		allStops.put("2205", "1178"); // Laurier at First
		allStops.put("2206", "1179"); // Laurier at Selkirk
		allStops.put("2207", "1180"); // Laurier at Tacoma
		allStops.put("2208", "1181"); // Laurier at Malden
		allStops.put("2209", "1182"); // Malden at Reaume
		allStops.put("2210", "1183"); // Malden at Valiant
		allStops.put("2211", "1184"); // Malden at Stuart
		allStops.put("2212", "1185"); // Malden at Edgemore
		allStops.put("2213", "1186"); // Malden at Grillo
		allStops.put("2214", "1187"); // Malden at Normandy
		allStops.put("2215", "1188"); // Delmar at Trinity
		allStops.put("2216", "1189"); // Ellis at Normandy
		allStops.put("2217", "1190"); // Normandy at Seventh
		allStops.put("2218", "1191"); // Normandy at Tenth
		allStops.put("2219", "1192"); // Normandy at Thirteenth
		allStops.put("2220", "1193"); // Normandy at Huron Church
		allStops.put("2221", "1194"); // Huron Church at Disputed
		allStops.put("2222", "1195"); // Huron Church at Skinner
		allStops.put("2223", "1196"); // Sandwich West at Huron Church
		allStops.put("2224", "1197"); // Sandwich West at Mary
		allStops.put("2225", "1198"); // Sandwich West at D'Amore
		allStops.put("2226", "1199"); // Sandwich West at Durocher
		allStops.put("2227", "1200"); // Sandwich West at Lovell
		allStops.put("2228", "1201"); // Heritage at Sandwich West
		allStops.put("2229", "1202"); // Heritage at Rushwood
		allStops.put("2230", "1203"); // Heritage at Rushwood
		allStops.put("2231", "1204"); // Heritage at Blackthorn
		allStops.put("2232", "1205"); // Heritage at Sixth Concession
		allStops.put("2233", "1206"); // Sixth Concession at Montgomery
		ALL_STOPS = allStops;
	}
}
