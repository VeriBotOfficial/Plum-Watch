package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class qe1 {
    public static final a g = new a(0);
    private static final long h = TimeUnit.SECONDS.toMillis(1);
    private static volatile qe1 i;

    /* renamed from: a, reason: collision with root package name */
    private final Object f16661a;
    private final Handler b;
    private final pe1 c;
    private final ne1 d;
    private boolean e;
    private boolean f;

    public static final void a(qe1 qe1Var) {
        synchronized (qe1Var.f16661a) {
            qe1Var.f = true;
            Unit unit = Unit.INSTANCE;
        }
        qe1Var.d();
        qe1Var.d.b();
    }

    private qe1(Context context) {
        this.f16661a = new Object();
        this.b = new Handler(Looper.getMainLooper());
        this.c = new pe1(context);
        this.d = new ne1();
    }

    public final void a(cb2 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.f16661a) {
            this.d.b(listener);
            if (!this.d.a()) {
                this.c.a();
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public /* synthetic */ qe1(Context context, int i2) {
        this(context);
    }

    /* synthetic */ class b implements cb2, FunctionAdapter {
        b() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof cb2) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(0, qe1.this, qe1.class, "onOmSdkJsControllerLoaded", "onOmSdkJsControllerLoaded()V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // com.yandex.mobile.ads.impl.cb2
        public final void a() {
            qe1.a(qe1.this);
        }
    }

    private final void b() {
        boolean z;
        synchronized (this.f16661a) {
            if (this.e) {
                z = false;
            } else {
                z = true;
                this.e = true;
            }
            Unit unit = Unit.INSTANCE;
        }
        if (z) {
            c();
            this.c.a(new b());
        }
    }

    private final void c() {
        this.b.postDelayed(new Runnable() { // from class: com.yandex.mobile.ads.impl.qe1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                qe1.c(qe1.this);
            }
        }, h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(qe1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.c.a();
        synchronized (this$0.f16661a) {
            this$0.f = true;
            Unit unit = Unit.INSTANCE;
        }
        this$0.d();
        this$0.d.b();
    }

    private final void d() {
        synchronized (this.f16661a) {
            this.b.removeCallbacksAndMessages(null);
            this.e = false;
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void b(cb2 listener) {
        boolean z;
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.f16661a) {
            z = this.f;
            if (!z) {
                this.d.a(listener);
            }
            Unit unit = Unit.INSTANCE;
        }
        if (!z) {
            b();
        } else {
            listener.a();
        }
    }

    public static final class a {
        public final qe1 a(Context context) {
            qe1 qe1Var;
            Intrinsics.checkNotNullParameter(context, "context");
            qe1 qe1Var2 = qe1.i;
            if (qe1Var2 != null) {
                return qe1Var2;
            }
            synchronized (this) {
                qe1Var = qe1.i;
                if (qe1Var == null) {
                    qe1Var = new qe1(context, 0);
                    qe1.i = qe1Var;
                }
            }
            return qe1Var;
        }

        private a() {
        }

        public /* synthetic */ a(int i) {
            this();
        }
    }
}
