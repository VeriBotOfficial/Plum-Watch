package com.wakeup.common.utils;

import android.os.Handler;
import android.os.Message;

/* loaded from: classes2.dex */
public abstract class AdvancedCountdownTimer {
    private static final int MSG_PAUSE = 2;
    private static final int MSG_RUN = 1;
    private final long mCountdownInterval;
    private final Handler mHandler = new Handler() { // from class: com.wakeup.common.utils.AdvancedCountdownTimer.1
        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            synchronized (AdvancedCountdownTimer.this) {
                if (msg.what == 1) {
                    AdvancedCountdownTimer.this.mRemainTime -= AdvancedCountdownTimer.this.mCountdownInterval;
                    if (AdvancedCountdownTimer.this.mRemainTime <= 0) {
                        AdvancedCountdownTimer.this.onFinish();
                    } else if (AdvancedCountdownTimer.this.mRemainTime < AdvancedCountdownTimer.this.mCountdownInterval) {
                        sendMessageDelayed(obtainMessage(1), AdvancedCountdownTimer.this.mRemainTime);
                    } else {
                        AdvancedCountdownTimer advancedCountdownTimer = AdvancedCountdownTimer.this;
                        advancedCountdownTimer.onTick(advancedCountdownTimer.mRemainTime, Long.valueOf(((AdvancedCountdownTimer.this.mTotalTime - AdvancedCountdownTimer.this.mRemainTime) * 100) / AdvancedCountdownTimer.this.mTotalTime).intValue());
                        sendMessageDelayed(obtainMessage(1), AdvancedCountdownTimer.this.mCountdownInterval);
                    }
                } else {
                    int i = msg.what;
                }
            }
        }
    };
    private long mRemainTime;
    private final long mTotalTime;

    public abstract void onCancel();

    public abstract void onFinish();

    public abstract void onTick(long millisUntilFinished, int percent);

    public AdvancedCountdownTimer(long millisInFuture, long countDownInterval) {
        this.mTotalTime = millisInFuture;
        this.mCountdownInterval = countDownInterval;
        this.mRemainTime = millisInFuture;
    }

    public final void seek(int value) {
        synchronized (this) {
            this.mRemainTime = ((100 - value) * this.mTotalTime) / 100;
        }
    }

    public final void cancel() {
        this.mHandler.removeMessages(1);
        this.mHandler.removeMessages(2);
        onCancel();
    }

    public final void resume() {
        this.mHandler.removeMessages(2);
        this.mHandler.removeMessages(1);
        Handler handler = this.mHandler;
        handler.sendMessageAtFrontOfQueue(handler.obtainMessage(1));
    }

    public final void pause() {
        this.mHandler.removeMessages(1);
        Handler handler = this.mHandler;
        handler.sendMessageAtFrontOfQueue(handler.obtainMessage(2));
    }

    public final synchronized AdvancedCountdownTimer start() {
        if (this.mRemainTime <= 0) {
            this.mHandler.removeCallbacksAndMessages(null);
            onFinish();
            return this;
        }
        Handler handler = this.mHandler;
        handler.sendMessageDelayed(handler.obtainMessage(1), this.mCountdownInterval);
        return this;
    }
}
