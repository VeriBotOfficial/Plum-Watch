package com.bytedance.sdk.component.kg.fxn.kg;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes13.dex */
public class hm implements Serializable, Comparable<hm> {
    transient String bh;
    final byte[] hm;
    transient int rb;
    static final char[] fxn = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final Charset kg = Charset.forName("UTF-8");
    public static final hm gff = fxn(new byte[0]);

    hm(byte[] bArr) {
        this.hm = bArr;
    }

    public static hm fxn(byte... bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("data == null");
        }
        return new hm((byte[]) bArr.clone());
    }

    public String fxn() {
        String str = this.bh;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.hm, kg);
        this.bh = str2;
        return str2;
    }

    public String kg() {
        byte[] bArr = this.hm;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = fxn;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public hm fxn(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.hm;
        if (i2 > bArr.length) {
            throw new IllegalArgumentException("endIndex > length(" + this.hm.length + Separators.RPAREN);
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        if (i == 0 && i2 == bArr.length) {
            return this;
        }
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i, bArr2, 0, i3);
        return new hm(bArr2);
    }

    public byte fxn(int i) {
        return this.hm[i];
    }

    public int gff() {
        return this.hm.length;
    }

    public byte[] hm() {
        return (byte[]) this.hm.clone();
    }

    public boolean fxn(int i, hm hmVar, int i2, int i3) {
        return hmVar.fxn(i2, this.hm, i, i3);
    }

    public boolean fxn(int i, byte[] bArr, int i2, int i3) {
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.hm;
        return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && jq.fxn(bArr2, i, bArr, i2, i3);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hm) {
            hm hmVar = (hm) obj;
            int gff2 = hmVar.gff();
            byte[] bArr = this.hm;
            if (gff2 == bArr.length && hmVar.fxn(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.rb;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.hm);
        this.rb = hashCode;
        return hashCode;
    }

    @Override // java.lang.Comparable
    /* renamed from: fxn, reason: merged with bridge method [inline-methods] */
    public int compareTo(hm hmVar) {
        int gff2 = gff();
        int gff3 = hmVar.gff();
        int min = Math.min(gff2, gff3);
        for (int i = 0; i < min; i++) {
            int fxn2 = fxn(i) & 255;
            int fxn3 = hmVar.fxn(i) & 255;
            if (fxn2 != fxn3) {
                return fxn2 < fxn3 ? -1 : 1;
            }
        }
        if (gff2 == gff3) {
            return 0;
        }
        return gff2 < gff3 ? -1 : 1;
    }

    public String toString() {
        if (this.hm.length == 0) {
            return "[size=0]";
        }
        String fxn2 = fxn();
        int fxn3 = fxn(fxn2, 64);
        if (fxn3 == -1) {
            if (this.hm.length > 64) {
                return "[size=" + this.hm.length + " hex=" + fxn(0, 64).kg() + "…]";
            }
            return "[hex=" + kg() + "]";
        }
        String replace = fxn2.substring(0, fxn3).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        return fxn3 < fxn2.length() ? "[size=" + this.hm.length + " text=" + replace + "…]" : "[text=" + replace + "]";
    }

    static int fxn(String str, int i) {
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            if (i3 == i) {
                return i2;
            }
            int codePointAt = str.codePointAt(i2);
            if ((Character.isISOControl(codePointAt) && codePointAt != 10 && codePointAt != 13) || codePointAt == 65533) {
                return -1;
            }
            i3++;
            i2 += Character.charCount(codePointAt);
        }
        return str.length();
    }
}
