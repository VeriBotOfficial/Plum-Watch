package com.alibaba.fastjson.asm;

/* JADX INFO: loaded from: classes7.dex */
public class ByteVector {
    public byte[] data;
    public int length;

    public ByteVector() {
        this.data = new byte[64];
    }

    public ByteVector(int r1) {
        this.data = new byte[r1];
    }

    public ByteVector putByte(int r4) {
        int r0 = this.length;
        int r1 = r0 + 1;
        if (r1 > this.data.length) {
            enlarge(1);
        }
        this.data[r0] = (byte) r4;
        this.length = r1;
        return this;
    }

    ByteVector put11(int r5, int r6) {
        int r0 = this.length;
        if (r0 + 2 > this.data.length) {
            enlarge(2);
        }
        byte[] bArr = this.data;
        bArr[r0] = (byte) r5;
        bArr[r0 + 1] = (byte) r6;
        this.length = r0 + 2;
        return this;
    }

    public ByteVector putShort(int r6) {
        int r0 = this.length;
        if (r0 + 2 > this.data.length) {
            enlarge(2);
        }
        byte[] bArr = this.data;
        bArr[r0] = (byte) (r6 >>> 8);
        bArr[r0 + 1] = (byte) r6;
        this.length = r0 + 2;
        return this;
    }

    public ByteVector put12(int r6, int r7) {
        int r0 = this.length;
        if (r0 + 3 > this.data.length) {
            enlarge(3);
        }
        byte[] bArr = this.data;
        bArr[r0] = (byte) r6;
        bArr[r0 + 1] = (byte) (r7 >>> 8);
        bArr[r0 + 2] = (byte) r7;
        this.length = r0 + 3;
        return this;
    }

    public ByteVector putInt(int r7) {
        int r0 = this.length;
        if (r0 + 4 > this.data.length) {
            enlarge(4);
        }
        byte[] bArr = this.data;
        bArr[r0] = (byte) (r7 >>> 24);
        bArr[r0 + 1] = (byte) (r7 >>> 16);
        bArr[r0 + 2] = (byte) (r7 >>> 8);
        bArr[r0 + 3] = (byte) r7;
        this.length = r0 + 4;
        return this;
    }

    public ByteVector putUTF8(String str) {
        int length = str.length();
        int r1 = this.length;
        if (r1 + 2 + length > this.data.length) {
            enlarge(length + 2);
        }
        byte[] bArr = this.data;
        int r3 = r1 + 1;
        bArr[r1] = (byte) (length >>> 8);
        int r2 = r1 + 2;
        bArr[r3] = (byte) length;
        int r4 = 0;
        while (r4 < length) {
            char cCharAt = str.charAt(r4);
            if ((cCharAt >= 1 && cCharAt <= 127) || (cCharAt >= 19968 && cCharAt <= 40959)) {
                bArr[r2] = (byte) cCharAt;
                r4++;
                r2++;
            } else {
                throw new UnsupportedOperationException();
            }
        }
        this.length = r2;
        return this;
    }

    public ByteVector putByteArray(byte[] bArr, int r4, int r5) {
        if (this.length + r5 > this.data.length) {
            enlarge(r5);
        }
        if (bArr != null) {
            System.arraycopy(bArr, r4, this.data, this.length, r5);
        }
        this.length += r5;
        return this;
    }

    private void enlarge(int r4) {
        byte[] bArr = this.data;
        int length = bArr.length * 2;
        int r2 = this.length;
        int r5 = r4 + r2;
        if (length <= r5) {
            length = r5;
        }
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, r2);
        this.data = bArr2;
    }
}
