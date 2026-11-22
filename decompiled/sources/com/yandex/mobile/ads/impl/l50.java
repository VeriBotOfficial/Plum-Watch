package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l50 {
    private static final l50 c = new l50(1, "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCznqFqHos01bT613or9cQ8OWXEB0nvx8UZ//V75T+fb1IDn1/lPBwGY/OK5RfQYuqeIKoKasqfwtRo3sr8dJ+SDm29Brh3lV9r+apohla+GIAyYd5wcJugMfVH5z9SBxh19ukg+GiIvvDpmgi0M8gNVo6Nk21tkEgFxc9FfdT/HwIDAQAB");

    /* renamed from: a, reason: collision with root package name */
    private final String f16077a;
    private final int b;

    public final String b() {
        return this.f16077a;
    }

    public final int c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l50)) {
            return false;
        }
        l50 l50Var = (l50) obj;
        return Intrinsics.areEqual(this.f16077a, l50Var.f16077a) && this.b == l50Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f16077a.hashCode() * 31);
    }

    public final String toString() {
        return "EncryptionParameters(publicKey=" + this.f16077a + ", version=" + this.b + Separators.RPAREN;
    }

    public l50(int i, String publicKey) {
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        this.f16077a = publicKey;
        this.b = i;
    }

    public final String d() {
        return this.f16077a;
    }

    public final int e() {
        return this.b;
    }
}
