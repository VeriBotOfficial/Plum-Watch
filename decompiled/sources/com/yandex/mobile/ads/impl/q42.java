package com.yandex.mobile.ads.impl;

import android.widget.TextView;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q42 {

    /* renamed from: a, reason: collision with root package name */
    private static final long f16629a = TimeUnit.SECONDS.toMillis(1);

    public static void a(TextView rewardDelayTextView, long j, long j2) {
        Intrinsics.checkNotNullParameter(rewardDelayTextView, "rewardDelayTextView");
        rewardDelayTextView.setText(String.valueOf((int) Math.ceil((j - j2) / f16629a)));
    }
}
