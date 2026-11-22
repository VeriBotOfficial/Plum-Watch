package com.wakeup.commponent.module.ble;

/* loaded from: classes2.dex */
public enum DeviceSportStatus {
    START_SPORT(1),
    STOP_SPORT(2),
    PAUSE_SPORT(3),
    CONTINUE_SPORT(4),
    APP_ANSWER(5);

    private final int status;

    DeviceSportStatus(int i) {
        this.status = i;
    }

    public int getStatus() {
        return this.status;
    }
}
