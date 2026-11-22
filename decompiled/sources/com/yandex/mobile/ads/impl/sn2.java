package com.yandex.mobile.ads.impl;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.common.VideoEventListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class sn2 implements lu {

    /* renamed from: a, reason: collision with root package name */
    private final VideoEventListener f16877a;

    static final class a extends Lambda implements Function0<Unit> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            sn2.this.f16877a.onVideoComplete();
            return Unit.INSTANCE;
        }
    }

    public sn2(VideoEventListener videoEventListener) {
        Intrinsics.checkNotNullParameter(videoEventListener, "videoEventListener");
        this.f16877a = videoEventListener;
    }

    @Override // com.yandex.mobile.ads.impl.lu
    public final void onVideoComplete() {
        new CallbackStackTraceMarker(new a());
    }

    public final boolean equals(Object obj) {
        return (obj instanceof sn2) && Intrinsics.areEqual(((sn2) obj).f16877a, this.f16877a);
    }

    public final int hashCode() {
        return this.f16877a.hashCode();
    }
}
