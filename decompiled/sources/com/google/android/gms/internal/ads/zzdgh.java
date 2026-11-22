package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.internal.ads.zzbbq;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes15.dex */
public final class zzdgh implements zzcvt, zzdcx {
    private final zzbye zza;
    private final Context zzb;
    private final zzbyi zzc;
    private final View zzd;
    private String zze;
    private final zzbbq.zza.EnumC0570zza zzf;

    public zzdgh(zzbye zzbyeVar, Context context, zzbyi zzbyiVar, View view, zzbbq.zza.EnumC0570zza enumC0570zza) {
        this.zza = zzbyeVar;
        this.zzb = context;
        this.zzc = zzbyiVar;
        this.zzd = view;
        this.zzf = enumC0570zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zza() {
        this.zza.zzb(false);
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zzc() {
        View view = this.zzd;
        if (view != null && this.zze != null) {
            this.zzc.zzo(view.getContext(), this.zze);
        }
        this.zza.zzb(true);
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    @ParametersAreNonnullByDefault
    public final void zzdq(zzbvw zzbvwVar, String str, String str2) {
        if (this.zzc.zzp(this.zzb)) {
            try {
                zzbyi zzbyiVar = this.zzc;
                Context context = this.zzb;
                zzbyiVar.zzl(context, zzbyiVar.zza(context), this.zza.zza(), zzbvwVar.zzc(), zzbvwVar.zzb());
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Remote Exception to get reward item.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcx
    public final void zzk() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcx
    public final void zzl() {
        if (this.zzf == zzbbq.zza.EnumC0570zza.APP_OPEN) {
            return;
        }
        String zzc = this.zzc.zzc(this.zzb);
        this.zze = zzc;
        this.zze = String.valueOf(zzc).concat(this.zzf == zzbbq.zza.EnumC0570zza.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial");
    }
}
