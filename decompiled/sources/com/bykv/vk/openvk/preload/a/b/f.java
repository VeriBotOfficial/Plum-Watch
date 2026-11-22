package com.bykv.vk.openvk.preload.a.b;

import java.math.BigDecimal;

/* compiled from: LazilyParsedNumber.java */
/* loaded from: classes13.dex */
public final class f extends Number {

    /* renamed from: a, reason: collision with root package name */
    private final String f9133a;

    public f(String str) {
        this.f9133a = str;
    }

    @Override // java.lang.Number
    public final int intValue() {
        try {
            try {
                return Integer.parseInt(this.f9133a);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.f9133a);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(this.f9133a).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        try {
            return Long.parseLong(this.f9133a);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f9133a).longValue();
        }
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f9133a);
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f9133a);
    }

    public final String toString() {
        return this.f9133a;
    }

    public final int hashCode() {
        return this.f9133a.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        String str = this.f9133a;
        String str2 = ((f) obj).f9133a;
        return str == str2 || str.equals(str2);
    }
}
