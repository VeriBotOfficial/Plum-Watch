package com.yandex.mobile.ads.impl;

import android.app.Activity;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    private final v0 f17006a;

    public final void a(Activity activity, c1 adActivityData) {
        Object m14057constructorimpl;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(adActivityData, "adActivityData");
        if (adActivityData.a() == null) {
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            activity.startActivityForResult(adActivityData.a(), 0);
            Unit unit = Unit.INSTANCE;
            this.f17006a.a(adActivityData);
            activity.finish();
            m14057constructorimpl = Result.m14057constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m14057constructorimpl = Result.m14057constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m14060exceptionOrNullimpl = Result.m14060exceptionOrNullimpl(m14057constructorimpl);
        if (m14060exceptionOrNullimpl != null) {
            this.f17006a.a(m14060exceptionOrNullimpl);
        }
    }

    public /* synthetic */ u0(sp1 sp1Var) {
        this(sp1Var, new v0(sp1Var));
    }

    public u0(sp1 reporter, v0 activityResultReporter) {
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(activityResultReporter, "activityResultReporter");
        this.f17006a = activityResultReporter;
    }
}
