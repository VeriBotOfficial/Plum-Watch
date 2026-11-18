package com.google.android.gms.internal.fido;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fido@@20.1.0 */
/* JADX INFO: loaded from: classes12.dex */
public final class zzbx {
    static int zza(Set set) {
        Iterator it = set.iterator();
        int r1 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            r1 += next != null ? next.hashCode() : 0;
        }
        return r1;
    }
}
