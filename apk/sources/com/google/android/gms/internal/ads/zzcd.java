package com.google.android.gms.internal.ads;

import com.facebook.imageutils.JfifUtil;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes12.dex */
public final class zzcd {
    public static final zzcd zza = new zzcd(0, 0, 1.0f);
    public final int zzb;
    public final int zzc;
    public final float zzd;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(3, 36);
    }

    public zzcd(int r1, int r2, float f) {
        this.zzb = r1;
        this.zzc = r2;
        this.zzd = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzcd) {
            zzcd zzcdVar = (zzcd) obj;
            if (this.zzb == zzcdVar.zzb && this.zzc == zzcdVar.zzc && this.zzd == zzcdVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.zzb + JfifUtil.MARKER_EOI) * 31) + this.zzc) * 31) + Float.floatToRawIntBits(this.zzd);
    }
}
