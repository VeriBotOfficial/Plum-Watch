package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes5.dex */
final class fk2 implements n32 {
    private final List<bk2> b;
    private final long[] c;
    private final long[] d;

    @Override // com.yandex.mobile.ads.impl.n32
    public final List<hv> b(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < this.b.size(); i++) {
            long[] jArr = this.c;
            int i2 = i * 2;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                bk2 bk2Var = this.b.get(i);
                hv hvVar = bk2Var.f15118a;
                if (hvVar.f == -3.4028235E38f) {
                    arrayList2.add(bk2Var);
                } else {
                    arrayList.add(hvVar);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: com.yandex.mobile.ads.impl.fk2$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int a2;
                a2 = fk2.a((bk2) obj, (bk2) obj2);
                return a2;
            }
        });
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            arrayList.add(((bk2) arrayList2.get(i3)).f15118a.a().a(1, (-1) - i3).a());
        }
        return arrayList;
    }

    public fk2(ArrayList arrayList) {
        this.b = Collections.unmodifiableList(new ArrayList(arrayList));
        this.c = new long[arrayList.size() * 2];
        for (int i = 0; i < arrayList.size(); i++) {
            bk2 bk2Var = (bk2) arrayList.get(i);
            int i2 = i * 2;
            long[] jArr = this.c;
            jArr[i2] = bk2Var.b;
            jArr[i2 + 1] = bk2Var.c;
        }
        long[] jArr2 = this.c;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.d = copyOf;
        Arrays.sort(copyOf);
    }

    @Override // com.yandex.mobile.ads.impl.n32
    public final long a(int i) {
        if (i >= 0) {
            long[] jArr = this.d;
            if (i < jArr.length) {
                return jArr[i];
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    @Override // com.yandex.mobile.ads.impl.n32
    public final int a() {
        return this.d.length;
    }

    @Override // com.yandex.mobile.ads.impl.n32
    public final int a(long j) {
        int a2 = f92.a(this.d, j, false);
        if (a2 < this.d.length) {
            return a2;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(bk2 bk2Var, bk2 bk2Var2) {
        return Long.compare(bk2Var.b, bk2Var2.b);
    }
}
