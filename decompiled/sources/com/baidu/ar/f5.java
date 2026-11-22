package com.baidu.ar;

import com.baidu.ar.ihttp.HttpException;
import com.baidu.ar.ihttp.IProgressCallback;
import java.net.HttpURLConnection;

/* loaded from: classes12.dex */
public class f5 implements b6 {

    /* renamed from: a, reason: collision with root package name */
    public j5 f6922a;
    public c6 b;
    public HttpURLConnection c;
    public l5 d;
    public Object e;
    public volatile boolean f;
    public IProgressCallback g;

    public f5(j5 j5Var) {
        this(j5Var, null);
    }

    public f5(j5 j5Var, c6 c6Var) {
        this.e = new Object();
        this.f = false;
        this.f6922a = j5Var;
        this.b = c6Var;
        this.c = null;
        this.d = null;
    }

    @Override // com.baidu.ar.b6
    public l5 a() {
        return this.d;
    }

    public void a(IProgressCallback iProgressCallback) {
        this.g = iProgressCallback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fd  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.io.Closeable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.baidu.ar.l5 b() {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.ar.f5.b():com.baidu.ar.l5");
    }

    @Override // com.baidu.ar.b6
    public void cancel() {
        if (this.f) {
            return;
        }
        this.b = null;
        this.g = null;
        synchronized (this.e) {
            this.f = true;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        HttpURLConnection httpURLConnection;
        boolean z;
        HttpException e;
        boolean z2;
        c6 c6Var;
        l5 b;
        c6 c6Var2;
        try {
            try {
                b = b();
                try {
                    try {
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (HttpException e2) {
                    z2 = false;
                    e = e2;
                }
            } catch (HttpException e3) {
                z = false;
                e = e3;
                z2 = false;
            }
            synchronized (this.e) {
                try {
                    z = this.f;
                    if (!z && (c6Var2 = this.b) != null) {
                        try {
                            c6Var2.a(b);
                        } catch (HttpException e4) {
                            e = e4;
                            z2 = true;
                            if (!z && !z2 && (c6Var = this.b) != null) {
                                c6Var.a(e);
                            }
                            if (httpURLConnection == null) {
                                return;
                            }
                        }
                    }
                    HttpURLConnection httpURLConnection2 = this.c;
                    if (httpURLConnection2 == null) {
                    }
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
        } finally {
            httpURLConnection = this.c;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        }
    }
}
