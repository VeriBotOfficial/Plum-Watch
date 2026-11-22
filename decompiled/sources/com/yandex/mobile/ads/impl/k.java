package com.yandex.mobile.ads.impl;

import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

/* loaded from: classes5.dex */
public abstract class k<T> extends i82<T> {
    private int b = 2;

    @CheckForNull
    private T c;

    @CheckForNull
    protected abstract T a();

    @CheckForNull
    protected final void b() {
        this.b = 3;
    }

    protected k() {
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.b;
        if (i != 4) {
            int a2 = f9.a(i);
            if (a2 == 0) {
                return true;
            }
            if (a2 != 2) {
                this.b = 4;
                this.c = a();
                if (this.b != 3) {
                    this.b = 1;
                    return true;
                }
            }
            return false;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Iterator
    public final T next() {
        if (hasNext()) {
            this.b = 2;
            T t = this.c;
            this.c = null;
            return t;
        }
        throw new NoSuchElementException();
    }
}
