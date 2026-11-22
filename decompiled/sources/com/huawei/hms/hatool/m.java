package com.huawei.hms.hatool;

import android.content.Context;

/* loaded from: classes14.dex */
public final class m {
    private static m b;
    private static final Object c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private Context f10415a;

    private m() {
    }

    public static m a() {
        if (b == null) {
            b();
        }
        return b;
    }

    private static synchronized void b() {
        synchronized (m.class) {
            if (b == null) {
                b = new m();
            }
        }
    }

    public void a(Context context) {
        synchronized (c) {
            if (this.f10415a != null) {
                v.f("hmsSdk", "DataManager already initialized.");
                return;
            }
            this.f10415a = context;
            s.c().b().a(this.f10415a);
            s.c().b().j(context.getPackageName());
            j.a().a(context);
        }
    }

    public void a(String str) {
        v.c("hmsSdk", "HiAnalyticsDataManager.setAppid(String appid) is execute.");
        Context context = this.f10415a;
        if (context == null) {
            v.e("hmsSdk", "sdk is not init");
        } else {
            s.c().b().i(e1.a(com.heytap.mcssdk.constant.b.u, str, "[a-zA-Z0-9_][a-zA-Z0-9. _-]{0,255}", context.getPackageName()));
        }
    }
}
