package com.sifli.watchfacelibrary;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.UShort;

/* loaded from: classes17.dex */
public class WatchfaceUtil {
    public static String VersionStr = "1.3.8";
    private static final ByteOrder order = ByteOrder.LITTLE_ENDIAN;

    public static byte[] addIntToByteArray(int i, byte[] bArr, int i2) {
        System.arraycopy(ByteBuffer.allocate(4).order(order).putInt(i).array(), 0, bArr, i2, 4);
        return bArr;
    }

    public static byte[] addShortToByteArray(int i, byte[] bArr, int i2) {
        System.arraycopy(ByteBuffer.allocate(2).order(order).putShort((short) i).array(), 0, bArr, i2, 2);
        return bArr;
    }

    public static int getUnsignedShortFromByteArray(byte[] bArr, int i) {
        byte[] bArr2 = new byte[2];
        System.arraycopy(bArr, i, bArr2, 0, 2);
        return ByteBuffer.wrap(bArr2, 0, 2).order(order).getShort() & UShort.MAX_VALUE;
    }

    public static int getShortFromByteArray(byte[] bArr, int i) {
        byte[] bArr2 = new byte[2];
        System.arraycopy(bArr, i, bArr2, 0, 2);
        return ByteBuffer.wrap(bArr2, 0, 2).order(order).getShort();
    }

    public static int getIntFromByteArray(byte[] bArr, int i) {
        byte[] bArr2 = new byte[4];
        System.arraycopy(bArr, i, bArr2, 0, 4);
        return ByteBuffer.wrap(bArr2, 0, 4).order(order).getInt();
    }

    public static long getUnsignedIntFromByteArray(byte[] bArr, int i) {
        byte[] bArr2 = new byte[4];
        System.arraycopy(bArr, i, bArr2, 0, 4);
        return Integer.toUnsignedLong(ByteBuffer.wrap(bArr2, 0, 4).order(order).getInt());
    }
}
