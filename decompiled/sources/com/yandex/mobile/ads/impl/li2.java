package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class li2 extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public li2() {
        super("Empty version attribute");
        Intrinsics.checkNotNullParameter("Empty version attribute", "message");
    }
}
