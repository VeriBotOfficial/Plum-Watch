package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Context;
import io.appmetrica.analytics.IReporter;

/* loaded from: classes6.dex */
public final class P5 {

    /* renamed from: a, reason: collision with root package name */
    public final C3458p f18008a;
    public final IReporter b;
    public Context c;
    public final InterfaceC3408n d;

    public P5(C3458p c3458p) {
        this(c3458p, 0);
    }

    public static final void a(P5 p5, Activity activity, EnumC3383m enumC3383m) {
        int ordinal = enumC3383m.ordinal();
        if (ordinal == 1) {
            p5.b.resumeSession();
        } else {
            if (ordinal != 2) {
                return;
            }
            p5.b.pauseSession();
        }
    }

    public P5(C3458p c3458p, IReporter iReporter) {
        this.f18008a = c3458p;
        this.b = iReporter;
        this.d = new InterfaceC3408n() { // from class: io.appmetrica.analytics.impl.P5$$ExternalSyntheticLambda0
            @Override // io.appmetrica.analytics.impl.InterfaceC3408n
            public final void a(Activity activity, EnumC3383m enumC3383m) {
                P5.a(P5.this, activity, enumC3383m);
            }
        };
    }

    public final synchronized void a(Context context) {
        if (this.c == null) {
            Context applicationContext = context.getApplicationContext();
            this.f18008a.a(applicationContext);
            this.f18008a.a(this.d, EnumC3383m.RESUMED, EnumC3383m.PAUSED);
            this.c = applicationContext;
        }
    }

    public /* synthetic */ P5(C3458p c3458p, int i) {
        this(c3458p, AbstractC3485q1.a());
    }
}
