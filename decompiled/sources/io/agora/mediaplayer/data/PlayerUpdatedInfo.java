package io.agora.mediaplayer.data;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
public class PlayerUpdatedInfo {
    private long audioBitsPerSample;
    private long audioChannels;
    private long audioSampleRate;
    private String deviceId;
    private String internalPlayerUuid;
    private long videoHeight;
    private long videoWidth;

    public PlayerUpdatedInfo() {
        this.internalPlayerUuid = null;
        this.deviceId = null;
    }

    public PlayerUpdatedInfo(String internalPlayerUuid, String deviceId) {
        this.internalPlayerUuid = internalPlayerUuid;
        this.deviceId = deviceId;
    }

    public PlayerUpdatedInfo(String internalPlayerUuid, String deviceId, long videoHeight, long videoWidth, long audioSampleRate, long audioChannels, long audioBitsPerSample) {
        this.internalPlayerUuid = internalPlayerUuid;
        this.deviceId = deviceId;
        this.videoHeight = videoHeight;
        this.videoWidth = videoWidth;
        this.audioSampleRate = audioSampleRate;
        this.audioChannels = audioChannels;
        this.audioBitsPerSample = audioBitsPerSample;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public String getInternalPlayerUuid() {
        return this.internalPlayerUuid;
    }

    public void setAudioBitsPerSample(long audioBitsPerSample) {
        this.audioBitsPerSample = audioBitsPerSample;
    }

    public void setAudioChannels(long audioChannels) {
        this.audioChannels = audioChannels;
    }

    public void setAudioSampleRate(long audioSampleRate) {
        this.audioSampleRate = audioSampleRate;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public void setInternalPlayerUuid(String internalPlayerUuid) {
        this.internalPlayerUuid = internalPlayerUuid;
    }

    public void setVideoHeight(long videoHeight) {
        this.videoHeight = videoHeight;
    }

    public void setVideoWidth(long videoWidth) {
        this.videoWidth = videoWidth;
    }

    public String toString() {
        return "PlayerUpdatedInfo{internalPlayerUuid=" + this.internalPlayerUuid + ", deviceId=" + this.deviceId + "videoHeight=" + this.videoHeight + ", videoWidth=" + this.videoWidth + ", audioSampleRate=" + this.audioSampleRate + "audioChannels=" + this.audioChannels + "audioBitsPerSample=" + this.audioBitsPerSample + AbstractJsonLexerKt.END_OBJ;
    }
}
