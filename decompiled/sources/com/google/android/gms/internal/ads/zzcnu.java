package com.google.android.gms.internal.ads;

import com.anythink.expressad.f.a.b;
import com.umeng.analytics.pro.ak;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes15.dex */
public final class zzcnu {
    private final zzdrw zza;
    private final zzfca zzb;

    zzcnu(zzdrw zzdrwVar, zzfca zzfcaVar) {
        this.zza = zzdrwVar;
        this.zzb = zzfcaVar;
    }

    public final void zza(long j, int i) {
        zzdrv zza = this.zza.zza();
        zza.zzd(this.zzb.zzb.zzb);
        zza.zzb("action", "ad_closed");
        zza.zzb("show_time", String.valueOf(j));
        zza.zzb("ad_format", "app_open_ad");
        int i2 = i - 1;
        zza.zzb("acr", i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? ak.aG : "ac" : "cb" : b.h : "bb" : "h");
        zza.zzg();
    }
}
