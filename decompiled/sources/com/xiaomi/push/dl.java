package com.xiaomi.push;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.xiaomi.push.af;

/* loaded from: classes4.dex */
public class dl {

    /* renamed from: a, reason: collision with root package name */
    private static volatile dl f14525a;

    /* renamed from: a, reason: collision with other field name */
    private Context f345a;

    /* renamed from: a, reason: collision with other field name */
    private a f346a;

    public interface a {
        void a();
    }

    public static dl a(Context context) {
        if (f14525a == null) {
            synchronized (dl.class) {
                if (f14525a == null) {
                    f14525a = new dl(context);
                }
            }
        }
        return f14525a;
    }

    private dl(Context context) {
        this.f345a = context;
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m12003a() {
        af.a(this.f345a).a(new Runnable() { // from class: com.xiaomi.push.dl.1
            @Override // java.lang.Runnable
            public void run() {
                dl.this.b();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        a aVar;
        af a2 = af.a(this.f345a);
        com.xiaomi.push.service.ah a3 = com.xiaomi.push.service.ah.a(this.f345a);
        SharedPreferences sharedPreferences = this.f345a.getSharedPreferences("mipush_extra", 0);
        long currentTimeMillis = System.currentTimeMillis();
        long j = sharedPreferences.getLong("first_try_ts", currentTimeMillis);
        if (j == currentTimeMillis) {
            sharedPreferences.edit().putLong("first_try_ts", currentTimeMillis).commit();
        }
        if (Math.abs(currentTimeMillis - j) < 172800000) {
            return;
        }
        a(a3, a2, false);
        if (a3.a(gl.StorageCollectionSwitch.a(), true)) {
            int a4 = a(a3.a(gl.StorageCollectionFrequency.a(), 86400));
            a2.a(new dn(this.f345a, a4), a4, 0);
        }
        if (j.m12358a(this.f345a) && (aVar = this.f346a) != null) {
            aVar.a();
        }
        if (a3.a(gl.ActivityTSSwitch.a(), false)) {
            a();
        }
        a(a3, a2, true);
    }

    private void a(com.xiaomi.push.service.ah ahVar, af afVar, boolean z) {
        if (ahVar.a(gl.UploadSwitch.a(), true)) {
            Cdo cdo = new Cdo(this.f345a);
            if (z) {
                afVar.a((af.a) cdo, a(ahVar.a(gl.UploadFrequency.a(), 86400)));
            } else {
                afVar.m11863a((af.a) cdo);
            }
        }
    }

    public static int a(int i) {
        return Math.max(60, i);
    }

    private boolean a() {
        Application application;
        try {
            Context context = this.f345a;
            if (context instanceof Application) {
                application = (Application) context;
            } else {
                application = (Application) context.getApplicationContext();
            }
            application.registerActivityLifecycleCallbacks(new df(this.f345a, String.valueOf(System.currentTimeMillis() / 1000)));
            return true;
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.a(e);
            return false;
        }
    }
}
