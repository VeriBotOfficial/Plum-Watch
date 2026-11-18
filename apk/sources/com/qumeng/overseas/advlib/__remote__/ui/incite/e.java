package com.qumeng.overseas.advlib.__remote__.ui.incite;

/* JADX INFO: loaded from: classes2.dex */
public class e<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
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

    public void a(int r1) {
        this.f13154a = r1;
    }

    public void a(T t) {
        this.b = t;
    }

    public void a(Exception exc) {
        this.c = exc;
    }
}
