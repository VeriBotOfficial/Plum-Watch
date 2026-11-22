package com.squady.silerovad;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VadAudioGate.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J'\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u000eHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/squady/silerovad/VadAudioChunk;", "", "event", "Lcom/squady/silerovad/VadAudioEvent;", "pcm16LeMono16k", "", "startSample", "", "(Lcom/squady/silerovad/VadAudioEvent;[BJ)V", "getEvent", "()Lcom/squady/silerovad/VadAudioEvent;", "getPcm16LeMono16k", "()[B", "sampleCount", "", "getSampleCount", "()I", "getStartSample", "()J", "startTimeMs", "getStartTimeMs", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "silero-vad_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class VadAudioChunk {
    private final VadAudioEvent event;
    private final byte[] pcm16LeMono16k;
    private final long startSample;

    public static /* synthetic */ VadAudioChunk copy$default(VadAudioChunk vadAudioChunk, VadAudioEvent vadAudioEvent, byte[] bArr, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            vadAudioEvent = vadAudioChunk.event;
        }
        if ((i & 2) != 0) {
            bArr = vadAudioChunk.pcm16LeMono16k;
        }
        if ((i & 4) != 0) {
            j = vadAudioChunk.startSample;
        }
        return vadAudioChunk.copy(vadAudioEvent, bArr, j);
    }

    /* renamed from: component1, reason: from getter */
    public final VadAudioEvent getEvent() {
        return this.event;
    }

    /* renamed from: component2, reason: from getter */
    public final byte[] getPcm16LeMono16k() {
        return this.pcm16LeMono16k;
    }

    /* renamed from: component3, reason: from getter */
    public final long getStartSample() {
        return this.startSample;
    }

    public final VadAudioChunk copy(VadAudioEvent event, byte[] pcm16LeMono16k, long startSample) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(pcm16LeMono16k, "pcm16LeMono16k");
        return new VadAudioChunk(event, pcm16LeMono16k, startSample);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VadAudioChunk)) {
            return false;
        }
        VadAudioChunk vadAudioChunk = (VadAudioChunk) other;
        return this.event == vadAudioChunk.event && Intrinsics.areEqual(this.pcm16LeMono16k, vadAudioChunk.pcm16LeMono16k) && this.startSample == vadAudioChunk.startSample;
    }

    public int hashCode() {
        return (((this.event.hashCode() * 31) + Arrays.hashCode(this.pcm16LeMono16k)) * 31) + Long.hashCode(this.startSample);
    }

    public String toString() {
        return "VadAudioChunk(event=" + this.event + ", pcm16LeMono16k=" + Arrays.toString(this.pcm16LeMono16k) + ", startSample=" + this.startSample + ')';
    }

    public VadAudioChunk(VadAudioEvent event, byte[] pcm16LeMono16k, long j) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(pcm16LeMono16k, "pcm16LeMono16k");
        this.event = event;
        this.pcm16LeMono16k = pcm16LeMono16k;
        this.startSample = j;
    }

    public final VadAudioEvent getEvent() {
        return this.event;
    }

    public final byte[] getPcm16LeMono16k() {
        return this.pcm16LeMono16k;
    }

    public final long getStartSample() {
        return this.startSample;
    }

    public final int getSampleCount() {
        return this.pcm16LeMono16k.length / 2;
    }

    public final long getStartTimeMs() {
        return (this.startSample * 1000) / 16000;
    }
}
