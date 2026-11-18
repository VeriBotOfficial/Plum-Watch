package com.baidu.mshield.b.c;

/* JADX INFO: compiled from: BaiduLog.java */
/* JADX INFO: loaded from: classes15.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f8416a = -1;

    static {
        new ThreadLocal();
    }

    public static void a(int r0, String str) {
    }

    public static void a(String str) {
        b(str);
    }

    public static void a(Throwable th) {
    }

    public static void b(String str) {
        int r0 = f8416a;
        if (r0 == -1 || r0 == 0 || r0 == 1) {
            a(1, str);
        }
    }

    public static void c(String str) {
        int r0 = f8416a;
        if (r0 == -1 || r0 == 0 || r0 == 1 || r0 == 2) {
            a(2, str);
        }
    }
}
