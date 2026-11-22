package com.baidu.ar;

/* loaded from: classes12.dex */
public class fd {

    /* renamed from: a, reason: collision with root package name */
    public int f6926a = -1;
    public int b = -1;

    public void a() {
        this.f6926a = -1;
        this.b = -1;
    }

    public boolean a(boolean z) {
        int i = this.b;
        if (i != -1) {
            this.f6926a = i;
            this.b = !z ? 1 : 0;
        } else if (z) {
            this.f6926a = i;
            this.b = 0;
        }
        return this.b != -1;
    }

    public boolean b() {
        int i = this.f6926a;
        return (i == 1 || i == -1) && this.b == 0;
    }

    public boolean c() {
        return this.f6926a == 0 && this.b == 1;
    }
}
