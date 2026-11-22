package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class pn {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f16586a;
    private final zd<TextView> b;

    public /* synthetic */ pn(Context context) {
        this(context, new Handler(Looper.getMainLooper()), rn.a(context));
    }

    public pn(Context context, Handler handler, zd<TextView> callToActionAnimator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(callToActionAnimator, "callToActionAnimator");
        this.f16586a = handler;
        this.b = callToActionAnimator;
    }

    public final void a() {
        this.f16586a.removeCallbacksAndMessages(null);
        this.b.cancel();
    }

    public final void a(TextView callToActionView) {
        Intrinsics.checkNotNullParameter(callToActionView, "callToActionView");
        this.f16586a.postDelayed(new o22(callToActionView, this.b), 2000L);
    }
}
