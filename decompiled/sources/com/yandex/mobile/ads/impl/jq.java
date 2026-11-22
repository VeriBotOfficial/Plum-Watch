package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class jq {
    public static kq a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new kq(new lq(), new mq(), rs0.a(context, context.getPackageName() + "_preferences"));
    }
}
