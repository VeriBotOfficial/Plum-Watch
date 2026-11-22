package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.pw1;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g82 {

    /* renamed from: a, reason: collision with root package name */
    private static volatile boolean f15563a;
    private static final Object b = new Object();
    public static final /* synthetic */ int c = 0;

    public static void a(Context context, sp1 reporter) {
        y42 threadUtils = new y42();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(threadUtils, "threadUtils");
        if (f15563a) {
            return;
        }
        synchronized (b) {
            if (!f15563a) {
                int i = pw1.l;
                ju1 a2 = pw1.a.a().a(context);
                if (a2 != null && a2.r()) {
                    f82 handler = new f82(reporter, Thread.getDefaultUncaughtExceptionHandler(), a2);
                    Intrinsics.checkNotNullParameter(handler, "handler");
                    Thread.setDefaultUncaughtExceptionHandler(handler);
                    f15563a = true;
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    private g82() {
    }
}
