package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes12.dex */
public class zzfz extends IOException {
    public final int zza;

    public zzfz(int r1) {
        this.zza = r1;
    }

    public zzfz(String str, int r2) {
        super(str);
        this.zza = r2;
    }

    public zzfz(String str, Throwable th, int r3) {
        super(str, th);
        this.zza = r3;
    }

    public zzfz(Throwable th, int r2) {
        super(th);
        this.zza = r2;
    }
}
