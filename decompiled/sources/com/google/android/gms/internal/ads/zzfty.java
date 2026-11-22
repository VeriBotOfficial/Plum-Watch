package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes15.dex */
public abstract class zzfty implements zzfuo {
    protected zzfty() {
    }

    public static zzfty zzc(char c) {
        return new zzftv(c);
    }

    @Override // com.google.android.gms.internal.ads.zzfuo
    @Deprecated
    public final /* synthetic */ boolean zza(Object obj) {
        return zzb(((Character) obj).charValue());
    }

    public abstract boolean zzb(char c);
}
