package livekit.org.webrtc;

import livekit.org.webrtc.VideoFrame;
import livekit.org.webrtc.VideoProcessor;

/* loaded from: classes8.dex */
class NativeCapturerObserver implements CapturerObserver {
    private final NativeAndroidVideoTrackSource nativeAndroidVideoTrackSource;

    public NativeCapturerObserver(long nativeSource) {
        this.nativeAndroidVideoTrackSource = new NativeAndroidVideoTrackSource(nativeSource);
    }

    @Override // livekit.org.webrtc.CapturerObserver
    public void onCapturerStarted(boolean success) {
        this.nativeAndroidVideoTrackSource.setState(success);
    }

    @Override // livekit.org.webrtc.CapturerObserver
    public void onCapturerStopped() {
        this.nativeAndroidVideoTrackSource.setState(false);
    }

    @Override // livekit.org.webrtc.CapturerObserver
    public void onFrameCaptured(VideoFrame frame) {
        VideoProcessor.FrameAdaptationParameters adaptFrame = this.nativeAndroidVideoTrackSource.adaptFrame(frame);
        if (adaptFrame == null) {
            return;
        }
        VideoFrame.Buffer cropAndScale = frame.getBuffer().cropAndScale(adaptFrame.cropX, adaptFrame.cropY, adaptFrame.cropWidth, adaptFrame.cropHeight, adaptFrame.scaleWidth, adaptFrame.scaleHeight);
        this.nativeAndroidVideoTrackSource.onFrameCaptured(new VideoFrame(cropAndScale, frame.getRotation(), adaptFrame.timestampNs));
        cropAndScale.release();
    }
}
