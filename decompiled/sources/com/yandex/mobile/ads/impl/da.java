package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class da {

    /* renamed from: a, reason: collision with root package name */
    private final fl f15262a;

    public da(fl biddingSettings) {
        Intrinsics.checkNotNullParameter(biddingSettings, "biddingSettings");
        this.f15262a = biddingSettings;
    }

    public final ba a(String str) {
        Object obj;
        Iterator<T> it = this.f15262a.c().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((ba) obj).e(), str)) {
                break;
            }
        }
        return (ba) obj;
    }
}
