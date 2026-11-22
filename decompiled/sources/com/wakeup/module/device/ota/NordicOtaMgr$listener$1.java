package com.wakeup.module.device.ota;

import android.os.Handler;
import com.wakeup.common.base.BaseCallback;
import com.wakeup.common.log.LogUtils;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import no.nordicsemi.android.dfu.DfuProgressListenerAdapter;

/* compiled from: NordicOtaMgr.kt */
@Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J8\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J(\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0005H\u0016¨\u0006\u0013"}, d2 = {"com/wakeup/module/device/ota/NordicOtaMgr$listener$1", "Lno/nordicsemi/android/dfu/DfuProgressListenerAdapter;", "onProgressChanged", "", "deviceAddress", "", "percent", "", "speed", "", "avgSpeed", "currentPart", "partsTotal", "onDfuCompleted", "onDfuAborted", "onError", "error", "errorType", "message", "module-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NordicOtaMgr$listener$1 extends DfuProgressListenerAdapter {
    NordicOtaMgr$listener$1() {
    }

    @Override // no.nordicsemi.android.dfu.DfuProgressListenerAdapter, no.nordicsemi.android.dfu.DfuProgressListener
    public void onProgressChanged(String deviceAddress, final int percent, float speed, float avgSpeed, int currentPart, int partsTotal) {
        int i;
        Handler handler;
        Intrinsics.checkNotNullParameter(deviceAddress, "deviceAddress");
        i = NordicOtaMgr.progress;
        if (percent > i) {
            LogUtils.i("NordicOtaMgr", "progress = " + percent);
            handler = NordicOtaMgr.mHandler;
            handler.post(new Runnable() { // from class: com.wakeup.module.device.ota.NordicOtaMgr$listener$1$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    NordicOtaMgr$listener$1.onProgressChanged$lambda$0(percent);
                }
            });
        }
        NordicOtaMgr nordicOtaMgr = NordicOtaMgr.INSTANCE;
        NordicOtaMgr.progress = percent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onProgressChanged$lambda$0(int i) {
        BaseCallback<Pair<Integer, String>> mCallback = NordicOtaMgr.INSTANCE.getMCallback();
        if (mCallback != null) {
            mCallback.callback(1, new Pair<>(Integer.valueOf(i), ""));
        }
    }

    @Override // no.nordicsemi.android.dfu.DfuProgressListenerAdapter, no.nordicsemi.android.dfu.DfuProgressListener
    public void onDfuCompleted(String deviceAddress) {
        Handler handler;
        Intrinsics.checkNotNullParameter(deviceAddress, "deviceAddress");
        LogUtils.i("NordicOtaMgr", "onDfuCompleted");
        NordicOtaMgr.setInstalling(false);
        handler = NordicOtaMgr.mHandler;
        handler.post(new Runnable() { // from class: com.wakeup.module.device.ota.NordicOtaMgr$listener$1$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                NordicOtaMgr$listener$1.onDfuCompleted$lambda$1();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onDfuCompleted$lambda$1() {
        BaseCallback<Pair<Integer, String>> mCallback = NordicOtaMgr.INSTANCE.getMCallback();
        if (mCallback != null) {
            mCallback.callback(2, new Pair<>(100, ""));
        }
        NordicOtaMgr.INSTANCE.cancelNotification();
    }

    @Override // no.nordicsemi.android.dfu.DfuProgressListenerAdapter, no.nordicsemi.android.dfu.DfuProgressListener
    public void onDfuAborted(String deviceAddress) {
        Handler handler;
        Intrinsics.checkNotNullParameter(deviceAddress, "deviceAddress");
        LogUtils.i("NordicOtaMgr", "onDfuAborted");
        NordicOtaMgr.setInstalling(false);
        handler = NordicOtaMgr.mHandler;
        handler.post(new Runnable() { // from class: com.wakeup.module.device.ota.NordicOtaMgr$listener$1$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                NordicOtaMgr$listener$1.onDfuAborted$lambda$2();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onDfuAborted$lambda$2() {
        BaseCallback<Pair<Integer, String>> mCallback = NordicOtaMgr.INSTANCE.getMCallback();
        if (mCallback != null) {
            mCallback.callback(-1, new Pair<>(0, "OTA中止"));
        }
        NordicOtaMgr.INSTANCE.cancelNotification();
    }

    @Override // no.nordicsemi.android.dfu.DfuProgressListenerAdapter, no.nordicsemi.android.dfu.DfuProgressListener
    public void onError(String deviceAddress, int error, int errorType, final String message) {
        Handler handler;
        Intrinsics.checkNotNullParameter(deviceAddress, "deviceAddress");
        Intrinsics.checkNotNullParameter(message, "message");
        LogUtils.i("NordicOtaMgr", "onError " + deviceAddress + ", error: " + error + ", errorType: " + errorType + ", message: " + message);
        NordicOtaMgr.setInstalling(false);
        handler = NordicOtaMgr.mHandler;
        handler.post(new Runnable() { // from class: com.wakeup.module.device.ota.NordicOtaMgr$listener$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                NordicOtaMgr$listener$1.onError$lambda$3(message);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onError$lambda$3(String str) {
        BaseCallback<Pair<Integer, String>> mCallback = NordicOtaMgr.INSTANCE.getMCallback();
        if (mCallback != null) {
            mCallback.callback(-1, new Pair<>(0, str));
        }
        NordicOtaMgr.INSTANCE.cancelNotification();
    }
}
