package io.appmetrica.analytics.impl;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: io.appmetrica.analytics.impl.jm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3331jm {

    /* renamed from: a, reason: collision with root package name */
    public final long f18348a;

    public C3331jm(long j) {
        this.f18348a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C3331jm.class == obj.getClass() && this.f18348a == ((C3331jm) obj).f18348a;
    }

    public final int hashCode() {
        long j = this.f18348a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "StatSending{disabledReportingInterval=" + this.f18348a + AbstractJsonLexerKt.END_OBJ;
    }
}
