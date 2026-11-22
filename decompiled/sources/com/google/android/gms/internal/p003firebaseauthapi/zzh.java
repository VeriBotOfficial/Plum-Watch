package com.google.android.gms.internal.p003firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes15.dex */
public abstract class zzh {
    public int zza(CharSequence charSequence, int i) {
        int length = charSequence.length();
        zzy.zza(i, length, "index");
        while (i < length) {
            if (zza(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public abstract boolean zza(char c);

    protected zzh() {
    }
}
