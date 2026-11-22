package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.a81;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class xz1 extends o41 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xz1(List<? extends ig<?>> assets, w71 configuration) {
        super(assets, configuration);
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
    }

    @Override // com.yandex.mobile.ads.impl.o41
    public final boolean a(a81.a validator, List<? extends ig<?>> assets) {
        Intrinsics.checkNotNullParameter(validator, "validator");
        Intrinsics.checkNotNullParameter(assets, "assets");
        b().c();
        return validator.a(assets);
    }
}
