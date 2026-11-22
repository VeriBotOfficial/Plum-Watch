package io.livekit.android.room.track.video;

import android.content.Context;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import livekit.org.webrtc.CapturerObserver;
import livekit.org.webrtc.SurfaceTextureHelper;
import livekit.org.webrtc.VideoCapturer;
import livekit.org.webrtc.VideoFrame;

/* compiled from: VideoFrameCapturer.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016J\"\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u000e\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0019J \u0010\u001a\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016J\b\u0010\u001b\u001a\u00020\nH\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u001c"}, d2 = {"Lio/livekit/android/room/track/video/VideoFrameCapturer;", "Llivekit/org/webrtc/VideoCapturer;", "()V", "capturerObserver", "Llivekit/org/webrtc/CapturerObserver;", "getCapturerObserver", "()Llivekit/org/webrtc/CapturerObserver;", "setCapturerObserver", "(Llivekit/org/webrtc/CapturerObserver;)V", "changeCaptureFormat", "", "width", "", "height", "framerate", "dispose", MobileAdsBridgeBase.initializeMethodName, "helper", "Llivekit/org/webrtc/SurfaceTextureHelper;", "context", "Landroid/content/Context;", "isScreencast", "", "pushVideoFrame", "frame", "Llivekit/org/webrtc/VideoFrame;", "startCapture", "stopCapture", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public class VideoFrameCapturer implements VideoCapturer {
    private CapturerObserver capturerObserver;

    @Override // livekit.org.webrtc.VideoCapturer
    public void changeCaptureFormat(int width, int height, int framerate) {
    }

    @Override // livekit.org.webrtc.VideoCapturer
    public void dispose() {
    }

    @Override // livekit.org.webrtc.VideoCapturer
    public boolean isScreencast() {
        return false;
    }

    public final CapturerObserver getCapturerObserver() {
        return this.capturerObserver;
    }

    public final void setCapturerObserver(CapturerObserver capturerObserver) {
        this.capturerObserver = capturerObserver;
    }

    @Override // livekit.org.webrtc.VideoCapturer
    public void initialize(SurfaceTextureHelper helper, Context context, CapturerObserver capturerObserver) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(capturerObserver, "capturerObserver");
        this.capturerObserver = capturerObserver;
    }

    @Override // livekit.org.webrtc.VideoCapturer
    public void startCapture(int width, int height, int framerate) {
        CapturerObserver capturerObserver = this.capturerObserver;
        if (capturerObserver != null) {
            capturerObserver.onCapturerStarted(true);
        }
    }

    @Override // livekit.org.webrtc.VideoCapturer
    public void stopCapture() {
        CapturerObserver capturerObserver = this.capturerObserver;
        if (capturerObserver != null) {
            capturerObserver.onCapturerStopped();
        }
    }

    public final void pushVideoFrame(VideoFrame frame) {
        Intrinsics.checkNotNullParameter(frame, "frame");
        CapturerObserver capturerObserver = this.capturerObserver;
        if (capturerObserver != null) {
            capturerObserver.onFrameCaptured(frame);
        }
    }
}
