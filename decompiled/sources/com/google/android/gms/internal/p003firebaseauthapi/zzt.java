package com.google.android.gms.internal.p003firebaseauthapi;

import javax.annotation.CheckForNull;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes15.dex */
final class zzt {
    private static final zzu zza = new zzw();

    static zzn zza(String str) {
        zzy.zza(str);
        return zza.zza(str);
    }

    @CheckForNull
    static String zzb(@CheckForNull String str) {
        if (zzd(str)) {
            return null;
        }
        return str;
    }

    static String zzc(@CheckForNull String str) {
        return str == null ? "" : str;
    }

    static boolean zzd(@CheckForNull String str) {
        return str == null || str.isEmpty();
    }
}
