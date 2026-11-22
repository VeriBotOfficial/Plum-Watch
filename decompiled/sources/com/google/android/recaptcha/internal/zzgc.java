package com.google.android.recaptcha.internal;

import java.math.BigInteger;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes16.dex */
public final class zzgc {
    private static final zzgb zza;
    private final zzgb zzb;
    private long zzc;

    static {
        long pow = (long) Math.pow(2.0d, 32.0d);
        zza = new zzgb(11L, 20919936621L ^ pow, (long) Math.pow(2.0d, 48.0d));
    }

    public zzgc(long j, long j2, zzgb zzgbVar) {
        this.zzb = zzgbVar;
        this.zzc = Math.abs(j);
    }

    public final long zza() {
        zzgb zzgbVar = this.zzb;
        long longValue = (BigInteger.valueOf(zzgbVar.zzb()).multiply(BigInteger.valueOf(this.zzc)).mod(BigInteger.valueOf(zzgbVar.zza())).longValue() + 11) % this.zzb.zza();
        this.zzc = longValue;
        return longValue % 255;
    }
}
