package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes12.dex */
public final class zzheo {
    static HashSet zza(int r1) {
        return new HashSet(zzd(r1));
    }

    public static LinkedHashMap zzb(int r1) {
        return new LinkedHashMap(zzd(r1));
    }

    public static List zzc(int r1) {
        return r1 == 0 ? Collections.emptyList() : new ArrayList(r1);
    }

    private static int zzd(int r1) {
        if (r1 < 3) {
            return r1 + 1;
        }
        if (r1 < 1073741824) {
            return (int) ((r1 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }
}
