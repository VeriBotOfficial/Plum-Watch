package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes15.dex */
final class zzazb implements Runnable {
    final /* synthetic */ zzazc zza;

    zzazb(zzazc zzazcVar) {
        this.zza = zzazcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z;
        boolean z2;
        List list;
        obj = this.zza.zzc;
        synchronized (obj) {
            zzazc zzazcVar = this.zza;
            z = zzazcVar.zzd;
            if (z) {
                z2 = zzazcVar.zze;
                if (z2) {
                    zzazcVar.zzd = false;
                    com.google.android.gms.ads.internal.util.client.zzo.zze("App went background");
                    list = this.zza.zzf;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        try {
                            ((zzazd) it.next()).zza(false);
                        } catch (Exception e) {
                            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
                        }
                    }
                }
            }
            com.google.android.gms.ads.internal.util.client.zzo.zze("App is still foreground");
        }
    }
}
