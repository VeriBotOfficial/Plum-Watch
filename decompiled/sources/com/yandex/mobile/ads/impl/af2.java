package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class af2 extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final ProgressBar f15004a;
    private final ImageView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af2(Context context, ProgressBar progressBar, ImageView imageView) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(progressBar, "progressBar");
        this.f15004a = progressBar;
        this.b = imageView;
    }

    public final ProgressBar b() {
        return this.f15004a;
    }

    public final ImageView a() {
        return this.b;
    }
}
