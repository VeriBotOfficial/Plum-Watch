package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes12.dex */
public final class zzcu {
    private static final String zzd = Integer.toString(0, 36);
    private static final String zze = Integer.toString(1, 36);
    private static final String zzf = Integer.toString(2, 36);
    public final int zza;
    public final int zzb;
    public final int zzc;

    public zzcu(int r1, int r2, int r3) {
        this.zza = r1;
        this.zzb = r2;
        this.zzc = r3;
    }

    public final Bundle zza() {
        Bundle bundle = new Bundle();
        bundle.putInt(zzd, this.zza);
        bundle.putInt(zze, this.zzb);
        bundle.putInt(zzf, this.zzc);
        return bundle;
    }
}
