package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes15.dex */
final class zzqq implements zzpj {
    final /* synthetic */ zzqs zza;

    /* synthetic */ zzqq(zzqs zzqsVar, zzqr zzqrVar) {
        this.zza = zzqsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpj
    public final void zza(Exception exc) {
        zzpe zzpeVar;
        zzdo.zzd("MediaCodecAudioRenderer", "Audio sink error", exc);
        zzpeVar = this.zza.zzc;
        zzpeVar.zzb(exc);
    }
}
