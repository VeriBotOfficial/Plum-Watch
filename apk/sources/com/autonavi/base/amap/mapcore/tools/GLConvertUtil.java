package com.autonavi.base.amap.mapcore.tools;

import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes16.dex */
public class GLConvertUtil {
    public static double convertDouble(byte[] bArr, int r7) {
        long j = 0;
        for (int r2 = 0; r2 < 8; r2++) {
            j += ((long) (bArr[r2 + r7] & 255)) << (r2 * 8);
        }
        return Double.longBitsToDouble(j);
    }

    public static byte[] get1BString(String str) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bytes = str.getBytes("UTF-8");
            byteArrayOutputStream.write(new byte[]{(byte) bytes.length});
            byteArrayOutputStream.write(bytes);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
            return new byte[1];
        }
    }

    public static int getInt(byte[] bArr, int r4) {
        int r0 = bArr[r4 + 3] & 255;
        int r1 = bArr[r4 + 2] & 255;
        int r2 = bArr[r4 + 1] & 255;
        return (r0 << 24) + (r1 << 16) + (r2 << 8) + (bArr[r4] & 255);
    }

    public static int getInt2(byte[] bArr, int r4) {
        int r0 = bArr[r4] & 255;
        int r1 = bArr[r4 + 1] & 255;
        int r2 = bArr[r4 + 2] & 255;
        return (r0 << 24) + (r1 << 16) + (r2 << 8) + (bArr[r4 + 3] & 255);
    }

    public static long getLong(byte[] bArr, int r18) {
        return (((long) (bArr[r18 + 7] & 255)) << 56) + (((long) (bArr[r18 + 6] & 255)) << 48) + (((long) (bArr[r18 + 5] & 255)) << 40) + (((long) (bArr[r18 + 4] & 255)) << 32) + (((long) (bArr[r18 + 3] & 255)) << 24) + (((long) (bArr[r18 + 2] & 255)) << 16) + (((long) (bArr[r18 + 1] & 255)) << 8) + ((long) (bArr[r18] & 255));
    }

    public static short getShort(byte[] bArr, int r2) {
        int r0 = bArr[r2 + 1] & 255;
        return (short) ((r0 << 8) + (bArr[r2] & 255));
    }

    public static short getShort2(byte[] bArr, int r2) {
        int r0 = bArr[r2] & 255;
        return (short) ((r0 << 8) + (bArr[r2 + 1] & 255));
    }

    public static String getString(byte[] bArr, int r3, int r4) {
        try {
            return new String(bArr, r3, r4, "UTF-8");
        } catch (Exception unused) {
            return "";
        }
    }

    public static byte[] getSubBytes(byte[] bArr, int r3, int r4) {
        byte[] bArr2 = new byte[r4];
        System.arraycopy(bArr, r3, bArr2, 0, r4);
        return bArr2;
    }

    public static int getUShort(byte[] bArr, int r2) {
        int r0 = bArr[r2 + 1] & 255;
        return (r0 << 8) + (bArr[r2] & 255);
    }

    public static void moveArray(byte[] bArr, int r3, byte[] bArr2, int r5, int r6) {
        byte[] bArr3 = new byte[r6];
        System.arraycopy(bArr, r3, bArr3, 0, r6);
        System.arraycopy(bArr3, 0, bArr2, r5, r6);
    }

    public static void writeInt(byte[] bArr, int r3, int r4) {
        System.arraycopy(convertInt(r4), 0, bArr, r3, 4);
    }

    public static void writeShort(byte[] bArr, int r3, short s) {
        System.arraycopy(convertShort(s), 0, bArr, r3, 2);
    }

    public static byte[] convertShort(int r3) {
        return new byte[]{(byte) (r3 & 255), (byte) ((r3 >> 8) & 255)};
    }

    public static byte[] convertInt(int r5) {
        return new byte[]{(byte) (r5 & 255), (byte) ((r5 >> 8) & 255), (byte) ((r5 >> 16) & 255), (byte) ((r5 >> 24) & 255)};
    }
}
