package com.beken.iot.smartsdk.core.audio;

import android.media.AudioRecord;

/* loaded from: classes13.dex */
public class SpeakerDevice {
    private boolean aec = true;
    private int dataPath = 0;
    private int codecFormat = 1;
    private int sampleRate = 8000;
    private int channelConfig = 4;
    private int playerFormat = 2;

    public int getSampleRate() {
        return this.sampleRate;
    }

    public int getChannelConfig() {
        return this.channelConfig;
    }

    public int getPlayerFormat() {
        return this.playerFormat;
    }

    public int getReadBufferSize() {
        return AudioRecord.getMinBufferSize(getSampleRate(), 16, getPlayerFormat());
    }

    public void setSampleRate(int i) {
        this.sampleRate = i;
    }

    public void setAec(boolean z) {
        this.aec = z;
    }

    public boolean isAec() {
        return this.aec;
    }

    public int getDataPath() {
        return this.dataPath;
    }

    public void setDataPath(int i) {
        this.dataPath = i;
    }

    public void setCodecFormat(int i) {
        this.codecFormat = i;
    }

    public int getCodecFormat() {
        return this.codecFormat;
    }
}
