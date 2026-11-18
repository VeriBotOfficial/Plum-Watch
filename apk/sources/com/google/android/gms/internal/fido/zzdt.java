package com.google.android.gms.internal.fido;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fido@@20.1.0 */
/* JADX INFO: loaded from: classes12.dex */
public final class zzdt {
    private final byte zza;
    private final byte zzb;

    zzdt(int r2) {
        this.zza = (byte) (r2 & 224);
        this.zzb = (byte) (r2 & 31);
    }

    public final byte zza() {
        return this.zzb;
    }

    public final byte zzb() {
        return this.zza;
    }

    public final int zzc() {
        return (this.zza >> 5) & 7;
    }
}
