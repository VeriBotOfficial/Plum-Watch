package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes15.dex */
final class zzaaf implements zzbl {
    private final zzca zza;

    public zzaaf(zzca zzcaVar) {
        this.zza = zzcaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbl
    public final zzbm zza(Context context, zzk zzkVar, zzn zznVar, zzcc zzccVar, Executor executor, List list, long j) throws zzbz {
        try {
            return ((zzbl) Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(zzca.class).newInstance(this.zza)).zza(context, zzkVar, zznVar, zzccVar, executor, list, 0L);
        } catch (Exception e) {
            if (e instanceof zzbz) {
                throw ((zzbz) e);
            }
            throw new zzbz(e, -9223372036854775807L);
        }
    }
}
