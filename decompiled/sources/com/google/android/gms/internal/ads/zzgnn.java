package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes15.dex */
public final class zzgnn {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    public zzgnn() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
        this.zzc = new HashMap();
        this.zzd = new HashMap();
    }

    public final zzgnn zza(zzgld zzgldVar) throws GeneralSecurityException {
        zzgno zzgnoVar = new zzgno(zzgldVar.zzd(), zzgldVar.zzc(), null);
        if (!this.zzb.containsKey(zzgnoVar)) {
            this.zzb.put(zzgnoVar, zzgldVar);
            return this;
        }
        zzgld zzgldVar2 = (zzgld) this.zzb.get(zzgnoVar);
        if (zzgldVar2.equals(zzgldVar) && zzgldVar.equals(zzgldVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzgnoVar.toString()));
    }

    public final zzgnn zzb(zzglh zzglhVar) throws GeneralSecurityException {
        zzgnp zzgnpVar = new zzgnp(zzglhVar.zzc(), zzglhVar.zzd(), null);
        if (!this.zza.containsKey(zzgnpVar)) {
            this.zza.put(zzgnpVar, zzglhVar);
            return this;
        }
        zzglh zzglhVar2 = (zzglh) this.zza.get(zzgnpVar);
        if (zzglhVar2.equals(zzglhVar) && zzglhVar.equals(zzglhVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzgnpVar.toString()));
    }

    public final zzgnn zzc(zzgmp zzgmpVar) throws GeneralSecurityException {
        zzgno zzgnoVar = new zzgno(zzgmpVar.zzd(), zzgmpVar.zzc(), null);
        if (!this.zzd.containsKey(zzgnoVar)) {
            this.zzd.put(zzgnoVar, zzgmpVar);
            return this;
        }
        zzgmp zzgmpVar2 = (zzgmp) this.zzd.get(zzgnoVar);
        if (zzgmpVar2.equals(zzgmpVar) && zzgmpVar.equals(zzgmpVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzgnoVar.toString()));
    }

    public final zzgnn zzd(zzgmt zzgmtVar) throws GeneralSecurityException {
        zzgnp zzgnpVar = new zzgnp(zzgmtVar.zzc(), zzgmtVar.zzd(), null);
        if (!this.zzc.containsKey(zzgnpVar)) {
            this.zzc.put(zzgnpVar, zzgmtVar);
            return this;
        }
        zzgmt zzgmtVar2 = (zzgmt) this.zzc.get(zzgnpVar);
        if (zzgmtVar2.equals(zzgmtVar) && zzgmtVar.equals(zzgmtVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzgnpVar.toString()));
    }

    public zzgnn(zzgnr zzgnrVar) {
        Map map;
        Map map2;
        Map map3;
        Map map4;
        map = zzgnrVar.zza;
        this.zza = new HashMap(map);
        map2 = zzgnrVar.zzb;
        this.zzb = new HashMap(map2);
        map3 = zzgnrVar.zzc;
        this.zzc = new HashMap(map3);
        map4 = zzgnrVar.zzd;
        this.zzd = new HashMap(map4);
    }
}
