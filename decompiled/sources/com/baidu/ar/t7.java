package com.baidu.ar;

/* loaded from: classes12.dex */
public class t7 extends Exception {
    private static final long serialVersionUID = 3731842424390998726L;

    /* renamed from: a, reason: collision with root package name */
    public final int f7219a;

    public t7(int i) {
        this.f7219a = i;
    }

    public t7(int i, String str) {
        super(str);
        this.f7219a = i;
    }

    public t7(int i, Throwable th) {
        super(th);
        this.f7219a = i;
    }

    public int a() {
        return this.f7219a;
    }
}
