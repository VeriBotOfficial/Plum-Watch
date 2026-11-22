package com.huawei.hms.scankit.aiscan.common;

/* compiled from: AIScanException.java */
/* renamed from: com.huawei.hms.scankit.aiscan.common.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C2967a extends Exception {

    /* renamed from: a, reason: collision with root package name */
    protected static final boolean f10511a;
    protected static final StackTraceElement[] b;
    private static final C2967a c;

    static {
        f10511a = System.getProperty("surefire.test.class.path") != null;
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[0];
        b = stackTraceElementArr;
        C2967a c2967a = new C2967a();
        c = c2967a;
        c2967a.setStackTrace(stackTraceElementArr);
    }

    private C2967a() {
    }

    public static C2967a a() {
        return f10511a ? new C2967a() : c;
    }

    private C2967a(String str) {
        super(str);
    }

    public static C2967a a(String str) {
        return new C2967a(str);
    }
}
