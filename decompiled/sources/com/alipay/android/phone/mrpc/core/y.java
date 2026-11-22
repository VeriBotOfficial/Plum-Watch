package com.alipay.android.phone.mrpc.core;

import java.lang.reflect.Proxy;

/* loaded from: classes11.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    private g f1291a;
    private aa b = new aa(this);

    public y(g gVar) {
        this.f1291a = gVar;
    }

    public g a() {
        return this.f1291a;
    }

    public <T> T a(Class<T> cls) {
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new z(this.f1291a, cls, this.b));
    }
}
