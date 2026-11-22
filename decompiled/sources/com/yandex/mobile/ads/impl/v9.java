package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v9 {
    private static final ExecutorService c;

    /* renamed from: a, reason: collision with root package name */
    private o3 f17140a;
    private final Context b;

    static {
        String str;
        String str2 = f41.c;
        str = f41.b;
        c = Executors.newCachedThreadPool(new f41(str));
    }

    public v9(Context context, o3 adConfiguration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        this.f17140a = adConfiguration;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.b = applicationContext;
    }

    public final void a(String str, o8 adResponse, u1 handler) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(handler, "handler");
        a(str, handler, new ep(this.b, adResponse, this.f17140a, null));
    }

    public final void a(String str, f42 handler, tp1 reporter) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Context context = this.b;
        ek1 ek1Var = new ek1(context, reporter, handler, new s82(context));
        if (str == null || str.length() <= 0) {
            return;
        }
        c.execute(new a(str, ek1Var));
    }

    public final void a(String str, z62 trackingUrlType) {
        Intrinsics.checkNotNullParameter(trackingUrlType, "trackingUrlType");
        lh1 lh1Var = new lh1(this.b, this.f17140a, trackingUrlType);
        if (str == null || str.length() <= 0) {
            return;
        }
        c.execute(new a(str, lh1Var));
    }

    private static final class a implements Runnable {
        private final String b;
        private final u82 c;

        public a(String url, u82 tracker) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(tracker, "tracker");
            this.b = url;
            this.c = tracker;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.b.length() > 0) {
                this.c.a(this.b);
            }
        }
    }
}
