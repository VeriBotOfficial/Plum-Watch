package com.baidu.mshield.x6.f.m;

import com.baidu.mshield.x6.f.f;

/* compiled from: FinRunnable.java */
/* loaded from: classes13.dex */
public abstract class a implements d<a> {

    /* renamed from: a, reason: collision with root package name */
    public int f8487a;

    public a() {
        this(5);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(a aVar) {
        try {
            return aVar.f8487a - this.f8487a;
        } catch (Throwable th) {
            f.b(th);
            return 0;
        }
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public void run() {
        a();
    }

    public a(int i) {
        this.f8487a = i;
    }
}
