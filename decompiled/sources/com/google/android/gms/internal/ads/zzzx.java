package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.media3.common.MimeTypes;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes15.dex */
final class zzzx {
    final /* synthetic */ zzaah zza;
    private zzab zzb;

    /* synthetic */ zzzx(zzaah zzaahVar, zzaag zzaagVar) {
        this.zza = zzaahVar;
    }

    public final void zza(zzcd zzcdVar) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        zzz zzzVar = new zzz();
        zzzVar.zzaf(zzcdVar.zzb);
        zzzVar.zzK(zzcdVar.zzc);
        zzzVar.zzaa(MimeTypes.VIDEO_RAW);
        this.zzb = zzzVar.zzag();
        copyOnWriteArraySet = this.zza.zzj;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((zzaac) it.next()).zzA(this.zza, zzcdVar);
        }
    }

    public final void zzb(long j, long j2, boolean z) {
        zzaai zzaaiVar;
        zzaai zzaaiVar2;
        zzcx zzcxVar;
        Pair pair;
        CopyOnWriteArraySet copyOnWriteArraySet;
        if (z) {
            zzaah zzaahVar = this.zza;
            pair = zzaahVar.zzm;
            if (pair != null) {
                copyOnWriteArraySet = zzaahVar.zzj;
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    ((zzaac) it.next()).zzy(this.zza);
                }
            }
        }
        zzaaiVar = this.zza.zzk;
        if (zzaaiVar != null) {
            zzab zzabVar = this.zzb;
            if (zzabVar == null) {
                zzabVar = new zzz().zzag();
            }
            zzab zzabVar2 = zzabVar;
            zzaah zzaahVar2 = this.zza;
            zzaaiVar2 = zzaahVar2.zzk;
            zzcxVar = zzaahVar2.zzi;
            zzaaiVar2.zza(j2, zzcxVar.zzc(), zzabVar2, null);
        }
        zzbm zzbmVar = null;
        zzcw.zzb(null);
        zzbmVar.zza();
        throw null;
    }
}
