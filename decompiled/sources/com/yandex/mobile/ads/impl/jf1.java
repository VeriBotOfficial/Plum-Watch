package com.yandex.mobile.ads.impl;

import java.util.Comparator;

/* loaded from: classes5.dex */
public abstract class jf1<T> implements Comparator<T> {
    public <S extends T> jf1<S> b() {
        return new qr1(this);
    }

    public static <T> jf1<T> a(Comparator<T> comparator) {
        if (comparator instanceof jf1) {
            return (jf1) comparator;
        }
        return new xq(comparator);
    }

    public static <C extends Comparable> jf1<C> a() {
        return qc1.b;
    }

    protected jf1() {
    }
}
