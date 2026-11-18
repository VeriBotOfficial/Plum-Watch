package com.baidu.location.b;

import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes15.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ExecutorService f7593a;
    private ExecutorService b;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static x f7594a = new x();
    }

    private x() {
        this.f7593a = null;
        this.b = null;
    }

    public static x a() {
        return a.f7594a;
    }

    public synchronized ExecutorService b() {
        return this.f7593a;
    }

    public synchronized ExecutorService c() {
        return this.b;
    }

    public void d() {
        ExecutorService executorService = this.f7593a;
        if (executorService != null) {
            executorService.shutdown();
        }
        ExecutorService executorService2 = this.b;
        if (executorService2 != null) {
            executorService2.shutdown();
        }
    }
}
