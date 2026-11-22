package com.yandex.mobile.ads.impl;

import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
final class y72 implements n32 {
    public static final y72 c = new y72();
    private final List<hv> b;

    @Override // com.yandex.mobile.ads.impl.n32
    public final int a() {
        return 1;
    }

    @Override // com.yandex.mobile.ads.impl.n32
    public final int a(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // com.yandex.mobile.ads.impl.n32
    public final long a(int i) {
        if (i == 0) {
            return 0L;
        }
        throw new IllegalArgumentException();
    }

    private y72() {
        this.b = Collections.emptyList();
    }

    @Override // com.yandex.mobile.ads.impl.n32
    public final List<hv> b(long j) {
        return j >= 0 ? this.b : Collections.emptyList();
    }

    public y72(hv hvVar) {
        this.b = Collections.singletonList(hvVar);
    }
}
