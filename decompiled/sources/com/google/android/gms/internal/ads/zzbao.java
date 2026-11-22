package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes15.dex */
final class zzbao implements zzazd {
    final /* synthetic */ zzbar zza;

    zzbao(zzbar zzbarVar) {
        this.zza = zzbarVar;
    }

    @Override // com.google.android.gms.internal.ads.zzazd
    public final void zza(boolean z) {
        if (z) {
            this.zza.zzl();
        } else {
            zzbar.zzh(this.zza);
        }
    }
}
