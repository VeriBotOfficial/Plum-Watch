package com.anythink.core.common.v.b;

/* loaded from: classes12.dex */
public abstract class d implements Runnable {
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 3;
    protected e h;
    protected boolean g = true;
    protected int i = 1;

    /* renamed from: a, reason: collision with root package name */
    private long f4400a = 0;
    private String b = "anythink_default_thread";

    public abstract void a();

    public final void a(long j) {
        this.f4400a = j;
    }

    public final long b() {
        return this.f4400a;
    }

    private void a(e eVar) {
        this.h = eVar;
    }

    public final void a(String str) {
        this.b = str;
    }

    private String c() {
        return this.b;
    }

    @Override // java.lang.Runnable
    public void run() {
        Thread.currentThread().setName(this.b);
        a();
    }
}
