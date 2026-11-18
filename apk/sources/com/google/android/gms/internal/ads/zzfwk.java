package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes12.dex */
final class zzfwk {
    static int zza(int r2, String str) {
        if (r2 >= 0) {
            return r2;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + r2);
    }

    static void zzb(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(String.valueOf(obj2))));
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj.toString() + "=null");
    }
}
