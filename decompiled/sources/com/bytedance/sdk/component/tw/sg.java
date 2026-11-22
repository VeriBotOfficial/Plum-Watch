package com.bytedance.sdk.component.tw;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* loaded from: classes13.dex */
public class sg<V> extends FutureTask<V> implements Comparable<sg<V>> {
    private int fxn;
    private int kg;

    public sg(Callable<V> callable, int i, int i2) {
        super(callable);
        this.fxn = i == -1 ? 5 : i;
        this.kg = i2;
    }

    @Override // java.lang.Comparable
    /* renamed from: fxn, reason: merged with bridge method [inline-methods] */
    public int compareTo(sg sgVar) {
        if (fxn() < sgVar.fxn()) {
            return 1;
        }
        return fxn() > sgVar.fxn() ? -1 : 0;
    }

    public int fxn() {
        return this.fxn;
    }
}
