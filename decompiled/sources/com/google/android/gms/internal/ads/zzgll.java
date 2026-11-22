package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes15.dex */
public final class zzgll extends zzgek {
    private final zzgni zza;

    public zzgll(zzgni zzgniVar) {
        this.zza = zzgniVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgll)) {
            return false;
        }
        zzgni zzgniVar = ((zzgll) obj).zza;
        return this.zza.zzc().zzg().equals(zzgniVar.zzc().zzg()) && this.zza.zzc().zzi().equals(zzgniVar.zzc().zzi()) && this.zza.zzc().zzh().equals(zzgniVar.zzc().zzh());
    }

    public final int hashCode() {
        zzgni zzgniVar = this.zza;
        return Objects.hash(zzgniVar.zzc(), zzgniVar.zzd());
    }

    public final String toString() {
        String zzi = this.zza.zzc().zzi();
        int ordinal = this.zza.zzc().zzg().ordinal();
        return String.format("(typeUrl=%s, outputPrefixType=%s)", zzi, ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK");
    }

    @Override // com.google.android.gms.internal.ads.zzgek
    public final boolean zza() {
        return this.zza.zzc().zzg() != zzgtp.RAW;
    }

    public final zzgni zzb() {
        return this.zza;
    }
}
