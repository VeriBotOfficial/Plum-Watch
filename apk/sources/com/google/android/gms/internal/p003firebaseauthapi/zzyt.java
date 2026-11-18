package com.google.android.gms.internal.p003firebaseauthapi;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* JADX INFO: loaded from: classes12.dex */
public final class zzyt {
    public static String zza(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            int r3 = b & 255;
            sb.append("0123456789abcdef".charAt(r3 / 16));
            sb.append("0123456789abcdef".charAt(r3 % 16));
        }
        return sb.toString();
    }

    public static byte[] zza(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Expected a string of even length");
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int r2 = 0; r2 < length; r2++) {
            int r3 = r2 * 2;
            int r4 = Character.digit(str.charAt(r3), 16);
            int r5 = Character.digit(str.charAt(r3 + 1), 16);
            if (r4 == -1 || r5 == -1) {
                throw new IllegalArgumentException("input is not hexadecimal");
            }
            bArr[r2] = (byte) ((r4 << 4) + r5);
        }
        return bArr;
    }
}
