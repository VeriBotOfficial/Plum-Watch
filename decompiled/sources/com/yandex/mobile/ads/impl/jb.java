package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class jb implements gk {

    /* renamed from: a, reason: collision with root package name */
    private final String f15894a;
    private final String b;
    private final String c;
    private final List<String> d;

    public jb(String actionType, String adtuneUrl, String optOutUrl, ArrayList trackingUrls) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        Intrinsics.checkNotNullParameter(adtuneUrl, "adtuneUrl");
        Intrinsics.checkNotNullParameter(optOutUrl, "optOutUrl");
        Intrinsics.checkNotNullParameter(trackingUrls, "trackingUrls");
        this.f15894a = actionType;
        this.b = adtuneUrl;
        this.c = optOutUrl;
        this.d = trackingUrls;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jb)) {
            return false;
        }
        jb jbVar = (jb) obj;
        return Intrinsics.areEqual(this.f15894a, jbVar.f15894a) && Intrinsics.areEqual(this.b, jbVar.b) && Intrinsics.areEqual(this.c, jbVar.c) && Intrinsics.areEqual(this.d, jbVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + v3.a(this.c, v3.a(this.b, this.f15894a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "AdtuneAction(actionType=" + this.f15894a + ", adtuneUrl=" + this.b + ", optOutUrl=" + this.c + ", trackingUrls=" + this.d + Separators.RPAREN;
    }

    @Override // com.yandex.mobile.ads.impl.x
    public final String a() {
        return this.f15894a;
    }

    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.c;
    }

    @Override // com.yandex.mobile.ads.impl.gk
    public final List<String> b() {
        return this.d;
    }
}
