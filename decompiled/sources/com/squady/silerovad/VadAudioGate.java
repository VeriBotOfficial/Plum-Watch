package com.squady.silerovad;

import com.wakeup.common.burypoint.BuryPointPageId;
import java.io.Closeable;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VadAudioGate.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B9\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0016J\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u0005J\u0010\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u000eH\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/squady/silerovad/VadAudioGate;", "Ljava/io/Closeable;", "preRollMs", "", "speechThreshold", "", "silenceThreshold", "speechFramesRequired", "silenceFramesRequired", "(IFFII)V", "closed", "", BuryPointPageId.PAGE_ID_HISTORY, "Ljava/util/ArrayDeque;", "", "historyBytes", "maxHistoryBytes", "getPreRollMs", "()I", "processedSamples", "", "silenceFrames", "speaking", "speechFrames", "clearHistory", "", "close", "finish", "Lcom/squady/silerovad/VadAudioChunk;", "processFrame", "pcm16LeMono16k", "probability", "retain", "data", "silero-vad_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VadAudioGate implements Closeable {
    private boolean closed;
    private final ArrayDeque<byte[]> history;
    private int historyBytes;
    private final int maxHistoryBytes;
    private final int preRollMs;
    private long processedSamples;
    private int silenceFrames;
    private final int silenceFramesRequired;
    private final float silenceThreshold;
    private boolean speaking;
    private int speechFrames;
    private final int speechFramesRequired;
    private final float speechThreshold;

    public VadAudioGate() {
        this(0, 0.0f, 0.0f, 0, 0, 31, null);
    }

    public VadAudioGate(int i) {
        this(i, 0.0f, 0.0f, 0, 0, 30, null);
    }

    public VadAudioGate(int i, float f) {
        this(i, f, 0.0f, 0, 0, 28, null);
    }

    public VadAudioGate(int i, float f, float f2) {
        this(i, f, f2, 0, 0, 24, null);
    }

    public VadAudioGate(int i, float f, float f2, int i2) {
        this(i, f, f2, i2, 0, 16, null);
    }

    public VadAudioGate(int i, float f, float f2, int i2, int i3) {
        this.preRollMs = i;
        this.speechThreshold = f;
        this.silenceThreshold = f2;
        this.speechFramesRequired = i2;
        this.silenceFramesRequired = i3;
        if (i < 0 || i >= 67108832) {
            throw new IllegalArgumentException("preRollMs must be in 0..67108831".toString());
        }
        if (Float.isInfinite(f) || Float.isNaN(f) || Float.isInfinite(f2) || Float.isNaN(f2) || f2 < 0.0f || f2 >= f || f > 1.0f) {
            throw new IllegalArgumentException("Expected 0 <= silenceThreshold < speechThreshold <= 1".toString());
        }
        if (i2 <= 0 || i3 <= 0) {
            throw new IllegalArgumentException("Confirmation counts must be positive".toString());
        }
        this.maxHistoryBytes = i * 32;
        this.history = new ArrayDeque<>();
    }

    public /* synthetic */ VadAudioGate(int i, float f, float f2, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 300 : i, (i4 & 2) != 0 ? 0.6f : f, (i4 & 4) != 0 ? 0.35f : f2, (i4 & 8) != 0 ? 3 : i2, (i4 & 16) != 0 ? 8 : i3);
    }

    public final int getPreRollMs() {
        return this.preRollMs;
    }

    public final VadAudioChunk processFrame(byte[] pcm16LeMono16k, float probability) {
        Intrinsics.checkNotNullParameter(pcm16LeMono16k, "pcm16LeMono16k");
        if (this.closed) {
            throw new IllegalStateException("Gate is finished or closed".toString());
        }
        int length = pcm16LeMono16k.length;
        if (2 > length || length >= 1025 || pcm16LeMono16k.length % 2 != 0) {
            throw new IllegalArgumentException("Expected 1..512 PCM16 samples".toString());
        }
        if (Float.isInfinite(probability) || Float.isNaN(probability) || 0.0f > probability || probability > 1.0f) {
            throw new IllegalArgumentException("probability must be finite and in 0..1".toString());
        }
        long j = this.processedSamples;
        this.processedSamples = (pcm16LeMono16k.length / 2) + j;
        if (probability >= this.speechThreshold) {
            int i = this.speechFrames;
            if (i < this.speechFramesRequired) {
                this.speechFrames = i + 1;
            }
            this.silenceFrames = 0;
        } else if (probability <= this.silenceThreshold) {
            int i2 = this.silenceFrames;
            if (i2 < this.silenceFramesRequired) {
                this.silenceFrames = i2 + 1;
            }
            this.speechFrames = 0;
        } else {
            this.speechFrames = 0;
            this.silenceFrames = 0;
        }
        if (this.speaking) {
            boolean z = this.silenceFrames >= this.silenceFramesRequired;
            if (z) {
                this.speaking = false;
            }
            VadAudioEvent vadAudioEvent = z ? VadAudioEvent.END : VadAudioEvent.AUDIO;
            byte[] copyOf = Arrays.copyOf(pcm16LeMono16k, pcm16LeMono16k.length);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            return new VadAudioChunk(vadAudioEvent, copyOf, j);
        }
        if (this.speechFrames >= this.speechFramesRequired) {
            this.speaking = true;
            byte[] bArr = new byte[this.historyBytes + pcm16LeMono16k.length];
            Iterator<byte[]> it = this.history.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                byte[] next = it.next();
                Intrinsics.checkNotNull(next);
                ArraysKt.copyInto$default(next, bArr, i3, 0, 0, 12, (Object) null);
                i3 += next.length;
            }
            ArraysKt.copyInto$default(pcm16LeMono16k, bArr, i3, 0, 0, 12, (Object) null);
            long j2 = j - (this.historyBytes / 2);
            clearHistory();
            return new VadAudioChunk(VadAudioEvent.START, bArr, j2);
        }
        retain(pcm16LeMono16k);
        return null;
    }

    public final VadAudioChunk finish() {
        if (this.closed) {
            return null;
        }
        VadAudioChunk vadAudioChunk = this.speaking ? new VadAudioChunk(VadAudioEvent.END, new byte[0], this.processedSamples) : null;
        close();
        return vadAudioChunk;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.closed = true;
        this.speaking = false;
        clearHistory();
    }

    private final void retain(byte[] data) {
        int i = this.maxHistoryBytes;
        if (i == 0) {
            return;
        }
        int min = Math.min(data.length, i);
        int max = Math.max(0, this.historyBytes - (this.maxHistoryBytes - min));
        while (max > 0) {
            byte[] removeFirst = this.history.removeFirst();
            int min2 = Math.min(max, removeFirst.length);
            if (min2 < removeFirst.length) {
                ArrayDeque<byte[]> arrayDeque = this.history;
                Intrinsics.checkNotNull(removeFirst);
                arrayDeque.addFirst(ArraysKt.copyOfRange(removeFirst, min2, removeFirst.length));
            }
            this.historyBytes -= min2;
            max -= min2;
        }
        this.history.addLast(ArraysKt.copyOfRange(data, data.length - min, data.length));
        this.historyBytes += min;
    }

    private final void clearHistory() {
        this.history.clear();
        this.historyBytes = 0;
    }
}
