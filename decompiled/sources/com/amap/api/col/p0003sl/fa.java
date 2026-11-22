package com.amap.api.col.p0003sl;

import java.lang.Thread;

/* compiled from: BasicLogHandler.java */
/* loaded from: classes11.dex */
public class fa {
    protected static fa c;

    /* renamed from: a, reason: collision with root package name */
    protected Thread.UncaughtExceptionHandler f1653a;
    protected boolean b = true;

    public static void a(Throwable th, String str, String str2) {
        fa faVar = c;
        if (faVar != null) {
            faVar.a(th, 1, str, str2);
        }
    }

    protected void a(Throwable th, int i, String str, String str2) {
        throw null;
    }
}
