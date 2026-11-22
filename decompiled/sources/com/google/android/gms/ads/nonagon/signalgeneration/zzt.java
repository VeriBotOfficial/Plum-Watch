package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes13.dex */
final class zzt extends LinkedHashMap {
    final /* synthetic */ zzv zza;

    zzt(zzv zzvVar) {
        this.zza = zzvVar;
    }

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(Map.Entry entry) {
        int i;
        ArrayDeque arrayDeque;
        int i2;
        synchronized (this.zza) {
            int size = size();
            zzv zzvVar = this.zza;
            i = zzvVar.zza;
            if (size <= i) {
                return false;
            }
            arrayDeque = zzvVar.zzf;
            arrayDeque.add(new Pair((String) entry.getKey(), ((zzu) entry.getValue()).zzb));
            int size2 = size();
            i2 = this.zza.zza;
            return size2 > i2;
        }
    }
}
