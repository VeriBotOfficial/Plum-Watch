package com.baidu.mapauto.auth.org.spongycastle.asn1;

import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import java.io.IOException;

/* loaded from: classes13.dex */
public final class f1 extends r {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f8266a;

    public f1(byte[] bArr) {
        this.f8266a = bArr;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final void a(p pVar) throws IOException {
        pVar.a(this.f8266a, 12);
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final boolean a(r rVar) {
        if (rVar instanceof f1) {
            return com.baidu.mapauto.auth.org.spongycastle.util.a.a(this.f8266a, ((f1) rVar).f8266a);
        }
        return false;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final int e() throws IOException {
        return u1.a(this.f8266a.length) + 1 + this.f8266a.length;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final boolean f() {
        return false;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r, com.baidu.mapauto.auth.org.spongycastle.asn1.l
    public final int hashCode() {
        return com.baidu.mapauto.auth.org.spongycastle.util.a.b(this.f8266a);
    }

    public final String toString() {
        char c;
        int i;
        byte b;
        byte[] bArr = this.f8266a;
        int i2 = com.baidu.mapauto.auth.org.spongycastle.util.d.f8308a;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i4 < bArr.length) {
            int i6 = i5 + 1;
            byte b2 = bArr[i4];
            if ((b2 & TransmissionUnpacked.HD_VAL_MAGIC_HB) == 240) {
                i5 += 2;
                i4 += 4;
            } else {
                i4 = (b2 & 224) == 224 ? i4 + 3 : (b2 & 192) == 192 ? i4 + 2 : i4 + 1;
                i5 = i6;
            }
        }
        char[] cArr = new char[i5];
        int i7 = 0;
        while (i3 < bArr.length) {
            byte b3 = bArr[i3];
            if ((b3 & TransmissionUnpacked.HD_VAL_MAGIC_HB) == 240) {
                int i8 = (((((b3 & 3) << 18) | ((bArr[i3 + 1] & 63) << 12)) | ((bArr[i3 + 2] & 63) << 6)) | (bArr[i3 + 3] & 63)) - 65536;
                char c2 = (char) ((i8 >> 10) | 55296);
                c = (char) ((i8 & 1023) | 56320);
                cArr[i7] = c2;
                i3 += 4;
                i7++;
            } else if ((b3 & 224) == 224) {
                c = (char) (((b3 & 15) << 12) | ((bArr[i3 + 1] & 63) << 6) | (bArr[i3 + 2] & 63));
                i3 += 3;
            } else {
                if ((b3 & 208) == 208) {
                    i = (b3 & 31) << 6;
                    b = bArr[i3 + 1];
                } else if ((b3 & 192) == 192) {
                    i = (b3 & 31) << 6;
                    b = bArr[i3 + 1];
                } else {
                    c = (char) (b3 & 255);
                    i3++;
                }
                c = (char) (i | (b & 63));
                i3 += 2;
            }
            cArr[i7] = c;
            i7++;
        }
        return new String(cArr);
    }
}
