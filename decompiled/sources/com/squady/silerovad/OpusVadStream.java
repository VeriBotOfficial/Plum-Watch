package com.squady.silerovad;

import android.gov.nist.javax.sip.header.ParameterNames;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Surface;
import androidx.media3.extractor.OpusUtil;
import com.squady.silerovad.RawOpusPacketReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OpusVadStream.kt */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0001@BK\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\b\u0010)\u001a\u00020\u0003H\u0002J\u0010\u0010*\u001a\u00020\f2\u0006\u0010+\u001a\u00020,H\u0002J\b\u0010-\u001a\u00020\fH\u0002J\u0010\u0010.\u001a\u00020\f2\u0006\u0010/\u001a\u00020\u001fH\u0002J\b\u00100\u001a\u00020\fH\u0002J\b\u00101\u001a\u00020\fH\u0016J\u001c\u00102\u001a\b\u0012\u0004\u0012\u00020\u0016032\f\u00104\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002J\u0010\u00105\u001a\u00020\u000e2\u0006\u00106\u001a\u00020\u001fH\u0002J\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u001603J\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u001603J*\u00109\u001a\b\u0012\u0004\u0012\u00020\u0016032\u0006\u0010:\u001a\u00020\t2\b\b\u0002\u0010;\u001a\u00020\u00032\b\b\u0002\u0010<\u001a\u00020\u0003H\u0007J\u0010\u0010=\u001a\u00020\f2\u0006\u0010>\u001a\u00020\u0003H\u0002J\b\u0010?\u001a\u00020\fH\u0002R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\"\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020#X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006A"}, d2 = {"Lcom/squady/silerovad/OpusVadStream;", "Ljava/io/Closeable;", "packetSizeBytes", "", "channelCount", "speechThreshold", "", "infer", "Lkotlin/Function1;", "", "releaseVad", "Lkotlin/Function0;", "", "includePcm", "", "(IIFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Z)V", "codec", "Landroid/media/MediaCodec;", "converter", "Lcom/squady/silerovad/OpusPcmConverter;", "emitted", "", "Lcom/squady/silerovad/OpusVadFrame;", ParameterNames.INFO, "Landroid/media/MediaCodec$BufferInfo;", "outputDescription", "Lkotlin/Triple;", "outputEnded", "packet", "pendingBytes", "processedSamples", "", "queuedSamples", "resourcesReleased", "result", "Lcom/squady/silerovad/OpusVadResult;", "getResult", "()Lcom/squady/silerovad/OpusVadResult;", "state", "Lcom/squady/silerovad/OpusVadStream$State;", "summary", "acquireInput", "applyFormat", "format", "Landroid/media/MediaFormat;", "checkInterrupted", "checkProgress", "lastProgress", "checkWorker", "close", "collect", "", "operation", "drainAvailable", "timeoutUs", "finish", "poll", "push", "data", "offset", "length", "queuePacket", "samples", "releaseResources", "State", "silero-vad_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OpusVadStream implements Closeable {
    private final MediaCodec codec;
    private OpusPcmConverter converter;
    private List<OpusVadFrame> emitted;
    private final boolean includePcm;
    private final Function1<byte[], Float> infer;
    private final MediaCodec.BufferInfo info;
    private Triple<Integer, Integer, Integer> outputDescription;
    private boolean outputEnded;
    private final byte[] packet;
    private int pendingBytes;
    private long processedSamples;
    private long queuedSamples;
    private final Function0<Unit> releaseVad;
    private boolean resourcesReleased;
    private final float speechThreshold;
    private State state;
    private volatile OpusVadResult summary;

    public final List<OpusVadFrame> push(byte[] data) throws IOException {
        Intrinsics.checkNotNullParameter(data, "data");
        return push$default(this, data, 0, 0, 6, null);
    }

    public final List<OpusVadFrame> push(byte[] data, int i) throws IOException {
        Intrinsics.checkNotNullParameter(data, "data");
        return push$default(this, data, i, 0, 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OpusVadStream(int i, int i2, float f, Function1<? super byte[], Float> infer, Function0<Unit> releaseVad, boolean z) {
        Intrinsics.checkNotNullParameter(infer, "infer");
        Intrinsics.checkNotNullParameter(releaseVad, "releaseVad");
        this.speechThreshold = f;
        this.infer = infer;
        this.releaseVad = releaseVad;
        this.includePcm = z;
        this.state = State.OPEN;
        this.packet = new byte[i];
        this.info = new MediaCodec.BufferInfo();
        this.summary = new OpusVadResult(false, 0.0f, 0L, 0L, 0L);
        MediaCodec createDecoderByType = MediaCodec.createDecoderByType("audio/opus");
        try {
            createDecoderByType.configure(OpusFileDecoder.INSTANCE.rawFormat$silero_vad_release(i, i2), (Surface) null, (MediaCrypto) null, 0);
            createDecoderByType.start();
            Intrinsics.checkNotNullExpressionValue(createDecoderByType, "also(...)");
            this.codec = createDecoderByType;
        } finally {
        }
    }

    public /* synthetic */ OpusVadStream(int i, int i2, float f, Function1 function1, Function0 function0, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, f, function1, function0, (i3 & 32) != 0 ? false : z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OpusVadStream.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/squady/silerovad/OpusVadStream$State;", "", "(Ljava/lang/String;I)V", "OPEN", "FINISHED", "CLOSED", "FAILED", "silero-vad_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    static final class State {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State OPEN = new State("OPEN", 0);
        public static final State FINISHED = new State("FINISHED", 1);
        public static final State CLOSED = new State("CLOSED", 2);
        public static final State FAILED = new State("FAILED", 3);

        private static final /* synthetic */ State[] $values() {
            return new State[]{OPEN, FINISHED, CLOSED, FAILED};
        }

        public static EnumEntries<State> getEntries() {
            return $ENTRIES;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }

        static {
            State[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private State(String str, int i) {
        }
    }

    /* renamed from: getResult, reason: from getter */
    public final OpusVadResult getSummary() {
        return this.summary;
    }

    public static /* synthetic */ List push$default(OpusVadStream opusVadStream, byte[] bArr, int i, int i2, int i3, Object obj) throws IOException {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length - i;
        }
        return opusVadStream.push(bArr, i, i2);
    }

    public final synchronized List<OpusVadFrame> push(final byte[] data, final int offset, final int length) throws IOException {
        Intrinsics.checkNotNullParameter(data, "data");
        if (offset < 0 || length < 0 || offset > data.length - length) {
            throw new IllegalArgumentException("Invalid input byte range".toString());
        }
        return collect(new Function0<Unit>() { // from class: com.squady.silerovad.OpusVadStream$push$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                byte[] bArr;
                int i;
                byte[] bArr2;
                int i2;
                int i3;
                int i4;
                byte[] bArr3;
                byte[] bArr4;
                int i5 = offset;
                int i6 = length + i5;
                boolean z = false;
                while (i5 < i6) {
                    this.checkInterrupted();
                    bArr = this.packet;
                    int length2 = bArr.length;
                    i = this.pendingBytes;
                    int min = Math.min(i6 - i5, length2 - i);
                    byte[] bArr5 = data;
                    bArr2 = this.packet;
                    i2 = this.pendingBytes;
                    int i7 = i5 + min;
                    ArraysKt.copyInto(bArr5, bArr2, i2, i5, i7);
                    OpusVadStream opusVadStream = this;
                    i3 = opusVadStream.pendingBytes;
                    opusVadStream.pendingBytes = i3 + min;
                    i4 = this.pendingBytes;
                    bArr3 = this.packet;
                    if (i4 == bArr3.length) {
                        RawOpusPacketReader.Companion companion = RawOpusPacketReader.INSTANCE;
                        bArr4 = this.packet;
                        this.queuePacket(companion.durationSamples$silero_vad_release(bArr4));
                        this.pendingBytes = 0;
                        z = true;
                    }
                    i5 = i7;
                }
                this.drainAvailable(z ? 10000L : 0L);
            }
        });
    }

    public final synchronized List<OpusVadFrame> poll() throws IOException {
        return collect(new Function0<Unit>() { // from class: com.squady.silerovad.OpusVadStream$poll$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                OpusVadStream.this.drainAvailable(10000L);
            }
        });
    }

    public final synchronized List<OpusVadFrame> finish() throws IOException {
        checkWorker();
        if (this.state == State.FINISHED) {
            return CollectionsKt.emptyList();
        }
        return collect(new Function0<Unit>() { // from class: com.squady.silerovad.OpusVadStream$finish$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX WARN: Incorrect condition in loop: B:7:0x0041 */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void invoke2() {
                /*
                    r11 = this;
                    com.squady.silerovad.OpusVadStream r0 = com.squady.silerovad.OpusVadStream.this
                    int r0 = com.squady.silerovad.OpusVadStream.access$getPendingBytes$p(r0)
                    if (r0 != 0) goto L8b
                    com.squady.silerovad.OpusVadStream r0 = com.squady.silerovad.OpusVadStream.this
                    long r0 = com.squady.silerovad.OpusVadStream.access$getQueuedSamples$p(r0)
                    r2 = 0
                    int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                    if (r0 <= 0) goto L7e
                    com.squady.silerovad.OpusVadStream r0 = com.squady.silerovad.OpusVadStream.this
                    int r5 = com.squady.silerovad.OpusVadStream.access$acquireInput(r0)
                    com.squady.silerovad.OpusVadStream r0 = com.squady.silerovad.OpusVadStream.this
                    android.media.MediaCodec r4 = com.squady.silerovad.OpusVadStream.access$getCodec$p(r0)
                    com.squady.silerovad.OpusVadStream r0 = com.squady.silerovad.OpusVadStream.this
                    long r0 = com.squady.silerovad.OpusVadStream.access$getQueuedSamples$p(r0)
                    r6 = 1000000(0xf4240, float:1.401298E-39)
                    long r6 = (long) r6
                    long r0 = r0 * r6
                    r6 = 48000(0xbb80, float:6.7262E-41)
                    long r6 = (long) r6
                    long r8 = r0 / r6
                    r10 = 4
                    r6 = 0
                    r7 = 0
                    r4.queueInputBuffer(r5, r6, r7, r8, r10)
                    long r0 = android.os.SystemClock.elapsedRealtime()
                L3b:
                    com.squady.silerovad.OpusVadStream r4 = com.squady.silerovad.OpusVadStream.this
                    boolean r4 = com.squady.silerovad.OpusVadStream.access$getOutputEnded$p(r4)
                    if (r4 != 0) goto L5c
                    com.squady.silerovad.OpusVadStream r4 = com.squady.silerovad.OpusVadStream.this
                    com.squady.silerovad.OpusVadStream.access$checkInterrupted(r4)
                    com.squady.silerovad.OpusVadStream r4 = com.squady.silerovad.OpusVadStream.this
                    r5 = 10000(0x2710, double:4.9407E-320)
                    boolean r4 = com.squady.silerovad.OpusVadStream.access$drainAvailable(r4, r5)
                    if (r4 == 0) goto L56
                    long r0 = android.os.SystemClock.elapsedRealtime()
                L56:
                    com.squady.silerovad.OpusVadStream r4 = com.squady.silerovad.OpusVadStream.this
                    com.squady.silerovad.OpusVadStream.access$checkProgress(r4, r0)
                    goto L3b
                L5c:
                    com.squady.silerovad.OpusVadStream r0 = com.squady.silerovad.OpusVadStream.this
                    com.squady.silerovad.OpusPcmConverter r0 = com.squady.silerovad.OpusVadStream.access$getConverter$p(r0)
                    java.lang.String r1 = "Opus stream contains no decoded audio"
                    if (r0 == 0) goto L78
                    r0.finish()
                    long r4 = r0.getSampleCount()
                    int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                    if (r0 == 0) goto L72
                    goto L7e
                L72:
                    java.io.IOException r0 = new java.io.IOException
                    r0.<init>(r1)
                    throw r0
                L78:
                    java.io.IOException r0 = new java.io.IOException
                    r0.<init>(r1)
                    throw r0
                L7e:
                    com.squady.silerovad.OpusVadStream r0 = com.squady.silerovad.OpusVadStream.this
                    com.squady.silerovad.OpusVadStream.access$releaseResources(r0)
                    com.squady.silerovad.OpusVadStream r0 = com.squady.silerovad.OpusVadStream.this
                    com.squady.silerovad.OpusVadStream$State r1 = com.squady.silerovad.OpusVadStream.State.FINISHED
                    com.squady.silerovad.OpusVadStream.access$setState$p(r0, r1)
                    return
                L8b:
                    java.io.EOFException r0 = new java.io.EOFException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    java.lang.String r2 = "Incomplete raw Opus packet: "
                    r1.<init>(r2)
                    com.squady.silerovad.OpusVadStream r2 = com.squady.silerovad.OpusVadStream.this
                    int r2 = com.squady.silerovad.OpusVadStream.access$getPendingBytes$p(r2)
                    java.lang.StringBuilder r1 = r1.append(r2)
                    java.lang.String r2 = " of "
                    java.lang.StringBuilder r1 = r1.append(r2)
                    com.squady.silerovad.OpusVadStream r2 = com.squady.silerovad.OpusVadStream.this
                    byte[] r2 = com.squady.silerovad.OpusVadStream.access$getPacket$p(r2)
                    int r2 = r2.length
                    java.lang.StringBuilder r1 = r1.append(r2)
                    java.lang.String r2 = " bytes"
                    java.lang.StringBuilder r1 = r1.append(r2)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.squady.silerovad.OpusVadStream$finish$1.invoke2():void");
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        checkWorker();
        if (this.resourcesReleased) {
            return;
        }
        this.state = State.CLOSED;
        releaseResources();
    }

    private final List<OpusVadFrame> collect(Function0<Unit> operation) {
        checkWorker();
        if (this.state != State.OPEN) {
            throw new IllegalStateException(("Opus stream is " + this.state + "; create a new session").toString());
        }
        ArrayList arrayList = new ArrayList();
        this.emitted = arrayList;
        try {
            checkInterrupted();
            operation.invoke();
            return arrayList;
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void queuePacket(int samples) {
        int acquireInput = acquireInput();
        ByteBuffer inputBuffer = this.codec.getInputBuffer(acquireInput);
        if (inputBuffer == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        Intrinsics.checkNotNullExpressionValue(inputBuffer, "checkNotNull(...)");
        inputBuffer.clear();
        int remaining = inputBuffer.remaining();
        byte[] bArr = this.packet;
        if (remaining < bArr.length) {
            throw new IllegalArgumentException("Opus packet exceeds decoder input capacity".toString());
        }
        inputBuffer.put(bArr);
        this.codec.queueInputBuffer(acquireInput, 0, this.packet.length, (this.queuedSamples * 1000000) / OpusUtil.SAMPLE_RATE, 0);
        this.queuedSamples += samples;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int acquireInput() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            checkInterrupted();
            int dequeueInputBuffer = this.codec.dequeueInputBuffer(0L);
            if (dequeueInputBuffer >= 0) {
                return dequeueInputBuffer;
            }
            if (drainAvailable(10000L)) {
                elapsedRealtime = SystemClock.elapsedRealtime();
            }
            checkProgress(elapsedRealtime);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean drainAvailable(long timeoutUs) {
        boolean z = false;
        while (!this.outputEnded) {
            checkInterrupted();
            int dequeueOutputBuffer = this.codec.dequeueOutputBuffer(this.info, timeoutUs);
            if (dequeueOutputBuffer == -2) {
                MediaFormat outputFormat = this.codec.getOutputFormat();
                Intrinsics.checkNotNullExpressionValue(outputFormat, "getOutputFormat(...)");
                applyFormat(outputFormat);
            } else {
                if (dequeueOutputBuffer == -1) {
                    break;
                }
                if (dequeueOutputBuffer >= 0) {
                    try {
                        if (this.info.size > 0 && (this.info.flags & 2) == 0) {
                            if (this.converter == null) {
                                MediaFormat outputFormat2 = this.codec.getOutputFormat();
                                Intrinsics.checkNotNullExpressionValue(outputFormat2, "getOutputFormat(...)");
                                applyFormat(outputFormat2);
                            }
                            ByteBuffer outputBuffer = this.codec.getOutputBuffer(dequeueOutputBuffer);
                            if (outputBuffer == null) {
                                throw new IllegalStateException("Required value was null.".toString());
                            }
                            Intrinsics.checkNotNullExpressionValue(outputBuffer, "checkNotNull(...)");
                            outputBuffer.position(this.info.offset);
                            outputBuffer.limit(this.info.offset + this.info.size);
                            OpusPcmConverter opusPcmConverter = this.converter;
                            if (opusPcmConverter == null) {
                                throw new IllegalStateException("Required value was null.".toString());
                            }
                            opusPcmConverter.consume(outputBuffer);
                        }
                        this.outputEnded = (this.info.flags & 4) != 0;
                    } finally {
                        this.codec.releaseOutputBuffer(dequeueOutputBuffer, false);
                    }
                } else {
                    continue;
                }
            }
            timeoutUs = 0;
            z = true;
        }
        return z;
    }

    private final void applyFormat(MediaFormat format) {
        int integer = format.containsKey("pcm-encoding") ? format.getInteger("pcm-encoding") : 2;
        if (integer != 2 && integer != 4) {
            throw new IllegalArgumentException(("Unsupported Opus decoder PCM encoding: " + integer).toString());
        }
        Triple<Integer, Integer, Integer> triple = new Triple<>(Integer.valueOf(format.getInteger("sample-rate")), Integer.valueOf(format.getInteger("channel-count")), Integer.valueOf(integer));
        Triple<Integer, Integer, Integer> triple2 = this.outputDescription;
        if (triple2 != null && !Intrinsics.areEqual(triple2, triple)) {
            throw new IllegalArgumentException("Changing Opus output format is not supported".toString());
        }
        if (this.converter == null) {
            this.outputDescription = triple;
            this.converter = new OpusPcmConverter(triple.getFirst().intValue(), triple.getSecond().intValue(), integer == 4, new Function1<byte[], Unit>() { // from class: com.squady.silerovad.OpusVadStream$applyFormat$3
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(byte[] bArr) {
                    invoke2(bArr);
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Type inference failed for: r5v0 */
                /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r5v5 */
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(byte[] frame) {
                    Function1 function1;
                    OpusPcmConverter opusPcmConverter;
                    float f;
                    List list;
                    long j;
                    boolean z;
                    byte[] bArr;
                    long j2;
                    OpusVadResult opusVadResult;
                    long j3;
                    Intrinsics.checkNotNullParameter(frame, "frame");
                    function1 = OpusVadStream.this.infer;
                    float floatValue = ((Number) function1.invoke(frame)).floatValue();
                    if (!Float.isInfinite(floatValue) && !Float.isNaN(floatValue) && 0.0f <= floatValue && floatValue <= 1.0f) {
                        opusPcmConverter = OpusVadStream.this.converter;
                        if (opusPcmConverter != null) {
                            int frameSampleCount = opusPcmConverter.getFrameSampleCount();
                            f = OpusVadStream.this.speechThreshold;
                            ?? r5 = floatValue >= f ? 1 : 0;
                            list = OpusVadStream.this.emitted;
                            if (list != null) {
                                j = OpusVadStream.this.processedSamples;
                                z = OpusVadStream.this.includePcm;
                                if (z) {
                                    bArr = Arrays.copyOf(frame, frameSampleCount * 2);
                                    Intrinsics.checkNotNullExpressionValue(bArr, "copyOf(...)");
                                } else {
                                    bArr = null;
                                }
                                list.add(new OpusVadFrame(floatValue, r5, j, frameSampleCount, bArr));
                                OpusVadStream opusVadStream = OpusVadStream.this;
                                j2 = opusVadStream.processedSamples;
                                opusVadStream.processedSamples = j2 + frameSampleCount;
                                opusVadResult = OpusVadStream.this.summary;
                                OpusVadStream opusVadStream2 = OpusVadStream.this;
                                boolean z2 = opusVadResult.getHasSpeech() || r5 != 0;
                                float max = Math.max(opusVadResult.getMaxProbability(), floatValue);
                                long frameCount = opusVadResult.getFrameCount() + 1;
                                long speechFrameCount = opusVadResult.getSpeechFrameCount() + ((long) r5);
                                j3 = OpusVadStream.this.processedSamples;
                                opusVadStream2.summary = new OpusVadResult(z2, max, frameCount, speechFrameCount, (j3 * 1000) / 16000);
                                return;
                            }
                            throw new IllegalStateException("Required value was null.".toString());
                        }
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    throw new IllegalStateException(("silero_vad_process failed: " + floatValue).toString());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void releaseResources() {
        if (this.resourcesReleased) {
            return;
        }
        this.resourcesReleased = true;
        try {
            this.codec.release();
        } finally {
            this.releaseVad.invoke();
        }
    }

    private final void checkWorker() {
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            throw new IllegalStateException("Opus stream operations must run on a worker thread".toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkInterrupted() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("Opus stream interrupted");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkProgress(long lastProgress) {
        if (SystemClock.elapsedRealtime() - lastProgress > 5000) {
            throw new IOException("Opus decoder made no progress for 5 seconds");
        }
    }
}
