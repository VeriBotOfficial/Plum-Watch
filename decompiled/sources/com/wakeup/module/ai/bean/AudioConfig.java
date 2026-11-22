package com.wakeup.module.ai.bean;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: ASRBean.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u000bHÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003Jc\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010$\u001a\u00020\u000b2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0003HÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006)"}, d2 = {"Lcom/wakeup/module/ai/bean/AudioConfig;", "", "streamType", "", "inAudioType", "inStreamProtocol", "inAudioDecodeProtocol", "sampleRate", "sampleSizeInBits", "channels", "bigEndian", "", "inFrameDurationMs", "<init>", "(IIIIIIIZI)V", "getStreamType", "()I", "getInAudioType", "getInStreamProtocol", "getInAudioDecodeProtocol", "getSampleRate", "getSampleSizeInBits", "getChannels", "getBigEndian", "()Z", "getInFrameDurationMs", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "", "module-ai_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AudioConfig {
    private final boolean bigEndian;
    private final int channels;
    private final int inAudioDecodeProtocol;
    private final int inAudioType;
    private final int inFrameDurationMs;
    private final int inStreamProtocol;
    private final int sampleRate;
    private final int sampleSizeInBits;
    private final int streamType;

    public AudioConfig() {
        this(0, 0, 0, 0, 0, 0, 0, false, 0, 511, null);
    }

    public static /* synthetic */ AudioConfig copy$default(AudioConfig audioConfig, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i = audioConfig.streamType;
        }
        if ((i9 & 2) != 0) {
            i2 = audioConfig.inAudioType;
        }
        if ((i9 & 4) != 0) {
            i3 = audioConfig.inStreamProtocol;
        }
        if ((i9 & 8) != 0) {
            i4 = audioConfig.inAudioDecodeProtocol;
        }
        if ((i9 & 16) != 0) {
            i5 = audioConfig.sampleRate;
        }
        if ((i9 & 32) != 0) {
            i6 = audioConfig.sampleSizeInBits;
        }
        if ((i9 & 64) != 0) {
            i7 = audioConfig.channels;
        }
        if ((i9 & 128) != 0) {
            z = audioConfig.bigEndian;
        }
        if ((i9 & 256) != 0) {
            i8 = audioConfig.inFrameDurationMs;
        }
        boolean z2 = z;
        int i10 = i8;
        int i11 = i6;
        int i12 = i7;
        int i13 = i5;
        int i14 = i3;
        return audioConfig.copy(i, i2, i14, i4, i13, i11, i12, z2, i10);
    }

    /* renamed from: component1, reason: from getter */
    public final int getStreamType() {
        return this.streamType;
    }

    /* renamed from: component2, reason: from getter */
    public final int getInAudioType() {
        return this.inAudioType;
    }

    /* renamed from: component3, reason: from getter */
    public final int getInStreamProtocol() {
        return this.inStreamProtocol;
    }

    /* renamed from: component4, reason: from getter */
    public final int getInAudioDecodeProtocol() {
        return this.inAudioDecodeProtocol;
    }

    /* renamed from: component5, reason: from getter */
    public final int getSampleRate() {
        return this.sampleRate;
    }

    /* renamed from: component6, reason: from getter */
    public final int getSampleSizeInBits() {
        return this.sampleSizeInBits;
    }

    /* renamed from: component7, reason: from getter */
    public final int getChannels() {
        return this.channels;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getBigEndian() {
        return this.bigEndian;
    }

    /* renamed from: component9, reason: from getter */
    public final int getInFrameDurationMs() {
        return this.inFrameDurationMs;
    }

    public final AudioConfig copy(int streamType, int inAudioType, int inStreamProtocol, int inAudioDecodeProtocol, int sampleRate, int sampleSizeInBits, int channels, boolean bigEndian, int inFrameDurationMs) {
        return new AudioConfig(streamType, inAudioType, inStreamProtocol, inAudioDecodeProtocol, sampleRate, sampleSizeInBits, channels, bigEndian, inFrameDurationMs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AudioConfig)) {
            return false;
        }
        AudioConfig audioConfig = (AudioConfig) other;
        return this.streamType == audioConfig.streamType && this.inAudioType == audioConfig.inAudioType && this.inStreamProtocol == audioConfig.inStreamProtocol && this.inAudioDecodeProtocol == audioConfig.inAudioDecodeProtocol && this.sampleRate == audioConfig.sampleRate && this.sampleSizeInBits == audioConfig.sampleSizeInBits && this.channels == audioConfig.channels && this.bigEndian == audioConfig.bigEndian && this.inFrameDurationMs == audioConfig.inFrameDurationMs;
    }

    public int hashCode() {
        return (((((((((((((((Integer.hashCode(this.streamType) * 31) + Integer.hashCode(this.inAudioType)) * 31) + Integer.hashCode(this.inStreamProtocol)) * 31) + Integer.hashCode(this.inAudioDecodeProtocol)) * 31) + Integer.hashCode(this.sampleRate)) * 31) + Integer.hashCode(this.sampleSizeInBits)) * 31) + Integer.hashCode(this.channels)) * 31) + Boolean.hashCode(this.bigEndian)) * 31) + Integer.hashCode(this.inFrameDurationMs);
    }

    public String toString() {
        return "AudioConfig(streamType=" + this.streamType + ", inAudioType=" + this.inAudioType + ", inStreamProtocol=" + this.inStreamProtocol + ", inAudioDecodeProtocol=" + this.inAudioDecodeProtocol + ", sampleRate=" + this.sampleRate + ", sampleSizeInBits=" + this.sampleSizeInBits + ", channels=" + this.channels + ", bigEndian=" + this.bigEndian + ", inFrameDurationMs=" + this.inFrameDurationMs + Separators.RPAREN;
    }

    public AudioConfig(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, int i8) {
        this.streamType = i;
        this.inAudioType = i2;
        this.inStreamProtocol = i3;
        this.inAudioDecodeProtocol = i4;
        this.sampleRate = i5;
        this.sampleSizeInBits = i6;
        this.channels = i7;
        this.bigEndian = z;
        this.inFrameDurationMs = i8;
    }

    public /* synthetic */ AudioConfig(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, int i8, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? 1 : i, (i9 & 2) != 0 ? 5 : i2, (i9 & 4) != 0 ? 1 : i3, (i9 & 8) != 0 ? 2 : i4, (i9 & 16) != 0 ? 16000 : i5, (i9 & 32) != 0 ? 16 : i6, (i9 & 64) != 0 ? 1 : i7, (i9 & 128) != 0 ? false : z, (i9 & 256) != 0 ? 20 : i8);
    }

    public final int getStreamType() {
        return this.streamType;
    }

    public final int getInAudioType() {
        return this.inAudioType;
    }

    public final int getInStreamProtocol() {
        return this.inStreamProtocol;
    }

    public final int getInAudioDecodeProtocol() {
        return this.inAudioDecodeProtocol;
    }

    public final int getSampleRate() {
        return this.sampleRate;
    }

    public final int getSampleSizeInBits() {
        return this.sampleSizeInBits;
    }

    public final int getChannels() {
        return this.channels;
    }

    public final boolean getBigEndian() {
        return this.bigEndian;
    }

    public final int getInFrameDurationMs() {
        return this.inFrameDurationMs;
    }
}
