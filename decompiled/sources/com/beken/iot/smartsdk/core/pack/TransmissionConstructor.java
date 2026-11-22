package com.beken.iot.smartsdk.core.pack;

import com.beken.iot.smartsdk.core.data.BasicHead;

/* loaded from: classes13.dex */
public abstract class TransmissionConstructor {
    public static final boolean BIG_ENDIAN = false;
    public static final int COMM_PACK = 1;
    public static final int COMM_UNPACK = 2;
    public static int channelSequence;
    BasicHead basicHead;
    protected byte[] payload;

    public static void encodeInt(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i & 255);
        bArr[i2 + 1] = (byte) ((i >> 8) & 255);
        bArr[i2 + 2] = (byte) ((i >> 16) & 255);
        bArr[i2 + 3] = (byte) ((i >> 24) & 255);
    }

    public static void encodeShort(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i & 255);
        bArr[i2 + 1] = (byte) ((i >> 8) & 255);
    }

    public static byte[] int2bytes(int i) {
        return new byte[]{(byte) (i & 255), (byte) ((i >> 8) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 24) & 255)};
    }

    public static byte[] short2bytes(int i) {
        return new byte[]{(byte) (i & 255), (byte) ((i >> 8) & 255)};
    }

    public static int bytes2int(byte[] bArr) {
        if (bArr == null || bArr.length < 4) {
            return -1;
        }
        return bArr[0] | (bArr[3] << 24) | (bArr[2] << 16) | (bArr[1] << 8);
    }

    public static int bytes2int(byte[] bArr, int i) {
        if (bArr == null || bArr.length - i < 4) {
            return -1;
        }
        return bArr[i] | (bArr[i + 3] << 24) | (bArr[i + 2] << 16) | (bArr[i + 1] << 8);
    }

    public static int bytes2short(byte[] bArr) {
        if (bArr == null || bArr.length < 2) {
            return -1;
        }
        return bArr[0] | (bArr[1] << 8);
    }

    public static int bytes2short(byte[] bArr, int i) {
        if (bArr == null || bArr.length - i < 2) {
            return -1;
        }
        return bArr[i] | (bArr[i + 1] << 8);
    }

    public static int bytes2char(byte[] bArr, int i) {
        if (bArr == null || bArr.length - i < 1) {
            return -1;
        }
        return Byte.toUnsignedInt(bArr[i]);
    }

    public static byte[] reorder(byte[] bArr, int i, int i2) {
        if (bArr == null || i < 0 || i > bArr.length || i2 < 0 || i + i2 > bArr.length) {
            return null;
        }
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    public static int getChannelSequence() {
        if (channelSequence > 65535) {
            channelSequence = 0;
        }
        int i = channelSequence;
        channelSequence = i + 1;
        return i;
    }

    public static byte[] byteArrayMerge(byte[] bArr, byte[] bArr2) {
        if (bArr2 == null) {
            return null;
        }
        if (bArr == null) {
            byte[] bArr3 = new byte[bArr2.length];
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
            return bArr3;
        }
        byte[] bArr4 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr4, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr4, bArr.length, bArr2.length);
        return bArr4;
    }

    public void dump(String str, byte[] bArr) {
        TransmissionProfile.dump(str, bArr, 20);
    }
}
