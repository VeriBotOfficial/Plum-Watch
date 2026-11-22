package android.gov.nist.javax.sip;

import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.StackLogger;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.apache.log4j.MDC;

/* loaded from: classes.dex */
public class MDCScheduledTHExecutor extends ScheduledThreadPoolExecutor {
    private static final String AFFINITY_THREAD_VAR = "AffTh";
    private static StackLogger logger = CommonLogger.getLogger(MDCScheduledTHExecutor.class);

    public MDCScheduledTHExecutor(int i) {
        super(i);
    }

    public MDCScheduledTHExecutor(int i, ThreadFactory threadFactory) {
        super(i, threadFactory);
    }

    public MDCScheduledTHExecutor(int i, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i, rejectedExecutionHandler);
    }

    public MDCScheduledTHExecutor(int i, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i, threadFactory, rejectedExecutionHandler);
    }

    class MDCFuture<V> implements RunnableScheduledFuture<V> {
        boolean done = false;
        Runnable runnable;
        RunnableScheduledFuture<V> task;

        public MDCFuture(Runnable runnable, RunnableScheduledFuture<V> runnableScheduledFuture) {
            this.task = runnableScheduledFuture;
            this.runnable = runnable;
        }

        @Override // java.util.concurrent.RunnableScheduledFuture
        public boolean isPeriodic() {
            return this.task.isPeriodic();
        }

        @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
        public void run() {
            this.task.run();
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z) {
            return this.task.cancel(z);
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.task.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.task.isDone();
        }

        @Override // java.util.concurrent.Future
        public V get() throws InterruptedException, ExecutionException {
            return (V) this.task.get();
        }

        @Override // java.util.concurrent.Future
        public V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return (V) this.task.get(j, timeUnit);
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(TimeUnit timeUnit) {
            return this.task.getDelay(timeUnit);
        }

        @Override // java.lang.Comparable
        public int compareTo(Delayed delayed) {
            return this.task.compareTo(delayed);
        }

        public Runnable getRunnable() {
            return this.runnable;
        }
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor
    public <V> RunnableScheduledFuture<V> decorateTask(Runnable runnable, RunnableScheduledFuture<V> runnableScheduledFuture) {
        return new MDCFuture(runnable, runnableScheduledFuture);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        if (logger.isLoggingEnabled(16) && (runnable instanceof MDCFuture)) {
            MDCFuture mDCFuture = (MDCFuture) runnable;
            if (mDCFuture.runnable instanceof MDCTask) {
                Map<String, String> mDCVars = ((MDCTask) mDCFuture.runnable).getMDCVars();
                if (mDCVars != null) {
                    Iterator<String> it = mDCVars.keySet().iterator();
                    while (it.hasNext()) {
                        MDC.remove(it.next());
                    }
                    return;
                }
                MDC.remove(AFFINITY_THREAD_VAR);
            }
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void beforeExecute(Thread thread, Runnable runnable) {
        if (logger.isLoggingEnabled(16) && (runnable instanceof MDCFuture)) {
            MDCFuture mDCFuture = (MDCFuture) runnable;
            if (mDCFuture.runnable instanceof MDCTask) {
                MDCTask mDCTask = (MDCTask) mDCFuture.runnable;
                Map<String, String> mDCVars = mDCTask.getMDCVars();
                if (mDCVars != null) {
                    for (String str : mDCVars.keySet()) {
                        MDC.put(str, mDCVars.get(str));
                    }
                } else if (mDCTask.getThreadHash() != null) {
                    MDC.put(AFFINITY_THREAD_VAR, mDCTask.getThreadHash());
                }
            }
        }
        super.beforeExecute(thread, runnable);
    }
}
