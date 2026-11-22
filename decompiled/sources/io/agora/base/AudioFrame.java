package io.agora.base;

import java.nio.ByteBuffer;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
public class AudioFrame {
    public ByteBuffer buffer;
    public int bytesPerSample;
    public int channelNums;
    public int sampleRataHz;
    public int samplesPerChannel;
    public long timestamp;

    public AudioFrame(ByteBuffer buffer, int sampleRataHz, int bytesPerSample, int channelNums, int samplesPerChannel, long timestamp) {
        this.sampleRataHz = sampleRataHz;
        this.bytesPerSample = bytesPerSample;
        this.channelNums = channelNums;
        this.samplesPerChannel = samplesPerChannel;
        this.timestamp = timestamp;
        this.buffer = buffer;
    }

    public ByteBuffer getByteBuffer() {
        return this.buffer;
    }

    public int getBytesPerSample() {
        return this.bytesPerSample;
    }

    public int getChannelNums() {
        return this.channelNums;
    }

    public int getSampleRataHz() {
        return this.sampleRataHz;
    }

    public int getSamplesPerChannel() {
        return this.samplesPerChannel;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public String toString() {
        return "AudioFrame{sampleRataHz=" + this.sampleRataHz + ", bytesPerSample=" + this.bytesPerSample + ", channelNums=" + this.channelNums + ", samplesPerChannel=" + this.samplesPerChannel + ", timestamp=" + this.timestamp + AbstractJsonLexerKt.END_OBJ;
    }
}
