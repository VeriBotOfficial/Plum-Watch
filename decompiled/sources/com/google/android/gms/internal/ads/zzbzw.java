package com.google.android.gms.internal.ads;

import androidx.webkit.Profile;
import com.google.android.gms.common.util.ClientLibraryUtils;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes15.dex */
public final class zzbzw {
    public static final zzgcs zza;
    public static final zzgcs zzb;
    public static final zzgcs zzc;
    public static final ScheduledExecutorService zzd;
    public static final zzgct zze;
    public static final zzgcs zzf;
    public static final zzgcs zzg;

    static {
        ExecutorService threadPoolExecutor;
        ExecutorService executorService;
        ExecutorService executorService2;
        if (ClientLibraryUtils.isPackageSide()) {
            zzfqv.zza();
            threadPoolExecutor = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new zzbzs(Profile.DEFAULT_PROFILE_NAME)));
        } else {
            if (com.google.android.gms.ads.internal.client.zzbe.zzc().zzb(zzbcl.zzlf) != null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zzb(zzbcl.zzlf)).booleanValue()) {
                    if (com.google.android.gms.ads.internal.client.zzbe.zzc().zzb(zzbcl.zzlg) != null) {
                        if (com.google.android.gms.ads.internal.client.zzbe.zzc().zzb(zzbcl.zzlh) != null) {
                            ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zzb(zzbcl.zzlg)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zzb(zzbcl.zzlg)).intValue(), 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzbzs(Profile.DEFAULT_PROFILE_NAME));
                            threadPoolExecutor2.allowCoreThreadTimeOut(((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zzb(zzbcl.zzlh)).booleanValue());
                            threadPoolExecutor = threadPoolExecutor2;
                        }
                    }
                }
            }
            threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new zzbzs(Profile.DEFAULT_PROFILE_NAME));
        }
        zzbzv zzbzvVar = null;
        zza = new zzbzu(threadPoolExecutor, zzbzvVar);
        if (ClientLibraryUtils.isPackageSide()) {
            executorService = zzfqv.zza().zzc(5, new zzbzs("Loader"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(5, 5, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzbzs("Loader"));
            threadPoolExecutor3.allowCoreThreadTimeOut(true);
            executorService = threadPoolExecutor3;
        }
        zzb = new zzbzu(executorService, zzbzvVar);
        if (ClientLibraryUtils.isPackageSide()) {
            executorService2 = zzfqv.zza().zzb(new zzbzs("Activeview"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor4 = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzbzs("Activeview"));
            threadPoolExecutor4.allowCoreThreadTimeOut(true);
            executorService2 = threadPoolExecutor4;
        }
        zzc = new zzbzu(executorService2, zzbzvVar);
        zzbzr zzbzrVar = new zzbzr(3, new zzbzs("Schedule"));
        zzd = zzbzrVar;
        zze = zzgcz.zzb(zzbzrVar);
        zzf = new zzbzu(new zzbzt(), zzbzvVar);
        zzg = new zzbzu(zzgcz.zzc(), zzbzvVar);
    }
}
