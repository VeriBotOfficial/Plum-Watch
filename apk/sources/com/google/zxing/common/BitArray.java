package com.google.zxing.common;

import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class BitArray implements Cloneable {
    private int[] bits;
    private int size;

    public BitArray() {
        this.size = 0;
        this.bits = new int[1];
    }

    public BitArray(int r1) {
        this.size = r1;
        this.bits = makeArray(r1);
    }

    BitArray(int[] r1, int r2) {
        this.bits = r1;
        this.size = r2;
    }

    public int getSize() {
        return this.size;
    }

    public int getSizeInBytes() {
        return (this.size + 7) / 8;
    }

    private void ensureCapacity(int r4) {
        if (r4 > (this.bits.length << 5)) {
            int[] r5 = makeArray(r4);
            int[] r0 = this.bits;
            System.arraycopy(r0, 0, r5, 0, r0.length);
            this.bits = r5;
        }
    }

    public boolean get(int r3) {
        return ((1 << (r3 & 31)) & this.bits[r3 / 32]) != 0;
    }

    public void set(int r5) {
        int[] r0 = this.bits;
        int r1 = r5 / 32;
        r0[r1] = (1 << (r5 & 31)) | r0[r1];
    }

    public void flip(int r5) {
        int[] r0 = this.bits;
        int r1 = r5 / 32;
        r0[r1] = (1 << (r5 & 31)) ^ r0[r1];
    }

    public int getNextSet(int r4) {
        int r0 = this.size;
        if (r4 >= r0) {
            return r0;
        }
        int r1 = r4 / 32;
        int r5 = (~((1 << (r4 & 31)) - 1)) & this.bits[r1];
        while (r5 == 0) {
            r1++;
            int[] r6 = this.bits;
            if (r1 == r6.length) {
                return this.size;
            }
            r5 = r6[r1];
        }
        int r2 = (r1 << 5) + Integer.numberOfTrailingZeros(r5);
        int r7 = this.size;
        return r2 > r7 ? r7 : r2;
    }

    public int getNextUnset(int r4) {
        int r0 = this.size;
        if (r4 >= r0) {
            return r0;
        }
        int r1 = r4 / 32;
        int r5 = (~((1 << (r4 & 31)) - 1)) & (~this.bits[r1]);
        while (r5 == 0) {
            r1++;
            int[] r6 = this.bits;
            if (r1 == r6.length) {
                return this.size;
            }
            r5 = ~r6[r1];
        }
        int r2 = (r1 << 5) + Integer.numberOfTrailingZeros(r5);
        int r7 = this.size;
        return r2 > r7 ? r7 : r2;
    }

    public void setBulk(int r2, int r3) {
        this.bits[r2 / 32] = r3;
    }

    public void setRange(int r7, int r8) {
        if (r8 < r7 || r7 < 0 || r8 > this.size) {
            throw new IllegalArgumentException();
        }
        if (r8 == r7) {
            return;
        }
        int r9 = r8 - 1;
        int r0 = r7 / 32;
        int r1 = r9 / 32;
        int r2 = r0;
        while (r2 <= r1) {
            int r3 = 31;
            int r4 = r2 > r0 ? 0 : r7 & 31;
            if (r2 >= r1) {
                r3 = 31 & r9;
            }
            int r5 = (2 << r3) - (1 << r4);
            int[] r6 = this.bits;
            r6[r2] = r5 | r6[r2];
            r2++;
        }
    }

    public void clear() {
        int length = this.bits.length;
        for (int r2 = 0; r2 < length; r2++) {
            this.bits[r2] = 0;
        }
    }

    public boolean isRange(int r9, int r10, boolean z) {
        if (r10 < r9 || r9 < 0 || r10 > this.size) {
            throw new IllegalArgumentException();
        }
        if (r10 == r9) {
            return true;
        }
        int r11 = r10 - 1;
        int r1 = r9 / 32;
        int r2 = r11 / 32;
        int r3 = r1;
        while (r3 <= r2) {
            int r5 = (2 << (r3 >= r2 ? 31 & r11 : 31)) - (1 << (r3 > r1 ? 0 : r9 & 31));
            int r6 = this.bits[r3] & r5;
            if (!z) {
                r5 = 0;
            }
            if (r6 != r5) {
                return false;
            }
            r3++;
        }
        return true;
    }

    public void appendBit(boolean z) {
        ensureCapacity(this.size + 1);
        if (z) {
            int[] r5 = this.bits;
            int r0 = this.size;
            int r2 = r0 / 32;
            r5[r2] = (1 << (r0 & 31)) | r5[r2];
        }
        this.size++;
    }

    public void appendBits(int r3, int r4) {
        if (r4 < 0 || r4 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        ensureCapacity(this.size + r4);
        while (r4 > 0) {
            boolean z = true;
            if (((r3 >> (r4 - 1)) & 1) != 1) {
                z = false;
            }
            appendBit(z);
            r4--;
        }
    }

    public void appendBitArray(BitArray bitArray) {
        int r0 = bitArray.size;
        ensureCapacity(this.size + r0);
        for (int r1 = 0; r1 < r0; r1++) {
            appendBit(bitArray.get(r1));
        }
    }

    public void xor(BitArray bitArray) {
        if (this.size != bitArray.size) {
            throw new IllegalArgumentException("Sizes don't match");
        }
        int r0 = 0;
        while (true) {
            int[] r1 = this.bits;
            if (r0 >= r1.length) {
                return;
            }
            r1[r0] = r1[r0] ^ bitArray.bits[r0];
            r0++;
        }
    }

    public void toBytes(int r7, byte[] bArr, int r9, int r10) {
        for (int r1 = 0; r1 < r10; r1++) {
            int r3 = 0;
            for (int r2 = 0; r2 < 8; r2++) {
                if (get(r7)) {
                    r3 |= 1 << (7 - r2);
                }
                r7++;
            }
            bArr[r9 + r1] = (byte) r3;
        }
    }

    public int[] getBitArray() {
        return this.bits;
    }

    public void reverse() {
        int[] r0 = new int[this.bits.length];
        int r1 = (this.size - 1) / 32;
        int r3 = r1 + 1;
        for (int r5 = 0; r5 < r3; r5++) {
            long j = this.bits[r5];
            long j2 = ((j & 1431655765) << 1) | ((j >> 1) & 1431655765);
            long j3 = ((j2 & 858993459) << 2) | ((j2 >> 2) & 858993459);
            long j4 = ((j3 & 252645135) << 4) | ((j3 >> 4) & 252645135);
            long j5 = ((j4 & 16711935) << 8) | ((j4 >> 8) & 16711935);
            r0[r1 - r5] = (int) (((j5 & 65535) << 16) | ((j5 >> 16) & 65535));
        }
        int r6 = this.size;
        int r7 = r3 << 5;
        if (r6 != r7) {
            int r8 = r7 - r6;
            int r4 = r0[0] >>> r8;
            for (int r2 = 1; r2 < r3; r2++) {
                int r9 = r0[r2];
                r0[r2 - 1] = r4 | (r9 << (32 - r8));
                r4 = r9 >>> r8;
            }
            r0[r1] = r4;
        }
        this.bits = r0;
    }

    private static int[] makeArray(int r0) {
        return new int[(r0 + 31) / 32];
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BitArray)) {
            return false;
        }
        BitArray bitArray = (BitArray) obj;
        return this.size == bitArray.size && Arrays.equals(this.bits, bitArray.bits);
    }

    public int hashCode() {
        return (this.size * 31) + Arrays.hashCode(this.bits);
    }

    public String toString() {
        int r1 = this.size;
        StringBuilder sb = new StringBuilder(r1 + (r1 / 8) + 1);
        for (int r2 = 0; r2 < this.size; r2++) {
            if ((r2 & 7) == 0) {
                sb.append(' ');
            }
            sb.append(get(r2) ? 'X' : '.');
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public BitArray m8119clone() {
        return new BitArray((int[]) this.bits.clone(), this.size);
    }
}
