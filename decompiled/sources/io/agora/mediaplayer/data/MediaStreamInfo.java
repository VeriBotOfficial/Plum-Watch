package io.agora.mediaplayer.data;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
public class MediaStreamInfo {
    private int audioBytesPerSample;
    private int audioChannels;
    private int audioSampleRate;
    private String codecName;
    private long duration;
    private String language;
    private int mediaStreamType;
    private int streamIndex;
    private int videoBitRate;
    private int videoFrameRate;
    private int videoHeight;
    private int videoRotation;
    private int videoWidth;

    public MediaStreamInfo() {
    }

    public MediaStreamInfo(int streamIndex, int mediaStreamType, String codecName, String language, int videoFrameRate, int videoBitRate, int videoWidth, int videoHeight, int videoRotation, int audioSampleRate, int audioChannels, long duration) {
        this.streamIndex = streamIndex;
        this.mediaStreamType = mediaStreamType;
        this.codecName = codecName;
        this.language = language;
        this.videoFrameRate = videoFrameRate;
        this.videoBitRate = videoBitRate;
        this.videoWidth = videoWidth;
        this.videoHeight = videoHeight;
        this.videoRotation = videoRotation;
        this.audioSampleRate = audioSampleRate;
        this.audioChannels = audioChannels;
        this.duration = duration;
    }

    public int getAudioBytesPerSample() {
        return this.audioBytesPerSample;
    }

    public int getAudioChannels() {
        return this.audioChannels;
    }

    public int getAudioSampleRate() {
        return this.audioSampleRate;
    }

    public String getCodecName() {
        return this.codecName;
    }

    public long getDuration() {
        return this.duration;
    }

    public String getLanguage() {
        return this.language;
    }

    public int getMediaStreamType() {
        return this.mediaStreamType;
    }

    public int getStreamIndex() {
        return this.streamIndex;
    }

    public int getVideoBitRate() {
        return this.videoBitRate;
    }

    public int getVideoFrameRate() {
        return this.videoFrameRate;
    }

    public int getVideoHeight() {
        return this.videoHeight;
    }

    public int getVideoRotation() {
        return this.videoRotation;
    }

    public int getVideoWidth() {
        return this.videoWidth;
    }

    public void setAudioBytesPerSample(int audioBytesPerSample) {
        this.audioBytesPerSample = audioBytesPerSample;
    }

    public void setAudioChannels(int audioChannels) {
        this.audioChannels = audioChannels;
    }

    public void setAudioSampleRate(int audioSampleRate) {
        this.audioSampleRate = audioSampleRate;
    }

    public void setCodecName(String codecName) {
        this.codecName = codecName;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setMediaStreamType(int mediaStreamType) {
        this.mediaStreamType = mediaStreamType;
    }

    public void setStreamIndex(int streamIndex) {
        this.streamIndex = streamIndex;
    }

    public void setVideoBitRate(int videoBitRate) {
        this.videoBitRate = videoBitRate;
    }

    public void setVideoFrameRate(int videoFrameRate) {
        this.videoFrameRate = videoFrameRate;
    }

    public void setVideoHeight(int videoHeight) {
        this.videoHeight = videoHeight;
    }

    public void setVideoRotation(int videoRotation) {
        this.videoRotation = videoRotation;
    }

    public void setVideoWidth(int videoWidth) {
        this.videoWidth = videoWidth;
    }

    public String toString() {
        return "MediaStreamInfo{streamIndex=" + this.streamIndex + ", mediaStreamType=" + this.mediaStreamType + ", codecName='" + this.codecName + "', language='" + this.language + "', videoFrameRate=" + this.videoFrameRate + ", videoBitRate=" + this.videoBitRate + ", videoWidth=" + this.videoWidth + ", videoHeight=" + this.videoHeight + ", audioSampleRate=" + this.audioSampleRate + ", videoRotation=" + this.videoRotation + ", audioChannels=" + this.audioChannels + ", duration=" + this.duration + AbstractJsonLexerKt.END_OBJ;
    }
}
