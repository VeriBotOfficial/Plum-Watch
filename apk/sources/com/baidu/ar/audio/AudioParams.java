package com.baidu.ar.audio;

/* JADX INFO: loaded from: classes16.dex */
public class AudioParams {
    public static final float DEFAULT_AMPLIFY_VOLUME = 1.0f;
    public static final int DEFAULT_AUDIO_BUFFER_SIZE = 32768;
    public static final int DEFAULT_AUDIO_FORMAT = 2;
    public static final int DEFAULT_AUDIO_SOURCE = 1;
    public static final int DEFAULT_BUFFER_FRAME_COUNT = 32;
    public static final int DEFAULT_CHANNEL_CONFIG = 16;
    public static final int DEFAULT_FRAME_SIZE = 1024;
    public static final int DEFAULT_SAMPLE_RATE = 16000;
    public static final int SAMPLES_PER_FRAME = 1024;
    private int mAudioSource = 1;
    private int mSampleRate = 16000;
    private int mChannelConfig = 16;
    private int mAudioFormat = 2;
    private int mFrameSize = 1024;
    private int mFrameBufferCount = 32;
    private int mAudioBufferSize = 32768;
    private float mAmplifyVolume = 1.0f;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AudioParams)) {
            return false;
        }
        AudioParams audioParams = (AudioParams) obj;
        return this.mAudioSource == audioParams.mAudioSource && this.mSampleRate == audioParams.getSampleRate() && this.mChannelConfig == audioParams.getChannelConfig() && this.mAudioFormat == audioParams.getAudioFormat() && this.mFrameSize == audioParams.getFrameSize() && this.mAmplifyVolume == audioParams.getAmplifyVolume();
    }

    public float getAmplifyVolume() {
        return this.mAmplifyVolume;
    }

    public int getAudioBufferSize() {
        return this.mAudioBufferSize;
    }

    public int getAudioFormat() {
        return this.mAudioFormat;
    }

    public int getAudioSource() {
        return this.mAudioSource;
    }

    public int getChannelConfig() {
        return this.mChannelConfig;
    }

    public int getFrameBufferCount() {
        return this.mFrameBufferCount;
    }

    public int getFrameSize() {
        return this.mFrameSize;
    }

    public int getSampleRate() {
        return this.mSampleRate;
    }

    public int hashCode() {
        return ((((((((((this.mAudioSource + 31) * 31) + this.mSampleRate) * 31) + this.mChannelConfig) * 31) + this.mAudioFormat) * 31) + this.mFrameSize) * 31) + ((int) this.mAmplifyVolume);
    }

    public void setAmplifyVolume(float f) {
        this.mAmplifyVolume = f;
    }

    public void setAudioBufferSize(int r1) {
        this.mAudioBufferSize = r1;
    }

    public void setAudioFormat(int r1) {
        this.mAudioFormat = r1;
    }

    public void setAudioSource(int r1) {
        this.mAudioSource = r1;
    }

    public void setChannelConfig(int r1) {
        this.mChannelConfig = r1;
    }

    public void setFrameBufferCount(int r1) {
        this.mFrameBufferCount = r1;
    }

    public void setFrameSize(int r1) {
        this.mFrameSize = r1;
    }

    public void setSampleRate(int r1) {
        this.mSampleRate = r1;
    }
}
