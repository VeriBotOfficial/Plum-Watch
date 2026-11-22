package com.yandex.mobile.ads.impl;

import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z41 {

    /* renamed from: a, reason: collision with root package name */
    private final String f17482a;
    private final String b;
    private final x71 c;

    public z41(String assetName, String clickActionType, x71 x71Var) {
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        Intrinsics.checkNotNullParameter(clickActionType, "clickActionType");
        this.f17482a = assetName;
        this.b = clickActionType;
        this.c = x71Var;
    }

    public final Map<String, Object> a() {
        Map createMapBuilder = MapsKt.createMapBuilder();
        createMapBuilder.put("asset_name", this.f17482a);
        createMapBuilder.put("action_type", this.b);
        x71 x71Var = this.c;
        if (x71Var != null) {
            createMapBuilder.putAll(x71Var.a().b());
        }
        return MapsKt.build(createMapBuilder);
    }
}
