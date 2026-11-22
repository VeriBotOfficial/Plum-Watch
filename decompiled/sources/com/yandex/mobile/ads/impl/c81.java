package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c81<V extends ViewGroup> implements b10<V> {

    /* renamed from: a, reason: collision with root package name */
    private final e81 f15167a;

    @Override // com.yandex.mobile.ads.impl.b10
    public final void a(V container) {
        Intrinsics.checkNotNullParameter(container, "container");
        e81 e81Var = this.f15167a;
        if (e81Var != null) {
            e81Var.d();
        }
    }

    public /* synthetic */ c81(n91 n91Var, qe2 qe2Var) {
        this(n91Var, qe2Var, new d81(qe2Var, n91Var));
    }

    public c81(n91 nativeMediaContent, qe2 videoEventController, d81 contentCompleteControllerFactory) {
        Intrinsics.checkNotNullParameter(nativeMediaContent, "nativeMediaContent");
        Intrinsics.checkNotNullParameter(videoEventController, "videoEventController");
        Intrinsics.checkNotNullParameter(contentCompleteControllerFactory, "contentCompleteControllerFactory");
        this.f15167a = contentCompleteControllerFactory.a();
    }

    @Override // com.yandex.mobile.ads.impl.b10
    public final void c() {
        e81 e81Var = this.f15167a;
        if (e81Var != null) {
            e81Var.c();
        }
    }
}
