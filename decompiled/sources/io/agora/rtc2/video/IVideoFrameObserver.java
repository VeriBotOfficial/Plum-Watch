package io.agora.rtc2.video;

import io.agora.base.VideoFrame;

/* loaded from: classes6.dex */
public interface IVideoFrameObserver {
    public static final int POSITION_POST_CAPTURER = 1;
    public static final int POSITION_PRE_ENCODER = 4;
    public static final int POSITION_PRE_RENDERER = 2;
    public static final int PROCESS_MODE_READ_ONLY = 0;
    public static final int PROCESS_MODE_READ_WRITE = 1;
    public static final int VIDEO_PIXEL_BGRA = 2;
    public static final int VIDEO_PIXEL_DEFAULT = 0;
    public static final int VIDEO_PIXEL_I420 = 1;
    public static final int VIDEO_PIXEL_I422 = 16;
    public static final int VIDEO_PIXEL_NV12 = 8;
    public static final int VIDEO_PIXEL_NV21 = 3;
    public static final int VIDEO_PIXEL_RGBA = 4;
    public static final int VIDEO_TEXTURE_2D = 10;
    public static final int VIDEO_TEXTURE_OES = 11;

    boolean getMirrorApplied();

    int getObservedFramePosition();

    boolean getRotationApplied();

    int getVideoFormatPreference();

    int getVideoFrameProcessMode();

    boolean onCaptureVideoFrame(int sourceType, VideoFrame videoFrame);

    boolean onMediaPlayerVideoFrame(VideoFrame videoFrame, int mediaPlayerId);

    boolean onPreEncodeVideoFrame(int sourceType, VideoFrame videoFrame);

    boolean onRenderVideoFrame(String channelId, int uid, VideoFrame videoFrame);
}
