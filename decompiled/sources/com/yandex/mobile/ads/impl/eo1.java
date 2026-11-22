package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.cx0;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSource;

/* loaded from: classes5.dex */
public final class eo1 extends zq1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f15409a;
    private final long b;
    private final BufferedSource c;

    public eo1(String str, long j, BufferedSource source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f15409a = str;
        this.b = j;
        this.c = source;
    }

    @Override // com.yandex.mobile.ads.impl.zq1
    public final long a() {
        return this.b;
    }

    @Override // com.yandex.mobile.ads.impl.zq1
    public final cx0 b() {
        String str = this.f15409a;
        if (str == null) {
            return null;
        }
        int i = cx0.d;
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            return cx0.a.a(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // com.yandex.mobile.ads.impl.zq1
    public final BufferedSource c() {
        return this.c;
    }
}
