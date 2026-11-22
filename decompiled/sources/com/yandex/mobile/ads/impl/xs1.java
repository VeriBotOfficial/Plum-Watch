package com.yandex.mobile.ads.impl;

import java.io.IOException;
import kotlin.ExceptionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class xs1 extends RuntimeException {
    private final IOException b;
    private IOException c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xs1(IOException firstConnectException) {
        super(firstConnectException);
        Intrinsics.checkNotNullParameter(firstConnectException, "firstConnectException");
        this.b = firstConnectException;
        this.c = firstConnectException;
    }

    public final void a(IOException e) {
        Intrinsics.checkNotNullParameter(e, "e");
        ExceptionsKt.addSuppressed(this.b, e);
        this.c = e;
    }

    public final IOException b() {
        return this.c;
    }

    public final IOException a() {
        return this.b;
    }
}
