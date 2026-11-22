package com.beken.iot.smartsdk.core.realtime;

/* loaded from: classes13.dex */
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
        int i = ~(b & 255);
        int i2 = (((i & 15) << 3) + 132) << ((i & 112) >> 4);
        return (i & 128) != 0 ? 132 - i2 : i2 - 132;
    }

    private static int search(int i, short[] sArr, int i2) {
        for (int i3 = 0; i3 < sArr.length; i3++) {
            if (i <= sArr[i3]) {
                return i3;
            }
        }
        return i2;
    }

    public static byte[] encode(byte[] bArr) {
        int length = bArr.length / 2;
        byte[] bArr2 = new byte[length];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i + 1;
            int i4 = bArr[i] & 255;
            i += 2;
            bArr2[i2] = linear2ulaw((short) ((bArr[i3] << 8) | i4));
        }
        return bArr2;
    }

    public static byte[] decode(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            short ulaw2linear = (short) ulaw2linear(b);
            int i2 = i + 1;
            bArr2[i] = (byte) ulaw2linear;
            i += 2;
            bArr2[i2] = (byte) (ulaw2linear >> 8);
        }
        return bArr2;
    }

    private static byte linear2ulaw(int i) {
        int i2;
        int i3;
        int i4 = i >> 2;
        if (i4 < 0) {
            i4 = -i4;
            i2 = 127;
        } else {
            i2 = 255;
        }
        if (i4 > CLIP) {
            i4 = CLIP;
        }
        int i5 = i4 + 33;
        int search = search(i5, seg_uend, 8);
        if (search >= 8) {
            i3 = i2 ^ 127;
        } else {
            i3 = (((i5 >> (search + 1)) & 15) | (search << 4)) ^ i2;
        }
        return (byte) i3;
    }
}
