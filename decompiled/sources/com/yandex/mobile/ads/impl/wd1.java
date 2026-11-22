package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class wd1 extends qg<String, String> {

    /* renamed from: a, reason: collision with root package name */
    private final rr1 f17240a;

    public wd1(rr1 reviewCountFormatter) {
        Intrinsics.checkNotNullParameter(reviewCountFormatter, "reviewCountFormatter");
        this.f17240a = reviewCountFormatter;
    }

    @Override // com.yandex.mobile.ads.impl.qg
    public final ig a(Object obj, String name) {
        String value = (String) obj;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.areEqual("review_count", name)) {
            try {
                value = this.f17240a.a(value);
            } catch (t61 unused) {
            }
        }
        return qg.a(name, "string", value);
    }
}
