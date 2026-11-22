package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y10 extends b20 {
    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final boolean isCustomTypeSupported(String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return Intrinsics.areEqual("linear_progress_view", type);
    }
}
