package io.appmetrica.analytics.impl;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: io.appmetrica.analytics.impl.x3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3661x3 {

    /* renamed from: a, reason: collision with root package name */
    public final long f18574a;

    public C3661x3(long j) {
        this.f18574a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C3661x3.class == obj.getClass() && this.f18574a == ((C3661x3) obj).f18574a;
    }

    public final int hashCode() {
        long j = this.f18574a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "CacheControl{lastKnownLocationTtl=" + this.f18574a + AbstractJsonLexerKt.END_OBJ;
    }
}
