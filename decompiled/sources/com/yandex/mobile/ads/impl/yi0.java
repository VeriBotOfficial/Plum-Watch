package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class yi0 {

    /* renamed from: a, reason: collision with root package name */
    private final o50 f17424a;
    private final n4 b;

    public yi0(o50 environmentConfiguration, n4 adHostConfigurator) {
        Intrinsics.checkNotNullParameter(environmentConfiguration, "environmentConfiguration");
        Intrinsics.checkNotNullParameter(adHostConfigurator, "adHostConfigurator");
        this.f17424a = environmentConfiguration;
        this.b = adHostConfigurator;
    }

    public final void a(Context context, xi0 identifiers) {
        String a2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(identifiers, "identifiers");
        df identifiers2 = identifiers.a();
        String c = identifiers.c();
        cj0 identifiersType = identifiers.b();
        n4 n4Var = this.b;
        n4Var.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(identifiers2, "identifiers");
        Intrinsics.checkNotNullParameter(identifiersType, "identifiersType");
        int ordinal = identifiersType.ordinal();
        if (ordinal == 0) {
            a2 = n4Var.a(context);
        } else {
            if (ordinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            a2 = identifiers2.a();
            if (a2 == null) {
                a2 = n4Var.a(context);
            }
        }
        this.f17424a.a(a2);
        this.f17424a.b(identifiers2.b());
        this.f17424a.d(identifiers2.c());
        this.f17424a.c(c);
    }
}
