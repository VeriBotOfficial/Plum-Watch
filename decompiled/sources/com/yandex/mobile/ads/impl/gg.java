package com.yandex.mobile.ads.impl;

/* loaded from: classes5.dex */
public final class gg {

    /* renamed from: a, reason: collision with root package name */
    private final float f15586a;

    public gg(float f) {
        this.f15586a = f == 0.0f ? 1.7777778f : f;
    }

    public final int b(int i) {
        return Math.round(i * this.f15586a);
    }

    public final int a(int i) {
        return Math.round(i / this.f15586a);
    }
}
