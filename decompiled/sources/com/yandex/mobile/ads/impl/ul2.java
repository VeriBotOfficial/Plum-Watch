package com.yandex.mobile.ads.impl;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.common.BidderTokenLoadListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class ul2 implements at {

    /* renamed from: a, reason: collision with root package name */
    private final BidderTokenLoadListener f17067a;

    static final class a extends Lambda implements Function0<Unit> {
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(0);
            this.c = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ul2.this.f17067a.onBidderTokenLoaded(this.c);
            return Unit.INSTANCE;
        }
    }

    public ul2(BidderTokenLoadListener bidderTokenLoadListener) {
        Intrinsics.checkNotNullParameter(bidderTokenLoadListener, "bidderTokenLoadListener");
        this.f17067a = bidderTokenLoadListener;
    }

    @Override // com.yandex.mobile.ads.impl.at
    public final void onBidderTokenLoaded(String bidderToken) {
        Intrinsics.checkNotNullParameter(bidderToken, "bidderToken");
        new CallbackStackTraceMarker(new a(bidderToken));
    }

    @Override // com.yandex.mobile.ads.impl.at
    public final void a() {
        Intrinsics.checkNotNullParameter("Cannot load bidder token. Token generation failed", "failureReason");
        new CallbackStackTraceMarker(new tl2(this));
    }
}
