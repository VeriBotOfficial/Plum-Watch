package com.yandex.mobile.ads.impl;

import android.app.Dialog;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class bq implements eq {

    /* renamed from: a, reason: collision with root package name */
    private final Dialog f15131a;
    private final zr b;

    public bq(Dialog dialog, zr contentCloseListener) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        Intrinsics.checkNotNullParameter(contentCloseListener, "contentCloseListener");
        this.f15131a = dialog;
        this.b = contentCloseListener;
    }

    @Override // com.yandex.mobile.ads.impl.eq
    public final void a() {
        n10.a(this.f15131a);
        this.b.f();
    }

    @Override // com.yandex.mobile.ads.impl.eq
    public final void b() {
        n10.a(this.f15131a);
    }
}
