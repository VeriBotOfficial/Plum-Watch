package com.baidu.mapauto.auth.org.spongycastle.asn1;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/* loaded from: classes13.dex */
public abstract class n extends r implements o {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f8280a;

    public n(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("string cannot be null");
        }
        this.f8280a = bArr;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.p1
    public final r a() {
        return this;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final boolean a(r rVar) {
        if (rVar instanceof n) {
            return com.baidu.mapauto.auth.org.spongycastle.util.a.a(this.f8280a, ((n) rVar).f8280a);
        }
        return false;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.o
    public final InputStream b() {
        return new ByteArrayInputStream(this.f8280a);
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final r g() {
        return new v0(this.f8280a);
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final r h() {
        return new v0(this.f8280a);
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r, com.baidu.mapauto.auth.org.spongycastle.asn1.l
    public final int hashCode() {
        return com.baidu.mapauto.auth.org.spongycastle.util.a.b(i());
    }

    public byte[] i() {
        return this.f8280a;
    }

    public final String toString() {
        StringBuilder a2 = com.baidu.mapauto.auth.b.a("#");
        byte[] bArr = this.f8280a;
        com.baidu.mapauto.auth.org.spongycastle.util.encoders.e eVar = com.baidu.mapauto.auth.org.spongycastle.util.encoders.d.f8312a;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            eVar.getClass();
            for (byte b : bArr) {
                byteArrayOutputStream.write(eVar.f8313a[(b & 255) >>> 4]);
                byteArrayOutputStream.write(eVar.f8313a[b & 15]);
            }
            return a2.append(com.baidu.mapauto.auth.org.spongycastle.util.d.a(byteArrayOutputStream.toByteArray())).toString();
        } catch (Exception e) {
            throw new com.baidu.mapauto.auth.org.spongycastle.util.encoders.c(com.baidu.mapauto.auth.b.a("exception encoding Hex string: ").append(e.getMessage()).toString(), e);
        }
    }
}
