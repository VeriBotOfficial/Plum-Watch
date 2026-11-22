package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class uy implements x {

    /* renamed from: a, reason: collision with root package name */
    private final String f17095a;
    private final String b;
    private final List<zj1> c;

    public uy(String actionType, String fallbackUrl, ArrayList preferredPackages) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        Intrinsics.checkNotNullParameter(fallbackUrl, "fallbackUrl");
        Intrinsics.checkNotNullParameter(preferredPackages, "preferredPackages");
        this.f17095a = actionType;
        this.b = fallbackUrl;
        this.c = preferredPackages;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uy)) {
            return false;
        }
        uy uyVar = (uy) obj;
        return Intrinsics.areEqual(this.f17095a, uyVar.f17095a) && Intrinsics.areEqual(this.b, uyVar.b) && Intrinsics.areEqual(this.c, uyVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + v3.a(this.b, this.f17095a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "DeeplinkAction(actionType=" + this.f17095a + ", fallbackUrl=" + this.b + ", preferredPackages=" + this.c + Separators.RPAREN;
    }

    @Override // com.yandex.mobile.ads.impl.x
    public final String a() {
        return this.f17095a;
    }

    public final String c() {
        return this.b;
    }

    public final List<zj1> d() {
        return this.c;
    }
}
