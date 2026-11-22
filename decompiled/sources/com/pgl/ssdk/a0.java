package com.pgl.ssdk;

import android.os.HandlerThread;
import com.pgl.ssdk.a4;

/* loaded from: classes17.dex */
public class a0 {

    /* renamed from: a, reason: collision with root package name */
    private final a3<a1> f12725a;
    private a4 b;

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final a0 f12726a = new a0();
    }

    public static a0 a() {
        return b.f12726a;
    }

    public a4 b() {
        if (this.b == null) {
            synchronized (a0.class) {
                if (this.b == null) {
                    this.b = a("ssdk_net_handler");
                }
            }
        }
        return this.b;
    }

    public a4 c() {
        if (this.b == null) {
            synchronized (a0.class) {
                if (this.b == null) {
                    this.b = a("ssdk_handler");
                }
            }
        }
        return this.b;
    }

    private a0() {
        this.f12725a = a3.a(2);
    }

    public a4 a(String str) {
        return b(null, str);
    }

    private a1 a(a4.a aVar, String str) {
        try {
            HandlerThread handlerThread = new HandlerThread(str);
            handlerThread.start();
            return new a1(handlerThread, aVar);
        } catch (Throwable unused) {
            return null;
        }
    }

    public a4 b(a4.a aVar, String str) {
        a1 a2 = this.f12725a.a();
        if (a2 != null) {
            a2.a(aVar);
            a2.a(str);
            return a2;
        }
        return a(aVar, str);
    }
}
