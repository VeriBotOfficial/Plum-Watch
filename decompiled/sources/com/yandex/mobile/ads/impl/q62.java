package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q62 {

    /* renamed from: a, reason: collision with root package name */
    private final String f16633a;
    private final long b;
    private final int c;
    private final fy1 d;
    private Long e;

    public q62(int i, long j, fy1 showNoticeType, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(showNoticeType, "showNoticeType");
        this.f16633a = url;
        this.b = j;
        this.c = i;
        this.d = showNoticeType;
    }

    public final String d() {
        return this.f16633a;
    }

    public final long a() {
        return this.b;
    }

    public final int e() {
        return this.c;
    }

    public final fy1 c() {
        return this.d;
    }

    public final Long b() {
        return this.e;
    }

    public final void a(Long l) {
        this.e = l;
    }
}
