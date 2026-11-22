package com.baidu.ar;

/* loaded from: classes12.dex */
public class n3<T> {

    /* renamed from: a, reason: collision with root package name */
    public volatile T f7094a;
    public volatile int b = 0;
    public String c;

    public n3(String str) {
        this.c = str;
    }

    public T a() {
        return this.f7094a;
    }

    public T b() {
        if (this.f7094a != null) {
            return this.f7094a;
        }
        if (c()) {
            synchronized (this) {
                if (this.f7094a == null) {
                    this.f7094a = (T) ab.a(this.c);
                }
            }
        }
        return this.f7094a;
    }

    public boolean c() {
        if (this.b == 1) {
            return true;
        }
        boolean z = false;
        if (this.b == -1) {
            return false;
        }
        try {
            Class.forName(this.c);
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        synchronized (this) {
            this.b = z ? 1 : -1;
        }
        return z;
    }

    public void d() {
        if (this.f7094a != null) {
            this.f7094a = null;
        }
    }
}
