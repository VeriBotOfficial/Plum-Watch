package com.google.android.gms.internal.auth;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* JADX INFO: loaded from: classes12.dex */
abstract class zzhk {
    zzhk() {
    }

    abstract int zza(int r1, byte[] bArr, int r3, int r4);

    final boolean zzb(byte[] bArr, int r3, int r4) {
        return zza(0, bArr, r3, r4) == 0;
    }
}
