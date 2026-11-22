package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ki2 {

    /* renamed from: a, reason: collision with root package name */
    private final List<p2> f16024a;

    public ki2(String version, ArrayList adBreaks, ArrayList extensions) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(adBreaks, "adBreaks");
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        this.f16024a = adBreaks;
    }

    public final List<p2> a() {
        return this.f16024a;
    }
}
