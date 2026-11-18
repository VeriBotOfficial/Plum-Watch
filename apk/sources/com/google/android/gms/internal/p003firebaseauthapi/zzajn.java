package com.google.android.gms.internal.p003firebaseauthapi;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* JADX INFO: loaded from: classes12.dex */
final class zzajn {
    private final Object zza;
    private final int zzb;

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }

    zzajn(Object obj, int r2) {
        this.zza = obj;
        this.zzb = r2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzajn)) {
            return false;
        }
        zzajn zzajnVar = (zzajn) obj;
        return this.zza == zzajnVar.zza && this.zzb == zzajnVar.zzb;
    }
}
