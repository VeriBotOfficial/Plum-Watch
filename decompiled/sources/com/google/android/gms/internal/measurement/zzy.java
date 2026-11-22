package com.google.android.gms.internal.measurement;

import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes15.dex */
public final class zzy extends zzal {
    @Override // com.google.android.gms.internal.measurement.zzal
    public final zzaq zza(zzh zzhVar, List<zzaq> list) {
        return zzc;
    }

    public zzy() {
        super("internal.platform");
        this.zzb.put(MobileAdsBridge.versionMethodName, new zzab(this, MobileAdsBridge.versionMethodName));
    }
}
