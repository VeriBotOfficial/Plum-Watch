package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class et {

    /* renamed from: a, reason: collision with root package name */
    private final List<gt> f15420a;

    public et(ArrayList adBreaks) {
        Intrinsics.checkNotNullParameter(adBreaks, "adBreaks");
        this.f15420a = adBreaks;
    }

    public final void b() {
        Iterator<gt> it = this.f15420a.iterator();
        while (it.hasNext()) {
            it.next().a(null);
        }
    }

    public final List<gt> a() {
        return this.f15420a;
    }
}
