package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.a62;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes5.dex */
public final class r40 implements a62 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f16726a = new byte[4096];

    @Override // com.yandex.mobile.ads.impl.a62
    public final void a(long j, int i, int i2, int i3, a62.a aVar) {
    }

    @Override // com.yandex.mobile.ads.impl.a62
    public final void a(jc0 jc0Var) {
    }

    @Override // com.yandex.mobile.ads.impl.a62
    public final void b(int i, ag1 ag1Var) {
        ag1Var.f(i);
    }

    @Override // com.yandex.mobile.ads.impl.a62
    public final int a(qv qvVar, int i, boolean z) throws IOException {
        int read = qvVar.read(this.f16726a, 0, Math.min(this.f16726a.length, i));
        if (read != -1) {
            return read;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }
}
