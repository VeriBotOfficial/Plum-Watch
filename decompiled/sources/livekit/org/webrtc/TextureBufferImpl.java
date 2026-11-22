package livekit.org.webrtc;

import android.graphics.Matrix;
import android.os.Handler;
import java.util.concurrent.Callable;
import livekit.org.webrtc.VideoFrame;

/* loaded from: classes8.dex */
public class TextureBufferImpl implements VideoFrame.TextureBuffer {
    private final int height;

    /* renamed from: id, reason: collision with root package name */
    private final int f18740id;
    private final RefCountDelegate refCountDelegate;
    private final RefCountMonitor refCountMonitor;
    private final Handler toI420Handler;
    private final Matrix transformMatrix;
    private final VideoFrame.TextureBuffer.Type type;
    private final int unscaledHeight;
    private final int unscaledWidth;
    private final int width;
    private final YuvConverter yuvConverter;

    interface RefCountMonitor {
        void onDestroy(TextureBufferImpl textureBuffer);

        void onRelease(TextureBufferImpl textureBuffer);

        void onRetain(TextureBufferImpl textureBuffer);
    }

    public TextureBufferImpl(int width, int height, VideoFrame.TextureBuffer.Type type, int id2, Matrix transformMatrix, Handler toI420Handler, YuvConverter yuvConverter, final Runnable releaseCallback) {
        this(width, height, width, height, type, id2, transformMatrix, toI420Handler, yuvConverter, new RefCountMonitor() { // from class: livekit.org.webrtc.TextureBufferImpl.1
            @Override // livekit.org.webrtc.TextureBufferImpl.RefCountMonitor
            public void onRelease(TextureBufferImpl textureBuffer) {
            }

            @Override // livekit.org.webrtc.TextureBufferImpl.RefCountMonitor
            public void onRetain(TextureBufferImpl textureBuffer) {
            }

            @Override // livekit.org.webrtc.TextureBufferImpl.RefCountMonitor
            public void onDestroy(TextureBufferImpl textureBuffer) {
                Runnable runnable = releaseCallback;
                if (runnable != null) {
                    runnable.run();
                }
            }
        });
    }

    TextureBufferImpl(int width, int height, VideoFrame.TextureBuffer.Type type, int id2, Matrix transformMatrix, Handler toI420Handler, YuvConverter yuvConverter, RefCountMonitor refCountMonitor) {
        this(width, height, width, height, type, id2, transformMatrix, toI420Handler, yuvConverter, refCountMonitor);
    }

    private TextureBufferImpl(int unscaledWidth, int unscaledHeight, int width, int height, VideoFrame.TextureBuffer.Type type, int id2, Matrix transformMatrix, Handler toI420Handler, YuvConverter yuvConverter, final RefCountMonitor refCountMonitor) {
        this.unscaledWidth = unscaledWidth;
        this.unscaledHeight = unscaledHeight;
        this.width = width;
        this.height = height;
        this.type = type;
        this.f18740id = id2;
        this.transformMatrix = transformMatrix;
        this.toI420Handler = toI420Handler;
        this.yuvConverter = yuvConverter;
        this.refCountDelegate = new RefCountDelegate(new Runnable() { // from class: livekit.org.webrtc.TextureBufferImpl$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                TextureBufferImpl.this.lambda$new$0(refCountMonitor);
            }
        });
        this.refCountMonitor = refCountMonitor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(RefCountMonitor refCountMonitor) {
        refCountMonitor.onDestroy(this);
    }

    @Override // livekit.org.webrtc.VideoFrame.TextureBuffer
    public VideoFrame.TextureBuffer.Type getType() {
        return this.type;
    }

    @Override // livekit.org.webrtc.VideoFrame.TextureBuffer
    public int getTextureId() {
        return this.f18740id;
    }

    @Override // livekit.org.webrtc.VideoFrame.TextureBuffer
    public Matrix getTransformMatrix() {
        return this.transformMatrix;
    }

    @Override // livekit.org.webrtc.VideoFrame.Buffer
    public int getWidth() {
        return this.width;
    }

    @Override // livekit.org.webrtc.VideoFrame.Buffer
    public int getHeight() {
        return this.height;
    }

    @Override // livekit.org.webrtc.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        return (VideoFrame.I420Buffer) ThreadUtils.invokeAtFrontUninterruptibly(this.toI420Handler, new Callable() { // from class: livekit.org.webrtc.TextureBufferImpl$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                VideoFrame.I420Buffer lambda$toI420$1;
                lambda$toI420$1 = TextureBufferImpl.this.lambda$toI420$1();
                return lambda$toI420$1;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ VideoFrame.I420Buffer lambda$toI420$1() throws Exception {
        return this.yuvConverter.convert(this);
    }

    @Override // livekit.org.webrtc.VideoFrame.Buffer, livekit.org.webrtc.RefCounted
    public void retain() {
        this.refCountMonitor.onRetain(this);
        this.refCountDelegate.retain();
    }

    @Override // livekit.org.webrtc.VideoFrame.Buffer, livekit.org.webrtc.RefCounted
    public void release() {
        this.refCountMonitor.onRelease(this);
        this.refCountDelegate.release();
    }

    @Override // livekit.org.webrtc.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int cropX, int cropY, int cropWidth, int cropHeight, int scaleWidth, int scaleHeight) {
        Matrix matrix = new Matrix();
        matrix.preTranslate(cropX / this.width, (r1 - (cropY + cropHeight)) / this.height);
        matrix.preScale(cropWidth / this.width, cropHeight / this.height);
        return applyTransformMatrix(matrix, Math.round((this.unscaledWidth * cropWidth) / this.width), Math.round((this.unscaledHeight * cropHeight) / this.height), scaleWidth, scaleHeight);
    }

    @Override // livekit.org.webrtc.VideoFrame.TextureBuffer
    public int getUnscaledWidth() {
        return this.unscaledWidth;
    }

    @Override // livekit.org.webrtc.VideoFrame.TextureBuffer
    public int getUnscaledHeight() {
        return this.unscaledHeight;
    }

    public Handler getToI420Handler() {
        return this.toI420Handler;
    }

    public YuvConverter getYuvConverter() {
        return this.yuvConverter;
    }

    @Override // livekit.org.webrtc.VideoFrame.TextureBuffer
    public TextureBufferImpl applyTransformMatrix(Matrix transformMatrix, int newWidth, int newHeight) {
        return applyTransformMatrix(transformMatrix, newWidth, newHeight, newWidth, newHeight);
    }

    private TextureBufferImpl applyTransformMatrix(Matrix transformMatrix, int unscaledWidth, int unscaledHeight, int scaledWidth, int scaledHeight) {
        Matrix matrix = new Matrix(this.transformMatrix);
        matrix.preConcat(transformMatrix);
        retain();
        return new TextureBufferImpl(unscaledWidth, unscaledHeight, scaledWidth, scaledHeight, this.type, this.f18740id, matrix, this.toI420Handler, this.yuvConverter, new RefCountMonitor() { // from class: livekit.org.webrtc.TextureBufferImpl.2
            @Override // livekit.org.webrtc.TextureBufferImpl.RefCountMonitor
            public void onRetain(TextureBufferImpl textureBuffer) {
                TextureBufferImpl.this.refCountMonitor.onRetain(TextureBufferImpl.this);
            }

            @Override // livekit.org.webrtc.TextureBufferImpl.RefCountMonitor
            public void onRelease(TextureBufferImpl textureBuffer) {
                TextureBufferImpl.this.refCountMonitor.onRelease(TextureBufferImpl.this);
            }

            @Override // livekit.org.webrtc.TextureBufferImpl.RefCountMonitor
            public void onDestroy(TextureBufferImpl textureBuffer) {
                TextureBufferImpl.this.release();
            }
        });
    }
}
