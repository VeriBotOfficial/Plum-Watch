package livekit.org.webrtc;

import android.content.Context;
import livekit.org.webrtc.CameraSession;
import livekit.org.webrtc.CameraVideoCapturer;

/* loaded from: classes8.dex */
public class Camera1Capturer extends CameraCapturer {
    private final boolean captureToTexture;

    @Override // livekit.org.webrtc.CameraCapturer, livekit.org.webrtc.VideoCapturer
    public /* bridge */ /* synthetic */ void changeCaptureFormat(int width, int height, int framerate) {
        super.changeCaptureFormat(width, height, framerate);
    }

    @Override // livekit.org.webrtc.CameraCapturer, livekit.org.webrtc.VideoCapturer
    public /* bridge */ /* synthetic */ void dispose() {
        super.dispose();
    }

    @Override // livekit.org.webrtc.CameraCapturer, livekit.org.webrtc.VideoCapturer
    public /* bridge */ /* synthetic */ void initialize(SurfaceTextureHelper surfaceTextureHelper, Context applicationContext, CapturerObserver capturerObserver) {
        super.initialize(surfaceTextureHelper, applicationContext, capturerObserver);
    }

    @Override // livekit.org.webrtc.CameraCapturer, livekit.org.webrtc.VideoCapturer
    public /* bridge */ /* synthetic */ boolean isScreencast() {
        return super.isScreencast();
    }

    @Override // livekit.org.webrtc.CameraCapturer
    public /* bridge */ /* synthetic */ void printStackTrace() {
        super.printStackTrace();
    }

    @Override // livekit.org.webrtc.CameraCapturer, livekit.org.webrtc.VideoCapturer
    public /* bridge */ /* synthetic */ void startCapture(int width, int height, int framerate) {
        super.startCapture(width, height, framerate);
    }

    @Override // livekit.org.webrtc.CameraCapturer, livekit.org.webrtc.VideoCapturer
    public /* bridge */ /* synthetic */ void stopCapture() {
        super.stopCapture();
    }

    @Override // livekit.org.webrtc.CameraCapturer, livekit.org.webrtc.CameraVideoCapturer
    public /* bridge */ /* synthetic */ void switchCamera(final CameraVideoCapturer.CameraSwitchHandler switchEventsHandler) {
        super.switchCamera(switchEventsHandler);
    }

    @Override // livekit.org.webrtc.CameraCapturer, livekit.org.webrtc.CameraVideoCapturer
    public /* bridge */ /* synthetic */ void switchCamera(final CameraVideoCapturer.CameraSwitchHandler switchEventsHandler, final String cameraName) {
        super.switchCamera(switchEventsHandler, cameraName);
    }

    public Camera1Capturer(String cameraName, CameraVideoCapturer.CameraEventsHandler eventsHandler, boolean captureToTexture) {
        super(cameraName, eventsHandler, new Camera1Enumerator(captureToTexture));
        this.captureToTexture = captureToTexture;
    }

    @Override // livekit.org.webrtc.CameraCapturer
    protected void createCameraSession(CameraSession.CreateSessionCallback createSessionCallback, CameraSession.Events events, Context applicationContext, SurfaceTextureHelper surfaceTextureHelper, String cameraName, int width, int height, int framerate) {
        Camera1Session.create(createSessionCallback, events, this.captureToTexture, applicationContext, surfaceTextureHelper, cameraName, width, height, framerate);
    }
}
