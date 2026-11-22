package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.yandex.mobile.ads.common.AdActivity;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class em {

    /* renamed from: a, reason: collision with root package name */
    private final cy1 f15395a;

    public em(cy1 showActivityProvider) {
        Intrinsics.checkNotNullParameter(showActivityProvider, "showActivityProvider");
        this.f15395a = showActivityProvider;
    }

    public final Intent a(Context context, String browserUrl, long j) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(browserUrl, "browserUrl");
        this.f15395a.getClass();
        Intent intent = new Intent(context, (Class<?>) AdActivity.class);
        intent.putExtra("window_type", "window_type_browser");
        intent.putExtra("extra_browser_url", browserUrl);
        if (!(context instanceof Activity)) {
            intent.addFlags(402653184);
        }
        intent.putExtra("data_identifier", j);
        return intent;
    }
}
