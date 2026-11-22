package com.bytedance.sdk.component.tw.fxn;

import com.bytedance.sdk.component.tw.fxn.gff;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes13.dex */
public class hm<T extends gff> {
    private int fxn;
    private BlockingQueue<T> kg = new LinkedBlockingQueue();

    public static hm fxn(int i) {
        return new hm(i);
    }

    private hm(int i) {
        this.fxn = i;
    }

    public T fxn() {
        return this.kg.poll();
    }

    public boolean fxn(T t) {
        if (t == null) {
            return false;
        }
        t.fxn();
        if (this.kg.size() >= this.fxn) {
            return false;
        }
        return this.kg.offer(t);
    }
}
