package com.google.android.gms.common.util;

import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes15.dex */
public class Hex {
    private static final char[] zza = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final char[] zzb = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String bytesToStringLowercase(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int r2 = 0;
        for (byte b : bArr) {
            char[] cArr2 = zzb;
            cArr[r2] = cArr2[(b & 255) >>> 4];
            cArr[r2 + 1] = cArr2[b & 15];
            r2 += 2;
        }
        return new String(cArr);
    }

    public static String bytesToStringUppercase(byte[] bArr) {
        return bytesToStringUppercase(bArr, false);
    }

    public static byte[] stringToBytes(String str) throws IllegalArgumentException {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("Hex string has odd number of characters");
        }
        byte[] bArr = new byte[length / 2];
        int r2 = 0;
        while (r2 < length) {
            int r4 = r2 + 2;
            bArr[r2 / 2] = (byte) Integer.parseInt(str.substring(r2, r4), 16);
            r2 = r4;
        }
        return bArr;
    }

    public static String bytesToStringUppercase(byte[] bArr, boolean z) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (int r1 = 0; r1 < length && (!z || r1 != length - 1 || (bArr[r1] & 255) != 0); r1++) {
            char[] cArr = zza;
            sb.append(cArr[(bArr[r1] & TransmissionUnpacked.HD_VAL_MAGIC_HB) >>> 4]);
            sb.append(cArr[bArr[r1] & 15]);
        }
        return sb.toString();
    }
}
