package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.R;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class rn {
    public static zq a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new zq(CollectionsKt.listOf((Object[]) new zd[]{new ti(), new p42(context.getResources().getColor(R.color.monetization_ads_internal_text_color_white))}));
    }
}
