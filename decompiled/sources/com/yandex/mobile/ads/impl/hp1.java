package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.Button;
import android.widget.FrameLayout;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class hp1 extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final Button f15716a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hp1(Context context, Button replayButton) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(replayButton, "replayButton");
        this.f15716a = replayButton;
    }

    public final Button a() {
        return this.f15716a;
    }
}
