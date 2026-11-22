package livekit.org.webrtc;

import java.nio.ByteBuffer;

/* loaded from: classes8.dex */
public class ExternalAudioProcessingFactory implements AudioProcessingFactory {
    private long apmPtr = nativeGetDefaultApm();
    private long capturePostProcessingPtr = 0;
    private long renderPreProcessingPtr = 0;

    public interface AudioProcessing {
        void initialize(int sampleRateHz, int numChannels);

        void process(int numBands, int numFrames, ByteBuffer buffer);

        void reset(int newRate);
    }

    private static native void nativeDestroy();

    private static native long nativeGetDefaultApm();

    private static native void nativeSetBypassFlagForCapturePost(boolean bypass);

    private static native void nativeSetBypassFlagForRenderPre(boolean bypass);

    private static native long nativeSetCapturePostProcessing(AudioProcessing processing);

    private static native long nativeSetRenderPreProcessing(AudioProcessing processing);

    @Override // livekit.org.webrtc.AudioProcessingFactory
    public long createNative(long webrtcEnvRef) {
        if (this.apmPtr == 0) {
            this.apmPtr = nativeGetDefaultApm();
        }
        return this.apmPtr;
    }

    public void setCapturePostProcessing(AudioProcessing processing) {
        checkExternalAudioProcessorExists();
        long nativeSetCapturePostProcessing = nativeSetCapturePostProcessing(processing);
        long j = this.capturePostProcessingPtr;
        if (j != 0) {
            JniCommon.nativeReleaseRef(j);
            this.capturePostProcessingPtr = 0L;
        }
        this.capturePostProcessingPtr = nativeSetCapturePostProcessing;
    }

    public void setRenderPreProcessing(AudioProcessing processing) {
        checkExternalAudioProcessorExists();
        long nativeSetRenderPreProcessing = nativeSetRenderPreProcessing(processing);
        long j = this.renderPreProcessingPtr;
        if (j != 0) {
            JniCommon.nativeReleaseRef(j);
            this.renderPreProcessingPtr = 0L;
        }
        this.renderPreProcessingPtr = nativeSetRenderPreProcessing;
    }

    public void setBypassFlagForCapturePost(boolean bypass) {
        checkExternalAudioProcessorExists();
        nativeSetBypassFlagForCapturePost(bypass);
    }

    public void setBypassFlagForRenderPre(boolean bypass) {
        checkExternalAudioProcessorExists();
        nativeSetBypassFlagForRenderPre(bypass);
    }

    public void destroy() {
        checkExternalAudioProcessorExists();
        long j = this.renderPreProcessingPtr;
        if (j != 0) {
            JniCommon.nativeReleaseRef(j);
            this.renderPreProcessingPtr = 0L;
        }
        long j2 = this.capturePostProcessingPtr;
        if (j2 != 0) {
            JniCommon.nativeReleaseRef(j2);
            this.capturePostProcessingPtr = 0L;
        }
        nativeDestroy();
        this.apmPtr = 0L;
    }

    private void checkExternalAudioProcessorExists() {
        if (this.apmPtr == 0) {
            throw new IllegalStateException("ExternalAudioProcessor has been disposed.");
        }
    }
}
