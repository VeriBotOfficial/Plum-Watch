package io.agora.rtc2.audio;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
public class AudioParams {
    public int channel;
    public int mode;
    public int sampleRate;
    public int samplesPerCall;

    public AudioParams(int sampleRate, int channelCnt, int mode, int samplesPerCall) {
        this.sampleRate = sampleRate;
        this.channel = channelCnt;
        this.mode = mode;
        this.samplesPerCall = samplesPerCall;
    }

    public int getChannel() {
        return this.channel;
    }

    public int getMode() {
        return this.mode;
    }

    public int getSampleRate() {
        return this.sampleRate;
    }

    public int getSamplesPerCall() {
        return this.samplesPerCall;
    }

    public String toString() {
        return "AudioParams{sampleRate=" + this.sampleRate + ", channel=" + this.channel + ", mode=" + this.mode + ", samplesPerCall=" + this.samplesPerCall + AbstractJsonLexerKt.END_OBJ;
    }
}
