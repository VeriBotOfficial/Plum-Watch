package com.wakeup.common.utils;

import android.content.Context;
import android.media.AudioManager;
import com.wakeup.common.base.BaseApplication;
import com.wakeup.common.log.LogUtils;
import com.wakeup.common.storage.DeviceDao;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ScoControl.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0007J\b\u0010\b\u001a\u00020\u0007H\u0007J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/wakeup/common/utils/ScoControl;", "", "<init>", "()V", "TAG", "", "startBluetoothSco", "", "stopBluetoothSco", "switchSpeakerPhone", "isOpen", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ScoControl {
    public static final ScoControl INSTANCE = new ScoControl();
    private static final String TAG = "ScoControl";

    private ScoControl() {
    }

    @JvmStatic
    public static final void startBluetoothSco() {
        if (DeviceDao.isSupport(193)) {
            return;
        }
        try {
            Object systemService = BaseApplication.getContext().getSystemService("audio");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            AudioManager audioManager = (AudioManager) systemService;
            audioManager.setStreamSolo(2, true);
            audioManager.setBluetoothScoOn(true);
            audioManager.setMode(2);
            audioManager.startBluetoothSco();
            LogUtils.i(TAG, "isBluetoothScoOn: " + audioManager.isBluetoothScoOn());
        } catch (Exception e) {
            LogUtils.e(TAG, "startRecordAudio AudioManager exception: " + e.getMessage());
        }
    }

    @JvmStatic
    public static final void stopBluetoothSco() {
        if (DeviceDao.isSupport(193)) {
            return;
        }
        try {
            Object systemService = BaseApplication.getContext().getSystemService("audio");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            AudioManager audioManager = (AudioManager) systemService;
            audioManager.setBluetoothScoOn(false);
            audioManager.stopBluetoothSco();
        } catch (Exception e) {
            LogUtils.e(TAG, "stopRecord AudioManager exception: " + e.getMessage());
        }
    }

    @JvmStatic
    public static final void switchSpeakerPhone(boolean isOpen) {
        Context context = BaseApplication.getContext();
        LogUtils.i(TAG, "switchSpeakerPhone isOpen: " + isOpen);
        Object systemService = context.getSystemService("audio");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        AudioManager audioManager = (AudioManager) systemService;
        audioManager.setMode(3);
        if (isOpen) {
            if (audioManager.isBluetoothScoOn()) {
                audioManager.setBluetoothScoOn(false);
                audioManager.stopBluetoothSco();
            }
        } else {
            audioManager.startBluetoothSco();
            audioManager.setBluetoothScoOn(true);
        }
        try {
            audioManager.setSpeakerphoneOn(isOpen);
        } catch (Exception e) {
            LogUtils.e(TAG, "switchSpeakerPhone error: ", e);
        }
    }
}
