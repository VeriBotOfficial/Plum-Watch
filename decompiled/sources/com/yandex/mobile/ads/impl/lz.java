package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.mg1;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class lz implements rp {

    /* renamed from: a, reason: collision with root package name */
    private final View f16188a;
    private final op b;
    private final dw c;
    private final long d;
    private final aq e;
    private final mg1 f;

    @Override // com.yandex.mobile.ads.impl.rp
    public final void a(boolean z) {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lz(View view, op opVar, dw dwVar, long j, aq aqVar) {
        this(view, opVar, dwVar, j, aqVar, mg1.a.a(true));
        int i = mg1.f16237a;
    }

    public lz(View closeButton, op closeAppearanceController, dw debugEventsReporter, long j, aq closeTimerProgressIncrementer, mg1 pausableTimer) {
        Intrinsics.checkNotNullParameter(closeButton, "closeButton");
        Intrinsics.checkNotNullParameter(closeAppearanceController, "closeAppearanceController");
        Intrinsics.checkNotNullParameter(debugEventsReporter, "debugEventsReporter");
        Intrinsics.checkNotNullParameter(closeTimerProgressIncrementer, "closeTimerProgressIncrementer");
        Intrinsics.checkNotNullParameter(pausableTimer, "pausableTimer");
        this.f16188a = closeButton;
        this.b = closeAppearanceController;
        this.c = debugEventsReporter;
        this.d = j;
        this.e = closeTimerProgressIncrementer;
        this.f = pausableTimer;
        closeAppearanceController.a(d());
    }

    @Override // com.yandex.mobile.ads.impl.rp
    public final View d() {
        return this.f16188a;
    }

    @Override // com.yandex.mobile.ads.impl.rp
    public final void c() {
        a aVar = new a(this.f16188a, this.b, this.c);
        long max = (long) Math.max(0.0d, this.d - this.e.a());
        if (max == 0) {
            this.b.b(this.f16188a);
            return;
        }
        this.f.a(this.e);
        this.f.a(max, aVar);
        this.c.a(cw.d);
    }

    @Override // com.yandex.mobile.ads.impl.rp
    public final void b() {
        this.f.pause();
    }

    @Override // com.yandex.mobile.ads.impl.rp
    public final void a() {
        this.f.resume();
    }

    @Override // com.yandex.mobile.ads.impl.rp
    public final void invalidate() {
        this.f.invalidate();
    }

    private static final class a implements og1 {

        /* renamed from: a, reason: collision with root package name */
        private final op f16189a;
        private final dw b;
        private final WeakReference<View> c;

        public a(View view, op closeAppearanceController, dw debugEventsReporter) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(closeAppearanceController, "closeAppearanceController");
            Intrinsics.checkNotNullParameter(debugEventsReporter, "debugEventsReporter");
            this.f16189a = closeAppearanceController;
            this.b = debugEventsReporter;
            this.c = new WeakReference<>(view);
        }

        @Override // com.yandex.mobile.ads.impl.og1
        public final void a() {
            View view = this.c.get();
            if (view != null) {
                this.f16189a.b(view);
                this.b.a(cw.e);
            }
        }
    }
}
