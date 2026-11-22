package com.baidu.mshield.x0.d.h;

/* compiled from: SecRunnable.java */
/* loaded from: classes13.dex */
public abstract class b implements a<b> {

    /* renamed from: a, reason: collision with root package name */
    public int f8455a;

    public b() {
        this(5);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(b bVar) {
        try {
            return bVar.f8455a - this.f8455a;
        } catch (Throwable th) {
            com.baidu.mshield.x0.d.d.a(th);
            return 0;
        }
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public void run() {
        a();
    }

    public b(int i) {
        this.f8455a = i;
    }
}
