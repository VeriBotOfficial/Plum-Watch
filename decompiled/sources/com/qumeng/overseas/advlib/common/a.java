package com.qumeng.overseas.advlib.common;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes17.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile a f13253a;
    private static Map<String, Class> b = new HashMap();

    /* renamed from: com.qumeng.overseas.advlib.common.a$a, reason: collision with other inner class name */
    class C0855a implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f13254a;

        C0855a(String str) {
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

        /* renamed from: a, reason: collision with root package name */
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
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C0855a(str));
    }

    public <T> T a(Class<T> cls, Object... objArr) {
        return (T) a(false, cls, objArr);
    }

    private <T> T a(boolean z, Class<T> cls, Object... objArr) {
        Class cls2 = b.get(cls.getName());
        T t = null;
        if (cls2 == null) {
            return null;
        }
        if (objArr != null) {
            try {
            } catch (Throwable th) {
                th.printStackTrace();
            }
            if (objArr.length > 0) {
                Constructor<?>[] constructors = cls2.getConstructors();
                int length = constructors.length;
                int i = 0;
                loop0: while (true) {
                    if (i >= length) {
                        break;
                    }
                    Constructor<?> constructor = constructors[i];
                    if (objArr.length == constructor.getParameterTypes().length) {
                        Class<?>[] parameterTypes = constructor.getParameterTypes();
                        for (int i2 = 0; i2 < parameterTypes.length; i2++) {
                            if (!parameterTypes[i2].isInstance(objArr[i2])) {
                                break;
                            }
                        }
                        t = (T) constructor.newInstance(objArr);
                        break loop0;
                    }
                    i++;
                }
                return (t != null || z) ? t : (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new b(t));
            }
        }
        t = (T) cls2.newInstance();
        if (t != null) {
        }
    }
}
