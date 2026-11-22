package io.livekit.android.room.track.video;

import io.nats.client.support.ApiConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import livekit.org.webrtc.VideoFrame;
import livekit.org.webrtc.VideoProcessor;
import livekit.org.webrtc.VideoSink;

/* compiled from: ChainVideoProcessor.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0004J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0017J\b\u0010\u0015\u001a\u00020\u000fH\u0017J\u0010\u0010\u0016\u001a\u00020\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nR(\u0010\u0004\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lio/livekit/android/room/track/video/ChainVideoProcessor;", "Llivekit/org/webrtc/VideoProcessor;", "()V", "value", "childVideoProcessor", "getChildVideoProcessor", "()Llivekit/org/webrtc/VideoProcessor;", "setChildVideoProcessor", "(Llivekit/org/webrtc/VideoProcessor;)V", "<set-?>", "Llivekit/org/webrtc/VideoSink;", "videoSink", "getVideoSink", "()Llivekit/org/webrtc/VideoSink;", "continueChain", "", "frame", "Llivekit/org/webrtc/VideoFrame;", "onCapturerStarted", ApiConstants.STARTED, "", "onCapturerStopped", "setSink", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class ChainVideoProcessor implements VideoProcessor {
    private VideoProcessor childVideoProcessor;
    private VideoSink videoSink;

    public final VideoSink getVideoSink() {
        return this.videoSink;
    }

    public final VideoProcessor getChildVideoProcessor() {
        return this.childVideoProcessor;
    }

    public final void setChildVideoProcessor(VideoProcessor videoProcessor) {
        if (videoProcessor != null) {
            videoProcessor.setSink(this.videoSink);
        }
        this.childVideoProcessor = videoProcessor;
    }

    @Override // livekit.org.webrtc.CapturerObserver
    public void onCapturerStarted(boolean started) {
        VideoProcessor videoProcessor = this.childVideoProcessor;
        if (videoProcessor != null) {
            videoProcessor.onCapturerStarted(started);
        }
    }

    @Override // livekit.org.webrtc.CapturerObserver
    public void onCapturerStopped() {
        VideoProcessor videoProcessor = this.childVideoProcessor;
        if (videoProcessor != null) {
            videoProcessor.onCapturerStopped();
        }
    }

    @Override // livekit.org.webrtc.VideoProcessor
    public final void setSink(VideoSink videoSink) {
        VideoProcessor videoProcessor = this.childVideoProcessor;
        if (videoProcessor != null) {
            videoProcessor.setSink(videoSink);
        }
        this.videoSink = videoSink;
    }

    protected final void continueChain(VideoFrame frame) {
        Intrinsics.checkNotNullParameter(frame, "frame");
        VideoProcessor videoProcessor = this.childVideoProcessor;
        if (videoProcessor != null) {
            videoProcessor.onFrameCaptured(frame);
            return;
        }
        VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            videoSink.onFrame(frame);
        }
    }
}
