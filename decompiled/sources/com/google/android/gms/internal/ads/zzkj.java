package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes15.dex */
public final class zzkj {
    public final long zza;
    public final float zzb;
    public final long zzc;

    /* synthetic */ zzkj(zzkh zzkhVar, zzki zzkiVar) {
        long j;
        float f;
        long j2;
        j = zzkhVar.zza;
        this.zza = j;
        f = zzkhVar.zzb;
        this.zzb = f;
        j2 = zzkhVar.zzc;
        this.zzc = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzkj)) {
            return false;
        }
        zzkj zzkjVar = (zzkj) obj;
        return this.zza == zzkjVar.zza && this.zzb == zzkjVar.zzb && this.zzc == zzkjVar.zzc;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zza), Float.valueOf(this.zzb), Long.valueOf(this.zzc)});
    }

    public final zzkh zza() {
        return new zzkh(this, null);
    }
}
