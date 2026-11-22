package com.baidu.bbalbscesium.k.a;

import com.unity3d.services.UnityAdsConstants;
import java.security.InvalidKeyException;

/* loaded from: classes12.dex */
class d extends f {
    protected byte[] d;
    private byte[] e;
    private byte[] f;

    d(b bVar) {
        super(bVar);
        this.f = null;
        int i = this.b;
        this.e = new byte[i];
        this.d = new byte[i];
    }

    @Override // com.baidu.bbalbscesium.k.a.f
    void a(boolean z, String str, byte[] bArr, byte[] bArr2) throws InvalidKeyException {
        if (bArr == null || bArr2 == null || bArr2.length != this.b) {
            throw new InvalidKeyException(UnityAdsConstants.Messages.MSG_INTERNAL_ERROR);
        }
        this.c = bArr2;
        e();
        this.f7422a.a(z, str, bArr);
    }

    @Override // com.baidu.bbalbscesium.k.a.f
    void a(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4;
        int i5 = i2 + i;
        byte[] bArr3 = (bArr != bArr2 || i < i3 || i - i3 >= this.b) ? null : (byte[]) bArr.clone();
        while (i < i5) {
            this.f7422a.a(bArr, i, this.e, 0);
            int i6 = 0;
            while (true) {
                i4 = this.b;
                if (i6 >= i4) {
                    break;
                }
                bArr2[i6 + i3] = (byte) (this.e[i6] ^ this.d[i6]);
                i6++;
            }
            byte[] bArr4 = this.d;
            if (bArr3 == null) {
                System.arraycopy(bArr, i, bArr4, 0, i4);
            } else {
                System.arraycopy(bArr3, i, bArr4, 0, i4);
            }
            int i7 = this.b;
            i += i7;
            i3 += i7;
        }
    }

    @Override // com.baidu.bbalbscesium.k.a.f
    String c() {
        return "CBC";
    }

    @Override // com.baidu.bbalbscesium.k.a.f
    void c(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4 = i2 + i;
        while (i < i4) {
            for (int i5 = 0; i5 < this.b; i5++) {
                this.e[i5] = (byte) (bArr[i5 + i] ^ this.d[i5]);
            }
            this.f7422a.b(this.e, 0, bArr2, i3);
            System.arraycopy(bArr2, i3, this.d, 0, this.b);
            int i6 = this.b;
            i += i6;
            i3 += i6;
        }
    }

    @Override // com.baidu.bbalbscesium.k.a.f
    void e() {
        System.arraycopy(this.c, 0, this.d, 0, this.b);
    }

    @Override // com.baidu.bbalbscesium.k.a.f
    void f() {
        System.arraycopy(this.f, 0, this.d, 0, this.b);
    }

    @Override // com.baidu.bbalbscesium.k.a.f
    void g() {
        if (this.f == null) {
            this.f = new byte[this.b];
        }
        System.arraycopy(this.d, 0, this.f, 0, this.b);
    }
}
