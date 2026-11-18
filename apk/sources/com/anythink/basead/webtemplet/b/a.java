package com.anythink.basead.webtemplet.b;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static InterfaceC0270a f3464a;

    /* JADX INFO: renamed from: com.anythink.basead.webtemplet.b.a$a, reason: collision with other inner class name */
    public interface InterfaceC0270a {
        boolean a();
    }

    public static abstract class b {

        /* JADX INFO: renamed from: com.anythink.basead.webtemplet.b.a$b$a, reason: collision with other inner class name */
        public static class C0271a extends Throwable {
            private static final long d = 1;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private Class<?> f3465a;
            private String b;
            private String c;

            public C0271a(String str) {
                super(str);
            }

            public C0271a(Exception exc) {
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

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Object f3468a;
        private final Field b;

        /* JADX WARN: Multi-variable type inference failed */
        private <T2> e<C, T2> a(Class<?> cls) throws b.C0271a {
            Field field = this.b;
            if (field != null && !cls.isAssignableFrom(field.getType())) {
                a.b(new b.C0271a(new ClassCastException(this.b + " is not of type " + cls)));
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private <T2> e<C, T2> b(Class<T2> cls) throws b.C0271a {
            Field field = this.b;
            if (field != null && !cls.isAssignableFrom(field.getType())) {
                a.b(new b.C0271a(new ClassCastException(this.b + " is not of type " + cls)));
            }
            return this;
        }

        private e<C, T> a(String str) throws b.C0271a {
            try {
                Class<?> cls = Class.forName(str);
                Field field = this.b;
                if (field != null && !cls.isAssignableFrom(field.getType())) {
                    a.b(new b.C0271a(new ClassCastException(this.b + " is not of type " + cls)));
                }
                return this;
            } catch (ClassNotFoundException e) {
                a.b(new b.C0271a(e));
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

        e(Class<C> cls, String str, int r7) {
            Field declaredField = null;
            if (cls != null) {
                try {
                    this.f3468a = null;
                    declaredField = cls.getDeclaredField(str);
                    if (r7 > 0 && (declaredField.getModifiers() & r7) != r7) {
                        a.b(new b.C0271a(declaredField + " does not match modifiers: " + r7));
                    }
                    declaredField.setAccessible(true);
                    return;
                } catch (NoSuchFieldException e) {
                    b.C0271a c0271a = new b.C0271a(e);
                    c0271a.a((Class<?>) cls);
                    c0271a.b(str);
                    a.b(c0271a);
                    return;
                } finally {
                    this.b = declaredField;
                }
            }
            this.b = null;
        }

        private Field b() {
            return this.b;
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
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

        f(Class<?> cls, String str, Class<?>[] clsArr, int r7) throws NoSuchMethodException {
            Method declaredMethod = null;
            if (cls != null) {
                while (cls != Object.class && cls != null) {
                    try {
                        try {
                            declaredMethod = cls.getDeclaredMethod(str, clsArr);
                            break;
                        } catch (Exception e) {
                            b.C0271a c0271a = new b.C0271a(e);
                            c0271a.a(cls);
                            c0271a.a(str);
                            a.b(c0271a);
                            return;
                        } finally {
                            this.f3469a = declaredMethod;
                        }
                    } catch (NoSuchMethodException | SecurityException unused) {
                        cls = cls.getSuperclass();
                    }
                }
                if (declaredMethod != null) {
                    if (r7 > 0 && (declaredMethod.getModifiers() & r7) != r7) {
                        a.b(new b.C0271a(declaredMethod + " does not match modifiers: " + r7));
                    }
                    declaredMethod.setAccessible(true);
                }
                return;
            }
            this.f3469a = null;
        }

        public final Method a() {
            return this.f3469a;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected Constructor<?> f3467a;

        d(Class<?> cls, Class<?>[] clsArr) throws b.C0271a {
            if (cls == null) {
                return;
            }
            try {
                this.f3467a = cls.getDeclaredConstructor(clsArr);
            } catch (NoSuchMethodException e) {
                b.C0271a c0271a = new b.C0271a(e);
                c0271a.a(cls);
                a.b(c0271a);
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

        /* JADX INFO: renamed from: a, reason: collision with root package name */
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

    private static <T> c<T> a(String str) throws b.C0271a {
        try {
            return new c<>(Class.forName(str));
        } catch (ClassNotFoundException e2) {
            b(new b.C0271a(e2));
            return new c<>(null);
        }
    }

    public static <T> c<T> a(ClassLoader classLoader, String str) throws b.C0271a {
        try {
            return new c<>(classLoader.loadClass(str));
        } catch (Exception e2) {
            b(new b.C0271a(e2));
            return new c<>(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(b.C0271a c0271a) throws b.C0271a {
        InterfaceC0270a interfaceC0270a = f3464a;
        if (interfaceC0270a == null || !interfaceC0270a.a()) {
            throw c0271a;
        }
    }

    private static void a(InterfaceC0270a interfaceC0270a) {
        f3464a = interfaceC0270a;
    }

    private a() {
    }
}
