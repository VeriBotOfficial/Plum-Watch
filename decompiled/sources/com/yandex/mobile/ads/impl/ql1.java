package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ProgressBar;
import com.yandex.mobile.ads.impl.mg1;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ql1 implements rp {

    /* renamed from: a, reason: collision with root package name */
    private final View f16679a;
    private final ProgressBar b;
    private final op c;
    private final yp d;
    private final dw e;
    private final xl1 f;
    private final long g;
    private final mg1 h;
    private final og1 i;
    private final m52 j;

    public ql1(View closeButton, ProgressBar closeProgressView, h50 closeAppearanceController, yp closeProgressAppearanceController, dw debugEventsReporter, xl1 progressIncrementer, long j) {
        Intrinsics.checkNotNullParameter(closeButton, "closeButton");
        Intrinsics.checkNotNullParameter(closeProgressView, "closeProgressView");
        Intrinsics.checkNotNullParameter(closeAppearanceController, "closeAppearanceController");
        Intrinsics.checkNotNullParameter(closeProgressAppearanceController, "closeProgressAppearanceController");
        Intrinsics.checkNotNullParameter(debugEventsReporter, "debugEventsReporter");
        Intrinsics.checkNotNullParameter(progressIncrementer, "progressIncrementer");
        this.f16679a = closeButton;
        this.b = closeProgressView;
        this.c = closeAppearanceController;
        this.d = closeProgressAppearanceController;
        this.e = debugEventsReporter;
        this.f = progressIncrementer;
        this.g = j;
        int i = mg1.f16237a;
        this.h = mg1.a.a(true);
        this.i = new b(d(), closeAppearanceController, debugEventsReporter);
        this.j = new a(closeProgressView, closeProgressAppearanceController, j);
    }

    @Override // com.yandex.mobile.ads.impl.rp
    public final void a(boolean z) {
    }

    @Override // com.yandex.mobile.ads.impl.rp
    public final View d() {
        return this.f16679a;
    }

    @Override // com.yandex.mobile.ads.impl.rp
    public final void c() {
        yp ypVar = this.d;
        ProgressBar progressBar = this.b;
        int i = (int) this.g;
        int a2 = (int) this.f.a();
        ypVar.getClass();
        Intrinsics.checkNotNullParameter(progressBar, "progressBar");
        progressBar.setMax(i);
        progressBar.setVisibility(0);
        progressBar.setProgress(a2);
        long max = Math.max(0L, this.g - this.f.a());
        if (max != 0) {
            this.c.a(this.f16679a);
            this.h.a(this.j);
            this.h.a(max, this.i);
            this.e.a(cw.d);
        }
    }

    @Override // com.yandex.mobile.ads.impl.rp
    public final void b() {
        this.h.pause();
    }

    @Override // com.yandex.mobile.ads.impl.rp
    public final void a() {
        this.h.resume();
    }

    @Override // com.yandex.mobile.ads.impl.rp
    public final void invalidate() {
        this.h.invalidate();
    }

    private static final class b implements og1 {

        /* renamed from: a, reason: collision with root package name */
        private final op f16681a;
        private final dw b;
        private final WeakReference<View> c;

        public b(View closeView, h50 closeAppearanceController, dw debugEventsReporter) {
            Intrinsics.checkNotNullParameter(closeView, "closeView");
            Intrinsics.checkNotNullParameter(closeAppearanceController, "closeAppearanceController");
            Intrinsics.checkNotNullParameter(debugEventsReporter, "debugEventsReporter");
            this.f16681a = closeAppearanceController;
            this.b = debugEventsReporter;
            this.c = new WeakReference<>(closeView);
        }

        @Override // com.yandex.mobile.ads.impl.og1
        public final void a() {
            View view = this.c.get();
            if (view != null) {
                this.f16681a.b(view);
                this.b.a(cw.e);
            }
        }
    }

    private static final class a implements m52 {

        /* renamed from: a, reason: collision with root package name */
        private final yp f16680a;
        private final long b;
        private final WeakReference<ProgressBar> c;

        public a(ProgressBar progressView, yp closeProgressAppearanceController, long j) {
            Intrinsics.checkNotNullParameter(progressView, "progressView");
            Intrinsics.checkNotNullParameter(closeProgressAppearanceController, "closeProgressAppearanceController");
            this.f16680a = closeProgressAppearanceController;
            this.b = j;
            this.c = new WeakReference<>(progressView);
        }

        @Override // com.yandex.mobile.ads.impl.m52
        public final void a(long j, long j2) {
            ProgressBar progressBar = this.c.get();
            if (progressBar != null) {
                yp ypVar = this.f16680a;
                long j3 = this.b;
                ypVar.a(progressBar, j3, j3 - j);
            }
        }
    }
}
