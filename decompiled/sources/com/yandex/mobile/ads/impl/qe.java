package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class qe {

    /* renamed from: a, reason: collision with root package name */
    private final Context f16659a;
    private final j10 b;

    public qe(Context context, j10 deviceInfoProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(deviceInfoProvider, "deviceInfoProvider");
        this.f16659a = context;
        this.b = deviceInfoProvider;
    }

    public final xw a() {
        PackageInfo packageInfo;
        PackageManager packageManager = this.f16659a.getPackageManager();
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            packageInfo = packageManager.getPackageInfo(this.f16659a.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        } else {
            packageInfo = packageManager.getPackageInfo(this.f16659a.getPackageName(), 0);
        }
        this.b.getClass();
        String b = j10.b();
        if (b == null) {
            b = "Undefined";
        }
        String str = "Android " + b;
        String str2 = "API " + i;
        String packageName = packageInfo.packageName;
        Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
        String versionName = packageInfo.versionName;
        Intrinsics.checkNotNullExpressionValue(versionName, "versionName");
        return new xw(packageName, versionName, str, str2);
    }
}
