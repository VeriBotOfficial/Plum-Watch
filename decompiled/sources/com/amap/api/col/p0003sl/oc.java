package com.amap.api.col.p0003sl;

import android.text.TextUtils;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: BasicThreadFactory.java */
/* loaded from: classes11.dex */
public class oc implements ThreadFactory {
    private static final int j;
    private static final int k;
    private static final int l;

    /* renamed from: a, reason: collision with root package name */
    private final AtomicLong f1816a;
    private final ThreadFactory b;
    private final Thread.UncaughtExceptionHandler c;
    private final String d;
    private final Integer e;
    private final int f;
    private final int g;
    private final BlockingQueue<Runnable> h;
    private final int i;

    /* compiled from: BasicThreadFactory.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private Thread.UncaughtExceptionHandler f1817a;
        private String b;
        private Integer c;
        private int d = oc.k;
        private int e;
        private BlockingQueue<Runnable> f;

        public a() {
            int unused = oc.l;
            this.e = 30;
        }

        static /* synthetic */ ThreadFactory a(a aVar) {
            aVar.getClass();
            return null;
        }

        static /* synthetic */ Boolean g(a aVar) {
            aVar.getClass();
            return null;
        }

        public a a(String str) {
            if (str == null) {
                throw new NullPointerException("Naming pattern must not be null!");
            }
            this.b = str;
            return this;
        }

        public a b(int i) {
            if (i > 0) {
                return this;
            }
            throw new NullPointerException("maxPoolSize  must > 0!");
        }

        public a c(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        public a a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            if (uncaughtExceptionHandler != null) {
                this.f1817a = uncaughtExceptionHandler;
                return this;
            }
            throw new NullPointerException("Uncaught exception handler must not be null!");
        }

        public a a(int i) {
            if (i > 0) {
                this.d = i;
                return this;
            }
            throw new NullPointerException("corePoolSize  must > 0!");
        }

        public a a(BlockingQueue<Runnable> blockingQueue) {
            this.f = blockingQueue;
            return this;
        }

        public oc a() {
            oc ocVar = new oc(this, (byte) 0);
            this.f1817a = null;
            this.b = null;
            this.c = null;
            return ocVar;
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        j = availableProcessors;
        k = Math.max(2, Math.min(availableProcessors, 4));
        l = Math.min(availableProcessors * 2, Math.max(8, availableProcessors * 4));
    }

    /* synthetic */ oc(a aVar, byte b) {
        this(aVar);
    }

    public int c() {
        return this.f;
    }

    public int d() {
        return this.i;
    }

    public int e() {
        return this.g;
    }

    public final String f() {
        return this.d;
    }

    public BlockingQueue<Runnable> g() {
        return this.h;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread newThread = this.b.newThread(runnable);
        if (this.d != null) {
            newThread.setName(String.format(this.d + "-%d", Long.valueOf(this.f1816a.incrementAndGet())));
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.c;
        if (uncaughtExceptionHandler != null) {
            newThread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
        }
        Integer num = this.e;
        if (num != null) {
            newThread.setPriority(num.intValue());
        }
        return newThread;
    }

    private oc(a aVar) {
        a.a(aVar);
        this.b = Executors.defaultThreadFactory();
        int i = aVar.d;
        this.f = i;
        int i2 = l;
        this.g = i2;
        if (i2 < i) {
            throw new NullPointerException("maxPoolSize must > corePoolSize!");
        }
        this.i = aVar.e;
        if (aVar.f == null) {
            this.h = new sc();
        } else {
            this.h = aVar.f;
        }
        if (TextUtils.isEmpty(aVar.b)) {
            this.d = "amap-threadpool";
        } else {
            this.d = aVar.b;
        }
        this.e = aVar.c;
        a.g(aVar);
        this.c = aVar.f1817a;
        this.f1816a = new AtomicLong();
    }
}
