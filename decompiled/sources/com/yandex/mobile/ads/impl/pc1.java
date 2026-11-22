package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class pc1 {

    /* renamed from: a, reason: collision with root package name */
    private final dc2<kb1> f16550a;
    private final be2 b;

    public /* synthetic */ pc1(Context context, o3 o3Var) {
        this(context, o3Var, new dc2(context, new lb1()), new be2(context, o3Var, new ya1(o3Var), new qf1()));
    }

    public pc1(Context context, o3 adConfiguration, dc2<kb1> videoAdInfoListCreator, be2 videoAdsResponseHandler) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(videoAdInfoListCreator, "videoAdInfoListCreator");
        Intrinsics.checkNotNullParameter(videoAdsResponseHandler, "videoAdsResponseHandler");
        this.f16550a = videoAdInfoListCreator;
        this.b = videoAdsResponseHandler;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.yandex.mobile.ads.impl.pc1 r5, java.util.List r6, kotlin.coroutines.Continuation r7) {
        /*
            r5.getClass()
            boolean r0 = r7 instanceof com.yandex.mobile.ads.impl.nc1
            if (r0 == 0) goto L16
            r0 = r7
            com.yandex.mobile.ads.impl.nc1 r0 = (com.yandex.mobile.ads.impl.nc1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.e = r1
            goto L1b
        L16:
            com.yandex.mobile.ads.impl.nc1 r0 = new com.yandex.mobile.ads.impl.nc1
            r0.<init>(r5, r7)
        L1b:
            java.lang.Object r7 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            com.yandex.mobile.ads.impl.pc1 r5 = r0.b
            kotlin.ResultKt.throwOnFailure(r7)
            goto L69
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            kotlin.ResultKt.throwOnFailure(r7)
            com.yandex.mobile.ads.impl.be2 r7 = r5.b
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r4 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r6, r4)
            r2.<init>(r4)
            java.util.Iterator r6 = r6.iterator()
        L4a:
            boolean r4 = r6.hasNext()
            if (r4 == 0) goto L5e
            java.lang.Object r4 = r6.next()
            com.yandex.mobile.ads.impl.zb2 r4 = (com.yandex.mobile.ads.impl.zb2) r4
            com.yandex.mobile.ads.impl.mb2 r4 = r4.g()
            r2.add(r4)
            goto L4a
        L5e:
            r0.b = r5
            r0.e = r3
            java.lang.Object r7 = r7.a(r2, r0)
            if (r7 != r1) goto L69
            return r1
        L69:
            com.yandex.mobile.ads.impl.zd2 r7 = (com.yandex.mobile.ads.impl.zd2) r7
            boolean r6 = r7 instanceof com.yandex.mobile.ads.impl.zd2.a
            if (r6 == 0) goto L74
            java.util.List r5 = kotlin.collections.CollectionsKt.emptyList()
            return r5
        L74:
            boolean r6 = r7 instanceof com.yandex.mobile.ads.impl.zd2.b
            if (r6 == 0) goto L85
            com.yandex.mobile.ads.impl.dc2<com.yandex.mobile.ads.impl.kb1> r5 = r5.f16550a
            com.yandex.mobile.ads.impl.zd2$b r7 = (com.yandex.mobile.ads.impl.zd2.b) r7
            java.util.List r6 = r7.a()
            java.util.ArrayList r5 = r5.a(r6)
            return r5
        L85:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.pc1.a(com.yandex.mobile.ads.impl.pc1, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
