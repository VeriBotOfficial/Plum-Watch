package com.baidu.ar;

/* JADX INFO: loaded from: classes16.dex */
public class t7 extends Exception {
    private static final long serialVersionUID = 3731842424390998726L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7219a;

    public t7(int r1) {
        this.f7219a = r1;
    }

    public t7(int r1, String str) {
        super(str);
        this.f7219a = r1;
    }

    public t7(int r1, Throwable th) {
        super(th);
        this.f7219a = r1;
    }

    public int a() {
        return this.f7219a;
    }
}
