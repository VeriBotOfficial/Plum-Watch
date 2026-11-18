package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes12.dex */
public final class zzguo {
    public static final void zza(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int r6) {
        if (r6 < 0 || byteBuffer2.remaining() < r6 || byteBuffer3.remaining() < r6 || byteBuffer.remaining() < r6) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int r0 = 0; r0 < r6; r0++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public static byte[] zzb(byte[]... bArr) throws GeneralSecurityException {
        int r1 = 0;
        int r2 = 0;
        while (true) {
            if (r1 >= bArr.length) {
                byte[] bArr2 = new byte[r2];
                int r4 = 0;
                for (byte[] bArr3 : bArr) {
                    int length = bArr3.length;
                    System.arraycopy(bArr3, 0, bArr2, r4, length);
                    r4 += length;
                }
                return bArr2;
            }
            int length2 = bArr[r1].length;
            if (r2 > Integer.MAX_VALUE - length2) {
                throw new GeneralSecurityException("exceeded size limit");
            }
            r2 += length2;
            r1++;
        }
    }

    public static final byte[] zzc(byte[] bArr, int r4, byte[] bArr2, int r6, int r7) {
        if (bArr.length - 16 < r4) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr3 = new byte[16];
        for (int r0 = 0; r0 < 16; r0++) {
            bArr3[r0] = (byte) (bArr[r0 + r4] ^ bArr2[r0]);
        }
        return bArr3;
    }
}
