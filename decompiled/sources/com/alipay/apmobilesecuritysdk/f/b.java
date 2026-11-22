package com.alipay.apmobilesecuritysdk.f;

import java.util.LinkedList;

/* loaded from: classes11.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static b f1301a = new b();
    private Thread b = null;
    private LinkedList<Runnable> c = new LinkedList<>();

    public static b a() {
        return f1301a;
    }

    public synchronized void a(Runnable runnable) {
        this.c.add(runnable);
        if (this.b == null) {
            Thread thread = new Thread(new c(this));
            this.b = thread;
            thread.start();
        }
    }
}
