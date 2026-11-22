package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v1 implements j1 {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f17105a;
    private final t8 b;

    public v1(Activity activity, t8 t8Var) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f17105a = activity;
        this.b = t8Var;
    }

    @Override // com.yandex.mobile.ads.impl.j1
    public final void a() {
        this.f17105a.finish();
    }

    @Override // com.yandex.mobile.ads.impl.j1
    public final void a(int i, Bundle bundle) {
        t8 t8Var = this.b;
        if (t8Var != null) {
            t8Var.a(i, bundle);
        }
    }

    @Override // com.yandex.mobile.ads.impl.j1
    public final void a(int i) {
        try {
            if (Build.VERSION.SDK_INT != 26) {
                this.f17105a.setRequestedOrientation(i);
            }
        } catch (Exception unused) {
            sp0.a(new Object[0]);
        }
    }
}
