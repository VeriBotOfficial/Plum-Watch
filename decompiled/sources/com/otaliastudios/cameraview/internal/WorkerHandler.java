package com.otaliastudios.cameraview.internal;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.otaliastudios.cameraview.CameraLogger;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* loaded from: classes17.dex */
public class WorkerHandler {
    private static final String FALLBACK_NAME = "FallbackCameraThread";
    private static final CameraLogger LOG = CameraLogger.create("WorkerHandler");
    private static final ConcurrentHashMap<String, WeakReference<WorkerHandler>> sCache = new ConcurrentHashMap<>(4);
    private static WorkerHandler sFallbackHandler;
    private Executor mExecutor;
    private Handler mHandler;
    private String mName;
    private HandlerThread mThread;

    public static WorkerHandler get(String str) {
        ConcurrentHashMap<String, WeakReference<WorkerHandler>> concurrentHashMap = sCache;
        if (concurrentHashMap.containsKey(str)) {
            WorkerHandler workerHandler = concurrentHashMap.get(str).get();
            if (workerHandler != null) {
                if (workerHandler.getThread().isAlive() && !workerHandler.getThread().isInterrupted()) {
                    LOG.w("get:", "Reusing cached worker handler.", str);
                    return workerHandler;
                }
                workerHandler.destroy();
                LOG.w("get:", "Thread reference found, but not alive or interrupted.", "Removing.", str);
                concurrentHashMap.remove(str);
            } else {
                LOG.w("get:", "Thread reference died. Removing.", str);
                concurrentHashMap.remove(str);
            }
        }
        LOG.i("get:", "Creating new handler.", str);
        WorkerHandler workerHandler2 = new WorkerHandler(str);
        concurrentHashMap.put(str, new WeakReference<>(workerHandler2));
        return workerHandler2;
    }

    public static WorkerHandler get() {
        WorkerHandler workerHandler = get(FALLBACK_NAME);
        sFallbackHandler = workerHandler;
        return workerHandler;
    }

    public static void execute(Runnable runnable) {
        get().post(runnable);
    }

    private WorkerHandler(String str) {
        this.mName = str;
        HandlerThread handlerThread = new HandlerThread(str) { // from class: com.otaliastudios.cameraview.internal.WorkerHandler.1
            @Override // java.lang.Thread
            public String toString() {
                return super.toString() + "[" + getThreadId() + "]";
            }
        };
        this.mThread = handlerThread;
        handlerThread.setDaemon(true);
        this.mThread.start();
        this.mHandler = new Handler(this.mThread.getLooper());
        this.mExecutor = new Executor() { // from class: com.otaliastudios.cameraview.internal.WorkerHandler.2
            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                WorkerHandler.this.run(runnable);
            }
        };
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        post(new Runnable() { // from class: com.otaliastudios.cameraview.internal.WorkerHandler.3
            @Override // java.lang.Runnable
            public void run() {
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
        }
    }

    public void run(Runnable runnable) {
        if (Thread.currentThread() == getThread()) {
            runnable.run();
        } else {
            post(runnable);
        }
    }

    public <T> Task<T> run(Callable<T> callable) {
        if (Thread.currentThread() == getThread()) {
            try {
                return Tasks.forResult(callable.call());
            } catch (Exception e) {
                return Tasks.forException(e);
            }
        }
        return post(callable);
    }

    public void post(Runnable runnable) {
        this.mHandler.post(runnable);
    }

    public <T> Task<T> post(final Callable<T> callable) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        post(new Runnable() { // from class: com.otaliastudios.cameraview.internal.WorkerHandler.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    taskCompletionSource.trySetResult(callable.call());
                } catch (Exception e) {
                    taskCompletionSource.trySetException(e);
                }
            }
        });
        return taskCompletionSource.getTask();
    }

    public void post(long j, Runnable runnable) {
        this.mHandler.postDelayed(runnable, j);
    }

    public void remove(Runnable runnable) {
        this.mHandler.removeCallbacks(runnable);
    }

    public Handler getHandler() {
        return this.mHandler;
    }

    public HandlerThread getThread() {
        return this.mThread;
    }

    public Looper getLooper() {
        return this.mThread.getLooper();
    }

    public Executor getExecutor() {
        return this.mExecutor;
    }

    public void destroy() {
        HandlerThread thread = getThread();
        if (thread.isAlive()) {
            thread.interrupt();
            thread.quit();
        }
        sCache.remove(this.mName);
    }

    public static void destroyAll() {
        Iterator<String> it = sCache.keySet().iterator();
        while (it.hasNext()) {
            WeakReference<WorkerHandler> weakReference = sCache.get(it.next());
            WorkerHandler workerHandler = weakReference.get();
            if (workerHandler != null) {
                workerHandler.destroy();
            }
            weakReference.clear();
        }
        sCache.clear();
    }
}
