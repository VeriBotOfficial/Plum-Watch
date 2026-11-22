package com.otaliastudios.cameraview.video.encoding;

/* loaded from: classes17.dex */
public class AudioConfig {
    public int bitRate;
    public String encoder;
    public int channels = 1;
    public String mimeType = "audio/mp4a-latm";
    public int samplingFrequency = 44100;
    final int encoding = 2;
    final int sampleSizePerChannel = 2;
    final int byteRatePerChannel = 44100 * 2;

    int audioRecordBufferFrames() {
        return 50;
    }

    int bufferPoolMaxSize() {
        return 500;
    }

    AudioConfig copy() {
        AudioConfig audioConfig = new AudioConfig();
        audioConfig.bitRate = this.bitRate;
        audioConfig.channels = this.channels;
        audioConfig.encoder = this.encoder;
        audioConfig.mimeType = this.mimeType;
        audioConfig.samplingFrequency = this.samplingFrequency;
        return audioConfig;
    }

    int byteRate() {
        return this.byteRatePerChannel * this.channels;
    }

    int bitRate() {
        return byteRate() * 8;
    }

    int audioFormatChannels() {
        int i = this.channels;
        if (i == 1) {
            return 16;
        }
        if (i == 2) {
            return 12;
        }
        throw new RuntimeException("Invalid number of channels: " + this.channels);
    }

    int frameSize() {
        return this.channels * 1024;
    }
}
