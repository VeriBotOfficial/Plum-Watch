package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class he1 {

    /* renamed from: a, reason: collision with root package name */
    private final int f15683a;
    private final int b;
    private final SSLSocketFactory c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof he1)) {
            return false;
        }
        he1 he1Var = (he1) obj;
        return this.f15683a == he1Var.f15683a && this.b == he1Var.b && Intrinsics.areEqual(this.c, he1Var.c);
    }

    public final int hashCode() {
        int a2 = dy1.a(this.b, Integer.hashCode(this.f15683a) * 31, 31);
        SSLSocketFactory sSLSocketFactory = this.c;
        return a2 + (sSLSocketFactory == null ? 0 : sSLSocketFactory.hashCode());
    }

    public final String toString() {
        return "OkHttpConfiguration(connectionTimeoutMs=" + this.f15683a + ", readTimeoutMs=" + this.b + ", sslSocketFactory=" + this.c + Separators.RPAREN;
    }

    public he1(int i, int i2, SSLSocketFactory sSLSocketFactory) {
        this.f15683a = i;
        this.b = i2;
        this.c = sSLSocketFactory;
    }
}
