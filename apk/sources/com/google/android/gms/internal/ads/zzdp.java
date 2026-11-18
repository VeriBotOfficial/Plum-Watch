package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes12.dex */
public final class zzdp {
    private int zza;
    private long[] zzb;

    public zzdp() {
        throw null;
    }

    public zzdp(int r1) {
        this.zzb = new long[r1];
    }

    public final int zza() {
        return this.zza;
    }

    public final long zzb(int r5) {
        if (r5 >= 0 && r5 < this.zza) {
            return this.zzb[r5];
        }
        throw new IndexOutOfBoundsException("Invalid index " + r5 + ", size is " + this.zza);
    }

    public final void zzc(long j) {
        int r0 = this.zza;
        long[] jArr = this.zzb;
        if (r0 == jArr.length) {
            this.zzb = Arrays.copyOf(jArr, r0 + r0);
        }
        long[] jArr2 = this.zzb;
        int r1 = this.zza;
        this.zza = r1 + 1;
        jArr2[r1] = j;
    }

    public final void zzd(long[] jArr) {
        int r0 = this.zza;
        int length = jArr.length;
        int r1 = r0 + length;
        long[] jArr2 = this.zzb;
        int length2 = jArr2.length;
        if (r1 > length2) {
            this.zzb = Arrays.copyOf(jArr2, Math.max(length2 + length2, r1));
        }
        System.arraycopy(jArr, 0, this.zzb, this.zza, length);
        this.zza = r1;
    }
}
