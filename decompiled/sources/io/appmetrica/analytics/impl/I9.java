package io.appmetrica.analytics.impl;

/* loaded from: classes6.dex */
public final class I9 {

    /* renamed from: a, reason: collision with root package name */
    public final long f17903a;

    public I9(long j) {
        this.f17903a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof I9) && this.f17903a == ((I9) obj).f17903a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f17903a);
    }

    public final String toString() {
        return "ExternalAttributionConfig(collectingInterval=" + this.f17903a + ')';
    }
}
