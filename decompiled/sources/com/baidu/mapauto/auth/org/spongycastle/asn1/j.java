package com.baidu.mapauto.auth.org.spongycastle.asn1;

import java.io.IOException;
import java.math.BigInteger;

/* loaded from: classes13.dex */
public final class j extends r {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f8275a;

    public j(BigInteger bigInteger) {
        this.f8275a = bigInteger.toByteArray();
    }

    public j(byte[] bArr) {
        if (!com.baidu.mapauto.auth.org.spongycastle.util.c.a() && b(bArr)) {
            throw new IllegalArgumentException("malformed integer");
        }
        this.f8275a = bArr;
    }

    public static j a(Object obj) {
        if (obj == null || (obj instanceof j)) {
            return (j) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException(com.baidu.mapauto.auth.b.a("illegal object in getInstance: ").append(obj.getClass().getName()).toString());
        }
        try {
            return (j) r.a((byte[]) obj);
        } catch (Exception e) {
            throw new IllegalArgumentException(com.baidu.mapauto.auth.b.a("encoding error in getInstance: ").append(e.toString()).toString());
        }
    }

    public static boolean b(byte[] bArr) {
        if (bArr.length > 1) {
            byte b = bArr[0];
            if (b == 0 && (bArr[1] & 128) == 0) {
                return true;
            }
            if (b == -1 && (bArr[1] & 128) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final void a(p pVar) throws IOException {
        pVar.a(this.f8275a, 2);
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final boolean a(r rVar) {
        if (rVar instanceof j) {
            return com.baidu.mapauto.auth.org.spongycastle.util.a.a(this.f8275a, ((j) rVar).f8275a);
        }
        return false;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final int e() {
        return u1.a(this.f8275a.length) + 1 + this.f8275a.length;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final boolean f() {
        return false;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r, com.baidu.mapauto.auth.org.spongycastle.asn1.l
    public final int hashCode() {
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f8275a;
            if (i == bArr.length) {
                return i2;
            }
            i2 ^= (bArr[i] & 255) << (i % 4);
            i++;
        }
    }

    public final BigInteger i() {
        return new BigInteger(1, this.f8275a);
    }

    public final String toString() {
        return new BigInteger(this.f8275a).toString();
    }
}
