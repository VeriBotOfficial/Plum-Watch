package com.wakeup.module.record;

import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes4.dex */
public abstract class Countdown extends Timer {
    private final long delay;
    private final long interval;
    private boolean restart;
    private long startTime;
    private final TimerTask task;
    private final long totalTime;
    private boolean wasCancelled;
    private boolean wasStarted;

    public abstract void onFinished();

    public abstract void onStopCalled();

    public abstract void onTick(long j);

    public Countdown(long j, long j2) {
        this(j, j2, 0L);
    }

    public Countdown(long j, long j2, long j3) {
        super("PreciseCountdown", true);
        this.startTime = -1L;
        this.restart = false;
        this.wasCancelled = false;
        this.wasStarted = false;
        this.delay = j3;
        this.interval = j2;
        this.totalTime = j;
        this.task = getTask(j);
    }

    public void start() {
        this.wasStarted = true;
        scheduleAtFixedRate(this.task, this.delay, this.interval);
    }

    public void stop() {
        onStopCalled();
        this.wasCancelled = true;
        this.task.cancel();
        dispose();
    }

    public void dispose() {
        cancel();
        purge();
    }

    private TimerTask getTask(final long j) {
        return new TimerTask() { // from class: com.wakeup.module.record.Countdown.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                long j2;
                if (Countdown.this.startTime < 0 || Countdown.this.restart) {
                    Countdown.this.startTime = scheduledExecutionTime();
                    j2 = j;
                    Countdown.this.restart = false;
                } else {
                    j2 = j - (scheduledExecutionTime() - Countdown.this.startTime);
                    if (j2 <= 0) {
                        cancel();
                        Countdown.this.startTime = -1L;
                        Countdown.this.onFinished();
                        return;
                    }
                }
                Countdown.this.onTick(j2);
            }
        };
    }
}
