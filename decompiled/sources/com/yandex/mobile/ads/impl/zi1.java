package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.Player;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class zi1 {

    /* renamed from: a, reason: collision with root package name */
    private final b70 f17527a;
    private Float b;

    public zi1(b70 playerProvider) {
        Intrinsics.checkNotNullParameter(playerProvider, "playerProvider");
        this.f17527a = playerProvider;
    }

    public final void a(float f) {
        if (this.b == null) {
            this.b = a();
        }
        Player a2 = this.f17527a.a();
        if (a2 == null) {
            return;
        }
        a2.setVolume(f);
    }

    public final void b() {
        Float f = this.b;
        if (f != null) {
            float floatValue = f.floatValue();
            Player a2 = this.f17527a.a();
            if (a2 != null) {
                a2.setVolume(floatValue);
            }
        }
        this.b = null;
    }

    public final Float a() {
        Player a2 = this.f17527a.a();
        if (a2 != null) {
            return Float.valueOf(a2.getVolume());
        }
        return null;
    }
}
