package com.baidu.mshield.x6.f.m;

import com.baidu.mshield.x6.EngineImpl;
import com.baidu.mshield.x6.f.f;
import java.io.File;
import java.io.FileFilter;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: FinThreadPoolExecutor.java */
/* loaded from: classes13.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static c f8489a = null;
    public static int b = Integer.MAX_VALUE;
    public static long c = 120;
    public ThreadPoolExecutor d;

    /* compiled from: FinThreadPoolExecutor.java */
    public class a implements FileFilter {
        public a(c cVar) {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return Pattern.matches("cpu[0-9]", file.getName());
        }
    }

    public c() {
        int a2 = (a() / 2) + 2;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(a2 > 5 ? 5 : a2, b, c, TimeUnit.SECONDS, new PriorityBlockingQueue());
        this.d = threadPoolExecutor;
        threadPoolExecutor.setThreadFactory(new b());
    }

    public static c b() {
        synchronized (c.class) {
            if (f8489a == null) {
                f8489a = new c();
            }
        }
        return f8489a;
    }

    public void a(d dVar) {
        try {
            if (EngineImpl.isUnload) {
                return;
            }
            this.d.execute(dVar);
        } catch (Throwable th) {
            f.b(th);
        }
    }

    public void c() {
        try {
            this.d.shutdownNow();
            f8489a = null;
        } catch (Throwable th) {
            f.b(th);
        }
    }

    public int a() {
        try {
            return new File("/sys/devices/system/cpu/").listFiles(new a(this)).length;
        } catch (Throwable th) {
            f.b(th);
            return 2;
        }
    }
}
