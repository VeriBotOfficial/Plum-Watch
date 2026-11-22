package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n4 {

    /* renamed from: a, reason: collision with root package name */
    private final mt0 f16303a;
    private final mi b;

    public final String a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f16303a.getClass();
        String a2 = mt0.a(context);
        if (a2 == null) {
            a2 = this.b.a(context);
        }
        return a(a2);
    }

    public /* synthetic */ n4() {
        this(new mt0(), new mi());
    }

    public n4(mt0 manifestAnalyzer, mi availableHostSelector) {
        Intrinsics.checkNotNullParameter(manifestAnalyzer, "manifestAnalyzer");
        Intrinsics.checkNotNullParameter(availableHostSelector, "availableHostSelector");
        this.f16303a = manifestAnalyzer;
        this.b = availableHostSelector;
    }

    private static String a(String str) {
        return "https://" + str;
    }
}
