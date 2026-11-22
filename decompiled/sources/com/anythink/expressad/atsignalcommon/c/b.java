package com.anythink.expressad.atsignalcommon.c;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* loaded from: classes12.dex */
public class b {

    private interface a {
    }

    /* renamed from: com.anythink.expressad.atsignalcommon.c.b$b, reason: collision with other inner class name */
    public static abstract class AbstractC0228b<T> implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        private T f4654a;

        private T a() {
            return this.f4654a;
        }

        final void a(T t) {
            this.f4654a = t;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            try {
                return method.invoke(this.f4654a, objArr);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                return null;
            } catch (IllegalArgumentException e2) {
                e2.printStackTrace();
                return null;
            } catch (InvocationTargetException e3) {
                throw e3.getTargetException();
            }
        }
    }

    private static <T> T a(Object obj, Class<T> cls, AbstractC0228b<T> abstractC0228b) {
        abstractC0228b.a(obj);
        return (T) Proxy.newProxyInstance(b.class.getClassLoader(), new Class[]{cls, a.class}, abstractC0228b);
    }

    public static <T> T a(Object obj, AbstractC0228b<T> abstractC0228b, Class<?>... clsArr) {
        abstractC0228b.a(obj);
        return (T) Proxy.newProxyInstance(b.class.getClassLoader(), clsArr, abstractC0228b);
    }

    private b() {
    }
}
