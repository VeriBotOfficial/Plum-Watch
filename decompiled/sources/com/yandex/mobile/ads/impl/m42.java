package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.l42;
import java.util.logging.Level;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m42 implements Runnable {
    final /* synthetic */ l42 b;

    m42(l42 l42Var) {
        this.b = l42Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h42 b;
        long j;
        while (true) {
            l42 l42Var = this.b;
            synchronized (l42Var) {
                b = l42Var.b();
            }
            if (b == null) {
                return;
            }
            k42 d = b.d();
            Intrinsics.checkNotNull(d);
            l42 l42Var2 = this.b;
            l42 l42Var3 = l42.h;
            boolean isLoggable = l42.b.a().isLoggable(Level.FINE);
            if (isLoggable) {
                j = d.h().d().a();
                i42.b(b, d, "starting");
            } else {
                j = -1;
            }
            try {
                try {
                    l42Var2.b(b);
                    Unit unit = Unit.INSTANCE;
                    if (isLoggable) {
                        i42.b(b, d, "finished run in " + i42.a(d.h().d().a() - j));
                    }
                } finally {
                }
            } catch (Throwable th) {
                if (isLoggable) {
                    i42.b(b, d, "failed a run in " + i42.a(d.h().d().a() - j));
                }
                throw th;
            }
        }
    }
}
