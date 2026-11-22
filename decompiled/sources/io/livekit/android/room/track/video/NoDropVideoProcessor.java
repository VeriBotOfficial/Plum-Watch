package io.livekit.android.room.track.video;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import livekit.org.webrtc.VideoFrame;
import livekit.org.webrtc.VideoProcessor;

/* compiled from: NoDropVideoProcessor.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R \u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Lio/livekit/android/room/track/video/NoDropVideoProcessor;", "Llivekit/org/webrtc/VideoProcessor;", "()V", "allowDropping", "", "getAllowDropping$annotations", "getAllowDropping", "()Z", "setAllowDropping", "(Z)V", "onFrameCaptured", "", "frame", "Llivekit/org/webrtc/VideoFrame;", "parameters", "Llivekit/org/webrtc/VideoProcessor$FrameAdaptationParameters;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class NoDropVideoProcessor implements VideoProcessor {
    private boolean allowDropping;

    public static /* synthetic */ void getAllowDropping$annotations() {
    }

    public final boolean getAllowDropping() {
        return this.allowDropping;
    }

    public final void setAllowDropping(boolean z) {
        this.allowDropping = z;
    }

    @Override // livekit.org.webrtc.VideoProcessor
    public void onFrameCaptured(VideoFrame frame, VideoProcessor.FrameAdaptationParameters parameters) {
        Intrinsics.checkNotNullParameter(frame, "frame");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        if (this.allowDropping) {
            super.onFrameCaptured(frame, parameters);
            return;
        }
        VideoFrame applyFrameAdaptationParameters = VideoProcessor.applyFrameAdaptationParameters(frame, parameters);
        if (applyFrameAdaptationParameters != null) {
            onFrameCaptured(applyFrameAdaptationParameters);
            applyFrameAdaptationParameters.release();
        } else {
            onFrameCaptured(frame);
        }
    }
}
