package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e61 extends Exception {
    private final String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e61(String detailMessage) {
        super(detailMessage);
        Intrinsics.checkNotNullParameter(detailMessage, "detailMessage");
        this.b = detailMessage;
    }

    public final String a() {
        return this.b;
    }
}
