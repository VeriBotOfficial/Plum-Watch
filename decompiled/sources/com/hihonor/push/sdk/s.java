package com.hihonor.push.sdk;

import android.content.Context;
import android.os.Looper;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes11.dex */
public class s {
    public static final s c = new s();

    /* renamed from: a, reason: collision with root package name */
    public final x f10156a;
    public t b;

    public s() {
        w0.b();
        w0.a();
        Executor b = w0.b();
        Executor a2 = w0.a();
        x xVar = new x();
        xVar.f10166a = b;
        xVar.b = a2;
        this.f10156a = xVar;
    }

    public static Object a(s sVar, v0 v0Var) {
        boolean z;
        Exception exc;
        sVar.getClass();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("await must not be called on the UI thread");
        }
        synchronized (v0Var.f10163a) {
            z = v0Var.b;
        }
        if (!z) {
            t0 t0Var = new t0();
            v0Var.a(new r0(t0Var));
            if (!t0Var.f10159a.await(10000L, timeUnit)) {
                throw new TimeoutException("Timed out waiting for Task");
            }
        }
        if (v0Var.c()) {
            return v0Var.b();
        }
        synchronized (v0Var.f10163a) {
            exc = v0Var.d;
        }
        throw new ExecutionException(exc);
    }

    public boolean a(Context context) {
        if (context != null) {
            a b = f.b(context);
            l lVar = l.SUCCESS;
            return f.a(context, b) == 0;
        }
        throw new NullPointerException("context must not be null.");
    }

    public Context a() {
        t tVar;
        synchronized (c) {
            tVar = this.b;
            if (tVar == null) {
                j.a("verifySdkInitialized sdk not initialized");
                throw new RuntimeException(l.ERROR_NOT_INITIALIZED.a());
            }
        }
        return tVar.f10158a;
    }
}
