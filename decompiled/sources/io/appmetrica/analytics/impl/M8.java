package io.appmetrica.analytics.impl;

/* loaded from: classes6.dex */
public enum M8 {
    NONE(0),
    EXTERNALLY_ENCRYPTED_EVENT_CRYPTER(1),
    AES_VALUE_ENCRYPTION(2);


    /* renamed from: a, reason: collision with root package name */
    public final int f17972a;

    M8(int i) {
        this.f17972a = i;
    }

    public static M8 a(Integer num) {
        if (num != null) {
            for (M8 m8 : values()) {
                if (m8.f17972a == num.intValue()) {
                    return m8;
                }
            }
        }
        return NONE;
    }
}
