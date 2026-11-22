package com.google.android.gms.internal.p003firebaseauthapi;

import com.alipay.sdk.m.b0.a;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes15.dex */
final class zzgn extends ThreadLocal<Cipher> {
    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ Cipher initialValue() {
        return zza();
    }

    private static Cipher zza() {
        try {
            return zzyf.zza.zza(a.f);
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    zzgn() {
    }
}
