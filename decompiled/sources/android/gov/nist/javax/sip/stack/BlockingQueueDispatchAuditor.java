package android.gov.nist.javax.sip.stack;

import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.StackLogger;
import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes.dex */
public class BlockingQueueDispatchAuditor extends TimerTask {
    private static StackLogger logger = CommonLogger.getLogger(BlockingQueueDispatchAuditor.class);
    private static int timerThreadCount;
    private Queue<? extends Runnable> queue;
    private Timer timer = null;
    private long totalReject = 0;
    private boolean started = false;
    private int timeout = 8000;

    public BlockingQueueDispatchAuditor(Queue<? extends Runnable> queue) {
        this.queue = queue;
    }

    public void start(int i) {
        if (this.started) {
            stop();
        }
        this.started = true;
        StringBuilder sb = new StringBuilder("BlockingQueueDispatchAuditor-Timer-");
        int i2 = timerThreadCount;
        timerThreadCount = i2 + 1;
        Timer timer = new Timer(sb.append(i2).toString(), true);
        this.timer = timer;
        long j = i;
        timer.scheduleAtFixedRate(this, j, j);
    }

    public int getTimeout() {
        return this.timeout;
    }

    public void setTimeout(int i) {
        this.timeout = i;
    }

    public void stop() {
        try {
            this.timer.cancel();
            this.timer = null;
        } catch (Exception unused) {
        } finally {
            this.started = false;
        }
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        int i;
        try {
            synchronized (this.queue) {
                QueuedMessageDispatchBase queuedMessageDispatchBase = (QueuedMessageDispatchBase) this.queue.peek();
                i = 0;
                while (queuedMessageDispatchBase != null) {
                    if (System.currentTimeMillis() - queuedMessageDispatchBase.getReceptionTime() > this.timeout) {
                        this.queue.poll();
                        queuedMessageDispatchBase = (QueuedMessageDispatchBase) this.queue.peek();
                        i++;
                    } else {
                        queuedMessageDispatchBase = null;
                    }
                }
            }
            if (i > 0) {
                this.totalReject += i;
                StackLogger stackLogger = logger;
                if (stackLogger == null || !stackLogger.isLoggingEnabled(8)) {
                    return;
                }
                logger.logWarning("Removed stuck messages=" + i + " total rejected=" + this.totalReject + " stil in queue=" + this.queue.size());
            }
        } catch (Exception e) {
            StackLogger stackLogger2 = logger;
            if (stackLogger2 == null || !stackLogger2.isLoggingEnabled(8)) {
                return;
            }
            logger.logWarning("Problem reaping old requests. This is not a fatal error." + e);
        }
    }
}
