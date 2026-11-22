package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes15.dex */
public final class zzfvj {
    public static zzfvf zza(zzfvf zzfvfVar) {
        return ((zzfvfVar instanceof zzfvi) || (zzfvfVar instanceof zzfvg)) ? zzfvfVar : zzfvfVar instanceof Serializable ? new zzfvg(zzfvfVar) : new zzfvi(zzfvfVar);
    }
}
