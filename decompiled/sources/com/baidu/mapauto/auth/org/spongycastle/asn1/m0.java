package com.baidu.mapauto.auth.org.spongycastle.asn1;

import java.io.IOException;

/* loaded from: classes13.dex */
public final class m0 extends b {
    public m0(byte[] bArr, int i) {
        super(bArr, i);
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final void a(p pVar) throws IOException {
        byte[] bArr = this.f8257a;
        int i = this.b;
        byte[] a2 = com.baidu.mapauto.auth.org.spongycastle.util.a.a(bArr);
        if (i > 0) {
            int length = bArr.length - 1;
            a2[length] = (byte) ((255 << i) & a2[length]);
        }
        int length2 = a2.length;
        byte[] bArr2 = new byte[length2 + 1];
        bArr2[0] = (byte) this.b;
        System.arraycopy(a2, 0, bArr2, 1, length2);
        pVar.a(bArr2, 3);
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final int e() {
        return u1.a(this.f8257a.length + 1) + 1 + this.f8257a.length + 1;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final boolean f() {
        return false;
    }

    public static m0 a(Object obj) {
        if (obj == null || (obj instanceof m0)) {
            return (m0) obj;
        }
        if (obj instanceof j1) {
            j1 j1Var = (j1) obj;
            return new m0(j1Var.f8257a, j1Var.b);
        }
        if (obj instanceof byte[]) {
            try {
                return (m0) r.a((byte[]) obj);
            } catch (Exception e) {
                throw new IllegalArgumentException(com.baidu.mapauto.auth.b.a("encoding error in getInstance: ").append(e.toString()).toString());
            }
        }
        throw new IllegalArgumentException(com.baidu.mapauto.auth.b.a("illegal object in getInstance: ").append(obj.getClass().getName()).toString());
    }
}
