package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes12.dex */
final class zzba {
    public final int zza;

    public zzba(int r1, int r2) {
        this.zza = r2;
    }

    public final int zza() {
        int r0 = this.zza;
        if (r0 == 2) {
            return 10;
        }
        if (r0 == 5) {
            return 11;
        }
        if (r0 == 29) {
            return 12;
        }
        if (r0 == 42) {
            return 16;
        }
        if (r0 != 22) {
            return r0 != 23 ? 0 : 15;
        }
        return 1073741824;
    }
}
