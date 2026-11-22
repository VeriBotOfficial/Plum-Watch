package com.baidu.ar.auth;

import com.baidu.ar.gd;
import com.baidu.ar.libloader.ILibLoader;
import com.baidu.ar.statistic.StatisticApi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes12.dex */
public class AuthJni {
    public static volatile AuthJni c;
    public final List<Runnable> b = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public boolean f6798a = false;

    public class a implements ILibLoader.c {

        /* renamed from: com.baidu.ar.auth.AuthJni$a$a, reason: collision with other inner class name */
        public class RunnableC0325a implements Runnable {
            public RunnableC0325a(a aVar) {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (AuthJni.c != null) {
                    try {
                        AuthJni.c.nativeInit();
                        AuthJni.c.f6798a = true;
                        AuthJni.c.b();
                    } catch (Throwable th) {
                        th.printStackTrace();
                        AuthJni.b(AuthJni.c.getVersionStr(), th.getMessage());
                    }
                }
            }
        }

        @Override // com.baidu.ar.libloader.ILibLoader.c
        public void onError() {
        }

        @Override // com.baidu.ar.libloader.ILibLoader.c
        public void onReady() {
            gd.a(new RunnableC0325a(this));
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int[] f6799a;

        public b(int[] iArr) {
            this.f6799a = iArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (AuthJni.c != null) {
                    AuthJni.c.nativeSetGrantedFeatures(this.f6799a);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            try {
                if (AuthJni.c != null) {
                    AuthJni.c.nativePutGrantedFeatures(this.f6799a);
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    public class c implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                AuthJni.c.nativeDestroy();
            } catch (Throwable th) {
                th.printStackTrace();
            }
            AuthJni unused = AuthJni.c = null;
        }
    }

    public static void b(String str, String str2) {
        String name = Thread.currentThread().getName();
        HashMap hashMap = new HashMap();
        hashMap.put("event_param", name + "_" + str + "_" + str2);
        hashMap.put("feature_code", str);
        StatisticApi.onEvent("event_authjni_error", hashMap);
    }

    public static void init() {
        c = new AuthJni();
        com.baidu.ar.libloader.a.a("dumixar");
        com.baidu.ar.libloader.a.a("dumixar", new a());
    }

    public static void release() {
        if (c != null) {
            c.b.clear();
            gd.a(new c());
        }
    }

    public static void setGrantedFeatures(int[] iArr) {
        if (c == null) {
            return;
        }
        b bVar = new b(iArr);
        if (c.f6798a) {
            gd.a(bVar);
        } else {
            c.b.add(bVar);
        }
    }

    public final void b() {
        Iterator<Runnable> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
        this.b.clear();
    }

    public String getVersionStr() {
        try {
            return "ver-" + nativeGetVersion();
        } catch (Throwable th) {
            th.printStackTrace();
            return "EXCEPTION-UNKNOWN";
        }
    }

    public native void nativeDestroy();

    public native int nativeGetVersion();

    public native void nativeInit();

    public native void nativePutGrantedFeatures(int[] iArr);

    public native void nativeSetGrantedFeatures(int[] iArr);

    public void sendAuthFailMessageFromNative(int i) {
        ARAuth.a(i);
    }
}
