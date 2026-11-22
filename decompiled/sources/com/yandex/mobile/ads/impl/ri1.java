package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ri1 {

    /* renamed from: a, reason: collision with root package name */
    private final r9 f16767a;
    private final n3 b;
    private final me2 c;
    private final z5 d;
    private boolean e;

    public ri1(r9 adStateHolder, n3 adCompletionListener, me2 videoCompletedNotifier, z5 adPlayerEventsController) {
        Intrinsics.checkNotNullParameter(adStateHolder, "adStateHolder");
        Intrinsics.checkNotNullParameter(adCompletionListener, "adCompletionListener");
        Intrinsics.checkNotNullParameter(videoCompletedNotifier, "videoCompletedNotifier");
        Intrinsics.checkNotNullParameter(adPlayerEventsController, "adPlayerEventsController");
        this.f16767a = adStateHolder;
        this.b = adCompletionListener;
        this.c = videoCompletedNotifier;
        this.d = adPlayerEventsController;
    }

    public final void a(boolean z, int i) {
        cj1 c = this.f16767a.c();
        if (c == null) {
            return;
        }
        v4 a2 = c.a();
        go0 b = c.b();
        if (wm0.b == this.f16767a.a(b)) {
            if (z && i == 2) {
                this.c.c();
                return;
            }
            return;
        }
        if (i == 2) {
            this.e = true;
            this.d.i(b);
        } else if (i == 3 && this.e) {
            this.e = false;
            this.d.h(b);
        } else if (i == 4) {
            this.b.a(a2, b);
        }
    }
}
