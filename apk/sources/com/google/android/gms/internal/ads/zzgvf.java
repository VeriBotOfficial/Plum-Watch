package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes12.dex */
public final class zzgvf {
    public static byte[] zza(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Expected a string of even length");
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int r2 = 0; r2 < length; r2++) {
            int r3 = r2 + r2;
            int r4 = Character.digit(str.charAt(r3), 16);
            int r5 = Character.digit(str.charAt(r3 + 1), 16);
            if (r4 == -1 || r5 == -1) {
                throw new IllegalArgumentException("input is not hexadecimal");
            }
            bArr[r2] = (byte) ((r4 * 16) + r5);
        }
        return bArr;
    }
}
