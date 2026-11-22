package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.Intent;
import com.yandex.mobile.ads.common.AdActivity;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p1 {

    /* renamed from: a, reason: collision with root package name */
    private final cy1 f16510a;

    public p1(cy1 showActivityProvider) {
        Intrinsics.checkNotNullParameter(showActivityProvider, "showActivityProvider");
        this.f16510a = showActivityProvider;
    }

    public final Intent a(Context context, long j) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f16510a.getClass();
        Intent intent = new Intent(context, (Class<?>) AdActivity.class);
        intent.putExtra("window_type", "window_type_activity_result");
        intent.putExtra("data_identifier", j);
        return intent;
    }
}
