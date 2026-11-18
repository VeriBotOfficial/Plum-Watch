package com.qumeng.overseas.advlib.__remote__.framework.videoplayer;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class j<T> {
    public int a(ArrayList<WeakReference<T>> arrayList, T t) {
        T t2;
        if (arrayList != null && t != null) {
            Iterator<WeakReference<T>> it = arrayList.iterator();
            int r1 = 0;
            while (it.hasNext()) {
                WeakReference<T> next = it.next();
                if (next == null || (t2 = next.get()) == null) {
                    it.remove();
                } else {
                    if (t2.equals(t)) {
                        return r1;
                    }
                    r1++;
                }
            }
        }
        return -1;
    }
}
