package com.wakeup.module.device.lib.data;

/* loaded from: classes4.dex */
public enum BleScanState {
    STATE_IDLE(-1),
    STATE_SCANNING(1);

    private int code;

    BleScanState(int i) {
        this.code = i;
    }

    public int getCode() {
        return this.code;
    }
}
