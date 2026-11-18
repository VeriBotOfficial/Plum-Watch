package com.beken.iot.smartsdk.core.realtime;

/* JADX INFO: loaded from: classes15.dex */
public class G711UCode {
    private static final int BIAS = 132;
    private static final int CLIP = 8159;
    private static final int MSEGS = 8;
    private static final int QUANT_MASK = 15;
    private static final int SEG_MASK = 112;
    private static final int SEG_SHIFT = 4;
    private static final int SIGN_BIT = 128;
    private static final short[] seg_aend = {31, 63, 127, 255, 511, 1023, 2047, 4095};
    private static final short[] seg_uend = {63, 127, 255, 511, 1023, 2047, 4095, 8191};

    private static int ulaw2linear(byte b) {
        int r2 = ~(b & 255);
        int r0 = (((r2 & 15) << 3) + 132) << ((r2 & 112) >> 4);
        return (r2 & 128) != 0 ? 132 - r0 : r0 - 132;
    }

    private static int search(int r2, short[] sArr, int r4) {
        for (int r0 = 0; r0 < sArr.length; r0++) {
            if (r2 <= sArr[r0]) {
                return r0;
            }
        }
        return r4;
    }

    public static byte[] encode(byte[] bArr) {
        int length = bArr.length / 2;
        byte[] bArr2 = new byte[length];
        int r3 = 0;
        for (int r2 = 0; r2 < length; r2++) {
            int r4 = r3 + 1;
            int r5 = bArr[r3] & 255;
            r3 += 2;
            bArr2[r2] = linear2ulaw((short) ((bArr[r4] << 8) | r5));
        }
        return bArr2;
    }

    public static byte[] decode(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length * 2];
        int r2 = 0;
        for (byte b : bArr) {
            short sUlaw2linear = (short) ulaw2linear(b);
            int r4 = r2 + 1;
            bArr2[r2] = (byte) sUlaw2linear;
            r2 += 2;
            bArr2[r4] = (byte) (sUlaw2linear >> 8);
        }
        return bArr2;
    }

    private static byte linear2ulaw(int r4) {
        int r1;
        int r5;
        int r6 = r4 >> 2;
        if (r6 < 0) {
            r6 = -r6;
            r1 = 127;
        } else {
            r1 = 255;
        }
        if (r6 > CLIP) {
            r6 = CLIP;
        }
        int r7 = r6 + 33;
        int r2 = search(r7, seg_uend, 8);
        if (r2 >= 8) {
            r5 = r1 ^ 127;
        } else {
            r5 = (((r7 >> (r2 + 1)) & 15) | (r2 << 4)) ^ r1;
        }
        return (byte) r5;
    }
}
