package com.google.android.gms.internal.ads;

import com.alipay.sdk.m.b0.a;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes15.dex */
final class zzgjc extends ThreadLocal {
    zzgjc() {
    }

    protected static final Cipher zza() {
        try {
            return (Cipher) zzguw.zza.zza(a.f);
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        return zza();
    }
}
