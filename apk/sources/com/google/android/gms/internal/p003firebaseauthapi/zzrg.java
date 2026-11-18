package com.google.android.gms.internal.p003firebaseauthapi;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* JADX INFO: loaded from: classes12.dex */
public final class zzrg {
    public static byte[] zza(byte[] bArr) {
        if (bArr.length >= 16) {
            throw new IllegalArgumentException("x must be smaller than a block.");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 16);
        bArrCopyOf[bArr.length] = -128;
        return bArrCopyOf;
    }

    public static byte[] zzb(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        byte[] bArr2 = new byte[16];
        for (int r3 = 0; r3 < 16; r3++) {
            byte b = (byte) ((bArr[r3] << 1) & 254);
            bArr2[r3] = b;
            if (r3 < 15) {
                bArr2[r3] = (byte) (((byte) ((bArr[r3 + 1] >> 7) & 1)) | b);
            }
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }
}
