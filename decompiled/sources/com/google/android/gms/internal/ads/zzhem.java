package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes15.dex */
public class zzhem {
    final LinkedHashMap zza;

    zzhem(int i) {
        this.zza = zzheo.zzb(i);
    }

    final zzhem zza(Object obj, zzhfa zzhfaVar) {
        zzhez.zza(obj, "key");
        zzhez.zza(zzhfaVar, "provider");
        this.zza.put(obj, zzhfaVar);
        return this;
    }
}
