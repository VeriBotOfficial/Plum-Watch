package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.MessageNano;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: io.appmetrica.analytics.impl.cg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3151cg {

    /* renamed from: a, reason: collision with root package name */
    public final String f18216a;
    public final long b;
    public final long c;
    public final EnumC3126bg d;

    public C3151cg(byte[] bArr) {
        C3176dg a2 = C3176dg.a(bArr);
        this.f18216a = a2.f18236a;
        this.b = a2.c;
        this.c = a2.b;
        this.d = a(a2.d);
    }

    public final byte[] a() {
        C3176dg c3176dg = new C3176dg();
        c3176dg.f18236a = this.f18216a;
        c3176dg.c = this.b;
        c3176dg.b = this.c;
        int ordinal = this.d.ordinal();
        int i = 1;
        if (ordinal != 1) {
            i = 2;
            if (ordinal != 2) {
                i = 0;
            }
        }
        c3176dg.d = i;
        return MessageNano.toByteArray(c3176dg);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3151cg.class == obj.getClass()) {
            C3151cg c3151cg = (C3151cg) obj;
            if (this.b == c3151cg.b && this.c == c3151cg.c && this.f18216a.equals(c3151cg.f18216a) && this.d == c3151cg.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f18216a.hashCode() * 31;
        long j = this.b;
        int i = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.c;
        return this.d.hashCode() + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }

    public final String toString() {
        return "ReferrerInfo{installReferrer='" + this.f18216a + "', referrerClickTimestampSeconds=" + this.b + ", installBeginTimestampSeconds=" + this.c + ", source=" + this.d + AbstractJsonLexerKt.END_OBJ;
    }

    public C3151cg(String str, long j, long j2, EnumC3126bg enumC3126bg) {
        this.f18216a = str;
        this.b = j;
        this.c = j2;
        this.d = enumC3126bg;
    }

    public static EnumC3126bg a(int i) {
        if (i == 1) {
            return EnumC3126bg.c;
        }
        if (i != 2) {
            return EnumC3126bg.b;
        }
        return EnumC3126bg.d;
    }
}
