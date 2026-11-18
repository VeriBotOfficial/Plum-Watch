package com.amap.api.col.p0003sl;

/* JADX INFO: compiled from: BasicLogHandler.java */
/* JADX INFO: loaded from: classes7.dex */
public class fa {
    protected static fa c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Thread.UncaughtExceptionHandler f1653a;
    protected boolean b = true;

    public static void a(Throwable th, String str, String str2) {
        fa faVar = c;
        if (faVar != null) {
            faVar.a(th, 1, str, str2);
        }
    }

    protected void a(Throwable th, int r2, String str, String str2) {
        throw null;
    }
}
