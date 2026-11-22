package livekit.org.webrtc;

import android.content.Context;
import android.hardware.camera2.CameraManager;
import com.baidu.ar.arplay.core.pixel.PixelReadParams;
import livekit.org.webrtc.CameraSession;
import livekit.org.webrtc.CameraVideoCapturer;

/* loaded from: classes8.dex */
public class Camera2Capturer extends CameraCapturer {
    private final CameraManager cameraManager;

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

    public Camera2Capturer(Context context, String cameraName, CameraVideoCapturer.CameraEventsHandler eventsHandler) {
        super(cameraName, eventsHandler, new Camera2Enumerator(context));
        this.cameraManager = (CameraManager) context.getSystemService(PixelReadParams.DEFAULT_FILTER_ID);
    }

    @Override // livekit.org.webrtc.CameraCapturer
    protected void createCameraSession(CameraSession.CreateSessionCallback createSessionCallback, CameraSession.Events events, Context applicationContext, SurfaceTextureHelper surfaceTextureHelper, String cameraName, int width, int height, int framerate) {
        Camera2Session.create(createSessionCallback, events, applicationContext, this.cameraManager, surfaceTextureHelper, cameraName, width, height, framerate);
    }
}
