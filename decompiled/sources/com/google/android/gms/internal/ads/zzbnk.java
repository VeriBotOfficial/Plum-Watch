package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes15.dex */
final class zzbnk implements zzcaf {
    final /* synthetic */ zzbnm zza;

    zzbnk(zzbnm zzbnmVar) {
        this.zza = zzbnmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzbnr zzbnrVar;
        com.google.android.gms.ads.internal.util.zze.zza("Releasing engine reference.");
        zzbnrVar = this.zza.zzb;
        zzbnrVar.zzd();
    }
}
