package com.bytedance.sdk.component.tw;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes15.dex */
public class sg<V> extends FutureTask<V> implements Comparable<sg<V>> {
    private int fxn;
    private int kg;

    public sg(Callable<V> callable, int r2, int r3) {
        super(callable);
        this.fxn = r2 == -1 ? 5 : r2;
        this.kg = r3;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: fxn, reason: merged with bridge method [inline-methods] */
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
