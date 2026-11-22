package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n20 implements gk {

    /* renamed from: a, reason: collision with root package name */
    private final String f16299a;
    private final b30 b;
    private final List<String> c;

    public n20(String actionType, b30 design, ArrayList trackingUrls) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        Intrinsics.checkNotNullParameter(design, "design");
        Intrinsics.checkNotNullParameter(trackingUrls, "trackingUrls");
        this.f16299a = actionType;
        this.b = design;
        this.c = trackingUrls;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n20)) {
            return false;
        }
        n20 n20Var = (n20) obj;
        return Intrinsics.areEqual(this.f16299a, n20Var.f16299a) && Intrinsics.areEqual(this.b, n20Var.b) && Intrinsics.areEqual(this.c, n20Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f16299a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DivKitAdtuneAction(actionType=" + this.f16299a + ", design=" + this.b + ", trackingUrls=" + this.c + Separators.RPAREN;
    }

    @Override // com.yandex.mobile.ads.impl.x
    public final String a() {
        return this.f16299a;
    }

    public final b30 c() {
        return this.b;
    }

    @Override // com.yandex.mobile.ads.impl.gk
    public final List<String> b() {
        return this.c;
    }
}
