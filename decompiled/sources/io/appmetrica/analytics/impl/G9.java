package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.Looper;
import com.xiaomi.mipush.sdk.Constants;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class G9 implements IHandlerExecutor {

    /* renamed from: a, reason: collision with root package name */
    public final Looper f17868a;
    public final Handler b;
    public final HandlerThreadC3296ib c;

    public G9(String str) {
        this(a(str));
    }

    public static HandlerThreadC3296ib a(String str) {
        HandlerThreadC3296ib handlerThreadC3296ib = new HandlerThreadC3296ib(str + Constants.ACCEPT_TIME_SEPARATOR_SERVER + ThreadFactoryC3696yd.f18594a.incrementAndGet());
        handlerThreadC3296ib.start();
        return handlerThreadC3296ib;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.b.post(runnable);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void executeDelayed(Runnable runnable, long j) {
        this.b.postDelayed(runnable, TimeUnit.MILLISECONDS.toMillis(j));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor
    public final Handler getHandler() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor
    public final Looper getLooper() {
        return this.f17868a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public final boolean isRunning() {
        boolean z;
        HandlerThreadC3296ib handlerThreadC3296ib = this.c;
        synchronized (handlerThreadC3296ib) {
            z = handlerThreadC3296ib.f18325a;
        }
        return z;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void remove(Runnable runnable) {
        this.b.removeCallbacks(runnable);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void removeAll() {
        this.b.removeCallbacksAndMessages(null);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public final void stopRunning() {
        HandlerThreadC3296ib handlerThreadC3296ib = this.c;
        synchronized (handlerThreadC3296ib) {
            handlerThreadC3296ib.f18325a = false;
            handlerThreadC3296ib.interrupt();
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final <T> Future<T> submit(Callable<T> callable) {
        FutureTask futureTask = new FutureTask(callable);
        this.b.post(futureTask);
        return futureTask;
    }

    public G9(HandlerThreadC3296ib handlerThreadC3296ib) {
        this(handlerThreadC3296ib, handlerThreadC3296ib.getLooper(), new Handler(handlerThreadC3296ib.getLooper()));
    }

    public G9(HandlerThreadC3296ib handlerThreadC3296ib, Looper looper, Handler handler) {
        this.c = handlerThreadC3296ib;
        this.f17868a = looper;
        this.b = handler;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void executeDelayed(Runnable runnable, long j, TimeUnit timeUnit) {
        this.b.postDelayed(runnable, timeUnit.toMillis(j));
    }
}
