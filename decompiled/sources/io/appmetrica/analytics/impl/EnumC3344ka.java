package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ka, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC3344ka {
    UNKNOWN(0),
    FIRST_OCCURRENCE(1),
    NON_FIRST_OCCURENCE(2);


    /* renamed from: a, reason: collision with root package name */
    public final int f18361a;

    EnumC3344ka(int i) {
        this.f18361a = i;
    }

    public static EnumC3344ka a(Integer num) {
        if (num != null) {
            for (EnumC3344ka enumC3344ka : values()) {
                if (enumC3344ka.f18361a == num.intValue()) {
                    return enumC3344ka;
                }
            }
        }
        return UNKNOWN;
    }
}
