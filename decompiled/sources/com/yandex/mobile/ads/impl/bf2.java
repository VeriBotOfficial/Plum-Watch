package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.ImageView;
import android.widget.ProgressBar;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class bf2 {

    /* renamed from: a, reason: collision with root package name */
    private final pl1 f15104a;
    private final pf2 b;

    public final af2 a(Context context, lb2 lb2Var) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.b.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        ImageView imageView = null;
        if ((lb2Var != null ? lb2Var.a() : null) != null) {
            imageView = new ImageView(context);
            imageView.setAdjustViewBounds(true);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        ProgressBar a2 = this.f15104a.a(context);
        a2.setVisibility(8);
        af2 af2Var = new af2(context, a2, imageView);
        af2Var.addView(a2);
        if (imageView != null) {
            af2Var.addView(imageView);
        }
        af2Var.setBackgroundColor(-16777216);
        return af2Var;
    }

    public /* synthetic */ bf2() {
        this(new pl1(), new pf2());
    }

    public bf2(pl1 progressBarCreator, pf2 videoPreviewCreator) {
        Intrinsics.checkNotNullParameter(progressBarCreator, "progressBarCreator");
        Intrinsics.checkNotNullParameter(videoPreviewCreator, "videoPreviewCreator");
        this.f15104a = progressBarCreator;
        this.b = videoPreviewCreator;
    }
}
