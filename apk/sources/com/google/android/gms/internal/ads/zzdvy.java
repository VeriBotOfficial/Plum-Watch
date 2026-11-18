package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes12.dex */
public class zzdvy extends Exception {
    private final int zza;

    public zzdvy(int r1) {
        this.zza = r1;
    }

    public final int zza() {
        return this.zza;
    }

    public zzdvy(int r1, String str) {
        super(str);
        this.zza = r1;
    }

    public zzdvy(int r1, String str, Throwable th) {
        super(str, th);
        this.zza = 1;
    }
}
