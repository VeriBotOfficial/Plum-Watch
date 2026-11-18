package com.google.android.gms.internal.p003firebaseauthapi;

import java.math.BigInteger;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* JADX INFO: loaded from: classes12.dex */
final class zzmn {
    static final zzmn zza = new zzmn(BigInteger.ONE, BigInteger.ONE, BigInteger.ZERO);
    BigInteger zzb;
    BigInteger zzc;
    BigInteger zzd;

    zzmn(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.zzb = bigInteger;
        this.zzc = bigInteger2;
        this.zzd = bigInteger3;
    }

    final boolean zza() {
        return this.zzd.equals(BigInteger.ZERO);
    }
}
