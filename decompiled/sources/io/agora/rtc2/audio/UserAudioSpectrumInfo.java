package io.agora.rtc2.audio;

/* loaded from: classes6.dex */
public class UserAudioSpectrumInfo {
    private AudioSpectrumInfo audioSpectrumInfo;
    private int uid;

    public UserAudioSpectrumInfo(int uid, AudioSpectrumInfo audioSpectrumInfo) {
        this.uid = uid;
        this.audioSpectrumInfo = audioSpectrumInfo;
    }

    public AudioSpectrumInfo getAudioSpectrumInfo() {
        return this.audioSpectrumInfo;
    }

    public int getUid() {
        return this.uid;
    }
}
