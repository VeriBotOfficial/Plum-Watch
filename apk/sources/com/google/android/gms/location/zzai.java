package com.google.android.gms.location;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* JADX INFO: loaded from: classes12.dex */
public final class zzai {
    public static String zza(int r1) {
        if (r1 == 0) {
            return "THROTTLE_BACKGROUND";
        }
        if (r1 == 1) {
            return "THROTTLE_ALWAYS";
        }
        if (r1 == 2) {
            return "THROTTLE_NEVER";
        }
        throw new IllegalArgumentException();
    }
}
