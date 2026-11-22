package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.common.AdInfo;
import com.yandex.mobile.ads.common.AdSize;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class jl2 {
    public static AdInfo a(ss coreAdInfo) {
        Intrinsics.checkNotNullParameter(coreAdInfo, "coreAdInfo");
        h9 a2 = coreAdInfo.a();
        return new AdInfo(coreAdInfo.b(), a2 != null ? new AdSize(a2.b(), a2.a()) : null, coreAdInfo.c());
    }
}
