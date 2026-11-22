package io.agora.rtc2.video;

import io.agora.base.VideoFrame;
import io.agora.base.VideoFrameMetaInfo;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public interface IVideoCapture {

    public interface Events {
        void onAvailable(int i);

        void onError(int i, String str);

        void onFrameCaptured(VideoFrame videoFrame);

        void onFrameDropped(int i);

        void onI420FrameAvailable(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i2, int i3, int i4, int i5, int i6, long j, VideoFrameMetaInfo videoFrameMetaInfo);

        void onStarted();
    }

    boolean allocate(VideoCaptureFormat videoCaptureFormat);

    void deallocate();

    void dispose();

    VideoCaptureFormat getCaptureFormat();

    void setEventsCallback(Events events);

    boolean startCaptureMaybeAsync();

    void stopCaptureAndBlockUntilStopped();
}
