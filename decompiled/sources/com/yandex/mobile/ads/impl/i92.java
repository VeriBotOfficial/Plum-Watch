package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i92 {

    /* renamed from: a, reason: collision with root package name */
    private final m92 f15793a;
    private final pw1 b;
    private final kb2 c;
    private final h92 d;
    private final Context e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ i92(android.content.Context r7) {
        /*
            r6 = this;
            com.yandex.mobile.ads.impl.m92 r2 = new com.yandex.mobile.ads.impl.m92
            r2.<init>(r7)
            int r0 = com.yandex.mobile.ads.impl.pw1.l
            com.yandex.mobile.ads.impl.pw1 r3 = com.yandex.mobile.ads.impl.pw1.a.a()
            com.yandex.mobile.ads.impl.kb2 r4 = new com.yandex.mobile.ads.impl.kb2
            r4.<init>()
            com.yandex.mobile.ads.impl.h92 r5 = new com.yandex.mobile.ads.impl.h92
            r5.<init>()
            r0 = r6
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.i92.<init>(android.content.Context):void");
    }

    public final void a() {
        kb2 kb2Var = this.c;
        Context context = this.e;
        kb2Var.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        if (pa.a(context) && this.b.k() && this.d.a(this.e)) {
            this.f15793a.a();
        }
    }

    public i92(Context context, m92 toastPresenter, pw1 sdkSettings, kb2 versionValidationNeedChecker, h92 validationErrorIndicatorChecker) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(toastPresenter, "toastPresenter");
        Intrinsics.checkNotNullParameter(sdkSettings, "sdkSettings");
        Intrinsics.checkNotNullParameter(versionValidationNeedChecker, "versionValidationNeedChecker");
        Intrinsics.checkNotNullParameter(validationErrorIndicatorChecker, "validationErrorIndicatorChecker");
        this.f15793a = toastPresenter;
        this.b = sdkSettings;
        this.c = versionValidationNeedChecker;
        this.d = validationErrorIndicatorChecker;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.e = applicationContext;
    }
}
