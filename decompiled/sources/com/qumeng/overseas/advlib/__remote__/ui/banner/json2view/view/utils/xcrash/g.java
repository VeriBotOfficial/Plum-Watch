package com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.utils.xcrash;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;

/* loaded from: classes17.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f13085a = false;
    private static String b;
    private static String c;
    private static String d;

    class a extends Thread {
        a() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            throw new RuntimeException("test java exception");
        }
    }

    public interface b {
        void onCrash(String str, String str2) throws Exception;
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        String f13086a = null;
        String b = null;
        int c = 5000;
        int d = 0;
        int e = 128;
        boolean f = true;
        int g = 10;
        int h = 0;
        b i = null;

        public c disableJavaCrashHandler() {
            this.f = false;
            return this;
        }

        public c enableJavaCrashHandler() {
            this.f = true;
            return this;
        }

        public c setAppVersion(String str) {
            this.f13086a = str;
            return this;
        }

        public c setDefaultHandler(int i) {
            this.h = i;
            return this;
        }

        public c setJavaCallback(b bVar) {
            this.i = bVar;
            return this;
        }

        public c setJavaLogCountMax(int i) {
            if (i < 1) {
                i = 1;
            }
            this.g = i;
            return this;
        }

        public c setLogDir(String str) {
            this.b = str;
            return this;
        }

        public c setLogFileMaintainDelayMs(int i) {
            if (i < 0) {
                i = 0;
            }
            this.c = i;
            return this;
        }

        public c setPlaceholderCountMax(int i) {
            if (i < 0) {
                i = 0;
            }
            this.d = i;
            return this;
        }

        public c setPlaceholderSizeKb(int i) {
            if (i < 0) {
                i = 0;
            }
            this.e = i;
            return this;
        }
    }

    private g() {
    }

    public static int a(Context context) {
        return a(context, null);
    }

    static String b() {
        return c;
    }

    public static String c() {
        return d;
    }

    public static synchronized int a(Context context, c cVar) {
        synchronized (g.class) {
            if (f13085a) {
                return 0;
            }
            f13085a = true;
            if (context == null) {
                return -1;
            }
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            if (cVar == null) {
                cVar = new c();
            }
            String packageName = context.getPackageName();
            b = packageName;
            if (TextUtils.isEmpty(packageName)) {
                b = "unknown";
            }
            if (TextUtils.isEmpty(cVar.f13086a)) {
                cVar.f13086a = com.qumeng.overseas.advlib.__remote__.core.proto.utils.b.b(context);
            }
            c = cVar.f13086a;
            if (TextUtils.isEmpty(cVar.b)) {
                cVar.b = context.getFilesDir() + "/qmtombstones";
            }
            d = cVar.b;
            int myPid = Process.myPid();
            String a2 = cVar.f ? f.a(context, myPid) : null;
            com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.utils.xcrash.b.b().a(cVar.b, cVar.g, cVar.d, cVar.e, cVar.c);
            if (cVar.f) {
                com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.utils.xcrash.c.a().a(myPid, a2, b, cVar.f13086a, cVar.b, cVar.h, cVar.i);
            }
            com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.utils.xcrash.b.b().d();
            return 0;
        }
    }

    static String a() {
        return b;
    }

    public static void a(boolean z) throws RuntimeException {
        if (z) {
            a aVar = new a();
            aVar.setName("xcrash_test_java_thread");
            aVar.start();
            return;
        }
        throw new RuntimeException("test java exception");
    }
}
