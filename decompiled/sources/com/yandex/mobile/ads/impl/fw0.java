package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;

/* loaded from: classes5.dex */
public final class fw0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f15531a;
    private final int b;
    private final int c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fw0)) {
            return false;
        }
        fw0 fw0Var = (fw0) obj;
        return this.f15531a == fw0Var.f15531a && this.b == fw0Var.b && this.c == fw0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + dy1.a(this.b, Integer.hashCode(this.f15531a) * 31, 31);
    }

    public final String toString() {
        return "MediaFileInfo(width=" + this.f15531a + ", height=" + this.b + ", bitrate=" + this.c + Separators.RPAREN;
    }

    public fw0(int i, int i2, int i3) {
        this.f15531a = i;
        this.b = i2;
        this.c = i3;
    }

    public final int c() {
        return this.f15531a;
    }

    public final int b() {
        return this.b;
    }

    public final int a() {
        return this.c;
    }
}
