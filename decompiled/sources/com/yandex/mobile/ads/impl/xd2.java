package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class xd2 {
    public static wd2 a(List videoAds) {
        Intrinsics.checkNotNullParameter(videoAds, "videoAds");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : videoAds) {
            if (((mb2) obj).o()) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        return new wd2((List) pair.component2(), (List) pair.component1());
    }
}
