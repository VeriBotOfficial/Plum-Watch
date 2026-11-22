package com.umeng.analytics.pro;

/* compiled from: TProtocolException.java */
/* loaded from: classes2.dex */
public class bt extends az {

    /* renamed from: a, reason: collision with root package name */
    public static final int f13821a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;
    private static final long h = 1;
    protected int g;

    public bt() {
        this.g = 0;
    }

    public bt(int i) {
        this.g = i;
    }

    public bt(int i, String str) {
        super(str);
        this.g = i;
    }

    public bt(String str) {
        super(str);
        this.g = 0;
    }

    public bt(int i, Throwable th) {
        super(th);
        this.g = i;
    }

    public bt(Throwable th) {
        super(th);
        this.g = 0;
    }

    public bt(String str, Throwable th) {
        super(str, th);
        this.g = 0;
    }

    public bt(int i, String str, Throwable th) {
        super(str, th);
        this.g = i;
    }

    public int a() {
        return this.g;
    }
}
