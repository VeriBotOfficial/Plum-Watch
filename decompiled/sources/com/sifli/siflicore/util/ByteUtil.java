package com.sifli.siflicore.util;

import androidx.core.view.MotionEventCompat;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.UShort;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes14.dex */
public class ByteUtil {
    public static byte[] intTo4Bytes(int i) {
        return new byte[]{(byte) (i & 255), (byte) ((65280 & i) >> 8), (byte) ((16711680 & i) >> 16), (byte) ((i & (-16777216)) >> 24)};
    }

    public static byte[] uint32ToBytes(long j) {
        return new byte[]{(byte) (255 & j), (byte) ((65280 & j) >> 8), (byte) ((16711680 & j) >> 16), (byte) ((j & (-16777216)) >> 24)};
    }

    public static byte[] intTo2Bytes(int i) {
        return new byte[]{(byte) (i & 255), (byte) ((i & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8)};
    }

    public static byte[] intTo1Bytes(int i) {
        return new byte[]{(byte) (i & 255)};
    }

    public static int parseBytesToInt8(byte[] bArr) {
        if (bArr.length != 1) {
            return 0;
        }
        return Byte.toUnsignedInt(bArr[0]);
    }

    public static int parseBytesToInt16(byte[] bArr) {
        if (bArr.length != 2) {
            return 0;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        return wrap.getShort() & UShort.MAX_VALUE;
    }

    public static long parseBytesToInt32(byte[] bArr) {
        if (bArr.length != 4) {
            return 0L;
        }
        ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        return r4.getInt() & BodyPartID.bodyIdMax;
    }

    public static byte[] mergeArrays(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static byte[] copyFrom(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr2[i3] = bArr[i + i3];
        }
        return bArr2;
    }

    public static byte[] appendCRCWithData(byte[] bArr, byte b) {
        int length = 4 - (bArr.length % 4);
        byte[] bArr2 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr2[i] = b;
        }
        byte[] mergeArrays = mergeArrays(bArr, bArr2);
        return mergeArrays(mergeArrays, intTo4Bytes(CRC32MPEG2.CRC32MPEG2GetValue(mergeArrays)));
    }

    public static String hexSummary(byte[] bArr) {
        if (bArr.length <= 100) {
            return HexUtil.encodeHexStr(bArr);
        }
        return HexUtil.encodeHexStr(copyFrom(bArr, 0, 100)) + "...";
    }

    public static String hexOfData(byte[] bArr) {
        return HexUtil.encodeHexStr(bArr);
    }

    public static byte[] parseHexStrToBytes(String str) {
        return HexUtil.hexStringToBytes(str);
    }

    public static byte[] revertBytes(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr2[i] = bArr[(length - 1) - i];
        }
        return bArr2;
    }
}
