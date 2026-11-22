package com.xiaomi.push.service;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public final class ay implements aa {

    /* renamed from: a, reason: collision with root package name */
    private static volatile ay f14770a;

    /* renamed from: a, reason: collision with other field name */
    private long f1037a;

    /* renamed from: a, reason: collision with other field name */
    Context f1038a;

    /* renamed from: a, reason: collision with other field name */
    private SharedPreferences f1039a;

    /* renamed from: a, reason: collision with other field name */
    private volatile boolean f1041a = false;

    /* renamed from: a, reason: collision with other field name */
    private ConcurrentHashMap<String, a> f1040a = new ConcurrentHashMap<>();

    public static ay a(Context context) {
        if (f14770a == null) {
            synchronized (ay.class) {
                if (f14770a == null) {
                    f14770a = new ay(context);
                }
            }
        }
        return f14770a;
    }

    private ay(Context context) {
        this.f1038a = context.getApplicationContext();
        this.f1039a = context.getSharedPreferences("sync", 0);
    }

    @Override // com.xiaomi.push.service.aa
    /* renamed from: a, reason: collision with other method in class */
    public void mo12446a() {
        if (this.f1041a) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f1037a < 3600000) {
            return;
        }
        this.f1037a = currentTimeMillis;
        this.f1041a = true;
        com.xiaomi.push.af.a(this.f1038a).a(new Runnable() { // from class: com.xiaomi.push.service.ay.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Iterator it = ay.this.f1040a.values().iterator();
                    while (it.hasNext()) {
                        ((a) it.next()).run();
                    }
                } catch (Exception e) {
                    com.xiaomi.channel.commonutils.logger.b.m11781a("Sync job exception :" + e.getMessage());
                }
                ay.this.f1041a = false;
            }
        }, (int) (Math.random() * 10.0d));
    }

    public static abstract class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        long f14772a;

        /* renamed from: a, reason: collision with other field name */
        String f1042a;

        abstract void a(ay ayVar);

        a(String str, long j) {
            this.f1042a = str;
            this.f14772a = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ay.f14770a != null) {
                Context context = ay.f14770a.f1038a;
                if (com.xiaomi.push.av.c(context)) {
                    if (System.currentTimeMillis() - ay.f14770a.f1039a.getLong(":ts-" + this.f1042a, 0L) > this.f14772a || com.xiaomi.push.ac.a(context)) {
                        com.xiaomi.push.p.a(ay.f14770a.f1039a.edit().putLong(":ts-" + this.f1042a, System.currentTimeMillis()));
                        a(ay.f14770a);
                    }
                }
            }
        }
    }

    public String a(String str, String str2) {
        return this.f1039a.getString(str + ":" + str2, "");
    }

    public void a(String str, String str2, String str3) {
        com.xiaomi.push.p.a(f14770a.f1039a.edit().putString(str + ":" + str2, str3));
    }

    public void a(a aVar) {
        if (this.f1040a.putIfAbsent(aVar.f1042a, aVar) == null) {
            com.xiaomi.push.af.a(this.f1038a).a(aVar, ((int) (Math.random() * 30.0d)) + 10);
        }
    }
}
