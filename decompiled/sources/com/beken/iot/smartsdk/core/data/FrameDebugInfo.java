package com.beken.iot.smartsdk.core.data;

/* loaded from: classes13.dex */
public class FrameDebugInfo {
    String sequence = "0";
    String fps = "0";
    String network = "";
    int txDelay = 0;
    long rxDelay = 0;

    public void setSequence(String str) {
        this.sequence = str;
    }

    public void setSequence(int i) {
        this.sequence = i + "";
    }

    public void setFps(String str) {
        this.fps = str;
    }

    public void setFps(int i) {
        this.fps = i + "";
    }

    public void setNetwork(String str) {
        this.network = str;
    }

    public void setTxDelay(int i) {
        this.txDelay = i;
    }

    public void setRxDelay(long j) {
        this.rxDelay = j;
    }

    public String toString() {
        int i = ((int) this.rxDelay) - this.txDelay;
        if (i < 0) {
            i = 0;
        }
        return (((("" + this.network) + ", sequence: " + this.sequence) + ", fps: " + this.fps) + ", txDelay: " + this.txDelay + "\n") + "rxDelay: " + this.rxDelay + ", delay: " + i;
    }
}
