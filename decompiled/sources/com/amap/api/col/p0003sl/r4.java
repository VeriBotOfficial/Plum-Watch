package com.amap.api.col.p0003sl;

import android.content.Context;
import android.text.TextUtils;
import com.autonavi.aps.amapapi.config.Const;
import com.autonavi.aps.amapapi.utils.CoreUtil;
import com.autonavi.aps.amapapi.utils.ReportUtil;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: StatisticsUtil.java */
/* loaded from: classes11.dex */
public class r4 {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f1854a = false;
    private static boolean b = false;
    private static boolean c = false;
    private static boolean d = false;
    private static boolean e = false;
    private static boolean f = false;
    private static boolean g = false;
    private static boolean h = false;
    private static boolean i = false;
    private static boolean j = false;
    private static HashMap<String, Boolean> k = new HashMap<>();

    static {
        new ConcurrentHashMap();
        new ConcurrentHashMap();
    }

    public static void a(Context context, boolean z) {
        String str;
        try {
            try {
                StringBuilder sb = new StringBuilder("{\"Quest\":");
                sb.append(z).append("}");
                str = sb.toString();
            } catch (Throwable th) {
                th.printStackTrace();
                str = null;
            }
            yb ybVar = new yb(context, "3dmap", CoreUtil.STR_CONFIG_VERSION, "O001");
            ybVar.a(str);
            zb.a(ybVar, context);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public static void b(Context context, boolean z) {
        if (f1854a) {
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("amap_3dmap_stylemap", Integer.valueOf(z ? 1 : 0));
            a(context, "O006", a(hashMap));
            f1854a = true;
        } catch (Throwable unused) {
        }
    }

    public static void c(Context context, boolean z) {
        if (b) {
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("amap_3dmap_indoormap", Integer.valueOf(z ? 1 : 0));
            a(context, "O007", a(hashMap));
            b = true;
        } catch (Throwable unused) {
        }
    }

    public static void d(Context context) {
        if (d) {
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("amap_3dmap_offlinemap", 1);
            a(context, "O010", a(hashMap));
            d = true;
        } catch (Throwable unused) {
        }
    }

    public static void e(Context context) {
        if (e) {
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("amap_3dmap_particleoverlay", 1);
            a(context, "O011", a(hashMap));
            e = true;
        } catch (Throwable unused) {
        }
    }

    public static void f(Context context) {
        if (h) {
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("amap_3dmap_wxmapreview", 1);
            a(context, ReportUtil.STATISTICS_ID_LOCTIME_NOTGPS, a(hashMap));
            h = true;
        } catch (Throwable unused) {
        }
    }

    public static void g(Context context) {
        if (f) {
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("amap_3dmap_renderfps", 1);
            a(context, ReportUtil.STATISTICS_ID_LOCTIME_NETWORK, a(hashMap));
            f = true;
        } catch (Throwable unused) {
        }
    }

    public static void h(Context context) {
        if (i) {
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("amap_3dmap_dxmapreview", 1);
            a(context, "0016", a(hashMap));
            i = true;
        } catch (Throwable unused) {
        }
    }

    public static void b(Context context) {
        if (c) {
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("amap_3dmap_heatmap", 1);
            a(context, "O009", a(hashMap));
            c = true;
        } catch (Throwable unused) {
        }
    }

    public static void c(Context context) {
        if (g) {
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("amap_3dmap_bzmapreview", 1);
            a(context, ReportUtil.STATISTICS_ID_SERVICE_ALIVE_TIME, a(hashMap));
            g = true;
        } catch (Throwable unused) {
        }
    }

    public static void a(Context context, long j2) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("amap_3dmap_rendertime", Long.valueOf(j2));
            hashMap.put("amap_3dmap_render_background", 0L);
            a(context, "O005", a(hashMap));
        } catch (Throwable unused) {
        }
    }

    public static synchronized void a(Context context, String str) {
        synchronized (r4.class) {
            if (k != null && !TextUtils.isEmpty(str)) {
                if (k.containsKey(str) && k.get(str).booleanValue()) {
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("amap_3dmap_coordinate", str);
                a(context, "O008", a(hashMap));
                if (!k.containsKey(str)) {
                    k.put(str, Boolean.TRUE);
                }
            }
        }
    }

    public static void b(Context context, String str) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("amap_3dmap_engine_init_fail", str);
            a(context, ReportUtil.STATICS_ID_COORDINATE, a(hashMap));
        } catch (Throwable unused) {
        }
    }

    public static void c(Context context, String str) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("amap_3dmap_res_load_fail", str);
            a(context, "O022", a(hashMap));
        } catch (Throwable unused) {
        }
    }

    public static void a(Context context) {
        if (j) {
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("amap_3dmap_buildingoverlay", 1);
            a(context, ReportUtil.STATISTICS_ID_LOCTIME_GPS, a(hashMap));
            j = true;
        } catch (Throwable unused) {
        }
    }

    public static void a(Context context, int i2) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("amap_3dmap_draw_fail", Integer.valueOf(i2));
            a(context, ReportUtil.STATICS_ID_OFFLINECOUNT, a(hashMap));
        } catch (Throwable unused) {
        }
    }

    private static <T> String a(Map<String, T> map) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(Const.STR_MART_JSON_BEGIN);
            for (Map.Entry<String, T> entry : map.entrySet()) {
                sb.append("\"" + entry.getKey() + "\":").append(entry.getValue());
                sb.append(",");
            }
            sb.deleteCharAt(sb.length() - 1);
            sb.append("}");
            return sb.toString();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private static void a(Context context, String str, String str2) {
        if (context == null) {
            return;
        }
        try {
            yb ybVar = new yb(context, "3dmap", CoreUtil.STR_CONFIG_VERSION, str);
            ybVar.a(str2);
            zb.a(ybVar, context);
        } catch (Throwable unused) {
        }
    }
}
