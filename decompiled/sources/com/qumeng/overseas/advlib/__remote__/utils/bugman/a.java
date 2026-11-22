package com.qumeng.overseas.advlib.__remote__.utils.bugman;

import android.os.Looper;
import com.qumeng.overseas.advlib.__remote__.core.proto.response.AdsObject;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.a0;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.e;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.h;
import com.qumeng.overseas.advlib.__remote__.utils.n;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/* loaded from: classes17.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final BlockingQueue<b> f13226a = new LinkedBlockingDeque();
    private static final Object b = new Object();
    private static Thread c = null;
    private static boolean d = false;
    private static final Runnable e = new RunnableC0850a();

    /* renamed from: com.qumeng.overseas.advlib.__remote__.utils.bugman.a$a, reason: collision with other inner class name */
    class RunnableC0850a implements Runnable {
        RunnableC0850a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b bVar;
            while (true) {
                try {
                    bVar = (b) a.f13226a.take();
                } catch (Throwable th) {
                    if (th instanceof InterruptedException) {
                        n.b("Bugman", "Caught InterruptedException.", new Object[0]);
                    }
                }
                if (bVar.f13227a == -1) {
                    synchronized (a.b) {
                        boolean unused = a.d = false;
                    }
                    return;
                }
                a.b(bVar);
            }
        }
    }

    public static void c() {
        if (d) {
            return;
        }
        synchronized (b) {
            if (!d) {
                try {
                    Thread a2 = oqm.a.a(e, e.a("BugMan"));
                    c = a2;
                    a2.start();
                    d = true;
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(b bVar) {
        try {
            Map<String, String> postData = bVar.getPostData();
            if (postData != null) {
                a0.a(postData);
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    public static void a(Object obj, String str, Throwable th) {
        a(obj, str, String.valueOf(th.getMessage()), th);
    }

    public static void a(Class cls, String str, Throwable th) {
        a(cls, str, String.valueOf(th.getMessage()), th);
    }

    public static void a(Object obj, String str, String str2, Throwable th) {
        if (obj != null) {
            a((Class) obj.getClass(), str, str2, th);
        }
    }

    public static void a(Class cls, String str, String str2, Throwable th) {
        a(cls, null, str, str2, Collections.emptyMap(), th);
    }

    public static void a(Class cls, String str, String str2, Map<String, String> map, Throwable th) {
        a(cls, null, str, str2, map, th);
    }

    private static void a(Class cls, AdsObject adsObject, String str, String str2, Map<String, String> map, Throwable th) {
        a(cls, adsObject, true, "nsdkerr", str, str2, map, th, null);
    }

    private static void a(Class cls, AdsObject adsObject, boolean z, String str, String str2, String str3, Map<String, String> map, Throwable th, Map<String, String> map2) {
        if (c == null) {
            n.c("Bugman", "perform thread start", new Object[0]);
            c();
        }
        if (cls == null && str3 == null && th == null) {
            return;
        }
        try {
            b bVar = b.tookNewMsg(cls, adsObject, str, str2, str3, map, th, map2);
            if (z) {
                f13226a.offer(bVar);
            } else {
                b(bVar);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void a(Map<String, String> map) {
        a(Object.class, null, Looper.myLooper() == Looper.getMainLooper(), "android_crash", null, null, new h.b().append("opt_lyr", a0.d).getMap(), null, map);
    }
}
