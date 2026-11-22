package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class hb2 implements Comparable<hb2> {
    private final int b;
    private final int c;
    private final int d;

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(hb2 other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int i = this.b;
        int i2 = other.b;
        if (i != i2) {
            return Intrinsics.compare(i, i2);
        }
        int i3 = this.c;
        int i4 = other.c;
        return i3 != i4 ? Intrinsics.compare(i3, i4) : Intrinsics.compare(this.d, other.d);
    }

    public hb2(int i, int i2, int i3) {
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final int a() {
        return this.b;
    }
}
