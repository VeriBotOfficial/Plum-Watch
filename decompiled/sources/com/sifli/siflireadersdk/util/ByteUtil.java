package com.sifli.siflireadersdk.util;

import androidx.core.view.MotionEventCompat;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.UShort;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes17.dex */
public class ByteUtil {
    public static byte[] intTo4Bytes(int i) {
        return new byte[]{(byte) (i & 255), (byte) ((65280 & i) >> 8), (byte) ((16711680 & i) >> 16), (byte) ((i & (-16777216)) >> 24)};
    }

    public static byte[] intTo2Bytes(int i) {
        return new byte[]{(byte) (i & 255), (byte) ((i & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8)};
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
}
