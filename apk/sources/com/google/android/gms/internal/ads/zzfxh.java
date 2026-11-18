package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes12.dex */
public abstract class zzfxh {
    zzfxh() {
    }

    public abstract zzfxh zzb(Object obj);

    static int zze(int r1, int r2) {
        if (r2 < 0) {
            throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
        }
        if (r2 <= r1) {
            return r1;
        }
        int r3 = r1 + (r1 >> 1) + 1;
        if (r3 < r2) {
            int r4 = Integer.highestOneBit(r2 - 1);
            r3 = r4 + r4;
        }
        if (r3 < 0) {
            return Integer.MAX_VALUE;
        }
        return r3;
    }
}
