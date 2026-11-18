package com.beken.iot.smartsdk.core.audio;

import android.media.AudioRecord;

/* JADX INFO: loaded from: classes15.dex */
public class MicDevice {
    private int channelConfig;
    private int codecFormat;
    private int recordFormat;
    private int sampleRate;

    public MicDevice() {
        this.codecFormat = 1;
        this.sampleRate = 8000;
        this.channelConfig = 16;
        this.recordFormat = 2;
    }

    public MicDevice(int r2) {
        this.channelConfig = 16;
        this.recordFormat = 2;
        this.codecFormat = 1;
        this.sampleRate = r2;
    }

    public int getSampleRate() {
        return this.sampleRate;
    }

    public void setSampleRate(int r1) {
        this.sampleRate = r1;
    }

    public int getChannelConfig() {
        return this.channelConfig;
    }

    public int getRecordFormat() {
        return this.recordFormat;
    }

    public int getReadBufferSize() {
        return AudioRecord.getMinBufferSize(getSampleRate(), 16, getRecordFormat());
    }

    public int getCodecFormat() {
        return this.codecFormat;
    }

    public void setCodecFormat(int r1) {
        this.codecFormat = r1;
    }
}
