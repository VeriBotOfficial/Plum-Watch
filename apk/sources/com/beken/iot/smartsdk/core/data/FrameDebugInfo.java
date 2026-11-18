package com.beken.iot.smartsdk.core.data;

/* JADX INFO: loaded from: classes15.dex */
public class FrameDebugInfo {
    String sequence = "0";
    String fps = "0";
    String network = "";
    int txDelay = 0;
    long rxDelay = 0;

    public void setSequence(String str) {
        this.sequence = str;
    }

    public void setSequence(int r2) {
        this.sequence = r2 + "";
    }

    public void setFps(String str) {
        this.fps = str;
    }

    public void setFps(int r2) {
        this.fps = r2 + "";
    }

    public void setNetwork(String str) {
        this.network = str;
    }

    public void setTxDelay(int r1) {
        this.txDelay = r1;
    }

    public void setRxDelay(long j) {
        this.rxDelay = j;
    }

    public String toString() {
        int r0 = ((int) this.rxDelay) - this.txDelay;
        if (r0 < 0) {
            r0 = 0;
        }
        return (((("" + this.network) + ", sequence: " + this.sequence) + ", fps: " + this.fps) + ", txDelay: " + this.txDelay + "\n") + "rxDelay: " + this.rxDelay + ", delay: " + r0;
    }
}
