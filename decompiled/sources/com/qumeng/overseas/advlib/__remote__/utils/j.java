package com.qumeng.overseas.advlib.__remote__.utils;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.x;

/* loaded from: classes17.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private static final Handler f13234a = new Handler(Looper.getMainLooper());
    private static final HandlerThread b = new HandlerThread("CPC_BUSINESS_HANDLER");
    private static Handler c;

    public static abstract class a<T> extends x.c {

        /* renamed from: com.qumeng.overseas.advlib.__remote__.utils.j$a$a, reason: collision with other inner class name */
        class C0852a extends x.c {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Object f13235a;

            C0852a(Object obj) {
                this.f13235a = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.qumeng.overseas.advlib.__remote__.core.proto.utils.x.c
            public void Run() {
                a.this.onPostResult(this.f13235a);
            }
        }

        @Override // com.qumeng.overseas.advlib.__remote__.core.proto.utils.x.c
        public final void Run() {
            j.f13234a.post(new C0852a(asyncRun()));
        }

        public abstract T asyncRun();

        public void onPostResult(T t) {
        }
    }

    public static Handler b() {
        if (c == null) {
            synchronized (j.class) {
                if (c == null) {
                    HandlerThread handlerThread = b;
                    handlerThread.start();
                    c = new Handler(handlerThread.getLooper());
                }
            }
        }
        return c;
    }

    public static Handler c() {
        return f13234a;
    }

    public static void a(Runnable runnable) {
        b().post(runnable);
    }

    public static void c(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            c().post(runnable);
        }
    }

    public static void a(Runnable runnable, long j) {
        b().postDelayed(runnable, j);
    }

    public static void b(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            a(runnable);
        } else {
            runnable.run();
        }
    }
}
