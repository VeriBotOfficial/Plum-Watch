package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgax;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes15.dex */
final class zzgcx extends zzgax.zzi implements Runnable {
    private final Runnable zza;

    @Override // com.google.android.gms.internal.ads.zzgax
    protected final String zza() {
        return "task=[" + this.zza.toString() + "]";
    }

    public zzgcx(Runnable runnable) {
        runnable.getClass();
        this.zza = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zza.run();
        } catch (Throwable th) {
            zzd(th);
            throw th;
        }
    }
}
