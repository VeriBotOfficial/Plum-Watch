package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes15.dex */
final class zzz {
    static int zza(int r5) {
        int[] r1 = {1, 2, 3, 4, 5, 6};
        for (int r2 = 0; r2 < 6; r2++) {
            int r3 = r1[r2];
            int r4 = r3 - 1;
            if (r3 == 0) {
                throw null;
            }
            if (r4 == r5) {
                return r3;
            }
        }
        return 1;
    }
}
