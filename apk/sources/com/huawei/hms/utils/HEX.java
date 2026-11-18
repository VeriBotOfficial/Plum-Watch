package com.huawei.hms.utils;

import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;

/* JADX INFO: loaded from: classes11.dex */
public final class HEX {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f10762a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    private HEX() {
    }

    private static char[] a(byte[] bArr, char[] cArr) {
        char[] cArr2 = new char[bArr.length << 1];
        int r3 = 0;
        for (byte b2 : bArr) {
            int r4 = r3 + 1;
            cArr2[r3] = cArr[(b2 & TransmissionUnpacked.HD_VAL_MAGIC_HB) >>> 4];
            r3 += 2;
            cArr2[r4] = cArr[b2 & 15];
        }
        return cArr2;
    }

    public static char[] encodeHex(byte[] bArr) {
        return encodeHex(bArr, false);
    }

    public static String encodeHexString(byte[] bArr, boolean z) {
        return new String(encodeHex(bArr, z));
    }

    public static char[] encodeHex(byte[] bArr, boolean z) {
        return a(bArr, z ? b : f10762a);
    }
}
