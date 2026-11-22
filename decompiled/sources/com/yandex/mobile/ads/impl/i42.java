package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.l42;
import java.util.logging.Logger;
import kotlin.jvm.internal.StringCompanionObject;

/* loaded from: classes5.dex */
public final class i42 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(h42 h42Var, k42 k42Var, String str) {
        l42 l42Var = l42.h;
        Logger a2 = l42.b.a();
        String f = k42Var.f();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        a2.fine(f + " " + z0.a(new Object[]{str}, 1, "%-22s", "format(...)") + ": " + h42Var.b());
    }

    public static final String a(long j) {
        String str;
        if (j <= -999500000) {
            str = ((j - 500000000) / 1000000000) + " s ";
        } else if (j <= -999500) {
            str = ((j - 500000) / 1000000) + " ms";
        } else if (j <= 0) {
            str = ((j - 500) / 1000) + " µs";
        } else if (j < 999500) {
            str = ((j + 500) / 1000) + " µs";
        } else if (j >= 999500000) {
            str = ((j + 500000000) / 1000000000) + " s ";
        } else {
            str = ((j + 500000) / 1000000) + " ms";
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return z0.a(new Object[]{str}, 1, "%6s", "format(...)");
    }
}
