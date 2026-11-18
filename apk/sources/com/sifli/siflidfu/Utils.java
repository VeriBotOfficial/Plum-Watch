package com.sifli.siflidfu;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.UShort;

/* JADX INFO: loaded from: classes12.dex */
public class Utils {
    private static final ByteOrder order = ByteOrder.LITTLE_ENDIAN;

    public static void addShortToByteArray(int r3, byte[] bArr, int r5) {
        System.arraycopy(ByteBuffer.allocate(2).order(order).putShort((short) r3).array(), 0, bArr, r5, 2);
    }

    public static void addIntToByteArray(int r3, byte[] bArr, int r5) {
        System.arraycopy(ByteBuffer.allocate(4).order(order).putInt(r3).array(), 0, bArr, r5, 4);
    }

    public static int getUnsignedShortFromByteArray(byte[] bArr, int r4) {
        byte[] bArr2 = new byte[2];
        System.arraycopy(bArr, r4, bArr2, 0, 2);
        return ByteBuffer.wrap(bArr2, 0, 2).order(order).getShort() & UShort.MAX_VALUE;
    }

    public static int getIntFromByteArray(byte[] bArr, int r4) {
        byte[] bArr2 = new byte[4];
        System.arraycopy(bArr, r4, bArr2, 0, 4);
        return ByteBuffer.wrap(bArr2, 0, 4).order(order).getInt();
    }
}
