package com.baidu.location.h;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes15.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f7712a = false;
    public static String b = "loc.map.baidu.com";
    public static String c = "https://blg.map.baidu.com/map_loc_debug/debug_url.json";
    public static String d = "https://loc.map.baidu.com/sdk_ep.php";
    public static String e = "https://loc.map.baidu.com/tcu.php";
    public static String f = "https://loc.map.baidu.com/sdk.php";
    public static String g = "https://loc.map.baidu.com/cfgs/loc/commcfgs";
    public static String h = "https://client.map.baidu.com/phpui2/?";
    public static String i = "https://loc.map.baidu.com/cfgs/indoorloc/indoorroadnet";
    public static String j = "https://aispace.baidu.com/cfgs/indoorloc/indoorbldgrects";
    public static String k = "https://parking.baidu.com/parking/api/parkingdata/getcarportlistforlocation?";
    public static String l = "https://daup.map.baidu.com/cltr/rcvr";
    public static String m = "https://blg.map.baidu.com/cltr/rcvr";
    public static String n = "https://loc.map.baidu.com/vdr_yawcheck";
    public static String o = "https://ofloc.map.baidu.com/locnd";
    public static String p = "https://ofloc.map.baidu.com/locnu";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static String f7713q = "https://aispace.baidu.com/aispacelbs/receiver/recordlog";
    public static String r = "https://ofloc.map.baidu.com/LocBrokerService/do_loc_map_match";
    public static String s = "https://ofloc.map.baidu.com/PlanarStartService/detect_parking_exits";
    public static String t = "https://loc.map.baidu.com/gpsz";
    public static String u = "https://loc.map.baidu.com/indoorlocbuildinginfo.php";
    public static String v = "https://loc.map.baidu.com/cc.php";
    private static boolean w = true;

    public static void a() {
        if (w && !f7712a) {
            w = false;
            for (Field field : d.class.getDeclaredFields()) {
                if (field.getType().equals(String.class) && Modifier.isStatic(field.getModifiers())) {
                    try {
                        field.set(null, field.get(null).toString().replace("//" + b, "//cnloc.map.baidu.com"));
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    public static void b() {
        if (w) {
            return;
        }
        w = true;
        for (Field field : d.class.getDeclaredFields()) {
            if (field.getType().equals(String.class) && Modifier.isStatic(field.getModifiers())) {
                try {
                    field.set(null, field.get(null).toString().replace("//cnloc.map.baidu.com", "//loc.map.baidu.com"));
                } catch (Exception unused) {
                }
            }
        }
    }
}
