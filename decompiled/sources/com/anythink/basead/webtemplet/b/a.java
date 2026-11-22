package com.anythink.basead.webtemplet.b;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static InterfaceC0183a f3464a;

    /* renamed from: com.anythink.basead.webtemplet.b.a$a, reason: collision with other inner class name */
    public interface InterfaceC0183a {
        boolean a();
    }

    public static abstract class b {

        /* renamed from: com.anythink.basead.webtemplet.b.a$b$a, reason: collision with other inner class name */
        public static class C0184a extends Throwable {
            private static final long d = 1;

            /* renamed from: a, reason: collision with root package name */
            private Class<?> f3465a;
            private String b;
            private String c;

            public C0184a(String str) {
                super(str);
            }

            public C0184a(Exception exc) {
                super(exc);
            }

            @Override // java.lang.Throwable
            public final String toString() {
                return getCause() != null ? getClass().getName() + ": " + getCause() : super.toString();
            }

            private Class<?> a() {
                return this.f3465a;
            }

            public final void a(Class<?> cls) {
                this.f3465a = cls;
            }

            private String b() {
                return this.c;
            }

            public final void a(String str) {
                this.c = str;
            }

            private String c() {
                return this.b;
            }

            public final void b(String str) {
                this.b = str;
            }
        }
    }

    public static class e<C, T> {

        /* renamed from: a, reason: collision with root package name */
        private Object f3468a;
        private final Field b;

        /* JADX WARN: Multi-variable type inference failed */
        private <T2> e<C, T2> a(Class<?> cls) {
            Field field = this.b;
            if (field != null && !cls.isAssignableFrom(field.getType())) {
                a.b(new b.C0184a(new ClassCastException(this.b + " is not of type " + cls)));
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private <T2> e<C, T2> b(Class<T2> cls) {
            Field field = this.b;
            if (field != null && !cls.isAssignableFrom(field.getType())) {
                a.b(new b.C0184a(new ClassCastException(this.b + " is not of type " + cls)));
            }
            return this;
        }

        private e<C, T> a(String str) {
            try {
                Class<?> cls = Class.forName(str);
                Field field = this.b;
                if (field != null && !cls.isAssignableFrom(field.getType())) {
                    a.b(new b.C0184a(new ClassCastException(this.b + " is not of type " + cls)));
                }
                return this;
            } catch (ClassNotFoundException e) {
                a.b(new b.C0184a(e));
                return this;
            }
        }

        private T a() {
            try {
                return (T) this.b.get(this.f3468a);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                return null;
            }
        }

        private void a(Object obj) {
            try {
                this.b.set(this.f3468a, obj);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        private e<C, T> b(C c) {
            this.f3468a = c;
            return this;
        }

        e(Class<C> cls, String str, int i) {
            Field field = null;
            if (cls == null) {
                return;
            }
            try {
                this.f3468a = null;
                field = cls.getDeclaredField(str);
                if (i > 0 && (field.getModifiers() & i) != i) {
                    a.b(new b.C0184a(field + " does not match modifiers: " + i));
                }
                field.setAccessible(true);
            } catch (NoSuchFieldException e) {
                b.C0184a c0184a = new b.C0184a(e);
                c0184a.a((Class<?>) cls);
                c0184a.b(str);
                a.b(c0184a);
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
        protected final Method f3469a;

        public final Object a(Object obj, Object... objArr) {
            Method method = this.f3469a;
            if (method == null) {
                return null;
            }
            try {
                return method.invoke(obj, objArr);
            } catch (Exception e) {
                e.getMessage();
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
                    try {
                        method = cls.getDeclaredMethod(str, clsArr);
                        break;
                    } catch (NoSuchMethodException | SecurityException unused) {
                        cls = cls.getSuperclass();
                    }
                } catch (Exception e) {
                    b.C0184a c0184a = new b.C0184a(e);
                    c0184a.a(cls);
                    c0184a.a(str);
                    a.b(c0184a);
                    return;
                } finally {
                    this.f3469a = method;
                }
            }
            if (method != null) {
                if (i > 0 && (method.getModifiers() & i) != i) {
                    a.b(new b.C0184a(method + " does not match modifiers: " + i));
                }
                method.setAccessible(true);
            }
        }

        public final Method a() {
            return this.f3469a;
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        protected Constructor<?> f3467a;

        d(Class<?> cls, Class<?>[] clsArr) {
            if (cls == null) {
                return;
            }
            try {
                this.f3467a = cls.getDeclaredConstructor(clsArr);
            } catch (NoSuchMethodException e) {
                b.C0184a c0184a = new b.C0184a(e);
                c0184a.a(cls);
                a.b(c0184a);
            }
        }

        private Object a(Object... objArr) {
            this.f3467a.setAccessible(true);
            try {
                return this.f3467a.newInstance(objArr);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
    }

    public static class c<C> {

        /* renamed from: a, reason: collision with root package name */
        protected Class<C> f3466a;

        private e<C, Object> a(String str) {
            return new e<>(this.f3466a, str, 8);
        }

        private e<C, Object> b(String str) {
            return new e<>(this.f3466a, str, 0);
        }

        private f b(String str, Class<?>... clsArr) {
            return new f(this.f3466a, str, clsArr, 8);
        }

        public final f a(String str, Class<?>... clsArr) {
            return new f(this.f3466a, str, clsArr, 0);
        }

        private d a(Class<?>... clsArr) {
            return new d(this.f3466a, clsArr);
        }

        public c(Class<C> cls) {
            this.f3466a = cls;
        }

        private Class<C> a() {
            return this.f3466a;
        }
    }

    private static <T> c<T> a(Class<T> cls) {
        return new c<>(cls);
    }

    private static <T> c<T> a(String str) {
        try {
            return new c<>(Class.forName(str));
        } catch (ClassNotFoundException e2) {
            b(new b.C0184a(e2));
            return new c<>(null);
        }
    }

    public static <T> c<T> a(ClassLoader classLoader, String str) {
        try {
            return new c<>(classLoader.loadClass(str));
        } catch (Exception e2) {
            b(new b.C0184a(e2));
            return new c<>(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(b.C0184a c0184a) {
        InterfaceC0183a interfaceC0183a = f3464a;
        if (interfaceC0183a == null) {
            throw c0184a;
        }
        if (!interfaceC0183a.a()) {
            throw c0184a;
        }
    }

    private static void a(InterfaceC0183a interfaceC0183a) {
        f3464a = interfaceC0183a;
    }

    private a() {
    }
}
