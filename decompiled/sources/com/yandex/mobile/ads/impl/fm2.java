package com.yandex.mobile.ads.impl;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.instream.InstreamAdListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class fm2 implements sl0 {

    /* renamed from: a, reason: collision with root package name */
    private final InstreamAdListener f15511a;

    static final class a extends Lambda implements Function0<Unit> {
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(0);
            this.c = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            fm2.this.f15511a.onError(this.c);
            return Unit.INSTANCE;
        }
    }

    static final class b extends Lambda implements Function0<Unit> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            fm2.this.f15511a.onInstreamAdCompleted();
            return Unit.INSTANCE;
        }
    }

    static final class c extends Lambda implements Function0<Unit> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            fm2.this.f15511a.onInstreamAdPrepared();
            return Unit.INSTANCE;
        }
    }

    public fm2(InstreamAdListener instreamAdListener) {
        Intrinsics.checkNotNullParameter(instreamAdListener, "instreamAdListener");
        this.f15511a = instreamAdListener;
    }

    @Override // com.yandex.mobile.ads.impl.sl0
    public final void onError(String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        new CallbackStackTraceMarker(new a(reason));
    }

    @Override // com.yandex.mobile.ads.impl.sl0
    public final void onInstreamAdCompleted() {
        new CallbackStackTraceMarker(new b());
    }

    @Override // com.yandex.mobile.ads.impl.sl0
    public final void onInstreamAdPrepared() {
        new CallbackStackTraceMarker(new c());
    }
}
