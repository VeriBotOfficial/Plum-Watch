package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes15.dex */
final class zzfwq extends AbstractSet {
    final /* synthetic */ zzfww zza;

    zzfwq(zzfww zzfwwVar) {
        this.zza = zzfwwVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        int zzw;
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            zzw = this.zza.zzw(entry.getKey());
            if (zzw != -1 && zzfuk.zza(zzfww.zzj(this.zza, zzw), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzfww zzfwwVar = this.zza;
        Map zzl = zzfwwVar.zzl();
        return zzl != null ? zzl.entrySet().iterator() : new zzfwo(zzfwwVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@CheckForNull Object obj) {
        int zzv;
        Object requireNonNull;
        int[] zzA;
        Object[] zzB;
        Object[] zzC;
        int i;
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        zzfww zzfwwVar = this.zza;
        if (zzfwwVar.zzr()) {
            return false;
        }
        zzv = zzfwwVar.zzv();
        Object key = entry.getKey();
        Object value = entry.getValue();
        zzfww zzfwwVar2 = this.zza;
        requireNonNull = Objects.requireNonNull(zzfwwVar2.zze);
        zzA = zzfwwVar2.zzA();
        zzB = zzfwwVar2.zzB();
        zzC = zzfwwVar2.zzC();
        int zzb = zzfwx.zzb(key, value, zzv, requireNonNull, zzA, zzB, zzC);
        if (zzb == -1) {
            return false;
        }
        this.zza.zzq(zzb, zzv);
        zzfww zzfwwVar3 = this.zza;
        i = zzfwwVar3.zzg;
        zzfwwVar3.zzg = i - 1;
        this.zza.zzo();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}
