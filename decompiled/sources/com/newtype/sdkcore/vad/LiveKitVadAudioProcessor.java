package com.newtype.sdkcore.vad;

import android.util.Log;
import com.facebook.react.uimanager.ViewProps;
import com.iflytek.cloud.SpeechEvent;
import io.livekit.android.audio.AudioProcessorInterface;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: LiveKitVadAudioProcessor.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0000\u0018\u0000 /2\u00020\u0001:\u0001/B?\u00126\u0010\u0002\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0003¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u0018\u001a\u00020\u000eH\u0016J \u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u0016H\u0016J\u000e\u0010 \u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eJ\"\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u0016H\u0002JF\u0010%\u001a\u0004\u0018\u00010\"2\u0006\u0010&\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u00162\u0006\u0010)\u001a\u00020\u00132\u0006\u0010*\u001a\u00020\u00162\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020-0,H\u0002J0\u0010.\u001a\u00020\n2\u0006\u0010)\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002R>\u0010\u0002\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/newtype/sdkcore/vad/LiveKitVadAudioProcessor;", "Lio/livekit/android/audio/AudioProcessorInterface;", "onPcmData", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "samples", "Lcom/newtype/sdkcore/vad/AudioCaptureFormat;", "format", "", "<init>", "(Lkotlin/jvm/functions/Function2;)V", ViewProps.ENABLED, "", "captureFormat", "callbackCount", "", "getName", "", "initializeAudioProcessing", "sampleRateHz", "", "numChannels", "isEnabled", "processAudio", "numBands", "numFrames", SpeechEvent.KEY_EVENT_TTS_BUFFER, "Ljava/nio/ByteBuffer;", "resetAudioProcessing", "newRate", "setEnabled", "decodeSamples", "Lcom/newtype/sdkcore/vad/DecodedAudioBuffer;", "frameSampleCount", "bandCount", "decodeExact", "sourceBuffer", "remainingBytes", "expectedSampleCount", "decodeType", "bytesPerSample", "reader", "Lkotlin/Function1;", "", "logFrameStats", "Companion", "newtypesdkcore_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class LiveKitVadAudioProcessor implements AudioProcessorInterface {
    private static final int DEFAULT_CHANNEL_COUNT = 1;
    private static final int DEFAULT_SAMPLE_RATE = 48000;
    private static final int FLOAT_BYTES = 4;
    private static final long PERIODIC_LOG_INTERVAL = 100;
    private static final int SHORT_BYTES = 2;
    private static final float SHORT_NORMALIZER = 32768.0f;
    private static final float SPEECH_RMS_HINT = 0.015f;
    private static final String TAG = "LiveKitVadProcessor";
    private long callbackCount;
    private volatile AudioCaptureFormat captureFormat;
    private volatile boolean enabled;
    private final Function2<float[], AudioCaptureFormat, Unit> onPcmData;

    /* JADX WARN: Multi-variable type inference failed */
    public LiveKitVadAudioProcessor(Function2<? super float[], ? super AudioCaptureFormat, Unit> onPcmData) {
        Intrinsics.checkNotNullParameter(onPcmData, "onPcmData");
        this.onPcmData = onPcmData;
        this.captureFormat = new AudioCaptureFormat(48000, 1);
    }

    @Override // io.livekit.android.audio.AudioProcessorInterface
    public String getName() {
        return "NewTypeVadProcessor";
    }

    @Override // io.livekit.android.audio.AudioProcessorInterface
    public void initializeAudioProcessing(int sampleRateHz, int numChannels) {
        this.captureFormat = new AudioCaptureFormat(sampleRateHz, RangesKt.coerceAtLeast(numChannels, 1));
        Log.d(TAG, "[VAD-PROC] init sampleRate=" + sampleRateHz + " channels=" + RangesKt.coerceAtLeast(numChannels, 1));
    }

    @Override // io.livekit.android.audio.AudioProcessorInterface
    /* renamed from: isEnabled, reason: from getter */
    public boolean getEnabled() {
        return this.enabled;
    }

    @Override // io.livekit.android.audio.AudioProcessorInterface
    public void processAudio(int numBands, int numFrames, ByteBuffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (this.enabled && numFrames > 0) {
            AudioCaptureFormat audioCaptureFormat = this.captureFormat;
            int coerceAtLeast = RangesKt.coerceAtLeast(audioCaptureFormat.getChannelCount(), 1);
            int coerceAtLeast2 = RangesKt.coerceAtLeast(numBands, 1);
            int i = numFrames * coerceAtLeast;
            if (i > 0) {
                ByteBuffer order = buffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
                Intrinsics.checkNotNull(order);
                DecodedAudioBuffer decodeSamples = decodeSamples(order, i, coerceAtLeast2);
                if (decodeSamples == null) {
                    Log.w(TAG, "[VAD-PROC] decode skipped bytes=" + buffer.remaining() + " frames=" + numFrames + " bands=" + coerceAtLeast2 + " channels=" + coerceAtLeast + " expectedFloat=" + (i * 4) + " expectedShort=" + (i * 2));
                    return;
                }
                float[] samples = decodeSamples.getSamples();
                this.callbackCount++;
                logFrameStats(decodeSamples.getDecodeType(), coerceAtLeast2, numFrames, samples, audioCaptureFormat);
                this.onPcmData.invoke(samples, audioCaptureFormat);
            }
        }
    }

    @Override // io.livekit.android.audio.AudioProcessorInterface
    public void resetAudioProcessing(int newRate) {
        this.captureFormat = AudioCaptureFormat.copy$default(this.captureFormat, newRate, 0, 2, null);
        Log.d(TAG, "[VAD-PROC] reset sampleRate=" + newRate);
    }

    public final void setEnabled(boolean enabled) {
        this.enabled = enabled;
        Log.d(TAG, "[VAD-PROC] enabled=" + enabled);
    }

    private final DecodedAudioBuffer decodeSamples(final ByteBuffer buffer, int frameSampleCount, int bandCount) {
        int remaining = buffer.remaining();
        DecodedAudioBuffer decodeExact = decodeExact(buffer, remaining, frameSampleCount, "float32", 4, new Function1() { // from class: com.newtype.sdkcore.vad.LiveKitVadAudioProcessor$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                float decodeSamples$lambda$1;
                decodeSamples$lambda$1 = LiveKitVadAudioProcessor.decodeSamples$lambda$1(buffer, (ByteBuffer) obj);
                return Float.valueOf(decodeSamples$lambda$1);
            }
        });
        if (decodeExact != null) {
            return decodeExact;
        }
        DecodedAudioBuffer decodeExact2 = decodeExact(buffer, remaining, frameSampleCount, "pcm16", 2, new Function1() { // from class: com.newtype.sdkcore.vad.LiveKitVadAudioProcessor$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                float decodeSamples$lambda$3;
                decodeSamples$lambda$3 = LiveKitVadAudioProcessor.decodeSamples$lambda$3(buffer, (ByteBuffer) obj);
                return Float.valueOf(decodeSamples$lambda$3);
            }
        });
        if (decodeExact2 != null) {
            return decodeExact2;
        }
        int i = frameSampleCount * bandCount;
        if (bandCount > 1) {
            DecodedAudioBuffer decodeExact3 = decodeExact(buffer, remaining, i, "float32-banded", 4, new Function1() { // from class: com.newtype.sdkcore.vad.LiveKitVadAudioProcessor$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    float decodeSamples$lambda$5;
                    decodeSamples$lambda$5 = LiveKitVadAudioProcessor.decodeSamples$lambda$5(buffer, (ByteBuffer) obj);
                    return Float.valueOf(decodeSamples$lambda$5);
                }
            });
            if (decodeExact3 != null) {
                float[] copyOf = Arrays.copyOf(decodeExact3.getSamples(), frameSampleCount);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
                return DecodedAudioBuffer.copy$default(decodeExact3, copyOf, null, 2, null);
            }
            DecodedAudioBuffer decodeExact4 = decodeExact(buffer, remaining, i, "pcm16-banded", 2, new Function1() { // from class: com.newtype.sdkcore.vad.LiveKitVadAudioProcessor$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    float decodeSamples$lambda$7;
                    decodeSamples$lambda$7 = LiveKitVadAudioProcessor.decodeSamples$lambda$7(buffer, (ByteBuffer) obj);
                    return Float.valueOf(decodeSamples$lambda$7);
                }
            });
            if (decodeExact4 != null) {
                float[] copyOf2 = Arrays.copyOf(decodeExact4.getSamples(), frameSampleCount);
                Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(...)");
                return DecodedAudioBuffer.copy$default(decodeExact4, copyOf2, null, 2, null);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float decodeSamples$lambda$1(ByteBuffer byteBuffer, ByteBuffer it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return byteBuffer.getFloat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float decodeSamples$lambda$3(ByteBuffer byteBuffer, ByteBuffer it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return byteBuffer.getShort() / SHORT_NORMALIZER;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float decodeSamples$lambda$5(ByteBuffer byteBuffer, ByteBuffer it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return byteBuffer.getFloat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float decodeSamples$lambda$7(ByteBuffer byteBuffer, ByteBuffer it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return byteBuffer.getShort() / SHORT_NORMALIZER;
    }

    private final DecodedAudioBuffer decodeExact(ByteBuffer sourceBuffer, int remainingBytes, int expectedSampleCount, String decodeType, int bytesPerSample, Function1<? super ByteBuffer, Float> reader) {
        if (expectedSampleCount <= 0 || remainingBytes != bytesPerSample * expectedSampleCount) {
            return null;
        }
        ByteBuffer order = sourceBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        float[] fArr = new float[expectedSampleCount];
        for (int i = 0; i < expectedSampleCount; i++) {
            Intrinsics.checkNotNull(order);
            fArr[i] = reader.invoke(order).floatValue();
        }
        return new DecodedAudioBuffer(fArr, decodeType);
    }

    private final void logFrameStats(String decodeType, int numBands, int numFrames, float[] samples, AudioCaptureFormat format) {
        if (samples.length == 0) {
            return;
        }
        float f = 0.0f;
        float f2 = 0.0f;
        for (float f3 : samples) {
            f += f3 * f3;
            f2 = Math.max(f2, Math.abs(f3));
        }
        float sqrt = (float) Math.sqrt(f / samples.length);
        long j = this.callbackCount;
        if (j <= 5 || j % 100 == 0 || (sqrt >= SPEECH_RMS_HINT && j % 10 == 0)) {
            Log.d(TAG, "[VAD-PROC] frame#" + j + " type=" + decodeType + " bands=" + numBands + " frames=" + numFrames + " sampleRate=" + format.getSampleRate() + " channels=" + format.getChannelCount() + " samples=" + samples.length + " rms=" + sqrt + " peak=" + f2 + " enabled=" + this.enabled);
        }
    }
}
