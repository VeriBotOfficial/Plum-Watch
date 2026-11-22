package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes15.dex */
public final class zzgmy {
    private final Map zza;
    private final Map zzb;

    private zzgmy() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    public final zzgmy zza(zzgmx zzgmxVar) throws GeneralSecurityException {
        if (zzgmxVar == null) {
            throw new NullPointerException("primitive constructor must be non-null");
        }
        zzgmz zzgmzVar = new zzgmz(zzgmxVar.zzc(), zzgmxVar.zzd(), null);
        if (!this.zza.containsKey(zzgmzVar)) {
            this.zza.put(zzgmzVar, zzgmxVar);
            return this;
        }
        zzgmx zzgmxVar2 = (zzgmx) this.zza.get(zzgmzVar);
        if (zzgmxVar2.equals(zzgmxVar) && zzgmxVar.equals(zzgmxVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(zzgmzVar.toString()));
    }

    public final zzgmy zzb(zzgng zzgngVar) throws GeneralSecurityException {
        Map map = this.zzb;
        Class zzb = zzgngVar.zzb();
        if (!map.containsKey(zzb)) {
            this.zzb.put(zzb, zzgngVar);
            return this;
        }
        zzgng zzgngVar2 = (zzgng) this.zzb.get(zzb);
        if (zzgngVar2.equals(zzgngVar) && zzgngVar.equals(zzgngVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(zzb.toString()));
    }

    /* synthetic */ zzgmy(zzgna zzgnaVar) {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    /* synthetic */ zzgmy(zzgnb zzgnbVar, zzgna zzgnaVar) {
        Map map;
        Map map2;
        map = zzgnbVar.zza;
        this.zza = new HashMap(map);
        map2 = zzgnbVar.zzb;
        this.zzb = new HashMap(map2);
    }
}
