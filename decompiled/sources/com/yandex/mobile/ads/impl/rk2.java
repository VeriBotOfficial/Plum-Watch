package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class rk2 {

    /* renamed from: a, reason: collision with root package name */
    private final wk2 f16773a;
    private final xd2 b;
    private final mk2 c;

    public final List<mb2> a(List<mb2> videoAds) {
        Intrinsics.checkNotNullParameter(videoAds, "videoAds");
        uk2 a2 = this.f16773a.a();
        if (a2 == null) {
            return videoAds;
        }
        if (!a2.a()) {
            this.b.getClass();
            videoAds = xd2.a(videoAds).a();
        }
        if (!a2.b()) {
            videoAds = CollectionsKt.take(videoAds, 1);
        }
        return this.c.a(videoAds);
    }

    public /* synthetic */ rk2(Context context, mb2 mb2Var) {
        this(context, mb2Var, new wk2(mb2Var), new xd2(), new mk2(context, mb2Var));
    }

    public rk2(Context context, mb2 wrapperAd, wk2 wrapperConfigurationProvider, xd2 wrappersProviderFactory, mk2 wrappedVideoAdCreator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(wrapperAd, "wrapperAd");
        Intrinsics.checkNotNullParameter(wrapperConfigurationProvider, "wrapperConfigurationProvider");
        Intrinsics.checkNotNullParameter(wrappersProviderFactory, "wrappersProviderFactory");
        Intrinsics.checkNotNullParameter(wrappedVideoAdCreator, "wrappedVideoAdCreator");
        this.f16773a = wrapperConfigurationProvider;
        this.b = wrappersProviderFactory;
        this.c = wrappedVideoAdCreator;
    }
}
