package com.baidu.mapauto.auth.org.spongycastle.asn1;

import java.io.IOException;
import java.util.Enumeration;

/* loaded from: classes13.dex */
public final class r1 implements Enumeration {

    /* renamed from: a, reason: collision with root package name */
    public i f8289a;
    public r b = a();

    public r1(byte[] bArr) {
        this.f8289a = new i(bArr, 0);
    }

    public final r a() {
        try {
            return this.f8289a.a();
        } catch (IOException e) {
            throw new q("malformed DER construction: " + e, e);
        }
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return this.b != null;
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        r rVar = this.b;
        this.b = a();
        return rVar;
    }
}
