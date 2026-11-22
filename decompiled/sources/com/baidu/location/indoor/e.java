package com.baidu.location.indoor;

import java.util.ArrayList;

/* loaded from: classes13.dex */
public class e<T> extends ArrayList<T> {

    /* renamed from: a, reason: collision with root package name */
    private int f7749a;

    public e(int i) {
        this.f7749a = i;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(T t) {
        synchronized (this) {
            if (size() == this.f7749a) {
                remove(0);
            }
            add(size(), t);
        }
        return true;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        synchronized (this) {
            if (size() > 3) {
                int size = size() / 2;
                while (true) {
                    int i = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    remove(0);
                    size = i;
                }
            }
        }
    }
}
