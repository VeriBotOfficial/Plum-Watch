package com.yandex.mobile.ads.impl;

import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
final class lq0 extends i82<Object> {
    boolean b;
    final /* synthetic */ Object c;

    lq0(Object obj) {
        this.c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.b) {
            this.b = true;
            return this.c;
        }
        throw new NoSuchElementException();
    }
}
