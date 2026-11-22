package com.mbridge.msdk.foundation.tools;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.FastKV;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: FastKVConfig.java */
/* loaded from: classes17.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    static volatile Executor f11648a;
    static FastKV.c b = new a();

    /* compiled from: FastKVConfig.java */
    class b implements ThreadFactory {
        b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "mb-sp-handler");
        }
    }

    private a0() {
    }

    static Executor a() {
        if (f11648a == null) {
            synchronized (a0.class) {
                if (f11648a == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(4, 4, 10L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new b(), new ThreadPoolExecutor.DiscardPolicy());
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    f11648a = threadPoolExecutor;
                }
            }
        }
        return f11648a;
    }

    /* compiled from: FastKVConfig.java */
    class a implements FastKV.c {
        a() {
        }

        @Override // com.mbridge.msdk.foundation.tools.FastKV.c
        public void a(String str, String str2) {
            if (MBridgeConstans.DEBUG) {
                o0.c("FastKVConfig", str + " " + str2);
            }
        }

        @Override // com.mbridge.msdk.foundation.tools.FastKV.c
        public void b(String str, Exception exc) {
            if (MBridgeConstans.DEBUG) {
                o0.b("FastKVConfig", str, exc);
            }
        }

        @Override // com.mbridge.msdk.foundation.tools.FastKV.c
        public void a(String str, Exception exc) {
            if (MBridgeConstans.DEBUG) {
                o0.c("FastKVConfig", str, exc);
            }
        }
    }
}
