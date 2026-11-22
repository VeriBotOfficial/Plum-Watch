package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.tm;

/* loaded from: classes5.dex */
public final class xq1<T> {

    /* renamed from: a, reason: collision with root package name */
    public final T f17360a;
    public final tm.a b;
    public final si2 c;
    public boolean d;

    public interface a {
        void a(si2 si2Var);
    }

    public interface b<T> {
        void a(T t);
    }

    public static <T> xq1<T> a(T t, tm.a aVar) {
        return new xq1<>(t, aVar);
    }

    public static <T> xq1<T> a(si2 si2Var) {
        return new xq1<>(si2Var);
    }

    private xq1(si2 si2Var) {
        this.d = false;
        this.f17360a = null;
        this.b = null;
        this.c = si2Var;
    }

    private xq1(T t, tm.a aVar) {
        this.d = false;
        this.f17360a = t;
        this.b = aVar;
        this.c = null;
    }
}
