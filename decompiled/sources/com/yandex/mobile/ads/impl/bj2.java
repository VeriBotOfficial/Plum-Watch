package com.yandex.mobile.ads.impl;

import android.view.View;
import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class bj2 {

    /* renamed from: a, reason: collision with root package name */
    private final int f15115a;
    private final int b;

    public final void a(View volumeControl, boolean z) {
        Intrinsics.checkNotNullParameter(volumeControl, "volumeControl");
        volumeControl.setBackground(ContextCompat.getDrawable(volumeControl.getContext(), z ? this.f15115a : this.b));
    }

    public bj2(int i, int i2) {
        this.f15115a = i;
        this.b = i2;
    }
}
