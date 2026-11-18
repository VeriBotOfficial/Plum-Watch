package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes12.dex */
public final class zzwb {
    private final Random zza;
    private final int[] zzb;
    private final int[] zzc;

    public zzwb(int r2) {
        this(0, new Random());
    }

    public final int zza() {
        int[] r0 = this.zzb;
        if (r0.length > 0) {
            return r0[0];
        }
        return -1;
    }

    public final int zzb() {
        int[] r0 = this.zzb;
        int length = r0.length;
        if (length > 0) {
            return r0[length - 1];
        }
        return -1;
    }

    public final int zzc() {
        return this.zzb.length;
    }

    public final int zzd(int r3) {
        int r4 = this.zzc[r3] + 1;
        int[] r0 = this.zzb;
        if (r4 < r0.length) {
            return r0[r4];
        }
        return -1;
    }

    public final int zze(int r2) {
        int r3 = this.zzc[r2] - 1;
        if (r3 >= 0) {
            return this.zzb[r3];
        }
        return -1;
    }

    public final zzwb zzf() {
        return new zzwb(0, new Random(this.zza.nextLong()));
    }

    public final zzwb zzg(int r8, int r9) {
        int[] r10 = new int[r9];
        int[] r0 = new int[r9];
        int r1 = 0;
        int r2 = 0;
        while (r2 < r9) {
            r10[r2] = this.zza.nextInt(this.zzb.length + 1);
            int r4 = r2 + 1;
            int r3 = this.zza.nextInt(r4);
            r0[r2] = r0[r3];
            r0[r3] = r2;
            r2 = r4;
        }
        Arrays.sort(r10);
        int[] r5 = new int[this.zzb.length + r9];
        int r6 = 0;
        int r7 = 0;
        while (true) {
            int[] r11 = this.zzb;
            if (r1 >= r11.length + r9) {
                return new zzwb(r5, new Random(this.zza.nextLong()));
            }
            if (r6 >= r9 || r7 != r10[r6]) {
                int r12 = r7 + 1;
                int r13 = r11[r7];
                r5[r1] = r13;
                if (r13 >= 0) {
                    r5[r1] = r13 + r9;
                }
                r7 = r12;
            } else {
                r5[r1] = r0[r6];
                r6++;
            }
            r1++;
        }
    }

    public final zzwb zzh(int r5, int r6) {
        int[] r7 = new int[this.zzb.length - r6];
        int r0 = 0;
        int r1 = 0;
        while (true) {
            int[] r2 = this.zzb;
            if (r0 >= r2.length) {
                return new zzwb(r7, new Random(this.zza.nextLong()));
            }
            int r3 = r2[r0];
            if (r3 < 0 || r3 >= r6) {
                int r4 = r0 - r1;
                if (r3 >= 0) {
                    r3 -= r6;
                }
                r7[r4] = r3;
            } else {
                r1++;
            }
            r0++;
        }
    }

    private zzwb(int r1, Random random) {
        this(new int[0], random);
    }

    private zzwb(int[] r3, Random random) {
        this.zzb = r3;
        this.zza = random;
        this.zzc = new int[r3.length];
        for (int r4 = 0; r4 < r3.length; r4++) {
            this.zzc[r3[r4]] = r4;
        }
    }
}
