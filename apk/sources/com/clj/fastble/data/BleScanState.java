package com.clj.fastble.data;

/* JADX INFO: loaded from: classes11.dex */
public enum BleScanState {
    STATE_IDLE(-1),
    STATE_SCANNING(1);

    private int code;

    BleScanState(int r3) {
        this.code = r3;
    }

    public int getCode() {
        return this.code;
    }
}
