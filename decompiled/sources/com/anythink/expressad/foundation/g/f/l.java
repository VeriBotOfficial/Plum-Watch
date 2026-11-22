package com.anythink.expressad.foundation.g.f;

/* loaded from: classes12.dex */
public final class l<T> {

    /* renamed from: a, reason: collision with root package name */
    public T f4894a;
    public com.anythink.expressad.foundation.g.f.a.a b;
    public com.anythink.expressad.foundation.g.f.f.c c;

    private boolean a() {
        return this.b == null;
    }

    public static <T> l<T> a(T t, com.anythink.expressad.foundation.g.f.f.c cVar) {
        return new l<>(t, cVar);
    }

    public static <T> l<T> a(com.anythink.expressad.foundation.g.f.a.a aVar) {
        return new l<>(aVar);
    }

    private l(T t, com.anythink.expressad.foundation.g.f.f.c cVar) {
        this.b = null;
        this.f4894a = t;
        this.c = cVar;
    }

    private l(com.anythink.expressad.foundation.g.f.a.a aVar) {
        this.f4894a = null;
        this.c = null;
        this.b = aVar;
    }
}
