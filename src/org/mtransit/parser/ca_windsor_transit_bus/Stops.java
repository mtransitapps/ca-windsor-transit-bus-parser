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
		allStops.put("1197", "59"); // Forest Glade at Mulberry
		allStops.put("1205", "60"); // Forest Glade at Elmwood
		allStops.put("1204", "61"); // Wildwood at Rosebriar
		allStops.put("1202", "62"); // Wildwood at Hemlock
		allStops.put("1201", "63"); // Wildwood at Midfield
		allStops.put("1200", "64"); // Wildwood at Forest Glade
		allStops.put("1199", "65"); // Wildwood at Beachdale
		allStops.put("1198", "66"); // Wildwood at Apple
		allStops.put("1196", "67"); // Wildwood at Forest Glade
		allStops.put("1194", "68"); // Forest Glade at Ridge
		allStops.put("1192", "69"); // Forest Glade at Eastcourt
		allStops.put("1190", "70"); // Forest Glade at Tecumseh
		allStops.put("1188", "71"); // Tecumseh at Forest Glade
		allStops.put("1186", "72"); // Tecumseh at Penang
		allStops.put("1184", "73"); // Tecumseh at Rafih
		allStops.put("1182", "74"); // Tecumseh at Food Basics
		allStops.put("1180", "75"); // Tecumseh at Lauzon
		allStops.put("1178", "76"); // Tecumseh at Annie
		allStops.put("1176", "77"); // Tecumseh at Lauzon Parkway
		allStops.put("1174", "78"); // Tecumseh Mall Rear Entrance
		allStops.put("1172", "79"); // Tecumseh at Walmart
		allStops.put("1170", "80"); // Roseville at Tecumseh
		allStops.put("1168", "81"); // Roseville at Charlie Brooks
		allStops.put("1166", "82"); // Roseville at Thornberry
		allStops.put("1164", "83"); // Roseville at Thornberry
		allStops.put("1162", "84"); // Rose at Jefferson
		allStops.put("1160", "85"); // Rose at Clemenceau
		allStops.put("1158", "86"); // Rose at Rivard
		allStops.put("1155", "87"); // Rivard at Adstoll
		allStops.put("2139", "88"); // Rivard at Tecumseh
		allStops.put("1151", "89"); // Tecumseh at Ford
		allStops.put("1149", "90"); // Tecumseh at Buckingham
		allStops.put("1147", "91"); // Tecumseh at Westminster
		allStops.put("1145", "92"); // Tecumseh at Norman
		allStops.put("1143", "93"); // Tecumseh at Pillette
		allStops.put("1141", "94"); // Tecumseh at Ellrose
		allStops.put("1203", "95"); // Tecumseh at Francois
		allStops.put("1140", "96"); // Tecumseh at Rossini
		allStops.put("1138", "97"); // Tecumseh at George
		allStops.put("1136", "98"); // Tecumseh at Westcott
		allStops.put("1133", "99"); // Tecumseh at Central
		allStops.put("1131", "100"); // Tecumseh at Meldrum
		allStops.put("1129", "101"); // Tecumseh at Chandler
		allStops.put("1127", "102"); // Tecumseh at Hickory
		allStops.put("1126", "103"); // Tecumseh at Factoria
		allStops.put("1124", "104"); // Tecumseh at Turner
		allStops.put("1122", "105"); // Tecumseh at Durham
		allStops.put("1120", "106"); // Tecumseh at Kildare
		allStops.put("1118", "107"); // Tecumseh at Lincoln
		allStops.put("1114", "108"); // Tecumseh at Hall
		allStops.put("1112", "109"); // Tecumseh at Benjamin
		allStops.put("1110", "110"); // Tecumseh at Parent
		allStops.put("1107", "111"); // Tecumseh a Windsor Health Centre
		allStops.put("1105", "112"); // Tecumseh at Howard
		allStops.put("1104", "113"); // University at Ouellette
		allStops.put("1101", "114"); // Victoria at University
		allStops.put("1102", "115"); // Transit Terminal at Chatham
		allStops.put("1099", "116"); // University at Bruce
		allStops.put("1097", "117"); // University at Caron
		allStops.put("1095", "118"); // University at Crawford
		allStops.put("1093", "119"); // University at Elm
		allStops.put("1091", "120"); // University at Cameron
		allStops.put("1090", "121"); // University at Curry
		allStops.put("1088", "122"); // University at Campbell
		allStops.put("1086", "123"); // University at Bridge
		allStops.put("1084", "124"); // University at Randolph
		allStops.put("1083", "125"); // University at Askin
		allStops.put("1081", "126"); // University at Patricia
		allStops.put("1079", "127"); // University at Huron Church
		allStops.put("1077", "128"); // Riverside at Rosedale
		allStops.put("1074", "129"); // Sandwich at Detroit
		allStops.put("1072", "130"); // Mill at Sandwich
		allStops.put("1070", "131"); // Mill at Wyandotte
		allStops.put("1068", "132"); // Felix at Linwood
		allStops.put("1066", "133"); // College at Felix
		allStops.put("1052", "134"); // College Ave. at Community Centre
		allStops.put("1053", "135"); // College at South
		allStops.put("1054", "136"); // College at Prince
		allStops.put("1056", "137"); // Prince at Barrymore
		allStops.put("1057", "138"); // Prince at Mulford
		allStops.put("1058", "139"); // Prince at Vaughan
		allStops.put("1059", "140"); // Prince at Glenfield
		allStops.put("1060", "141"); // Prince at Whitney
		allStops.put("1062", "142"); // Felix at Tecumseh
		allStops.put("1063", "143"); // Felix at Manchester
		allStops.put("1064", "144"); // Felix at Girardot
		allStops.put("1065", "145"); // Felix at Millen
		allStops.put("1067", "146"); // Felix at College
		allStops.put("1069", "147"); // Felix at Linwood
		allStops.put("1071", "148"); // Mill at Donnelly
		allStops.put("1073", "149"); // Mill at Sandwich
		allStops.put("1075", "150"); // Sandwich at Detroit
		allStops.put("1055", "151"); // Sandwich at University
		allStops.put("1078", "152"); // University at Huron Church
		allStops.put("1080", "153"); // University at Patricia
		allStops.put("1082", "154"); // University at California
		allStops.put("1085", "155"); // University at Randolph
		allStops.put("1087", "156"); // University at Partington
		allStops.put("1089", "157"); // University at Campbell
		allStops.put("2136", "158"); // University at Curry
		allStops.put("1092", "159"); // University at Cameron
		allStops.put("1094", "160"); // University at Wellington
		allStops.put("1096", "161"); // University at Crawford
		allStops.put("1098", "162"); // University at Caron
		allStops.put("1100", "163"); // University at Bruce
		allStops.put("2137", "164"); // University at Church
		allStops.put("1103", "165"); // Windsor Transit Terminal
		allStops.put("1106", "166"); // Tecumseh at Howard
		allStops.put("1109", "167"); // Tecumseh at Marentette
		allStops.put("1111", "168"); // Tecumseh at Parent
		allStops.put("1113", "169"); // Tecumseh at Forest
		allStops.put("1115", "170"); // Tecumseh at Parkwood
		allStops.put("1117", "171"); // Tecumseh at Moy
		allStops.put("1119", "172"); // Tecumseh at Lincoln
		allStops.put("1121", "173"); // Tecumseh at Kildare
		allStops.put("1123", "174"); // Tecumseh at Byng
		allStops.put("1125", "175"); // Tecumseh at Walker
		allStops.put("1128", "176"); // Tecumseh at Cadillac
		allStops.put("1130", "177"); // Tecumseh at Chandler
		allStops.put("1132", "178"); // Tecumseh at Meldrum
		allStops.put("1134", "179"); // Tecumseh at Central
		allStops.put("1135", "180"); // Tecumseh at Aubin
		allStops.put("1137", "181"); // Tecumseh at George
		allStops.put("1139", "182"); // Tecumseh at Rossini
		allStops.put("1142", "183"); // Tecumseh at Francois
		allStops.put("1144", "184"); // Tecumseh at Pillette
		allStops.put("1146", "185"); // Tecumseh at Norman
		allStops.put("1148", "186"); // Tecumseh at Westminster
		allStops.put("1150", "187"); // Tecumseh at Ford
		allStops.put("1152", "188"); // Rivard at Tecumseh
		allStops.put("1153", "189"); // Rivard at Adstoll
		allStops.put("1156", "190"); // Rivard at Rose
		allStops.put("1157", "191"); // Rose at Jos St. Louis
		allStops.put("1161", "192"); // Rose atLloyd George
		allStops.put("1163", "193"); // Roseville at Thornberry
		allStops.put("1165", "194"); // Roseville at Thornberry
		allStops.put("1167", "195"); // Roseville at Charlie Brooks
		allStops.put("1169", "196"); // Roseville at Tecumseh
		allStops.put("1171", "197"); // Tecumseh Rd. at Eastpark Plaza
		allStops.put("1173", "198"); // Tecumseh Mall Rear Entrance
		allStops.put("1175", "199"); // Tecumseh at Lauzon Parkway
		allStops.put("1177", "200"); // Tecumseh at Annie
		allStops.put("1179", "201"); // Tecumseh at Lauzon
		allStops.put("1181", "202"); // Tecumseh at Canadian Tire
		allStops.put("1183", "203"); // Tecumseh at Rafih
		allStops.put("1185", "204"); // Tecumseh at Penang
		allStops.put("1187", "205"); // Tecumseh at Metro Plaza
		allStops.put("1189", "206"); // Forest Glade at Tecumseh
		allStops.put("1191", "207"); // Forest Glade at Esplanade
		allStops.put("1193", "208"); // Forest Glade at Ridge
		allStops.put("1195", "209"); // Forest Glade at Wildwood
		allStops.put("1079", "210"); // University at Huron Church
		allStops.put("1375", "211"); // Tecumseh Mall Rear Entrance
		allStops.put("1374", "212"); // Lauzon Parkway at Lauzon Line
		allStops.put("1372", "213"); // Lauzon at Tranby
		allStops.put("1370", "214"); // Lauzon at Trinity Towers
		allStops.put("1368", "215"); // Lauzon at Little River
		allStops.put("1076", "216"); // Little River at Adair
		allStops.put("1363", "217"); // Little River Acres at Little Riv
		allStops.put("1361", "218"); // Little River Acres at East Moor
		allStops.put("1359", "219"); // Little River Acres at Cottage
		allStops.put("1355", "220"); // Little River Acres at Aire
		allStops.put("1354", "221"); // Little RiverAcres at LittleRiver
		allStops.put("1352", "222"); // Riverdale at St. Rose
		allStops.put("1350", "223"); // Riverdale at Jerome
		allStops.put("1348", "224"); // Riverdale at Wyandotte
		allStops.put("1346", "225"); // Riverdale at Menard
		allStops.put("1344", "226"); // Riverdale at Riverside
		allStops.put("1342", "227"); // Riverside at Marina
		allStops.put("1340", "228"); // Riverside at Solidarity Towers
		allStops.put("1338", "229"); // Riverside at Riverside Towers
		allStops.put("1336", "230"); // Riverside at Shoreline Towers
		allStops.put("1334", "231"); // Riverside at Dieppe
		allStops.put("1329", "232"); // Riverside Dr. E. at Lauzon
		allStops.put("1327", "233"); // Lauzon at Cecile
		allStops.put("1325", "234"); // Lauzon at Cedarview
		allStops.put("1323", "235"); // Lauzon at Wyandotte
		allStops.put("1321", "236"); // Wyandotte at Matthew Brady
		allStops.put("1319", "237"); // Wyandotte at Fairview
		allStops.put("1316", "238"); // Wyandotte at Vernon
		allStops.put("1314", "239"); // Wyandotte at St. Rose
		allStops.put("Sto125649", "240"); // Wyandotte at Metro
		allStops.put("1312", "241"); // Wyandotte at Janisse
		allStops.put("1309", "242"); // Wyandotte at Homedale
		allStops.put("1310", "243"); // Wyandotte at Patrice
		allStops.put("1307", "244"); // Wyandotte at Jefferson
		allStops.put("1304", "245"); // Wyandotte at Reedmere
		allStops.put("1302", "246"); // Wyandotte at Villaire
		allStops.put("1299", "247"); // Wyandotte at Ford
		allStops.put("1297", "248"); // Wyandotte at Westminster
		allStops.put("1295", "249"); // Wyandotte at Dawson
		allStops.put("1293", "250"); // Wyandotte at Pillette
		allStops.put("1291", "251"); // Wyandotte at Jos. Janisse
		allStops.put("1289", "252"); // Wyandotte at Rossini
		allStops.put("1287", "253"); // Wyandotte at George
		allStops.put("1285", "254"); // Wyandotte at Sterling
		allStops.put("1283", "255"); // Wyandotte at Strabane
		allStops.put("1281", "256"); // Wyandotte at Belleview
		allStops.put("1279", "257"); // Wyandotte at Drouillard
		allStops.put("1277", "258"); // Wyandotte at St. Luke
		allStops.put("1275", "259"); // Wyandotte at Walker
		allStops.put("1272", "260"); // Wyandotte at Devonshire
		allStops.put("1271", "261"); // Wyandotte at Chilver
		allStops.put("1268", "262"); // Wyandotte at Gladstone
		allStops.put("1266", "263"); // Wyandotte at Hall
		allStops.put("1264", "264"); // Wyandotte at Langlois
		allStops.put("1260", "265"); // Wyandotte at Marentette
		allStops.put("1259", "266"); // Wyandotte at Louis
		allStops.put("1256", "267"); // Wyandotte at Glengarry
		allStops.put("1254", "268"); // Wyandotte at McDougall
		allStops.put("1252", "269"); // Wyandotte at Goyeau
		allStops.put("1249", "270"); // Wyandotte at Ouellette
		allStops.put("1247", "271"); // Wyandotte at Victoria
		allStops.put("1244", "272"); // Wyandotte at Bruce
		allStops.put("1242", "273"); // Wyandotte at Janette
		allStops.put("1240", "274"); // Wyandotte at Crawford
		allStops.put("1238", "275"); // Wyandotte at Wellington
		allStops.put("1236", "276"); // Wyandotte at McKay
		allStops.put("1234", "277"); // Wyandotte at Campbell
		allStops.put("1232", "278"); // Wyandotte at Bridge
		allStops.put("1230", "279"); // Wyandotte at Randolph
		allStops.put("1229", "280"); // Wyandotte at California
		allStops.put("1227", "281"); // Wyandotte at Patricia
		allStops.put("1223", "282"); // Wyandotte at Rosedale
		allStops.put("1221", "283"); // Wyandotte at Mill
		allStops.put("1220", "284"); // Mill at Peter
		allStops.put("1218", "285"); // Sandwich at Brock
		allStops.put("1216", "286"); // Sandwich at Chippawa
		allStops.put("1214", "287"); // Sandwich at South
		allStops.put("1212", "288"); // Sandwich at Watkins
		allStops.put("1210", "289"); // Prince at Peter
		allStops.put("1209", "290"); // Prince at King
		allStops.put("1208", "291"); // College at Prince
		allStops.put("1207", "292"); // College at South
		allStops.put("1206", "293"); // College Ave. at Community Centre
		allStops.put("1116", "294"); // Prince at King
		allStops.put("1211", "295"); // Prince at Peter
		allStops.put("1213", "296"); // Sandwich at Watkins
		allStops.put("1215", "297"); // Sandwich at South
		allStops.put("1217", "298"); // Sandwich at Chippawa
		allStops.put("1219", "299"); // Sandwich at Brock
		allStops.put("1222", "300"); // Wyandotte at Mill
		allStops.put("1224", "301"); // Wyandotte at Rosedale
		allStops.put("1226", "302"); // Wyandotte at Huron Church
		allStops.put("1228", "303"); // Wyandotte at Sunset
		allStops.put("1231", "304"); // Wyandotte at Randolph
		allStops.put("1233", "305"); // Wyandotte at Bridge
		allStops.put("1235", "306"); // Wyandotte at Campbell
		allStops.put("1237", "307"); // Wyandotte at McKay
		allStops.put("1239", "308"); // Wyandotte at Wellington
		allStops.put("1241", "309"); // Wyandotte at Crawford
		allStops.put("1243", "310"); // Wyandotte at Caron
		allStops.put("1245", "311"); // Wyandotte at Bruce
		allStops.put("1248", "312"); // Wyandotte at Victoria
		allStops.put("1250", "313"); // Wyandotte at Ouellette
		allStops.put("1251", "314"); // Wyandotte at Dufferin
		allStops.put("1253", "315"); // Wyandotte at Windsor
		allStops.put("1255", "316"); // Wyandotte at McDougall
		allStops.put("1257", "317"); // Wyandotte at Glengarry
		allStops.put("1258", "318"); // Wyandotte at Aylmer
		allStops.put("1261", "319"); // Wyandotte at Marentette
		allStops.put("1263", "320"); // Wyandotte at Parent
		allStops.put("1265", "321"); // Wyandotte at Marion
		allStops.put("1267", "322"); // Wyandotte at Hall
		allStops.put("1269", "323"); // Wyandotte at Gladstone
		allStops.put("1270", "324"); // Wyandotte at Lincoln
		allStops.put("1273", "325"); // Wyandotte at Devonshire
		allStops.put("1274", "326"); // Wyandotte at Monmouth
		allStops.put("1276", "327"); // Wyandotte at Walker
		allStops.put("1278", "328"); // Wyandotte at Albert
		allStops.put("1280", "329"); // Wyandotte at Drouillard
		allStops.put("1282", "330"); // Wyandotte at Belleview
		allStops.put("1284", "331"); // Wyandotte at Strabane
		allStops.put("1286", "332"); // Wyandotte at Sterling
		allStops.put("1288", "333"); // Wyandotte at George
		allStops.put("1290", "334"); // Wyandotte at Rossini
		allStops.put("1292", "335"); // Wyandotte at Jos. Janisse
		allStops.put("1294", "336"); // Wyandotte at Pillette
		allStops.put("1296", "337"); // Wyandotte at Raymo
		allStops.put("1298", "338"); // Wyandotte at Westminster
		allStops.put("1300", "339"); // Wyandotte at Ford
		allStops.put("1301", "340"); // Wyandotte at Prado
		allStops.put("1303", "341"); // Wyandotte at St. Louis
		allStops.put("1306", "342"); // Wyandotte at Jefferson
		allStops.put("1308", "343"); // Wyandotte at Victor
		allStops.put("1311", "344"); // Wyandotte at St. Marys
		allStops.put("1315", "345"); // Wyandotte at St. Rose
		allStops.put("1317", "346"); // Wyandotte at Edward
		allStops.put("1318", "347"); // Wyandotte at Fairview
		allStops.put("1320", "348"); // Wyandotte at Matthew Brady
		allStops.put("1324", "349"); // Lauzon at Wyandotte
		allStops.put("1326", "350"); // Lauzon at Cedarview
		allStops.put("1328", "351"); // Lauzon at Clairview
		allStops.put("1330", "352"); // Lauzon at Riverside
		allStops.put("1333", "353"); // Riverside at Watson
		allStops.put("1337", "354"); // Riverside at Bayview Towers
		allStops.put("1339", "355"); // Riverside at St Clair Towers
		allStops.put("1341", "356"); // Riverside at Island View Towers
		allStops.put("1343", "357"); // Riverside at Westchester
		allStops.put("1345", "358"); // Riverdale at Cedarview
		allStops.put("1347", "359"); // Riverdale at Menard
		allStops.put("1349", "360"); // Riverdale at Wyandotte
		allStops.put("1351", "361"); // Riverdale at Jerome
		allStops.put("1353", "362"); // Riverdale at St. Rose
		allStops.put("1356", "363"); // Little River Acres at Abbey
		allStops.put("1358", "364"); // Little River Acres at Aire
		allStops.put("1360", "365"); // Little RiverAcres at Copperfield
		allStops.put("1362", "366"); // Little River Acres at East Moor
		allStops.put("1364", "367"); // Little RiverAcres at LittleRiver
		allStops.put("1365", "368"); // Little River at Laporte
		allStops.put("1366", "369"); // Lauzon Road at Edgar
		allStops.put("1367", "370"); // Lauzon Rd. at ABC Day Nursery
		allStops.put("1369", "371"); // Lauzon at Tranby
		allStops.put("1371", "372"); // Lauzon Parkway at Lauzon Line
		allStops.put("1373", "373"); // Lauzon Parkway at VIA Tracks
		allStops.put("1376", "374"); // College Ave. at Community Centre
		allStops.put("1377", "375"); // South at College
		allStops.put("1378", "376"); // South at Wells
		allStops.put("1379", "377"); // Girardot at South
		allStops.put("1380", "378"); // Girardot at Strathmore
		allStops.put("1383", "379"); // Connaught at Chappell
		allStops.put("1386", "380"); // Sun Valley at Greenview
		allStops.put("1388", "381"); // Sun Valley at Malden
		allStops.put("1389", "382"); // Brunet at Industrial
		allStops.put("1391", "383"); // Industrial at Ambassador
		allStops.put("1392", "384"); // Ambassador at Urgent Care
		allStops.put("1393", "385"); // Ambassador at Malden
		allStops.put("1394", "386"); // Daytona at Malden
		allStops.put("1395", "387"); // Daytona at Totten
		allStops.put("1397", "388"); // Northway at Algonquin
		allStops.put("1399", "389"); // Tecumseh at Northway
		allStops.put("1401", "390"); // Tecumseh at California
		allStops.put("1403", "391"); // Tecumseh at Randolph
		allStops.put("1405", "392"); // Tecumseh at Bridge
		allStops.put("1408", "393"); // Tecumseh at Campbell
		allStops.put("1410", "394"); // Tecumseh at Curry
		allStops.put("1413", "395"); // Crawford at Tecumseh
		allStops.put("1416", "396"); // Crawford at Grove
		allStops.put("1418", "397"); // Crawford at Erie
		allStops.put("1420", "398"); // Crawford at College
		allStops.put("1422", "399"); // Crawford at Elliott
		allStops.put("1425", "400"); // Crawford at Wyandotte
		allStops.put("1429", "401"); // Erie at Ouellette
		allStops.put("1430", "402"); // Erie at Goyeau
		allStops.put("1431", "403"); // Erie at McDougall
		allStops.put("1435", "404"); // Erie at Howard
		allStops.put("1437", "405"); // Erie at Louis
		allStops.put("1438", "406"); // Erie at Elsmere
		allStops.put("1441", "407"); // Erie at Marion
		allStops.put("1444", "408"); // Erie at Hall
		allStops.put("1914", "409"); // Gladstone at Erie
		allStops.put("1447", "410"); // Richmond at Lincoln
		allStops.put("1449", "411"); // Richmond at Kildare
		allStops.put("1451", "412"); // Richmond at Argyle
		allStops.put("1452", "413"); // Richmond at Walker
		allStops.put("1455", "414"); // Richmond at St. Luke
		allStops.put("1457", "415"); // Richmond at Drouillard
		allStops.put("1459", "416"); // Drouillard at Ontario
		allStops.put("1461", "417"); // Drouillard at Franklin
		allStops.put("1322", "418"); // Drouillard at Metcalfe
		allStops.put("1464", "419"); // Drouillard at Seminole
		allStops.put("1466", "420"); // Drouillard at Reginald
		allStops.put("1468", "421"); // Drouillard at Alice
		allStops.put("1470", "422"); // Drouillard at Milloy
		allStops.put("1472", "423"); // Drouillard at Tecumseh
		allStops.put("1474", "424"); // George at Tecumseh
		allStops.put("1331", "425"); // George at Guy
		allStops.put("1476", "426"); // George at Milloy
		allStops.put("1478", "427"); // George at Alice
		allStops.put("1480", "428"); // George at Reginald
		allStops.put("1572", "429"); // Seminole at George
		allStops.put("1574", "430"); // Seminole at Rossini
		allStops.put("1577", "431"); // Seminole at Francois
		allStops.put("1483", "432"); // Seminole at Pillette
		allStops.put("1485", "433"); // Pillette at Reginald
		allStops.put("1487", "434"); // Pillette at Alice
		allStops.put("1489", "435"); // Pillette at Milloy
		allStops.put("1491", "436"); // Pillette at Guy
		allStops.put("1493", "437"); // Pillette at Tecumseh
		allStops.put("1495", "438"); // Pillette at Adstoll
		allStops.put("1497", "439"); // Pillette at Grand Marais
		allStops.put("1501", "440"); // Pillette at Plymouth
		allStops.put("1503", "441"); // Plymouth at Robert
		allStops.put("1505", "442"); // Plymouth at Tourangeau
		allStops.put("1506", "443"); // Plymouth at Grand Marais
		allStops.put("1507", "444"); // Central at Temple
		allStops.put("1508", "445"); // Mannheim at Deziel
		allStops.put("1509", "446"); // St. Etienne at Kautex
		allStops.put("1510", "447"); // Kautex at Deziel
		allStops.put("1511", "448"); // Deziel at Mannheim
		allStops.put("1512", "449"); // Deziel at Central
		allStops.put("1513", "450"); // Rhodes at Wheelton
		allStops.put("1514", "451"); // Rhodes at Electricity
		allStops.put("1515", "452"); // Rhodes at Jamieson
		allStops.put("1516", "453"); // Rhodes at Enwin
		allStops.put("1517", "454"); // Rhodes at Pillette
		allStops.put("1518", "455"); // Rhodes at Fuller Construction
		allStops.put("1335", "456"); // Rhodes at Jefferson
		allStops.put("1357", "457"); // Jefferson at E.C. Row
		allStops.put("1519", "458"); // North Service at Jefferson
		allStops.put("1520", "459"); // North Service at Clemenceau
		allStops.put("1521", "460"); // North Service at Tracks
		allStops.put("1522", "461"); // North Service Road at Pillette
		allStops.put("1332", "462"); // Service Road at Electrical Union
		allStops.put("1524", "463"); // Transit Centre Front Entrance
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
		allStops.put("2051", "521"); // Transit Terminal at Chatham
		allStops.put("1656", "522"); // Essex Way at Meadowbrook
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
		allStops.put("1662", "565"); // Walker at Ontario
		allStops.put("1560", "566"); // Ottawa at Monmouth
		allStops.put("1557", "567"); // Ottawa at Kildare
		allStops.put("1555", "568"); // Ottawa at Lincoln
		allStops.put("1552", "569"); // Ottawa at Gladstone
		allStops.put("1550", "570"); // Ottawa at Hall
		allStops.put("1548", "571"); // Ottawa at Benjamin
		allStops.put("1545", "572"); // Parent at Ottawa
		allStops.put("2064", "573"); // Parent at Giles
		allStops.put("1529", "574"); // Transit Windsor Terminal
		allStops.put("1660", "575"); // Cantelon at Kew
		allStops.put("1659", "576"); // Cantelon at Lauzon Parkway
		allStops.put("1564", "577"); // Seminole at Albert
		allStops.put("1562", "578"); // Seminole at Walker
		allStops.put("1543", "579"); // Giles at Elsmere
		allStops.put("1541", "580"); // Giles at Louis
		allStops.put("1539", "581"); // Giles at Howard
		allStops.put("1536", "582"); // Giles at McDougall
		allStops.put("1534", "583"); // Giles at Windsor
		allStops.put("1532", "584"); // Giles at Ouellette
		allStops.put("2063", "585"); // Giles at Parent
		allStops.put("1546", "586"); // Ottawa at Parent
		allStops.put("1549", "587"); // Ottawa at Pierre
		allStops.put("1551", "588"); // Ottawa at Moy
		allStops.put("1553", "589"); // Ottawa at Gladstone
		allStops.put("1554", "590"); // Ottawa at Lincoln
		allStops.put("1556", "591"); // Ottawa at Kildare
		allStops.put("1559", "592"); // Ottawa at Walker
		allStops.put("1661", "593"); // Walker at Ontario
		allStops.put("1565", "594"); // Seminole at Drouillard
		allStops.put("1567", "595"); // Seminole at Chandler
		allStops.put("1569", "596"); // Seminole at Central
		allStops.put("1571", "597"); // Seminole at Westcott
		allStops.put("1579", "598"); // Pillette at Seminole
		allStops.put("1581", "599"); // Pillette at Metcalfe
		allStops.put("1583", "600"); // Pillette at South National
		allStops.put("1585", "601"); // Pillette at Ontario
		allStops.put("1587", "602"); // Pillette at Wyandotte
		allStops.put("1590", "603"); // Jefferson at Ontario
		allStops.put("1592", "604"); // Jefferson at Raymond
		allStops.put("1594", "605"); // Jefferson at Edgar
		allStops.put("1596", "606"); // South National at Jefferson
		allStops.put("1598", "607"); // South National at Balfour
		allStops.put("1600", "608"); // South National at Ferndale
		allStops.put("1602", "609"); // South National at Ford
		allStops.put("1604", "610"); // Ford at Reginald
		allStops.put("1606", "611"); // Ford at Lassaline
		allStops.put("1608", "612"); // Ford at Coronation
		allStops.put("1610", "613"); // Ford at Empress
		allStops.put("1612", "614"); // Rivard at Joinville
		allStops.put("1614", "615"); // Rivard at Haig
		allStops.put("1616", "616"); // Rivard at Grand
		allStops.put("1618", "617"); // Rivard at Ambassador Church
		allStops.put("1620", "618"); // Rivard at Queen Elizabeth
		allStops.put("1622", "619"); // Queen Elizabeth at Clarence
		allStops.put("1625", "620"); // Queen Elizabeth at Harmony
		allStops.put("1628", "621"); // Queen Elizabeth at Clemenceau
		allStops.put("1630", "622"); // Clemenceau at Roosevelt
		allStops.put("1632", "623"); // Clemenceau at Grand
		allStops.put("1634", "624"); // Clemenceau at Haig
		allStops.put("1636", "625"); // Clemenceau at Joinville
		allStops.put("1159", "626"); // Rose at Clemenceau
		allStops.put("1642", "627"); // Lauzon Rd. at Yolanda
		allStops.put("1644", "628"); // Lauzon Rd. at Hawthorne
		allStops.put("1646", "629"); // Hawthorne at Sycamore
		allStops.put("1648", "630"); // Meadowbrook at Hawthorne
		allStops.put("1650", "631"); // Meadowbrook at Parkside Estates
		allStops.put("1652", "632"); // Meadowbrook at Optimist Park
		allStops.put("1654", "633"); // Meadowbrook at Essex Way
		allStops.put("1531", "634"); // Giles at Ouellette
		allStops.put("1533", "635"); // Giles at Goyeau
		allStops.put("1535", "636"); // Giles at McDougall
		allStops.put("1538", "637"); // Giles at Howard
		allStops.put("1542", "638"); // Giles at Marentette
		allStops.put("1544", "639"); // Giles at Parent
		allStops.put("1561", "640"); // Seminole at Walker
		allStops.put("1563", "641"); // Seminole at Albert
		allStops.put("1734", "642"); // St. Clair College Front Entrance
		allStops.put("1817", "643"); // Cousineau at Highway 3
		allStops.put("1816", "644"); // Cousineau at Mount Royal
		allStops.put("1814", "645"); // Cousineau at Casgrain
		allStops.put("1813", "646"); // Cousineau at Country Club
		allStops.put("1809", "647"); // Country Club at Hunt Club
		allStops.put("1807", "648"); // Country Club at Shade Tree
		allStops.put("1804", "649"); // Country Club at Lake Trail
		allStops.put("1800", "650"); // Howard at North Talbot
		allStops.put("1799", "651"); // Howard at Wallace
		allStops.put("1797", "652"); // Howard at Ducharme
		allStops.put("1794", "653"); // Howard at Morand
		allStops.put("1792", "654"); // Cabana at Howard
		allStops.put("1791", "655"); // Cabana at Huntington
		allStops.put("1788", "656"); // Cabana at Dougall
		allStops.put("1786", "657"); // Dougall at Granada
		allStops.put("1784", "658"); // Dougall at Medina
		allStops.put("1782", "659"); // Dougall at Beals
		allStops.put("1387", "660"); // Dougall at Liberty
		allStops.put("1780", "661"); // Dougall at Norfolk
		allStops.put("1777", "662"); // Dougall at Nottingham Walmart
		allStops.put("1390", "663"); // Dougall Town Centre
		allStops.put("1775", "664"); // Dougall at West Grand
		allStops.put("1773", "665"); // Dougall at South Cameron
		allStops.put("1771", "666"); // Eugenie at Dougall
		allStops.put("1769", "667"); // Dougall at Rose Bowl
		allStops.put("1767", "668"); // Dougall at Dougall Square
		allStops.put("1763", "669"); // Dougall at Brentwood
		allStops.put("1761", "670"); // Dougall at Wear
		allStops.put("1759", "671"); // Tecumseh at York
		allStops.put("1757", "672"); // Bruce at Hanna
		allStops.put("1753", "673"); // Bruce at Shepherd
		allStops.put("1751", "674"); // Bruce at Clinton
		allStops.put("1749", "675"); // Bruce at Giles
		allStops.put("1747", "676"); // Bruce at Pine
		allStops.put("1745", "677"); // Bruce at Erie
		allStops.put("1433", "678"); // Bruce at Caroline
		allStops.put("1743", "679"); // Bruce at Elliott
		allStops.put("1742", "680"); // Bruce at Wyandotte
		allStops.put("1740", "681"); // Bruce at Park
		allStops.put("1738", "682"); // Bruce at University
		allStops.put("1737", "683"); // Transit Terminal at Chatham
		allStops.put("1739", "684"); // Janette at Park
		allStops.put("1741", "685"); // Janette at Wyandotte
		allStops.put("1382", "686"); // Janette at Elliott
		allStops.put("1384", "687"); // Janette at Caroline
		allStops.put("1385", "688"); // Erie at Janette
		allStops.put("1744", "689"); // Erie at Church
		allStops.put("1746", "690"); // Dougall at Pine
		allStops.put("1748", "691"); // Dougall at Giles
		allStops.put("1750", "692"); // Dougall at Montrose
		allStops.put("1752", "693"); // Dougall at Ellis
		allStops.put("1754", "694"); // Dougall at Shepherd
		allStops.put("1756", "695"); // Dougall at Hanna
		allStops.put("1758", "696"); // Dougall at Tecumseh
		allStops.put("1760", "697"); // Dougall at Wear
		allStops.put("1762", "698"); // Dougall at Jackson Park
		allStops.put("1764", "699"); // Dougall at Windsor Sportsmen
		allStops.put("1766", "700"); // Dougall at Dorwin Plaza
		allStops.put("1768", "701"); // Dougall at Dougall Plaza
		allStops.put("1770", "702"); // Eugenie at Pellisier
		allStops.put("1774", "703"); // Dougall at South Cameron
		allStops.put("1776", "704"); // Dougall at West Grand
		allStops.put("1778", "705"); // Dougall at Nottingham Walmart
		allStops.put("1779", "706"); // Dougall at Norfolk
		allStops.put("1781", "707"); // Dougall at Liberty
		allStops.put("1783", "708"); // Dougall at Beals
		allStops.put("1785", "709"); // Dougall at Medina
		allStops.put("1787", "710"); // Dougall at Granada
		allStops.put("1789", "711"); // Cabana at Dougall
		allStops.put("1790", "712"); // Cabana at Huntington
		allStops.put("1793", "713"); // Cabana at Howard
		allStops.put("1795", "714"); // Howard at Morand
		allStops.put("1796", "715"); // Howard at Ducharme
		allStops.put("1798", "716"); // Howard at Wallace
		allStops.put("1801", "717"); // Howard at Neal
		allStops.put("1803", "718"); // Country Club at Tournament
		allStops.put("1806", "719"); // Country Club at Rodfam
		allStops.put("1808", "720"); // Country Club at Hunt Club
		allStops.put("1810", "721"); // Country Club at Cousineau
		allStops.put("1812", "722"); // Cousineau at Casgrain
		allStops.put("1815", "723"); // Cousineau at Mt. Royal
		allStops.put("1732", "724"); // Cousineau at Highway 3
		allStops.put("1736", "725"); // Geraedts at St. Clair Residence
		allStops.put("1866", "726"); // Cabana at Geraedts
		allStops.put("1868", "727"); // Cabana at Longfellow
		allStops.put("1870", "728"); // Cabana at McGraw
		allStops.put("1869", "729"); // Cabana at McGraw
		allStops.put("1867", "730"); // Cabana at Dominion
		allStops.put("1894", "731"); // Transit Terminal Church at Pitt
		allStops.put("1895", "732"); // Riverside at Ouellette
		allStops.put("1897", "733"); // Riverside at McDougall
		allStops.put("1900", "734"); // Riverside at Aylmer
		allStops.put("1902", "735"); // Riverside at Parent
		allStops.put("1818", "736"); // Riverside at Langlois
		allStops.put("1904", "737"); // Riverside at Hall
		allStops.put("1864", "738"); // Riverside at Gladstone
		allStops.put("1906", "739"); // Gladstone at Assumption
		allStops.put("1908", "740"); // Gladstone at Wyandotte
		allStops.put("1910", "741"); // Gladstone at Cataraqui
		allStops.put("1912", "742"); // Gladstone at Niagara
		allStops.put("1916", "743"); // Gladstone at Richmond
		allStops.put("1918", "744"); // Gladstone at Giles
		allStops.put("1920", "745"); // Gladstone at Ottawa
		allStops.put("1865", "746"); // Gladstone at Ellis
		allStops.put("1922", "747"); // Shepherd at Lincoln
		allStops.put("1924", "748"); // Lincoln at ETR Rail Tracks
		allStops.put("1926", "749"); // Lincoln at Seneca
		allStops.put("1928", "750"); // Lincoln at Tecumseh
		allStops.put("1930", "751"); // Lincoln at Lens
		allStops.put("1932", "752"); // Lincoln at Vimy
		allStops.put("1934", "753"); // Lincoln at Ypres
		allStops.put("1936", "754"); // Ypres at Kildare
		allStops.put("1938", "755"); // Ypres at Turner
		allStops.put("1940", "756"); // Walker at Somme
		allStops.put("1942", "757"); // Walker at St. Julien
		allStops.put("1944", "758"); // Walker at Grand Marais
		allStops.put("1946", "759"); // Walker at Parkdale
		allStops.put("1948", "760"); // Walker at Digby
		allStops.put("1950", "761"); // Walker at Sydney
		allStops.put("1952", "762"); // Walker at Seymour
		allStops.put("1954", "763"); // Walker at Foster
		allStops.put("1956", "764"); // Walker at Lappan
		allStops.put("1958", "765"); // Walker at Calderwood
		allStops.put("1960", "766"); // Walker at Melinda
		allStops.put("1962", "767"); // Walker at Ledyard
		allStops.put("1772", "768"); // Walker at Moxley
		allStops.put("1965", "769"); // Walker at Division
		allStops.put("1967", "770"); // Walker at Home Depot Plaza
		allStops.put("1970", "771"); // Walker at Canada Post
		allStops.put("1972", "772"); // Walker at Best Buy
		allStops.put("1974", "773"); // Walker at Costco
		allStops.put("1976", "774"); // Walker at Legacy Park
		allStops.put("1978", "775"); // Walker at Provincial
		allStops.put("1980", "776"); // Walker at Ducharme
		allStops.put("1982", "777"); // Walker at Highway 401
		allStops.put("1984", "778"); // Walker at U-Haul
		allStops.put("1986", "779"); // Walker at North Talbot
		allStops.put("1988", "780"); // North Talbot at Halford
		allStops.put("1990", "781"); // North Talbot at Burke
		allStops.put("1992", "782"); // North Talbot at Dumouchelle
		allStops.put("1994", "783"); // North Talbot at Old West
		allStops.put("1995", "784"); // North Talbot at Pioneer
		allStops.put("1997", "785"); // Sixth Concession at North Talbot
		allStops.put("1993", "786"); // Sixth Concession at Holburn
		allStops.put("1991", "787"); // Holburn at Spago
		allStops.put("1989", "788"); // Ducharme at Holburn
		allStops.put("1987", "789"); // Ducharme at Canberra
		allStops.put("1985", "790"); // Ducharme at Periwinkle
		allStops.put("1983", "791"); // Ducharme at Fontana
		allStops.put("1981", "792"); // Ducharme at Lavender
		allStops.put("1979", "793"); // Ducharme at Walker
		allStops.put("1977", "794"); // Walker at Provincial
		allStops.put("1975", "795"); // Walker at 7th Concession
		allStops.put("1973", "796"); // Walker at Walker Crossings
		allStops.put("1971", "797"); // Walker at Canadian Tire
		allStops.put("1969", "798"); // Walker at Ferrari Plaza
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
		allStops.put("1968", "839"); // Airport at Front Entrance
		allStops.put("1877", "840"); // Devonshire Mall at Moxies
		allStops.put("2113", "841"); // Marentette at EC Row Ave
		allStops.put("2112", "842"); // E.C. Row Ave at Devon
		allStops.put("2105", "843"); // E.C Row Ave at Conservation
		allStops.put("2103", "844"); // N. Service Rd.at Jennifer
		allStops.put("2101", "845"); // N. Service Rd. at Langlois
		allStops.put("2099", "846"); // Grand Marais at Langlois
		allStops.put("2097", "847"); // Grand Marais at South Pacific
		allStops.put("2095", "848"); // Grand Marais at Garvey
		allStops.put("2093", "849"); // Slater at Hartford
		allStops.put("2089", "850"); // Slater at Southdale
		allStops.put("2087", "851"); // Southdale at Bramley
		allStops.put("2085", "852"); // South Pacific at Southdale
		allStops.put("2083", "853"); // South Pacific at Jeremiah
		allStops.put("2081", "854"); // South Pacific at Parent
		allStops.put("2079", "855"); // Eugenie at South Pacific
		allStops.put("2077", "856"); // Eugenie at Remington
		allStops.put("2074", "857"); // Howard at Tecumseh
		allStops.put("2073", "858"); // Parent at Tecumseh
		allStops.put("2071", "859"); // Parent at Hanna
		allStops.put("2069", "860"); // Parent at Shepherd
		allStops.put("2067", "861"); // Parent at Ellis
		allStops.put("2061", "862"); // Howard at Erie
		allStops.put("2060", "863"); // Howard at Elliott
		allStops.put("2058", "864"); // Aylmer at Wyandotte
		allStops.put("2056", "865"); // Aylmer at Assumption
		allStops.put("2054", "866"); // Chatham at Glengarry
		allStops.put("2053", "867"); // Chatham at Goyeau
		allStops.put("2052", "868"); // Ferry at Riverside
		allStops.put("2055", "869"); // Glengarry at University
		allStops.put("2057", "870"); // Glengarry at Wyandotte
		allStops.put("2059", "871"); // Howard at Elliott
		allStops.put("2065", "872"); // Parent at Ottawa
		allStops.put("2066", "873"); // Parent at Ellis
		allStops.put("2068", "874"); // Parent at Shepherd
		allStops.put("2070", "875"); // Parent at Hanna
		allStops.put("1108", "876"); // Tecumseh at Marentette
		allStops.put("2075", "877"); // Eugenie at Howard
		allStops.put("2076", "878"); // Eugenie at Lillian
		allStops.put("2080", "879"); // South Pacific at Parent
		allStops.put("2082", "880"); // South Pacific at Jeremiah
		allStops.put("2084", "881"); // Southdale at South Pacific
		allStops.put("2086", "882"); // Southdale at Southridge
		allStops.put("2088", "883"); // Slater at Southdale
		allStops.put("2092", "884"); // Slater at Grand Marais
		allStops.put("2094", "885"); // Grand Marais at Southdale
		allStops.put("2096", "886"); // Grand Marais at Garvey
		allStops.put("2098", "887"); // Grand Marais at South Pacific
		allStops.put("2100", "888"); // Grand Marais at Langlois
		allStops.put("2102", "889"); // N. Service Rd.at Langlois
		allStops.put("2104", "890"); // N. Service Rd. at Conservation
		allStops.put("2106", "891"); // Conservation at E.C. Row Ave
		allStops.put("2108", "892"); // E.C. Row Ave at Parkwood
		allStops.put("1765", "893"); // Sydney at Windsor Commons
		allStops.put("2116", "894"); // Windsor Transit Terminal
		allStops.put("2117", "895"); // Goyeau at Pitt
		allStops.put("2118", "896"); // City Hall Square
		allStops.put("2119", "897"); // Canada Tunnel Plaza Duty Free
		allStops.put("2126", "898"); // Congress at Beaubien
		allStops.put("2127", "899"); // Congress at Randolph
		allStops.put("2132", "900"); // Griswold at Congress
		allStops.put("2129", "901"); // Washington at Jefferson
		allStops.put("2130", "902"); // Fort at Cass
		allStops.put("2131", "903"); // Cass at Lafayette
		allStops.put("2135", "904"); // Rosa Parks Transit Center
		allStops.put("2134", "905"); // Michigan at Washington
		allStops.put("2124", "906"); // Tunnel Platform at Mariner's
		allStops.put("2122", "907"); // McDougall at Wyandotte
		allStops.put("2120", "908"); // McDougall at University Avenue
		allStops.put("1755", "909"); // Chatham at Goyeau
		allStops.put("1831", "910"); // Chatham at Ouellette
		allStops.put("1528", "911"); // Crawford at University
		allStops.put("1526", "912"); // Crawford at Riverside
		allStops.put("1664", "913"); // Riverside at Caron
		allStops.put("1665", "914"); // Riverside at Caron
		allStops.put("1525", "915"); // Crawford at Riverside
		allStops.put("1527", "916"); // Crawford at University
		allStops.put("1893", "917"); // Legacy Park at Sears Home
		allStops.put("1892", "918"); // Division at Walker
		allStops.put("1537", "919"); // Division at Bliss
		allStops.put("1890", "920"); // Division at Woodward
		allStops.put("1889", "921"); // Division at Conservation Area
		allStops.put("1887", "922"); // Division at Clarke
		allStops.put("1876", "923"); // Howard at Kenilworth
		allStops.put("1874", "924"); // Howard at Maguire
		allStops.put("1871", "925"); // Cabana at Dougall
		allStops.put("1540", "926"); // Cabana at Granada
		allStops.put("1547", "927"); // Cabana at Casgrain
		allStops.put("1863", "928"); // Geraedts at St. Clair Residence
		allStops.put("1862", "929"); // Cabana at Geraedts
		allStops.put("1860", "930"); // Cabana at Randolph
		allStops.put("1638", "931"); // Cabana at Askin
		allStops.put("1858", "932"); // Cabana at Northway
		allStops.put("1627", "933"); // Todd Lane at Tenth
		allStops.put("1854", "934"); // Todd Lane at Ninth
		allStops.put("1624", "935"); // Todd Lane at Oxley
		allStops.put("1852", "936"); // Todd Lane at Canada
		allStops.put("1850", "937"); // Todd Lane at Fifth
		allStops.put("1848", "938"); // Todd Lane at Third
		allStops.put("1847", "939"); // Malden at Orford
		allStops.put("1845", "940"); // Malden at Delmar
		allStops.put("1843", "941"); // Sprucewood at Malden
		allStops.put("1575", "942"); // Sprucewood at Newman
		allStops.put("1841", "943"); // Sprucewood at Woodmont
		allStops.put("1839", "944"); // Sprucewood at Abbott
		allStops.put("1837", "945"); // Sprucewood at Kingsley
		allStops.put("1558", "946"); // Sprucewood at Matchette
		allStops.put("1833", "947"); // Marigold at Weaver
		allStops.put("1830", "948"); // Matchette at Titcombe
		allStops.put("1828", "949"); // Matchette at Armanda
		allStops.put("1826", "950"); // Matchette at Carmichael
		allStops.put("1824", "951"); // Matchette at Chappell
		allStops.put("1822", "952"); // Prince at Vaughan
		allStops.put("1821", "953"); // Prince at Mulford
		allStops.put("1820", "954"); // Prince at Wells
		allStops.put("1819", "955"); // College Ave. at Community Centre
		allStops.put("1823", "956"); // Matchette at Chappell
		allStops.put("1825", "957"); // Matchette at Carmichael
		allStops.put("1827", "958"); // Matchette at Broadway
		allStops.put("1829", "959"); // Matchette at Titcombe
		allStops.put("1835", "960"); // Sprucewood at Matchette
		allStops.put("1836", "961"); // Sprucewood at Kingsley
		allStops.put("1838", "962"); // Sprucewood at Abbott
		allStops.put("1840", "963"); // Sprucewood at Woodmont
		allStops.put("1482", "964"); // Sprucewood at Newman
		allStops.put("1842", "965"); // Sprucewood at Malden
		allStops.put("1844", "966"); // Malden at Delmar
		allStops.put("1846", "967"); // Malden at Todd Lane
		allStops.put("1849", "968"); // Todd Lane at Elmdale
		allStops.put("1851", "969"); // Todd Lane at Wayne
		allStops.put("1853", "970"); // Todd Lane at Canada
		allStops.put("1499", "971"); // Todd Lane at Bishop
		allStops.put("1855", "972"); // Todd Lane at Ninth
		allStops.put("1856", "973"); // Todd Lane at Tenth
		allStops.put("1857", "974"); // Cabana at Northway
		allStops.put("1523", "975"); // Cabana at Borrelli
		allStops.put("1859", "976"); // Cabana at Southwinds
		allStops.put("1861", "977"); // Cabana at Roxborough
		allStops.put("1473", "978"); // Cabana at Casgrain
		allStops.put("1415", "979"); // Cabana at Granada
		allStops.put("1872", "980"); // Howard at Cabana
		allStops.put("1873", "981"); // Howard at Maguire
		allStops.put("1875", "982"); // Howard at Kenilworth
		allStops.put("1880", "983"); // Marentette at Foster
		allStops.put("1882", "984"); // Marentette at Division
		allStops.put("1883", "985"); // Provincial at Clarke
		allStops.put("1409", "986"); // Provincial at Cabana
		allStops.put("1884", "987"); // Provincial at Humane Society
		allStops.put("1885", "988"); // Provincial at Sixth Concession
		allStops.put("1886", "989"); // Provincial at Lone Pine
		allStops.put("1888", "990"); // Provincial at Monarch Basics
		allStops.put("1891", "991"); // Provincial at Legacy Park
		allStops.put("1663", "992"); // Windsor Transit Terminal
		allStops.put("1667", "993"); // Riverside at Oak
		allStops.put("1669", "994"); // Riverside at McKay
		allStops.put("1671", "995"); // Campbell at Riverside
		allStops.put("1673", "996"); // Campbell at University
		allStops.put("1305", "997"); // Campbell at Martindale
		allStops.put("1675", "998"); // Campbell at Wyandotte
		allStops.put("1677", "999"); // Campbell at Rooney
		allStops.put("1679", "1000"); // Campbell at College
		allStops.put("1681", "1001"); // Campbell at Adanac
		allStops.put("1683", "1002"); // Campbell at Grove
		allStops.put("1685", "1003"); // Campbell at Taylor
		allStops.put("1687", "1004"); // Campbell at Pelletier
		allStops.put("1689", "1005"); // Campbell at Tecumseh
		allStops.put("1690", "1006"); // Campbell at Everts
		allStops.put("1692", "1007"); // Campbell at Curry
		allStops.put("1694", "1008"); // Dominion at Totten
		allStops.put("1696", "1009"); // Dominion at Arcadia
		allStops.put("1698", "1010"); // Dominion at McKay
		allStops.put("1700", "1011"); // Dominion at Ojibway
		allStops.put("1702", "1012"); // Dominion at Holy Names
		allStops.put("1703", "1013"); // Dominion at Northwood
		allStops.put("1706", "1014"); // Dominion at E.C. Row
		allStops.put("1708", "1015"); // Dominion at Labelle
		allStops.put("1711", "1016"); // Dominion at Grand Marais
		allStops.put("1713", "1017"); // Dominion at Norfolk
		allStops.put("1715", "1018"); // Dominion at Richardie
		allStops.put("1717", "1019"); // Dominion at Beals
		allStops.put("1719", "1020"); // Dominion at Roselawn
		allStops.put("1721", "1021"); // Dominion at Cabana
		allStops.put("1723", "1022"); // Mount Royal at Cabana
		allStops.put("1725", "1023"); // Mount Royal at Villa Maria North
		allStops.put("1726", "1024"); // Mount Royal at Villa Maria South
		allStops.put("1728", "1025"); // Mount Royal at Mitchell
		allStops.put("1730", "1026"); // Mount Royal at Cousineau
		allStops.put("1735", "1027"); // Glenwood at Cabana
		allStops.put("1246", "1028"); // Glenwood at St. Gabriel
		allStops.put("1733", "1029"); // Beals at Roxborough
		allStops.put("1731", "1030"); // Beals at Rankin
		allStops.put("1729", "1031"); // Rankin at Liberty
		allStops.put("1727", "1032"); // Norfolk at Rankin
		allStops.put("1724", "1033"); // Norfolk at California
		allStops.put("1722", "1034"); // California at Grand Marais
		allStops.put("1720", "1035"); // Grand Marais at Northway
		allStops.put("1718", "1036"); // Labelle at Northway
		allStops.put("1716", "1037"); // Labelle at California
		allStops.put("1714", "1038"); // Labelle at St. Patricks
		allStops.put("1710", "1039"); // Labelle at Orion
		allStops.put("1709", "1040"); // Labelle at Everts
		allStops.put("1707", "1041"); // Labelle at Dominion
		allStops.put("1705", "1042"); // Dominion at E.C. Row
		allStops.put("1704", "1043"); // Dominion at Northwood
		allStops.put("1701", "1044"); // Dominion at Holy Names
		allStops.put("1699", "1045"); // Dominion at Ojibway
		allStops.put("1697", "1046"); // Dominion at McKay
		allStops.put("1695", "1047"); // Dominion at Arcadia
		allStops.put("1693", "1048"); // Campbell at Totten
		allStops.put("1691", "1049"); // Campbell at Curry
		allStops.put("1154", "1050"); // Campbell at Mark
		allStops.put("1688", "1051"); // Campbell at Tecumseh
		allStops.put("1686", "1052"); // Campbell at Pelletier
		allStops.put("1684", "1053"); // Campbell at Taylor
		allStops.put("1682", "1054"); // Campbell at Grove
		allStops.put("1680", "1055"); // Campbell at Adanac
		allStops.put("1678", "1056"); // Campbell at College
		allStops.put("1676", "1057"); // Campbell at Rooney
		allStops.put("1674", "1058"); // Campbell at Wyandotte
		allStops.put("1381", "1059"); // Campbell at Martindale
		allStops.put("1672", "1060"); // Campbell at University
		allStops.put("1670", "1061"); // Campbell at Riverside
		allStops.put("1668", "1062"); // Riverside at McKay
		allStops.put("1666", "1063"); // Riverside at Oak
		allStops.put("2050", "1064"); // McHugh at Lauzon
		allStops.put("2049", "1065"); // McHugh at Darfield
		allStops.put("2047", "1066"); // McHugh at Mickey Renuad Way
		allStops.put("2046", "1067"); // McHugh at Cypress
		allStops.put("2045", "1068"); // McHugh at Clover
		allStops.put("2042", "1069"); // Clover at Firgrove
		allStops.put("2040", "1070"); // Clover at Little River
		allStops.put("2037", "1071"); // Little River at Pearson
		allStops.put("2035", "1072"); // Little River at Chateau
		allStops.put("2032", "1073"); // Little River at Banwell
		allStops.put("2029", "1074"); // Little River at Jarvis
		allStops.put("2027", "1075"); // Cora Greenwood at Little River
		allStops.put("2025", "1076"); // Cora Green at Castle Hill
		allStops.put("2023", "1077"); // Cora Green at Dillon
		allStops.put("2021", "1078"); // Cora Green at Riverside
		allStops.put("2020", "1079"); // Riverside at Jarvis
		allStops.put("2019", "1080"); // Greenpark at Amalfi
		allStops.put("2018", "1081"); // Wyandotte at Greenpark
		allStops.put("2017", "1082"); // Wyandotte at Clover
		allStops.put("2016", "1083"); // Wyandotte at Florence
		allStops.put("2015", "1084"); // Wyandotte at Martinique
		allStops.put("2014", "1085"); // Wyandotte at Greendale
		allStops.put("2013", "1086"); // Wyandotte at Westchester
		allStops.put("2012", "1087"); // Wyandotte at Isack
		allStops.put("2011", "1088"); // Wyandotte at Riverside Plaza
		allStops.put("2010", "1089"); // Wyandotte at Watson
		allStops.put("2009", "1090"); // Lauzon Rd. at Wyandotte
		allStops.put("2008", "1091"); // Lauzon Road at St. Rose
		allStops.put("1998", "1092"); // Tecumseh Mall Rear Entrance
		allStops.put("2048", "1093"); // WFCU Centre Main Entrance
		allStops.put("2007", "1094"); // Lauzon Rd. at Lilac
		allStops.put("1999", "1095"); // Lauzon at Vince
		allStops.put("2000", "1096"); // Lauzon at Forest Glade
		allStops.put("2001", "1097"); // Forest Glade at Meadowbrook
		allStops.put("2002", "1098"); // Anchor at Twin Oaks
		allStops.put("2003", "1099"); // Anchor at Green Shield
		allStops.put("2004", "1100"); // Anchor at CS Wind
		allStops.put("2006", "1101"); // Anchor at Jamison Entrance
		allStops.put("2005", "1102"); // Banwell at Wildwood
		allStops.put("2022", "1103"); // Banwell at Palmetto
		allStops.put("2024", "1104"); // Banwell at Tecumseh
		allStops.put("2028", "1105"); // McHugh at Questa
		allStops.put("2030", "1106"); // McHugh at Trappers
		allStops.put("2031", "1107"); // McHugh at Venetian
		allStops.put("2033", "1108"); // McHugh at Clover
		allStops.put("2034", "1109"); // McHugh at Cypress
		allStops.put("2038", "1110"); // McHugh at Micky Renaud Way
		allStops.put("2041", "1111"); // McHugh at Darfield
		allStops.put("2043", "1112"); // Lauzon Rd. at McHugh
		allStops.put("2039", "1113"); // WFCU Centre Main Entrance
		allStops.put("2185", "1114"); // Morton at Ojibway
		allStops.put("2186", "1115"); // Front at River
		allStops.put("2187", "1116"); // Front at Antaya
		allStops.put("2188", "1117"); // Front at Reaume
		allStops.put("2189", "1118"); // Front at Riverview
		allStops.put("2190", "1119"); // Front at Bouffard
		allStops.put("2191", "1120"); // Front at Huron
		allStops.put("2192", "1121"); // Front at Laurier
		allStops.put("2193", "1122"); // Front at Adams
		allStops.put("2194", "1123"); // Front at Boismier
		allStops.put("2195", "1124"); // International at Front
		allStops.put("2196", "1125"); // Michigan at International
		allStops.put("2197", "1126"); // Michigan at Fields
		allStops.put("2198", "1127"); // Michigan at Delaware
		allStops.put("2199", "1128"); // Michigan at Laurier
		allStops.put("2200", "1129"); // Laurier at Hazel
		allStops.put("2201", "1130"); // Laurier at Alfred
		allStops.put("2202", "1131"); // Laurier at Mayfair
		allStops.put("2203", "1132"); // Laurier at Marquette
		allStops.put("2204", "1133"); // Laurier at Matchette
		allStops.put("2205", "1134"); // Laurier at First
		allStops.put("2206", "1135"); // Laurier at Selkirk
		allStops.put("2207", "1136"); // Laurier at Tacoma
		allStops.put("2208", "1137"); // Laurier at Malden
		allStops.put("2168", "1138"); // Vollmer Centre Front Entrance
		allStops.put("2169", "1139"); // Mike Raymond at Malden
		allStops.put("2170", "1140"); // Malden at Laurier
		allStops.put("2171", "1141"); // Malden at Bouffard
		allStops.put("2172", "1142"); // Malden at Rosati
		allStops.put("2209", "1143"); // Malden at Reaume
		allStops.put("2210", "1144"); // Malden at Valiant
		allStops.put("2211", "1145"); // Malden at Stuart
		allStops.put("2212", "1146"); // Malden at Edgemore
		allStops.put("2213", "1147"); // Malden at Grillo
		allStops.put("2214", "1148"); // Malden at Normandy
		allStops.put("2215", "1149"); // Delmar at Trinity
		allStops.put("2216", "1150"); // Ellis at Normandy
		allStops.put("2217", "1151"); // Normandy at Seventh
		allStops.put("2218", "1152"); // Normandy at Tenth
		allStops.put("2219", "1153"); // Normandy at Thirteenth
		allStops.put("2220", "1154"); // Normandy at Huron Church
		allStops.put("2221", "1155"); // Huron Church at Disputed
		allStops.put("2222", "1156"); // Huron Church at Skinner
		allStops.put("2223", "1157"); // Sandwich West at Huron Church
		allStops.put("2224", "1158"); // Sandwich West at Mary
		allStops.put("2225", "1159"); // Sandwich West at D'Amore
		allStops.put("2226", "1160"); // Sandwich West at Durocher
		allStops.put("2227", "1161"); // Sandwich West at Lovell
		allStops.put("2228", "1162"); // Heritage at Sandwich West
		allStops.put("2229", "1163"); // Heritage at Rushwood
		allStops.put("2230", "1164"); // Heritage at Rushwood
		allStops.put("2231", "1165"); // Heritage at Blackthorn
		allStops.put("2232", "1166"); // Heritage at Sixth Concession
		allStops.put("2233", "1167"); // Sixth Concession at Montgomery
		allStops.put("2140", "1168"); // St Clair Front Entrance
		allStops.put("2141", "1169"); // Montgomery at Surrey
		allStops.put("2142", "1170"); // Montgomery at Eastbourne
		allStops.put("2143", "1171"); // Heritage at Winfield
		allStops.put("2144", "1172"); // Heritage at Winfield
		allStops.put("2145", "1173"); // Heritage at Rushwood
		allStops.put("2146", "1174"); // Heritage at Rushwood
		allStops.put("2147", "1175"); // Heritage at Sandwich West
		allStops.put("2148", "1176"); // Sandwich West at Lovell
		allStops.put("2149", "1177"); // Sandwich West at Durocher
		allStops.put("2150", "1178"); // Sandwich West at D'Amore
		allStops.put("2151", "1179"); // Sandwich West at Mary
		allStops.put("2152", "1180"); // Sandwich West at Huron Church
		allStops.put("2153", "1181"); // Huron Church at Skinner
		allStops.put("2154", "1182"); // Huron Church at Cousineau
		allStops.put("2155", "1183"); // Normandy at Huron Church
		allStops.put("2156", "1184"); // Normandy at Twelfth
		allStops.put("2157", "1185"); // Normandy at Tenth
		allStops.put("2158", "1186"); // Normandy at Seventh
		allStops.put("2159", "1187"); // Ellis at Normandy
		allStops.put("2160", "1188"); // Delmar at Trinity
		allStops.put("2161", "1189"); // Malden at Normandy
		allStops.put("2162", "1190"); // Malden at Morton
		allStops.put("2163", "1191"); // Malden at Edgemore
		allStops.put("2164", "1192"); // Malden at Outram
		allStops.put("2165", "1193"); // Malden at Monty
		allStops.put("2166", "1194"); // Malden at Rosati
		allStops.put("2167", "1195"); // Malden at Bouffard
		allStops.put("2173", "1196"); // Reaume at Malden
		allStops.put("2174", "1197"); // Reaume at Woodbridge
		allStops.put("2175", "1198"); // Reaume at Deerview
		allStops.put("2176", "1199"); // Reaume at Piruzza
		allStops.put("2177", "1200"); // Reaume at Matchette
		allStops.put("2178", "1201"); // Matchette at Monty
		allStops.put("2179", "1202"); // Matchette at Minto
		allStops.put("2180", "1203"); // Morton at Matchette
		allStops.put("2181", "1204"); // Morton at Quick
		allStops.put("2182", "1205"); // Morton at Wales
		allStops.put("2183", "1206"); // Morton at Ramblewood
		allStops.put("2184", "1207"); // Morton at Ramblewood

		ALL_STOPS = allStops;
	}
}
