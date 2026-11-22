package com.sifli.siflicore.task;

import android.util.Log;
import com.sifli.siflicore.blecore.SFCountDownTimer;
import com.sifli.siflicore.error.SFError;

/* loaded from: classes14.dex */
public class SFTaskBase implements SFCountDownTimer.SFCountDownTimerCallback {
    private static final String TAG = "SFTaskBase";
    protected SFTaskCallback callback;
    protected boolean isNoRspWriting = false;
    private SFCountDownTimer countDownTimer = new SFCountDownTimer(this, getClass().getSimpleName());

    public void setCallback(SFTaskCallback sFTaskCallback) {
        this.callback = sFTaskCallback;
    }

    @Override // com.sifli.siflicore.blecore.SFCountDownTimer.SFCountDownTimerCallback
    public void onTimeOut() {
        Log.e(TAG, "onTimeOut");
        if (this.callback != null) {
            this.callback.bleTaskOnTaskCompete(this, false, new SFError(12, "任务超时"));
        }
    }

    public void startTimer() {
        this.countDownTimer.startTimer(20);
    }

    public void setCountDown(int i) {
        this.countDownTimer.setCounDown(i);
    }

    protected void resumeCountDown() {
        this.countDownTimer.setCounDown(10);
    }

    public void stopTimer() {
        this.countDownTimer.stopTimer();
    }

    protected int getContinueSendNoResponsePacketCount(int i, int i2) {
        if (i2 <= 0) {
            return 0;
        }
        return i % i2;
    }
}
