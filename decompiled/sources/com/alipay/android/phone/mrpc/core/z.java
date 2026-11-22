package com.alipay.android.phone.mrpc.core;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* loaded from: classes11.dex */
public class z implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public g f1292a;
    public Class<?> b;
    public aa c;

    public z(g gVar, Class<?> cls, aa aaVar) {
        this.f1292a = gVar;
        this.b = cls;
        this.c = aaVar;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        return this.c.a(obj, this.b, method, objArr);
    }
}
