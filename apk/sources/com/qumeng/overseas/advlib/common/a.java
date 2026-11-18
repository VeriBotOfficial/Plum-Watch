package com.qumeng.overseas.advlib.common;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile a f13253a;
    private static Map<String, Class> b = new HashMap();

    /* JADX INFO: renamed from: com.qumeng.overseas.advlib.common.a$a, reason: collision with other inner class name */
    class C0949a implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f13254a;

        C0949a(String str) {
            this.f13254a = str;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            try {
                Method declaredMethod = ((Class) a.b.get(this.f13254a)).getDeclaredMethod(method.getName(), method.getParameterTypes());
                if (Modifier.isPrivate(declaredMethod.getModifiers())) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod.invoke(null, objArr);
            } catch (Error e) {
                e.printStackTrace();
                return null;
            } catch (RuntimeException e2) {
                e2.printStackTrace();
                return null;
            }
        }
    }

    class b implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f13255a;

        b(Object obj) {
            this.f13255a = obj;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            try {
                Method method2 = this.f13255a.getClass().getMethod(method.getName(), method.getParameterTypes());
                return method2.invoke(Modifier.isStatic(method2.getModifiers()) ? null : this.f13255a, objArr);
            } catch (Error e) {
                e.printStackTrace();
                return null;
            } catch (RuntimeException e2) {
                e2.printStackTrace();
                return null;
            }
        }
    }

    private a() {
    }

    public static a c() {
        if (f13253a == null) {
            synchronized (a.class) {
                if (f13253a == null) {
                    f13253a = new a();
                }
            }
        }
        return f13253a;
    }

    public <T> Class<T> b(Class cls) {
        return b.get(cls.getName());
    }

    public void a(Class cls, Class cls2) {
        b.put(cls.getName(), cls2);
    }

    public void b() {
        b.clear();
    }

    public <T> T a(Class<T> cls) {
        return (T) a(cls, cls.getName());
    }

    public <T> T b(Class<T> cls, Object... objArr) {
        return (T) a(true, cls, objArr);
    }

    private <T> T a(Class<T> cls, String str) {
        if (b.get(str) == null) {
            return null;
        }
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C0949a(str));
    }

    public <T> T a(Class<T> cls, Object... objArr) {
        return (T) a(false, cls, objArr);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0046 A[Catch: all -> 0x004b, TRY_LEAVE, TryCatch #0 {all -> 0x004b, blocks: (B:7:0x0013, B:9:0x0016, B:11:0x001e, B:19:0x003b, B:14:0x0029, B:15:0x002e, B:17:0x0031, B:20:0x003e, B:21:0x0041, B:22:0x0046), top: B:32:0x0013 }] */
    private <T> T a(boolean z, Class<T> cls, Object... objArr) {
        Class cls2 = b.get(cls.getName());
        T t = null;
        if (cls2 == null) {
            return null;
        }
        if (objArr != null) {
            try {
                if (objArr.length > 0) {
                    loop0: for (Constructor<?> constructor : cls2.getConstructors()) {
                        if (objArr.length == constructor.getParameterTypes().length) {
                            Class<?>[] parameterTypes = constructor.getParameterTypes();
                            int r7 = 0;
                            while (true) {
                                if (r7 < parameterTypes.length) {
                                    if (!parameterTypes[r7].isInstance(objArr[r7])) {
                                        break;
                                    }
                                    r7++;
                                } else {
                                    t = (T) constructor.newInstance(objArr);
                                    break loop0;
                                }
                            }
                        }
                    }
                } else {
                    t = (T) cls2.newInstance();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } else {
            t = (T) cls2.newInstance();
        }
        return (t == null || z) ? t : (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new b(t));
    }
}
