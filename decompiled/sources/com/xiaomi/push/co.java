package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes4.dex */
public class co {

    /* renamed from: a, reason: collision with root package name */
    private static int f14494a = -1;

    /* renamed from: a, reason: collision with other field name */
    private static cs f287a;

    /* renamed from: a, reason: collision with other field name */
    private static String f288a;

    public static void a(Context context, fb fbVar) {
        if (m11975a(context)) {
            if (f287a == null) {
                f287a = new cs(context);
            }
            fbVar.a(f287a);
            a("startStats");
        }
    }

    public static void b(Context context, fb fbVar) {
        cs csVar = f287a;
        if (csVar != null) {
            fbVar.b(csVar);
            f287a = null;
            a("stopStats");
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    private static boolean m11975a(Context context) {
        return cl.a(context);
    }

    public static void a(Context context, String str, int i) {
        if (!m11975a(context)) {
            a("onDisconnection shouldSampling = false");
            return;
        }
        cr.a(context, str, av.b(context), System.currentTimeMillis(), i, com.xiaomi.push.service.m.a(context).m12460b(), a(context), a(), f14494a);
        a("onDisconnection");
    }

    /* renamed from: a, reason: collision with other method in class */
    public static void m11974a(Context context) {
        if (!m11975a(context)) {
            a("onReconnection shouldSampling = false");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        f14494a = a(context);
        cr.a(context, currentTimeMillis);
        a("onReconnection connectedNetworkType = " + f14494a);
    }

    public static void a(Context context, String str) {
        if (!m11975a(context)) {
            a("onWifiChanged shouldSampling = false");
            return;
        }
        a("onWifiChanged wifiDigest = " + str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        b("W-" + str);
    }

    private static int a(Context context) {
        try {
            aw m11877a = av.m11877a();
            if (m11877a != null) {
                if (m11877a.a() == 0) {
                    String m11889b = m11877a.m11889b();
                    b((TextUtils.isEmpty(m11889b) || "UNKNOWN".equalsIgnoreCase(m11889b)) ? null : "M-" + m11889b);
                    return 0;
                }
                if (m11877a.a() != 1 && m11877a.a() != 6) {
                    b(null);
                    return -1;
                }
                b("WIFI-ID-UNKNOWN");
                return 1;
            }
            b(null);
            return -1;
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.d("DisconnectStatsHelper getNetType occurred error: " + e.getMessage());
            b(null);
            return -1;
        }
    }

    private static synchronized void b(String str) {
        synchronized (co.class) {
            if ("WIFI-ID-UNKNOWN".equals(str)) {
                String str2 = f288a;
                if (str2 == null || !str2.startsWith("W-")) {
                    f288a = null;
                }
            } else {
                f288a = str;
            }
            a("updateNetId new networkId = " + str + ", finally netId = " + f288a);
        }
    }

    private static synchronized String a() {
        String str;
        synchronized (co.class) {
            str = f288a;
        }
        return str;
    }

    static void a(String str) {
        cl.a("Push-DiscntStats", str);
    }
}
