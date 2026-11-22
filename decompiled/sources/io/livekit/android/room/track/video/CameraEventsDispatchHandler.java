package io.livekit.android.room.track.video;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import livekit.org.webrtc.CameraVideoCapturer;

/* compiled from: CameraEventsDispatchHandler.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\u0006H\u0016J\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0001J\u000e\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0001R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lio/livekit/android/room/track/video/CameraEventsDispatchHandler;", "Llivekit/org/webrtc/CameraVideoCapturer$CameraEventsHandler;", "()V", "handlers", "Ljava/util/concurrent/CopyOnWriteArraySet;", "onCameraClosed", "", "onCameraDisconnected", "onCameraError", "errorDescription", "", "onCameraFreezed", "onCameraOpening", "cameraName", "onFirstFrameAvailable", "registerHandler", "handler", "unregisterHandler", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CameraEventsDispatchHandler implements CameraVideoCapturer.CameraEventsHandler {
    private final CopyOnWriteArraySet<CameraVideoCapturer.CameraEventsHandler> handlers = new CopyOnWriteArraySet<>();

    public final void registerHandler(CameraVideoCapturer.CameraEventsHandler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.handlers.add(handler);
    }

    public final void unregisterHandler(CameraVideoCapturer.CameraEventsHandler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.handlers.remove(handler);
    }

    @Override // livekit.org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public void onCameraError(String errorDescription) {
        Intrinsics.checkNotNullParameter(errorDescription, "errorDescription");
        Iterator<CameraVideoCapturer.CameraEventsHandler> it = this.handlers.iterator();
        while (it.hasNext()) {
            it.next().onCameraError(errorDescription);
        }
    }

    @Override // livekit.org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public void onCameraDisconnected() {
        Iterator<CameraVideoCapturer.CameraEventsHandler> it = this.handlers.iterator();
        while (it.hasNext()) {
            it.next().onCameraDisconnected();
        }
    }

    @Override // livekit.org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public void onCameraFreezed(String errorDescription) {
        Intrinsics.checkNotNullParameter(errorDescription, "errorDescription");
        Iterator<CameraVideoCapturer.CameraEventsHandler> it = this.handlers.iterator();
        while (it.hasNext()) {
            it.next().onCameraFreezed(errorDescription);
        }
    }

    @Override // livekit.org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public void onCameraOpening(String cameraName) {
        Intrinsics.checkNotNullParameter(cameraName, "cameraName");
        Iterator<CameraVideoCapturer.CameraEventsHandler> it = this.handlers.iterator();
        while (it.hasNext()) {
            it.next().onCameraOpening(cameraName);
        }
    }

    @Override // livekit.org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public void onFirstFrameAvailable() {
        Iterator<CameraVideoCapturer.CameraEventsHandler> it = this.handlers.iterator();
        while (it.hasNext()) {
            it.next().onFirstFrameAvailable();
        }
    }

    @Override // livekit.org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public void onCameraClosed() {
        Iterator<CameraVideoCapturer.CameraEventsHandler> it = this.handlers.iterator();
        while (it.hasNext()) {
            it.next().onCameraClosed();
        }
    }
}
