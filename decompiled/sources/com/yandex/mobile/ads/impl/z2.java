package com.yandex.mobile.ads.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z2 {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashMap f17478a;

    public z2(List<gt> adBreaks) {
        Intrinsics.checkNotNullParameter(adBreaks, "adBreaks");
        this.f17478a = a(adBreaks);
    }

    private static LinkedHashMap a(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            linkedHashMap.put((gt) it.next(), y2.b);
        }
        return linkedHashMap;
    }

    public final y2 a(gt adBreak) {
        Intrinsics.checkNotNullParameter(adBreak, "adBreak");
        y2 y2Var = (y2) this.f17478a.get(adBreak);
        return y2Var == null ? y2.f : y2Var;
    }

    public final boolean a() {
        List listOf = CollectionsKt.listOf((Object[]) new y2[]{y2.i, y2.h});
        Collection values = this.f17478a.values();
        if (!(values instanceof Collection) || !values.isEmpty()) {
            Iterator it = values.iterator();
            while (it.hasNext()) {
                if (listOf.contains((y2) it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void a(gt adBreak, y2 status) {
        Intrinsics.checkNotNullParameter(adBreak, "adBreak");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f17478a.put(adBreak, status);
    }
}
