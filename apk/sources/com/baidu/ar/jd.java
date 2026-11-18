package com.baidu.ar;

import io.livekit.android.room.util.MediaConstraintKeys;

/* JADX INFO: loaded from: classes16.dex */
public final class jd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
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
        int r2;
        b bVarB = b();
        if (bVarB == null) {
            return null;
        }
        Class<?>[] classContext = bVarB.getClassContext();
        String name = jd.class.getName();
        int r3 = 0;
        while (r3 < classContext.length && !name.equals(classContext[r3].getName())) {
            r3++;
        }
        if (r3 >= classContext.length || (r2 = r3 + 2) >= classContext.length) {
            throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
        }
        return classContext[r2];
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
        b bVarC = c();
        f7042a = bVarC;
        b = true;
        return bVarC;
    }

    public static boolean b(String str) {
        String strC = c(str);
        if (strC == null) {
            return false;
        }
        return strC.equalsIgnoreCase(MediaConstraintKeys.TRUE);
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
