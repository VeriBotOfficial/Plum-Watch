package com.yandex.mobile.ads.impl;

import android.os.SystemClock;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u80 {

    /* renamed from: a, reason: collision with root package name */
    private final it0 f17028a;

    public u80(it0 mainThreadHandler) {
        Intrinsics.checkNotNullParameter(mainThreadHandler, "mainThreadHandler");
        this.f17028a = mainThreadHandler;
    }

    public final void a(final Function0<Unit> successCallback) {
        Intrinsics.checkNotNullParameter(successCallback, "successCallback");
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f17028a.a(new Runnable() { // from class: com.yandex.mobile.ads.impl.u80$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                u80.a(elapsedRealtime, successCallback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(long j, Function0 successCallback) {
        Intrinsics.checkNotNullParameter(successCallback, "$successCallback");
        if (SystemClock.elapsedRealtime() - j <= 5000) {
            successCallback.invoke();
        }
    }
}
