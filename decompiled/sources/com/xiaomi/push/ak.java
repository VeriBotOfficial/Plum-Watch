package com.xiaomi.push;

import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* loaded from: classes4.dex */
class ak implements aj, InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    private static final String[][] f14428a = {new String[]{"com.bun.supplier.IIdentifierListener", "com.bun.supplier.IdSupplier"}, new String[]{"com.bun.miitmdid.core.IIdentifierListener", "com.bun.miitmdid.supplier.IdSupplier"}};

    /* renamed from: a, reason: collision with other field name */
    private Context f190a;

    /* renamed from: a, reason: collision with other field name */
    private Class f192a = null;
    private Class b = null;

    /* renamed from: a, reason: collision with other field name */
    private Method f194a = null;

    /* renamed from: b, reason: collision with other field name */
    private Method f195b = null;
    private Method c = null;
    private Method d = null;
    private Method e = null;
    private Method f = null;
    private Method g = null;

    /* renamed from: a, reason: collision with other field name */
    private final Object f193a = new Object();

    /* renamed from: a, reason: collision with other field name */
    private volatile int f188a = 0;

    /* renamed from: a, reason: collision with other field name */
    private volatile long f189a = 0;

    /* renamed from: a, reason: collision with other field name */
    private volatile a f191a = null;

    public ak(Context context) {
        this.f190a = context.getApplicationContext();
        a(context);
        b(context);
    }

    @Override // com.xiaomi.push.aj
    /* renamed from: a */
    public boolean mo11870a() {
        a("isSupported");
        return this.f191a != null && Boolean.TRUE.equals(this.f191a.f196a);
    }

    @Override // com.xiaomi.push.aj
    /* renamed from: a */
    public String mo11869a() {
        a("getOAID");
        if (this.f191a == null) {
            return null;
        }
        return this.f191a.b;
    }

    private void a(Context context) {
        Class<?> a2 = a(context, "com.bun.miitmdid.core.MdidSdk");
        Class<?> cls = null;
        Class<?> cls2 = null;
        int i = 0;
        while (true) {
            String[][] strArr = f14428a;
            if (i >= strArr.length) {
                break;
            }
            String[] strArr2 = strArr[i];
            Class<?> a3 = a(context, strArr2[0]);
            Class<?> a4 = a(context, strArr2[1]);
            if (a3 != null && a4 != null) {
                b("found class in index " + i);
                cls2 = a4;
                cls = a3;
                break;
            } else {
                i++;
                cls2 = a4;
                cls = a3;
            }
        }
        this.f192a = a2;
        this.f194a = a(a2, com.qumeng.overseas.advlib.trdparty.unionset.utils.e.p, (Class<?>[]) new Class[]{Context.class, cls});
        this.b = cls;
        this.c = a(cls2, "getOAID", (Class<?>[]) new Class[0]);
        this.f = a(cls2, "isSupported", (Class<?>[]) new Class[0]);
        this.g = a(cls2, "shutDown", (Class<?>[]) new Class[0]);
    }

    private void b(Context context) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = -elapsedRealtime;
        Class cls = this.b;
        if (cls != null) {
            try {
                ClassLoader classLoader = cls.getClassLoader();
                if (classLoader == null) {
                    classLoader = context.getClassLoader();
                }
                a(this.f194a, this.f192a.newInstance(), context, Proxy.newProxyInstance(classLoader, new Class[]{this.b}, this));
            } catch (Throwable th) {
                b("call init sdk error:" + th);
            }
            this.f189a = elapsedRealtime;
        }
        elapsedRealtime = j;
        this.f189a = elapsedRealtime;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        this.f189a = SystemClock.elapsedRealtime();
        if (objArr != null) {
            a aVar = new a();
            int length = objArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Object obj2 = objArr[i];
                if (obj2 != null && !a(obj2)) {
                    aVar.b = (String) a(this.c, obj2, new Object[0]);
                    aVar.f196a = (Boolean) a(this.f, obj2, new Object[0]);
                    a(this.g, obj2, new Object[0]);
                    if (aVar.a()) {
                        b("has get succ, check duplicate:" + (this.f191a != null));
                        synchronized (ak.class) {
                            if (this.f191a == null) {
                                this.f191a = aVar;
                            }
                        }
                    }
                }
                i++;
            }
        }
        a();
        return null;
    }

    private void a(String str) {
        if (this.f191a != null) {
            return;
        }
        long j = this.f189a;
        long elapsedRealtime = SystemClock.elapsedRealtime() - Math.abs(j);
        int i = this.f188a;
        if (elapsedRealtime > 3000 && i < 3) {
            synchronized (this.f193a) {
                if (this.f189a == j && this.f188a == i) {
                    b("retry, current count is " + i);
                    this.f188a++;
                    b(this.f190a);
                    long j2 = this.f189a;
                    elapsedRealtime = SystemClock.elapsedRealtime() - Math.abs(j2);
                    j = j2;
                }
            }
        }
        if (this.f191a != null || j < 0 || elapsedRealtime > 3000 || Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        synchronized (this.f193a) {
            if (this.f191a == null) {
                try {
                    b(str + " wait...");
                    this.f193a.wait(3000L);
                } catch (Exception unused) {
                }
            }
        }
    }

    private void a() {
        synchronized (this.f193a) {
            try {
                this.f193a.notifyAll();
            } catch (Exception unused) {
            }
        }
    }

    private class a {

        /* renamed from: a, reason: collision with other field name */
        Boolean f196a;

        /* renamed from: a, reason: collision with other field name */
        String f197a;
        String b;
        String c;
        String d;

        private a() {
            this.f196a = null;
            this.f197a = null;
            this.b = null;
            this.c = null;
            this.d = null;
        }

        boolean a() {
            if (!TextUtils.isEmpty(this.f197a) || !TextUtils.isEmpty(this.b) || !TextUtils.isEmpty(this.c) || !TextUtils.isEmpty(this.d)) {
                this.f196a = true;
            }
            return this.f196a != null;
        }
    }

    private static boolean a(Object obj) {
        return (obj instanceof Boolean) || (obj instanceof Character) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Double);
    }

    private static Class<?> a(Context context, String str) {
        try {
            return s.a(context, str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method a(Class<?> cls, String str, Class<?>... clsArr) {
        if (cls == null) {
            return null;
        }
        try {
            return cls.getMethod(str, clsArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static <T> T a(Method method, Object obj, Object... objArr) {
        if (method == null) {
            return null;
        }
        try {
            T t = (T) method.invoke(obj, objArr);
            if (t != null) {
                return t;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static void b(String str) {
        com.xiaomi.channel.commonutils.logger.b.m11781a("mdid:" + str);
    }
}
