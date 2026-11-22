package com.baidu.mapauto.auth.org.spongycastle.asn1;

import java.io.IOException;

/* loaded from: classes13.dex */
public final class y0 extends r {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f8303a;

    public y0(byte[] bArr) {
        this.f8303a = bArr;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final void a(p pVar) throws IOException {
        pVar.a(this.f8303a, 19);
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final boolean a(r rVar) {
        if (rVar instanceof y0) {
            return com.baidu.mapauto.auth.org.spongycastle.util.a.a(this.f8303a, ((y0) rVar).f8303a);
        }
        return false;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final int e() {
        return u1.a(this.f8303a.length) + 1 + this.f8303a.length;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final boolean f() {
        return false;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r, com.baidu.mapauto.auth.org.spongycastle.asn1.l
    public final int hashCode() {
        return com.baidu.mapauto.auth.org.spongycastle.util.a.b(this.f8303a);
    }

    public final String toString() {
        return com.baidu.mapauto.auth.org.spongycastle.util.d.a(this.f8303a);
    }
}
