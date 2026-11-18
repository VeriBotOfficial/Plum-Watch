package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.util.DisplayMetrics;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes12.dex */
public final class zzawg {
    public static final /* synthetic */ int zza = 0;
    private static final char[] zzb = "0123456789abcdef".toCharArray();

    public static long zza(double d, int r2, DisplayMetrics displayMetrics) {
        return Math.round(d / ((double) displayMetrics.density));
    }

    public static String zzb(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        for (int r1 = 0; r1 < bArr.length; r1++) {
            byte b = bArr[r1];
            char[] cArr2 = zzb;
            int r5 = r1 + r1;
            cArr[r5] = cArr2[(b & 255) >>> 4];
            cArr[r5 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public static boolean zzc() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean zzd(String str) {
        return str == null || str.isEmpty();
    }

    public static boolean zze(DisplayMetrics displayMetrics) {
        return (displayMetrics == null || displayMetrics.density == 0.0f) ? false : true;
    }

    public static byte[] zzf(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("String must be of even-length");
        }
        byte[] bArr = new byte[length / 2];
        for (int r2 = 0; r2 < length; r2 += 2) {
            bArr[r2 / 2] = (byte) ((Character.digit(str.charAt(r2), 16) << 4) + Character.digit(str.charAt(r2 + 1), 16));
        }
        return bArr;
    }
}
