package com.baidu.ar.ihttp;

import com.baidu.ar.ab;
import com.baidu.ar.d6;

/* loaded from: classes12.dex */
public final class HttpFactory {

    /* renamed from: a, reason: collision with root package name */
    public static volatile d6 f6995a;
    public static volatile int b;
    public static Object c = new Object();

    public static d6 a() {
        if (f6995a != null) {
            return f6995a;
        }
        if (isAvailable()) {
            synchronized (c) {
                if (f6995a == null) {
                    f6995a = (d6) ab.a("com.baidu.ar.http.HttpRequestFactory");
                }
            }
        }
        return f6995a;
    }

    public static boolean isAvailable() {
        if (b == 1) {
            return true;
        }
        if (b == -1) {
            return false;
        }
        synchronized (c) {
            b = 1;
        }
        return true;
    }

    public static IHttpRequest newRequest() {
        d6 a2 = a();
        if (a2 != null) {
            return a2.newRequest();
        }
        return null;
    }

    public static void release() {
        if (f6995a != null) {
            f6995a.release();
            f6995a = null;
        }
    }
}
