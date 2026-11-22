package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes15.dex */
abstract class zzfwr implements Iterator {
    int zzb;
    int zzc;
    int zzd;
    final /* synthetic */ zzfww zze;

    /* synthetic */ zzfwr(zzfww zzfwwVar, zzfwv zzfwvVar) {
        int i;
        this.zze = zzfwwVar;
        i = zzfwwVar.zzf;
        this.zzb = i;
        this.zzc = zzfwwVar.zze();
        this.zzd = -1;
    }

    private final void zzb() {
        int i;
        i = this.zze.zzf;
        if (i != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzc >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        zzb();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.zzc;
        this.zzd = i;
        Object zza = zza(i);
        this.zzc = this.zze.zzf(this.zzc);
        return zza;
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzb();
        zzfun.zzm(this.zzd >= 0, "no calls to next() since the last call to remove()");
        this.zzb += 32;
        int i = this.zzd;
        zzfww zzfwwVar = this.zze;
        zzfwwVar.remove(zzfww.zzg(zzfwwVar, i));
        this.zzc--;
        this.zzd = -1;
    }

    abstract Object zza(int i);
}
