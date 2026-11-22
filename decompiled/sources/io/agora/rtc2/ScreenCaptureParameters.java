package io.agora.rtc2;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
public class ScreenCaptureParameters {
    public boolean captureAudio = false;
    public VideoCaptureParameters videoCaptureParameters = new VideoCaptureParameters();
    public boolean captureVideo = true;
    public AudioCaptureParameters audioCaptureParameters = new AudioCaptureParameters();

    public static class AudioCaptureParameters {
        public int sampleRate = 16000;
        public int channels = 2;
        public int captureSignalVolume = 100;
        public boolean allowCaptureCurrentApp = true;

        public int getCaptureSignalVolume() {
            return this.captureSignalVolume;
        }

        public int getChannels() {
            return this.channels;
        }

        public int getSampleRate() {
            return this.sampleRate;
        }

        public String toString() {
            return "AudioCaptureParameters{sampleRate=" + this.sampleRate + ", channels=" + this.channels + ", captureSignalVolume=" + this.captureSignalVolume + ", allowCaptureCurrentApp=" + this.allowCaptureCurrentApp + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public static class VideoCaptureParameters {
        public int bitrate = 0;
        public int framerate = 15;
        public int width = 1280;
        public int height = 720;
        public int contentHint = 1;

        public int getBitrate() {
            return this.bitrate;
        }

        public int getContentHint() {
            return this.contentHint;
        }

        public int getFramerate() {
            return this.framerate;
        }

        public int getHeight() {
            return this.height;
        }

        public int getWidth() {
            return this.width;
        }

        public String toString() {
            return "VideoCaptureParameters{bitrate=" + this.bitrate + ", framerate=" + this.framerate + ", width=" + this.width + ", height=" + this.height + ", contentHint=" + this.contentHint + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public AudioCaptureParameters getAudioCaptureParameters() {
        return this.audioCaptureParameters;
    }

    public VideoCaptureParameters getVideoCaptureParameters() {
        return this.videoCaptureParameters;
    }

    public boolean isCaptureAudio() {
        return this.captureAudio;
    }

    public boolean isCaptureVideo() {
        return this.captureVideo;
    }

    public String toString() {
        return "ScreenCaptureParameters{captureAudio=" + this.captureAudio + ", videoCaptureParameters=" + this.videoCaptureParameters + ", captureVideo=" + this.captureVideo + ", audioCaptureParameters=" + this.audioCaptureParameters + AbstractJsonLexerKt.END_OBJ;
    }
}
