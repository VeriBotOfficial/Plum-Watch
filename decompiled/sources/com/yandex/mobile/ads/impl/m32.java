package com.yandex.mobile.ads.impl;

import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
final class m32 implements n32 {
    private final hv[] b;
    private final long[] c;

    public m32(hv[] hvVarArr, long[] jArr) {
        this.b = hvVarArr;
        this.c = jArr;
    }

    @Override // com.yandex.mobile.ads.impl.n32
    public final long a(int i) {
        if (i >= 0) {
            long[] jArr = this.c;
            if (i < jArr.length) {
                return jArr[i];
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    @Override // com.yandex.mobile.ads.impl.n32
    public final List<hv> b(long j) {
        hv hvVar;
        int b = f92.b(this.c, j, false);
        if (b != -1 && (hvVar = this.b[b]) != hv.s) {
            return Collections.singletonList(hvVar);
        }
        return Collections.emptyList();
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
