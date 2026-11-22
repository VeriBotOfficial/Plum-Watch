package com.baidu.ar;

import com.baidu.ar.ihttp.HttpException;

/* loaded from: classes12.dex */
public class a4 implements b6 {

    /* renamed from: a, reason: collision with root package name */
    public c6 f6767a;
    public HttpException b;
    public Object c = new Object();
    public volatile boolean d = false;

    public a4(HttpException httpException, c6 c6Var) {
        this.b = httpException;
        this.f6767a = c6Var;
    }

    @Override // com.baidu.ar.b6
    public l5 a() {
        return null;
    }

    @Override // com.baidu.ar.b6
    public void cancel() {
        if (this.d) {
            return;
        }
        synchronized (this.c) {
            this.d = true;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.c) {
            if (this.d) {
                return;
            }
            c6 c6Var = this.f6767a;
            if (c6Var != null) {
                c6Var.a(this.b);
            }
        }
    }
}
