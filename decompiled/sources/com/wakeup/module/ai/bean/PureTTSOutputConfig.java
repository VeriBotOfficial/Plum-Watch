package com.wakeup.module.ai.bean;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: TTSBean.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003JO\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lcom/wakeup/module/ai/bean/PureTTSOutputConfig;", "", "outAudioType", "", "outAudioEncodeProtocol", "outAudioFrameSize", "sampleRate", "sampleSizeInBits", "channels", "bigEndian", "", "<init>", "(IIIIIIZ)V", "getOutAudioType", "()I", "getOutAudioEncodeProtocol", "getOutAudioFrameSize", "getSampleRate", "getSampleSizeInBits", "getChannels", "getBigEndian", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "", "module-ai_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PureTTSOutputConfig {
    private final boolean bigEndian;
    private final int channels;
    private final int outAudioEncodeProtocol;
    private final int outAudioFrameSize;
    private final int outAudioType;
    private final int sampleRate;
    private final int sampleSizeInBits;

    public PureTTSOutputConfig() {
        this(0, 0, 0, 0, 0, 0, false, 127, null);
    }

    public static /* synthetic */ PureTTSOutputConfig copy$default(PureTTSOutputConfig pureTTSOutputConfig, int i, int i2, int i3, int i4, int i5, int i6, boolean z, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i = pureTTSOutputConfig.outAudioType;
        }
        if ((i7 & 2) != 0) {
            i2 = pureTTSOutputConfig.outAudioEncodeProtocol;
        }
        if ((i7 & 4) != 0) {
            i3 = pureTTSOutputConfig.outAudioFrameSize;
        }
        if ((i7 & 8) != 0) {
            i4 = pureTTSOutputConfig.sampleRate;
        }
        if ((i7 & 16) != 0) {
            i5 = pureTTSOutputConfig.sampleSizeInBits;
        }
        if ((i7 & 32) != 0) {
            i6 = pureTTSOutputConfig.channels;
        }
        if ((i7 & 64) != 0) {
            z = pureTTSOutputConfig.bigEndian;
        }
        int i8 = i6;
        boolean z2 = z;
        int i9 = i5;
        int i10 = i3;
        return pureTTSOutputConfig.copy(i, i2, i10, i4, i9, i8, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getOutAudioType() {
        return this.outAudioType;
    }

    /* renamed from: component2, reason: from getter */
    public final int getOutAudioEncodeProtocol() {
        return this.outAudioEncodeProtocol;
    }

    /* renamed from: component3, reason: from getter */
    public final int getOutAudioFrameSize() {
        return this.outAudioFrameSize;
    }

    /* renamed from: component4, reason: from getter */
    public final int getSampleRate() {
        return this.sampleRate;
    }

    /* renamed from: component5, reason: from getter */
    public final int getSampleSizeInBits() {
        return this.sampleSizeInBits;
    }

    /* renamed from: component6, reason: from getter */
    public final int getChannels() {
        return this.channels;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getBigEndian() {
        return this.bigEndian;
    }

    public final PureTTSOutputConfig copy(int outAudioType, int outAudioEncodeProtocol, int outAudioFrameSize, int sampleRate, int sampleSizeInBits, int channels, boolean bigEndian) {
        return new PureTTSOutputConfig(outAudioType, outAudioEncodeProtocol, outAudioFrameSize, sampleRate, sampleSizeInBits, channels, bigEndian);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PureTTSOutputConfig)) {
            return false;
        }
        PureTTSOutputConfig pureTTSOutputConfig = (PureTTSOutputConfig) other;
        return this.outAudioType == pureTTSOutputConfig.outAudioType && this.outAudioEncodeProtocol == pureTTSOutputConfig.outAudioEncodeProtocol && this.outAudioFrameSize == pureTTSOutputConfig.outAudioFrameSize && this.sampleRate == pureTTSOutputConfig.sampleRate && this.sampleSizeInBits == pureTTSOutputConfig.sampleSizeInBits && this.channels == pureTTSOutputConfig.channels && this.bigEndian == pureTTSOutputConfig.bigEndian;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.outAudioType) * 31) + Integer.hashCode(this.outAudioEncodeProtocol)) * 31) + Integer.hashCode(this.outAudioFrameSize)) * 31) + Integer.hashCode(this.sampleRate)) * 31) + Integer.hashCode(this.sampleSizeInBits)) * 31) + Integer.hashCode(this.channels)) * 31) + Boolean.hashCode(this.bigEndian);
    }

    public String toString() {
        return "PureTTSOutputConfig(outAudioType=" + this.outAudioType + ", outAudioEncodeProtocol=" + this.outAudioEncodeProtocol + ", outAudioFrameSize=" + this.outAudioFrameSize + ", sampleRate=" + this.sampleRate + ", sampleSizeInBits=" + this.sampleSizeInBits + ", channels=" + this.channels + ", bigEndian=" + this.bigEndian + Separators.RPAREN;
    }

    public PureTTSOutputConfig(int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        this.outAudioType = i;
        this.outAudioEncodeProtocol = i2;
        this.outAudioFrameSize = i3;
        this.sampleRate = i4;
        this.sampleSizeInBits = i5;
        this.channels = i6;
        this.bigEndian = z;
    }

    public /* synthetic */ PureTTSOutputConfig(int i, int i2, int i3, int i4, int i5, int i6, boolean z, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 5 : i, (i7 & 2) != 0 ? 3 : i2, (i7 & 4) != 0 ? 3 : i3, (i7 & 8) != 0 ? 16000 : i4, (i7 & 16) != 0 ? 16 : i5, (i7 & 32) != 0 ? 1 : i6, (i7 & 64) != 0 ? false : z);
    }

    public final int getOutAudioType() {
        return this.outAudioType;
    }

    public final int getOutAudioEncodeProtocol() {
        return this.outAudioEncodeProtocol;
    }

    public final int getOutAudioFrameSize() {
        return this.outAudioFrameSize;
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
}
