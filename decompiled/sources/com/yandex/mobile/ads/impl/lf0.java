package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* loaded from: classes5.dex */
public final class lf0 {
    public static final ByteString d;
    public static final ByteString e;
    public static final ByteString f;
    public static final ByteString g;
    public static final ByteString h;
    public static final ByteString i;

    /* renamed from: a, reason: collision with root package name */
    public final ByteString f16110a;
    public final ByteString b;
    public final int c;

    static {
        ByteString.Companion companion = ByteString.INSTANCE;
        d = companion.encodeUtf8(":");
        e = companion.encodeUtf8(":status");
        f = companion.encodeUtf8(":method");
        g = companion.encodeUtf8(":path");
        h = companion.encodeUtf8(":scheme");
        i = companion.encodeUtf8(":authority");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public lf0(java.lang.String r2, java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            okio.ByteString$Companion r0 = okio.ByteString.INSTANCE
            okio.ByteString r2 = r0.encodeUtf8(r2)
            okio.ByteString r3 = r0.encodeUtf8(r3)
            r1.<init>(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.lf0.<init>(java.lang.String, java.lang.String):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lf0)) {
            return false;
        }
        lf0 lf0Var = (lf0) obj;
        return Intrinsics.areEqual(this.f16110a, lf0Var.f16110a) && Intrinsics.areEqual(this.b, lf0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f16110a.hashCode() * 31);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public lf0(ByteString name, String value) {
        this(name, ByteString.INSTANCE.encodeUtf8(value));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
    }

    public final String toString() {
        return this.f16110a.utf8() + ": " + this.b.utf8();
    }

    public lf0(ByteString name, ByteString value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f16110a = name;
        this.b = value;
        this.c = value.size() + name.size() + 32;
    }
}
