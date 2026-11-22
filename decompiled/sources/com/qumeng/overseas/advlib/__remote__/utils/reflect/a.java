package com.qumeng.overseas.advlib.__remote__.utils.reflect;

import com.umeng.analytics.pro.ak;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes17.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final Object f13242a;
    private final boolean b = true;

    /* renamed from: com.qumeng.overseas.advlib.__remote__.utils.reflect.a$a, reason: collision with other inner class name */
    class C0854a implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f13243a;

        C0854a(boolean z) {
            this.f13243a = z;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            try {
                return a.a(a.this.f13242a).b(name, objArr).c();
            } catch (ReflectException e) {
                if (this.f13243a) {
                    Map map = (Map) a.this.f13242a;
                    int length = objArr == null ? 0 : objArr.length;
                    if (length == 0 && name.startsWith("get")) {
                        return map.get(a.h(name.substring(3)));
                    }
                    if (length == 0 && name.startsWith(ak.ae)) {
                        return map.get(a.h(name.substring(2)));
                    }
                    if (length == 1 && name.startsWith("set")) {
                        map.put(a.h(name.substring(3)), objArr[0]);
                        return null;
                    }
                }
                throw e;
            }
        }
    }

    private class b {
        private b() {
        }
    }

    private a(Class<?> cls) {
        this.f13242a = cls;
    }

    public static a b(String str, ClassLoader classLoader) throws ReflectException {
        return b(a(str, classLoader));
    }

    public static Class<?> c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        return cls.isPrimitive() ? Boolean.TYPE == cls ? Boolean.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : Byte.TYPE == cls ? Byte.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Character.TYPE == cls ? Character.class : Void.TYPE == cls ? Void.class : cls : cls;
    }

    private Field d(String str) throws ReflectException {
        Class<?> d = d();
        try {
            return d.getField(str);
        } catch (NoSuchFieldException e) {
            do {
                try {
                    return (Field) a(d.getDeclaredField(str));
                } catch (NoSuchFieldException unused) {
                    d = d.getSuperclass();
                }
            } while (d != null);
            throw new ReflectException(e);
        }
    }

    private static Class<?> e(String str) throws ReflectException {
        try {
            return Class.forName(str);
        } catch (Exception e) {
            throw new ReflectException(e);
        }
    }

    public static a g(String str) throws ReflectException {
        return b(e(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String h(String str) {
        int length = str.length();
        return length == 0 ? "" : length == 1 ? str.toLowerCase() : str.substring(0, 1).toLowerCase() + str.substring(1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f13242a.equals(((a) obj).c());
        }
        return false;
    }

    public <T> T f(String str) throws ReflectException {
        return (T) c(str).c();
    }

    public int hashCode() {
        return this.f13242a.hashCode();
    }

    public String toString() {
        return this.f13242a.toString();
    }

    public static a b(Class<?> cls) {
        return new a(cls);
    }

    public static a a(Object obj) {
        return new a(obj);
    }

    private static Object b(Object obj) {
        return obj instanceof a ? ((a) obj).c() : obj;
    }

    private a(Object obj) {
        this.f13242a = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        if (java.lang.reflect.Modifier.isPublic(r0.getDeclaringClass().getModifiers()) != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T extends java.lang.reflect.AccessibleObject> T a(T r2) {
        /*
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            boolean r0 = r2 instanceof java.lang.reflect.Member
            if (r0 == 0) goto L24
            r0 = r2
            java.lang.reflect.Member r0 = (java.lang.reflect.Member) r0
            int r1 = r0.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isPublic(r1)
            if (r1 == 0) goto L24
            java.lang.Class r0 = r0.getDeclaringClass()
            int r0 = r0.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isPublic(r0)
            if (r0 == 0) goto L24
            goto L2e
        L24:
            boolean r0 = r2.isAccessible()
            if (r0 != 0) goto L2e
            r0 = 1
            r2.setAccessible(r0)
        L2e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qumeng.overseas.advlib.__remote__.utils.reflect.a.a(java.lang.reflect.AccessibleObject):java.lang.reflect.AccessibleObject");
    }

    private static Class<?>[] b(Object... objArr) {
        if (objArr == null) {
            return new Class[0];
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            clsArr[i] = obj == null ? b.class : obj.getClass();
        }
        return clsArr;
    }

    public Map<String, a> b() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Class<?> d = d();
        do {
            for (Field field : d.getDeclaredFields()) {
                if ((!this.b) ^ Modifier.isStatic(field.getModifiers())) {
                    String name = field.getName();
                    if (!linkedHashMap.containsKey(name)) {
                        try {
                            linkedHashMap.put(name, c(name));
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            d = d.getSuperclass();
        } while (d != null);
        return linkedHashMap;
    }

    private static a a(Constructor<?> constructor, Object... objArr) throws ReflectException {
        try {
            return a(((Constructor) a(constructor)).newInstance(objArr));
        } catch (Throwable th) {
            throw new ReflectException(th);
        }
    }

    private static a a(Method method, Object obj, Object... objArr) throws ReflectException {
        try {
            a(method);
            if (method.getReturnType() == Void.TYPE) {
                method.invoke(obj, objArr);
                return a(obj);
            }
            return a(method.invoke(obj, objArr));
        } catch (Exception e) {
            throw new ReflectException(e);
        }
    }

    public Class<?> d() {
        if (this.b) {
            return (Class) this.f13242a;
        }
        return this.f13242a.getClass();
    }

    public <T> T c() {
        return (T) this.f13242a;
    }

    public a c(String str) throws ReflectException {
        try {
            return a(d(str).get(this.f13242a));
        } catch (Exception e) {
            throw new ReflectException(e);
        }
    }

    private static Class<?> a(String str, ClassLoader classLoader) throws ReflectException {
        try {
            return Class.forName(str, true, classLoader);
        } catch (Exception e) {
            throw new ReflectException(e);
        }
    }

    public a a(Field field, Object obj) throws ReflectException {
        try {
            field.setAccessible(true);
            field.set(this.f13242a, b(obj));
            return this;
        } catch (Exception e) {
            throw new ReflectException(e);
        }
    }

    public a b(String str) throws ReflectException {
        return b(str, new Object[0]);
    }

    public a b(String str, Object... objArr) throws ReflectException {
        Class<?>[] b2 = b(objArr);
        try {
            try {
                return a(a(str, b2), this.f13242a, objArr);
            } catch (NoSuchMethodException e) {
                throw new ReflectException(e);
            }
        } catch (NoSuchMethodException unused) {
            return a(b(str, b2), this.f13242a, objArr);
        }
    }

    public a a(String str, Object obj) throws ReflectException {
        try {
            Field d = d(str);
            d.setAccessible(true);
            d.set(this.f13242a, b(obj));
            return this;
        } catch (Exception e) {
            throw new ReflectException(e);
        }
    }

    public void a(String str, Object... objArr) {
        Class<?>[] b2 = b(objArr);
        try {
            try {
                a(a(str, b2), this.f13242a, objArr);
            } catch (Exception unused) {
                a(b(str, b2), this.f13242a, objArr);
            }
        } catch (Exception unused2) {
        }
    }

    private Method b(String str, Class<?>[] clsArr) throws NoSuchMethodException {
        Class<?> d = d();
        for (Method method : d.getMethods()) {
            if (a(method, str, clsArr)) {
                return method;
            }
        }
        do {
            for (Method method2 : d.getDeclaredMethods()) {
                if (a(method2, str, clsArr)) {
                    return method2;
                }
            }
            d = d.getSuperclass();
        } while (d != null);
        throw new NoSuchMethodException("No similar method " + str + " with params " + Arrays.toString(clsArr) + " could be found on type " + d() + ".");
    }

    private Method a(String str, Class<?>[] clsArr) throws NoSuchMethodException {
        Class<?> d = d();
        try {
            return d.getMethod(str, clsArr);
        } catch (NoSuchMethodException unused) {
            do {
                try {
                    return d.getDeclaredMethod(str, clsArr);
                } catch (NoSuchMethodException unused2) {
                    d = d.getSuperclass();
                }
            } while (d != null);
            throw new NoSuchMethodException();
        }
    }

    private boolean a(Method method, String str, Class<?>[] clsArr) {
        return method.getName().equals(str) && a(method.getParameterTypes(), clsArr);
    }

    public a a() throws ReflectException {
        return a(new Object[0]);
    }

    public a a(Object... objArr) throws ReflectException {
        Class<?>[] b2 = b(objArr);
        try {
            return a(d().getDeclaredConstructor(b2), objArr);
        } catch (NoSuchMethodException e) {
            for (Constructor<?> constructor : d().getDeclaredConstructors()) {
                if (a(constructor.getParameterTypes(), b2)) {
                    return a(constructor, objArr);
                }
            }
            throw new ReflectException(e);
        }
    }

    public <P> P a(Class<P> cls) {
        return (P) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C0854a(this.f13242a instanceof Map));
    }

    private boolean a(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr.length != clsArr2.length) {
            return false;
        }
        for (int i = 0; i < clsArr2.length; i++) {
            Class<?> cls = clsArr2[i];
            if (cls != b.class && (c(cls) == null || !c(clsArr[i]).isAssignableFrom(c(clsArr2[i])))) {
                return false;
            }
        }
        return true;
    }
}
