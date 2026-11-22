package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes15.dex */
final class zzgyp {
    zzgyp() {
    }

    public static final List zza(Object obj, long j) {
        zzgyd zzgydVar = (zzgyd) zzhao.zzh(obj, j);
        if (zzgydVar.zzc()) {
            return zzgydVar;
        }
        int size = zzgydVar.size();
        zzgyd zzf = zzgydVar.zzf(size == 0 ? 10 : size + size);
        zzhao.zzv(obj, j, zzf);
        return zzf;
    }
}
