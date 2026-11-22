package livekit.org.webrtc;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import livekit.org.webrtc.CameraEnumerationAndroid;

/* compiled from: Camera1Helper.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Llivekit/org/webrtc/Camera1Helper;", "", "()V", "Companion", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Camera1Helper {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: Camera1Helper.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006J\u0010\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u000f"}, d2 = {"Llivekit/org/webrtc/Camera1Helper$Companion;", "", "()V", "findClosestCaptureFormat", "Llivekit/org/webrtc/Size;", "cameraId", "", "width", "height", "getCameraId", "deviceName", "", "getSupportedFormats", "", "Llivekit/org/webrtc/CameraEnumerationAndroid$CaptureFormat;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final int getCameraId(String deviceName) {
            return Camera1Enumerator.getCameraIndex(deviceName);
        }

        public final List<CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(int cameraId) {
            List<CameraEnumerationAndroid.CaptureFormat> supportedFormats = Camera1Enumerator.getSupportedFormats(cameraId);
            Intrinsics.checkNotNullExpressionValue(supportedFormats, "getSupportedFormats(...)");
            return supportedFormats;
        }

        public final Size findClosestCaptureFormat(int cameraId, int width, int height) {
            List<CameraEnumerationAndroid.CaptureFormat> supportedFormats = getSupportedFormats(cameraId);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(supportedFormats, 10));
            for (CameraEnumerationAndroid.CaptureFormat captureFormat : supportedFormats) {
                arrayList.add(new Size(captureFormat.width, captureFormat.height));
            }
            Size closestSupportedSize = CameraEnumerationAndroid.getClosestSupportedSize(arrayList, width, height);
            Intrinsics.checkNotNullExpressionValue(closestSupportedSize, "getClosestSupportedSize(...)");
            return closestSupportedSize;
        }
    }
}
