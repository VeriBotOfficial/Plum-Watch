package com.baidu.ar;

/* JADX INFO: loaded from: classes16.dex */
public class fd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6926a = -1;
    public int b = -1;

    public void a() {
        this.f6926a = -1;
        this.b = -1;
    }

    public boolean a(boolean z) {
        int r0 = this.b;
        if (r0 != -1) {
            this.f6926a = r0;
            this.b = !z ? 1 : 0;
        } else if (z) {
            this.f6926a = r0;
            this.b = 0;
        }
        return this.b != -1;
    }

    public boolean b() {
        int r0 = this.f6926a;
        return (r0 == 1 || r0 == -1) && this.b == 0;
    }

    public boolean c() {
        return this.f6926a == 0 && this.b == 1;
    }
}
