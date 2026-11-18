package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes12.dex */
public class zzhb {
    private int zza;

    public final void zza(int r2) {
        this.zza |= 536870912;
    }

    public void zzb() {
        this.zza = 0;
    }

    public final void zzc(int r1) {
        this.zza = r1;
    }

    protected final boolean zzd(int r2) {
        return (this.zza & r2) == r2;
    }

    public final boolean zze() {
        return zzd(268435456);
    }

    public final boolean zzf() {
        return zzd(4);
    }

    public final boolean zzg() {
        return zzd(1);
    }

    public final boolean zzh() {
        return zzd(536870912);
    }

    public final boolean zzi() {
        return zzd(67108864);
    }
}
