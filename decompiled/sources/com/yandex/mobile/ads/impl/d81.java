package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d81 {

    /* renamed from: a, reason: collision with root package name */
    private final qe2 f15256a;
    private final n91 b;

    public d81(qe2 videoEventController, n91 nativeMediaContent) {
        Intrinsics.checkNotNullParameter(videoEventController, "videoEventController");
        Intrinsics.checkNotNullParameter(nativeMediaContent, "nativeMediaContent");
        this.f15256a = videoEventController;
        this.b = nativeMediaContent;
    }

    public final e81 a() {
        db1 a2 = this.b.a();
        if (a2 == null) {
            return null;
        }
        qe2 qe2Var = this.f15256a;
        return new e81(a2, qe2Var, qe2Var);
    }
}
