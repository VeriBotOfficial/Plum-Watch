package com.yandex.mobile.ads.impl;

import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* loaded from: classes5.dex */
public final class p00 {
    static final /* synthetic */ KProperty<Object>[] e = {ta.a(p00.class, "weakSkipButton", "getWeakSkipButton()Landroid/view/View;", 0)};

    /* renamed from: a, reason: collision with root package name */
    private final lz1 f16506a;
    private final long b;
    private final mg1 c;
    private final go1 d;

    public p00(View skipButton, lz1 skipAppearanceController, long j, mg1 pausableTimer) {
        Intrinsics.checkNotNullParameter(skipButton, "skipButton");
        Intrinsics.checkNotNullParameter(skipAppearanceController, "skipAppearanceController");
        Intrinsics.checkNotNullParameter(pausableTimer, "pausableTimer");
        this.f16506a = skipAppearanceController;
        this.b = j;
        this.c = pausableTimer;
        this.d = ho1.a(skipButton);
        skipAppearanceController.a(skipButton);
    }

    public final void b() {
        View view = (View) this.d.getValue(this, e[0]);
        if (view != null) {
            a aVar = new a(view, this.f16506a);
            long j = this.b;
            if (j == 0) {
                this.f16506a.b(view);
            } else {
                this.c.a(j, aVar);
            }
        }
    }

    public final void c() {
        this.c.pause();
    }

    public final void d() {
        this.c.resume();
    }

    public final void a() {
        this.c.invalidate();
    }

    private static final class a implements og1 {

        /* renamed from: a, reason: collision with root package name */
        private final lz1 f16507a;
        private final WeakReference<View> b;

        public a(View view, lz1 skipAppearanceController) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(skipAppearanceController, "skipAppearanceController");
            this.f16507a = skipAppearanceController;
            this.b = new WeakReference<>(view);
        }

        @Override // com.yandex.mobile.ads.impl.og1
        public final void a() {
            View view = this.b.get();
            if (view != null) {
                this.f16507a.b(view);
            }
        }
    }
}
