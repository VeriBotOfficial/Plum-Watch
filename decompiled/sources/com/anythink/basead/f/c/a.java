package com.anythink.basead.f.c;

/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile b f2775a;

    public static boolean a() {
        try {
            return f2775a != null;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void a(b bVar) {
        f2775a = bVar;
    }

    public static b b() {
        return f2775a;
    }
}
