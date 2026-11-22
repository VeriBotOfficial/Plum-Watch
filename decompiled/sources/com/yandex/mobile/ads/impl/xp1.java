package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSink;

/* loaded from: classes5.dex */
public final class xp1 extends yp1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cx0 f17359a;
    final /* synthetic */ int b;
    final /* synthetic */ byte[] c;
    final /* synthetic */ int d;

    xp1(cx0 cx0Var, byte[] bArr, int i, int i2) {
        this.f17359a = cx0Var;
        this.b = i;
        this.c = bArr;
        this.d = i2;
    }

    @Override // com.yandex.mobile.ads.impl.yp1
    public final cx0 b() {
        return this.f17359a;
    }

    @Override // com.yandex.mobile.ads.impl.yp1
    public final long a() {
        return this.b;
    }

    @Override // com.yandex.mobile.ads.impl.yp1
    public final void a(BufferedSink sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        sink.write(this.c, this.d, this.b);
    }
}
