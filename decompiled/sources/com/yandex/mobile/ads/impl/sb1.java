package com.yandex.mobile.ads.impl;

import com.monetization.ads.nativeads.CustomizableMediaView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class sb1 {

    /* renamed from: a, reason: collision with root package name */
    private final ov f16849a;

    public final yf2 a(CustomizableMediaView mediaView) {
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
        this.f16849a.getClass();
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
        yf2 videoScaleType = mediaView.getVideoScaleType();
        return videoScaleType == null ? yf2.b : videoScaleType;
    }

    public /* synthetic */ sb1() {
        this(new ov());
    }

    public sb1(ov customizableMediaViewManager) {
        Intrinsics.checkNotNullParameter(customizableMediaViewManager, "customizableMediaViewManager");
        this.f16849a = customizableMediaViewManager;
    }
}
