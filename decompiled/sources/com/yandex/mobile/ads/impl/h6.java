package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h6 implements z1 {

    /* renamed from: a, reason: collision with root package name */
    private final long f15659a;

    public h6(List<m6> adPodItems) {
        Intrinsics.checkNotNullParameter(adPodItems, "adPodItems");
        Iterator<T> it = adPodItems.iterator();
        long j = 0;
        while (it.hasNext()) {
            j += ((m6) it.next()).a();
        }
        this.f15659a = j;
    }

    @Override // com.yandex.mobile.ads.impl.z1
    public final long a() {
        return this.f15659a;
    }

    @Override // com.yandex.mobile.ads.impl.z1
    public final long a(long j) {
        return this.f15659a;
    }
}
