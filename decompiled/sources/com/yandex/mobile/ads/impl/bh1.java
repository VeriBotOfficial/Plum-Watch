package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* loaded from: classes5.dex */
public final class bh1 {

    /* renamed from: a, reason: collision with root package name */
    private final g5 f15109a;

    public bh1(g5 adLoadingPhasesManager) {
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        this.f15109a = adLoadingPhasesManager;
    }

    public final LinkedHashMap a(Set phases) {
        Intrinsics.checkNotNullParameter(phases, "phases");
        Sequence<e5> filter = SequencesKt.filter(CollectionsKt.asSequence(this.f15109a.b()), new ah1(phases));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (e5 e5Var : filter) {
            String a2 = e5Var.a().a();
            Object obj = linkedHashMap.get(a2);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(a2, obj);
            }
            ((List) obj).add(e5Var.b());
        }
        return linkedHashMap;
    }
}
