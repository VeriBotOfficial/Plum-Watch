package com.google.android.gms.internal.p003firebaseauthapi;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* JADX INFO: loaded from: classes12.dex */
public class zzam<E> {
    static int zza(int r1, int r2) {
        if (r2 < 0) {
            throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
        }
        if (r2 <= r1) {
            return r1;
        }
        int r3 = r1 + (r1 >> 1) + 1;
        if (r3 < r2) {
            r3 = Integer.highestOneBit(r2 - 1) << 1;
        }
        if (r3 < 0) {
            return Integer.MAX_VALUE;
        }
        return r3;
    }

    zzam() {
    }
}
