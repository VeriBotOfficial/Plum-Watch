package com.google.android.recaptcha.internal;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes16.dex */
final class zzmg {
    public static final /* synthetic */ int zza = 0;
    private static final zzmg zzb = new zzmg();
    private final ConcurrentMap zzd = new ConcurrentHashMap();
    private final zzml zzc = new zzlp();

    private zzmg() {
    }

    public static zzmg zza() {
        return zzb;
    }

    public final zzmk zzb(Class cls) {
        zzla.zzc(cls, "messageType");
        zzmk zzmkVar = (zzmk) this.zzd.get(cls);
        if (zzmkVar != null) {
            return zzmkVar;
        }
        zzmk zza2 = this.zzc.zza(cls);
        zzla.zzc(cls, "messageType");
        zzmk zzmkVar2 = (zzmk) this.zzd.putIfAbsent(cls, zza2);
        return zzmkVar2 == null ? zza2 : zzmkVar2;
    }
}
