package com.baidu.ar;

import io.livekit.android.room.util.MediaConstraintKeys;

/* loaded from: classes12.dex */
public final class jd {

    /* renamed from: a, reason: collision with root package name */
    public static b f7042a = null;
    public static boolean b = false;

    public static final class b extends SecurityManager {
        public b() {
        }

        @Override // java.lang.SecurityManager
        public Class<?>[] getClassContext() {
            return super.getClassContext();
        }
    }

    public static Class<?> a() {
        int i;
        b b2 = b();
        if (b2 == null) {
            return null;
        }
        Class<?>[] classContext = b2.getClassContext();
        String name = jd.class.getName();
        int i2 = 0;
        while (i2 < classContext.length && !name.equals(classContext[i2].getName())) {
            i2++;
        }
        if (i2 >= classContext.length || (i = i2 + 2) >= classContext.length) {
            throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
        }
        return classContext[i];
    }

    public static final void a(String str) {
        System.err.println("SLF4J: " + str);
    }

    public static final void a(String str, Throwable th) {
        System.err.println(str);
        System.err.println("Reported exception:");
        th.printStackTrace();
    }

    public static b b() {
        b bVar = f7042a;
        if (bVar != null) {
            return bVar;
        }
        if (b) {
            return null;
        }
        b c = c();
        f7042a = c;
        b = true;
        return c;
    }

    public static boolean b(String str) {
        String c = c(str);
        if (c == null) {
            return false;
        }
        return c.equalsIgnoreCase(MediaConstraintKeys.TRUE);
    }

    public static b c() {
        try {
            return new b();
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static String c(String str) {
        if (str == null) {
            throw new IllegalArgumentException("null input");
        }
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
