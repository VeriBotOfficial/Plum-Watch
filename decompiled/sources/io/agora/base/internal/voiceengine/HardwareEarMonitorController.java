package io.agora.base.internal.voiceengine;

import android.os.Build;
import io.agora.base.internal.Logging;

/* loaded from: classes6.dex */
public class HardwareEarMonitorController implements HardwareEarMonitorListener {
    private static final String MANUFACTURER_HUAWEI = "huawei";
    private static final String TAG = "HardwareEarMonitorController";
    private IHardwareEarMonitor mHardwareEarMonitor;
    private final int HARDWARE_EARMONITOR_STATE_NOT_INITIALIZED = 0;
    private final int HARDWARE_EARMONITOR_STATE_INITIALIZING = 1;
    private final int HARDWARE_EARMONITOR_STATE_KIT_NOT_INSTALL = 2;
    private final int HARDWARE_EARMONITOR_STATE_READY = 3;
    private int mHardwareEarMonitorState = 0;
    private boolean mHardwareEarMonitorSupport = false;

    public HardwareEarMonitorController(boolean z) {
        this.mHardwareEarMonitor = null;
        String str = Build.MANUFACTURER;
        if (!z) {
            Logging.w(TAG, "config to disable hw earmonitor success");
        } else if (str.trim().toLowerCase().contains("huawei")) {
            this.mHardwareEarMonitor = new HuaweiHardwareEarMonitor(this);
        }
    }

    public void initialize() {
        IHardwareEarMonitor iHardwareEarMonitor = this.mHardwareEarMonitor;
        if (iHardwareEarMonitor != null) {
            iHardwareEarMonitor.initialize();
            this.mHardwareEarMonitorState = 1;
        }
    }

    void setHardwareEarMonitor(IHardwareEarMonitor iHardwareEarMonitor) {
        this.mHardwareEarMonitor = iHardwareEarMonitor;
    }

    public boolean isHardwareEarMonitorSupported() {
        int i = this.mHardwareEarMonitorState;
        if (i == 3) {
            return this.mHardwareEarMonitorSupport;
        }
        if (i == 1) {
            Logging.w(TAG, "HwAudioKit is intializing, check it later plz");
            return false;
        }
        if (i != 2) {
            return false;
        }
        Logging.w(TAG, "HwAudioKit is not installed");
        return false;
    }

    public int enableHardwareEarMonitor(boolean z) {
        IHardwareEarMonitor iHardwareEarMonitor = this.mHardwareEarMonitor;
        if (iHardwareEarMonitor != null) {
            return iHardwareEarMonitor.enableHardwareEarMonitor(z);
        }
        return -7;
    }

    public int setHardwareEarMonitorVolume(int i) {
        IHardwareEarMonitor iHardwareEarMonitor = this.mHardwareEarMonitor;
        if (iHardwareEarMonitor != null) {
            return iHardwareEarMonitor.setHardwareEarMonitorVolume(i);
        }
        return -7;
    }

    public void terminate() {
        IHardwareEarMonitor iHardwareEarMonitor = this.mHardwareEarMonitor;
        if (iHardwareEarMonitor != null) {
            iHardwareEarMonitor.destroy();
            this.mHardwareEarMonitor = null;
        }
    }

    @Override // io.agora.base.internal.voiceengine.HardwareEarMonitorListener
    public void onInitResult(int i) {
        this.mHardwareEarMonitorState = 3;
        if (i == 2) {
            this.mHardwareEarMonitorState = 2;
            this.mHardwareEarMonitorSupport = false;
        }
    }

    @Override // io.agora.base.internal.voiceengine.HardwareEarMonitorListener
    public void onKaraokeSupport(boolean z) {
        this.mHardwareEarMonitorSupport = z;
    }
}
