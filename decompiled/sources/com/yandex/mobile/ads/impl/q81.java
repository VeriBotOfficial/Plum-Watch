package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.mg1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q81 implements yc0 {

    /* renamed from: a, reason: collision with root package name */
    private final mg1 f16639a;
    private final mz b;
    private k3 c;
    private yl1 d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q81(k3 k3Var, f52 f52Var, yl1 yl1Var) {
        this(k3Var, f52Var, yl1Var, mg1.a.a(false), f52Var.d());
        int i = mg1.f16237a;
    }

    public static final void b(q81 q81Var) {
        yl1 yl1Var = q81Var.d;
        if (yl1Var != null) {
            yl1Var.a();
        }
        k3 k3Var = q81Var.c;
        if (k3Var != null) {
            k3Var.b();
        }
    }

    public q81(k3 adCompleteListener, f52 timeProviderContainer, yl1 progressListener, mg1 pausableTimer, mz defaultContentDelayProvider) {
        Intrinsics.checkNotNullParameter(adCompleteListener, "adCompleteListener");
        Intrinsics.checkNotNullParameter(timeProviderContainer, "timeProviderContainer");
        Intrinsics.checkNotNullParameter(progressListener, "progressListener");
        Intrinsics.checkNotNullParameter(pausableTimer, "pausableTimer");
        Intrinsics.checkNotNullParameter(defaultContentDelayProvider, "defaultContentDelayProvider");
        this.f16639a = pausableTimer;
        this.b = defaultContentDelayProvider;
        this.c = adCompleteListener;
        this.d = progressListener;
    }

    @Override // com.yandex.mobile.ads.impl.yc0
    public final void start() {
        a aVar = new a();
        long a2 = this.b.a();
        this.f16639a.a(new b(a2));
        this.f16639a.a(a2, aVar);
    }

    @Override // com.yandex.mobile.ads.impl.yc0
    public final void resume() {
        this.f16639a.resume();
    }

    @Override // com.yandex.mobile.ads.impl.yc0
    public final void pause() {
        this.f16639a.pause();
    }

    @Override // com.yandex.mobile.ads.impl.yc0
    public final void invalidate() {
        this.f16639a.invalidate();
        this.f16639a.a(null);
        this.c = null;
        this.d = null;
    }

    private final class a implements og1 {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.og1
        public final void a() {
            q81.b(q81.this);
        }
    }

    private final class b implements m52 {

        /* renamed from: a, reason: collision with root package name */
        private final long f16641a;

        public b(long j) {
            this.f16641a = j;
        }

        @Override // com.yandex.mobile.ads.impl.m52
        public final void a(long j, long j2) {
            yl1 yl1Var = q81.this.d;
            if (yl1Var != null) {
                long j3 = this.f16641a;
                yl1Var.a(j3, j3 - j);
            }
        }
    }
}
