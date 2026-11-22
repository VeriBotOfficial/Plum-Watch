package com.sifli.siflicore.shell;

/* loaded from: classes14.dex */
public interface ISFTransmissionShell {
    int getShellStatus();

    boolean isBusy();

    void setCallback(SFBleShellCallback sFBleShellCallback);

    void setUseHighSpeedMode(boolean z);

    void stop();
}
