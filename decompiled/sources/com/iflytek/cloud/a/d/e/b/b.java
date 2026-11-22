package com.iflytek.cloud.a.d.e.b;

import com.iflytek.cloud.ErrorCode;
import com.iflytek.cloud.msc.util.log.DebugLog;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* loaded from: classes17.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final Class<?>[] f11124a = null;
    private static final Object[] b = null;
    private static final Object c = new Object();
    private static b d;
    private Class<?> e;
    private Method f;
    private Method g;
    private Method h;
    private Method i;
    private Method j;
    private Method k;
    private Method l;
    private Method m;
    private Class<?> n;
    private Method o;
    private Class<?> p;

    /* renamed from: q, reason: collision with root package name */
    private Method f11125q;
    private Object r;
    private final C0645b s;
    private Object t;
    private c u;

    /* renamed from: com.iflytek.cloud.a.d.e.b.b$b, reason: collision with other inner class name */
    private class C0645b implements InvocationHandler {
        private C0645b() {
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            if (method.equals(b.this.o) && b.this.u != null) {
                b.this.u.a((byte[]) objArr[0], ((Integer) objArr[1]).intValue());
            }
            return null;
        }
    }

    public interface c {
        void a(byte[] bArr, int i);
    }

    private b(int i, int i2, int i3) throws NullPointerException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException, ClassNotFoundException {
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.f11125q = null;
        this.r = null;
        C0645b c0645b = new C0645b();
        this.s = c0645b;
        this.t = null;
        this.u = null;
        Class<?> cls = Class.forName("com.iflytek.alsa.AlsaRecorder$PcmListener");
        this.n = cls;
        Class<?> cls2 = Integer.TYPE;
        this.o = cls.getMethod("onPcmData", byte[].class, cls2);
        this.t = Proxy.newProxyInstance(this.n.getClassLoader(), new Class[]{this.n}, c0645b);
        Class<?> cls3 = Class.forName("com.iflytek.alsa.AlsaRecorder");
        this.e = cls3;
        Object invoke = cls3.getMethod("createInstance", cls2, cls2, cls2).invoke(null, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        this.r = invoke;
        if (invoke == null) {
            DebugLog.LogE("Recorder create alsa failed!");
            throw new NullPointerException("Recorder create alsa failed!");
        }
        this.f = this.e.getMethod("startRecording", this.n);
        Class<?> cls4 = this.e;
        Class<?>[] clsArr = f11124a;
        this.g = cls4.getMethod("stopRecording", clsArr);
        this.m = this.e.getMethod("destroy", clsArr);
        this.i = this.e.getMethod("getCardDevId", clsArr);
        this.l = this.e.getMethod("getListener", clsArr);
        this.k = this.e.getMethod("getPeriodSize", clsArr);
        this.j = this.e.getMethod("getSampleRate", clsArr);
        this.h = this.e.getMethod("isRecording", clsArr);
        Class<?> cls5 = Class.forName("com.iflytek.alsa.jni.AlsaJni");
        this.p = cls5;
        this.f11125q = cls5.getMethod("showJniLog", Boolean.TYPE);
    }

    public static b c() {
        b bVar;
        synchronized (c) {
            bVar = d;
        }
        return bVar;
    }

    public c d() {
        c cVar = this.u;
        try {
            Object invoke = this.l.invoke(this.r, b);
            if (this.t.equals(invoke)) {
                return cVar;
            }
            DebugLog.LogD("Recorder getListener alsa listener unequal to current object: " + invoke);
            return null;
        } catch (Throwable th) {
            DebugLog.LogE(th);
            return null;
        }
    }

    public int e() {
        try {
            return ((Integer) this.k.invoke(this.r, b)).intValue();
        } catch (Throwable th) {
            DebugLog.LogE(th);
            return -1;
        }
    }

    public int f() {
        try {
            return ((Integer) this.j.invoke(this.r, b)).intValue();
        } catch (Throwable th) {
            DebugLog.LogE(th);
            return -1;
        }
    }

    public boolean g() {
        try {
            return ((Boolean) this.h.invoke(this.r, b)).booleanValue();
        } catch (Throwable th) {
            DebugLog.LogE(th);
            return false;
        }
    }

    public void h() {
        try {
            this.g.invoke(this.r, b);
        } catch (Throwable th) {
            DebugLog.LogE(th);
        }
    }

    public static b a(int i, int i2, int i3) {
        b bVar;
        synchronized (c) {
            if (d == null) {
                try {
                    d = new b(i, i2, i3);
                } catch (Throwable th) {
                    DebugLog.LogE(th);
                }
            }
            bVar = d;
        }
        return bVar;
    }

    public int b() {
        try {
            return ((Integer) this.i.invoke(this.r, b)).intValue();
        } catch (Throwable th) {
            DebugLog.LogE(th);
            return -1;
        }
    }

    public int a(c cVar) {
        this.u = cVar;
        try {
            return ((Integer) this.f.invoke(this.r, this.n.cast(this.t))).intValue();
        } catch (Throwable th) {
            DebugLog.LogE(th);
            return ErrorCode.ERROR_UNKNOWN;
        }
    }

    public void a() {
        try {
            this.m.invoke(this.r, b);
        } catch (Throwable th) {
            DebugLog.LogE(th);
        }
        synchronized (c) {
            d = null;
        }
    }

    public void a(boolean z) {
        try {
            this.f11125q.invoke(null, Boolean.valueOf(z));
        } catch (Throwable th) {
            DebugLog.LogE(th);
        }
    }
}
