package com.yandex.mobile.ads.impl;

import java.lang.Thread;
import java.util.Set;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f82 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    private final sp1 f15465a;
    private final Thread.UncaughtExceptionHandler b;
    private final ju1 c;

    public f82(sp1 reporter, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, ju1 sdkConfiguration) {
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(sdkConfiguration, "sdkConfiguration");
        this.f15465a = reporter;
        this.b = uncaughtExceptionHandler;
        this.c = sdkConfiguration;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable throwable) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        Intrinsics.checkNotNullParameter(thread, "thread");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        try {
            Set<e60> q2 = this.c.q();
            if (q2 == null) {
                q2 = SetsKt.emptySet();
            }
            StackTraceElement[] stackTrace = throwable.getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
            if (j22.a(stackTrace, q2)) {
                this.f15465a.reportUnhandledException(throwable);
            }
            if (this.c.p() || (uncaughtExceptionHandler = this.b) == null) {
                return;
            }
        } catch (Throwable th) {
            try {
                Result.Companion companion = Result.INSTANCE;
                this.f15465a.reportError("Failed to report uncaught exception", th);
                Result.m14057constructorimpl(Unit.INSTANCE);
            } finally {
                try {
                    if (this.c.p() || (uncaughtExceptionHandler = this.b) == null) {
                        return;
                    }
                } catch (Throwable th2) {
                }
            }
            if (this.c.p()) {
                return;
            } else {
                return;
            }
        }
        uncaughtExceptionHandler.uncaughtException(thread, throwable);
    }
}
