package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes15.dex */
public final class zzdgr implements zzher {
    private final zzhfj zza;

    public zzdgr(zzhfj zzhfjVar) {
        this.zza = zzhfjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = ((zzdgo) this.zza).zza().zze() != null ? Collections.singleton("banner") : Collections.emptySet();
        zzhez.zzb(singleton);
        return singleton;
    }
}
