package com.clj.fastble.data;

/* JADX INFO: loaded from: classes11.dex */
public class BleConnectStateParameter {
    private boolean isActive;
    private int status;

    public BleConnectStateParameter(int r1) {
        this.status = r1;
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int r1) {
        this.status = r1;
    }

    public boolean isActive() {
        return this.isActive;
    }

    public void setActive(boolean z) {
        this.isActive = z;
    }
}
