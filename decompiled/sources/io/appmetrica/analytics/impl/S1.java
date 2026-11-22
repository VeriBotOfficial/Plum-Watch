package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes6.dex */
public final class S1 implements Thread.UncaughtExceptionHandler {
    public static final AtomicBoolean e = new AtomicBoolean();

    /* renamed from: a, reason: collision with root package name */
    public final Ma f18059a;
    public final C3371lc b = C3562t4.i().l();
    public final C3664x6 c = new C3664x6();
    public final C3108an d = new C3108an();

    public S1(C3589u6 c3589u6) {
        this.f18059a = c3589u6;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        StackTraceElement[] stackTraceElementArr;
        try {
            e.set(true);
            Ma ma = this.f18059a;
            Tm apply = this.c.apply(thread);
            C3108an c3108an = this.d;
            Thread a2 = c3108an.f18188a.a();
            ArrayList a3 = c3108an.a(a2, thread);
            if (thread != a2) {
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
                a3.add(0, (Tm) c3108an.b.apply(a2, stackTraceElementArr));
            }
            ma.a(th, new S(apply, a3, this.b.b()));
        } catch (Throwable th2) {
            LoggerStorage.getMainPublicOrAnonymousLogger().error(th2, th2.getMessage(), new Object[0]);
        }
    }
}
