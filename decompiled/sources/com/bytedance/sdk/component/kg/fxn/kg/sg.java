package com.bytedance.sdk.component.kg.fxn.kg;

import java.util.Arrays;

/* loaded from: classes13.dex */
final class sg extends hm {

    /* renamed from: sg, reason: collision with root package name */
    final transient byte[][] f9375sg;
    final transient int[] tw;

    sg(fxn fxnVar, int i) {
        super(null);
        jq.fxn(fxnVar.kg, 0L, i);
        rb rbVar = fxnVar.fxn;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            if (rbVar.gff == rbVar.kg) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += rbVar.gff - rbVar.kg;
            i4++;
            rbVar = rbVar.bh;
        }
        this.f9375sg = new byte[i4][];
        this.tw = new int[i4 * 2];
        rb rbVar2 = fxnVar.fxn;
        int i5 = 0;
        while (i2 < i) {
            this.f9375sg[i5] = rbVar2.fxn;
            i2 += rbVar2.gff - rbVar2.kg;
            if (i2 > i) {
                i2 = i;
            }
            int[] iArr = this.tw;
            iArr[i5] = i2;
            iArr[this.f9375sg.length + i5] = rbVar2.kg;
            rbVar2.hm = true;
            i5++;
            rbVar2 = rbVar2.bh;
        }
    }

    @Override // com.bytedance.sdk.component.kg.fxn.kg.hm
    public String fxn() {
        return rb().fxn();
    }

    @Override // com.bytedance.sdk.component.kg.fxn.kg.hm
    public String kg() {
        return rb().kg();
    }

    @Override // com.bytedance.sdk.component.kg.fxn.kg.hm
    public hm fxn(int i, int i2) {
        return rb().fxn(i, i2);
    }

    @Override // com.bytedance.sdk.component.kg.fxn.kg.hm
    public byte fxn(int i) {
        jq.fxn(this.tw[this.f9375sg.length - 1], i, 1L);
        int kg = kg(i);
        int i2 = kg == 0 ? 0 : this.tw[kg - 1];
        int[] iArr = this.tw;
        byte[][] bArr = this.f9375sg;
        return bArr[kg][(i - i2) + iArr[bArr.length + kg]];
    }

    private int kg(int i) {
        int binarySearch = Arrays.binarySearch(this.tw, 0, this.f9375sg.length, i + 1);
        return binarySearch >= 0 ? binarySearch : ~binarySearch;
    }

    @Override // com.bytedance.sdk.component.kg.fxn.kg.hm
    public int gff() {
        return this.tw[this.f9375sg.length - 1];
    }

    @Override // com.bytedance.sdk.component.kg.fxn.kg.hm
    public byte[] hm() {
        int[] iArr = this.tw;
        byte[][] bArr = this.f9375sg;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr2 = this.tw;
            int i3 = iArr2[length + i];
            int i4 = iArr2[i];
            System.arraycopy(this.f9375sg[i], i3, bArr2, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr2;
    }

    @Override // com.bytedance.sdk.component.kg.fxn.kg.hm
    public boolean fxn(int i, hm hmVar, int i2, int i3) {
        if (i < 0 || i > gff() - i3) {
            return false;
        }
        int kg = kg(i);
        while (i3 > 0) {
            int i4 = kg == 0 ? 0 : this.tw[kg - 1];
            int min = Math.min(i3, ((this.tw[kg] - i4) + i4) - i);
            int[] iArr = this.tw;
            byte[][] bArr = this.f9375sg;
            if (!hmVar.fxn(i2, bArr[kg], (i - i4) + iArr[bArr.length + kg], min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            kg++;
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.kg.fxn.kg.hm
    public boolean fxn(int i, byte[] bArr, int i2, int i3) {
        if (i < 0 || i > gff() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int kg = kg(i);
        while (i3 > 0) {
            int i4 = kg == 0 ? 0 : this.tw[kg - 1];
            int min = Math.min(i3, ((this.tw[kg] - i4) + i4) - i);
            int[] iArr = this.tw;
            byte[][] bArr2 = this.f9375sg;
            if (!jq.fxn(bArr2[kg], (i - i4) + iArr[bArr2.length + kg], bArr, i2, min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            kg++;
        }
        return true;
    }

    private hm rb() {
        return new hm(hm());
    }

    @Override // com.bytedance.sdk.component.kg.fxn.kg.hm
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hm) {
            hm hmVar = (hm) obj;
            if (hmVar.gff() == gff() && fxn(0, hmVar, 0, gff())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.kg.fxn.kg.hm
    public int hashCode() {
        int i = this.rb;
        if (i != 0) {
            return i;
        }
        int length = this.f9375sg.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            byte[] bArr = this.f9375sg[i2];
            int[] iArr = this.tw;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.rb = i3;
        return i3;
    }

    @Override // com.bytedance.sdk.component.kg.fxn.kg.hm
    public String toString() {
        return rb().toString();
    }
}
