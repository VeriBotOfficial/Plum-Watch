package com.google.android.gms.internal.ads;

import com.autonavi.aps.amapapi.config.Const;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes15.dex */
public final class zzemc implements zzetq {
    private final String zza;

    public zzemc(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ((zzcuv) obj).zza.putString(Const.SP_KEY_GSM_UPLOAD_MXSIZE, this.zza);
    }
}
