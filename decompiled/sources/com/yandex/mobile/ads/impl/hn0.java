package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class hn0 {

    /* renamed from: a, reason: collision with root package name */
    private final List<ig<?>> f15711a;

    public final ig<?> a(String assetName) {
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        List<ig<?>> list = this.f15711a;
        Object obj = null;
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Intrinsics.areEqual(((ig) next).b(), assetName)) {
                obj = next;
                break;
            }
        }
        return (ig) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public hn0(List<? extends ig<?>> list) {
        this.f15711a = list;
    }
}
