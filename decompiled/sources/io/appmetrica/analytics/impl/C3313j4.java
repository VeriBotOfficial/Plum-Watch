package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* renamed from: io.appmetrica.analytics.impl.j4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3313j4 {

    /* renamed from: a, reason: collision with root package name */
    public final C3289i4 f18336a;
    public volatile G9 b;
    public volatile G9 c;

    public C3313j4() {
        this(new C3289i4());
    }

    public final IHandlerExecutor a() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    this.f18336a.getClass();
                    HandlerThreadC3296ib a2 = G9.a("IAA-CDE");
                    this.b = new G9(a2, a2.getLooper(), new Handler(a2.getLooper()));
                }
            }
        }
        return this.b;
    }

    public final ICommonExecutor b() {
        if (this.c == null) {
            synchronized (this) {
                if (this.c == null) {
                    this.f18336a.getClass();
                    HandlerThreadC3296ib a2 = G9.a("IAA-CRS");
                    this.c = new G9(a2, a2.getLooper(), new Handler(a2.getLooper()));
                }
            }
        }
        return this.c;
    }

    public C3313j4(C3289i4 c3289i4) {
        this.f18336a = c3289i4;
    }
}
