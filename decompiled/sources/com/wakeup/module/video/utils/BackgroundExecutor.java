package com.wakeup.module.video.utils;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BackgroundExecutor.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bJ\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005H\u0002J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0019\u001a\u00020\u0005H\u0002J\u0016\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u0018R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/wakeup/module/video/utils/BackgroundExecutor;", "", "<init>", "()V", "TAG", "", "DEFAULT_EXECUTOR", "Ljava/util/concurrent/Executor;", "executor", "TASKS", "Ljava/util/ArrayList;", "Lcom/wakeup/module/video/utils/BackgroundExecutor$Task;", "CURRENT_SERIAL", "Ljava/lang/ThreadLocal;", "directExecute", "Ljava/util/concurrent/Future;", "runnable", "Ljava/lang/Runnable;", "delay", "", "execute", "", "task", "hasSerialRunning", "", "serial", "take", "cancelAll", "id", "mayInterruptIfRunning", "Task", "module-video_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BackgroundExecutor {
    private static final ThreadLocal<String> CURRENT_SERIAL;
    private static final Executor DEFAULT_EXECUTOR;
    public static final BackgroundExecutor INSTANCE = new BackgroundExecutor();
    private static final String TAG = "BackgroundExecutor";
    private static final ArrayList<Task> TASKS;
    private static final Executor executor;

    private BackgroundExecutor() {
    }

    static {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors() * 2);
        Intrinsics.checkNotNullExpressionValue(newScheduledThreadPool, "newScheduledThreadPool(...)");
        ScheduledExecutorService scheduledExecutorService = newScheduledThreadPool;
        DEFAULT_EXECUTOR = scheduledExecutorService;
        executor = scheduledExecutorService;
        TASKS = new ArrayList<>();
        CURRENT_SERIAL = new ThreadLocal<>();
    }

    private final Future<?> directExecute(Runnable runnable, long delay) {
        if (delay > 0) {
            Executor executor2 = executor;
            if (!(executor2 instanceof ScheduledExecutorService)) {
                throw new IllegalArgumentException("The executor set does not support scheduling");
            }
            return ((ScheduledExecutorService) executor2).schedule(runnable, delay, TimeUnit.MILLISECONDS);
        }
        Executor executor3 = executor;
        if (executor3 instanceof ExecutorService) {
            return ((ExecutorService) executor3).submit(runnable);
        }
        executor3.execute(runnable);
        return null;
    }

    public final synchronized void execute(Task task) {
        Future<?> directExecute;
        Intrinsics.checkNotNullParameter(task, "task");
        if (task.getSerial() != null && hasSerialRunning(task.getSerial())) {
            directExecute = null;
            if ((task.getId() == null || task.getSerial() != null) && !task.getManaged().get()) {
                task.setFuture(directExecute);
                TASKS.add(task);
            }
        }
        task.setExecutionAsked(true);
        directExecute = directExecute(task, task.getRemainingDelay());
        if (task.getId() == null) {
        }
        task.setFuture(directExecute);
        TASKS.add(task);
    }

    private final boolean hasSerialRunning(String serial) {
        Iterator<Task> it = TASKS.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            Task next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            Task task = next;
            if (task.getExecutionAsked() && Intrinsics.areEqual(serial, task.getSerial())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Task take(String serial) {
        int size = TASKS.size();
        for (int i = 0; i < size; i++) {
            ArrayList<Task> arrayList = TASKS;
            if (Intrinsics.areEqual(serial, arrayList.get(i).getSerial())) {
                return arrayList.remove(i);
            }
        }
        return null;
    }

    public final synchronized void cancelAll(String id2, boolean mayInterruptIfRunning) {
        Intrinsics.checkNotNullParameter(id2, "id");
        int size = TASKS.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                ArrayList<Task> arrayList = TASKS;
                Task task = arrayList.get(size);
                Intrinsics.checkNotNullExpressionValue(task, "get(...)");
                Task task2 = task;
                if (Intrinsics.areEqual(id2, task2.getId())) {
                    if (task2.getFuture() != null) {
                        Future<?> future = task2.getFuture();
                        if (future != null) {
                            future.cancel(mayInterruptIfRunning);
                        }
                        if (!task2.getManaged().getAndSet(true)) {
                            task2.postExecute();
                        }
                    } else if (task2.getExecutionAsked()) {
                        Log.w(TAG, "A task with id " + task2.getId() + " cannot be cancelled (the executor set does not support it)");
                    } else {
                        Intrinsics.checkNotNull(arrayList.remove(size));
                    }
                }
                if (i < 0) {
                    break;
                } else {
                    size = i;
                }
            }
        }
    }

    /* compiled from: BackgroundExecutor.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020&H&J\u0006\u0010(\u001a\u00020&R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\fR\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR \u0010\u001b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\"¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u0006)"}, d2 = {"Lcom/wakeup/module/video/utils/BackgroundExecutor$Task;", "Ljava/lang/Runnable;", "id", "", "delay", "", "serial", "<init>", "(Ljava/lang/String;JLjava/lang/String;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "remainingDelay", "getRemainingDelay", "()J", "setRemainingDelay", "(J)V", "targetTimeMillis", "getSerial", "setSerial", "executionAsked", "", "getExecutionAsked", "()Z", "setExecutionAsked", "(Z)V", "future", "Ljava/util/concurrent/Future;", "getFuture", "()Ljava/util/concurrent/Future;", "setFuture", "(Ljava/util/concurrent/Future;)V", "managed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getManaged", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "run", "", "execute", "postExecute", "module-video_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Task implements Runnable {
        private boolean executionAsked;
        private Future<?> future;
        private String id;
        private final AtomicBoolean managed;
        private long remainingDelay;
        private String serial;
        private long targetTimeMillis;

        public abstract void execute();

        public Task(String id2, long j, String serial) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(serial, "serial");
            this.managed = new AtomicBoolean();
            if (!Intrinsics.areEqual("", id2)) {
                this.id = id2;
            }
            if (j > 0) {
                this.remainingDelay = j;
                this.targetTimeMillis = System.currentTimeMillis() + j;
            }
            if (Intrinsics.areEqual("", serial)) {
                return;
            }
            this.serial = serial;
        }

        public final String getId() {
            return this.id;
        }

        public final void setId(String str) {
            this.id = str;
        }

        public final long getRemainingDelay() {
            return this.remainingDelay;
        }

        public final void setRemainingDelay(long j) {
            this.remainingDelay = j;
        }

        public final String getSerial() {
            return this.serial;
        }

        public final void setSerial(String str) {
            this.serial = str;
        }

        public final boolean getExecutionAsked() {
            return this.executionAsked;
        }

        public final void setExecutionAsked(boolean z) {
            this.executionAsked = z;
        }

        public final Future<?> getFuture() {
            return this.future;
        }

        public final void setFuture(Future<?> future) {
            this.future = future;
        }

        public final AtomicBoolean getManaged() {
            return this.managed;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.managed.getAndSet(true)) {
                return;
            }
            try {
                BackgroundExecutor.CURRENT_SERIAL.set(this.serial);
                execute();
            } finally {
                postExecute();
            }
        }

        public final void postExecute() {
            if (this.id == null && this.serial == null) {
                return;
            }
            BackgroundExecutor.CURRENT_SERIAL.set(null);
            synchronized (BackgroundExecutor.class) {
                BackgroundExecutor.TASKS.remove(this);
                if (this.serial != null) {
                    BackgroundExecutor backgroundExecutor = BackgroundExecutor.INSTANCE;
                    String str = this.serial;
                    Intrinsics.checkNotNull(str);
                    Task take = backgroundExecutor.take(str);
                    if (take != null) {
                        if (take.remainingDelay != 0) {
                            take.remainingDelay = Math.max(0L, this.targetTimeMillis - System.currentTimeMillis());
                        }
                        BackgroundExecutor.INSTANCE.execute(take);
                    }
                }
                Unit unit = Unit.INSTANCE;
            }
        }
    }
}
