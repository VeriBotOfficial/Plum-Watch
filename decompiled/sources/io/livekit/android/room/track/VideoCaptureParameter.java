package io.livekit.android.room.track;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: LocalVideoTrackOptions.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, d2 = {"Lio/livekit/android/room/track/VideoCaptureParameter;", "", "width", "", "height", "maxFps", "adaptOutputToDimensions", "", "(IIIZ)V", "getAdaptOutputToDimensions", "()Z", "getHeight", "()I", "getMaxFps", "getWidth", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class VideoCaptureParameter {
    private final boolean adaptOutputToDimensions;
    private final int height;
    private final int maxFps;
    private final int width;

    public VideoCaptureParameter(int i, int i2, int i3) {
        this(i, i2, i3, false, 8, null);
    }

    public static /* synthetic */ VideoCaptureParameter copy$default(VideoCaptureParameter videoCaptureParameter, int i, int i2, int i3, boolean z, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = videoCaptureParameter.width;
        }
        if ((i4 & 2) != 0) {
            i2 = videoCaptureParameter.height;
        }
        if ((i4 & 4) != 0) {
            i3 = videoCaptureParameter.maxFps;
        }
        if ((i4 & 8) != 0) {
            z = videoCaptureParameter.adaptOutputToDimensions;
        }
        return videoCaptureParameter.copy(i, i2, i3, z);
    }

    /* renamed from: component1, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* renamed from: component2, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* renamed from: component3, reason: from getter */
    public final int getMaxFps() {
        return this.maxFps;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getAdaptOutputToDimensions() {
        return this.adaptOutputToDimensions;
    }

    public final VideoCaptureParameter copy(int width, int height, int maxFps, boolean adaptOutputToDimensions) {
        return new VideoCaptureParameter(width, height, maxFps, adaptOutputToDimensions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoCaptureParameter)) {
            return false;
        }
        VideoCaptureParameter videoCaptureParameter = (VideoCaptureParameter) other;
        return this.width == videoCaptureParameter.width && this.height == videoCaptureParameter.height && this.maxFps == videoCaptureParameter.maxFps && this.adaptOutputToDimensions == videoCaptureParameter.adaptOutputToDimensions;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.width) * 31) + Integer.hashCode(this.height)) * 31) + Integer.hashCode(this.maxFps)) * 31) + Boolean.hashCode(this.adaptOutputToDimensions);
    }

    public String toString() {
        return "VideoCaptureParameter(width=" + this.width + ", height=" + this.height + ", maxFps=" + this.maxFps + ", adaptOutputToDimensions=" + this.adaptOutputToDimensions + ')';
    }

    public VideoCaptureParameter(int i, int i2, int i3, boolean z) {
        this.width = i;
        this.height = i2;
        this.maxFps = i3;
        this.adaptOutputToDimensions = z;
    }

    public /* synthetic */ VideoCaptureParameter(int i, int i2, int i3, boolean z, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, (i4 & 8) != 0 ? true : z);
    }

    public final int getWidth() {
        return this.width;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getMaxFps() {
        return this.maxFps;
    }

    public final boolean getAdaptOutputToDimensions() {
        return this.adaptOutputToDimensions;
    }
}
