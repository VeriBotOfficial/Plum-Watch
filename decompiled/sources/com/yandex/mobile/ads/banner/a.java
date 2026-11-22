package com.yandex.mobile.ads.banner;

import com.yandex.mobile.ads.impl.gz1;
import com.yandex.mobile.ads.impl.zs;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {
    @JvmStatic
    public static final zs a(BannerAdSize adSize) {
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        gz1 b = adSize.getB();
        Intrinsics.checkNotNullExpressionValue(b, "getSizeInfo(...)");
        return new zs(b);
    }
}
