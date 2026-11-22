package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ea1 {

    /* renamed from: a, reason: collision with root package name */
    private final zr1 f15367a;
    private final yc0 b;
    private View c;

    public /* synthetic */ ea1(o52 o52Var, n91 n91Var, f52 f52Var) {
        this(o52Var, n91Var, f52Var, new as1(), new zr1(o52Var));
    }

    public ea1(o52 timerViewProvider, n91 nativeMediaContent, f52 timeProviderContainer, as1 rewardViewControllerProvider, zr1 rewardTimerViewController) {
        Intrinsics.checkNotNullParameter(timerViewProvider, "timerViewProvider");
        Intrinsics.checkNotNullParameter(nativeMediaContent, "nativeMediaContent");
        Intrinsics.checkNotNullParameter(timeProviderContainer, "timeProviderContainer");
        Intrinsics.checkNotNullParameter(rewardViewControllerProvider, "rewardViewControllerProvider");
        Intrinsics.checkNotNullParameter(rewardTimerViewController, "rewardTimerViewController");
        this.f15367a = rewardTimerViewController;
        a aVar = new a();
        rewardViewControllerProvider.getClass();
        this.b = as1.a(aVar, nativeMediaContent, timeProviderContainer);
    }

    public final void c() {
        yc0 yc0Var = this.b;
        if (yc0Var != null) {
            yc0Var.resume();
        }
    }

    private final class a implements yl1 {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.yl1
        public final void a(long j, long j2) {
            View view = ea1.this.c;
            if (view != null) {
                ea1.this.f15367a.a(view, j, j2);
            }
        }

        @Override // com.yandex.mobile.ads.impl.yl1
        public final void a() {
            View view = ea1.this.c;
            if (view == null) {
                return;
            }
            view.setVisibility(8);
        }
    }

    public final void b() {
        yc0 yc0Var = this.b;
        if (yc0Var != null) {
            yc0Var.pause();
        }
    }

    public final void a() {
        this.c = null;
        yc0 yc0Var = this.b;
        if (yc0Var != null) {
            yc0Var.invalidate();
        }
    }

    public final void a(View view) {
        this.c = view;
        yc0 yc0Var = this.b;
        if (yc0Var != null) {
            yc0Var.start();
        }
    }
}
