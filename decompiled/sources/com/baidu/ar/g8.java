package com.baidu.ar;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import orgar.slf4j.impl.StaticLoggerBinder;

/* loaded from: classes12.dex */
public final class g8 {

    /* renamed from: a, reason: collision with root package name */
    public static volatile int f6946a;
    public static final jc b = new jc();
    public static final f9 c = new f9();
    public static boolean d = jd.b("slf4j.detectLoggerNameMismatch");
    public static final String[] e = {"1.6", "1.7"};
    public static String f = "orgar/slf4j/impl/StaticLoggerBinder.class";

    public static f8 a(Class<?> cls) {
        Class<?> a2;
        f8 a3 = a(cls.getName());
        if (d && (a2 = jd.a()) != null && a(cls, a2)) {
            jd.a(String.format("Detected logger name mismatch. Given name: \"%s\"; computed name: \"%s\".", a3.getName(), a2.getName()));
            jd.a("See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
        }
        return a3;
    }

    public static f8 a(String str) {
        return e().a(str);
    }

    public static final void a() {
        Set<URL> set;
        try {
            if (f()) {
                set = null;
            } else {
                set = c();
                c(set);
            }
            StaticLoggerBinder.getSingleton();
            f6946a = 3;
            b(set);
            d();
            h();
            b.a();
        } catch (Exception e2) {
            a(e2);
            throw new IllegalStateException("Unexpected initialization failure", e2);
        } catch (NoClassDefFoundError e3) {
            if (!b(e3.getMessage())) {
                a(e3);
                throw e3;
            }
            f6946a = 4;
            jd.a("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
            jd.a("Defaulting to no-operation (NOP) logger implementation");
            jd.a("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
        } catch (NoSuchMethodError e4) {
            String message = e4.getMessage();
            if (message != null && message.contains("org.slf4j.impl.StaticLoggerBinder.getSingleton()")) {
                f6946a = 2;
                jd.a("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                jd.a("Your binding is version 1.5.5 or earlier.");
                jd.a("Upgrade your binding to version 1.6.x.");
            }
            throw e4;
        }
    }

    public static void a(int i) {
        jd.a("A number (" + i + ") of logging calls during the initialization phase have been intercepted and are");
        jd.a("now being replayed. These are subject to the filtering rules of the underlying logging system.");
        jd.a("See also http://www.slf4j.org/codes.html#replay");
    }

    public static void a(kc kcVar) {
        if (kcVar == null) {
            return;
        }
        ic a2 = kcVar.a();
        String name = a2.getName();
        if (a2.f()) {
            throw new IllegalStateException("Delegate logger cannot be null at this state.");
        }
        if (a2.e()) {
            return;
        }
        if (a2.d()) {
            a2.a(kcVar);
        } else {
            jd.a(name);
        }
    }

    public static void a(kc kcVar, int i) {
        if (kcVar.a().d()) {
            a(i);
        } else {
            if (kcVar.a().e()) {
                return;
            }
            b();
        }
    }

    public static void a(Throwable th) {
        f6946a = 2;
        jd.a("Failed to instantiate SLF4J LoggerFactory", th);
    }

    public static boolean a(Class<?> cls, Class<?> cls2) {
        return !cls2.isAssignableFrom(cls);
    }

    public static boolean a(Set<URL> set) {
        return set.size() > 1;
    }

    public static void b() {
        jd.a("The following set of substitute loggers may have been accessed");
        jd.a("during the initialization phase. Logging calls during this");
        jd.a("phase were not honored. However, subsequent logging calls to these");
        jd.a("loggers will work as normally expected.");
        jd.a("See also http://www.slf4j.org/codes.html#substituteLogger");
    }

    public static void b(Set<URL> set) {
        if (set == null || !a(set)) {
            return;
        }
        jd.a("Actual binding is of type [" + StaticLoggerBinder.getSingleton().getLoggerFactoryClassStr() + "]");
    }

    public static boolean b(String str) {
        if (str == null) {
            return false;
        }
        return str.contains("orgar/slf4j/impl/StaticLoggerBinder") || str.contains("orgar.slf4j.impl.StaticLoggerBinder");
    }

    public static Set<URL> c() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = g8.class.getClassLoader();
            Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources(f) : classLoader.getResources(f);
            while (systemResources.hasMoreElements()) {
                linkedHashSet.add(systemResources.nextElement());
            }
        } catch (IOException e2) {
            jd.a("Error getting resources from path", e2);
        }
        return linkedHashSet;
    }

    public static void c(Set<URL> set) {
        if (a(set)) {
            jd.a("Class path contains multiple SLF4J bindings.");
            Iterator<URL> it = set.iterator();
            while (it.hasNext()) {
                jd.a("Found binding in [" + it.next() + "]");
            }
            jd.a("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    public static void d() {
        jc jcVar = b;
        synchronized (jcVar) {
            jcVar.d();
            for (ic icVar : jcVar.c()) {
                icVar.a(a(icVar.getName()));
            }
        }
    }

    public static i6 e() {
        if (f6946a == 0) {
            synchronized (g8.class) {
                if (f6946a == 0) {
                    f6946a = 1;
                    g();
                }
            }
        }
        int i = f6946a;
        if (i == 1) {
            return b;
        }
        if (i == 2) {
            throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
        }
        if (i == 3) {
            return StaticLoggerBinder.getSingleton().getLoggerFactory();
        }
        if (i == 4) {
            return c;
        }
        throw new IllegalStateException("Unreachable code");
    }

    public static boolean f() {
        String c2 = jd.c("java.vendor.url");
        if (c2 == null) {
            return false;
        }
        return c2.toLowerCase().contains("android");
    }

    public static final void g() {
        a();
        if (f6946a == 3) {
            i();
        }
    }

    public static void h() {
        LinkedBlockingQueue<kc> b2 = b.b();
        int size = b2.size();
        ArrayList<kc> arrayList = new ArrayList(128);
        int i = 0;
        while (b2.drainTo(arrayList, 128) != 0) {
            for (kc kcVar : arrayList) {
                a(kcVar);
                int i2 = i + 1;
                if (i == 0) {
                    a(kcVar, size);
                }
                i = i2;
            }
            arrayList.clear();
        }
    }

    public static final void i() {
        try {
            String str = StaticLoggerBinder.REQUESTED_API_VERSION;
            boolean z = false;
            for (String str2 : e) {
                if (str.startsWith(str2)) {
                    z = true;
                }
            }
            if (z) {
                return;
            }
            jd.a("The requested version " + str + " by your slf4j binding is not compatible with " + Arrays.asList(e).toString());
            jd.a("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
        } catch (NoSuchFieldError unused) {
        } catch (Throwable th) {
            jd.a("Unexpected problem occured during version sanity check", th);
        }
    }
}
