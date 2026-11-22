package com.anythink.expressad.atsignalcommon.c;

import com.anythink.expressad.atsignalcommon.c.b;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes12.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static a f4655a;

    public interface a {
        boolean a();
    }

    public static abstract class b {

        public static class a extends Throwable {
            private static final long d = 1;

            /* renamed from: a, reason: collision with root package name */
            private Class<?> f4656a;
            private String b;
            private String c;

            public a(String str) {
                super(str);
            }

            public a(Exception exc) {
                super(exc);
            }

            @Override // java.lang.Throwable
            public final String toString() {
                return getCause() != null ? getClass().getName() + ": " + getCause() : super.toString();
            }

            public final Class<?> a() {
                return this.f4656a;
            }

            public final void a(Class<?> cls) {
                this.f4656a = cls;
            }

            public final String b() {
                return this.c;
            }

            public final void a(String str) {
                this.c = str;
            }

            public final String c() {
                return this.b;
            }

            public final void b(String str) {
                this.b = str;
            }
        }
    }

    public static class e<C, T> {

        /* renamed from: a, reason: collision with root package name */
        private Object f4659a;
        private final Field b;

        /* JADX WARN: Multi-variable type inference failed */
        private <T2> e<C, T2> a(Class<?> cls) {
            Field field = this.b;
            if (field != null && !cls.isAssignableFrom(field.getType())) {
                c.b(new b.a(new ClassCastException(this.b + " is not of type " + cls)));
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private <T2> e<C, T2> b(Class<T2> cls) {
            Field field = this.b;
            if (field != null && !cls.isAssignableFrom(field.getType())) {
                c.b(new b.a(new ClassCastException(this.b + " is not of type " + cls)));
            }
            return this;
        }

        private e<C, T> a(String str) {
            try {
                Class<?> cls = Class.forName(str);
                Field field = this.b;
                if (field != null && !cls.isAssignableFrom(field.getType())) {
                    c.b(new b.a(new ClassCastException(this.b + " is not of type " + cls)));
                }
                return this;
            } catch (ClassNotFoundException e) {
                c.b(new b.a(e));
                return this;
            }
        }

        private T a() {
            try {
                return (T) this.b.get(this.f4659a);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                return null;
            }
        }

        private void a(Object obj) {
            try {
                this.b.set(this.f4659a, obj);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        private void a(b.AbstractC0228b<?> abstractC0228b) {
            T a2 = a();
            if (a2 == null) {
                throw new IllegalStateException("Cannot mapping null");
            }
            try {
                this.b.set(this.f4659a, com.anythink.expressad.atsignalcommon.c.b.a(a2, abstractC0228b, a2.getClass().getInterfaces()));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        private e<C, T> b(C c) {
            this.f4659a = c;
            return this;
        }

        e(Class<C> cls, String str, int i) {
            Field field = null;
            if (cls == null) {
                return;
            }
            try {
                this.f4659a = null;
                field = cls.getDeclaredField(str);
                if (i > 0 && (field.getModifiers() & i) != i) {
                    c.b(new b.a(field + " does not match modifiers: " + i));
                }
                field.setAccessible(true);
            } catch (NoSuchFieldException e) {
                b.a aVar = new b.a(e);
                aVar.a((Class<?>) cls);
                aVar.b(str);
                c.b(aVar);
            } finally {
                this.b = field;
            }
        }

        private Field b() {
            return this.b;
        }
    }

    public static class f {

        /* renamed from: a, reason: collision with root package name */
        protected final Method f4660a;

        public final Object a(Object obj, Object... objArr) {
            Method method = this.f4660a;
            if (method == null) {
                return null;
            }
            try {
                return method.invoke(obj, objArr);
            } catch (Throwable unused) {
                return null;
            }
        }

        f(Class<?> cls, String str, Class<?>[] clsArr, int i) {
            Method method = null;
            if (cls == null) {
                return;
            }
            while (true) {
                if (cls == Object.class || cls == null) {
                    break;
                }
                try {
                    method = cls.getDeclaredMethod(str, clsArr);
                    break;
                } catch (NoSuchMethodException e) {
                    if (com.anythink.expressad.a.f4564a && cls != null && cls.getSuperclass() == Object.class) {
                        e.printStackTrace();
                    }
                } catch (SecurityException e2) {
                    try {
                        if (com.anythink.expressad.a.f4564a && cls != null && cls.getSuperclass() == Object.class) {
                            e2.printStackTrace();
                        }
                    } catch (Exception e3) {
                        b.a aVar = new b.a(e3);
                        aVar.a(cls);
                        aVar.a(str);
                        c.b(aVar);
                        return;
                    } finally {
                        this.f4660a = method;
                    }
                }
                cls = cls.getSuperclass();
            }
            if (method != null) {
                if (i > 0 && (method.getModifiers() & i) != i) {
                    c.b(new b.a(method + " does not match modifiers: " + i));
                }
                method.setAccessible(true);
            }
        }

        public final Method a() {
            return this.f4660a;
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        protected Constructor<?> f4658a;

        d(Class<?> cls, Class<?>[] clsArr) {
            if (cls == null) {
                return;
            }
            try {
                this.f4658a = cls.getDeclaredConstructor(clsArr);
            } catch (NoSuchMethodException e) {
                b.a aVar = new b.a(e);
                aVar.a(cls);
                c.b(aVar);
            }
        }

        private Object a(Object... objArr) {
            this.f4658a.setAccessible(true);
            try {
                return this.f4658a.newInstance(objArr);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
    }

    /* renamed from: com.anythink.expressad.atsignalcommon.c.c$c, reason: collision with other inner class name */
    public static class C0229c<C> {

        /* renamed from: a, reason: collision with root package name */
        protected Class<C> f4657a;

        private e<C, Object> a(String str) {
            return new e<>(this.f4657a, str, 8);
        }

        private e<C, Object> b(String str) {
            return new e<>(this.f4657a, str, 0);
        }

        private f b(String str, Class<?>... clsArr) {
            return new f(this.f4657a, str, clsArr, 8);
        }

        public final f a(String str, Class<?>... clsArr) {
            return new f(this.f4657a, str, clsArr, 0);
        }

        private d a(Class<?>... clsArr) {
            return new d(this.f4657a, clsArr);
        }

        public C0229c(Class<C> cls) {
            this.f4657a = cls;
        }

        private Class<C> a() {
            return this.f4657a;
        }
    }

    private static <T> C0229c<T> a(Class<T> cls) {
        return new C0229c<>(cls);
    }

    private static <T> C0229c<T> a(String str) {
        try {
            return new C0229c<>(Class.forName(str));
        } catch (ClassNotFoundException e2) {
            b(new b.a(e2));
            return new C0229c<>(null);
        }
    }

    public static <T> C0229c<T> a(ClassLoader classLoader, String str) {
        try {
            return new C0229c<>(classLoader.loadClass(str));
        } catch (Exception e2) {
            b(new b.a(e2));
            return new C0229c<>(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(b.a aVar) {
        a aVar2 = f4655a;
        if (aVar2 == null) {
            throw aVar;
        }
        if (!aVar2.a()) {
            throw aVar;
        }
    }

    private static void a(a aVar) {
        f4655a = aVar;
    }

    private c() {
    }
}
