package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes12.dex */
final class zzgas {
    private static final byte[] zza;

    static {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int r2 = 0; r2 < 10; r2++) {
            bArr[r2 + 48] = (byte) r2;
        }
        for (int r1 = 0; r1 < 26; r1++) {
            byte b = (byte) (r1 + 10);
            bArr[r1 + 65] = b;
            bArr[r1 + 97] = b;
        }
        zza = bArr;
    }

    static int zza(char c) {
        if (c < 128) {
            return zza[c];
        }
        return -1;
    }
}
