package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes12.dex */
public final class zzads {
    public final int zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    public zzads(int r1, byte[] bArr, int r3, int r4) {
        this.zza = r1;
        this.zzb = bArr;
        this.zzc = r3;
        this.zzd = r4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzads zzadsVar = (zzads) obj;
            if (this.zza == zzadsVar.zza && this.zzc == zzadsVar.zzc && this.zzd == zzadsVar.zzd && Arrays.equals(this.zzb, zzadsVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.zza * 31) + Arrays.hashCode(this.zzb)) * 31) + this.zzc) * 31) + this.zzd;
    }
}
