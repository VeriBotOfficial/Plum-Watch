package com.twilio.audioswitch.bluetooth;

import android.os.Handler;
import com.twilio.audioswitch.android.Logger;
import com.twilio.audioswitch.android.SystemClockWrapper;
import com.umeng.analytics.AnalyticsConfig;
import java.util.concurrent.TimeoutException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BluetoothScoJob.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\b \u0018\u00002\u00020\u0001:\u0001\u0016B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0012J\b\u0010\u0014\u001a\u00020\u0012H$J\b\u0010\u0015\u001a\u00020\u0012H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\t\u001a\b\u0018\u00010\nR\u00020\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/twilio/audioswitch/bluetooth/BluetoothScoJob;", "", "logger", "Lcom/twilio/audioswitch/android/Logger;", "bluetoothScoHandler", "Landroid/os/Handler;", "systemClockWrapper", "Lcom/twilio/audioswitch/android/SystemClockWrapper;", "(Lcom/twilio/audioswitch/android/Logger;Landroid/os/Handler;Lcom/twilio/audioswitch/android/SystemClockWrapper;)V", "bluetoothScoRunnable", "Lcom/twilio/audioswitch/bluetooth/BluetoothScoJob$BluetoothScoRunnable;", "getBluetoothScoRunnable$annotations", "()V", "getBluetoothScoRunnable", "()Lcom/twilio/audioswitch/bluetooth/BluetoothScoJob$BluetoothScoRunnable;", "setBluetoothScoRunnable", "(Lcom/twilio/audioswitch/bluetooth/BluetoothScoJob$BluetoothScoRunnable;)V", "cancelBluetoothScoJob", "", "executeBluetoothScoJob", "scoAction", "scoTimeOutAction", "BluetoothScoRunnable", "audioswitch_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public abstract class BluetoothScoJob {
    private final Handler bluetoothScoHandler;
    private BluetoothScoRunnable bluetoothScoRunnable;
    private final Logger logger;
    private final SystemClockWrapper systemClockWrapper;

    public static /* synthetic */ void getBluetoothScoRunnable$annotations() {
    }

    protected abstract void scoAction();

    public void scoTimeOutAction() {
    }

    public BluetoothScoJob(Logger logger, Handler bluetoothScoHandler, SystemClockWrapper systemClockWrapper) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(bluetoothScoHandler, "bluetoothScoHandler");
        Intrinsics.checkNotNullParameter(systemClockWrapper, "systemClockWrapper");
        this.logger = logger;
        this.bluetoothScoHandler = bluetoothScoHandler;
        this.systemClockWrapper = systemClockWrapper;
    }

    public final BluetoothScoRunnable getBluetoothScoRunnable() {
        return this.bluetoothScoRunnable;
    }

    public final void setBluetoothScoRunnable(BluetoothScoRunnable bluetoothScoRunnable) {
        this.bluetoothScoRunnable = bluetoothScoRunnable;
    }

    public final void executeBluetoothScoJob() {
        BluetoothScoRunnable bluetoothScoRunnable = this.bluetoothScoRunnable;
        if (bluetoothScoRunnable != null) {
            this.bluetoothScoHandler.removeCallbacks(bluetoothScoRunnable);
        }
        BluetoothScoRunnable bluetoothScoRunnable2 = new BluetoothScoRunnable();
        this.bluetoothScoRunnable = bluetoothScoRunnable2;
        this.bluetoothScoHandler.post(bluetoothScoRunnable2);
        this.logger.d("BluetoothScoJob", "Scheduled bluetooth sco job");
    }

    public final void cancelBluetoothScoJob() {
        BluetoothScoRunnable bluetoothScoRunnable = this.bluetoothScoRunnable;
        if (bluetoothScoRunnable != null) {
            this.bluetoothScoHandler.removeCallbacks(bluetoothScoRunnable);
            this.bluetoothScoRunnable = null;
            this.logger.d("BluetoothScoJob", "Canceled bluetooth sco job");
        }
    }

    /* compiled from: BluetoothScoJob.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/twilio/audioswitch/bluetooth/BluetoothScoJob$BluetoothScoRunnable;", "Ljava/lang/Runnable;", "(Lcom/twilio/audioswitch/bluetooth/BluetoothScoJob;)V", "elapsedTime", "", AnalyticsConfig.RTD_START_TIME, "run", "", "audioswitch_release"}, k = 1, mv = {1, 4, 1})
    public final class BluetoothScoRunnable implements Runnable {
        private long elapsedTime;
        private final long startTime;

        public BluetoothScoRunnable() {
            this.startTime = BluetoothScoJob.this.systemClockWrapper.elapsedRealtime();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.elapsedTime >= 5000) {
                BluetoothScoJob.this.logger.e("BluetoothScoJob", "Bluetooth sco job timed out", new TimeoutException());
                BluetoothScoJob.this.scoTimeOutAction();
                BluetoothScoJob.this.cancelBluetoothScoJob();
            } else {
                BluetoothScoJob.this.scoAction();
                this.elapsedTime = BluetoothScoJob.this.systemClockWrapper.elapsedRealtime() - this.startTime;
                BluetoothScoJob.this.bluetoothScoHandler.postDelayed(this, 500L);
            }
        }
    }
}
