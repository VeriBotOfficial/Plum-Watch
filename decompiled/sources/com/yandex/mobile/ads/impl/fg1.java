package com.yandex.mobile.ads.impl;

import android.text.TextUtils;

/* loaded from: classes5.dex */
public final class fg1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f15492a = "Yandex";
    private final String b = "7.12.2";

    public final String b() {
        return this.f15492a;
    }

    public final String c() {
        return this.b;
    }

    private fg1() {
    }

    public static fg1 a() {
        if (TextUtils.isEmpty("Yandex")) {
            throw new IllegalArgumentException("Name is null or empty");
        }
        if (!TextUtils.isEmpty("7.12.2")) {
            return new fg1();
        }
        throw new IllegalArgumentException("Version is null or empty");
    }
}
