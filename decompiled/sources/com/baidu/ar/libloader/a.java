package com.baidu.ar.libloader;

import android.content.Context;
import com.baidu.ar.ARType;
import com.baidu.ar.libloader.ILibLoader;

/* loaded from: classes12.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static volatile ILibLoader f7070a = null;
    public static Object b = new Object();
    public static boolean c = false;
    public static volatile boolean d = false;

    public static ILibLoader a() {
        if (f7070a == null) {
            synchronized (b) {
                if (f7070a == null) {
                    f7070a = new b();
                }
            }
        }
        return f7070a;
    }

    public static void a(Context context, ILibLoader.b bVar) {
        if (d) {
            return;
        }
        a().load(context, bVar);
    }

    public static void a(ARType aRType, String str, String str2, ILibLoader.a aVar) {
        if (d) {
            return;
        }
        a().prepareCaseRes(aRType, str, str2, aVar);
    }

    public static void a(ILibLoader iLibLoader) {
        synchronized (b) {
            f7070a = iLibLoader;
            c = true;
        }
        d = false;
    }

    public static void a(ILibLoaderPlugin iLibLoaderPlugin) {
        a().setLibLoadPlugin(iLibLoaderPlugin);
    }

    public static void a(String str) {
        if (d) {
            return;
        }
        a().require(str);
    }

    public static void a(String str, ILibLoader.c cVar) {
        a().setLibReadyListener(str, cVar);
    }

    public static boolean b() {
        boolean z;
        synchronized (b) {
            z = c;
        }
        return z;
    }

    public static void c() {
        d = true;
        c = false;
        if (f7070a != null) {
            f7070a.release();
            f7070a = null;
        }
    }

    public static void d() {
        d = false;
    }
}
