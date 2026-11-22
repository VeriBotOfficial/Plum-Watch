package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes15.dex */
public final class zzese implements zzetr {
    private final ApplicationInfo zza;
    private final PackageInfo zzb;
    private final Context zzc;

    zzese(ApplicationInfo applicationInfo, PackageInfo packageInfo, Context context) {
        this.zza = applicationInfo;
        this.zzb = packageInfo;
        this.zzc = context;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 29;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final ListenableFuture zzb() {
        String str;
        String str2;
        String str3;
        InstallSourceInfo installSourceInfo;
        String str4 = this.zza.packageName;
        PackageInfo packageInfo = this.zzb;
        String str5 = null;
        Integer valueOf = packageInfo == null ? null : Integer.valueOf(packageInfo.versionCode);
        PackageInfo packageInfo2 = this.zzb;
        String str6 = packageInfo2 == null ? null : packageInfo2.versionName;
        try {
            Context context = this.zzc;
            zzfqw zzfqwVar = com.google.android.gms.ads.internal.util.zzs.zza;
            str = String.valueOf(Wrappers.packageManager(context).getApplicationLabel(str4));
        } catch (PackageManager.NameNotFoundException unused) {
            str = null;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzmD)).booleanValue()) {
                try {
                    installSourceInfo = this.zzc.getPackageManager().getInstallSourceInfo(str4);
                } catch (PackageManager.NameNotFoundException e) {
                    e = e;
                    str2 = null;
                }
                if (installSourceInfo != null) {
                    str2 = installSourceInfo.getInstallingPackageName();
                    try {
                        if (TextUtils.isEmpty(str2)) {
                            com.google.android.gms.ads.internal.util.zze.zza("No installing package name found");
                            str2 = null;
                        }
                        str3 = installSourceInfo.getInitiatingPackageName();
                    } catch (PackageManager.NameNotFoundException e2) {
                        e = e2;
                    }
                    try {
                    } catch (PackageManager.NameNotFoundException e3) {
                        e = e3;
                        str5 = str3;
                        com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "PackageInfoSignalSource.getInstallSourceInfo");
                        str3 = str5;
                        return zzgch.zzh(new zzesf(str4, valueOf, str6, str, str2, str3));
                    }
                    if (TextUtils.isEmpty(str3)) {
                        com.google.android.gms.ads.internal.util.zze.zza("No initiating package name found");
                        str3 = str5;
                    }
                    return zzgch.zzh(new zzesf(str4, valueOf, str6, str, str2, str3));
                }
            }
        }
        str2 = null;
        str3 = null;
        return zzgch.zzh(new zzesf(str4, valueOf, str6, str, str2, str3));
    }
}
