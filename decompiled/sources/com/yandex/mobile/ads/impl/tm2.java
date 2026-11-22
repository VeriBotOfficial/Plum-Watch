package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.nativeads.NativeAdImageLoadingListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class tm2 implements ut {

    /* renamed from: a, reason: collision with root package name */
    private final NativeAdImageLoadingListener f16984a;

    static final class a extends Lambda implements Function0<Unit> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            tm2.this.f16984a.onFinishLoadingImages();
            return Unit.INSTANCE;
        }
    }

    public tm2(NativeAdImageLoadingListener imageLoadingListener) {
        Intrinsics.checkNotNullParameter(imageLoadingListener, "imageLoadingListener");
        this.f16984a = imageLoadingListener;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tm2) && Intrinsics.areEqual(this.f16984a, ((tm2) obj).f16984a);
    }

    public final int hashCode() {
        return this.f16984a.hashCode();
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final void onFinishLoadingImages() {
        new CallbackStackTraceMarker(new a());
    }

    public final String toString() {
        return "YandexNativeAdImageLoadingListenerAdapter(imageLoadingListener=" + this.f16984a + Separators.RPAREN;
    }
}
