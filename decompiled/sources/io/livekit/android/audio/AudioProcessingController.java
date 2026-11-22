package io.livekit.android.audio;

import kotlin.Deprecated;
import kotlin.Metadata;

/* compiled from: AudioProcessingController.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0003H'J\u0010\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0003H'J\u0012\u0010\u001d\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000fH'J\u0012\u0010\u001f\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000fH'R\"\u0010\u0002\u001a\u00020\u00038g@&X§\u000e¢\u0006\u0012\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\u00020\u00038g@&X§\u000e¢\u0006\u0012\u0012\u0004\b\u000b\u0010\u0005\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR$\u0010\u000e\u001a\u0004\u0018\u00010\u000f8g@&X§\u000e¢\u0006\u0012\u0012\u0004\b\u0010\u0010\u0005\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0015\u001a\u0004\u0018\u00010\u000f8g@&X§\u000e¢\u0006\u0012\u0012\u0004\b\u0016\u0010\u0005\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014¨\u0006 "}, d2 = {"Lio/livekit/android/audio/AudioProcessingController;", "", "bypassCapturePostProcessing", "", "getBypassCapturePostProcessing$annotations", "()V", "getBypassCapturePostProcessing", "()Z", "setBypassCapturePostProcessing", "(Z)V", "bypassRenderPreProcessing", "getBypassRenderPreProcessing$annotations", "getBypassRenderPreProcessing", "setBypassRenderPreProcessing", "capturePostProcessor", "Lio/livekit/android/audio/AudioProcessorInterface;", "getCapturePostProcessor$annotations", "getCapturePostProcessor", "()Lio/livekit/android/audio/AudioProcessorInterface;", "setCapturePostProcessor", "(Lio/livekit/android/audio/AudioProcessorInterface;)V", "renderPreProcessor", "getRenderPreProcessor$annotations", "getRenderPreProcessor", "setRenderPreProcessor", "setBypassForCapturePostProcessing", "", "bypass", "setBypassForRenderPreProcessing", "setCapturePostProcessing", "processing", "setRenderPreProcessing", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AudioProcessingController {

    /* compiled from: AudioProcessingController.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void getBypassCapturePostProcessing$annotations() {
        }

        public static /* synthetic */ void getBypassRenderPreProcessing$annotations() {
        }

        public static /* synthetic */ void getCapturePostProcessor$annotations() {
        }

        public static /* synthetic */ void getRenderPreProcessor$annotations() {
        }
    }

    boolean getBypassCapturePostProcessing();

    boolean getBypassRenderPreProcessing();

    AudioProcessorInterface getCapturePostProcessor();

    AudioProcessorInterface getRenderPreProcessor();

    void setBypassCapturePostProcessing(boolean z);

    @Deprecated(message = "Use the bypassCapturePostProcessing variable directly instead")
    void setBypassForCapturePostProcessing(boolean bypass);

    @Deprecated(message = "Use the bypassRendererPreProcessing variable directly instead")
    void setBypassForRenderPreProcessing(boolean bypass);

    void setBypassRenderPreProcessing(boolean z);

    @Deprecated(message = "Use the capturePostProcessing variable directly instead")
    void setCapturePostProcessing(AudioProcessorInterface processing);

    void setCapturePostProcessor(AudioProcessorInterface audioProcessorInterface);

    @Deprecated(message = "Use the renderPreProcessing variable directly instead")
    void setRenderPreProcessing(AudioProcessorInterface processing);

    void setRenderPreProcessor(AudioProcessorInterface audioProcessorInterface);
}
