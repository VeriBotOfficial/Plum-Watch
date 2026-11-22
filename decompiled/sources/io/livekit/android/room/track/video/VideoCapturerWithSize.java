package io.livekit.android.room.track.video;

import kotlin.Metadata;
import livekit.org.webrtc.Size;
import livekit.org.webrtc.VideoCapturer;

/* compiled from: VideoCapturerWithSize.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lio/livekit/android/room/track/video/VideoCapturerWithSize;", "Llivekit/org/webrtc/VideoCapturer;", "findCaptureFormat", "Llivekit/org/webrtc/Size;", "width", "", "height", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface VideoCapturerWithSize extends VideoCapturer {
    Size findCaptureFormat(int width, int height);
}
