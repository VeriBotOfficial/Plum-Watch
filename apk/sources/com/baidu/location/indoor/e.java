package com.baidu.location.indoor;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes15.dex */
public class e<T> extends ArrayList<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f7749a;

    public e(int r1) {
        this.f7749a = r1;
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
            if (size() <= 3) {
                return;
            }
            int size = size() / 2;
            while (true) {
                int r1 = size - 1;
                if (size <= 0) {
                    return;
                }
                remove(0);
                size = r1;
            }
        }
    }
}
