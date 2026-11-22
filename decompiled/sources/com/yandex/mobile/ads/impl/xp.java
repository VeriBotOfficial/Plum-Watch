package com.yandex.mobile.ads.impl;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class xp {

    /* renamed from: a, reason: collision with root package name */
    private final Method f17357a;
    private final Method b;
    private final Method c;

    public static final class a {
        public static xp a() {
            Method method;
            Method method2;
            Method method3;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                method = cls.getMethod("get", new Class[0]);
                method3 = cls.getMethod("open", String.class);
                method2 = cls.getMethod("warnIfOpen", new Class[0]);
            } catch (Exception unused) {
                method = null;
                method2 = null;
                method3 = null;
            }
            return new xp(method, method3, method2);
        }
    }

    public final Object a() {
        Intrinsics.checkNotNullParameter("response.body().close()", "closer");
        Method method = this.f17357a;
        if (method != null) {
            try {
                Object invoke = method.invoke(null, new Object[0]);
                Method method2 = this.b;
                Intrinsics.checkNotNull(method2);
                method2.invoke(invoke, "response.body().close()");
                return invoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public xp(Method method, Method method2, Method method3) {
        this.f17357a = method;
        this.b = method2;
        this.c = method3;
    }

    public final boolean a(Object obj) {
        if (obj != null) {
            try {
                Method method = this.c;
                Intrinsics.checkNotNull(method);
                method.invoke(obj, new Object[0]);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
