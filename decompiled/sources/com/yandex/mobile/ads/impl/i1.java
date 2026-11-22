package com.yandex.mobile.ads.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i1 {
    private static final String b = "com.yandex.mobile.ads.common.AdActivity";
    private static final String c = "There is no presence of com.yandex.mobile.ads.common.AdActivity activity in AndroidManifest file.";

    /* renamed from: a, reason: collision with root package name */
    private final a1 f15765a = new a1();

    public final void a(Context context) throws bp0 {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), b), 0);
            Intrinsics.checkNotNullExpressionValue(activityInfo, "getActivityInfo(...)");
            this.f15765a.getClass();
            a1.a(activityInfo);
        } catch (PackageManager.NameNotFoundException unused) {
            String str = c;
            throw new bp0(str, str);
        }
    }
}
