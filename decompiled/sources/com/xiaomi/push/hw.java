package com.xiaomi.push;

import com.xiaomi.push.hx;
import java.io.ByteArrayOutputStream;

/* loaded from: classes4.dex */
public class hw {

    /* renamed from: a, reason: collision with root package name */
    private ib f14667a;

    /* renamed from: a, reason: collision with other field name */
    private final ii f906a;

    /* renamed from: a, reason: collision with other field name */
    private final ByteArrayOutputStream f907a;

    public hw() {
        this(new hx.a());
    }

    public hw(id idVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f907a = byteArrayOutputStream;
        ii iiVar = new ii(byteArrayOutputStream);
        this.f906a = iiVar;
        this.f14667a = idVar.a(iiVar);
    }

    public byte[] a(hr hrVar) {
        this.f907a.reset();
        hrVar.b(this.f14667a);
        return this.f907a.toByteArray();
    }
}
