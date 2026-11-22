package com.yandex.mobile.ads.impl;

import android.os.Handler;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class ze implements hi {
    private static final long f = TimeUnit.SECONDS.toMillis(30);
    private static final Object g = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final ye f17510a;
    private final bf b;
    private final Handler c;
    private final WeakHashMap<ii, Object> d;
    private boolean e;

    static final class b extends Lambda implements Function0<Unit> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ze.this.b.getClass();
            bf.a();
            ze.this.a();
            return Unit.INSTANCE;
        }
    }

    public ze(ye appMetricaAutograbLoader, bf appMetricaErrorProvider, Handler stopStartupParamsRequestHandler) {
        Intrinsics.checkNotNullParameter(appMetricaAutograbLoader, "appMetricaAutograbLoader");
        Intrinsics.checkNotNullParameter(appMetricaErrorProvider, "appMetricaErrorProvider");
        Intrinsics.checkNotNullParameter(stopStartupParamsRequestHandler, "stopStartupParamsRequestHandler");
        this.f17510a = appMetricaAutograbLoader;
        this.b = appMetricaErrorProvider;
        this.c = stopStartupParamsRequestHandler;
        this.d = new WeakHashMap<>();
    }

    private final void c() {
        synchronized (g) {
            this.c.removeCallbacksAndMessages(null);
            this.e = false;
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.yandex.mobile.ads.impl.hi
    public final void b(ii autograbRequestListener) {
        Intrinsics.checkNotNullParameter(autograbRequestListener, "autograbRequestListener");
        synchronized (g) {
            this.d.remove(autograbRequestListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a() {
        HashSet hashSet;
        sp0.a(new Object[0]);
        synchronized (g) {
            hashSet = new HashSet(this.d.keySet());
            this.d.clear();
            c();
            Unit unit = Unit.INSTANCE;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((ii) it.next()).a(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Function0 tmp0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke();
    }

    private final void d() {
        boolean z;
        synchronized (g) {
            if (this.e) {
                z = false;
            } else {
                z = true;
                this.e = true;
            }
            Unit unit = Unit.INSTANCE;
        }
        if (z) {
            b();
            this.f17510a.a(new a());
        }
    }

    private final void b() {
        final b bVar = new b();
        this.c.postDelayed(new Runnable() { // from class: com.yandex.mobile.ads.impl.ze$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ze.a(Function0.this);
            }
        }, f);
    }

    private final class a implements xe {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.xe
        public final void a(String str) {
            ze.this.a();
        }
    }

    @Override // com.yandex.mobile.ads.impl.hi
    public final void a(ii autograbRequestListener) {
        Intrinsics.checkNotNullParameter(autograbRequestListener, "autograbRequestListener");
        synchronized (g) {
            this.d.put(autograbRequestListener, null);
        }
        try {
            d();
        } catch (Throwable unused) {
            sp0.c(new Object[0]);
            this.b.getClass();
            bf.b();
            a();
        }
    }
}
