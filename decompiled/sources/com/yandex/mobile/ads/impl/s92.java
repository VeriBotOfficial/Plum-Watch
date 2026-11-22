package com.yandex.mobile.ads.impl;

import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s92 {
    public static final void a(r92 r92Var, op1 report) {
        String str;
        Set<Long> emptySet;
        Intrinsics.checkNotNullParameter(r92Var, "<this>");
        Intrinsics.checkNotNullParameter(report, "report");
        try {
            f a2 = report.a();
            if (a2 == null || (str = a2.a()) == null) {
                str = "";
            }
            f a3 = report.a();
            if (a3 == null || (emptySet = a3.b()) == null) {
                emptySet = SetsKt.emptySet();
            }
            r92Var.setExperiments(str);
            r92Var.setTriggeredTestIds(emptySet);
            String str2 = "reportAbExperiments, experiments = " + str + ", triggeredTestIds = " + emptySet;
            sp0.a(new Object[0]);
        } catch (Throwable th) {
            String str3 = "Couldn't parse varioqub data: " + th;
            sp0.b(new Object[0]);
        }
    }
}
