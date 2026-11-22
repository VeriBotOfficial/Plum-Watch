package com.yandex.mobile.ads.impl;

import com.anythink.basead.ui.improveclick.g;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e20 extends b20 {
    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final boolean isCustomTypeSupported(String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return Intrinsics.areEqual(g.a.k, type);
    }
}
