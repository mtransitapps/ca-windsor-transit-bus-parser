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
		allStops.put("1126", "137"); // Tecumseh at Factoria
		allStops.put("1124", "138"); // Tecumseh at Turner
		allStops.put("1122", "139"); // Tecumseh at Durham
		allStops.put("1120", "140"); // Tecumseh at Kildare
		allStops.put("1118", "141"); // Tecumseh at Lincoln
		allStops.put("1114", "142"); // Tecumseh at Hall
		allStops.put("1112", "143"); // Tecumseh at Benjamin
		allStops.put("1110", "144"); // Tecumseh at Parent
		allStops.put("1107", "145"); // Tecumseh a Windsor Health Centre
		allStops.put("1105", "146"); // Tecumseh at Howard
		allStops.put("1104", "147"); // University at Ouellette
		allStops.put("1102", "148"); // Transit Terminal at Chatham
		allStops.put("1099", "149"); // University at Bruce
		allStops.put("1097", "150"); // University at Caron
		allStops.put("1095", "151"); // University at Crawford
		allStops.put("1093", "152"); // University at Elm
		allStops.put("1091", "153"); // University at Cameron
		allStops.put("1090", "154"); // University at Curry
		allStops.put("1088", "155"); // University at Campbell
		allStops.put("1086", "156"); // University at Bridge
		allStops.put("1084", "157"); // University at Randolph
		allStops.put("1083", "158"); // University at Askin
		allStops.put("1081", "159"); // University at Patricia
		allStops.put("1079", "160"); // University at Huron Church
		allStops.put("1077", "161"); // Riverside at Rosedale
		allStops.put("1074", "162"); // Sandwich at Detroit
		allStops.put("1072", "163"); // Mill at Sandwich
		allStops.put("1070", "164"); // Mill at Wyandotte
		allStops.put("1068", "165"); // Felix at Linwood
		allStops.put("1066", "166"); // College at Felix
		allStops.put("1205", "167"); // Forest Glade at Elmwood
		allStops.put("1204", "168"); // Wildwood at Rosebriar
		allStops.put("1202", "169"); // Wildwood at Hemlock
		allStops.put("1201", "170"); // Wildwood at Midfield
		allStops.put("1200", "171"); // Wildwood at Forest Glade
		allStops.put("1199", "172"); // Wildwood at Beachdale
		allStops.put("1198", "173"); // Wildwood at Apple
		allStops.put("1196", "174"); // Wildwood at Forest Glade
		allStops.put("1194", "175"); // Forest Glade at Ridge
		allStops.put("1192", "176"); // Forest Glade at Eastcourt
		allStops.put("1190", "177"); // Forest Glade at Tecumseh
		allStops.put("1188", "178"); // Tecumseh at Forest Glade
		allStops.put("1186", "179"); // Tecumseh at Penang
		allStops.put("1184", "180"); // Tecumseh at Rafih
		allStops.put("1182", "181"); // Tecumseh at Food Basics
		allStops.put("1180", "182"); // Tecumseh at Lauzon
		allStops.put("1178", "183"); // Tecumseh at Annie
		allStops.put("1176", "184"); // Tecumseh at Lauzon Parkway
		allStops.put("1174", "185"); // Tecumseh Mall Rear Entrance
		allStops.put("1172", "186"); // Tecumseh at Walmart
		allStops.put("1170", "187"); // Roseville at Tecumseh
		allStops.put("1168", "188"); // Roseville at Charlie Brooks
		allStops.put("1166", "189"); // Roseville at Thornberry
		allStops.put("1164", "190"); // Roseville at Thornberry
		allStops.put("1162", "191"); // Rose at Jefferson
		allStops.put("1160", "192"); // Rose at Clemenceau
		allStops.put("1158", "193"); // Rose at Rivard
		allStops.put("1155", "194"); // Rivard at Adstoll
		allStops.put("2139", "195"); // Rivard at Tecumseh
		allStops.put("1151", "196"); // Tecumseh at Ford
		allStops.put("1149", "197"); // Tecumseh at Buckingham
		allStops.put("1147", "198"); // Tecumseh at Westminster
		allStops.put("1145", "199"); // Tecumseh at Norman
		allStops.put("1143", "200"); // Tecumseh at Pillette
		allStops.put("1141", "201"); // Tecumseh at Ellrose
		allStops.put("1203", "202"); // Tecumseh at Francois
		allStops.put("1140", "203"); // Tecumseh at Rossini
		allStops.put("1138", "204"); // Tecumseh at George
		allStops.put("1136", "205"); // Tecumseh at Westcott
		allStops.put("1133", "206"); // Tecumseh at Central
		allStops.put("1131", "207"); // Tecumseh at Meldrum
		allStops.put("1129", "208"); // Tecumseh at Chandler
		allStops.put("1127", "209"); // Tecumseh at Hickory
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
		allStops.put("1312", "239"); // Wyandotte at Janisse
		allStops.put("1309", "240"); // Wyandotte at Homedale
		allStops.put("1310", "241"); // Wyandotte at Patrice
		allStops.put("1307", "242"); // Wyandotte at Jefferson
		allStops.put("1304", "243"); // Wyandotte at Reedmere
		allStops.put("1302", "244"); // Wyandotte at Villaire
		allStops.put("1299", "245"); // Wyandotte at Ford
		allStops.put("1297", "246"); // Wyandotte at Westminster
		allStops.put("1295", "247"); // Wyandotte at Dawson
		allStops.put("1293", "248"); // Wyandotte at Pillette
		allStops.put("1291", "249"); // Wyandotte at Jos. Janisse
		allStops.put("1289", "250"); // Wyandotte at Rossini
		allStops.put("1287", "251"); // Wyandotte at George
		allStops.put("1285", "252"); // Wyandotte at Sterling
		allStops.put("1283", "253"); // Wyandotte at Strabane
		allStops.put("1281", "254"); // Wyandotte at Belleview
		allStops.put("1279", "255"); // Wyandotte at Drouillard
		allStops.put("1277", "256"); // Wyandotte at St. Luke
		allStops.put("1275", "257"); // Wyandotte at Walker
		allStops.put("1272", "258"); // Wyandotte at Devonshire
		allStops.put("1271", "259"); // Wyandotte at Chilver
		allStops.put("1268", "260"); // Wyandotte at Gladstone
		allStops.put("1266", "261"); // Wyandotte at Hall
		allStops.put("1264", "262"); // Wyandotte at Langlois
		allStops.put("1260", "263"); // Wyandotte at Marentette
		allStops.put("1259", "264"); // Wyandotte at Louis
		allStops.put("1256", "265"); // Wyandotte at Glengarry
		allStops.put("1254", "266"); // Wyandotte at McDougall
		allStops.put("1252", "267"); // Wyandotte at Goyeau
		allStops.put("1249", "268"); // Wyandotte at Ouellette
		allStops.put("1247", "269"); // Wyandotte at Victoria
		allStops.put("1244", "270"); // Wyandotte at Bruce
		allStops.put("1242", "271"); // Wyandotte at Janette
		allStops.put("1240", "272"); // Wyandotte at Crawford
		allStops.put("1238", "273"); // Wyandotte at Wellington
		allStops.put("1236", "274"); // Wyandotte at McKay
		allStops.put("1234", "275"); // Wyandotte at Campbell
		allStops.put("1232", "276"); // Wyandotte at Bridge
		allStops.put("1230", "277"); // Wyandotte at Randolph
		allStops.put("1229", "278"); // Wyandotte at California
		allStops.put("1227", "279"); // Wyandotte at Patricia
		allStops.put("1223", "280"); // Wyandotte at Rosedale
		allStops.put("1221", "281"); // Wyandotte at Mill
		allStops.put("1220", "282"); // Mill at Peter
		allStops.put("1218", "283"); // Sandwich at Brock
		allStops.put("1216", "284"); // Sandwich at Chippawa
		allStops.put("1214", "285"); // Sandwich at South
		allStops.put("1212", "286"); // Sandwich at Watkins
		allStops.put("1210", "287"); // Prince at Peter
		allStops.put("1209", "288"); // Prince at King
		allStops.put("1208", "289"); // College at Prince
		allStops.put("1207", "290"); // College at South
		allStops.put("1206", "291"); // College Ave. at Community Centre
		allStops.put("1116", "292"); // Prince at King
		allStops.put("1211", "293"); // Prince at Peter
		allStops.put("1213", "294"); // Sandwich at Watkins
		allStops.put("1215", "295"); // Sandwich at South
		allStops.put("1217", "296"); // Sandwich at Chippawa
		allStops.put("1219", "297"); // Sandwich at Brock
		allStops.put("1222", "298"); // Wyandotte at Mill
		allStops.put("1224", "299"); // Wyandotte at Rosedale
		allStops.put("1226", "300"); // Wyandotte at Huron Church
		allStops.put("1228", "301"); // Wyandotte at Sunset
		allStops.put("1231", "302"); // Wyandotte at Randolph
		allStops.put("1233", "303"); // Wyandotte at Bridge
		allStops.put("1235", "304"); // Wyandotte at Campbell
		allStops.put("1237", "305"); // Wyandotte at McKay
		allStops.put("1239", "306"); // Wyandotte at Wellington
		allStops.put("1241", "307"); // Wyandotte at Crawford
		allStops.put("1243", "308"); // Wyandotte at Caron
		allStops.put("1245", "309"); // Wyandotte at Bruce
		allStops.put("1248", "310"); // Wyandotte at Victoria
		allStops.put("1250", "311"); // Wyandotte at Ouellette
		allStops.put("1251", "312"); // Wyandotte at Dufferin
		allStops.put("1253", "313"); // Wyandotte at Windsor
		allStops.put("1255", "314"); // Wyandotte at McDougall
		allStops.put("1257", "315"); // Wyandotte at Glengarry
		allStops.put("1258", "316"); // Wyandotte at Aylmer
		allStops.put("1261", "317"); // Wyandotte at Marentette
		allStops.put("1263", "318"); // Wyandotte at Parent
		allStops.put("1265", "319"); // Wyandotte at Marion
		allStops.put("1267", "320"); // Wyandotte at Hall
		allStops.put("1269", "321"); // Wyandotte at Gladstone
		allStops.put("1270", "322"); // Wyandotte at Lincoln
		allStops.put("1273", "323"); // Wyandotte at Devonshire
		allStops.put("1274", "324"); // Wyandotte at Monmouth
		allStops.put("1276", "325"); // Wyandotte at Walker
		allStops.put("1278", "326"); // Wyandotte at Albert
		allStops.put("1280", "327"); // Wyandotte at Drouillard
		allStops.put("1282", "328"); // Wyandotte at Belleview
		allStops.put("1284", "329"); // Wyandotte at Strabane
		allStops.put("1286", "330"); // Wyandotte at Sterling
		allStops.put("1288", "331"); // Wyandotte at George
		allStops.put("1290", "332"); // Wyandotte at Rossini
		allStops.put("1292", "333"); // Wyandotte at Jos. Janisse
		allStops.put("1294", "334"); // Wyandotte at Pillette
		allStops.put("1296", "335"); // Wyandotte at Raymo
		allStops.put("1298", "336"); // Wyandotte at Westminster
		allStops.put("1300", "337"); // Wyandotte at Ford
		allStops.put("1301", "338"); // Wyandotte at Prado
		allStops.put("1303", "339"); // Wyandotte at St. Louis
		allStops.put("1306", "340"); // Wyandotte at Jefferson
		allStops.put("1308", "341"); // Wyandotte at Victor
		allStops.put("1311", "342"); // Wyandotte at St. Marys
		allStops.put("1315", "343"); // Wyandotte at St. Rose
		allStops.put("1317", "344"); // Wyandotte at Edward
		allStops.put("1318", "345"); // Wyandotte at Fairview
		allStops.put("1320", "346"); // Wyandotte at Matthew Brady
		allStops.put("1324", "347"); // Lauzon at Wyandotte
		allStops.put("1326", "348"); // Lauzon at Cedarview
		allStops.put("1328", "349"); // Lauzon at Clairview
		allStops.put("1330", "350"); // Lauzon at Riverside
		allStops.put("1333", "351"); // Riverside at Watson
		allStops.put("1337", "352"); // Riverside at Bayview Towers
		allStops.put("1339", "353"); // Riverside at St Clair Towers
		allStops.put("1341", "354"); // Riverside at Island View Towers
		allStops.put("1343", "355"); // Riverside at Westchester
		allStops.put("1345", "356"); // Riverdale at Cedarview
		allStops.put("1347", "357"); // Riverdale at Menard
		allStops.put("1349", "358"); // Riverdale at Wyandotte
		allStops.put("1351", "359"); // Riverdale at Jerome
		allStops.put("1353", "360"); // Riverdale at St. Rose
		allStops.put("1356", "361"); // Little River Acres at Abbey
		allStops.put("1358", "362"); // Little River Acres at Aire
		allStops.put("1360", "363"); // Little RiverAcres at Copperfield
		allStops.put("1362", "364"); // Little River Acres at East Moor
		allStops.put("1364", "365"); // Little RiverAcres at LittleRiver
		allStops.put("1365", "366"); // Little River at Laporte
		allStops.put("1366", "367"); // Lauzon Road at Edgar
		allStops.put("1367", "368"); // Lauzon Rd. at ABC Day Nursery
		allStops.put("1369", "369"); // Lauzon at Tranby
		allStops.put("1371", "370"); // Lauzon Parkway at Lauzon Line
		allStops.put("1373", "371"); // Lauzon Parkway at VIA Tracks
		allStops.put("1376", "372"); // College Ave. at Community Centre
		allStops.put("1377", "373"); // South at College
		allStops.put("1378", "374"); // South at Wells
		allStops.put("1379", "375"); // Girardot at South
		allStops.put("1380", "376"); // Girardot at Strathmore
		allStops.put("1383", "377"); // Connaught at Chappell
		allStops.put("1386", "378"); // Sun Valley at Greenview
		allStops.put("1388", "379"); // Sun Valley at Malden
		allStops.put("1389", "380"); // Brunet at Industrial
		allStops.put("1391", "381"); // Industrial at Ambassador
		allStops.put("1392", "382"); // Ambassador at Urgent Care
		allStops.put("1393", "383"); // Ambassador at Malden
		allStops.put("1394", "384"); // Daytona at Malden
		allStops.put("1395", "385"); // Daytona at Totten
		allStops.put("1397", "386"); // Northway at Algonquin
		allStops.put("1399", "387"); // Tecumseh at Northway
		allStops.put("1401", "388"); // Tecumseh at California
		allStops.put("1403", "389"); // Tecumseh at Randolph
		allStops.put("1405", "390"); // Tecumseh at Bridge
		allStops.put("1408", "391"); // Tecumseh at Campbell
		allStops.put("1410", "392"); // Tecumseh at Curry
		allStops.put("1413", "393"); // Crawford at Tecumseh
		allStops.put("1416", "394"); // Crawford at Grove
		allStops.put("1418", "395"); // Crawford at Erie
		allStops.put("1420", "396"); // Crawford at College
		allStops.put("1422", "397"); // Crawford at Elliott
		allStops.put("1425", "398"); // Crawford at Wyandotte
		allStops.put("1429", "399"); // Erie at Ouellette
		allStops.put("1430", "400"); // Erie at Goyeau
		allStops.put("1431", "401"); // Erie at McDougall
		allStops.put("1435", "402"); // Erie at Howard
		allStops.put("1437", "403"); // Erie at Louis
		allStops.put("1438", "404"); // Erie at Elsmere
		allStops.put("1441", "405"); // Erie at Marion
		allStops.put("1444", "406"); // Erie at Hall
		allStops.put("1914", "407"); // Gladstone at Erie
		allStops.put("1447", "408"); // Richmond at Lincoln
		allStops.put("1449", "409"); // Richmond at Kildare
		allStops.put("1451", "410"); // Richmond at Argyle
		allStops.put("1452", "411"); // Richmond at Walker
		allStops.put("1455", "412"); // Richmond at St. Luke
		allStops.put("1457", "413"); // Richmond at Drouillard
		allStops.put("1459", "414"); // Drouillard at Ontario
		allStops.put("1461", "415"); // Drouillard at Franklin
		allStops.put("1322", "416"); // Drouillard at Metcalfe
		allStops.put("1464", "417"); // Drouillard at Seminole
		allStops.put("1466", "418"); // Drouillard at Reginald
		allStops.put("1468", "419"); // Drouillard at Alice
		allStops.put("1470", "420"); // Drouillard at Milloy
		allStops.put("1472", "421"); // Drouillard at Tecumseh
		allStops.put("1474", "422"); // George at Tecumseh
		allStops.put("1331", "423"); // George at Guy
		allStops.put("1476", "424"); // George at Milloy
		allStops.put("1478", "425"); // George at Alice
		allStops.put("1480", "426"); // George at Reginald
		allStops.put("1572", "427"); // Seminole at George
		allStops.put("1574", "428"); // Seminole at Rossini
		allStops.put("1577", "429"); // Seminole at Francois
		allStops.put("1483", "430"); // Seminole at Pillette
		allStops.put("1485", "431"); // Pillette at Reginald
		allStops.put("1487", "432"); // Pillette at Alice
		allStops.put("1489", "433"); // Pillette at Milloy
		allStops.put("1491", "434"); // Pillette at Guy
		allStops.put("1493", "435"); // Pillette at Tecumseh
		allStops.put("1495", "436"); // Pillette at Adstoll
		allStops.put("1497", "437"); // Pillette at Grand Marais
		allStops.put("1501", "438"); // Pillette at Plymouth
		allStops.put("1503", "439"); // Plymouth at Robert
		allStops.put("1505", "440"); // Plymouth at Tourangeau
		allStops.put("1506", "441"); // Plymouth at Grand Marais
		allStops.put("1507", "442"); // Central at Temple
		allStops.put("1508", "443"); // Mannheim at Deziel
		allStops.put("1509", "444"); // St. Etienne at Kautex
		allStops.put("1510", "445"); // Kautex at Deziel
		allStops.put("1511", "446"); // Deziel at Mannheim
		allStops.put("1512", "447"); // Deziel at Central
		allStops.put("1513", "448"); // Rhodes at Wheelton
		allStops.put("1514", "449"); // Rhodes at Electricity
		allStops.put("1515", "450"); // Rhodes at Jamieson
		allStops.put("1516", "451"); // Rhodes at Enwin
		allStops.put("1517", "452"); // Rhodes at Pillette
		allStops.put("1518", "453"); // Rhodes at Fuller Construction
		allStops.put("1335", "454"); // Rhodes at Jefferson
		allStops.put("1357", "455"); // Jefferson at E.C. Row
		allStops.put("1519", "456"); // North Service at Jefferson
		allStops.put("1520", "457"); // North Service at Clemenceau
		allStops.put("1521", "458"); // North Service at Tracks
		allStops.put("1522", "459"); // North Service Road at Pillette
		allStops.put("1332", "460"); // Service Road at Electrical Union
		allStops.put("1524", "461"); // Transit Centre Front Entrance
		allStops.put("1504", "462"); // N. Service at Central
		allStops.put("1502", "463"); // Grand Marais at Allyson
		allStops.put("1500", "464"); // Grand Marais at Tourangeau
		allStops.put("1498", "465"); // Grand Marais at Bernard
		allStops.put("1496", "466"); // Grand Marais at Pillette
		allStops.put("1494", "467"); // Pillette at Adstoll
		allStops.put("1492", "468"); // Pillette at Tecumseh
		allStops.put("1490", "469"); // Pillette at Guy
		allStops.put("1488", "470"); // Pillette at Milloy
		allStops.put("1486", "471"); // Pillette at Alice
		allStops.put("1484", "472"); // Pillette at Reginald
		allStops.put("1580", "473"); // Seminole at Pillette
		allStops.put("1578", "474"); // Seminole at Ellrose
		allStops.put("1576", "475"); // Seminole at Bernard
		allStops.put("1481", "476"); // George at Seminole
		allStops.put("1479", "477"); // George at Reginald
		allStops.put("1477", "478"); // George at Alice
		allStops.put("1475", "479"); // George at Milloy
		allStops.put("1313", "480"); // George at Guy
		allStops.put("1471", "481"); // Hickory at Tecumseh
		allStops.put("1469", "482"); // Hickory at Milloy
		allStops.put("1467", "483"); // Drouillard at Alice
		allStops.put("1465", "484"); // Drouillard at Reginald
		allStops.put("1463", "485"); // Drouillard at Seminole
		allStops.put("1462", "486"); // Drouillard at Metcalfe
		allStops.put("1460", "487"); // Drouillard at Franklin
		allStops.put("1458", "488"); // Drouillard at Ontario
		allStops.put("1456", "489"); // Richmond at Drouillard
		allStops.put("1454", "490"); // Richmond at St. Luke
		allStops.put("1453", "491"); // Richmond at Walker
		allStops.put("1450", "492"); // Richmond at Monmouth
		allStops.put("1448", "493"); // Richmond at Chilver
		allStops.put("1446", "494"); // Richmond at Lincoln
		allStops.put("1445", "495"); // Erie at Lincoln
		allStops.put("1443", "496"); // Erie at Moy
		allStops.put("1442", "497"); // Erie at Marion
		allStops.put("1440", "498"); // Erie at Elsmere
		allStops.put("1436", "499"); // Erie at Louis
		allStops.put("1434", "500"); // Erie at Howard
		allStops.put("1432", "501"); // Erie at McDougall
		allStops.put("1426", "502"); // Erie at Goyeau
		allStops.put("1428", "503"); // Erie at Ouellette
		allStops.put("1424", "504"); // Crawford at Wyandotte
		allStops.put("1423", "505"); // Crawford at Elliott
		allStops.put("1421", "506"); // Crawford at College
		allStops.put("1419", "507"); // Crawford at Erie
		allStops.put("1417", "508"); // Crawford at Grove
		allStops.put("1414", "509"); // Crawford at Tecumseh
		allStops.put("1412", "510"); // Tecumseh at Crawford
		allStops.put("1411", "511"); // Tecumseh at McKay
		allStops.put("1407", "512"); // Tecumseh at Campbell
		allStops.put("1406", "513"); // Tecumseh at Bridge
		allStops.put("1404", "514"); // Tecumseh at Randolph
		allStops.put("1402", "515"); // Tecumseh at California
		allStops.put("1400", "516"); // Tecumseh at Northway
		allStops.put("1398", "517"); // Tecumseh at Huron Church
		allStops.put("1396", "518"); // Tecumseh at Felix
		allStops.put("2051", "519"); // Transit Terminal at Chatham
		allStops.put("1656", "520"); // Essex Way at Meadowbrook
		allStops.put("1660", "521"); // Cantelon at Kew
		allStops.put("1659", "522"); // Cantelon at Lauzon Parkway
		allStops.put("1658", "523"); // Forest Glade at Lauzon Parkway
		allStops.put("1657", "524"); // Forest Glade at Lauzon
		allStops.put("1655", "525"); // Beachdale at Chestnut
		allStops.put("1653", "526"); // Esplanade at Beachdale
		allStops.put("1651", "527"); // Esplanade at Ridge
		allStops.put("1649", "528"); // Esplanade at Lilac
		allStops.put("1647", "529"); // Lilac at Lauzon
		allStops.put("1645", "530"); // Lauzon Road at Hawthorne
		allStops.put("1643", "531"); // Lauzon Road at Yolanda
		allStops.put("1639", "532"); // Clemenceau at Rose
		allStops.put("1637", "533"); // Clemenceau at Joinville
		allStops.put("1635", "534"); // Clemenceau at Haig
		allStops.put("1633", "535"); // Clemenceau at Grand
		allStops.put("1631", "536"); // Clemenceau at Roosevelt
		allStops.put("1629", "537"); // Queen Elizabeth at Clemenceau
		allStops.put("1626", "538"); // Queen Elizabeth at Grandview
		allStops.put("1623", "539"); // Queen Elizabeth at Clarence
		allStops.put("1621", "540"); // Rivard at Queen Elizabeth
		allStops.put("1619", "541"); // Rivard at Library
		allStops.put("1617", "542"); // Rivard at Grand
		allStops.put("1615", "543"); // Rivard at Haig
		allStops.put("1613", "544"); // Rivard at Joinville
		allStops.put("1611", "545"); // Rivard at Rose
		allStops.put("1609", "546"); // Ford at Empress
		allStops.put("1607", "547"); // Ford at Coronation
		allStops.put("1605", "548"); // Ford at Lassaline
		allStops.put("1603", "549"); // Ford at Reginald
		allStops.put("1601", "550"); // South National at Ford
		allStops.put("1599", "551"); // South National at Ferndale
		allStops.put("1597", "552"); // South National at Balfour
		allStops.put("1595", "553"); // Jefferson at South National
		allStops.put("1593", "554"); // Jefferson at Edgar
		allStops.put("1591", "555"); // Jefferson at Raymond
		allStops.put("1589", "556"); // Jefferson at Ontario
		allStops.put("1588", "557"); // Pillette at Wyandotte
		allStops.put("1586", "558"); // Pillette at Ontario
		allStops.put("1584", "559"); // Pillette at South National
		allStops.put("1582", "560"); // Pillette at Metcalfe
		allStops.put("1573", "561"); // Seminole at George
		allStops.put("1570", "562"); // Seminole at Central
		allStops.put("1568", "563"); // Seminole at Chandler
		allStops.put("1566", "564"); // Seminole at Drouillard
		allStops.put("1564", "565"); // Seminole at Albert
		allStops.put("1562", "566"); // Seminole at Walker
		allStops.put("1560", "567"); // Ottawa at Monmouth
		allStops.put("1557", "568"); // Ottawa at Kildare
		allStops.put("1555", "569"); // Ottawa at Lincoln
		allStops.put("1552", "570"); // Ottawa at Gladstone
		allStops.put("1550", "571"); // Ottawa at Hall
		allStops.put("1548", "572"); // Ottawa at Benjamin
		allStops.put("1545", "573"); // Parent at Ottawa
		allStops.put("1543", "574"); // Giles at Elsmere
		allStops.put("1541", "575"); // Giles at Louis
		allStops.put("1539", "576"); // Giles at Howard
		allStops.put("1536", "577"); // Giles at McDougall
		allStops.put("1534", "578"); // Giles at Windsor
		allStops.put("1532", "579"); // Giles at Ouellette
		allStops.put("1529", "580"); // Transit Windsor Terminal
		allStops.put("1531", "581"); // Giles at Ouellette
		allStops.put("1533", "582"); // Giles at Goyeau
		allStops.put("1535", "583"); // Giles at McDougall
		allStops.put("1538", "584"); // Giles at Howard
		allStops.put("1542", "585"); // Giles at Marentette
		allStops.put("1544", "586"); // Giles at Parent
		allStops.put("1546", "587"); // Ottawa at Parent
		allStops.put("1549", "588"); // Ottawa at Pierre
		allStops.put("1551", "589"); // Ottawa at Moy
		allStops.put("1553", "590"); // Ottawa at Gladstone
		allStops.put("1554", "591"); // Ottawa at Lincoln
		allStops.put("1556", "592"); // Ottawa at Kildare
		allStops.put("1559", "593"); // Ottawa at Walker
		allStops.put("1561", "594"); // Seminole at Walker
		allStops.put("1563", "595"); // Seminole at Albert
		allStops.put("1565", "596"); // Seminole at Drouillard
		allStops.put("1567", "597"); // Seminole at Chandler
		allStops.put("1569", "598"); // Seminole at Central
		allStops.put("1571", "599"); // Seminole at Westcott
		allStops.put("1579", "600"); // Pillette at Seminole
		allStops.put("1581", "601"); // Pillette at Metcalfe
		allStops.put("1583", "602"); // Pillette at South National
		allStops.put("1585", "603"); // Pillette at Ontario
		allStops.put("1587", "604"); // Pillette at Wyandotte
		allStops.put("1590", "605"); // Jefferson at Ontario
		allStops.put("1592", "606"); // Jefferson at Raymond
		allStops.put("1594", "607"); // Jefferson at Edgar
		allStops.put("1596", "608"); // South National at Jefferson
		allStops.put("1598", "609"); // South National at Balfour
		allStops.put("1600", "610"); // South National at Ferndale
		allStops.put("1602", "611"); // South National at Ford
		allStops.put("1604", "612"); // Ford at Reginald
		allStops.put("1606", "613"); // Ford at Lassaline
		allStops.put("1608", "614"); // Ford at Coronation
		allStops.put("1610", "615"); // Ford at Empress
		allStops.put("1612", "616"); // Rivard at Joinville
		allStops.put("1614", "617"); // Rivard at Haig
		allStops.put("1616", "618"); // Rivard at Grand
		allStops.put("1618", "619"); // Rivard at Ambassador Church
		allStops.put("1620", "620"); // Rivard at Queen Elizabeth
		allStops.put("1622", "621"); // Queen Elizabeth at Clarence
		allStops.put("1625", "622"); // Queen Elizabeth at Harmony
		allStops.put("1628", "623"); // Queen Elizabeth at Clemenceau
		allStops.put("1630", "624"); // Clemenceau at Roosevelt
		allStops.put("1632", "625"); // Clemenceau at Grand
		allStops.put("1634", "626"); // Clemenceau at Haig
		allStops.put("1636", "627"); // Clemenceau at Joinville
		allStops.put("1159", "628"); // Rose at Clemenceau
		allStops.put("1642", "629"); // Lauzon Rd. at Yolanda
		allStops.put("1644", "630"); // Lauzon Rd. at Hawthorne
		allStops.put("1646", "631"); // Hawthorne at Sycamore
		allStops.put("1648", "632"); // Meadowbrook at Hawthorne
		allStops.put("1650", "633"); // Meadowbrook at Parkside Estates
		allStops.put("1652", "634"); // Meadowbrook at Optimist Park
		allStops.put("1654", "635"); // Meadowbrook at Essex Way
		allStops.put("1662", "636"); // Walker at Ontario
		allStops.put("2064", "637"); // Parent at Giles
		allStops.put("2063", "638"); // Giles at Parent
		allStops.put("1661", "639"); // Walker at Ontario
		allStops.put("1734", "640"); // St. Clair College Front Entrance
		allStops.put("1817", "641"); // Cousineau at Cousineau Circle
		allStops.put("1816", "642"); // Cousineau at Mount Royal
		allStops.put("1814", "643"); // Cousineau at Casgrain
		allStops.put("1813", "644"); // Cousineau at Country Club
		allStops.put("1809", "645"); // Country Club at Hunt Club
		allStops.put("1807", "646"); // Country Club at Shade Tree
		allStops.put("1804", "647"); // Country Club at Lake Trail
		allStops.put("1800", "648"); // Howard at North Talbot
		allStops.put("1799", "649"); // Howard at Wallace
		allStops.put("1797", "650"); // Howard at Ducharme
		allStops.put("1794", "651"); // Howard at Morand
		allStops.put("1792", "652"); // Cabana at Howard
		allStops.put("1791", "653"); // Cabana at Huntington
		allStops.put("1788", "654"); // Cabana at Dougall
		allStops.put("1786", "655"); // Dougall at Granada
		allStops.put("1784", "656"); // Dougall at Medina
		allStops.put("1782", "657"); // Dougall at Beals
		allStops.put("1387", "658"); // Dougall at Liberty
		allStops.put("1780", "659"); // Dougall at Norfolk
		allStops.put("1777", "660"); // Dougall at Nottingham Walmart
		allStops.put("1390", "661"); // Dougall Town Centre
		allStops.put("1775", "662"); // Dougall at West Grand
		allStops.put("1773", "663"); // Dougall at South Cameron
		allStops.put("1771", "664"); // Eugenie at Dougall
		allStops.put("1769", "665"); // Dougall at Rose Bowl
		allStops.put("1767", "666"); // Dougall at Dougall Square
		allStops.put("1763", "667"); // Dougall at Brentwood
		allStops.put("1761", "668"); // Dougall at Wear
		allStops.put("1759", "669"); // Tecumseh at York
		allStops.put("1757", "670"); // Bruce at Hanna
		allStops.put("1753", "671"); // Bruce at Shepherd
		allStops.put("1751", "672"); // Bruce at Clinton
		allStops.put("1749", "673"); // Bruce at Giles
		allStops.put("1747", "674"); // Bruce at Pine
		allStops.put("1745", "675"); // Bruce at Erie
		allStops.put("1433", "676"); // Bruce at Caroline
		allStops.put("1743", "677"); // Bruce at Elliott
		allStops.put("1742", "678"); // Bruce at Wyandotte
		allStops.put("1740", "679"); // Bruce at Park
		allStops.put("1738", "680"); // Bruce at University
		allStops.put("1737", "681"); // Transit Terminal at Chatham
		allStops.put("1739", "682"); // Janette at Park
		allStops.put("1741", "683"); // Janette at Wyandotte
		allStops.put("1382", "684"); // Janette at Elliott
		allStops.put("1384", "685"); // Janette at Caroline
		allStops.put("1385", "686"); // Erie at Janette
		allStops.put("1744", "687"); // Erie at Church
		allStops.put("1746", "688"); // Dougall at Pine
		allStops.put("1748", "689"); // Dougall at Giles
		allStops.put("1750", "690"); // Dougall at Montrose
		allStops.put("1752", "691"); // Dougall at Ellis
		allStops.put("1754", "692"); // Dougall at Shepherd
		allStops.put("1756", "693"); // Dougall at Hanna
		allStops.put("1758", "694"); // Dougall at Tecumseh
		allStops.put("1760", "695"); // Dougall at Wear
		allStops.put("1762", "696"); // Dougall at Jackson Park
		allStops.put("1764", "697"); // Dougall at Windsor Sportsmen
		allStops.put("1766", "698"); // Dougall at Dorwin Plaza
		allStops.put("1768", "699"); // Dougall at Dougall Plaza
		allStops.put("1770", "700"); // Eugenie at Pellisier
		allStops.put("1774", "701"); // Dougall at South Cameron
		allStops.put("1776", "702"); // Dougall at West Grand
		allStops.put("1778", "703"); // Dougall at Nottingham Walmart
		allStops.put("1779", "704"); // Dougall at Norfolk
		allStops.put("1781", "705"); // Dougall at Liberty
		allStops.put("1783", "706"); // Dougall at Beals
		allStops.put("1785", "707"); // Dougall at Medina
		allStops.put("1787", "708"); // Dougall at Granada
		allStops.put("1789", "709"); // Cabana at Dougall
		allStops.put("1790", "710"); // Cabana at Huntington
		allStops.put("1793", "711"); // Cabana at Howard
		allStops.put("1795", "712"); // Howard at Morand
		allStops.put("1796", "713"); // Howard at Ducharme
		allStops.put("1798", "714"); // Howard at Wallace
		allStops.put("1801", "715"); // Howard at Neal
		allStops.put("1803", "716"); // Country Club at Tournament
		allStops.put("1806", "717"); // Country Club at Rodfam
		allStops.put("1808", "718"); // Country Club at Hunt Club
		allStops.put("1810", "719"); // Country Club at Cousineau
		allStops.put("1812", "720"); // Cousineau at Casgrain
		allStops.put("1815", "721"); // Cousineau at Mt. Royal
		allStops.put("1732", "722"); // Cousineau at Highway 3
		allStops.put("1894", "723"); // Transit Terminal Church at Pitt
		allStops.put("1895", "724"); // Riverside at Ouellette
		allStops.put("1897", "725"); // Riverside at McDougall
		allStops.put("1900", "726"); // Riverside at Aylmer
		allStops.put("1902", "727"); // Riverside at Parent
		allStops.put("1818", "728"); // Riverside at Langlois
		allStops.put("1904", "729"); // Riverside at Hall
		allStops.put("1864", "730"); // Riverside at Gladstone
		allStops.put("1906", "731"); // Gladstone at Assumption
		allStops.put("1908", "732"); // Gladstone at Wyandotte
		allStops.put("1910", "733"); // Gladstone at Cataraqui
		allStops.put("1912", "734"); // Gladstone at Niagara
		allStops.put("1916", "735"); // Gladstone at Richmond
		allStops.put("1918", "736"); // Gladstone at Giles
		allStops.put("1920", "737"); // Gladstone at Ottawa
		allStops.put("1865", "738"); // Gladstone at Ellis
		allStops.put("1922", "739"); // Shepherd at Lincoln
		allStops.put("1924", "740"); // Lincoln at ETR Rail Tracks
		allStops.put("1926", "741"); // Lincoln at Seneca
		allStops.put("1928", "742"); // Lincoln at Tecumseh
		allStops.put("1930", "743"); // Lincoln at Lens
		allStops.put("1932", "744"); // Lincoln at Vimy
		allStops.put("1934", "745"); // Lincoln at Ypres
		allStops.put("1936", "746"); // Ypres at Kildare
		allStops.put("1938", "747"); // Ypres at Turner
		allStops.put("1940", "748"); // Walker at Somme
		allStops.put("1942", "749"); // Walker at St. Julien
		allStops.put("1944", "750"); // Walker at Grand Marais
		allStops.put("1946", "751"); // Walker at Parkdale
		allStops.put("1948", "752"); // Walker at Digby
		allStops.put("1950", "753"); // Walker at Sydney
		allStops.put("1952", "754"); // Walker at Seymour
		allStops.put("1954", "755"); // Walker at Foster
		allStops.put("1956", "756"); // Walker at Lappan
		allStops.put("1958", "757"); // Walker at Calderwood
		allStops.put("1960", "758"); // Walker at Melinda
		allStops.put("1962", "759"); // Walker at Ledyard
		allStops.put("1772", "760"); // Walker at Moxley
		allStops.put("1965", "761"); // Walker at Division
		allStops.put("1967", "762"); // Walker at Home Depot Plaza
		allStops.put("1970", "763"); // Walker at Canada Post
		allStops.put("1972", "764"); // Walker at Best Buy
		allStops.put("1974", "765"); // Walker at Costco
		allStops.put("1976", "766"); // Walker at Legacy Park
		allStops.put("1978", "767"); // Walker at Provincial
		allStops.put("1980", "768"); // Walker at Ducharme
		allStops.put("1982", "769"); // Walker at Highway 401
		allStops.put("1984", "770"); // Walker at U-Haul
		allStops.put("1986", "771"); // Walker at North Talbot
		allStops.put("1988", "772"); // North Talbot at Halford
		allStops.put("1990", "773"); // North Talbot at Burke
		allStops.put("1992", "774"); // North Talbot at Dumouchelle
		allStops.put("1994", "775"); // North Talbot at Old West
		allStops.put("1995", "776"); // North Talbot at Pioneer
		allStops.put("1997", "777"); // Sixth Concession at North Talbot
		allStops.put("1993", "778"); // Sixth Concession at Holburn
		allStops.put("1991", "779"); // Holburn at Spago
		allStops.put("1989", "780"); // Ducharme at Holburn
		allStops.put("1987", "781"); // Ducharme at Canberra
		allStops.put("1985", "782"); // Ducharme at Periwinkle
		allStops.put("1983", "783"); // Ducharme at Fontana
		allStops.put("1981", "784"); // Ducharme at Lavender
		allStops.put("1979", "785"); // Ducharme at Walker
		allStops.put("1977", "786"); // Walker at Provincial
		allStops.put("1975", "787"); // Walker at 7th Concession
		allStops.put("1973", "788"); // Walker at Walker Crossings
		allStops.put("1971", "789"); // Walker at Canadian Tire
		allStops.put("1969", "790"); // Walker at Ferrari Plaza
		allStops.put("1968", "791"); // Airport at Front Entrance
		allStops.put("1966", "792"); // Walker at Division
		allStops.put("1964", "793"); // Walker at Moxlay
		allStops.put("1963", "794"); // Walker at Airport
		allStops.put("1961", "795"); // Walker at Melinda
		allStops.put("1959", "796"); // Walker at Calderwood
		allStops.put("1957", "797"); // Walker at Lappan
		allStops.put("1955", "798"); // Walker at Foster
		allStops.put("1953", "799"); // Walker at Seymour
		allStops.put("1951", "800"); // Walker at Sydney
		allStops.put("1949", "801"); // Walker at Digby
		allStops.put("1947", "802"); // Walker at Parkdale
		allStops.put("1945", "803"); // Walker at Grand Marais
		allStops.put("1943", "804"); // Walker at St. Julien
		allStops.put("1941", "805"); // Walker at Somme
		allStops.put("1939", "806"); // Ypres at Turner
		allStops.put("1937", "807"); // Ypres at Kildare
		allStops.put("1935", "808"); // Ypres at Lincoln
		allStops.put("1933", "809"); // Lincoln at Vimy
		allStops.put("1931", "810"); // Lincoln at Lens
		allStops.put("1929", "811"); // Lincoln at Tecumseh
		allStops.put("1805", "812"); // Lincoln at Mohawk
		allStops.put("1927", "813"); // Lincoln at Seneca
		allStops.put("1925", "814"); // Lincoln at ETR Rail Tracks
		allStops.put("1923", "815"); // Lincoln at Shepherd
		allStops.put("1921", "816"); // Lincoln at Ottawa
		allStops.put("1919", "817"); // Lincoln at Ontario
		allStops.put("1917", "818"); // Lincoln at Richmond
		allStops.put("1915", "819"); // Lincoln at Erie
		allStops.put("1913", "820"); // Lincoln at Niagara
		allStops.put("1911", "821"); // Lincoln at Cataraqui
		allStops.put("1909", "822"); // Lincoln at Wyandotte
		allStops.put("1907", "823"); // Lincoln at Assumption
		allStops.put("1811", "824"); // Riverside at Gladstone
		allStops.put("1905", "825"); // Riverside at Hall
		allStops.put("1802", "826"); // Riverside at Langlois
		allStops.put("1903", "827"); // Riverside at Parent
		allStops.put("1901", "828"); // Riverside at Aylmer
		allStops.put("1899", "829"); // Riverside at McDougall
		allStops.put("1898", "830"); // Riverside at Goyeau
		allStops.put("1896", "831"); // Ferry at Riverside
		allStops.put("2052", "832"); // Ferry at Riverside
		allStops.put("2055", "833"); // Glengarry at University
		allStops.put("2057", "834"); // Glengarry at Wyandotte
		allStops.put("2059", "835"); // Howard at Elliott
		allStops.put("2065", "836"); // Parent at Ottawa
		allStops.put("2066", "837"); // Parent at Ellis
		allStops.put("2068", "838"); // Parent at Shepherd
		allStops.put("2070", "839"); // Parent at Hanna
		allStops.put("1108", "840"); // Tecumseh at Marentette
		allStops.put("2075", "841"); // Eugenie at Howard
		allStops.put("2076", "842"); // Eugenie at Lillian
		allStops.put("2080", "843"); // South Pacific at Parent
		allStops.put("2082", "844"); // South Pacific at Jeremiah
		allStops.put("2084", "845"); // Southdale at South Pacific
		allStops.put("2086", "846"); // Southdale at Southridge
		allStops.put("2088", "847"); // Slater at Southdale
		allStops.put("2092", "848"); // Slater at Grand Marais
		allStops.put("2094", "849"); // Grand Marais at Southdale
		allStops.put("2096", "850"); // Grand Marais at Garvey
		allStops.put("2098", "851"); // Grand Marais at South Pacific
		allStops.put("2100", "852"); // Grand Marais at Langlois
		allStops.put("2102", "853"); // N. Service Rd.at Langlois
		allStops.put("2104", "854"); // N. Service Rd. at Conservation
		allStops.put("2106", "855"); // E.C. Row Ave at Conservation
		allStops.put("2108", "856"); // E.C. Row Ave at Parkwood
		allStops.put("1765", "857"); // Sydney at Windsor Commons
		allStops.put("1877", "858"); // Devonshire Mall at Moxies
		allStops.put("2113", "859"); // Marentette at EC Row Ave
		allStops.put("2112", "860"); // E.C. Row Ave at Devon
		allStops.put("2105", "861"); // E.C Row Ave at Conservation
		allStops.put("2103", "862"); // N. Service Rd.at Alderbrook
		allStops.put("2101", "863"); // N. Service Rd. at Langlois
		allStops.put("2099", "864"); // Grand Marais at Langlois
		allStops.put("2097", "865"); // Grand Marais at South Pacific
		allStops.put("2095", "866"); // Grand Marais at Garvey
		allStops.put("2093", "867"); // Slater at Hartford
		allStops.put("2089", "868"); // Slater at Southdale
		allStops.put("2087", "869"); // Southdale at Bramley
		allStops.put("2085", "870"); // South Pacific at Southdale
		allStops.put("2083", "871"); // South Pacific at Jeremiah
		allStops.put("2081", "872"); // South Pacific at Parent
		allStops.put("2079", "873"); // Eugenie at South Pacific
		allStops.put("2077", "874"); // Eugenie at Remington
		allStops.put("2074", "875"); // Howard at Tecumseh
		allStops.put("2073", "876"); // Parent at Tecumseh
		allStops.put("2071", "877"); // Parent at Hanna
		allStops.put("2069", "878"); // Parent at Shepherd
		allStops.put("2067", "879"); // Parent at Ellis
		allStops.put("2061", "880"); // Howard at Erie
		allStops.put("2060", "881"); // Howard at Elliott
		allStops.put("2058", "882"); // Aylmer at Wyandotte
		allStops.put("2056", "883"); // Aylmer at Assumption
		allStops.put("2054", "884"); // Chatham at Glengarry
		allStops.put("2053", "885"); // Chatham at Goyeau
		allStops.put("2135", "886"); // Rosa Parks Transit Center
		allStops.put("2134", "887"); // Michigan at Washington
		allStops.put("2132", "888"); // Griswold at Congress
		allStops.put("2124", "889"); // Tunnel Platform at Mariner's
		allStops.put("2122", "890"); // McDougall at Wyandotte
		allStops.put("2120", "891"); // McDougall at University Avenue
		allStops.put("1755", "892"); // Chatham at Goyeau
		allStops.put("1831", "893"); // Chatham at Ouellette
		allStops.put("2116", "894"); // Windsor Transit Terminal
		allStops.put("2117", "895"); // Goyeau at Pitt
		allStops.put("2118", "896"); // City Hall Square
		allStops.put("2119", "897"); // Canada Tunnel Plaza Duty Free
		allStops.put("2126", "898"); // Congress at Beaubien
		allStops.put("2127", "899"); // Congress at Randolph
		allStops.put("2129", "900"); // Washington at Jefferson
		allStops.put("2130", "901"); // Fort at Cass
		allStops.put("2131", "902"); // Cass at Lafayette
		allStops.put("1665", "903"); // Riverside at Caron
		allStops.put("1525", "904"); // Crawford at Riverside
		allStops.put("1527", "905"); // Crawford at University
		allStops.put("1528", "906"); // Crawford at University
		allStops.put("1526", "907"); // Crawford at Riverside
		allStops.put("1664", "908"); // Riverside at Caron
		allStops.put("1819", "909"); // College Ave. at Community Centre
		allStops.put("1823", "910"); // Matchette at Chappell
		allStops.put("1825", "911"); // Matchette at Carmichael
		allStops.put("1827", "912"); // Matchette at Broadway
		allStops.put("1829", "913"); // Matchette at Titcombe
		allStops.put("1833", "914"); // Marigold at Weaver
		allStops.put("1835", "915"); // Sprucewood at Matchette
		allStops.put("1836", "916"); // Sprucewood at Kingsley
		allStops.put("1838", "917"); // Sprucewood at Abbott
		allStops.put("1840", "918"); // Sprucewood at Woodmont
		allStops.put("1482", "919"); // Sprucewood at Newman
		allStops.put("1842", "920"); // Sprucewood at Malden
		allStops.put("1844", "921"); // Malden at Delmar
		allStops.put("1846", "922"); // Malden at Todd Lane
		allStops.put("1849", "923"); // Todd Lane at Elmdale
		allStops.put("1851", "924"); // Todd Lane at Wayne
		allStops.put("1853", "925"); // Todd Lane at Canada
		allStops.put("1499", "926"); // Todd Lane at Bishop
		allStops.put("1855", "927"); // Todd Lane at Ninth
		allStops.put("1856", "928"); // Todd Lane at Tenth
		allStops.put("1857", "929"); // Cabana at Northway
		allStops.put("1523", "930"); // Cabana at Borrelli
		allStops.put("1859", "931"); // Cabana at Southwinds
		allStops.put("1861", "932"); // Cabana at Roxborough
		allStops.put("1863", "933"); // Geraedts at St. Clair Residence
		allStops.put("1736", "934"); // Geraedts at St. Clair Residence
		allStops.put("1866", "935"); // Cabana at Geraedts
		allStops.put("1868", "936"); // Cabana at Longfellow
		allStops.put("1473", "937"); // Cabana at Casgrain
		allStops.put("1870", "938"); // Cabana at McGraw
		allStops.put("1415", "939"); // Cabana at Granada
		allStops.put("1872", "940"); // Howard at Cabana
		allStops.put("1873", "941"); // Howard at Maguire
		allStops.put("1875", "942"); // Howard at Kenilworth
		allStops.put("1880", "943"); // Marentette at Foster
		allStops.put("1882", "944"); // Marentette at Division
		allStops.put("1883", "945"); // Provincial at Clarke
		allStops.put("1409", "946"); // Provincial at Cabana
		allStops.put("1884", "947"); // Provincial at Humane Society
		allStops.put("1885", "948"); // Provincial at Sixth Concession
		allStops.put("1886", "949"); // Provincial at Lone Pine
		allStops.put("1888", "950"); // Provincial at Monarch Basics
		allStops.put("1891", "951"); // Provincial at Legacy Park
		allStops.put("1893", "952"); // Legacy Park at Sears Home
		allStops.put("1892", "953"); // Division at Walker
		allStops.put("1537", "954"); // Division at Bliss
		allStops.put("1890", "955"); // Division at Woodward
		allStops.put("1889", "956"); // Division at Conservation Area
		allStops.put("1887", "957"); // Division at Clarke
		allStops.put("1876", "958"); // Howard at Kenilworth
		allStops.put("1874", "959"); // Howard at Maguire
		allStops.put("1871", "960"); // Cabana at Dougall
		allStops.put("1540", "961"); // Cabana at Granada
		allStops.put("1869", "962"); // Cabana at McGraw
		allStops.put("1547", "963"); // Cabana at Casgrain
		allStops.put("1867", "964"); // Cabana at Dominion
		allStops.put("1862", "965"); // Cabana at Geraedts
		allStops.put("1860", "966"); // Cabana at Randolph
		allStops.put("1638", "967"); // Cabana at Askin
		allStops.put("1858", "968"); // Cabana at Northway
		allStops.put("1627", "969"); // Todd Lane at Tenth
		allStops.put("1854", "970"); // Todd Lane at Ninth
		allStops.put("1624", "971"); // Todd Lane at Oxley
		allStops.put("1852", "972"); // Todd Lane at Canada
		allStops.put("1850", "973"); // Todd Lane at Fifth
		allStops.put("1848", "974"); // Todd Lane at Third
		allStops.put("1847", "975"); // Malden at Orford
		allStops.put("1845", "976"); // Malden at Delmar
		allStops.put("1843", "977"); // Sprucewood at Malden
		allStops.put("1575", "978"); // Sprucewood at Newman
		allStops.put("1841", "979"); // Sprucewood at Woodmont
		allStops.put("1839", "980"); // Sprucewood at Abbott
		allStops.put("1837", "981"); // Sprucewood at Kingsley
		allStops.put("1558", "982"); // Sprucewood at Matchette
		allStops.put("1830", "983"); // Matchette at Titcombe
		allStops.put("1828", "984"); // Matchette at Armanda
		allStops.put("1826", "985"); // Matchette at Carmichael
		allStops.put("1824", "986"); // Matchette at Chappell
		allStops.put("1822", "987"); // Prince at Vaughan
		allStops.put("1821", "988"); // Prince at Mulford
		allStops.put("1820", "989"); // Prince at Wells
		allStops.put("1663", "990"); // Windsor Transit Terminal
		allStops.put("1667", "991"); // Riverside at Oak
		allStops.put("1669", "992"); // Riverside at McKay
		allStops.put("1671", "993"); // Campbell at Riverside
		allStops.put("1673", "994"); // Campbell at University
		allStops.put("1305", "995"); // Campbell at Martindale
		allStops.put("1675", "996"); // Campbell at Wyandotte
		allStops.put("1677", "997"); // Campbell at Rooney
		allStops.put("1679", "998"); // Campbell at College
		allStops.put("1681", "999"); // Campbell at Adanac
		allStops.put("1683", "1000"); // Campbell at Grove
		allStops.put("1685", "1001"); // Campbell at Taylor
		allStops.put("1687", "1002"); // Campbell at Pelletier
		allStops.put("1689", "1003"); // Campbell at Tecumseh
		allStops.put("1690", "1004"); // Campbell at Everts
		allStops.put("1692", "1005"); // Campbell at Curry
		allStops.put("1694", "1006"); // Dominion at Totten
		allStops.put("1696", "1007"); // Dominion at Arcadia
		allStops.put("1698", "1008"); // Dominion at McKay
		allStops.put("1700", "1009"); // Dominion at Ojibway
		allStops.put("1702", "1010"); // Dominion at Holy Names
		allStops.put("1703", "1011"); // Dominion at Northwood
		allStops.put("1706", "1012"); // Dominion at E.C. Row
		allStops.put("1708", "1013"); // Dominion at Labelle
		allStops.put("1711", "1014"); // Dominion at Grand Marais
		allStops.put("1713", "1015"); // Dominion at Norfolk
		allStops.put("1715", "1016"); // Dominion at Richardie
		allStops.put("1717", "1017"); // Dominion at Beals
		allStops.put("1719", "1018"); // Dominion at Roselawn
		allStops.put("1721", "1019"); // Dominion at Cabana
		allStops.put("1723", "1020"); // Mount Royal at Cabana
		allStops.put("1725", "1021"); // Mount Royal at Villa Maria North
		allStops.put("1726", "1022"); // Mount Royal at Villa Maria South
		allStops.put("1728", "1023"); // Mount Royal at Mitchell
		allStops.put("1730", "1024"); // Mount Royal at Cousineau
		allStops.put("1735", "1025"); // Glenwood at Cabana
		allStops.put("1246", "1026"); // Glenwood at St. Gabriel
		allStops.put("1733", "1027"); // Beals at Roxborough
		allStops.put("1731", "1028"); // Beals at Rankin
		allStops.put("1729", "1029"); // Rankin at Liberty
		allStops.put("1727", "1030"); // Norfolk at Rankin
		allStops.put("1724", "1031"); // Norfolk at California
		allStops.put("1722", "1032"); // California at Grand Marais
		allStops.put("1720", "1033"); // Grand Marais at Northway
		allStops.put("1718", "1034"); // Labelle at Northway
		allStops.put("1716", "1035"); // Labelle at California
		allStops.put("1714", "1036"); // Labelle at St. Patricks
		allStops.put("1710", "1037"); // Labelle at Orion
		allStops.put("1709", "1038"); // Labelle at Everts
		allStops.put("1707", "1039"); // Labelle at Dominion
		allStops.put("1705", "1040"); // Dominion at E.C. Row
		allStops.put("1704", "1041"); // Dominion at Northwood
		allStops.put("1701", "1042"); // Dominion at Holy Names
		allStops.put("1699", "1043"); // Dominion at Ojibway
		allStops.put("1697", "1044"); // Dominion at McKay
		allStops.put("1695", "1045"); // Dominion at Arcadia
		allStops.put("1693", "1046"); // Campbell at Totten
		allStops.put("1691", "1047"); // Campbell at Curry
		allStops.put("1154", "1048"); // Campbell at Mark
		allStops.put("1688", "1049"); // Campbell at Tecumseh
		allStops.put("1686", "1050"); // Campbell at Pelletier
		allStops.put("1684", "1051"); // Campbell at Taylor
		allStops.put("1682", "1052"); // Campbell at Grove
		allStops.put("1680", "1053"); // Campbell at Adanac
		allStops.put("1678", "1054"); // Campbell at College
		allStops.put("1676", "1055"); // Campbell at Rooney
		allStops.put("1674", "1056"); // Campbell at Wyandotte
		allStops.put("1381", "1057"); // Campbell at Martindale
		allStops.put("1672", "1058"); // Campbell at University
		allStops.put("1670", "1059"); // Campbell at Riverside
		allStops.put("1668", "1060"); // Riverside at McKay
		allStops.put("1666", "1061"); // Riverside at Oak
		allStops.put("2050", "1062"); // McHugh at Lauzon
		allStops.put("2049", "1063"); // McHugh at Darfield
		allStops.put("2048", "1064"); // WFCU Centre Main Entrance
		allStops.put("2046", "1065"); // McHugh at Cypress
		allStops.put("2045", "1066"); // McHugh at Clover
		allStops.put("2042", "1067"); // Clover at Firgrove
		allStops.put("2040", "1068"); // Clover at Little River
		allStops.put("2037", "1069"); // Little River at Pearson
		allStops.put("2035", "1070"); // Little River at Chateau
		allStops.put("2032", "1071"); // Little River at Banwell
		allStops.put("2029", "1072"); // Little River at Jarvis
		allStops.put("2027", "1073"); // Cora Greenwood at Little River
		allStops.put("2025", "1074"); // Cora Green at Castle Hill
		allStops.put("2023", "1075"); // Cora Green at Dillon
		allStops.put("2021", "1076"); // Cora Green at Riverside
		allStops.put("2020", "1077"); // Riverside at Jarvis
		allStops.put("2019", "1078"); // Greenpark at Amalfi
		allStops.put("2018", "1079"); // Wyandotte at Greenpark
		allStops.put("2017", "1080"); // Wyandotte at Clover
		allStops.put("2016", "1081"); // Wyandotte at Florence
		allStops.put("2015", "1082"); // Wyandotte at Martinique
		allStops.put("2014", "1083"); // Wyandotte at Greendale
		allStops.put("2013", "1084"); // Wyandotte at Westchester
		allStops.put("2012", "1085"); // Wyandotte at Isack
		allStops.put("2011", "1086"); // Wyandotte at Riverside Plaza
		allStops.put("2010", "1087"); // Wyandotte at Watson
		allStops.put("2009", "1088"); // Lauzon Rd. at Wyandotte
		allStops.put("2008", "1089"); // Lauzon Road at St. Rose
		allStops.put("1998", "1090"); // Tecumseh Mall Rear Entrance
		allStops.put("2047", "1091"); // McHugh at Mickey Renuad Way
		allStops.put("2007", "1092"); // Lauzon Rd. at Lilac
		allStops.put("1999", "1093"); // Lauzon at Vince
		allStops.put("2000", "1094"); // Lauzon at Forest Glade
		allStops.put("2001", "1095"); // Forest Glade at Meadowbrook
		allStops.put("2002", "1096"); // Anchor at Twin Oaks
		allStops.put("2003", "1097"); // Anchor at Green Shield
		allStops.put("2004", "1098"); // Anchor at CS Wind
		allStops.put("2006", "1099"); // Anchor at Jamison Entrance
		allStops.put("2005", "1100"); // Banwell at Wildwood
		allStops.put("2022", "1101"); // Banwell at Palmetto
		allStops.put("2024", "1102"); // Banwell at Tecumseh
		allStops.put("2028", "1103"); // McHugh at Questa
		allStops.put("2030", "1104"); // McHugh at Trappers
		allStops.put("2031", "1105"); // McHugh at Venetian
		allStops.put("2033", "1106"); // McHugh at Clover
		allStops.put("2034", "1107"); // McHugh at Cypress
		allStops.put("2039", "1108"); // WFCU Centre Main Entrance
		allStops.put("2041", "1109"); // McHugh at Darfield
		allStops.put("2043", "1110"); // Lauzon Rd. at McHugh
		allStops.put("2038", "1111"); // McHugh at Micky Renaud Way
		allStops.put("2185", "1112"); // Morton at Ojibway
		allStops.put("2186", "1113"); // Front at River
		allStops.put("2187", "1114"); // Front at Antaya
		allStops.put("2188", "1115"); // Front at Reaume
		allStops.put("2189", "1116"); // Front at Riverview
		allStops.put("2190", "1117"); // Front at Bouffard
		allStops.put("2191", "1118"); // Front at Huron
		allStops.put("2192", "1119"); // Front at Laurier
		allStops.put("2193", "1120"); // Front at Adams
		allStops.put("2194", "1121"); // Front at Boismier
		allStops.put("2195", "1122"); // International at Front
		allStops.put("2196", "1123"); // Michigan at International
		allStops.put("2197", "1124"); // Michigan at Fields
		allStops.put("2198", "1125"); // Michigan at Delaware
		allStops.put("2199", "1126"); // Michigan at Laurier
		allStops.put("2200", "1127"); // Laurier at Hazel
		allStops.put("2201", "1128"); // Laurier at Alfred
		allStops.put("2202", "1129"); // Laurier at Mayfair
		allStops.put("2203", "1130"); // Laurier at Marquette
		allStops.put("2204", "1131"); // Laurier at Matchette
		allStops.put("2205", "1132"); // Laurier at First
		allStops.put("2206", "1133"); // Laurier at Selkirk
		allStops.put("2207", "1134"); // Laurier at Tacoma
		allStops.put("2208", "1135"); // Laurier at Malden
		allStops.put("2168", "1136"); // Vollmer Centre Front Entrance
		allStops.put("2169", "1137"); // Mike Raymond at Malden
		allStops.put("2170", "1138"); // Malden at Laurier
		allStops.put("2171", "1139"); // Malden at Bouffard
		allStops.put("2172", "1140"); // Malden at Rosati
		allStops.put("2209", "1141"); // Malden at Reaume
		allStops.put("2210", "1142"); // Malden at Valiant
		allStops.put("2211", "1143"); // Malden at Stuart
		allStops.put("2212", "1144"); // Malden at Edgemore
		allStops.put("2213", "1145"); // Malden at Grillo
		allStops.put("2214", "1146"); // Malden at Normandy
		allStops.put("2215", "1147"); // Delmar at Trinity
		allStops.put("2216", "1148"); // Ellis at Normandy
		allStops.put("2217", "1149"); // Normandy at Seventh
		allStops.put("2218", "1150"); // Normandy at Tenth
		allStops.put("2219", "1151"); // Normandy at Thirteenth
		allStops.put("2220", "1152"); // Normandy at Huron Church
		allStops.put("2221", "1153"); // Huron Church at Disputed
		allStops.put("2222", "1154"); // Huron Church at Skinner
		allStops.put("2223", "1155"); // Sandwich West at Huron Church
		allStops.put("2224", "1156"); // Sandwich West at Mary
		allStops.put("2225", "1157"); // Sandwich West at D'Amore
		allStops.put("2226", "1158"); // Sandwich West at Durocher
		allStops.put("2227", "1159"); // Sandwich West at Lovell
		allStops.put("2228", "1160"); // Heritage at Sandwich West
		allStops.put("2229", "1161"); // Heritage at Rushwood
		allStops.put("2230", "1162"); // Heritage at Rushwood
		allStops.put("2231", "1163"); // Heritage at Blackthorn
		allStops.put("2232", "1164"); // Heritage at Sixth Concession
		allStops.put("2233", "1165"); // Sixth Concession at Montgomery
		allStops.put("2140", "1166"); // St Clair Front Entrance
		allStops.put("2141", "1167"); // Montgomery at Surrey
		allStops.put("2142", "1168"); // Montgomery at Eastbourne
		allStops.put("2143", "1169"); // Heritage at Winfield
		allStops.put("2144", "1170"); // Heritage at Winfield
		allStops.put("2145", "1171"); // Heritage at Rushwood
		allStops.put("2146", "1172"); // Heritage at Rushwood
		allStops.put("2147", "1173"); // Heritage at Sandwich West
		allStops.put("2148", "1174"); // Sandwich West at Lovell
		allStops.put("2149", "1175"); // Sandwich West at Durocher
		allStops.put("2150", "1176"); // Sandwich West at D'Amore
		allStops.put("2151", "1177"); // Sandwich West at Mary
		allStops.put("2152", "1178"); // Sandwich West at Huron Church
		allStops.put("2153", "1179"); // Huron Church at Skinner
		allStops.put("2154", "1180"); // Huron Church at Cousineau
		allStops.put("2155", "1181"); // Normandy at Huron Church
		allStops.put("2156", "1182"); // Normandy at Twelfth
		allStops.put("2157", "1183"); // Normandy at Tenth
		allStops.put("2158", "1184"); // Normandy at Seventh
		allStops.put("2159", "1185"); // Ellis at Normandy
		allStops.put("2160", "1186"); // Delmar at Trinity
		allStops.put("2161", "1187"); // Malden at Normandy
		allStops.put("2162", "1188"); // Malden at Morton
		allStops.put("2163", "1189"); // Malden at Edgemore
		allStops.put("2164", "1190"); // Malden at Outram
		allStops.put("2165", "1191"); // Malden at Monty
		allStops.put("2166", "1192"); // Malden at Rosati
		allStops.put("2167", "1193"); // Malden at Bouffard
		allStops.put("2173", "1194"); // Reaume at Malden
		allStops.put("2174", "1195"); // Reaume at Woodbridge
		allStops.put("2175", "1196"); // Reaume at Deerview
		allStops.put("2176", "1197"); // Reaume at Piruzza
		allStops.put("2177", "1198"); // Reaume at Matchette
		allStops.put("2178", "1199"); // Matchette at Monty
		allStops.put("2179", "1200"); // Matchette at Minto
		allStops.put("2180", "1201"); // Morton at Matchette
		allStops.put("2181", "1202"); // Morton at Quick
		allStops.put("2182", "1203"); // Morton at Wales
		allStops.put("2183", "1204"); // Morton at Ramblewood
		allStops.put("2184", "1205"); // Morton at Ramblewood
		ALL_STOPS = allStops;
	}
}
