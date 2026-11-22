package com.yandex.mobile.ads.impl;

import android.text.TextUtils;

/* loaded from: classes5.dex */
public final class kf0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f16014a;
    private final String b;

    public final String toString() {
        return "Header[name=" + this.f16014a + ",value=" + this.b + "]";
    }

    public kf0(String str, String str2) {
        this.f16014a = str;
        this.b = str2;
    }

    public final String a() {
        return this.f16014a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && kf0.class == obj.getClass()) {
            kf0 kf0Var = (kf0) obj;
            if (TextUtils.equals(this.f16014a, kf0Var.f16014a) && TextUtils.equals(this.b, kf0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f16014a.hashCode() * 31);
    }
}
