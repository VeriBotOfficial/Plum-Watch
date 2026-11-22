package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class iz1 {
    @JvmStatic
    public static final boolean a(Context context, o8<?> adResponse, gz1 responseSizeInfo, j9 adSizeValidator, gz1 containerSizeInfo) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(responseSizeInfo, "responseSizeInfo");
        Intrinsics.checkNotNullParameter(adSizeValidator, "adSizeValidator");
        Intrinsics.checkNotNullParameter(containerSizeInfo, "containerSizeInfo");
        boolean a2 = adSizeValidator.a(context, responseSizeInfo);
        boolean N = adResponse.N();
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        boolean a3 = qa.a(applicationContext, responseSizeInfo, containerSizeInfo);
        if (N) {
            return true;
        }
        return a2 && a3;
    }
}
