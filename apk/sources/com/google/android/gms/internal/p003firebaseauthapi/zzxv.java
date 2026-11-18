package com.google.android.gms.internal.p003firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* JADX INFO: loaded from: classes12.dex */
public final class zzxv {
    public static final void zza(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int r6) {
        if (r6 < 0 || byteBuffer2.remaining() < r6 || byteBuffer3.remaining() < r6 || byteBuffer.remaining() < r6) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int r0 = 0; r0 < r6; r0++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public static byte[] zza(byte[]... bArr) throws GeneralSecurityException {
        int length = 0;
        for (byte[] bArr2 : bArr) {
            if (length > Integer.MAX_VALUE - bArr2.length) {
                throw new GeneralSecurityException("exceeded size limit");
            }
            length += bArr2.length;
        }
        byte[] bArr3 = new byte[length];
        int length2 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
            length2 += bArr4.length;
        }
        return bArr3;
    }

    public static final byte[] zza(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            throw new IllegalArgumentException("The lengths of x and y should match.");
        }
        return zza(bArr, 0, bArr2, 0, bArr.length);
    }

    public static final byte[] zza(byte[] bArr, int r4, byte[] bArr2, int r6, int r7) {
        if (r7 < 0 || bArr.length - r7 < r4 || bArr2.length - r7 < 0) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr3 = new byte[r7];
        for (int r0 = 0; r0 < r7; r0++) {
            bArr3[r0] = (byte) (bArr[r0 + r4] ^ bArr2[r0]);
        }
        return bArr3;
    }
}
