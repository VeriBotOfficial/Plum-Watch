package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes12.dex */
public interface zzfqs {
    ExecutorService zza(int r1);

    ExecutorService zzb(ThreadFactory threadFactory, int r2);

    ExecutorService zzc(int r1, ThreadFactory threadFactory, int r3);
}
