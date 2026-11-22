package com.baidu.ar;

import com.baidu.ar.ihttp.HttpException;
import com.baidu.ar.ihttp.IProgressCallback;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes12.dex */
public class h5 {

    /* renamed from: a, reason: collision with root package name */
    public ExecutorService f6963a;
    public int b;
    public int c;
    public int d;
    public long e;

    public class a implements RejectedExecutionHandler {
        public a(h5 h5Var) {
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            h.b("HttpRequestExecutor", "请求队列已满，请求被丢弃");
        }
    }

    public h5(int i, int i2, int i3, long j) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = j;
    }

    public b6 a(HttpException httpException, c6 c6Var) {
        a4 a4Var = new a4(httpException, c6Var);
        a().submit(a4Var);
        return a4Var;
    }

    public b6 a(j5 j5Var, c6 c6Var, IProgressCallback iProgressCallback) {
        f5 f5Var = new f5(j5Var, c6Var);
        f5Var.a(iProgressCallback);
        a().submit(f5Var);
        return f5Var;
    }

    public b6 a(j5 j5Var, IProgressCallback iProgressCallback) {
        f5 f5Var = new f5(j5Var);
        f5Var.a(iProgressCallback);
        f5Var.b();
        return f5Var;
    }

    public final ExecutorService a() {
        if (this.f6963a == null) {
            this.f6963a = new ThreadPoolExecutor(this.b, this.c, this.e, TimeUnit.SECONDS, new LinkedBlockingQueue(this.d), Executors.defaultThreadFactory(), new a(this));
        }
        return this.f6963a;
    }

    public void b() {
        ExecutorService executorService = this.f6963a;
        if (executorService != null) {
            executorService.shutdown();
        }
    }
}
