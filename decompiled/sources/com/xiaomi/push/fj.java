package com.xiaomi.push;

import java.io.PrintStream;
import java.io.PrintWriter;

/* loaded from: classes4.dex */
public class fj extends Exception {

    /* renamed from: a, reason: collision with root package name */
    private fs f14591a;

    /* renamed from: a, reason: collision with other field name */
    private ft f536a;

    /* renamed from: a, reason: collision with other field name */
    private Throwable f537a;

    public fj() {
        this.f14591a = null;
        this.f536a = null;
        this.f537a = null;
    }

    public fj(String str) {
        super(str);
        this.f14591a = null;
        this.f536a = null;
        this.f537a = null;
    }

    public fj(Throwable th) {
        this.f14591a = null;
        this.f536a = null;
        this.f537a = th;
    }

    public fj(fs fsVar) {
        this.f536a = null;
        this.f537a = null;
        this.f14591a = fsVar;
    }

    public fj(String str, Throwable th) {
        super(str);
        this.f14591a = null;
        this.f536a = null;
        this.f537a = th;
    }

    public Throwable a() {
        return this.f537a;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        if (this.f537a != null) {
            printStream.println("Nested Exception: ");
            this.f537a.printStackTrace(printStream);
        }
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        if (this.f537a != null) {
            printWriter.println("Nested Exception: ");
            this.f537a.printStackTrace(printWriter);
        }
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        fs fsVar;
        ft ftVar;
        String message = super.getMessage();
        if (message != null || (ftVar = this.f536a) == null) {
            return (message != null || (fsVar = this.f14591a) == null) ? message : fsVar.toString();
        }
        return ftVar.toString();
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String message = super.getMessage();
        if (message != null) {
            sb.append(message).append(": ");
        }
        ft ftVar = this.f536a;
        if (ftVar != null) {
            sb.append(ftVar);
        }
        fs fsVar = this.f14591a;
        if (fsVar != null) {
            sb.append(fsVar);
        }
        if (this.f537a != null) {
            sb.append("\n  -- caused by: ").append(this.f537a);
        }
        return sb.toString();
    }
}
