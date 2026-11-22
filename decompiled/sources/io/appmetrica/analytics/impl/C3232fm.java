package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.fm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3232fm {

    /* renamed from: a, reason: collision with root package name */
    public final int f18279a;

    public C3232fm(int i) {
        this.f18279a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3232fm) && this.f18279a == ((C3232fm) obj).f18279a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f18279a);
    }

    public final String toString() {
        return "StartupUpdateConfig(intervalSeconds=" + this.f18279a + ')';
    }
}
