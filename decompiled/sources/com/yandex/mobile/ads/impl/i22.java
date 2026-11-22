package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
final class i22 implements n32 {
    private final List<List<hv>> b;
    private final List<Long> c;

    public i22(ArrayList arrayList, ArrayList arrayList2) {
        this.b = arrayList;
        this.c = arrayList2;
    }

    @Override // com.yandex.mobile.ads.impl.n32
    public final long a(int i) {
        if (i >= 0) {
            if (i < this.c.size()) {
                return this.c.get(i).longValue();
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    @Override // com.yandex.mobile.ads.impl.n32
    public final List<hv> b(long j) {
        int a2 = f92.a((List) this.c, Long.valueOf(j), false);
        if (a2 == -1) {
            return Collections.emptyList();
        }
        return this.b.get(a2);
    }

    @Override // com.yandex.mobile.ads.impl.n32
    public final int a() {
        return this.c.size();
    }

    @Override // com.yandex.mobile.ads.impl.n32
    public final int a(long j) {
        int i;
        List<Long> list = this.c;
        Long valueOf = Long.valueOf(j);
        int i2 = f92.f15466a;
        int binarySearch = Collections.binarySearch(list, valueOf);
        if (binarySearch < 0) {
            i = ~binarySearch;
        } else {
            int size = list.size();
            do {
                binarySearch++;
                if (binarySearch >= size) {
                    break;
                }
            } while (list.get(binarySearch).compareTo(valueOf) == 0);
            i = binarySearch;
        }
        if (i < this.c.size()) {
            return i;
        }
        return -1;
    }
}
