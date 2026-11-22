package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
final class mq0 implements Iterator<Object> {
    public static final mq0 b;
    private static final /* synthetic */ mq0[] c;

    static {
        mq0 mq0Var = new mq0();
        b = mq0Var;
        c = new mq0[]{mq0Var};
    }

    public static mq0 valueOf(String str) {
        return (mq0) Enum.valueOf(mq0.class, str);
    }

    public static mq0[] values() {
        return (mq0[]) c.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    private mq0() {
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new IllegalStateException("no calls to next() since the last call to remove()");
    }
}
