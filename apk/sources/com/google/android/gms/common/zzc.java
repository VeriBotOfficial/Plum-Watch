package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes15.dex */
public final class zzc {
    static int zza(int r6) {
        int[] r1 = {1, 2, 3};
        for (int r3 = 0; r3 < 3; r3++) {
            int r4 = r1[r3];
            int r5 = r4 - 1;
            if (r4 == 0) {
                throw null;
            }
            if (r5 == r6) {
                return r4;
            }
        }
        return 1;
    }
}
