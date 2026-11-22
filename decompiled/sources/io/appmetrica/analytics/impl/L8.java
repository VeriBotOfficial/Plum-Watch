package io.appmetrica.analytics.impl;

/* loaded from: classes6.dex */
public final class L8 {

    /* renamed from: a, reason: collision with root package name */
    public final Jc f17954a;
    public final Jc b;

    public L8() {
        this(new C3118b8(), new S9(), new C3109b());
    }

    public L8(C3118b8 c3118b8, S9 s9, C3109b c3109b) {
        Jc jc = new Jc(c3118b8);
        this.f17954a = jc;
        jc.a(M8.NONE, c3118b8);
        jc.a(M8.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER, s9);
        jc.a(M8.AES_VALUE_ENCRYPTION, c3109b);
        this.b = new Jc(c3118b8);
    }
}
