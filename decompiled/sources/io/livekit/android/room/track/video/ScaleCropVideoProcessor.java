package io.livekit.android.room.track.video;

import com.swmansion.reanimated.layoutReanimation.Snapshot;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import livekit.org.webrtc.VideoFrame;

/* compiled from: ScaleCropVideoProcessor.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0010"}, d2 = {"Lio/livekit/android/room/track/video/ScaleCropVideoProcessor;", "Lio/livekit/android/room/track/video/ChainVideoProcessor;", Snapshot.TARGET_WIDTH, "", Snapshot.TARGET_HEIGHT, "(II)V", "getTargetHeight", "()I", "setTargetHeight", "(I)V", "getTargetWidth", "setTargetWidth", "onFrameCaptured", "", "frame", "Llivekit/org/webrtc/VideoFrame;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScaleCropVideoProcessor extends ChainVideoProcessor {
    private int targetHeight;
    private int targetWidth;

    public final int getTargetWidth() {
        return this.targetWidth;
    }

    public final void setTargetWidth(int i) {
        this.targetWidth = i;
    }

    public final int getTargetHeight() {
        return this.targetHeight;
    }

    public final void setTargetHeight(int i) {
        this.targetHeight = i;
    }

    public ScaleCropVideoProcessor(int i, int i2) {
        this.targetWidth = i;
        this.targetHeight = i2;
    }

    @Override // livekit.org.webrtc.CapturerObserver
    public void onFrameCaptured(VideoFrame frame) {
        int roundToInt;
        int i;
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(frame, "frame");
        if (frame.getRotatedWidth() == this.targetWidth && frame.getRotatedHeight() == this.targetHeight) {
            continueChain(frame);
            return;
        }
        int width = frame.getBuffer().getWidth();
        int height = frame.getBuffer().getHeight();
        int i4 = this.targetWidth;
        if (i4 > width || (roundToInt = this.targetHeight) > height) {
            double max = Math.max(i4 / width, this.targetHeight / height);
            int roundToInt2 = MathKt.roundToInt(this.targetWidth / max);
            roundToInt = MathKt.roundToInt(this.targetHeight / max);
            i = roundToInt2;
        } else {
            i = i4;
        }
        int i5 = roundToInt;
        double d = width;
        double d2 = height;
        double d3 = i / i5;
        if (d / d2 > d3) {
            i3 = height;
            i2 = MathKt.roundToInt(d2 * d3);
        } else {
            int roundToInt3 = MathKt.roundToInt(d / d3);
            i2 = width;
            i3 = roundToInt3;
        }
        VideoFrame videoFrame = new VideoFrame(frame.getBuffer().cropAndScale((width - i2) / 2, (height - i3) / 2, i2, i3, i, i5), frame.getRotation(), frame.getTimestampNs());
        continueChain(videoFrame);
        videoFrame.release();
    }
}
