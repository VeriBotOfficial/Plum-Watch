package org.easydarwin.util;

/* loaded from: classes6.dex */
public final class ParsableBitArray {
    private int bitOffset;
    private int byteLimit;
    private int byteOffset;
    public byte[] data;

    private void assertValidOffset() {
    }

    public ParsableBitArray() {
    }

    public ParsableBitArray(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public ParsableBitArray(byte[] bArr, int i) {
        this.data = bArr;
        this.byteLimit = i;
    }

    public void reset(byte[] bArr) {
        reset(bArr, bArr.length);
    }

    public void reset(byte[] bArr, int i) {
        this.data = bArr;
        this.byteOffset = 0;
        this.bitOffset = 0;
        this.byteLimit = i;
    }

    public int bitsLeft() {
        return ((this.byteLimit - this.byteOffset) * 8) - this.bitOffset;
    }

    public int getPosition() {
        return (this.byteOffset * 8) + this.bitOffset;
    }

    public void setPosition(int i) {
        int i2 = i / 8;
        this.byteOffset = i2;
        this.bitOffset = i - (i2 * 8);
        assertValidOffset();
    }

    public void skipBits(int i) {
        int i2 = this.byteOffset + (i / 8);
        this.byteOffset = i2;
        int i3 = this.bitOffset + (i % 8);
        this.bitOffset = i3;
        if (i3 > 7) {
            this.byteOffset = i2 + 1;
            this.bitOffset = i3 - 8;
        }
        assertValidOffset();
    }

    public boolean readBit() {
        return readBits(1) == 1;
    }

    public int readBits(int i) {
        int i2;
        int i3;
        if (i == 0) {
            return 0;
        }
        int i4 = i / 8;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            int i7 = this.bitOffset;
            if (i7 != 0) {
                byte[] bArr = this.data;
                int i8 = this.byteOffset;
                i3 = ((bArr[i8 + 1] & 255) >>> (8 - i7)) | ((bArr[i8] & 255) << i7);
            } else {
                i3 = this.data[this.byteOffset];
            }
            i -= 8;
            i5 |= (255 & i3) << i;
            this.byteOffset++;
        }
        if (i > 0) {
            int i9 = this.bitOffset + i;
            byte b = (byte) (255 >> (8 - i));
            if (i9 > 8) {
                byte[] bArr2 = this.data;
                int i10 = this.byteOffset;
                i2 = (b & (((255 & bArr2[i10 + 1]) >> (16 - i9)) | ((bArr2[i10] & 255) << (i9 - 8)))) | i5;
                this.byteOffset = i10 + 1;
            } else {
                byte[] bArr3 = this.data;
                int i11 = this.byteOffset;
                i2 = (b & ((255 & bArr3[i11]) >> (8 - i9))) | i5;
                if (i9 == 8) {
                    this.byteOffset = i11 + 1;
                }
            }
            i5 = i2;
            this.bitOffset = i9 % 8;
        }
        assertValidOffset();
        return i5;
    }
}
