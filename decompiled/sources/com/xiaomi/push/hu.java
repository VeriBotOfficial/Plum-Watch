package com.xiaomi.push;

import com.xiaomi.push.hx;

/* loaded from: classes4.dex */
public class hu {

    /* renamed from: a, reason: collision with root package name */
    private final ib f14666a;

    /* renamed from: a, reason: collision with other field name */
    private final ik f905a;

    public hu() {
        this(new hx.a());
    }

    public hu(id idVar) {
        ik ikVar = new ik();
        this.f905a = ikVar;
        this.f14666a = idVar.a(ikVar);
    }

    public void a(hr hrVar, byte[] bArr) {
        try {
            this.f905a.a(bArr);
            hrVar.a(this.f14666a);
        } finally {
            this.f14666a.k();
        }
    }
}
