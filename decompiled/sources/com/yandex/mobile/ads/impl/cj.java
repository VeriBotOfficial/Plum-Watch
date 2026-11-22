package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class cj implements j9 {
    @Override // com.yandex.mobile.ads.impl.j9
    public final boolean a(Context context, gz1 sizeInfo) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sizeInfo, "sizeInfo");
        return sizeInfo.c(context) >= 0 && sizeInfo.a(context) >= 0;
    }
}
