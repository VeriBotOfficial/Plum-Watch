package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class af {

    /* renamed from: a, reason: collision with root package name */
    private static volatile af f14417a;

    /* renamed from: a, reason: collision with other field name */
    private SharedPreferences f169a;

    /* renamed from: a, reason: collision with other field name */
    private ScheduledThreadPoolExecutor f172a = new ScheduledThreadPoolExecutor(1);

    /* renamed from: a, reason: collision with other field name */
    private Map<String, ScheduledFuture> f171a = new HashMap();

    /* renamed from: a, reason: collision with other field name */
    private Object f170a = new Object();

    public static abstract class a implements Runnable {
        /* renamed from: a */
        public abstract String mo11916a();
    }

    private static class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        a f14420a;

        void a() {
        }

        void b() {
        }

        public b(a aVar) {
            this.f14420a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            a();
            this.f14420a.run();
            b();
        }
    }

    public static af a(Context context) {
        if (f14417a == null) {
            synchronized (af.class) {
                if (f14417a == null) {
                    f14417a = new af(context);
                }
            }
        }
        return f14417a;
    }

    private af(Context context) {
        this.f169a = context.getSharedPreferences("mipush_extra", 0);
    }

    public boolean a(a aVar, int i) {
        return a(aVar, i, 0);
    }

    public boolean a(a aVar, int i, int i2) {
        return a(aVar, i, i2, false);
    }

    public boolean a(a aVar, int i, int i2, final boolean z) {
        if (aVar == null || a(aVar) != null) {
            return false;
        }
        final String a2 = a(aVar.mo11916a());
        b bVar = new b(aVar) { // from class: com.xiaomi.push.af.1
            @Override // com.xiaomi.push.af.b
            void a() {
                super.a();
            }

            @Override // com.xiaomi.push.af.b
            void b() {
                if (z) {
                    return;
                }
                af.this.f169a.edit().putLong(a2, System.currentTimeMillis()).commit();
            }
        };
        if (!z) {
            long abs = Math.abs(System.currentTimeMillis() - this.f169a.getLong(a2, 0L)) / 1000;
            if (abs < i - i2) {
                i2 = (int) (i - abs);
            }
        }
        try {
            ScheduledFuture<?> scheduleAtFixedRate = this.f172a.scheduleAtFixedRate(bVar, i2, i, TimeUnit.SECONDS);
            synchronized (this.f170a) {
                this.f171a.put(aVar.mo11916a(), scheduleAtFixedRate);
            }
            return true;
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.a(e);
            return true;
        }
    }

    public void a(Runnable runnable) {
        a(runnable, 0);
    }

    public void a(Runnable runnable, int i) {
        this.f172a.schedule(runnable, i, TimeUnit.SECONDS);
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m11863a(a aVar) {
        return b(aVar, 0);
    }

    public boolean b(a aVar, int i) {
        if (aVar == null || a(aVar) != null) {
            return false;
        }
        ScheduledFuture<?> schedule = this.f172a.schedule(new b(aVar) { // from class: com.xiaomi.push.af.2
            @Override // com.xiaomi.push.af.b
            void b() {
                synchronized (af.this.f170a) {
                    af.this.f171a.remove(this.f14420a.mo11916a());
                }
            }
        }, i, TimeUnit.SECONDS);
        synchronized (this.f170a) {
            this.f171a.put(aVar.mo11916a(), schedule);
        }
        return true;
    }

    private ScheduledFuture a(a aVar) {
        ScheduledFuture scheduledFuture;
        synchronized (this.f170a) {
            scheduledFuture = this.f171a.get(aVar.mo11916a());
        }
        return scheduledFuture;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m11864a(String str) {
        synchronized (this.f170a) {
            ScheduledFuture scheduledFuture = this.f171a.get(str);
            if (scheduledFuture == null) {
                return false;
            }
            this.f171a.remove(str);
            return scheduledFuture.cancel(false);
        }
    }

    private static String a(String str) {
        return "last_job_time" + str;
    }
}
