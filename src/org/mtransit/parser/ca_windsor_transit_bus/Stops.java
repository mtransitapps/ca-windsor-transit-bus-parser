package org.mtransit.parser.ca_windsor_transit_bus;

import java.util.HashMap;

public class Stops {
	public static HashMap<String, String> ALL_STOPS;
	static {
		HashMap<String, String> allStops = new HashMap<String, String>();
		allStops.put("stop_code", "stop_id"); // stop_name
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
		allStops.put("1077", "128"); // Sandwich at Chewitt
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
		allStops.put("1055", "151"); // Sandwich at Chewitt
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
		allStops.put("1231", "210"); // Wyandotte at Randolph
		allStops.put("1233", "211"); // Wyandotte at Bridge
		allStops.put("1235", "212"); // Wyandotte at Campbell
		allStops.put("1237", "213"); // Wyandotte at McKay
		allStops.put("1239", "214"); // Wyandotte at Wellington
		allStops.put("1241", "215"); // Wyandotte at Crawford
		allStops.put("1243", "216"); // Wyandotte at Caron
		allStops.put("1245", "217"); // Wyandotte at Bruce
		allStops.put("1248", "218"); // Wyandotte at Victoria
		allStops.put("1250", "219"); // Wyandotte at Ouellette
		allStops.put("1251", "220"); // Wyandotte at Dufferin
		allStops.put("1253", "221"); // Wyandotte at Windsor
		allStops.put("1255", "222"); // Wyandotte at McDougall
		allStops.put("1257", "223"); // Wyandotte at Glengarry
		allStops.put("1258", "224"); // Wyandotte at Aylmer
		allStops.put("1261", "225"); // Wyandotte at Marentette
		allStops.put("1263", "226"); // Wyandotte at Parent
		allStops.put("1265", "227"); // Wyandotte at Marion
		allStops.put("1267", "228"); // Wyandotte at Hall
		allStops.put("1269", "229"); // Wyandotte at Gladstone
		allStops.put("1270", "230"); // Wyandotte at Lincoln
		allStops.put("1273", "231"); // Wyandotte at Devonshire
		allStops.put("1274", "232"); // Wyandotte at Monmouth
		allStops.put("1276", "233"); // Wyandotte at Walker
		allStops.put("1278", "234"); // Wyandotte at Albert
		allStops.put("1280", "235"); // Wyandotte at Drouillard
		allStops.put("1282", "236"); // Wyandotte at Belleview
		allStops.put("1284", "237"); // Wyandotte at Strabane
		allStops.put("1286", "238"); // Wyandotte at Sterling
		allStops.put("1288", "239"); // Wyandotte at George
		allStops.put("1290", "240"); // Wyandotte at Rossini
		allStops.put("1292", "241"); // Wyandotte at Jos. Janisse
		allStops.put("1294", "242"); // Wyandotte at Pillette
		allStops.put("1296", "243"); // Wyandotte at Raymo
		allStops.put("1298", "244"); // Wyandotte at Westminster
		allStops.put("1300", "245"); // Wyandotte at Ford
		allStops.put("1301", "246"); // Wyandotte at Prado
		allStops.put("1303", "247"); // Wyandotte at St. Louis
		allStops.put("1306", "248"); // Wyandotte at Jefferson
		allStops.put("1308", "249"); // Wyandotte at Victor
		allStops.put("1311", "250"); // Wyandotte at St. Marys
		allStops.put("1315", "251"); // Wyandotte at St. Rose
		allStops.put("1317", "252"); // Wyandotte at Edward
		allStops.put("1318", "253"); // Wyandotte at Fairview
		allStops.put("1320", "254"); // Wyandotte at Matthew Brady
		allStops.put("1324", "255"); // Lauzon at Wyandotte
		allStops.put("1326", "256"); // Lauzon at Cedarview
		allStops.put("1328", "257"); // Lauzon at Clairview
		allStops.put("1330", "258"); // Lauzon at Riverside
		allStops.put("1333", "259"); // Riverside at Watson
		allStops.put("1337", "260"); // Riverside at Bayview Towers
		allStops.put("1339", "261"); // Riverside at St Clair Towers
		allStops.put("1341", "262"); // Riverside at Island View Towers
		allStops.put("1343", "263"); // Riverside at Westchester
		allStops.put("1345", "264"); // Riverdale at Cedarview
		allStops.put("1347", "265"); // Riverdale at Menard
		allStops.put("1349", "266"); // Riverdale at Wyandotte
		allStops.put("1351", "267"); // Riverdale at Jerome
		allStops.put("1353", "268"); // Riverdale at St. Rose
		allStops.put("1356", "269"); // Little River Acres at Abbey
		allStops.put("1358", "270"); // Little River Acres at Aire
		allStops.put("1360", "271"); // Little RiverAcres at Copperfield
		allStops.put("1362", "272"); // Little River Acres at East Moor
		allStops.put("1364", "273"); // Little RiverAcres at LittleRiver
		allStops.put("1365", "274"); // Little River at Laporte
		allStops.put("1366", "275"); // Lauzon Road at Edgar
		allStops.put("1367", "276"); // Lauzon Rd. at ABC Day Nursery
		allStops.put("1369", "277"); // Lauzon at Tranby
		allStops.put("1371", "278"); // Lauzon Parkway at Lauzon Line
		allStops.put("1373", "279"); // Lauzon Parkway at VIA Tracks
		allStops.put("1375", "280"); // Tecumseh Mall Rear Entrance
		allStops.put("1206", "281"); // College Ave. at Community Centre
		allStops.put("1116", "282"); // Prince at King
		allStops.put("1211", "283"); // Prince at Peter
		allStops.put("1213", "284"); // Sandwich at Watkins
		allStops.put("1215", "285"); // Sandwich at South
		allStops.put("1217", "286"); // Sandwich at Chippawa
		allStops.put("1219", "287"); // Sandwich at Brock
		allStops.put("1222", "288"); // Wyandotte at Mill
		allStops.put("1224", "289"); // Wyandotte at Rosedale
		allStops.put("1226", "290"); // Wyandotte at Huron Church
		allStops.put("1228", "291"); // Wyandotte at Sunset
		allStops.put("1374", "292"); // Lauzon Parkway at Lauzon Line
		allStops.put("1372", "293"); // Lauzon at Tranby
		allStops.put("1370", "294"); // Lauzon at Trinity Towers
		allStops.put("1368", "295"); // Lauzon at Little River
		allStops.put("1076", "296"); // Little River at Adair
		allStops.put("1363", "297"); // Little River Acres at Little Riv
		allStops.put("1361", "298"); // Little River Acres at East Moor
		allStops.put("1359", "299"); // Little River Acres at Cottage
		allStops.put("1355", "300"); // Little River Acrs at Copperfield
		allStops.put("1354", "301"); // Little RiverAcres at LittleRiver
		allStops.put("1352", "302"); // Riverdale at St. Rose
		allStops.put("1350", "303"); // Riverdale at Jerome
		allStops.put("1348", "304"); // Riverdale at Wyandotte
		allStops.put("1346", "305"); // Riverdale at Menard
		allStops.put("1344", "306"); // Riverdale at Riverside
		allStops.put("1342", "307"); // Riverside at Marina
		allStops.put("1340", "308"); // Riverside at Solidarity Towers
		allStops.put("1338", "309"); // Riverside at Riverside Towers
		allStops.put("1336", "310"); // Riverside at Shoreline Towers
		allStops.put("1334", "311"); // Riverside at Dieppe
		allStops.put("1329", "312"); // Lauzon at Riverside Dr. E
		allStops.put("1327", "313"); // Lauzon at Cecile
		allStops.put("1325", "314"); // Lauzon at Cedarview
		allStops.put("1323", "315"); // Lauzon at Wyandotte
		allStops.put("1321", "316"); // Wyandotte at Matthew Brady
		allStops.put("1319", "317"); // Wyandotte at Fairview
		allStops.put("1316", "318"); // Wyandotte at Vernon
		allStops.put("1314", "319"); // Wyandotte at St. Rose
		allStops.put("Sto125649", "320"); // Wyandotte at Metro
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
		allStops.put("1524", "373"); // Transit Centre Front Entrance
		allStops.put("1504", "374"); // N. Service at Central
		allStops.put("1502", "375"); // Grand Marais at Allyson
		allStops.put("1500", "376"); // Grand Marais at Tourangeau
		allStops.put("1498", "377"); // Grand Marais at Bernard
		allStops.put("1496", "378"); // Grand Marais at Pillette
		allStops.put("1494", "379"); // Pillette at Adstoll
		allStops.put("1492", "380"); // Pillette at Tecumseh
		allStops.put("1490", "381"); // Pillette at Guy
		allStops.put("1488", "382"); // Pillette at Milloy
		allStops.put("1486", "383"); // Pillette at Alice
		allStops.put("1484", "384"); // Pillette at Reginald
		allStops.put("1580", "385"); // Seminole at Pillette
		allStops.put("1578", "386"); // Seminole at Ellrose
		allStops.put("1576", "387"); // Seminole at Bernard
		allStops.put("1481", "388"); // George at Seminole
		allStops.put("1479", "389"); // George at Reginald
		allStops.put("1477", "390"); // George at Alice
		allStops.put("1475", "391"); // George at Milloy
		allStops.put("1313", "392"); // George at Guy
		allStops.put("1471", "393"); // Hickory at Tecumseh
		allStops.put("1469", "394"); // Hickory at Milloy
		allStops.put("1467", "395"); // Drouillard at Alice
		allStops.put("1465", "396"); // Drouillard at Reginald
		allStops.put("1463", "397"); // Drouillard at Seminole
		allStops.put("1462", "398"); // Drouillard at Metcalfe
		allStops.put("1460", "399"); // Drouillard at Franklin
		allStops.put("1458", "400"); // Drouillard at Ontario
		allStops.put("1456", "401"); // Richmond at Drouillard
		allStops.put("1454", "402"); // Richmond at St. Luke
		allStops.put("1453", "403"); // Richmond at Walker
		allStops.put("1450", "404"); // Richmond at Monmouth
		allStops.put("1448", "405"); // Richmond at Chilver
		allStops.put("1446", "406"); // Richmond at Lincoln
		allStops.put("1445", "407"); // Erie at Lincoln
		allStops.put("1443", "408"); // Erie at Moy
		allStops.put("1442", "409"); // Erie at Marion
		allStops.put("1440", "410"); // Erie at Elsmere
		allStops.put("1436", "411"); // Erie at Louis
		allStops.put("1434", "412"); // Erie at Howard
		allStops.put("1432", "413"); // Erie at McDougall
		allStops.put("1426", "414"); // Erie at Goyeau
		allStops.put("1428", "415"); // Erie at Ouellette
		allStops.put("1424", "416"); // Crawford at Wyandotte
		allStops.put("1423", "417"); // Crawford at Elliott
		allStops.put("1421", "418"); // Crawford at College
		allStops.put("1419", "419"); // Crawford at Erie
		allStops.put("1417", "420"); // Crawford at Grove
		allStops.put("1414", "421"); // Crawford at Tecumseh
		allStops.put("1412", "422"); // Tecumseh at Crawford
		allStops.put("1411", "423"); // Tecumseh at McKay
		allStops.put("1407", "424"); // Tecumseh at Campbell
		allStops.put("1406", "425"); // Tecumseh at Bridge
		allStops.put("1404", "426"); // Tecumseh at Randolph
		allStops.put("1402", "427"); // Tecumseh at California
		allStops.put("1400", "428"); // Tecumseh at Northway
		allStops.put("1398", "429"); // Tecumseh at Huron Church
		allStops.put("1396", "430"); // Tecumseh at Felix
		allStops.put("1376", "431"); // College Ave. at Community Centre
		allStops.put("1377", "432"); // South at College
		allStops.put("1378", "433"); // South at Wells
		allStops.put("1379", "434"); // Girardot at South
		allStops.put("1380", "435"); // Girardot at Strathmore
		allStops.put("1383", "436"); // Connaught at Chappell
		allStops.put("1386", "437"); // Sun Valley at Greenview
		allStops.put("1388", "438"); // Sun Valley at Malden
		allStops.put("1389", "439"); // Brunet at Industrial
		allStops.put("1391", "440"); // Industrial at Ambassador
		allStops.put("1392", "441"); // Ambassador at Urgent Care
		allStops.put("1393", "442"); // Ambassador at Malden
		allStops.put("1394", "443"); // Daytona at Malden
		allStops.put("1395", "444"); // Daytona at Totten
		allStops.put("1397", "445"); // Northway at Algonquin
		allStops.put("1399", "446"); // Tecumseh at Northway
		allStops.put("1401", "447"); // Tecumseh at California
		allStops.put("1403", "448"); // Tecumseh at Randolph
		allStops.put("1405", "449"); // Tecumseh at Bridge
		allStops.put("1408", "450"); // Tecumseh at Campbell
		allStops.put("1410", "451"); // Tecumseh at Curry
		allStops.put("1413", "452"); // Crawford at Tecumseh
		allStops.put("1416", "453"); // Crawford at Grove
		allStops.put("1418", "454"); // Crawford at Erie
		allStops.put("1420", "455"); // Crawford at College
		allStops.put("1422", "456"); // Crawford at Elliott
		allStops.put("1425", "457"); // Crawford at Wyandotte
		allStops.put("1429", "458"); // Erie at Ouellette
		allStops.put("1430", "459"); // Erie at Goyeau
		allStops.put("1431", "460"); // Erie at McDougall
		allStops.put("1435", "461"); // Erie at Howard
		allStops.put("1437", "462"); // Erie at Louis
		allStops.put("1438", "463"); // Erie at Elsmere
		allStops.put("1441", "464"); // Erie at Marion
		allStops.put("1444", "465"); // Erie at Hall
		allStops.put("1914", "466"); // Gladstone at Erie
		allStops.put("1447", "467"); // Richmond at Lincoln
		allStops.put("1449", "468"); // Richmond at Kildare
		allStops.put("1451", "469"); // Richmond at Argyle
		allStops.put("1452", "470"); // Richmond at Walker
		allStops.put("1455", "471"); // Richmond at St. Luke
		allStops.put("1457", "472"); // Richmond at Drouillard
		allStops.put("1459", "473"); // Drouillard at Ontario
		allStops.put("1461", "474"); // Drouillard at Franklin
		allStops.put("1322", "475"); // Drouillard at Metcalfe
		allStops.put("1464", "476"); // Drouillard at Seminole
		allStops.put("1466", "477"); // Drouillard at Reginald
		allStops.put("1468", "478"); // Drouillard at Alice
		allStops.put("1470", "479"); // Drouillard at Milloy
		allStops.put("1472", "480"); // Drouillard at Tecumseh
		allStops.put("1474", "481"); // George at Tecumseh
		allStops.put("1331", "482"); // George at Guy
		allStops.put("1476", "483"); // George at Milloy
		allStops.put("1478", "484"); // George at Alice
		allStops.put("1480", "485"); // George at Reginald
		allStops.put("1572", "486"); // Seminole at George
		allStops.put("1574", "487"); // Seminole at Rossini
		allStops.put("1577", "488"); // Seminole at Francois
		allStops.put("1483", "489"); // Seminole at Pillette
		allStops.put("1485", "490"); // Pillette at Reginald
		allStops.put("1487", "491"); // Pillette at Alice
		allStops.put("1489", "492"); // Pillette at Milloy
		allStops.put("1491", "493"); // Pillette at Guy
		allStops.put("1493", "494"); // Pillette at Tecumseh
		allStops.put("1495", "495"); // Pillette at Adstoll
		allStops.put("1497", "496"); // Pillette at Grand Marais
		allStops.put("1501", "497"); // Pillette at Plymouth
		allStops.put("1503", "498"); // Plymouth at Robert
		allStops.put("1505", "499"); // Plymouth at Tourangeau
		allStops.put("1506", "500"); // Plymouth at Grand Marais
		allStops.put("1507", "501"); // Central at Temple
		allStops.put("1508", "502"); // Mannheim at Deziel
		allStops.put("1509", "503"); // St. Etienne at Kautex
		allStops.put("1510", "504"); // Kautex at Deziel
		allStops.put("1511", "505"); // Deziel at Mannheim
		allStops.put("1512", "506"); // Deziel at Central
		allStops.put("1513", "507"); // Rhodes at Wheelton
		allStops.put("1514", "508"); // Rhodes at Electricity
		allStops.put("1515", "509"); // Rhodes at Jamieson
		allStops.put("1516", "510"); // Rhodes at Enwin
		allStops.put("1517", "511"); // Rhodes at Pillette
		allStops.put("1518", "512"); // Rhodes at Fuller Construction
		allStops.put("1335", "513"); // Rhodes at Jefferson
		allStops.put("1357", "514"); // Jefferson at E.C. Row
		allStops.put("1519", "515"); // North Service at Jefferson
		allStops.put("1520", "516"); // North Service at Clemenceau
		allStops.put("1521", "517"); // North Service at Tracks
		allStops.put("1522", "518"); // North Service Road at Pillette
		allStops.put("1332", "519"); // Service Road at Electrical Union
		allStops.put("2051", "520"); // Transit Terminal at Chatham
		allStops.put("1656", "521"); // Essex Way at Meadowbrook
		allStops.put("1660", "522"); // Cantelon at Kew
		allStops.put("1659", "523"); // Cantelon at Lauzon Parkway
		allStops.put("1658", "524"); // Forest Glade at Lauzon Parkway
		allStops.put("1657", "525"); // Forest Glade at Lauzon
		allStops.put("1655", "526"); // Beachdale at Chestnut
		allStops.put("1653", "527"); // Esplanade at Beachdale
		allStops.put("1651", "528"); // Esplanade at Ridge
		allStops.put("1649", "529"); // Esplanade at Lilac
		allStops.put("1647", "530"); // Lilac at Lauzon
		allStops.put("1645", "531"); // Lauzon Road at Hawthorne
		allStops.put("1643", "532"); // Lauzon Road at Yolanda
		allStops.put("1639", "533"); // Clemenceau at Rose
		allStops.put("1637", "534"); // Clemenceau at Joinville
		allStops.put("1635", "535"); // Clemenceau at Haig
		allStops.put("1633", "536"); // Clemenceau at Grand
		allStops.put("1631", "537"); // Clemenceau at Roosevelt
		allStops.put("1629", "538"); // Queen Elizabeth at Clemenceau
		allStops.put("1626", "539"); // Queen Elizabeth at Grandview
		allStops.put("1623", "540"); // Queen Elizabeth at Clarence
		allStops.put("1621", "541"); // Rivard at Queen Elizabeth
		allStops.put("1619", "542"); // Rivard at Library
		allStops.put("1617", "543"); // Rivard at Grand
		allStops.put("1615", "544"); // Rivard at Haig
		allStops.put("1613", "545"); // Rivard at Joinville
		allStops.put("1611", "546"); // Rivard at Rose
		allStops.put("1609", "547"); // Ford at Empress
		allStops.put("1607", "548"); // Ford at Coronation
		allStops.put("1605", "549"); // Ford at Lassaline
		allStops.put("1603", "550"); // Ford at Reginald
		allStops.put("1601", "551"); // South National at Ford
		allStops.put("1599", "552"); // South National at Ferndale
		allStops.put("1597", "553"); // South National at Balfour
		allStops.put("1595", "554"); // Jefferson at South National
		allStops.put("1593", "555"); // Jefferson at Edgar
		allStops.put("1591", "556"); // Jefferson at Raymond
		allStops.put("1589", "557"); // Jefferson at Ontario
		allStops.put("1588", "558"); // Pillette at Wyandotte
		allStops.put("1586", "559"); // Pillette at Ontario
		allStops.put("1584", "560"); // Pillette at South National
		allStops.put("1582", "561"); // Pillette at Metcalfe
		allStops.put("1573", "562"); // Seminole at George
		allStops.put("1570", "563"); // Seminole at Central
		allStops.put("1568", "564"); // Seminole at Chandler
		allStops.put("1566", "565"); // Seminole at Drouillard
		allStops.put("1662", "566"); // Walker at Ontario
		allStops.put("1560", "567"); // Ottawa at Monmouth
		allStops.put("1557", "568"); // Ottawa at Kildare
		allStops.put("1555", "569"); // Ottawa at Lincoln
		allStops.put("1552", "570"); // Ottawa at Gladstone
		allStops.put("1550", "571"); // Ottawa at Hall
		allStops.put("1548", "572"); // Ottawa at Benjamin
		allStops.put("1545", "573"); // Parent at Ottawa
		allStops.put("2064", "574"); // Parent at Giles
		allStops.put("1529", "575"); // Transit Windsor Terminal
		allStops.put("2063", "576"); // Giles at Parent
		allStops.put("1546", "577"); // Ottawa at Parent
		allStops.put("1549", "578"); // Ottawa at Pierre
		allStops.put("1551", "579"); // Ottawa at Moy
		allStops.put("1553", "580"); // Ottawa at Gladstone
		allStops.put("1554", "581"); // Ottawa at Lincoln
		allStops.put("1556", "582"); // Ottawa at Kildare
		allStops.put("1559", "583"); // Ottawa at Walker
		allStops.put("1661", "584"); // Walker at Ontario
		allStops.put("1565", "585"); // Seminole at Drouillard
		allStops.put("1567", "586"); // Seminole at Chandler
		allStops.put("1569", "587"); // Seminole at Central
		allStops.put("1571", "588"); // Seminole at Westcott
		allStops.put("1579", "589"); // Pillette at Seminole
		allStops.put("1581", "590"); // Pillette at Metcalfe
		allStops.put("1583", "591"); // Pillette at South National
		allStops.put("1585", "592"); // Pillette at Ontario
		allStops.put("1587", "593"); // Pillette at Wyandotte
		allStops.put("1590", "594"); // Jefferson at Ontario
		allStops.put("1592", "595"); // Jefferson at Raymond
		allStops.put("1594", "596"); // Jefferson at Edgar
		allStops.put("1596", "597"); // South National at Jefferson
		allStops.put("1598", "598"); // South National at Balfour
		allStops.put("1600", "599"); // South National at Ferndale
		allStops.put("1602", "600"); // South National at Ford
		allStops.put("1604", "601"); // Ford at Reginald
		allStops.put("1606", "602"); // Ford at Lassaline
		allStops.put("1608", "603"); // Ford at Coronation
		allStops.put("1610", "604"); // Ford at Empress
		allStops.put("1612", "605"); // Rivard at Joinville
		allStops.put("1614", "606"); // Rivard at Haig
		allStops.put("1616", "607"); // Rivard at Grand
		allStops.put("1618", "608"); // Rivard at Ambassador Church
		allStops.put("1620", "609"); // Rivard at Queen Elizabeth
		allStops.put("1622", "610"); // Queen Elizabeth at Clarence
		allStops.put("1625", "611"); // Queen Elizabeth at Harmony
		allStops.put("1628", "612"); // Queen Elizabeth at Clemenceau
		allStops.put("1630", "613"); // Clemenceau at Roosevelt
		allStops.put("1632", "614"); // Clemenceau at Grand
		allStops.put("1634", "615"); // Clemenceau at Haig
		allStops.put("1636", "616"); // Clemenceau at Joinville
		allStops.put("1159", "617"); // Rose at Clemenceau
		allStops.put("1642", "618"); // Lauzon Rd. at Yolanda
		allStops.put("1644", "619"); // Lauzon Rd. at Hawthorne
		allStops.put("1646", "620"); // Hawthorne at Sycamore
		allStops.put("1648", "621"); // Meadowbrook at Hawthorne
		allStops.put("1650", "622"); // Meadowbrook at Parkside Estates
		allStops.put("1652", "623"); // Meadowbrook at Optimist Park
		allStops.put("1654", "624"); // Meadowbrook at Essex Way
		allStops.put("1531", "625"); // Giles at Ouellette
		allStops.put("1533", "626"); // Giles at Goyeau
		allStops.put("1535", "627"); // Giles at McDougall
		allStops.put("1538", "628"); // Giles at Howard
		allStops.put("1542", "629"); // Giles at Marentette
		allStops.put("1544", "630"); // Giles at Parent
		allStops.put("1561", "631"); // Seminole at Walker
		allStops.put("1563", "632"); // Seminole at Albert
		allStops.put("1564", "633"); // Seminole at Albert
		allStops.put("1562", "634"); // Seminole at Walker
		allStops.put("1543", "635"); // Giles at Elsmere
		allStops.put("1541", "636"); // Giles at Louis
		allStops.put("1539", "637"); // Giles at Howard
		allStops.put("1536", "638"); // Giles at McDougall
		allStops.put("1534", "639"); // Giles at Windsor
		allStops.put("1532", "640"); // Giles at Ouellette
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
		allStops.put("1894", "724"); // Transit Terminal Church at Pitt
		allStops.put("1895", "725"); // Riverside at Ouellette
		allStops.put("1897", "726"); // Riverside at McDougall
		allStops.put("1900", "727"); // Riverside at Aylmer
		allStops.put("1902", "728"); // Riverside at Parent
		allStops.put("1818", "729"); // Riverside at Langlois
		allStops.put("1904", "730"); // Riverside at Hall
		allStops.put("1864", "731"); // Riverside at Gladstone
		allStops.put("1906", "732"); // Gladstone at Assumption
		allStops.put("1908", "733"); // Gladstone at Wyandotte
		allStops.put("1910", "734"); // Gladstone at Cataraqui
		allStops.put("1912", "735"); // Gladstone at Niagara
		allStops.put("1916", "736"); // Gladstone at Richmond
		allStops.put("1918", "737"); // Gladstone at Giles
		allStops.put("1920", "738"); // Gladstone at Ottawa
		allStops.put("1865", "739"); // Gladstone at Ellis
		allStops.put("1922", "740"); // Shepherd at Lincoln
		allStops.put("1924", "741"); // Lincoln at ETR Rail Tracks
		allStops.put("1926", "742"); // Lincoln at Seneca
		allStops.put("1928", "743"); // Lincoln at Tecumseh
		allStops.put("1930", "744"); // Lincoln at Lens
		allStops.put("1932", "745"); // Lincoln at Vimy
		allStops.put("1934", "746"); // Lincoln at Ypres
		allStops.put("1936", "747"); // Ypres at Kildare
		allStops.put("1938", "748"); // Ypres at Turner
		allStops.put("1940", "749"); // Walker at Somme
		allStops.put("1942", "750"); // Walker at St. Julien
		allStops.put("1944", "751"); // Walker at Grand Marais
		allStops.put("1946", "752"); // Walker at Parkdale
		allStops.put("1948", "753"); // Walker at Digby
		allStops.put("1950", "754"); // Walker at Sydney
		allStops.put("1952", "755"); // Walker at Seymour
		allStops.put("1954", "756"); // Walker at Foster
		allStops.put("1956", "757"); // Walker at Lappan
		allStops.put("1958", "758"); // Walker at Calderwood
		allStops.put("1960", "759"); // Walker at Melinda
		allStops.put("1962", "760"); // Walker at Ledyard
		allStops.put("1772", "761"); // Walker at Moxley
		allStops.put("1965", "762"); // Walker at Division
		allStops.put("1967", "763"); // Walker at Home Depot Plaza
		allStops.put("1970", "764"); // Walker at Canada Post
		allStops.put("1972", "765"); // Walker at Best Buy
		allStops.put("1974", "766"); // Walker at Costco
		allStops.put("1976", "767"); // Walker at Legacy Park
		allStops.put("1978", "768"); // Walker at Provincial
		allStops.put("1980", "769"); // Walker at Ducharme
		allStops.put("1982", "770"); // Walker at Highway 401
		allStops.put("1984", "771"); // Walker at U-Haul
		allStops.put("1986", "772"); // Walker at North Talbot
		allStops.put("1988", "773"); // North Talbot at Halford
		allStops.put("1990", "774"); // North Talbot at Burke
		allStops.put("1992", "775"); // North Talbot at Dumouchelle
		allStops.put("1994", "776"); // North Talbot at Old West
		allStops.put("1995", "777"); // North Talbot at Pioneer
		allStops.put("1997", "778"); // Sixth Concession at North Talbot
		allStops.put("1993", "779"); // Sixth Concession at Holburn
		allStops.put("1991", "780"); // Holburn at Spago
		allStops.put("1989", "781"); // Ducharme at Holburn
		allStops.put("1987", "782"); // Ducharme at Canberra
		allStops.put("1985", "783"); // Ducharme at Periwinkle
		allStops.put("1983", "784"); // Ducharme at Fontana
		allStops.put("1981", "785"); // Ducharme at Lavender
		allStops.put("1979", "786"); // Ducharme at Walker
		allStops.put("1977", "787"); // Walker at Provincial
		allStops.put("1975", "788"); // Walker at 7th Concession
		allStops.put("1973", "789"); // Walker at Walker Crossings
		allStops.put("1971", "790"); // Walker at Canadian Tire
		allStops.put("1969", "791"); // Walker at Ferrari Plaza
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
		allStops.put("1968", "832"); // Airport at Front Entrance
		allStops.put("1877", "833"); // Devonshire Mall at Moxies
		allStops.put("2113", "834"); // Marentette at EC Row Ave
		allStops.put("2112", "835"); // E.C. Row Ave at Devon
		allStops.put("2105", "836"); // E.C Row Ave at Conservation
		allStops.put("2103", "837"); // N. Service Rd.at Jennifer
		allStops.put("2101", "838"); // N. Service Rd. at Langlois
		allStops.put("2099", "839"); // Grand Marais at Langlois
		allStops.put("2097", "840"); // Grand Marais at South Pacific
		allStops.put("2095", "841"); // Grand Marais at Garvey
		allStops.put("2093", "842"); // Slater at Hartford
		allStops.put("2089", "843"); // Slater at Southdale
		allStops.put("2087", "844"); // Southdale at Bramley
		allStops.put("2085", "845"); // South Pacific at Southdale
		allStops.put("2083", "846"); // South Pacific at Jeremiah
		allStops.put("2081", "847"); // South Pacific at Parent
		allStops.put("2079", "848"); // Eugenie at South Pacific
		allStops.put("2077", "849"); // Eugenie at Remington
		allStops.put("2074", "850"); // Howard at Tecumseh
		allStops.put("2073", "851"); // Parent at Tecumseh
		allStops.put("2071", "852"); // Parent at Hanna
		allStops.put("2069", "853"); // Parent at Shepherd
		allStops.put("2067", "854"); // Parent at Ellis
		allStops.put("2061", "855"); // Howard at Erie
		allStops.put("2060", "856"); // Howard at Elliott
		allStops.put("2058", "857"); // Aylmer at Wyandotte
		allStops.put("2056", "858"); // Aylmer at Assumption
		allStops.put("2054", "859"); // Chatham at Glengarry
		allStops.put("2053", "860"); // Chatham at Goyeau
		allStops.put("2052", "861"); // Ferry at Riverside
		allStops.put("2055", "862"); // Glengarry at University
		allStops.put("2057", "863"); // Glengarry at Wyandotte
		allStops.put("2059", "864"); // Howard at Elliott
		allStops.put("2065", "865"); // Parent at Ottawa
		allStops.put("2066", "866"); // Parent at Ellis
		allStops.put("2068", "867"); // Parent at Shepherd
		allStops.put("2070", "868"); // Parent at Hanna
		allStops.put("1108", "869"); // Tecumseh at Marentette
		allStops.put("2075", "870"); // Eugenie at Howard
		allStops.put("2076", "871"); // Eugenie at Lillian
		allStops.put("2080", "872"); // South Pacific at Parent
		allStops.put("2082", "873"); // South Pacific at Jeremiah
		allStops.put("2084", "874"); // Southdale at South Pacific
		allStops.put("2086", "875"); // Southdale at Southridge
		allStops.put("2088", "876"); // Slater at Southdale
		allStops.put("2092", "877"); // Slater at Grand Marais
		allStops.put("2094", "878"); // Grand Marais at Southdale
		allStops.put("2096", "879"); // Grand Marais at Garvey
		allStops.put("2098", "880"); // Grand Marais at South Pacific
		allStops.put("2100", "881"); // Grand Marais at Langlois
		allStops.put("2102", "882"); // N. Service Rd.at Langlois
		allStops.put("2104", "883"); // N. Service Rd. at Conservation
		allStops.put("2106", "884"); // Conservation at E.C. Row Ave
		allStops.put("2108", "885"); // E.C. Row Ave at Parkwood
		allStops.put("1765", "886"); // Sydney at Windsor Commons
		allStops.put("2120", "887"); // McDougall at University Avenue
		allStops.put("1755", "888"); // Chatham at Goyeau
		allStops.put("1831", "889"); // Chatham at Ouellette
		allStops.put("2116", "890"); // Windsor Transit Terminal
		allStops.put("2135", "891"); // Rosa Parks Transit Center
		allStops.put("2134", "892"); // Michigan at Washington
		allStops.put("2132", "893"); // Griswold at Congress
		allStops.put("2124", "894"); // Tunnel Platform at Mariner's
		allStops.put("2122", "895"); // McDougall at Wyandotte
		allStops.put("2117", "896"); // Goyeau at Pitt
		allStops.put("2118", "897"); // City Hall Square
		allStops.put("2119", "898"); // Canada Tunnel Plaza Duty Free
		allStops.put("2126", "899"); // Congress at Beaubien
		allStops.put("2127", "900"); // Congress at Randolph
		allStops.put("2129", "901"); // Washington at Jefferson
		allStops.put("2130", "902"); // Fort at Cass
		allStops.put("2131", "903"); // Cass at Lafayette
		allStops.put("1665", "904"); // Riverside at Caron
		allStops.put("1525", "905"); // Crawford at Riverside
		allStops.put("1527", "906"); // Crawford at University
		allStops.put("1528", "907"); // Crawford at University
		allStops.put("1526", "908"); // Crawford at Riverside
		allStops.put("1664", "909"); // Riverside at Caron
		allStops.put("1884", "910"); // Provincial at Humane Society
		allStops.put("1885", "911"); // Provincial at Sixth Concession
		allStops.put("1886", "912"); // Provincial at Lone Pine
		allStops.put("1888", "913"); // Provincial at Monarch Basics
		allStops.put("1891", "914"); // Provincial at Legacy Park
		allStops.put("1893", "915"); // Legacy Park at Sears Home
		allStops.put("1892", "916"); // Division at Walker
		allStops.put("1537", "917"); // Division at Bliss
		allStops.put("1890", "918"); // Division at Woodward
		allStops.put("1889", "919"); // Division at Conservation Area
		allStops.put("1887", "920"); // Division at Clarke
		allStops.put("1876", "921"); // Howard at Kenilworth
		allStops.put("1874", "922"); // Howard at Maguire
		allStops.put("1871", "923"); // Cabana at Dougall
		allStops.put("1540", "924"); // Cabana at Granada
		allStops.put("1869", "925"); // Cabana at McGraw
		allStops.put("1547", "926"); // Cabana at Casgrain
		allStops.put("1867", "927"); // Cabana at Dominion
		allStops.put("1863", "928"); // Geraedts at St. Clair Residence
		allStops.put("1736", "929"); // Geraedts at St. Clair Residence
		allStops.put("1862", "930"); // Cabana at Geraedts
		allStops.put("1860", "931"); // Cabana at Randolph
		allStops.put("1638", "932"); // Cabana at Askin
		allStops.put("1858", "933"); // Cabana at Northway
		allStops.put("1627", "934"); // Todd Lane at Tenth
		allStops.put("1854", "935"); // Todd Lane at Ninth
		allStops.put("1624", "936"); // Todd Lane at Oxley
		allStops.put("1852", "937"); // Todd Lane at Canada
		allStops.put("1850", "938"); // Todd Lane at Fifth
		allStops.put("1848", "939"); // Todd Lane at Third
		allStops.put("1847", "940"); // Malden at Orford
		allStops.put("1845", "941"); // Malden at Delmar
		allStops.put("1843", "942"); // Sprucewood at Malden
		allStops.put("1575", "943"); // Sprucewood at Newman
		allStops.put("1841", "944"); // Sprucewood at Woodmont
		allStops.put("1839", "945"); // Sprucewood at Abbott
		allStops.put("1837", "946"); // Sprucewood at Kingsley
		allStops.put("1558", "947"); // Sprucewood at Matchette
		allStops.put("1833", "948"); // Marigold at Weaver
		allStops.put("1830", "949"); // Matchette at Titcombe
		allStops.put("1828", "950"); // Matchette at Armanda
		allStops.put("1826", "951"); // Matchette at Carmichael
		allStops.put("1824", "952"); // Matchette at Chappell
		allStops.put("1822", "953"); // Prince at Vaughan
		allStops.put("1821", "954"); // Prince at Mulford
		allStops.put("1820", "955"); // Prince at Wells
		allStops.put("1819", "956"); // College Ave. at Community Centre
		allStops.put("1823", "957"); // Matchette at Chappell
		allStops.put("1825", "958"); // Matchette at Carmichael
		allStops.put("1827", "959"); // Matchette at Broadway
		allStops.put("1829", "960"); // Matchette at Titcombe
		allStops.put("1835", "961"); // Sprucewood at Matchette
		allStops.put("1836", "962"); // Sprucewood at Kingsley
		allStops.put("1838", "963"); // Sprucewood at Abbott
		allStops.put("1840", "964"); // Sprucewood at Woodmont
		allStops.put("1482", "965"); // Sprucewood at Newman
		allStops.put("1842", "966"); // Sprucewood at Malden
		allStops.put("1844", "967"); // Malden at Delmar
		allStops.put("1846", "968"); // Malden at Todd Lane
		allStops.put("1849", "969"); // Todd Lane at Elmdale
		allStops.put("1851", "970"); // Todd Lane at Wayne
		allStops.put("1853", "971"); // Todd Lane at Canada
		allStops.put("1499", "972"); // Todd Lane at Bishop
		allStops.put("1855", "973"); // Todd Lane at Ninth
		allStops.put("1856", "974"); // Todd Lane at Tenth
		allStops.put("1857", "975"); // Cabana at Northway
		allStops.put("1523", "976"); // Cabana at Borrelli
		allStops.put("1859", "977"); // Cabana at Southwinds
		allStops.put("1861", "978"); // Cabana at Roxborough
		allStops.put("1866", "979"); // Cabana at Geraedts
		allStops.put("1868", "980"); // Cabana at Longfellow
		allStops.put("1473", "981"); // Cabana at Casgrain
		allStops.put("1870", "982"); // Cabana at McGraw
		allStops.put("1415", "983"); // Cabana at Granada
		allStops.put("1872", "984"); // Howard at Cabana
		allStops.put("1873", "985"); // Howard at Maguire
		allStops.put("1875", "986"); // Howard at Kenilworth
		allStops.put("1880", "987"); // Marentette at Foster
		allStops.put("1882", "988"); // Marentette at Division
		allStops.put("1883", "989"); // Provincial at Clarke
		allStops.put("1409", "990"); // Provincial at Cabana
		allStops.put("1735", "991"); // Glenwood at Cabana
		allStops.put("1246", "992"); // Glenwood at St. Gabriel
		allStops.put("1733", "993"); // Beals at Roxborough
		allStops.put("1731", "994"); // Beals at Rankin
		allStops.put("1729", "995"); // Rankin at Liberty
		allStops.put("1727", "996"); // Norfolk at Rankin
		allStops.put("1724", "997"); // Norfolk at California
		allStops.put("1722", "998"); // California at Grand Marais
		allStops.put("1720", "999"); // Grand Marais at Northway
		allStops.put("1718", "1000"); // Labelle at Northway
		allStops.put("1716", "1001"); // Labelle at California
		allStops.put("1714", "1002"); // Labelle at St. Patricks
		allStops.put("1710", "1003"); // Labelle at Orion
		allStops.put("1709", "1004"); // Labelle at Everts
		allStops.put("1707", "1005"); // Labelle at Dominion
		allStops.put("1705", "1006"); // Dominion at E.C. Row
		allStops.put("1704", "1007"); // Dominion at Northwood
		allStops.put("1701", "1008"); // Dominion at Holy Names
		allStops.put("1699", "1009"); // Dominion at Ojibway
		allStops.put("1697", "1010"); // Dominion at McKay
		allStops.put("1695", "1011"); // Dominion at Arcadia
		allStops.put("1693", "1012"); // Campbell at Totten
		allStops.put("1691", "1013"); // Campbell at Curry
		allStops.put("1154", "1014"); // Campbell at Mark
		allStops.put("1688", "1015"); // Campbell at Tecumseh
		allStops.put("1686", "1016"); // Campbell at Pelletier
		allStops.put("1684", "1017"); // Campbell at Taylor
		allStops.put("1682", "1018"); // Campbell at Grove
		allStops.put("1680", "1019"); // Campbell at Adanac
		allStops.put("1678", "1020"); // Campbell at College
		allStops.put("1676", "1021"); // Campbell at Rooney
		allStops.put("1674", "1022"); // Campbell at Wyandotte
		allStops.put("1381", "1023"); // Campbell at Martindale
		allStops.put("1672", "1024"); // Campbell at University
		allStops.put("1670", "1025"); // Campbell at Riverside
		allStops.put("1668", "1026"); // Riverside at McKay
		allStops.put("1666", "1027"); // Riverside at Oak
		allStops.put("1663", "1028"); // Windsor Transit Terminal
		allStops.put("1667", "1029"); // Riverside at Oak
		allStops.put("1669", "1030"); // Riverside at McKay
		allStops.put("1671", "1031"); // Campbell at Riverside
		allStops.put("1673", "1032"); // Campbell at University
		allStops.put("1305", "1033"); // Campbell at Martindale
		allStops.put("1675", "1034"); // Campbell at Wyandotte
		allStops.put("1677", "1035"); // Campbell at Rooney
		allStops.put("1679", "1036"); // Campbell at College
		allStops.put("1681", "1037"); // Campbell at Adanac
		allStops.put("1683", "1038"); // Campbell at Grove
		allStops.put("1685", "1039"); // Campbell at Taylor
		allStops.put("1687", "1040"); // Campbell at Pelletier
		allStops.put("1689", "1041"); // Campbell at Tecumseh
		allStops.put("1690", "1042"); // Campbell at Everts
		allStops.put("1692", "1043"); // Campbell at Curry
		allStops.put("1694", "1044"); // Dominion at Totten
		allStops.put("1696", "1045"); // Dominion at Arcadia
		allStops.put("1698", "1046"); // Dominion at McKay
		allStops.put("1700", "1047"); // Dominion at Ojibway
		allStops.put("1702", "1048"); // Dominion at Holy Names
		allStops.put("1703", "1049"); // Dominion at Northwood
		allStops.put("1706", "1050"); // Dominion at E.C. Row
		allStops.put("1708", "1051"); // Dominion at Labelle
		allStops.put("1711", "1052"); // Dominion at Grand Marais
		allStops.put("1713", "1053"); // Dominion at Norfolk
		allStops.put("1715", "1054"); // Dominion at Richardie
		allStops.put("1717", "1055"); // Dominion at Beals
		allStops.put("1719", "1056"); // Dominion at Roselawn
		allStops.put("1721", "1057"); // Dominion at Cabana
		allStops.put("1723", "1058"); // Mount Royal at Cabana
		allStops.put("1725", "1059"); // Mount Royal at Villa Maria North
		allStops.put("1726", "1060"); // Mount Royal at Villa Maria South
		allStops.put("1728", "1061"); // Mount Royal at Mitchell
		allStops.put("1730", "1062"); // Mount Royal at Cousineau
		allStops.put("2050", "1063"); // McHugh at Lauzon
		allStops.put("2049", "1064"); // McHugh at Darfield
		allStops.put("2047", "1065"); // McHugh at Mickey Renuad Way
		allStops.put("2046", "1066"); // McHugh at Cypress
		allStops.put("2045", "1067"); // McHugh at Clover
		allStops.put("2042", "1068"); // Clover at Firgrove
		allStops.put("2040", "1069"); // Clover at Little River
		allStops.put("2037", "1070"); // Little River at Pearson
		allStops.put("2035", "1071"); // Little River at Chateau
		allStops.put("2032", "1072"); // Little River at Banwell
		allStops.put("2029", "1073"); // Little River at Jarvis
		allStops.put("2027", "1074"); // Cora Greenwood at Little River
		allStops.put("2025", "1075"); // Cora Green at Castle Hill
		allStops.put("2023", "1076"); // Cora Green at Dillon
		allStops.put("2021", "1077"); // Cora Green at Riverside
		allStops.put("2020", "1078"); // Riverside at Jarvis
		allStops.put("2019", "1079"); // Greenpark at Amalfi
		allStops.put("2018", "1080"); // Wyandotte at Greenpark
		allStops.put("2017", "1081"); // Wyandotte at Clover
		allStops.put("2016", "1082"); // Wyandotte at Florence
		allStops.put("2015", "1083"); // Wyandotte at Martinique
		allStops.put("2014", "1084"); // Wyandotte at Greendale
		allStops.put("2013", "1085"); // Wyandotte at Westchester
		allStops.put("2012", "1086"); // Wyandotte at Isack
		allStops.put("2011", "1087"); // Wyandotte at Riverside Plaza
		allStops.put("2010", "1088"); // Wyandotte at Watson
		allStops.put("2009", "1089"); // Lauzon Rd. at Wyandotte
		allStops.put("2008", "1090"); // Lauzon Road at St. Rose
		allStops.put("1998", "1091"); // Tecumseh Mall Rear Entrance
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
		allStops.put("2048", "1111"); // WFCU Centre Main Entrance
		allStops.put("2038", "1112"); // McHugh at Micky Renaud Way
		allStops.put("2185", "1113"); // Morton at Ojibway
		allStops.put("2186", "1114"); // Front at River
		allStops.put("2187", "1115"); // Front at Antaya
		allStops.put("2188", "1116"); // Front at Reaume
		allStops.put("2189", "1117"); // Front at Riverview
		allStops.put("2190", "1118"); // Front at Bouffard
		allStops.put("2191", "1119"); // Front at Huron
		allStops.put("2192", "1120"); // Front at Laurier
		allStops.put("2193", "1121"); // Front at Adams
		allStops.put("2194", "1122"); // Front at Boismier
		allStops.put("2195", "1123"); // International at Front
		allStops.put("2196", "1124"); // Michigan at International
		allStops.put("2197", "1125"); // Michigan at Fields
		allStops.put("2198", "1126"); // Michigan at Delaware
		allStops.put("2199", "1127"); // Michigan at Laurier
		allStops.put("2200", "1128"); // Laurier at Hazel
		allStops.put("2201", "1129"); // Laurier at Alfred
		allStops.put("2202", "1130"); // Laurier at Mayfair
		allStops.put("2203", "1131"); // Laurier at Marquette
		allStops.put("2204", "1132"); // Laurier at Matchette
		allStops.put("2205", "1133"); // Laurier at First
		allStops.put("2206", "1134"); // Laurier at Selkirk
		allStops.put("2207", "1135"); // Laurier at Tacoma
		allStops.put("2208", "1136"); // Laurier at Malden
		allStops.put("2168", "1137"); // Vollmer Centre Front Entrance
		allStops.put("2169", "1138"); // Mike Raymond at Malden
		allStops.put("2170", "1139"); // Malden at Laurier
		allStops.put("2171", "1140"); // Malden at Bouffard
		allStops.put("2172", "1141"); // Malden at Rosati
		allStops.put("2209", "1142"); // Malden at Reaume
		allStops.put("2210", "1143"); // Malden at Valiant
		allStops.put("2211", "1144"); // Malden at Stuart
		allStops.put("2212", "1145"); // Malden at Edgemore
		allStops.put("2213", "1146"); // Malden at Grillo
		allStops.put("2214", "1147"); // Malden at Normandy
		allStops.put("2215", "1148"); // Delmar at Trinity
		allStops.put("2216", "1149"); // Ellis at Normandy
		allStops.put("2217", "1150"); // Normandy at Seventh
		allStops.put("2218", "1151"); // Normandy at Tenth
		allStops.put("2219", "1152"); // Normandy at Thirteenth
		allStops.put("2220", "1153"); // Normandy at Huron Church
		allStops.put("2221", "1154"); // Huron Church at Disputed
		allStops.put("2222", "1155"); // Huron Church at Skinner
		allStops.put("2223", "1156"); // Sandwich West at Huron Church
		allStops.put("2224", "1157"); // Sandwich West at Mary
		allStops.put("2225", "1158"); // Sandwich West at D'Amore
		allStops.put("2226", "1159"); // Sandwich West at Durocher
		allStops.put("2227", "1160"); // Sandwich West at Lovell
		allStops.put("2228", "1161"); // Heritage at Sandwich West
		allStops.put("2229", "1162"); // Heritage at Rushwood
		allStops.put("2230", "1163"); // Heritage at Rushwood
		allStops.put("2231", "1164"); // Heritage at Blackthorn
		allStops.put("2232", "1165"); // Heritage at Sixth Concession
		allStops.put("2233", "1166"); // Sixth Concession at Montgomery
		allStops.put("2140", "1167"); // St Clair Front Entrance
		allStops.put("2141", "1168"); // Montgomery at Surrey
		allStops.put("2142", "1169"); // Montgomery at Eastbourne
		allStops.put("2143", "1170"); // Heritage at Winfield
		allStops.put("2144", "1171"); // Heritage at Winfield
		allStops.put("2145", "1172"); // Heritage at Rushwood
		allStops.put("2146", "1173"); // Heritage at Rushwood
		allStops.put("2147", "1174"); // Heritage at Sandwich West
		allStops.put("2148", "1175"); // Sandwich West at Lovell
		allStops.put("2149", "1176"); // Sandwich West at Durocher
		allStops.put("2150", "1177"); // Sandwich West at D'Amore
		allStops.put("2151", "1178"); // Sandwich West at Mary
		allStops.put("2152", "1179"); // Sandwich West at Huron Church
		allStops.put("2153", "1180"); // Huron Church at Skinner
		allStops.put("2154", "1181"); // Huron Church at Cousineau
		allStops.put("2155", "1182"); // Normandy at Huron Church
		allStops.put("2156", "1183"); // Normandy at Twelfth
		allStops.put("2157", "1184"); // Normandy at Tenth
		allStops.put("2158", "1185"); // Normandy at Seventh
		allStops.put("2159", "1186"); // Ellis at Normandy
		allStops.put("2160", "1187"); // Delmar at Trinity
		allStops.put("2161", "1188"); // Malden at Normandy
		allStops.put("2162", "1189"); // Malden at Morton
		allStops.put("2163", "1190"); // Malden at Edgemore
		allStops.put("2164", "1191"); // Malden at Outram
		allStops.put("2165", "1192"); // Malden at Monty
		allStops.put("2166", "1193"); // Malden at Rosati
		allStops.put("2167", "1194"); // Malden at Bouffard
		allStops.put("2173", "1195"); // Reaume at Malden
		allStops.put("2174", "1196"); // Reaume at Woodbridge
		allStops.put("2175", "1197"); // Reaume at Deerview
		allStops.put("2176", "1198"); // Reaume at Piruzza
		allStops.put("2177", "1199"); // Reaume at Matchette
		allStops.put("2178", "1200"); // Matchette at Monty
		allStops.put("2179", "1201"); // Matchette at Minto
		allStops.put("2180", "1202"); // Morton at Matchette
		allStops.put("2181", "1203"); // Morton at Quick
		allStops.put("2182", "1204"); // Morton at Wales
		allStops.put("2183", "1205"); // Morton at Ramblewood
		allStops.put("2184", "1206"); // Morton at Ramblewood
		ALL_STOPS = allStops;
	}
}

