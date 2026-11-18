package com.google.zxing.common;

/* JADX INFO: loaded from: classes7.dex */
public final class BitSource {
    private int bitOffset;
    private int byteOffset;
    private final byte[] bytes;

    public BitSource(byte[] bArr) {
        this.bytes = bArr;
    }

    public int getBitOffset() {
        return this.bitOffset;
    }

    public int getByteOffset() {
        return this.byteOffset;
    }

    public int readBits(int r10) {
        if (r10 <= 0 || r10 > 32 || r10 > available()) {
            throw new IllegalArgumentException(String.valueOf(r10));
        }
        int r0 = this.bitOffset;
        int r1 = 0;
        if (r0 > 0) {
            int r4 = 8 - r0;
            int r5 = r10 < r4 ? r10 : r4;
            int r6 = r4 - r5;
            byte[] bArr = this.bytes;
            int r8 = this.byteOffset;
            int r7 = (((255 >> (8 - r5)) << r6) & bArr[r8]) >> r6;
            r10 -= r5;
            int r2 = r0 + r5;
            this.bitOffset = r2;
            if (r2 == 8) {
                this.bitOffset = 0;
                this.byteOffset = r8 + 1;
            }
            r1 = r7;
        }
        if (r10 <= 0) {
            return r1;
        }
        while (r10 >= 8) {
            int r3 = r1 << 8;
            byte[] bArr2 = this.bytes;
            int r9 = this.byteOffset;
            r1 = (bArr2[r9] & 255) | r3;
            this.byteOffset = r9 + 1;
            r10 -= 8;
        }
        if (r10 <= 0) {
            return r1;
        }
        int r11 = 8 - r10;
        int r12 = (r1 << r10) | ((((255 >> r11) << r11) & this.bytes[this.byteOffset]) >> r11);
        this.bitOffset += r10;
        return r12;
    }

    public int available() {
        return ((this.bytes.length - this.byteOffset) * 8) - this.bitOffset;
    }
}
