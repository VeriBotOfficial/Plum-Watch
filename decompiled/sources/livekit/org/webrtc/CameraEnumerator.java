package livekit.org.webrtc;

import java.util.List;
import livekit.org.webrtc.CameraEnumerationAndroid;
import livekit.org.webrtc.CameraVideoCapturer;

/* loaded from: classes8.dex */
public interface CameraEnumerator {
    CameraVideoCapturer createCapturer(String deviceName, CameraVideoCapturer.CameraEventsHandler eventsHandler);

    String[] getDeviceNames();

    List<CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(String deviceName);

    boolean isBackFacing(String deviceName);

    boolean isFrontFacing(String deviceName);
}
