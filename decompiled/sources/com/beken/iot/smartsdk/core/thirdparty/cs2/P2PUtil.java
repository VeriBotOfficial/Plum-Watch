package com.beken.iot.smartsdk.core.thirdparty.cs2;

import com.beken.iot.smartsdk.core.log.BKSmartLog;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Random;

/* loaded from: classes13.dex */
public class P2PUtil {
    private static final String TAG = "P2PUtil";
    public static int mSleepCount;
    public static int mSleepErrorCount;
    public static int mSleepWrongCount;

    public static native int getSocketType(int i);

    static {
        System.loadLibrary("bk_iot_lib");
        mSleepCount = 0;
        mSleepWrongCount = 0;
        mSleepErrorCount = 0;
    }

    public static int iPN_StringEnc(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        String str = new String(bArr2, 0, getValidLength(bArr2));
        printD("EncSrc=" + str + ", length=" + str.length() + ", valid length=" + getValidLength(bArr2));
        int[] iArr = new int[17];
        if (i < (bArr2.length * 2) + 3) {
            return -1;
        }
        for (int i2 = 0; i2 < 16; i2++) {
            iArr[i2] = bArr[i2];
        }
        Random random = new Random();
        random.setSeed(System.currentTimeMillis());
        int nextInt = (random.nextInt() & Integer.MAX_VALUE) % 256;
        Arrays.fill(bArr3, (byte) 0);
        bArr3[0] = (byte) (((nextInt & 240) >> 4) + 65);
        bArr3[1] = (byte) ((nextInt & 15) + 97);
        for (int i3 = 0; i3 < bArr2.length; i3++) {
            nextInt = (nextInt ^ iArr[(((nextInt % 23) * nextInt) + i3) % 16]) ^ bArr2[i3];
            int i4 = i3 * 2;
            bArr3[i4 + 2] = (byte) (((nextInt & 240) >> 4) + 65);
            bArr3[i4 + 3] = (byte) ((nextInt & 15) + 97);
        }
        String str2 = new String(bArr3, 0, getValidLength(bArr3));
        printD("EncDest=" + str2 + ", length=" + str2.length() + ", valid length=" + getValidLength(bArr3));
        return 0;
    }

    public static int iPN_StringDnc(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        String str = new String(bArr2, 0, getValidLength(bArr2));
        int[] iArr = new int[17];
        int i2 = 0;
        for (int i3 = 0; i3 < bArr2.length && bArr2[i3] != 0; i3++) {
            i2++;
        }
        printD("DncSrc=" + str + ", count=" + i2 + ", valid length=" + getValidLength(bArr2));
        int i4 = i2 / 2;
        if (i < i4 || i2 % 2 == 1) {
            return -1;
        }
        for (int i5 = 0; i5 < 16; i5++) {
            iArr[i5] = bArr[i5];
        }
        Arrays.fill(bArr3, (byte) 0);
        int i6 = ((bArr2[0] - 65) << 4) + (bArr2[1] - 97);
        int i7 = 0;
        while (i7 < i4 - 1) {
            int i8 = i7 * 2;
            int i9 = (bArr2[i8 + 3] - 97) + ((bArr2[i8 + 2] - 65) << 4);
            byte b = (byte) (i6 ^ (iArr[(((i6 % 23) * i6) + i7) % 16] ^ i9));
            bArr3[i7] = b;
            if (b < 32) {
                return -1;
            }
            i7++;
            i6 = i9;
        }
        printD("DncDest=" + new String(bArr3, 0, getValidLength(bArr3)) + ", count=" + i2 + ", valid length=" + getValidLength(bArr3));
        return 0;
    }

    public static int getValidLength(byte[] bArr) {
        int i = 0;
        if (bArr != null && bArr.length != 0) {
            while (i < bArr.length && bArr[i] != 0) {
                i++;
            }
        }
        return i;
    }

    public static void mSleep(long j) {
        if (j < 0) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            Thread.sleep(j);
        } catch (InterruptedException unused) {
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        if (j == 1) {
            long j2 = currentTimeMillis2 - currentTimeMillis;
            if (j2 > 10 + j) {
                mSleepErrorCount++;
            } else if (j2 > j + 2) {
                mSleepWrongCount++;
            }
            mSleepCount++;
        }
    }

    public static String getTimeString() {
        return new SimpleDateFormat("MM-dd HH:mm:ss.SSS").format(Long.valueOf(System.currentTimeMillis()));
    }

    public static byte[] intToByteArray(int i) {
        return new byte[]{(byte) (i & 255), (byte) ((i >> 8) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 24) & 255)};
    }

    public static byte[] intToByte(int i) {
        byte[] bArr = new byte[1];
        for (int i2 = 0; i2 >= 0; i2--) {
            bArr[i2] = (byte) (i % 255);
            i /= 255;
        }
        return bArr;
    }

    public static boolean ipCheck(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        return str.matches("^(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|[1-9])\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)$");
    }

    private static void printD(String str) {
        BKSmartLog.INSTANCE.d(TAG, str);
    }
}
