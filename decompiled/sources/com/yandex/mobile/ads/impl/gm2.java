package com.yandex.mobile.ads.impl;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.instream.InstreamAdLoadListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class gm2 implements jt {

    /* renamed from: a, reason: collision with root package name */
    private final InstreamAdLoadListener f15609a;

    static final class a extends Lambda implements Function0<Unit> {
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(0);
            this.c = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            gm2.this.f15609a.onInstreamAdFailedToLoad(this.c);
            return Unit.INSTANCE;
        }
    }

    static final class b extends Lambda implements Function0<Unit> {
        final /* synthetic */ am2 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(am2 am2Var) {
            super(0);
            this.c = am2Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            gm2.this.f15609a.onInstreamAdLoaded(this.c);
            return Unit.INSTANCE;
        }
    }

    public gm2(InstreamAdLoadListener yandexAdLoadListener) {
        Intrinsics.checkNotNullParameter(yandexAdLoadListener, "yandexAdLoadListener");
        this.f15609a = yandexAdLoadListener;
    }

    @Override // com.yandex.mobile.ads.impl.jt
    public final void onInstreamAdFailedToLoad(String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        new CallbackStackTraceMarker(new a(reason));
    }

    @Override // com.yandex.mobile.ads.impl.jt
    public final void a(et instreamAd) {
        Intrinsics.checkNotNullParameter(instreamAd, "instreamAd");
        new CallbackStackTraceMarker(new b(new am2(instreamAd)));
    }
}
