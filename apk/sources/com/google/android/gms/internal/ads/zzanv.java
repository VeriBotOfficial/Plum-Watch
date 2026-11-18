package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes12.dex */
public final class zzanv {
    public final int zza;
    public final String zzb;
    public final int zzc;
    public final List zzd;
    public final byte[] zze;

    public zzanv(int r1, String str, int r3, List list, byte[] bArr) {
        this.zza = r1;
        this.zzb = str;
        this.zzc = r3;
        this.zzd = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.zze = bArr;
    }

    public final int zza() {
        int r0 = this.zzc;
        if (r0 != 2) {
            return r0 != 3 ? 0 : 512;
        }
        return 2048;
    }
}
