package com.yandex.mobile.ads.impl;

import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class pj2 implements aw0 {

    /* renamed from: a, reason: collision with root package name */
    private final q71 f16574a;

    public pj2(q71 weakViewProvider) {
        Intrinsics.checkNotNullParameter(weakViewProvider, "weakViewProvider");
        this.f16574a = weakViewProvider;
    }

    @Override // com.yandex.mobile.ads.impl.aw0
    public final TextView getCountDownProgress() {
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.aw0
    public final CheckBox getMuteControl() {
        return this.f16574a.c();
    }

    @Override // com.yandex.mobile.ads.impl.aw0
    public final ProgressBar getVideoProgress() {
        return this.f16574a.e();
    }
}
