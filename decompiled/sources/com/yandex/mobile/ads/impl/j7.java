package com.yandex.mobile.ads.impl;

import com.monetization.ads.quality.base.AdQualityVerifierAdapter;
import com.yandex.mobile.ads.impl.jo1;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j7 {
    public static AdQualityVerifierAdapter a() {
        Object m14057constructorimpl;
        Intrinsics.checkNotNullParameter("com.yandex.mobile.ads.quality.AdQualityVerifierAdapter", "adapterName");
        try {
            Result.Companion companion = Result.INSTANCE;
            Object a2 = jo1.a.a("com.yandex.mobile.ads.quality.AdQualityVerifierAdapter", new Object[0]);
            m14057constructorimpl = Result.m14057constructorimpl(a2 instanceof AdQualityVerifierAdapter ? (AdQualityVerifierAdapter) a2 : null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m14057constructorimpl = Result.m14057constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m14060exceptionOrNullimpl = Result.m14060exceptionOrNullimpl(m14057constructorimpl);
        if (m14060exceptionOrNullimpl != null) {
            String str = "Couldn't create ad quality adapter with unknown error: " + m14060exceptionOrNullimpl.getMessage();
            sp0.b(new Object[0]);
        }
        return (AdQualityVerifierAdapter) (Result.m14063isFailureimpl(m14057constructorimpl) ? null : m14057constructorimpl);
    }
}
