package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes5.dex */
public final class mo2 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f16268a;

    final void a(Context context) {
        if (context != null) {
            if (this.f16268a) {
                return;
            }
            this.f16268a = true;
            cp2.a().a(context);
            go2.a().a(context);
            io2.a(context);
            ro2.a().a(context);
            return;
        }
        throw new IllegalArgumentException("Application Context cannot be null");
    }

    final boolean a() {
        return this.f16268a;
    }
}
