package com.yandex.mobile.ads.impl;

import java.util.LinkedHashMap;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class kd2 implements ch1 {

    /* renamed from: a, reason: collision with root package name */
    private final bh1 f16009a;

    public /* synthetic */ kd2(g5 g5Var) {
        this(g5Var, new bh1(g5Var));
    }

    @Override // com.yandex.mobile.ads.impl.ch1
    public final LinkedHashMap a() {
        return this.f16009a.a(SetsKt.setOf((Object[]) new f5[]{f5.w, f5.x}));
    }

    public kd2(g5 adLoadingPhasesManager, bh1 phasesParametersExtractor) {
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(phasesParametersExtractor, "phasesParametersExtractor");
        this.f16009a = phasesParametersExtractor;
    }
}
