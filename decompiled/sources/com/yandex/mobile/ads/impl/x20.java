package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x20 {

    /* renamed from: a, reason: collision with root package name */
    private final Uri f17303a;

    public x20(Uri url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f17303a = url;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x20) && Intrinsics.areEqual(this.f17303a, ((x20) obj).f17303a);
    }

    public final int hashCode() {
        return this.f17303a.hashCode();
    }

    public final String toString() {
        return "DivKitClickExtensionData(url=" + this.f17303a + Separators.RPAREN;
    }

    public final Uri a() {
        return this.f17303a;
    }
}
