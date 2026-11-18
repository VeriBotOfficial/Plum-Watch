package com.google.android.gms.ads;

import java.util.Locale;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes15.dex */
public class VersionInfo {
    protected final int zza;
    protected final int zzb;
    protected final int zzc;

    public VersionInfo(int r1, int r2, int r3) {
        this.zza = r1;
        this.zzb = r2;
        this.zzc = r3;
    }

    public int getMajorVersion() {
        return this.zza;
    }

    public int getMicroVersion() {
        return this.zzc;
    }

    public int getMinorVersion() {
        return this.zzb;
    }

    public String toString() {
        return String.format(Locale.US, "%d.%d.%d", Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc));
    }
}
