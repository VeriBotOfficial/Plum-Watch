package com.huawei.hms.scankit.aiscan.common;

/* JADX INFO: renamed from: com.huawei.hms.scankit.aiscan.common.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AIScanException.java */
/* JADX INFO: loaded from: classes11.dex */
public class C3714a extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static final boolean f10511a;
    protected static final StackTraceElement[] b;
    private static final C3714a c;

    static {
        f10511a = System.getProperty("surefire.test.class.path") != null;
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[0];
        b = stackTraceElementArr;
        C3714a c3714a = new C3714a();
        c = c3714a;
        c3714a.setStackTrace(stackTraceElementArr);
    }

    private C3714a() {
    }

    public static C3714a a() {
        return f10511a ? new C3714a() : c;
    }

    private C3714a(String str) {
        super(str);
    }

    public static C3714a a(String str) {
        return new C3714a(str);
    }
}
