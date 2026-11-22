package io.agora.rtc2.audio;

/* loaded from: classes6.dex */
public class AudioSpectrumInfo {
    private float[] audioSpectrumData;
    private int dataLength;

    public AudioSpectrumInfo(float[] audioSpectrumData, int dataLength) {
        this.audioSpectrumData = audioSpectrumData;
        this.dataLength = dataLength;
    }

    public float[] getAudioSpectrumData() {
        return this.audioSpectrumData;
    }

    public int getDataLength() {
        return this.dataLength;
    }
}
