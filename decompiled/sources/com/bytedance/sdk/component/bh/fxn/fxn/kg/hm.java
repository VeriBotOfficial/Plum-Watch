package com.bytedance.sdk.component.bh.fxn.fxn.kg;

import com.bytedance.sdk.component.bh.fxn.hm.fxn;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes13.dex */
public abstract class hm<T extends com.bytedance.sdk.component.bh.fxn.hm.fxn> {
    private com.bytedance.sdk.component.bh.fxn.hm.kg.fxn fxn;
    private Queue<String> gff;
    private String hm;
    private Queue<T> kg = new ConcurrentLinkedQueue();

    public hm(com.bytedance.sdk.component.bh.fxn.hm.kg.fxn fxnVar, Queue<String> queue, String str) {
        this.fxn = fxnVar;
        this.gff = queue;
        this.hm = str;
    }

    public void fxn(T t) {
        Queue<T> queue = this.kg;
        if (queue == null || t == null) {
            return;
        }
        queue.offer(t);
    }

    public synchronized List<com.bytedance.sdk.component.bh.fxn.hm.fxn> fxn(int i, int i2) {
        if (!kg(i, i2)) {
            return null;
        }
        ArrayList arrayList = new ArrayList(this.fxn.fxn());
        do {
            T poll = this.kg.poll();
            if (poll == null) {
                break;
            }
            arrayList.add(poll);
        } while (arrayList.size() != this.fxn.kg());
        return arrayList;
    }

    public synchronized void fxn(int i, List<T> list) {
        if (i == -1 || i == 200 || i == 509) {
            this.kg.size();
        } else {
            this.kg.addAll(list);
        }
    }

    public synchronized boolean kg(int i, int i2) {
        int size = this.kg.size();
        int fxn = this.fxn.fxn();
        return (i == 2 || i == 1) ? com.bytedance.sdk.component.bh.fxn.gff.fxn.gff() ? size > 0 : size >= fxn : size >= fxn;
    }
}
