package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w9 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f17230a;
    private final String b;
    private final String c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w9)) {
            return false;
        }
        w9 w9Var = (w9) obj;
        return this.f17230a == w9Var.f17230a && Intrinsics.areEqual(this.b, w9Var.b) && Intrinsics.areEqual(this.c, w9Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + v3.a(this.b, Boolean.hashCode(this.f17230a) * 31, 31);
    }

    public final String toString() {
        return "AdTuneInfo(shouldShow=" + this.f17230a + ", token=" + this.b + ", advertiserInfo=" + this.c + Separators.RPAREN;
    }

    public w9(String token, String advertiserInfo, boolean z) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(advertiserInfo, "advertiserInfo");
        this.f17230a = z;
        this.b = token;
        this.c = advertiserInfo;
    }

    public final boolean b() {
        return this.f17230a;
    }

    public final String c() {
        return this.b;
    }

    public final String a() {
        return this.c;
    }
}
