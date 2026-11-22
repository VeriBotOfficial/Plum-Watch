package livekit.org.webrtc;

import livekit.org.webrtc.VideoProcessor;

/* loaded from: classes8.dex */
public class VideoSource extends MediaSource {
    private final CapturerObserver capturerObserver;
    private boolean isCapturerRunning;
    private final NativeAndroidVideoTrackSource nativeAndroidVideoTrackSource;
    private VideoProcessor videoProcessor;
    private final Object videoProcessorLock;

    public static class AspectRatio {
        public static final AspectRatio UNDEFINED = new AspectRatio(0, 0);
        public final int height;
        public final int width;

        public AspectRatio(int width, int height) {
            this.width = width;
            this.height = height;
        }
    }

    public VideoSource(long nativeSource) {
        super(nativeSource);
        this.videoProcessorLock = new Object();
        this.capturerObserver = new CapturerObserver() { // from class: livekit.org.webrtc.VideoSource.1
            @Override // livekit.org.webrtc.CapturerObserver
            public void onCapturerStarted(boolean success) {
                VideoSource.this.nativeAndroidVideoTrackSource.setState(success);
                synchronized (VideoSource.this.videoProcessorLock) {
                    VideoSource.this.isCapturerRunning = success;
                    if (VideoSource.this.videoProcessor != null) {
                        VideoSource.this.videoProcessor.onCapturerStarted(success);
                    }
                }
            }

            @Override // livekit.org.webrtc.CapturerObserver
            public void onCapturerStopped() {
                VideoSource.this.nativeAndroidVideoTrackSource.setState(false);
                synchronized (VideoSource.this.videoProcessorLock) {
                    VideoSource.this.isCapturerRunning = false;
                    if (VideoSource.this.videoProcessor != null) {
                        VideoSource.this.videoProcessor.onCapturerStopped();
                    }
                }
            }

            @Override // livekit.org.webrtc.CapturerObserver
            public void onFrameCaptured(VideoFrame frame) {
                VideoProcessor.FrameAdaptationParameters adaptFrame = VideoSource.this.nativeAndroidVideoTrackSource.adaptFrame(frame);
                synchronized (VideoSource.this.videoProcessorLock) {
                    if (VideoSource.this.videoProcessor != null) {
                        VideoSource.this.videoProcessor.onFrameCaptured(frame, adaptFrame);
                        return;
                    }
                    VideoFrame applyFrameAdaptationParameters = VideoProcessor.applyFrameAdaptationParameters(frame, adaptFrame);
                    if (applyFrameAdaptationParameters != null) {
                        VideoSource.this.nativeAndroidVideoTrackSource.onFrameCaptured(applyFrameAdaptationParameters);
                        applyFrameAdaptationParameters.release();
                    }
                }
            }
        };
        this.nativeAndroidVideoTrackSource = new NativeAndroidVideoTrackSource(nativeSource);
    }

    public void adaptOutputFormat(int width, int height, int fps) {
        int max = Math.max(width, height);
        int min = Math.min(width, height);
        adaptOutputFormat(max, min, min, max, fps);
    }

    public void adaptOutputFormat(int landscapeWidth, int landscapeHeight, int portraitWidth, int portraitHeight, int fps) {
        adaptOutputFormat(new AspectRatio(landscapeWidth, landscapeHeight), Integer.valueOf(landscapeWidth * landscapeHeight), new AspectRatio(portraitWidth, portraitHeight), Integer.valueOf(portraitWidth * portraitHeight), Integer.valueOf(fps));
    }

    public void adaptOutputFormat(AspectRatio targetLandscapeAspectRatio, Integer maxLandscapePixelCount, AspectRatio targetPortraitAspectRatio, Integer maxPortraitPixelCount, Integer maxFps) {
        this.nativeAndroidVideoTrackSource.adaptOutputFormat(targetLandscapeAspectRatio, maxLandscapePixelCount, targetPortraitAspectRatio, maxPortraitPixelCount, maxFps);
    }

    public void setIsScreencast(boolean isScreencast) {
        this.nativeAndroidVideoTrackSource.setIsScreencast(isScreencast);
    }

    public void setVideoProcessor(VideoProcessor newVideoProcessor) {
        synchronized (this.videoProcessorLock) {
            VideoProcessor videoProcessor = this.videoProcessor;
            if (videoProcessor != null) {
                videoProcessor.setSink(null);
                if (this.isCapturerRunning) {
                    this.videoProcessor.onCapturerStopped();
                }
            }
            this.videoProcessor = newVideoProcessor;
            if (newVideoProcessor != null) {
                newVideoProcessor.setSink(new VideoSink() { // from class: livekit.org.webrtc.VideoSource$$ExternalSyntheticLambda1
                    @Override // livekit.org.webrtc.VideoSink
                    public final void onFrame(VideoFrame videoFrame) {
                        VideoSource.this.lambda$setVideoProcessor$1(videoFrame);
                    }
                });
                if (this.isCapturerRunning) {
                    newVideoProcessor.onCapturerStarted(true);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setVideoProcessor$0(VideoFrame videoFrame) {
        this.nativeAndroidVideoTrackSource.onFrameCaptured(videoFrame);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setVideoProcessor$1(final VideoFrame videoFrame) {
        runWithReference(new Runnable() { // from class: livekit.org.webrtc.VideoSource$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                VideoSource.this.lambda$setVideoProcessor$0(videoFrame);
            }
        });
    }

    public CapturerObserver getCapturerObserver() {
        return this.capturerObserver;
    }

    long getNativeVideoTrackSource() {
        return getNativeMediaSource();
    }

    @Override // livekit.org.webrtc.MediaSource
    public void dispose() {
        setVideoProcessor(null);
        super.dispose();
    }
}
