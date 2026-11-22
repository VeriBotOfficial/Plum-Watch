package com.beken.iot.smartsdk.core.pack;

import com.beken.iot.smartsdk.core.log.BKSmartLog;

/* loaded from: classes13.dex */
public class TransmissionProfile {
    public static final int FLAGS_CRC = 1;
    public static final int HD_DEF_MAGIC_CODE = 61653;
    public static final int HD_SIZE_CRC = 1;
    public static final int HD_SIZE_FLAGS = 2;
    public static final int HD_SIZE_LENGTH = 2;
    public static final int HD_SIZE_MAGIC_CODE = 2;
    public static final int HD_SIZE_RESERVED = 3;
    public static final int HD_SIZE_SEQUENCE = 2;
    public static final int HD_SIZE_TIMESTAMP = 4;
    public static final int HEAD_SIZE_TOTAL = 16;

    public static void dump(String str, byte[] bArr) {
        String str2 = "";
        int i = 0;
        while (i < bArr.length) {
            str2 = str2 + String.format("%02X ", Byte.valueOf(bArr[i]));
            i++;
            if (i % 20 == 0) {
                str2 = str2 + "\n";
            }
        }
        printDetail(str, "dump: " + str2);
    }

    public static void dump(String str, byte[] bArr, int i) {
        String str2 = "";
        int i2 = 0;
        while (i2 < Math.min(bArr.length, 20)) {
            str2 = str2 + String.format("%02X ", Byte.valueOf(bArr[i2]));
            i2++;
            if (i2 % 20 == 0) {
                str2 = str2 + "\n";
            }
        }
        printDetail(str, "dump: " + str2);
    }

    public static void dump(String str, String str2, byte[] bArr) {
        printDetail(str, str2 + ": ");
        String str3 = "";
        int i = 0;
        while (i < Math.min(bArr.length, 20)) {
            str3 = str3 + String.format("%02X ", Byte.valueOf(bArr[i]));
            i++;
            if (i % 20 == 0) {
                str3 = str3 + "\n";
            }
        }
        printDetail(str, "dump: " + str3);
    }

    private static void printD(String str, String str2) {
        BKSmartLog.INSTANCE.d(str, str2);
    }

    private static void printDetail(String str, String str2) {
        BKSmartLog.INSTANCE.detail(str, str2);
    }
}
