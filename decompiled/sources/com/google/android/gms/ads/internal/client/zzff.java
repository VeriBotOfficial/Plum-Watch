package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes13.dex */
final class zzff implements Runnable {
    final /* synthetic */ zzfg zza;

    zzff(zzfg zzfgVar) {
        this.zza = zzfgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbl zzblVar;
        zzbl zzblVar2;
        zzfi zzfiVar = this.zza.zza;
        zzblVar = zzfiVar.zza;
        if (zzblVar != null) {
            try {
                zzblVar2 = zzfiVar.zza;
                zzblVar2.zze(1);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
