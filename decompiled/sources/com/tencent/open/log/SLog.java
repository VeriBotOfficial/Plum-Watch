package com.tencent.open.log;

import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;
import com.tencent.open.log.d;
import java.io.File;

/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SLog implements TraceLevel {
    public static final String TAG = "openSDK_LOG";
    private static boolean c = false;
    public static SLog instance;

    /* renamed from: a, reason: collision with root package name */
    protected a f13651a;
    private Tracer b;

    public static SLog getInstance() {
        if (instance == null) {
            synchronized (SLog.class) {
                if (instance == null) {
                    SLog sLog = new SLog();
                    instance = sLog;
                    sLog.d();
                    c = true;
                }
            }
        }
        return instance;
    }

    private SLog() {
    }

    private void d() {
        this.f13651a = new a(new b(a(), c.m, c.g, c.h, c.c, c.i, 10, c.e, c.n));
    }

    protected void a(int i, String str, String str2, Throwable th) {
        if (c) {
            String b = com.tencent.open.utils.g.b();
            if (!TextUtils.isEmpty(b)) {
                String str3 = b + " SDK_VERSION:3.5.13.lite";
                if (this.f13651a == null) {
                    return;
                }
                e.f13657a.a(32, Thread.currentThread(), System.currentTimeMillis(), TAG, str3, null);
                this.f13651a.a(32, Thread.currentThread(), System.currentTimeMillis(), TAG, str3, null);
                c = false;
            }
        }
        e.f13657a.a(i, Thread.currentThread(), System.currentTimeMillis(), str, str2, th);
        if (d.a.a(c.b, i)) {
            a aVar = this.f13651a;
            if (aVar == null) {
                return;
            } else {
                aVar.a(i, Thread.currentThread(), System.currentTimeMillis(), str, str2, th);
            }
        }
        Tracer tracer = this.b;
        if (tracer != null) {
            try {
                tracer.a(i, Thread.currentThread(), System.currentTimeMillis(), str, a(str2), th);
            } catch (Exception e) {
                Log.e(str, "Exception", e);
            }
        }
    }

    private String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return d.a(str) ? "xxxxxx" : str;
    }

    public static final void v(String str, String str2) {
        getInstance().a(1, str, str2, null);
    }

    public static final void v(String str, String str2, Throwable th) {
        getInstance().a(1, str, str2, th);
    }

    public static final void d(String str, String str2) {
        getInstance().a(2, str, str2, null);
    }

    public static final void d(String str, String str2, Throwable th) {
        getInstance().a(2, str, str2, th);
    }

    public static final void i(String str, String str2) {
        getInstance().a(4, str, str2, null);
    }

    public static final void i(String str, String str2, Throwable th) {
        getInstance().a(4, str, str2, th);
    }

    public static final void w(String str, String str2) {
        getInstance().a(8, str, str2, null);
    }

    public static final void w(String str, String str2, Throwable th) {
        getInstance().a(8, str, str2, th);
    }

    public static final void e(String str, String str2) {
        getInstance().a(16, str, str2, null);
    }

    public static final void e(String str, String str2, Throwable th) {
        getInstance().a(16, str, str2, th);
    }

    public static final void u(String str, String str2) {
        getInstance().a(32, str, str2, null);
    }

    public static final void u(String str, String str2, Throwable th) {
        getInstance().a(32, str, str2, th);
    }

    public static void flushLogs() {
        getInstance().c();
    }

    public static void release() {
        synchronized (SLog.class) {
            getInstance().b();
            if (instance != null) {
                instance = null;
            }
        }
    }

    protected static File a() {
        String str = c.d;
        try {
            d.c b = d.b.b();
            if (b != null && b.c() > c.f) {
                return new File(Environment.getExternalStorageDirectory(), str);
            }
            return new File(com.tencent.open.utils.g.c(), str);
        } catch (Throwable th) {
            e(TAG, "getLogFilePath:", th);
            return null;
        }
    }

    protected void b() {
        a aVar = this.f13651a;
        if (aVar != null) {
            aVar.a();
            this.f13651a.b();
            this.f13651a = null;
        }
    }

    protected void c() {
        a aVar = this.f13651a;
        if (aVar != null) {
            aVar.a();
        }
    }

    public void setCustomLogger(Tracer tracer) {
        this.b = tracer;
    }
}
