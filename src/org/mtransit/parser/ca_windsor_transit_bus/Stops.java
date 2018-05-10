package org.mtransit.parser.ca_windsor_transit_bus;

import java.util.HashMap;

public class Stops {
	public static HashMap<String, String> ALL_STOPS;
	static {
		HashMap<String, String> allStops = new HashMap<String, String>();
		allStops.put("stop_code", "stop_id"); // stop_name
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
		allStops.put("1055", "76"); // Sandwich at Chewitt
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
		allStops.put("1077", "204"); // Sandwich at Chewitt
		allStops.put("1074", "205"); // Sandwich at Detroit
		allStops.put("1072", "206"); // Mill at Sandwich
		allStops.put("1070", "207"); // Mill at Wyandotte
		allStops.put("1068", "208"); // Felix at Linwood
		allStops.put("1066", "209"); // College at Felix
		allStops.put("1206", "210"); // College Ave. at Community Centre
		allStops.put("1116", "211"); // Prince at King
		allStops.put("1211", "212"); // Prince at Peter
		allStops.put("1213", "213"); // Sandwich at Watkins
		allStops.put("1215", "214"); // Sandwich at South
		allStops.put("1217", "215"); // Sandwich at Chippawa
		allStops.put("1219", "216"); // Sandwich at Brock
		allStops.put("1222", "217"); // Wyandotte at Mill
		allStops.put("1224", "218"); // Wyandotte at Rosedale
		allStops.put("1226", "219"); // Wyandotte at Huron Church
		allStops.put("1228", "220"); // Wyandotte at Sunset
		allStops.put("1231", "221"); // Wyandotte at Randolph
		allStops.put("1233", "222"); // Wyandotte at Bridge
		allStops.put("1235", "223"); // Wyandotte at Campbell
		allStops.put("1237", "224"); // Wyandotte at McKay
		allStops.put("1239", "225"); // Wyandotte at Wellington
		allStops.put("1241", "226"); // Wyandotte at Crawford
		allStops.put("1243", "227"); // Wyandotte at Caron
		allStops.put("1245", "228"); // Wyandotte at Bruce
		allStops.put("1248", "229"); // Wyandotte at Victoria
		allStops.put("1250", "230"); // Wyandotte at Ouellette
		allStops.put("1251", "231"); // Wyandotte at Dufferin
		allStops.put("1253", "232"); // Wyandotte at Windsor
		allStops.put("1255", "233"); // Wyandotte at McDougall
		allStops.put("1257", "234"); // Wyandotte at Glengarry
		allStops.put("1258", "235"); // Wyandotte at Aylmer
		allStops.put("1261", "236"); // Wyandotte at Marentette
		allStops.put("1263", "237"); // Wyandotte at Parent
		allStops.put("1265", "238"); // Wyandotte at Marion
		allStops.put("1267", "239"); // Wyandotte at Hall
		allStops.put("1269", "240"); // Wyandotte at Gladstone
		allStops.put("1270", "241"); // Wyandotte at Lincoln
		allStops.put("1273", "242"); // Wyandotte at Devonshire
		allStops.put("1274", "243"); // Wyandotte at Monmouth
		allStops.put("1276", "244"); // Wyandotte at Walker
		allStops.put("1278", "245"); // Wyandotte at Albert
		allStops.put("1280", "246"); // Wyandotte at Drouillard
		allStops.put("1282", "247"); // Wyandotte at Belleview
		allStops.put("1284", "248"); // Wyandotte at Strabane
		allStops.put("1286", "249"); // Wyandotte at Sterling
		allStops.put("1288", "250"); // Wyandotte at George
		allStops.put("1290", "251"); // Wyandotte at Rossini
		allStops.put("1292", "252"); // Wyandotte at Jos. Janisse
		allStops.put("1294", "253"); // Wyandotte at Pillette
		allStops.put("1296", "254"); // Wyandotte at Raymo
		allStops.put("1298", "255"); // Wyandotte at Westminster
		allStops.put("1300", "256"); // Wyandotte at Ford
		allStops.put("1301", "257"); // Wyandotte at Prado
		allStops.put("1303", "258"); // Wyandotte at St. Louis
		allStops.put("1306", "259"); // Wyandotte at Jefferson
		allStops.put("1308", "260"); // Wyandotte at Victor
		allStops.put("1311", "261"); // Wyandotte at St. Marys
		allStops.put("1315", "262"); // Wyandotte at St. Rose
		allStops.put("1317", "263"); // Wyandotte at Edward
		allStops.put("1318", "264"); // Wyandotte at Fairview
		allStops.put("1320", "265"); // Wyandotte at Matthew Brady
		allStops.put("1324", "266"); // Lauzon at Wyandotte
		allStops.put("1326", "267"); // Lauzon at Cedarview
		allStops.put("1328", "268"); // Lauzon at Clairview
		allStops.put("1330", "269"); // Lauzon at Riverside
		allStops.put("1333", "270"); // Riverside at Watson
		allStops.put("1337", "271"); // Riverside at Bayview Towers
		allStops.put("1339", "272"); // Riverside at St Clair Towers
		allStops.put("1341", "273"); // Riverside at Island View Towers
		allStops.put("1343", "274"); // Riverside at Westchester
		allStops.put("1345", "275"); // Riverdale at Cedarview
		allStops.put("1347", "276"); // Riverdale at Menard
		allStops.put("1349", "277"); // Riverdale at Wyandotte
		allStops.put("1351", "278"); // Riverdale at Jerome
		allStops.put("1353", "279"); // Riverdale at St. Rose
		allStops.put("1356", "280"); // Little River Acres at Abbey
		allStops.put("1358", "281"); // Little River Acres at Aire
		allStops.put("1360", "282"); // Little RiverAcres at Copperfield
		allStops.put("1362", "283"); // Little River Acres at East Moor
		allStops.put("1364", "284"); // Little RiverAcres at LittleRiver
		allStops.put("1365", "285"); // Little River at Laporte
		allStops.put("1366", "286"); // Lauzon Road at Edgar
		allStops.put("1367", "287"); // Lauzon Rd. at ABC Day Nursery
		allStops.put("1369", "288"); // Lauzon at Tranby
		allStops.put("1371", "289"); // Lauzon Parkway at Lauzon Line
		allStops.put("1373", "290"); // Lauzon Parkway at VIA Tracks
		allStops.put("1375", "291"); // Tecumseh Mall Rear Entrance
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
		allStops.put("1504", "463"); // N. Service at Central
		allStops.put("1502", "464"); // Grand Marais at Allyson
		allStops.put("1500", "465"); // Grand Marais at Tourangeau
		allStops.put("1498", "466"); // Grand Marais at Bernard
		allStops.put("1496", "467"); // Grand Marais at Pillette
		allStops.put("1494", "468"); // Pillette at Adstoll
		allStops.put("1492", "469"); // Pillette at Tecumseh
		allStops.put("1490", "470"); // Pillette at Guy
		allStops.put("1488", "471"); // Pillette at Milloy
		allStops.put("1486", "472"); // Pillette at Alice
		allStops.put("1484", "473"); // Pillette at Reginald
		allStops.put("1580", "474"); // Seminole at Pillette
		allStops.put("1578", "475"); // Seminole at Ellrose
		allStops.put("1576", "476"); // Seminole at Bernard
		allStops.put("1481", "477"); // George at Seminole
		allStops.put("1479", "478"); // George at Reginald
		allStops.put("1477", "479"); // George at Alice
		allStops.put("1475", "480"); // George at Milloy
		allStops.put("1313", "481"); // George at Guy
		allStops.put("1471", "482"); // Hickory at Tecumseh
		allStops.put("1469", "483"); // Hickory at Milloy
		allStops.put("1467", "484"); // Drouillard at Alice
		allStops.put("1465", "485"); // Drouillard at Reginald
		allStops.put("1463", "486"); // Drouillard at Seminole
		allStops.put("1462", "487"); // Drouillard at Metcalfe
		allStops.put("1460", "488"); // Drouillard at Franklin
		allStops.put("1458", "489"); // Drouillard at Ontario
		allStops.put("1456", "490"); // Richmond at Drouillard
		allStops.put("1454", "491"); // Richmond at St. Luke
		allStops.put("1453", "492"); // Richmond at Walker
		allStops.put("1450", "493"); // Richmond at Monmouth
		allStops.put("1448", "494"); // Richmond at Chilver
		allStops.put("1446", "495"); // Richmond at Lincoln
		allStops.put("1445", "496"); // Erie at Lincoln
		allStops.put("1443", "497"); // Erie at Moy
		allStops.put("1442", "498"); // Erie at Marion
		allStops.put("1440", "499"); // Erie at Elsmere
		allStops.put("1436", "500"); // Erie at Louis
		allStops.put("1434", "501"); // Erie at Howard
		allStops.put("1432", "502"); // Erie at McDougall
		allStops.put("1426", "503"); // Erie at Goyeau
		allStops.put("1428", "504"); // Erie at Ouellette
		allStops.put("1424", "505"); // Crawford at Wyandotte
		allStops.put("1423", "506"); // Crawford at Elliott
		allStops.put("1421", "507"); // Crawford at College
		allStops.put("1419", "508"); // Crawford at Erie
		allStops.put("1417", "509"); // Crawford at Grove
		allStops.put("1414", "510"); // Crawford at Tecumseh
		allStops.put("1412", "511"); // Tecumseh at Crawford
		allStops.put("1411", "512"); // Tecumseh at McKay
		allStops.put("1407", "513"); // Tecumseh at Campbell
		allStops.put("1406", "514"); // Tecumseh at Bridge
		allStops.put("1404", "515"); // Tecumseh at Randolph
		allStops.put("1402", "516"); // Tecumseh at California
		allStops.put("1400", "517"); // Tecumseh at Northway
		allStops.put("1398", "518"); // Tecumseh at Huron Church
		allStops.put("1396", "519"); // Tecumseh at Felix
		allStops.put("2051", "520"); // Transit Terminal at Chatham
		allStops.put("1656", "521"); // Essex Way at Meadowbrook
		allStops.put("1658", "522"); // Forest Glade at Lauzon Parkway
		allStops.put("1657", "523"); // Forest Glade at Lauzon
		allStops.put("1655", "524"); // Beachdale at Chestnut
		allStops.put("1653", "525"); // Esplanade at Beachdale
		allStops.put("1651", "526"); // Esplanade at Ridge
		allStops.put("1649", "527"); // Esplanade at Lilac
		allStops.put("1647", "528"); // Lilac at Lauzon
		allStops.put("1645", "529"); // Lauzon Road at Hawthorne
		allStops.put("1643", "530"); // Lauzon Road at Yolanda
		allStops.put("1639", "531"); // Clemenceau at Rose
		allStops.put("1637", "532"); // Clemenceau at Joinville
		allStops.put("1635", "533"); // Clemenceau at Haig
		allStops.put("1633", "534"); // Clemenceau at Grand
		allStops.put("1631", "535"); // Clemenceau at Roosevelt
		allStops.put("1629", "536"); // Queen Elizabeth at Clemenceau
		allStops.put("1626", "537"); // Queen Elizabeth at Grandview
		allStops.put("1623", "538"); // Queen Elizabeth at Clarence
		allStops.put("1621", "539"); // Rivard at Queen Elizabeth
		allStops.put("1619", "540"); // Rivard at Library
		allStops.put("1617", "541"); // Rivard at Grand
		allStops.put("1615", "542"); // Rivard at Haig
		allStops.put("1613", "543"); // Rivard at Joinville
		allStops.put("1611", "544"); // Rivard at Rose
		allStops.put("1609", "545"); // Ford at Empress
		allStops.put("1607", "546"); // Ford at Coronation
		allStops.put("1605", "547"); // Ford at Lassaline
		allStops.put("1603", "548"); // Ford at Reginald
		allStops.put("1601", "549"); // South National at Ford
		allStops.put("1599", "550"); // South National at Ferndale
		allStops.put("1597", "551"); // South National at Balfour
		allStops.put("1595", "552"); // Jefferson at South National
		allStops.put("1593", "553"); // Jefferson at Edgar
		allStops.put("1591", "554"); // Jefferson at Raymond
		allStops.put("1589", "555"); // Jefferson at Ontario
		allStops.put("1588", "556"); // Pillette at Wyandotte
		allStops.put("1586", "557"); // Pillette at Ontario
		allStops.put("1584", "558"); // Pillette at South National
		allStops.put("1582", "559"); // Pillette at Metcalfe
		allStops.put("1573", "560"); // Seminole at George
		allStops.put("1570", "561"); // Seminole at Central
		allStops.put("1568", "562"); // Seminole at Chandler
		allStops.put("1566", "563"); // Seminole at Drouillard
		allStops.put("1662", "564"); // Walker at Ontario
		allStops.put("1560", "565"); // Ottawa at Monmouth
		allStops.put("1557", "566"); // Ottawa at Kildare
		allStops.put("1555", "567"); // Ottawa at Lincoln
		allStops.put("1552", "568"); // Ottawa at Gladstone
		allStops.put("1550", "569"); // Ottawa at Hall
		allStops.put("1548", "570"); // Ottawa at Benjamin
		allStops.put("1545", "571"); // Parent at Ottawa
		allStops.put("2064", "572"); // Parent at Giles
		allStops.put("1529", "573"); // Transit Windsor Terminal
		allStops.put("2063", "574"); // Giles at Parent
		allStops.put("1546", "575"); // Ottawa at Parent
		allStops.put("1549", "576"); // Ottawa at Pierre
		allStops.put("1551", "577"); // Ottawa at Moy
		allStops.put("1553", "578"); // Ottawa at Gladstone
		allStops.put("1554", "579"); // Ottawa at Lincoln
		allStops.put("1556", "580"); // Ottawa at Kildare
		allStops.put("1559", "581"); // Ottawa at Walker
		allStops.put("1661", "582"); // Walker at Ontario
		allStops.put("1565", "583"); // Seminole at Drouillard
		allStops.put("1567", "584"); // Seminole at Chandler
		allStops.put("1569", "585"); // Seminole at Central
		allStops.put("1571", "586"); // Seminole at Westcott
		allStops.put("1579", "587"); // Pillette at Seminole
		allStops.put("1581", "588"); // Pillette at Metcalfe
		allStops.put("1583", "589"); // Pillette at South National
		allStops.put("1585", "590"); // Pillette at Ontario
		allStops.put("1587", "591"); // Pillette at Wyandotte
		allStops.put("1590", "592"); // Jefferson at Ontario
		allStops.put("1592", "593"); // Jefferson at Raymond
		allStops.put("1594", "594"); // Jefferson at Edgar
		allStops.put("1596", "595"); // South National at Jefferson
		allStops.put("1598", "596"); // South National at Balfour
		allStops.put("1600", "597"); // South National at Ferndale
		allStops.put("1602", "598"); // South National at Ford
		allStops.put("1604", "599"); // Ford at Reginald
		allStops.put("1606", "600"); // Ford at Lassaline
		allStops.put("1608", "601"); // Ford at Coronation
		allStops.put("1610", "602"); // Ford at Empress
		allStops.put("1612", "603"); // Rivard at Joinville
		allStops.put("1614", "604"); // Rivard at Haig
		allStops.put("1616", "605"); // Rivard at Grand
		allStops.put("1618", "606"); // Rivard at Ambassador Church
		allStops.put("1620", "607"); // Rivard at Queen Elizabeth
		allStops.put("1622", "608"); // Queen Elizabeth at Clarence
		allStops.put("1625", "609"); // Queen Elizabeth at Harmony
		allStops.put("1628", "610"); // Queen Elizabeth at Clemenceau
		allStops.put("1630", "611"); // Clemenceau at Roosevelt
		allStops.put("1632", "612"); // Clemenceau at Grand
		allStops.put("1634", "613"); // Clemenceau at Haig
		allStops.put("1636", "614"); // Clemenceau at Joinville
		allStops.put("1159", "615"); // Rose at Clemenceau
		allStops.put("1642", "616"); // Lauzon Rd. at Yolanda
		allStops.put("1644", "617"); // Lauzon Rd. at Hawthorne
		allStops.put("1646", "618"); // Hawthorne at Sycamore
		allStops.put("1648", "619"); // Meadowbrook at Hawthorne
		allStops.put("1650", "620"); // Meadowbrook at Parkside Estates
		allStops.put("1652", "621"); // Meadowbrook at Optimist Park
		allStops.put("1654", "622"); // Meadowbrook at Essex Way
		allStops.put("1660", "623"); // Cantelon at Kew
		allStops.put("1659", "624"); // Cantelon at Lauzon Parkway
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
		allStops.put("1734", "641"); // St. Clair College Front Entrance
		allStops.put("1817", "642"); // Cousineau at Highway 3
		allStops.put("1816", "643"); // Cousineau at Mount Royal
		allStops.put("1814", "644"); // Cousineau at Casgrain
		allStops.put("1813", "645"); // Cousineau at Country Club
		allStops.put("1809", "646"); // Country Club at Hunt Club
		allStops.put("1807", "647"); // Country Club at Shade Tree
		allStops.put("1804", "648"); // Country Club at Lake Trail
		allStops.put("1800", "649"); // Howard at North Talbot
		allStops.put("1799", "650"); // Howard at Wallace
		allStops.put("1797", "651"); // Howard at Ducharme
		allStops.put("1794", "652"); // Howard at Morand
		allStops.put("1792", "653"); // Cabana at Howard
		allStops.put("1791", "654"); // Cabana at Huntington
		allStops.put("1788", "655"); // Cabana at Dougall
		allStops.put("1786", "656"); // Dougall at Granada
		allStops.put("1784", "657"); // Dougall at Medina
		allStops.put("1782", "658"); // Dougall at Beals
		allStops.put("1387", "659"); // Dougall at Liberty
		allStops.put("1780", "660"); // Dougall at Norfolk
		allStops.put("1777", "661"); // Dougall at Nottingham Walmart
		allStops.put("1390", "662"); // Dougall Town Centre
		allStops.put("1775", "663"); // Dougall at West Grand
		allStops.put("1773", "664"); // Dougall at South Cameron
		allStops.put("1771", "665"); // Eugenie at Dougall
		allStops.put("1769", "666"); // Dougall at Rose Bowl
		allStops.put("1767", "667"); // Dougall at Dougall Square
		allStops.put("1763", "668"); // Dougall at Brentwood
		allStops.put("1761", "669"); // Dougall at Wear
		allStops.put("1759", "670"); // Tecumseh at York
		allStops.put("1757", "671"); // Bruce at Hanna
		allStops.put("1753", "672"); // Bruce at Shepherd
		allStops.put("1751", "673"); // Bruce at Clinton
		allStops.put("1749", "674"); // Bruce at Giles
		allStops.put("1747", "675"); // Bruce at Pine
		allStops.put("1745", "676"); // Bruce at Erie
		allStops.put("1433", "677"); // Bruce at Caroline
		allStops.put("1743", "678"); // Bruce at Elliott
		allStops.put("1742", "679"); // Bruce at Wyandotte
		allStops.put("1740", "680"); // Bruce at Park
		allStops.put("1738", "681"); // Bruce at University
		allStops.put("1737", "682"); // Transit Terminal at Chatham
		allStops.put("1739", "683"); // Janette at Park
		allStops.put("1741", "684"); // Janette at Wyandotte
		allStops.put("1382", "685"); // Janette at Elliott
		allStops.put("1384", "686"); // Janette at Caroline
		allStops.put("1385", "687"); // Erie at Janette
		allStops.put("1744", "688"); // Erie at Church
		allStops.put("1746", "689"); // Dougall at Pine
		allStops.put("1748", "690"); // Dougall at Giles
		allStops.put("1750", "691"); // Dougall at Montrose
		allStops.put("1752", "692"); // Dougall at Ellis
		allStops.put("1754", "693"); // Dougall at Shepherd
		allStops.put("1756", "694"); // Dougall at Hanna
		allStops.put("1758", "695"); // Dougall at Tecumseh
		allStops.put("1760", "696"); // Dougall at Wear
		allStops.put("1762", "697"); // Dougall at Jackson Park
		allStops.put("1764", "698"); // Dougall at Windsor Sportsmen
		allStops.put("1766", "699"); // Dougall at Dorwin Plaza
		allStops.put("1768", "700"); // Dougall at Dougall Plaza
		allStops.put("1770", "701"); // Eugenie at Pellisier
		allStops.put("1774", "702"); // Dougall at South Cameron
		allStops.put("1776", "703"); // Dougall at West Grand
		allStops.put("1778", "704"); // Dougall at Nottingham Walmart
		allStops.put("1779", "705"); // Dougall at Norfolk
		allStops.put("1781", "706"); // Dougall at Liberty
		allStops.put("1783", "707"); // Dougall at Beals
		allStops.put("1785", "708"); // Dougall at Medina
		allStops.put("1787", "709"); // Dougall at Granada
		allStops.put("1789", "710"); // Cabana at Dougall
		allStops.put("1790", "711"); // Cabana at Huntington
		allStops.put("1793", "712"); // Cabana at Howard
		allStops.put("1795", "713"); // Howard at Morand
		allStops.put("1796", "714"); // Howard at Ducharme
		allStops.put("1798", "715"); // Howard at Wallace
		allStops.put("1801", "716"); // Howard at Neal
		allStops.put("1803", "717"); // Country Club at Tournament
		allStops.put("1806", "718"); // Country Club at Rodfam
		allStops.put("1808", "719"); // Country Club at Hunt Club
		allStops.put("1810", "720"); // Country Club at Cousineau
		allStops.put("1812", "721"); // Cousineau at Casgrain
		allStops.put("1815", "722"); // Cousineau at Mt. Royal
		allStops.put("1732", "723"); // Cousineau at Highway 3
		allStops.put("1997", "724"); // Sixth Concession at North Talbot
		allStops.put("1993", "725"); // Sixth Concession at Holburn
		allStops.put("1991", "726"); // Holburn at Spago
		allStops.put("1989", "727"); // Ducharme at Holburn
		allStops.put("1987", "728"); // Ducharme at Canberra
		allStops.put("1985", "729"); // Ducharme at Periwinkle
		allStops.put("1983", "730"); // Ducharme at Fontana
		allStops.put("1981", "731"); // Ducharme at Lavender
		allStops.put("1979", "732"); // Ducharme at Walker
		allStops.put("1977", "733"); // Walker at Provincial
		allStops.put("1975", "734"); // Walker at 7th Concession
		allStops.put("1973", "735"); // Walker at Walker Crossings
		allStops.put("1971", "736"); // Walker at Canadian Tire
		allStops.put("1969", "737"); // Walker at Ferrari Plaza
		allStops.put("1966", "738"); // Walker at Division
		allStops.put("1964", "739"); // Walker at Moxlay
		allStops.put("1963", "740"); // Walker at Airport
		allStops.put("1961", "741"); // Walker at Melinda
		allStops.put("1959", "742"); // Walker at Calderwood
		allStops.put("1957", "743"); // Walker at Lappan
		allStops.put("1955", "744"); // Walker at Foster
		allStops.put("1953", "745"); // Walker at Seymour
		allStops.put("1951", "746"); // Walker at Sydney
		allStops.put("1949", "747"); // Walker at Digby
		allStops.put("1947", "748"); // Walker at Parkdale
		allStops.put("1945", "749"); // Walker at Grand Marais
		allStops.put("1943", "750"); // Walker at St. Julien
		allStops.put("1941", "751"); // Walker at Somme
		allStops.put("1939", "752"); // Ypres at Turner
		allStops.put("1937", "753"); // Ypres at Kildare
		allStops.put("1935", "754"); // Ypres at Lincoln
		allStops.put("1933", "755"); // Lincoln at Vimy
		allStops.put("1931", "756"); // Lincoln at Lens
		allStops.put("1929", "757"); // Lincoln at Tecumseh
		allStops.put("1805", "758"); // Lincoln at Mohawk
		allStops.put("1927", "759"); // Lincoln at Seneca
		allStops.put("1925", "760"); // Lincoln at ETR Rail Tracks
		allStops.put("1923", "761"); // Lincoln at Shepherd
		allStops.put("1921", "762"); // Lincoln at Ottawa
		allStops.put("1919", "763"); // Lincoln at Ontario
		allStops.put("1917", "764"); // Lincoln at Richmond
		allStops.put("1915", "765"); // Lincoln at Erie
		allStops.put("1913", "766"); // Lincoln at Niagara
		allStops.put("1911", "767"); // Lincoln at Cataraqui
		allStops.put("1909", "768"); // Lincoln at Wyandotte
		allStops.put("1907", "769"); // Lincoln at Assumption
		allStops.put("1811", "770"); // Riverside at Gladstone
		allStops.put("1905", "771"); // Riverside at Hall
		allStops.put("1802", "772"); // Riverside at Langlois
		allStops.put("1903", "773"); // Riverside at Parent
		allStops.put("1901", "774"); // Riverside at Aylmer
		allStops.put("1899", "775"); // Riverside at McDougall
		allStops.put("1898", "776"); // Riverside at Goyeau
		allStops.put("1896", "777"); // Ferry at Riverside
		allStops.put("1894", "778"); // Transit Terminal Church at Pitt
		allStops.put("1968", "779"); // Airport at Front Entrance
		allStops.put("1895", "780"); // Riverside at Ouellette
		allStops.put("1897", "781"); // Riverside at McDougall
		allStops.put("1900", "782"); // Riverside at Aylmer
		allStops.put("1902", "783"); // Riverside at Parent
		allStops.put("1818", "784"); // Riverside at Langlois
		allStops.put("1904", "785"); // Riverside at Hall
		allStops.put("1864", "786"); // Riverside at Gladstone
		allStops.put("1906", "787"); // Gladstone at Assumption
		allStops.put("1908", "788"); // Gladstone at Wyandotte
		allStops.put("1910", "789"); // Gladstone at Cataraqui
		allStops.put("1912", "790"); // Gladstone at Niagara
		allStops.put("1916", "791"); // Gladstone at Richmond
		allStops.put("1918", "792"); // Gladstone at Giles
		allStops.put("1920", "793"); // Gladstone at Ottawa
		allStops.put("1865", "794"); // Gladstone at Ellis
		allStops.put("1922", "795"); // Shepherd at Lincoln
		allStops.put("1924", "796"); // Lincoln at ETR Rail Tracks
		allStops.put("1926", "797"); // Lincoln at Seneca
		allStops.put("1928", "798"); // Lincoln at Tecumseh
		allStops.put("1930", "799"); // Lincoln at Lens
		allStops.put("1932", "800"); // Lincoln at Vimy
		allStops.put("1934", "801"); // Lincoln at Ypres
		allStops.put("1936", "802"); // Ypres at Kildare
		allStops.put("1938", "803"); // Ypres at Turner
		allStops.put("1940", "804"); // Walker at Somme
		allStops.put("1942", "805"); // Walker at St. Julien
		allStops.put("1944", "806"); // Walker at Grand Marais
		allStops.put("1946", "807"); // Walker at Parkdale
		allStops.put("1948", "808"); // Walker at Digby
		allStops.put("1950", "809"); // Walker at Sydney
		allStops.put("1952", "810"); // Walker at Seymour
		allStops.put("1954", "811"); // Walker at Foster
		allStops.put("1956", "812"); // Walker at Lappan
		allStops.put("1958", "813"); // Walker at Calderwood
		allStops.put("1960", "814"); // Walker at Melinda
		allStops.put("1962", "815"); // Walker at Ledyard
		allStops.put("1772", "816"); // Walker at Moxley
		allStops.put("1965", "817"); // Walker at Division
		allStops.put("1967", "818"); // Walker at Home Depot Plaza
		allStops.put("1970", "819"); // Walker at Canada Post
		allStops.put("1972", "820"); // Walker at Best Buy
		allStops.put("1974", "821"); // Walker at Costco
		allStops.put("1976", "822"); // Walker at Legacy Park
		allStops.put("1978", "823"); // Walker at Provincial
		allStops.put("1980", "824"); // Walker at Ducharme
		allStops.put("1982", "825"); // Walker at Highway 401
		allStops.put("1984", "826"); // Walker at U-Haul
		allStops.put("1986", "827"); // Walker at North Talbot
		allStops.put("1988", "828"); // North Talbot at Halford
		allStops.put("1990", "829"); // North Talbot at Burke
		allStops.put("1992", "830"); // North Talbot at Dumouchelle
		allStops.put("1994", "831"); // North Talbot at Old West
		allStops.put("1995", "832"); // North Talbot at Pioneer
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

