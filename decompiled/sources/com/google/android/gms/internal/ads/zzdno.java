package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes15.dex */
public final class zzdno extends zzdmy implements zzdds {
    private zzdds zza;

    @Override // com.google.android.gms.internal.ads.zzdds
    public final synchronized void zzdd() {
        zzdds zzddsVar = this.zza;
        if (zzddsVar != null) {
            zzddsVar.zzdd();
        }
    }

    protected final synchronized void zzi(com.google.android.gms.ads.internal.client.zza zzaVar, zzbif zzbifVar, com.google.android.gms.ads.internal.overlay.zzr zzrVar, zzbih zzbihVar, com.google.android.gms.ads.internal.overlay.zzac zzacVar, zzdds zzddsVar) {
        try {
            try {
                super.zzh(zzaVar, zzbifVar, zzrVar, zzbihVar, zzacVar);
                this.zza = zzddsVar;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final synchronized void zzu() {
        zzdds zzddsVar = this.zza;
        if (zzddsVar != null) {
            zzddsVar.zzu();
        }
    }
}
