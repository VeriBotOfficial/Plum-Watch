package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class he2 {

    /* renamed from: a, reason: collision with root package name */
    private final List<String> f15684a;
    private final String b;

    public he2(String str, List clickTrackings) {
        Intrinsics.checkNotNullParameter(clickTrackings, "clickTrackings");
        this.f15684a = clickTrackings;
        this.b = str;
    }

    public final List<String> b() {
        return this.f15684a;
    }

    public final String a() {
        return this.b;
    }
}
