package com.yandex.mobile.ads.impl;

import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;

/* loaded from: classes5.dex */
public final class yg1 implements zg1 {
    @Override // com.yandex.mobile.ads.impl.zg1
    public final Map<String, Object> a(long j) {
        return MapsKt.mapOf(TuplesKt.to("duration", Long.valueOf(j)));
    }
}
