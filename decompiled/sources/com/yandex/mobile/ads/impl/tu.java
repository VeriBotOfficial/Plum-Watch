package com.yandex.mobile.ads.impl;

import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class tu {

    /* renamed from: a, reason: collision with root package name */
    private final tl1 f16995a;

    public final void a(TextView countDownProgress, long j, long j2) {
        Intrinsics.checkNotNullParameter(countDownProgress, "countDownProgress");
        this.f16995a.getClass();
        countDownProgress.setText(tl1.a(j - j2));
    }

    public /* synthetic */ tu() {
        this(new tl1());
    }

    public tu(tl1 progressDisplayTimeFormatter) {
        Intrinsics.checkNotNullParameter(progressDisplayTimeFormatter, "progressDisplayTimeFormatter");
        this.f16995a = progressDisplayTimeFormatter;
    }
}
