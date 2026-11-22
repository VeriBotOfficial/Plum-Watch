package com.alipay.android.phone.mrpc.core;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.ResetCookie;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes11.dex */
public class aa {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<Object> f1270a = new ThreadLocal<>();
    private static final ThreadLocal<Map<String, Object>> b = new ThreadLocal<>();
    private byte c = 0;
    private AtomicInteger d = new AtomicInteger();
    private y e;

    public aa(y yVar) {
        this.e = yVar;
    }

    private void a(Object obj, Class<?> cls, Method method, Object[] objArr, Annotation[] annotationArr) {
    }

    private void a(Object obj, byte[] bArr, Class<?> cls, Method method, Object[] objArr, Annotation[] annotationArr) {
    }

    private void a(Object obj, byte[] bArr, Class<?> cls, Method method, Object[] objArr, Annotation[] annotationArr, RpcException rpcException) {
        throw rpcException;
    }

    private byte[] a(Method method, Object[] objArr, String str, int i, boolean z) {
        com.alipay.android.phone.mrpc.core.a.f a2 = a(i, str, objArr);
        ThreadLocal<Map<String, Object>> threadLocal = b;
        if (threadLocal.get() != null) {
            a2.a(threadLocal.get());
        }
        byte[] bArr = (byte[]) a(method, i, str, a2.a(), z).a();
        threadLocal.set(null);
        return bArr;
    }

    public com.alipay.android.phone.mrpc.core.a.c a(Type type, byte[] bArr) {
        return new com.alipay.android.phone.mrpc.core.a.d(type, bArr);
    }

    public com.alipay.android.phone.mrpc.core.a.f a(int i, String str, Object[] objArr) {
        return new com.alipay.android.phone.mrpc.core.a.e(i, str, objArr);
    }

    public w a(Method method, int i, String str, byte[] bArr, boolean z) {
        return new j(this.e.a(), method, i, str, bArr, z);
    }

    public Object a(Object obj, Class<?> cls, Method method, Object[] objArr) {
        String str;
        Object[] objArr2;
        Method method2;
        Class<?> cls2;
        byte[] bArr;
        Object obj2;
        aa aaVar;
        if (ac.a()) {
            throw new IllegalThreadStateException("can't in main thread call rpc .");
        }
        OperationType operationType = (OperationType) method.getAnnotation(OperationType.class);
        boolean z = method.getAnnotation(ResetCookie.class) != null;
        Type genericReturnType = method.getGenericReturnType();
        Annotation[] annotations = method.getAnnotations();
        ThreadLocal<Object> threadLocal = f1270a;
        byte[] bArr2 = null;
        threadLocal.set(null);
        b.set(null);
        if (operationType == null) {
            throw new IllegalStateException("OperationType must be set.");
        }
        String value = operationType.value();
        int incrementAndGet = this.d.incrementAndGet();
        a(obj, cls, method, objArr, annotations);
        try {
            if (this.c == 0) {
                str = value;
                try {
                    bArr2 = a(method, objArr, str, incrementAndGet, z);
                    Object a2 = a(genericReturnType, bArr2).a();
                    if (genericReturnType != Void.TYPE) {
                        threadLocal.set(a2);
                    }
                } catch (RpcException e) {
                    e = e;
                    RpcException rpcException = e;
                    bArr = bArr2;
                    rpcException.setOperationType(str);
                    aaVar = this;
                    obj2 = obj;
                    cls2 = cls;
                    method2 = method;
                    objArr2 = objArr;
                    aaVar.a(obj2, bArr, cls2, method2, objArr2, annotations, rpcException);
                    aaVar.a(obj2, bArr, cls2, method2, objArr2, annotations);
                    return f1270a.get();
                }
            }
            aaVar = this;
            obj2 = obj;
            cls2 = cls;
            method2 = method;
            objArr2 = objArr;
            bArr = bArr2;
        } catch (RpcException e2) {
            e = e2;
            str = value;
        }
        aaVar.a(obj2, bArr, cls2, method2, objArr2, annotations);
        return f1270a.get();
    }
}
