package com.yandex.mobile.ads.impl;

import android.app.Application;
import android.os.Build;

/* loaded from: classes5.dex */
public final class ll1 {

    /* renamed from: a, reason: collision with root package name */
    private final w0 f16141a = new w0();

    public final String a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return Application.getProcessName();
        }
        this.f16141a.getClass();
        return w0.b();
    }
}
