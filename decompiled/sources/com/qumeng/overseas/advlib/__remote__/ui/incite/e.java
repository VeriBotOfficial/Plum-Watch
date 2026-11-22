package com.qumeng.overseas.advlib.__remote__.ui.incite;

/* loaded from: classes17.dex */
public class e<T> {

    /* renamed from: a, reason: collision with root package name */
    private int f13154a;
    private T b;
    private Exception c;

    public int a() {
        return this.f13154a;
    }

    public Exception b() {
        Exception exc = this.c;
        return exc == null ? new Exception("defaultException") : exc;
    }

    public T c() {
        return this.b;
    }

    public boolean d() {
        return this.f13154a == 200 && this.c == null;
    }

    public void a(int i) {
        this.f13154a = i;
    }

    public void a(T t) {
        this.b = t;
    }

    public void a(Exception exc) {
        this.c = exc;
    }
}
