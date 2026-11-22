package io.appmetrica.analytics.impl;

/* loaded from: classes6.dex */
public final class Ib implements InterfaceC3134c {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3085a0 f17904a;
    public final C3108an b = new C3108an();

    public Ib(InterfaceC3085a0 interfaceC3085a0) {
        this.f17904a = interfaceC3085a0;
    }

    public static final void a(Ib ib, S s) {
        ib.f17904a.a(s);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3134c
    public final void onAppNotResponding() {
        StackTraceElement[] stackTraceElementArr;
        C3108an c3108an = this.b;
        Thread a2 = c3108an.f18188a.a();
        try {
            stackTraceElementArr = c3108an.f18188a.b();
            if (stackTraceElementArr == null) {
                try {
                    stackTraceElementArr = a2.getStackTrace();
                } catch (SecurityException unused) {
                }
            }
        } catch (SecurityException unused2) {
            stackTraceElementArr = null;
        }
        final S s = new S((Tm) c3108an.b.apply(a2, stackTraceElementArr), c3108an.a(a2, null), c3108an.c.b());
        ((G9) C3562t4.i().c.a()).b.post(new Runnable() { // from class: io.appmetrica.analytics.impl.Ib$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Ib.a(Ib.this, s);
            }
        });
    }
}
