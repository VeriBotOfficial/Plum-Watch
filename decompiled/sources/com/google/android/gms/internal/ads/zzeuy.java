package com.google.android.gms.internal.ads;

import com.autonavi.aps.amapapi.config.Const;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes15.dex */
public final class zzeuy implements zzetq {
    private final String zza;

    public zzeuy(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            ((JSONObject) obj).put(Const.SP_KEY_GSM_UPLOAD_MXSIZE, this.zza);
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed putting Ad ID.", e);
        }
    }
}
