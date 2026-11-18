package com.google.android.gms.internal.fido;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fido@@20.1.0 */
/* JADX INFO: loaded from: classes12.dex */
public final class zzcl {
    public static byte[] zza(byte[]... bArr) {
        int r1 = 0;
        int length = 0;
        while (true) {
            if (r1 >= bArr.length) {
                break;
            }
            length += bArr[r1].length;
            r1++;
        }
        byte[] bArr2 = new byte[length];
        int r4 = 0;
        for (byte[] bArr3 : bArr) {
            int length2 = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, r4, length2);
            r4 += length2;
        }
        return bArr2;
    }
}
