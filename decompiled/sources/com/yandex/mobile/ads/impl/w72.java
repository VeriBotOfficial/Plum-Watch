package com.yandex.mobile.ads.impl;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
final class w72 implements n32 {
    private final s72 b;
    private final long[] c;
    private final Map<String, v72> d;
    private final Map<String, t72> e;
    private final Map<String, String> f;

    public w72(s72 s72Var, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.b = s72Var;
        this.e = hashMap2;
        this.f = hashMap3;
        this.d = Collections.unmodifiableMap(hashMap);
        this.c = s72Var.b();
    }

    @Override // com.yandex.mobile.ads.impl.n32
    public final long a(int i) {
        return this.c[i];
    }

    @Override // com.yandex.mobile.ads.impl.n32
    public final List<hv> b(long j) {
        return this.b.a(j, this.d, this.e, this.f);
    }

    @Override // com.yandex.mobile.ads.impl.n32
    public final int a() {
        return this.c.length;
    }

    @Override // com.yandex.mobile.ads.impl.n32
    public final int a(long j) {
        int a2 = f92.a(this.c, j, false);
        if (a2 < this.c.length) {
            return a2;
        }
        return -1;
    }
}
