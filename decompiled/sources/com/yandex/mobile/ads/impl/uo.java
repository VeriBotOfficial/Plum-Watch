package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class uo {

    /* renamed from: a, reason: collision with root package name */
    private og f17075a;

    public final void a(View view, String assetName) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        og ogVar = this.f17075a;
        if (ogVar != null) {
            ogVar.a(view, assetName);
        }
    }

    public final void a(og listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f17075a = listener;
    }
}
