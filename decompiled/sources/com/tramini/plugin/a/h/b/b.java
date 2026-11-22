package com.tramini.plugin.a.h.b;

/* loaded from: classes2.dex */
public abstract class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private int f13746a = 0;
    protected c d;

    public abstract void a();

    final void a(int i) {
        this.f13746a = i;
    }

    private int b() {
        return this.f13746a;
    }

    @Override // java.lang.Runnable
    public void run() {
        a();
    }
}
