package com.yandex.mobile.ads.impl;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z22 extends IOException {
    public final t50 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z22(t50 errorCode) {
        super("stream was reset: " + errorCode);
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.b = errorCode;
    }
}
