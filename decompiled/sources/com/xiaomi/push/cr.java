package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.wakeup.feature.health.bloodGlucose.diabetes.DiabetesRiskFormActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public class cr {

    /* renamed from: a, reason: collision with root package name */
    private static int f14497a;

    private static int a(boolean z) {
        return z ? 1 : 0;
    }

    /* renamed from: a, reason: collision with other method in class */
    private static SharedPreferences m11982a(Context context) {
        return context.getSharedPreferences("sp_disconnect_stats", 0);
    }

    public static void a(final Context context, final String str, final boolean z, final long j, final int i, final long j2, final int i2, final String str2, final int i3) {
        af.a(context).a(new Runnable() { // from class: com.xiaomi.push.cr.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    cr.c(context, str, z, j, i, j2, i2, str2, i3);
                } catch (Exception e) {
                    com.xiaomi.channel.commonutils.logger.b.m11781a("DisconnectStatsSP onDisconnection exception: " + e.getMessage());
                }
            }
        });
    }

    public static void a(final Context context, final long j) {
        af.a(context).a(new Runnable() { // from class: com.xiaomi.push.cr.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    cr.c(context, j);
                } catch (Exception e) {
                    com.xiaomi.channel.commonutils.logger.b.m11781a("DisconnectStatsSP onReconnection exception: " + e.getMessage());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void c(Context context, String str, boolean z, long j, int i, long j2, int i2, String str2, int i3) {
        synchronized (cr.class) {
            SharedPreferences m11982a = m11982a(context);
            long j3 = m11982a.getLong("start_time_for_day", 0L);
            if (j3 == 0) {
                co.a("recordDisconnection not initialized");
                return;
            }
            if (j - m11982a.getLong("last_discnt_time", 0L) < 60000) {
                co.a("recordDisconnection anti-shake");
                return;
            }
            if (j - j3 < 86400000) {
                int i4 = m11982a.getInt("discnt_count_in_day", 0);
                if (i4 > 100) {
                    co.a("recordDisconnection count > 100 in 24H cycle,abandon.");
                    return;
                } else {
                    m11982a.edit().putInt("discnt_count_in_day", i4 + 1).apply();
                }
            } else {
                co.a("recordDisconnection with the current time exceeds 24H cycle, go on.");
            }
            int i5 = m11982a.getInt("discnt_count", 0);
            if (i5 == m11982a.getInt("cnt_count", 0)) {
                a(context, str, a(z), j, i, j2, i2, str2, i3);
                m11982a.edit().putLong("last_discnt_time", j).putInt("discnt_count", i5 + 1).apply();
            }
            co.a("recordDisconnection complete");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void c(Context context, long j) {
        synchronized (cr.class) {
            SharedPreferences m11982a = m11982a(context);
            long j2 = m11982a.getLong("start_time_for_day", 0L);
            if (j2 == 0) {
                m11982a.edit().putLong("start_time_for_day", j).putLong("last_discnt_time", 0L).putInt("discnt_count_in_day", 0).putInt("discnt_count", 0).putInt("cnt_count", 0).apply();
                return;
            }
            int i = m11982a.getInt("discnt_count", 0);
            int i2 = m11982a.getInt("cnt_count", 0);
            if (i > i2) {
                m11982a.edit().putInt("cnt_count", i2 + 1).putString("connected_time", a(m11982a.getString("connected_time", null), j)).apply();
            }
            if (j - j2 >= 86400000) {
                m11982a.edit().putLong("start_time_for_day", j).putInt("discnt_count_in_day", 0).apply();
                m11984a(context);
            } else if (i >= 10) {
                m11984a(context);
            }
        }
    }

    private static void a(Context context, String str, int i, long j, int i2, long j2, int i3, String str2, int i4) {
        co.a(String.format(Locale.US, "recordDisconnectInfo host=%s, netState=%d, currentTimeMillis=%d, reason=%d, pingInterval=%d, netType=%d, wifiDigest=%s, connectedNetType=%d", str, Integer.valueOf(i), Long.valueOf(j), Integer.valueOf(i2), Long.valueOf(j2), Integer.valueOf(i3), str2, Integer.valueOf(i4)));
        SharedPreferences m11982a = m11982a(context);
        String string = m11982a.getString("host", null);
        String string2 = m11982a.getString("network_state", null);
        String string3 = m11982a.getString("reason", null);
        String string4 = m11982a.getString("ping_interval", null);
        String string5 = m11982a.getString("network_type", null);
        String string6 = m11982a.getString("wifi_digest", null);
        String string7 = m11982a.getString("connected_network_type", null);
        String string8 = m11982a.getString("disconnect_time", null);
        String string9 = m11982a.getString("xmsf_vc", null);
        String string10 = m11982a.getString("android_vc", null);
        String a2 = a(string, str);
        String a3 = a(string2, i);
        String a4 = a(string3, i2);
        String a5 = a(string4, j2);
        String a6 = a(string5, i3);
        String a7 = a(string6, str2);
        String a8 = a(string7, i4);
        String a9 = a(string8, j);
        String a10 = a(string9, a(context));
        m11982a.edit().putString("host", a2).putString("network_state", a3).putString("reason", a4).putString("ping_interval", a5).putString("network_type", a6).putString("wifi_digest", a7).putString("connected_network_type", a8).putString("disconnect_time", a9).putString("xmsf_vc", a10).putString("android_vc", a(string10, Build.VERSION.SDK_INT)).apply();
    }

    private static String a(String str, String str2) {
        if (str2 == null || str2.length() == 0) {
            str2 = AbstractJsonLexerKt.NULL;
        }
        return (str == null || str.length() <= 0) ? str2 : str + ";" + str2;
    }

    private static String a(String str, int i) {
        return a(str, String.valueOf(i));
    }

    private static String a(String str, long j) {
        return a(str, String.valueOf(j));
    }

    /* renamed from: a, reason: collision with other method in class */
    private static void m11984a(Context context) {
        co.a(DiabetesRiskFormActivity.MODE_UPLOAD);
        new cq().a(context, m11983a(context));
        b(context);
    }

    /* renamed from: a, reason: collision with other method in class */
    private static List<cp> m11983a(Context context) {
        SharedPreferences m11982a = m11982a(context);
        String[] a2 = a(m11982a.getString("host", null));
        if (a2 == null || a2.length <= 0) {
            com.xiaomi.channel.commonutils.logger.b.m11781a("DisconnectStatsSP Cached hosts data is empty,drop.");
            return null;
        }
        String[] a3 = a(m11982a.getString("network_state", null));
        String[] a4 = a(m11982a.getString("reason", null));
        String[] a5 = a(m11982a.getString("ping_interval", null));
        String[] a6 = a(m11982a.getString("network_type", null));
        String[] a7 = a(m11982a.getString("wifi_digest", null));
        String[] a8 = a(m11982a.getString("connected_network_type", null));
        String[] a9 = a(m11982a.getString("disconnect_time", null));
        String[] a10 = a(m11982a.getString("connected_time", null));
        String[] a11 = a(m11982a.getString("xmsf_vc", null));
        String[] a12 = a(m11982a.getString("android_vc", null));
        if (a3 != null && a4 != null && a5 != null && a6 != null && a7 != null && a8 != null && a9 != null && a10 != null && a11 != null && a12 != null && a2.length == a3.length && a2.length == a4.length && a2.length == a5.length && a2.length == a6.length && a2.length == a7.length && a2.length == a8.length && a2.length == a9.length && a2.length == a10.length && a2.length == a11.length && a2.length == a12.length) {
            ArrayList arrayList = new ArrayList(a2.length);
            int i = 0;
            while (i < a2.length) {
                cp cpVar = new cp();
                cpVar.a(1);
                cpVar.a(a2[i]);
                cpVar.b(t.a(a3[i], -1));
                cpVar.c(t.a(a4[i], -1));
                String[] strArr = a12;
                String[] strArr2 = a3;
                cpVar.a(t.a(a5[i], -1L));
                cpVar.d(t.a(a6[i], -1));
                cpVar.b(a7[i]);
                cpVar.e(t.a(a8[i], -1));
                long a13 = t.a(a9[i], -1L);
                long a14 = t.a(a10[i], -1L);
                cpVar.b(a14 - a13);
                cpVar.c(a13);
                cpVar.d(a14);
                cpVar.f(t.a(a11[i], -1));
                cpVar.g(t.a(strArr[i], -1));
                arrayList.add(cpVar);
                i++;
                a2 = a2;
                a5 = a5;
                a12 = strArr;
                a3 = strArr2;
                a4 = a4;
                a6 = a6;
            }
            return arrayList;
        }
        com.xiaomi.channel.commonutils.logger.b.m11781a("DisconnectStatsSP Cached data incorrect,drop.");
        return null;
    }

    private static String[] a(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        return str.split(";");
    }

    private static void b(Context context) {
        co.a("resetAfterUpload");
        m11982a(context).edit().putString("host", null).putString("network_state", null).putString("reason", null).putString("ping_interval", null).putString("network_type", null).putString("wifi_digest", null).putString("connected_network_type", null).putString("disconnect_time", null).putString("connected_time", null).putLong("last_discnt_time", 0L).putInt("discnt_count", 0).putInt("cnt_count", 0).putString("xmsf_vc", null).putString("android_vc", null).apply();
    }

    private static int a(Context context) {
        if (f14497a <= 0) {
            f14497a = j.b(context);
        }
        return f14497a;
    }
}
