package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.yandex.mobile.ads.common.AdActivity;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class rd0 {

    /* renamed from: a, reason: collision with root package name */
    private final cy1 f16756a;

    public rd0(cy1 showActivityProvider) {
        Intrinsics.checkNotNullParameter(showActivityProvider, "showActivityProvider");
        this.f16756a = showActivityProvider;
    }

    public final Intent a(Context context, long j) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f16756a.getClass();
        Intent intent = new Intent(context, (Class<?>) AdActivity.class);
        intent.putExtra("window_type", "window_type_fullscreen");
        intent.putExtra("data_identifier", j);
        if (!(context instanceof Activity)) {
            intent.addFlags(402653184);
        }
        return intent;
    }
}
