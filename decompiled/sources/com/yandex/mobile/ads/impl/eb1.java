package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class eb1 {

    /* renamed from: a, reason: collision with root package name */
    private final i00 f15370a;
    private final jb0 b;
    private final w41 c;

    @DebugMetadata(c = "com.monetization.ads.nativeads.video.cache.NativeVideoLoadController", f = "NativeVideoLoadController.kt", i = {0, 0, 0, 0, 1}, l = {38, 44}, m = "loadVideo", n = {"this", "context", "debugEventsReporter", "loadAutomatically", "updatedNativeAdBlock"}, s = {"L$0", "L$1", "L$2", "Z$0", "L$0"})
    static final class a extends ContinuationImpl {
        Object b;
        Context c;
        dw d;
        boolean e;
        /* synthetic */ Object f;
        int h;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f = obj;
            this.h |= Integer.MIN_VALUE;
            return eb1.this.a(false, null, null, null, this);
        }
    }

    public /* synthetic */ eb1(o3 o3Var, Context context, g5 g5Var) {
        this(o3Var, context, g5Var, new i00(context, g5Var), new jb0(context, g5Var), new w41(context, o3Var));
    }

    public eb1(o3 adConfiguration, Context context, g5 adLoadingPhasesManager, i00 defaultNativeVideoLoader, jb0 firstNativeVideoLoader, w41 nativeAdBlockVideoWrapperLoader) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(defaultNativeVideoLoader, "defaultNativeVideoLoader");
        Intrinsics.checkNotNullParameter(firstNativeVideoLoader, "firstNativeVideoLoader");
        Intrinsics.checkNotNullParameter(nativeAdBlockVideoWrapperLoader, "nativeAdBlockVideoWrapperLoader");
        this.f15370a = defaultNativeVideoLoader;
        this.b = firstNativeVideoLoader;
        this.c = nativeAdBlockVideoWrapperLoader;
    }

    public final void a() {
        this.f15370a.a();
        this.b.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(boolean r7, android.content.Context r8, com.yandex.mobile.ads.impl.s41 r9, com.yandex.mobile.ads.impl.dw r10, kotlin.coroutines.Continuation<? super com.yandex.mobile.ads.impl.s41> r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof com.yandex.mobile.ads.impl.eb1.a
            if (r0 == 0) goto L13
            r0 = r11
            com.yandex.mobile.ads.impl.eb1$a r0 = (com.yandex.mobile.ads.impl.eb1.a) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            com.yandex.mobile.ads.impl.eb1$a r0 = new com.yandex.mobile.ads.impl.eb1$a
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L46
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r7 = r0.b
            com.yandex.mobile.ads.impl.s41 r7 = (com.yandex.mobile.ads.impl.s41) r7
            kotlin.ResultKt.throwOnFailure(r11)
            return r7
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            boolean r7 = r0.e
            com.yandex.mobile.ads.impl.dw r10 = r0.d
            android.content.Context r8 = r0.c
            java.lang.Object r9 = r0.b
            com.yandex.mobile.ads.impl.eb1 r9 = (com.yandex.mobile.ads.impl.eb1) r9
            kotlin.ResultKt.throwOnFailure(r11)
            goto L5d
        L46:
            kotlin.ResultKt.throwOnFailure(r11)
            com.yandex.mobile.ads.impl.w41 r11 = r6.c
            r0.b = r6
            r0.c = r8
            r0.d = r10
            r0.e = r7
            r0.h = r4
            java.lang.Object r11 = r11.a(r8, r9, r0)
            if (r11 != r1) goto L5c
            goto Lc7
        L5c:
            r9 = r6
        L5d:
            com.yandex.mobile.ads.impl.s41 r11 = (com.yandex.mobile.ads.impl.s41) r11
            r2 = 0
            if (r11 != 0) goto L63
            return r2
        L63:
            if (r7 != 0) goto L66
            goto Lc8
        L66:
            com.yandex.mobile.ads.impl.o8 r7 = r11.b()
            boolean r5 = r7.R()
            if (r5 == 0) goto Lc8
            r0.b = r11
            r0.c = r2
            r0.d = r2
            r0.h = r3
            r9.getClass()
            kotlinx.coroutines.CancellableContinuationImpl r2 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r0)
            r2.<init>(r3, r4)
            r2.initCancellability()
            com.yandex.mobile.ads.impl.fb1 r3 = new com.yandex.mobile.ads.impl.fb1
            r3.<init>(r2)
            com.yandex.mobile.ads.impl.w80 r4 = com.yandex.mobile.ads.impl.w80.c
            boolean r8 = com.yandex.mobile.ads.impl.x80.a(r8, r4)
            com.yandex.mobile.ads.impl.mb1 r4 = com.yandex.mobile.ads.impl.mb1.c
            java.lang.String r4 = r4.a()
            java.lang.String r7 = r7.F()
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r7)
            if (r7 == 0) goto Laa
            if (r8 == 0) goto Laa
            com.yandex.mobile.ads.impl.jb0 r7 = r9.b
            r7.a(r11, r3, r10)
            goto Laf
        Laa:
            com.yandex.mobile.ads.impl.i00 r7 = r9.f15370a
            r7.a(r11, r3, r10)
        Laf:
            java.lang.Object r7 = r2.getResult()
            java.lang.Object r8 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r7 != r8) goto Lbc
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r0)
        Lbc:
            java.lang.Object r8 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r7 != r8) goto Lc3
            goto Lc5
        Lc3:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
        Lc5:
            if (r7 != r1) goto Lc8
        Lc7:
            return r1
        Lc8:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.eb1.a(boolean, android.content.Context, com.yandex.mobile.ads.impl.s41, com.yandex.mobile.ads.impl.dw, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void a(Context context, zb2<kb1> videoAdInfo, o8<?> adResponse) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        boolean a2 = x80.a(context, w80.c);
        if (Intrinsics.areEqual(mb1.c.a(), adResponse.F()) && a2) {
            this.b.a(videoAdInfo.e());
        }
    }
}
