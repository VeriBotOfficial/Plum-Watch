package io.livekit.android.room.track;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LocalVideoTrackOptions.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\tHÆ\u0003J5\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lio/livekit/android/room/track/LocalVideoTrackOptions;", "", "isScreencast", "", "deviceId", "", "position", "Lio/livekit/android/room/track/CameraPosition;", "captureParams", "Lio/livekit/android/room/track/VideoCaptureParameter;", "(ZLjava/lang/String;Lio/livekit/android/room/track/CameraPosition;Lio/livekit/android/room/track/VideoCaptureParameter;)V", "getCaptureParams", "()Lio/livekit/android/room/track/VideoCaptureParameter;", "getDeviceId", "()Ljava/lang/String;", "()Z", "getPosition", "()Lio/livekit/android/room/track/CameraPosition;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class LocalVideoTrackOptions {
    private final VideoCaptureParameter captureParams;
    private final String deviceId;
    private final boolean isScreencast;
    private final CameraPosition position;

    public LocalVideoTrackOptions() {
        this(false, null, null, null, 15, null);
    }

    public static /* synthetic */ LocalVideoTrackOptions copy$default(LocalVideoTrackOptions localVideoTrackOptions, boolean z, String str, CameraPosition cameraPosition, VideoCaptureParameter videoCaptureParameter, int i, Object obj) {
        if ((i & 1) != 0) {
            z = localVideoTrackOptions.isScreencast;
        }
        if ((i & 2) != 0) {
            str = localVideoTrackOptions.deviceId;
        }
        if ((i & 4) != 0) {
            cameraPosition = localVideoTrackOptions.position;
        }
        if ((i & 8) != 0) {
            videoCaptureParameter = localVideoTrackOptions.captureParams;
        }
        return localVideoTrackOptions.copy(z, str, cameraPosition, videoCaptureParameter);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsScreencast() {
        return this.isScreencast;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* renamed from: component3, reason: from getter */
    public final CameraPosition getPosition() {
        return this.position;
    }

    /* renamed from: component4, reason: from getter */
    public final VideoCaptureParameter getCaptureParams() {
        return this.captureParams;
    }

    public final LocalVideoTrackOptions copy(boolean isScreencast, String deviceId, CameraPosition position, VideoCaptureParameter captureParams) {
        Intrinsics.checkNotNullParameter(captureParams, "captureParams");
        return new LocalVideoTrackOptions(isScreencast, deviceId, position, captureParams);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalVideoTrackOptions)) {
            return false;
        }
        LocalVideoTrackOptions localVideoTrackOptions = (LocalVideoTrackOptions) other;
        return this.isScreencast == localVideoTrackOptions.isScreencast && Intrinsics.areEqual(this.deviceId, localVideoTrackOptions.deviceId) && this.position == localVideoTrackOptions.position && Intrinsics.areEqual(this.captureParams, localVideoTrackOptions.captureParams);
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.isScreencast) * 31;
        String str = this.deviceId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        CameraPosition cameraPosition = this.position;
        return ((hashCode2 + (cameraPosition != null ? cameraPosition.hashCode() : 0)) * 31) + this.captureParams.hashCode();
    }

    public String toString() {
        return "LocalVideoTrackOptions(isScreencast=" + this.isScreencast + ", deviceId=" + this.deviceId + ", position=" + this.position + ", captureParams=" + this.captureParams + ')';
    }

    public LocalVideoTrackOptions(boolean z, String str, CameraPosition cameraPosition, VideoCaptureParameter captureParams) {
        Intrinsics.checkNotNullParameter(captureParams, "captureParams");
        this.isScreencast = z;
        this.deviceId = str;
        this.position = cameraPosition;
        this.captureParams = captureParams;
    }

    public final boolean isScreencast() {
        return this.isScreencast;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public /* synthetic */ LocalVideoTrackOptions(boolean z, String str, CameraPosition cameraPosition, VideoCaptureParameter videoCaptureParameter, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? CameraPosition.FRONT : cameraPosition, (i & 8) != 0 ? VideoPreset169.H720.getCapture() : videoCaptureParameter);
    }

    public final CameraPosition getPosition() {
        return this.position;
    }

    public final VideoCaptureParameter getCaptureParams() {
        return this.captureParams;
    }
}
