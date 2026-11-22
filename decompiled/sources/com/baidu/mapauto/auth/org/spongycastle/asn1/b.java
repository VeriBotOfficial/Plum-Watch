package com.baidu.mapauto.auth.org.spongycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: classes13.dex */
public abstract class b extends r {
    public static final char[] c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f8257a;
    public final int b;

    public b(byte[] bArr, int i) {
        if (bArr == null) {
            throw new NullPointerException("data cannot be null");
        }
        if (bArr.length == 0 && i != 0) {
            throw new IllegalArgumentException("zero length data with non-zero pad bits");
        }
        if (i > 7 || i < 0) {
            throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
        }
        this.f8257a = com.baidu.mapauto.auth.org.spongycastle.util.a.a(bArr);
        this.b = i;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final boolean a(r rVar) {
        if (!(rVar instanceof b)) {
            return false;
        }
        b bVar = (b) rVar;
        int i = this.b;
        if (i == bVar.b) {
            byte[] bArr = this.f8257a;
            byte[] a2 = com.baidu.mapauto.auth.org.spongycastle.util.a.a(bArr);
            if (i > 0) {
                int length = bArr.length - 1;
                a2[length] = (byte) ((255 << i) & a2[length]);
            }
            byte[] bArr2 = bVar.f8257a;
            int i2 = bVar.b;
            byte[] a3 = com.baidu.mapauto.auth.org.spongycastle.util.a.a(bArr2);
            if (i2 > 0) {
                int length2 = bArr2.length - 1;
                a3[length2] = (byte) ((255 << i2) & a3[length2]);
            }
            if (com.baidu.mapauto.auth.org.spongycastle.util.a.a(a2, a3)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final r g() {
        return new m0(this.f8257a, this.b);
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final r h() {
        return new j1(this.f8257a, this.b);
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r, com.baidu.mapauto.auth.org.spongycastle.asn1.l
    public final int hashCode() {
        int i = this.b;
        byte[] bArr = this.f8257a;
        byte[] a2 = com.baidu.mapauto.auth.org.spongycastle.util.a.a(bArr);
        if (i > 0) {
            int length = bArr.length - 1;
            a2[length] = (byte) (a2[length] & (255 << i));
        }
        return i ^ com.baidu.mapauto.auth.org.spongycastle.util.a.b(a2);
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("#");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new p(byteArrayOutputStream).a((d) this);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            for (int i = 0; i != byteArray.length; i++) {
                char[] cArr = c;
                stringBuffer.append(cArr[(byteArray[i] >>> 4) & 15]);
                stringBuffer.append(cArr[byteArray[i] & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException e) {
            throw new q(com.baidu.mapauto.auth.b.a("Internal error encoding BitString: ").append(e.getMessage()).toString(), e);
        }
    }
}
