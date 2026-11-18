package com.google.android.gms.internal.p003firebaseauthapi;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* JADX INFO: loaded from: classes12.dex */
final class zzai {
    static int zza(int r2, String str) {
        if (r2 >= 0) {
            return r2;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + r2);
    }

    static void zza(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + String.valueOf(obj2));
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + String.valueOf(obj) + "=null");
    }
}
