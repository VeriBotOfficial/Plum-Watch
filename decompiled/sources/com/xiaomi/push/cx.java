package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.wakeup.feature.health.bloodGlucose.diabetes.DiabetesRiskFormActivity;
import com.yandex.div.core.timer.TimerController;

/* loaded from: classes4.dex */
public class cx {

    /* renamed from: a, reason: collision with root package name */
    private static int f14505a = 0;

    /* renamed from: a, reason: collision with other field name */
    private static boolean f307a = true;

    private static int a(boolean z) {
        return z ? 1 : 0;
    }

    /* renamed from: a, reason: collision with other method in class */
    private static SharedPreferences m11991a(Context context) {
        return context.getSharedPreferences("sp_power_stats", 0);
    }

    public static void a(final Context context, final long j, final boolean z) {
        af.a(context).a(new Runnable() { // from class: com.xiaomi.push.cx.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    cx.i(context, j, z);
                } catch (Exception e) {
                    com.xiaomi.channel.commonutils.logger.b.m11781a("PowerStatsSP onSendMsg exception: " + e.getMessage());
                }
            }
        });
    }

    public static void b(final Context context, final long j, final boolean z) {
        af.a(context).a(new Runnable() { // from class: com.xiaomi.push.cx.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    cx.j(context, j, z);
                } catch (Exception e) {
                    com.xiaomi.channel.commonutils.logger.b.m11781a("PowerStatsSP onReceiveMsg exception: " + e.getMessage());
                }
            }
        });
    }

    public static void c(final Context context, final long j, final boolean z) {
        af.a(context).a(new Runnable() { // from class: com.xiaomi.push.cx.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    cx.k(context, j, z);
                } catch (Exception e) {
                    com.xiaomi.channel.commonutils.logger.b.m11781a("PowerStatsSP onPing exception: " + e.getMessage());
                }
            }
        });
    }

    public static void d(final Context context, final long j, final boolean z) {
        af.a(context).a(new Runnable() { // from class: com.xiaomi.push.cx.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    cx.l(context, j, z);
                } catch (Exception e) {
                    com.xiaomi.channel.commonutils.logger.b.m11781a("PowerStatsSP onPong exception: " + e.getMessage());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void i(Context context, long j, boolean z) {
        int i;
        synchronized (cx.class) {
            cu.a("recordSendMsg start");
            int a2 = a(z);
            SharedPreferences m11991a = m11991a(context);
            long j2 = m11991a.getLong("start_time", 0L);
            if (j2 <= 0) {
                a(context, m11991a, j, a2);
            }
            if (a2 == 1) {
                i = m11991a.getInt("on_up_count", 0) + 1;
                m11991a.edit().putInt("on_up_count", i).apply();
            } else {
                i = m11991a.getInt("off_up_count", 0) + 1;
                m11991a.edit().putInt("off_up_count", i).apply();
            }
            a(context, j2, j, i, a2);
            cu.a("recordSendMsg complete");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void j(Context context, long j, boolean z) {
        int i;
        synchronized (cx.class) {
            cu.a("recordReceiveMsg start");
            int a2 = a(z);
            SharedPreferences m11991a = m11991a(context);
            long j2 = m11991a.getLong("start_time", 0L);
            if (j2 <= 0) {
                a(context, m11991a, j, a2);
            }
            if (a2 == 1) {
                i = m11991a.getInt("on_down_count", 0) + 1;
                m11991a.edit().putInt("on_down_count", i).apply();
            } else {
                i = m11991a.getInt("off_down_count", 0) + 1;
                m11991a.edit().putInt("off_down_count", i).apply();
            }
            a(context, j2, j, i, a2);
            cu.a("recordReceiveMsg complete");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void k(Context context, long j, boolean z) {
        int i;
        synchronized (cx.class) {
            cu.a("recordPing start");
            int a2 = a(z);
            SharedPreferences m11991a = m11991a(context);
            long j2 = m11991a.getLong("start_time", 0L);
            if (j2 <= 0) {
                a(context, m11991a, j, a2);
            }
            if (a2 == 1) {
                i = m11991a.getInt("on_ping_count", 0) + 1;
                m11991a.edit().putInt("on_ping_count", i).apply();
            } else {
                i = m11991a.getInt("off_ping_count", 0) + 1;
                m11991a.edit().putInt("off_ping_count", i).apply();
            }
            a(context, j2, j, i, a2);
            cu.a("recordPing complete");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void l(Context context, long j, boolean z) {
        int i;
        synchronized (cx.class) {
            cu.a("recordPong start");
            int a2 = a(z);
            SharedPreferences m11991a = m11991a(context);
            long j2 = m11991a.getLong("start_time", 0L);
            if (j2 <= 0) {
                a(context, m11991a, j, a2);
            }
            if (a2 == 1) {
                i = m11991a.getInt("on_pong_count", 0) + 1;
                m11991a.edit().putInt("on_pong_count", i).apply();
            } else {
                i = m11991a.getInt("off_pong_count", 0) + 1;
                m11991a.edit().putInt("off_pong_count", i).apply();
            }
            a(context, j2, j, i, a2);
            cu.a("recordPong complete");
        }
    }

    private static void a(Context context, SharedPreferences sharedPreferences, long j, int i) {
        cu.a("recordInit");
        sharedPreferences.edit().putLong("start_time", j).putInt("current_screen_state", i).putLong("current_screen_state_start_time", j).putInt("xmsf_vc", a(context)).putInt("android_vc", Build.VERSION.SDK_INT).apply();
    }

    private static void a(Context context, long j, long j2, int i, int i2) {
        if (j > 0) {
            if (m11993a(context) || i >= 1073741823 || j2 - j >= 86400000) {
                m11991a(context).edit().putLong("end_time", j2).apply();
                a(context, j2, i2);
            }
        }
    }

    private static void a(Context context, long j, int i) {
        cu.a(DiabetesRiskFormActivity.MODE_UPLOAD);
        new cw().a(context, m11992a(context));
        b(context, j, i);
    }

    /* renamed from: a, reason: collision with other method in class */
    private static cv m11992a(Context context) {
        SharedPreferences m11991a = m11991a(context);
        cv cvVar = new cv();
        cvVar.a(m11991a.getInt("off_up_count", 0));
        cvVar.b(m11991a.getInt("off_down_count", 0));
        cvVar.c(m11991a.getInt("off_ping_count", 0));
        cvVar.d(m11991a.getInt("off_pong_count", 0));
        cvVar.a(m11991a.getLong("off_duration", 0L));
        cvVar.e(m11991a.getInt("on_up_count", 0));
        cvVar.f(m11991a.getInt("on_down_count", 0));
        cvVar.g(m11991a.getInt("on_ping_count", 0));
        cvVar.h(m11991a.getInt("on_pong_count", 0));
        cvVar.b(m11991a.getLong("on_duration", 0L));
        cvVar.c(m11991a.getLong("start_time", 0L));
        cvVar.d(m11991a.getLong("end_time", 0L));
        cvVar.i(m11991a.getInt("xmsf_vc", 0));
        cvVar.j(m11991a.getInt("android_vc", 0));
        return cvVar;
    }

    private static void b(Context context, long j, int i) {
        cu.a(TimerController.RESET_COMMAND);
        m11991a(context).edit().clear().putLong("start_time", j).putInt("current_screen_state", i).putLong("current_screen_state_start_time", j).putInt("xmsf_vc", a(context)).putInt("android_vc", Build.VERSION.SDK_INT).apply();
    }

    /* renamed from: a, reason: collision with other method in class */
    private static boolean m11993a(Context context) {
        boolean z = false;
        if (f307a) {
            f307a = false;
            SharedPreferences m11991a = m11991a(context);
            int i = m11991a.getInt("xmsf_vc", 0);
            int i2 = m11991a.getInt("android_vc", 0);
            if (i != 0 && i2 != 0 && (i != a(context) || i2 != Build.VERSION.SDK_INT)) {
                z = true;
            }
        }
        cu.a("isVcChanged = " + z);
        return z;
    }

    private static int a(Context context) {
        if (f14505a <= 0) {
            f14505a = j.b(context);
        }
        return f14505a;
    }
}
