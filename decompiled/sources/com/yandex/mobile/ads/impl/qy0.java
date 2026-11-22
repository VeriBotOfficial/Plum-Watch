package com.yandex.mobile.ads.impl;

import com.monetization.ads.nativeads.CustomizableMediaView;
import com.yandex.mobile.ads.impl.hx0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class qy0 extends hx0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qy0(CustomizableMediaView mediaView, ox0 mediaViewRenderController) {
        super(mediaView, mediaViewRenderController);
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
        Intrinsics.checkNotNullParameter(mediaViewRenderController, "mediaViewRenderController");
    }

    @Override // com.yandex.mobile.ads.impl.hx0
    public final void a(CustomizableMediaView mediaView) {
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
    }

    @Override // com.yandex.mobile.ads.impl.hx0
    public final hx0.a d() {
        return hx0.a.g;
    }

    @Override // com.yandex.mobile.ads.impl.hx0, com.yandex.mobile.ads.impl.vg2
    public final void b(CustomizableMediaView customizableMediaView, ex0 ex0Var) {
        CustomizableMediaView mediaView = customizableMediaView;
        ex0 mediaValue = ex0Var;
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
        Intrinsics.checkNotNullParameter(mediaValue, "mediaValue");
    }

    @Override // com.yandex.mobile.ads.impl.vg2
    public final boolean a(CustomizableMediaView customizableMediaView, ex0 ex0Var) {
        CustomizableMediaView mediaView = customizableMediaView;
        ex0 mediaValue = ex0Var;
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
        Intrinsics.checkNotNullParameter(mediaValue, "mediaValue");
        return true;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.yandex.mobile.ads.impl.hx0
    /* renamed from: a */
    public final void b(CustomizableMediaView mediaView, ex0 mediaValue) {
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
        Intrinsics.checkNotNullParameter(mediaValue, "mediaValue");
    }

    @Override // com.yandex.mobile.ads.impl.hx0
    public final void a(ex0 mediaValue) {
        Intrinsics.checkNotNullParameter(mediaValue, "mediaValue");
    }
}
