package com.anythink.basead.f.d;

/* loaded from: classes11.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f2780a = "262";
    private static volatile a b;

    private static boolean b() {
        try {
            return b != null;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void a(a aVar) {
        b = aVar;
    }

    public static a a() {
        return b;
    }
}
