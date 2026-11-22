package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes15.dex */
public final class zzdjh {
    private final zzdrw zza;

    zzdjh(zzdrw zzdrwVar) {
        this.zza = zzdrwVar;
    }

    public final void zza(View view, zzfbo zzfboVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzmK)).booleanValue() || view == null) {
            return;
        }
        String str = true != com.google.android.gms.ads.internal.util.zzac.zza(view) ? "0" : "1";
        zzdrv zza = this.zza.zza();
        zza.zzb("action", "hcp");
        zza.zzb("hcp", str);
        zza.zzc(zzfboVar);
        zza.zzg();
    }
}
