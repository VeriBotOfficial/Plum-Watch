package com.wakeup.module.device.work.auto;

/* loaded from: classes4.dex */
public class AutoStrategy {
    private static final long MAX_INTERVAL_TIME = 60000;
    private long lastTryTime = 0;
    private long intervalTime = 10000;
    private boolean isOpenStrategy = false;

    private void setLastTryTime(long j) {
        this.lastTryTime = j;
        long j2 = this.intervalTime + 10000;
        this.intervalTime = j2;
        if (j2 >= 60000) {
            this.intervalTime = 60000L;
        }
    }

    public boolean canStartConnect() {
        if (!this.isOpenStrategy) {
            return true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.lastTryTime < this.intervalTime) {
            return false;
        }
        setLastTryTime(currentTimeMillis);
        return true;
    }

    public void setOpenStrategy(boolean z) {
        this.isOpenStrategy = z;
    }
}
