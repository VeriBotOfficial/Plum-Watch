package com.sifli.siflireadersdk.blecore;

import android.os.Handler;
import android.os.Looper;
import com.sifli.siflireadersdk.util.SFLog;
import java.lang.ref.WeakReference;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes16.dex */
public class SFCountDownTimer {
    private static final String TAG = "SFCountDownTimer";
    private int counDown = 5;
    private Handler mHandler = new Handler(Looper.myLooper());
    private Timer timer;
    private String timerName;
    private TimerTask timerTask;
    private WeakReference<SFCountDownTimerCallback> weakCallback;

    public interface SFCountDownTimerCallback {
        void onTimeOut();
    }

    public SFCountDownTimer(SFCountDownTimerCallback sFCountDownTimerCallback, String str) {
        this.weakCallback = new WeakReference<>(sFCountDownTimerCallback);
        this.timerName = str;
    }

    public void setCounDown(int i) {
        this.counDown = i;
    }

    public void startTimer(int i) {
        this.counDown = i;
        Timer timer = this.timer;
        if (timer != null) {
            timer.cancel();
        }
        this.timerTask = new TimerTask() { // from class: com.sifli.siflireadersdk.blecore.SFCountDownTimer.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                SFCountDownTimer.this.onTimer();
            }
        };
        Timer timer2 = new Timer();
        this.timer = timer2;
        timer2.schedule(this.timerTask, 0L, 1000L);
    }

    public void stopTimer() {
        Timer timer = this.timer;
        if (timer != null) {
            timer.cancel();
        }
    }

    private SFCountDownTimerCallback getCallback() {
        WeakReference<SFCountDownTimerCallback> weakReference = this.weakCallback;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onTimer() {
        this.counDown--;
        SFLog.i(TAG, "onTimer:[" + this.timerName + "] " + this.counDown);
        if (this.counDown <= 0) {
            this.counDown = 0;
            stopTimer();
            final SFCountDownTimerCallback callback = getCallback();
            if (callback != null) {
                this.mHandler.post(new Runnable() { // from class: com.sifli.siflireadersdk.blecore.SFCountDownTimer.2
                    @Override // java.lang.Runnable
                    public void run() {
                        callback.onTimeOut();
                    }
                });
            }
        }
    }
}
