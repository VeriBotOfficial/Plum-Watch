package com.yandex.mobile.ads.impl;

import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class me {

    /* renamed from: a, reason: collision with root package name */
    private final pe f16229a;

    public me(TextView textView, pe appCompatTextViewAutoSizeHelper) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        Intrinsics.checkNotNullParameter(appCompatTextViewAutoSizeHelper, "appCompatTextViewAutoSizeHelper");
        this.f16229a = appCompatTextViewAutoSizeHelper;
    }

    public final void a() {
        this.f16229a.a();
    }

    public final void b() {
        this.f16229a.a();
    }

    public final void a(int i) {
        this.f16229a.a(i);
    }

    public final void a(int i, float f) {
        if (this.f16229a.b()) {
            return;
        }
        this.f16229a.a(i, f);
    }
}
