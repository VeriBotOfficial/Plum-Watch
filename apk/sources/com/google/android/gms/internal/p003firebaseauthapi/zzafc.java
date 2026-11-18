package com.google.android.gms.internal.p003firebaseauthapi;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* JADX INFO: loaded from: classes12.dex */
public final class zzafc {
    public static String zza(String str) {
        try {
            Object objInvoke = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class).invoke(null, str);
            if (objInvoke != null && String.class.isAssignableFrom(objInvoke.getClass())) {
                return (String) objInvoke;
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
