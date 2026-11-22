package io.livekit.android.audio;

import androidx.compose.ui.layout.LayoutKt;
import com.alipay.sdk.m.p.a;
import com.iflytek.cloud.SpeechEvent;
import io.livekit.android.util.LKLog;
import io.livekit.android.util.LoggingLevel;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: MixerAudioBufferCallback.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\tH\u0002J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u000bH\u0002J6\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\rJ:\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\rH&¨\u0006\u0019"}, d2 = {"Lio/livekit/android/audio/MixerAudioBufferCallback;", "Lio/livekit/android/audio/AudioBufferCallback;", "()V", "mixByteBuffers", "", "original", "Ljava/nio/ByteBuffer;", "addBuffer", "mixFloatBuffers", "Ljava/nio/FloatBuffer;", "mixShortBuffers", "Ljava/nio/ShortBuffer;", "onBuffer", "", SpeechEvent.KEY_EVENT_TTS_BUFFER, "audioFormat", "", "channelCount", "sampleRate", "bytesRead", "captureTimeNs", "onBufferRequest", "Lio/livekit/android/audio/MixerAudioBufferCallback$BufferResponse;", "originalBuffer", "BufferResponse", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class MixerAudioBufferCallback implements AudioBufferCallback {
    public abstract BufferResponse onBufferRequest(ByteBuffer originalBuffer, int audioFormat, int channelCount, int sampleRate, int bytesRead, long captureTimeNs);

    /* compiled from: MixerAudioBufferCallback.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lio/livekit/android/audio/MixerAudioBufferCallback$BufferResponse;", "", "byteBuffer", "Ljava/nio/ByteBuffer;", "captureTimeNs", "", "(Ljava/nio/ByteBuffer;Ljava/lang/Long;)V", "getByteBuffer", "()Ljava/nio/ByteBuffer;", "getCaptureTimeNs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BufferResponse {
        private final ByteBuffer byteBuffer;
        private final Long captureTimeNs;

        /* JADX WARN: Multi-variable type inference failed */
        public BufferResponse() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public BufferResponse(ByteBuffer byteBuffer, Long l) {
            this.byteBuffer = byteBuffer;
            this.captureTimeNs = l;
        }

        public /* synthetic */ BufferResponse(ByteBuffer byteBuffer, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : byteBuffer, (i & 2) != 0 ? null : l);
        }

        public final ByteBuffer getByteBuffer() {
            return this.byteBuffer;
        }

        public final Long getCaptureTimeNs() {
            return this.captureTimeNs;
        }
    }

    @Override // io.livekit.android.audio.AudioBufferCallback
    public final long onBuffer(ByteBuffer buffer, int audioFormat, int channelCount, int sampleRate, int bytesRead, long captureTimeNs) {
        Long captureTimeNs2;
        LKLog.Logger logger;
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        BufferResponse onBufferRequest = onBufferRequest(buffer, audioFormat, channelCount, sampleRate, bytesRead, captureTimeNs);
        ByteBuffer byteBuffer = onBufferRequest != null ? onBufferRequest.getByteBuffer() : null;
        if (byteBuffer != null) {
            buffer.order(ByteOrder.nativeOrder()).position(0);
            byteBuffer.order(ByteOrder.nativeOrder()).position(0);
            if (audioFormat == 1 || audioFormat == 2) {
                ShortBuffer asShortBuffer = buffer.asShortBuffer();
                Intrinsics.checkNotNullExpressionValue(asShortBuffer, "asShortBuffer(...)");
                ShortBuffer asShortBuffer2 = byteBuffer.asShortBuffer();
                Intrinsics.checkNotNullExpressionValue(asShortBuffer2, "asShortBuffer(...)");
                mixShortBuffers(asShortBuffer, asShortBuffer2);
            } else if (audioFormat == 3) {
                mixByteBuffers(buffer, byteBuffer);
            } else if (audioFormat == 4) {
                FloatBuffer asFloatBuffer = buffer.asFloatBuffer();
                Intrinsics.checkNotNullExpressionValue(asFloatBuffer, "asFloatBuffer(...)");
                FloatBuffer asFloatBuffer2 = byteBuffer.asFloatBuffer();
                Intrinsics.checkNotNullExpressionValue(asFloatBuffer2, "asFloatBuffer(...)");
                mixFloatBuffers(asFloatBuffer, asFloatBuffer2);
            } else {
                LKLog.Companion companion = LKLog.INSTANCE;
                LoggingLevel loggingLevel = LoggingLevel.WARN;
                if (loggingLevel.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && (logger = companion.getLogger()) != null) {
                    logger.log(loggingLevel, null, "Unsupported audio format: " + audioFormat);
                }
            }
        }
        if (captureTimeNs != 0) {
            return captureTimeNs;
        }
        if (onBufferRequest == null || (captureTimeNs2 = onBufferRequest.getCaptureTimeNs()) == null) {
            return 0L;
        }
        return captureTimeNs2.longValue();
    }

    private final void mixByteBuffers(ByteBuffer original, ByteBuffer addBuffer) {
        int min = Math.min(original.capacity(), addBuffer.capacity());
        if (min <= 0) {
            return;
        }
        for (int i = 0; i < min; i++) {
            original.put(i, (byte) RangesKt.coerceIn(original.get(i) + addBuffer.get(i), a.g, 127));
        }
    }

    private final void mixShortBuffers(ShortBuffer original, ShortBuffer addBuffer) {
        int min = Math.min(original.capacity(), addBuffer.capacity());
        if (min <= 0) {
            return;
        }
        for (int i = 0; i < min; i++) {
            original.put(i, (short) RangesKt.coerceIn(original.get(i) + addBuffer.get(i), -32768, LayoutKt.LargeDimension));
        }
    }

    private final void mixFloatBuffers(FloatBuffer original, FloatBuffer addBuffer) {
        int min = Math.min(original.capacity(), addBuffer.capacity());
        if (min <= 0) {
            return;
        }
        for (int i = 0; i < min; i++) {
            original.put(i, RangesKt.coerceIn(original.get(i) + addBuffer.get(i), -1.0f, 1.0f));
        }
    }
}
