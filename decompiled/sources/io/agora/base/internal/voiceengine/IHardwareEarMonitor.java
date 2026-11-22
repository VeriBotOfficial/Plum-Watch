package io.agora.base.internal.voiceengine;

/* loaded from: classes6.dex */
public interface IHardwareEarMonitor {
    void destroy();

    int enableHardwareEarMonitor(boolean z);

    void initialize();

    boolean isHardwareEarMonitorSupported();

    int setHardwareEarMonitorVolume(int i);
}
