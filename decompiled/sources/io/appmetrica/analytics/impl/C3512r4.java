package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.r4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3512r4 {

    /* renamed from: a, reason: collision with root package name */
    public final String f18474a;
    public final Integer b;
    public final String c;

    public C3512r4(String str, Integer num, String str2) {
        this.f18474a = str;
        this.b = num;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3512r4.class == obj.getClass()) {
            C3512r4 c3512r4 = (C3512r4) obj;
            if (!this.f18474a.equals(c3512r4.f18474a)) {
                return false;
            }
            Integer num = this.b;
            if (num == null ? c3512r4.b != null : !num.equals(c3512r4.b)) {
                return false;
            }
            String str = this.c;
            String str2 = c3512r4.c;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f18474a.hashCode() * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str = this.c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }
}
