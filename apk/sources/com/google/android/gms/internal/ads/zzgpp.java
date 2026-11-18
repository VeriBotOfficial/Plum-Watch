package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes12.dex */
public final class zzgpp {
    public static byte[] zza(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        byte[] bArr2 = new byte[16];
        int r3 = 0;
        while (r3 < 16) {
            int r5 = r3 + 1;
            byte b = bArr[r3];
            byte b2 = (byte) ((b + b) & 254);
            bArr2[r3] = b2;
            if (r3 < 15) {
                bArr2[r3] = (byte) (((bArr[r5] >> 7) & 1) | b2);
            }
            r3 = r5;
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }
}
