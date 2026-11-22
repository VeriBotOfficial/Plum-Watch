package com.baidu.mshield.x0.e;

import android.text.TextUtils;
import com.baidu.mshield.x0.d.d;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;

/* compiled from: CrashHandler.java */
/* loaded from: classes13.dex */
public class a implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public static a f8458a = new a();
    public Thread.UncaughtExceptionHandler b;
    public boolean c;
    public b d;

    public static a a() {
        return f8458a;
    }

    public synchronized void b() {
        try {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.b;
            if (uncaughtExceptionHandler != null) {
                Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
                this.b = null;
            }
        } finally {
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        b bVar;
        try {
            String a2 = a(th);
            if (!TextUtils.isEmpty(a2) && ((a2.contains("mshield") || a2.contains("WebViewProvider") || a2.contains("createWebView")) && (bVar = this.d) != null)) {
                bVar.a(a2);
            }
        } catch (Throwable th2) {
            d.a(th2);
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.b;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    public synchronized void a(b bVar) {
        this.d = bVar;
        if (bVar == null) {
            return;
        }
        if (bVar.a()) {
            if (this.c) {
                return;
            }
            this.c = true;
            this.b = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    public final String a(Throwable th) {
        PrintWriter printWriter;
        StringWriter stringWriter;
        try {
            stringWriter = new StringWriter();
            printWriter = new PrintWriter(stringWriter);
        } catch (Throwable unused) {
            printWriter = null;
        }
        try {
            th.printStackTrace(printWriter);
            String obj = stringWriter.toString();
            printWriter.close();
            return obj;
        } catch (Throwable unused2) {
            if (printWriter == null) {
                return "";
            }
            printWriter.close();
            return "";
        }
    }
}
