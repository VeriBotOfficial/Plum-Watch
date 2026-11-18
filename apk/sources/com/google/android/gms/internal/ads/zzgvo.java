package com.google.android.gms.internal.ads;

import android.gov.nist.core.Separators;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes12.dex */
public final class zzgvo {
    private final byte[] zza;

    private zzgvo(byte[] bArr, int r3, int r4) {
        byte[] bArr2 = new byte[r4];
        this.zza = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, r4);
    }

    public static zzgvo zzb(byte[] bArr) {
        if (bArr != null) {
            return new zzgvo(bArr, 0, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgvo) {
            return Arrays.equals(((zzgvo) obj).zza, this.zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        byte[] bArr = this.zza;
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b : bArr) {
            sb.append("0123456789abcdef".charAt((b & 255) >> 4));
            sb.append("0123456789abcdef".charAt(b & 15));
        }
        return "Bytes(" + sb.toString() + Separators.RPAREN;
    }

    public final int zza() {
        return this.zza.length;
    }

    public final byte[] zzc() {
        byte[] bArr = this.zza;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }
}
