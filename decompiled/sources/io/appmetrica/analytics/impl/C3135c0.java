package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.c0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3135c0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f18206a;
    public final long b;

    public C3135c0(String str, long j) {
        this.f18206a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3135c0.class == obj.getClass()) {
            C3135c0 c3135c0 = (C3135c0) obj;
            if (this.b != c3135c0.b) {
                return false;
            }
            String str = this.f18206a;
            String str2 = c3135c0.f18206a;
            if (str == null ? str2 == null : str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f18206a;
        int hashCode = str != null ? str.hashCode() : 0;
        long j = this.b;
        return (hashCode * 31) + ((int) (j ^ (j >>> 32)));
    }
}
