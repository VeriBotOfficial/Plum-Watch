package io.livekit.android.room.track.video;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.os.Handler;
import android.view.Surface;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import livekit.org.webrtc.CapturerObserver;
import livekit.org.webrtc.SurfaceTextureHelper;
import livekit.org.webrtc.VideoCapturer;
import livekit.org.webrtc.VideoFrame;
import livekit.org.webrtc.VideoSink;

/* compiled from: BitmapFrameCapturer.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\bH\u0016J\b\u0010\u0014\u001a\u00020\u0012H\u0002J\b\u0010\u0015\u001a\u00020\u0012H\u0016J \u0010\u0016\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0004H\u0016J\b\u0010\u001a\u001a\u00020\u0006H\u0016J\u0016\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\bJ \u0010\u001f\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\bH\u0016J\b\u0010 \u001a\u00020\u0012H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lio/livekit/android/room/track/video/BitmapFrameCapturer;", "Llivekit/org/webrtc/VideoCapturer;", "()V", "capturerObserver", "Llivekit/org/webrtc/CapturerObserver;", "disposed", "", "height", "", "rotation", "stateLock", "", "surface", "Landroid/view/Surface;", "surfaceTextureHelper", "Llivekit/org/webrtc/SurfaceTextureHelper;", "width", "changeCaptureFormat", "", "framerate", "checkNotDisposed", "dispose", MobileAdsBridgeBase.initializeMethodName, "context", "Landroid/content/Context;", "observer", "isScreencast", "pushBitmap", "bitmap", "Landroid/graphics/Bitmap;", "rotationDegrees", "startCapture", "stopCapture", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public class BitmapFrameCapturer implements VideoCapturer {
    private CapturerObserver capturerObserver;
    private boolean disposed;
    private int height;
    private int rotation;
    private final Object stateLock = new Object();
    private Surface surface;
    private SurfaceTextureHelper surfaceTextureHelper;
    private int width;

    @Override // livekit.org.webrtc.VideoCapturer
    public void changeCaptureFormat(int width, int height, int framerate) {
    }

    @Override // livekit.org.webrtc.VideoCapturer
    public boolean isScreencast() {
        return false;
    }

    @Override // livekit.org.webrtc.VideoCapturer
    public void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver observer) {
        Intrinsics.checkNotNullParameter(surfaceTextureHelper, "surfaceTextureHelper");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(observer, "observer");
        synchronized (this.stateLock) {
            this.surfaceTextureHelper = surfaceTextureHelper;
            this.capturerObserver = observer;
            this.surface = new Surface(surfaceTextureHelper.getSurfaceTexture());
            Unit unit = Unit.INSTANCE;
        }
    }

    private final void checkNotDisposed() {
        if (this.disposed) {
            throw new IllegalStateException("Capturer is disposed.".toString());
        }
    }

    @Override // livekit.org.webrtc.VideoCapturer
    public void startCapture(int width, int height, int framerate) {
        synchronized (this.stateLock) {
            checkNotDisposed();
            if (this.surfaceTextureHelper == null) {
                throw new IllegalStateException("BitmapFrameCapturer must be initialized before calling startCapture.".toString());
            }
            CapturerObserver capturerObserver = this.capturerObserver;
            if (capturerObserver != null) {
                capturerObserver.onCapturerStarted(true);
            }
            SurfaceTextureHelper surfaceTextureHelper = this.surfaceTextureHelper;
            if (surfaceTextureHelper != null) {
                surfaceTextureHelper.startListening(new VideoSink() { // from class: io.livekit.android.room.track.video.BitmapFrameCapturer$$ExternalSyntheticLambda0
                    @Override // livekit.org.webrtc.VideoSink
                    public final void onFrame(VideoFrame videoFrame) {
                        BitmapFrameCapturer.startCapture$lambda$4$lambda$3(BitmapFrameCapturer.this, videoFrame);
                    }
                });
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startCapture$lambda$4$lambda$3(BitmapFrameCapturer this$0, VideoFrame videoFrame) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CapturerObserver capturerObserver = this$0.capturerObserver;
        if (capturerObserver != null) {
            capturerObserver.onFrameCaptured(videoFrame);
        }
    }

    @Override // livekit.org.webrtc.VideoCapturer
    public void stopCapture() {
        synchronized (this.stateLock) {
            SurfaceTextureHelper surfaceTextureHelper = this.surfaceTextureHelper;
            if (surfaceTextureHelper != null) {
                surfaceTextureHelper.stopListening();
            }
            CapturerObserver capturerObserver = this.capturerObserver;
            if (capturerObserver != null) {
                capturerObserver.onCapturerStopped();
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Override // livekit.org.webrtc.VideoCapturer
    public void dispose() {
        synchronized (this.stateLock) {
            if (this.disposed) {
                return;
            }
            stopCapture();
            Surface surface = this.surface;
            if (surface != null) {
                surface.release();
            }
            this.disposed = true;
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void pushBitmap(final Bitmap bitmap, int rotationDegrees) {
        Handler handler;
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        synchronized (this.stateLock) {
            if (this.disposed) {
                return;
            }
            SurfaceTextureHelper surfaceTextureHelper = this.surfaceTextureHelper;
            if (surfaceTextureHelper == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            if (this.surface == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            if (this.rotation != rotationDegrees) {
                if (surfaceTextureHelper != null) {
                    surfaceTextureHelper.setFrameRotation(rotationDegrees);
                }
                this.rotation = rotationDegrees;
            }
            if (this.width != bitmap.getWidth() || this.height != bitmap.getHeight()) {
                SurfaceTextureHelper surfaceTextureHelper2 = this.surfaceTextureHelper;
                if (surfaceTextureHelper2 != null) {
                    surfaceTextureHelper2.setTextureSize(bitmap.getWidth(), bitmap.getHeight());
                }
                this.width = bitmap.getWidth();
                this.height = bitmap.getHeight();
            }
            SurfaceTextureHelper surfaceTextureHelper3 = this.surfaceTextureHelper;
            if (surfaceTextureHelper3 != null && (handler = surfaceTextureHelper3.getHandler()) != null) {
                Boolean.valueOf(handler.post(new Runnable() { // from class: io.livekit.android.room.track.video.BitmapFrameCapturer$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        BitmapFrameCapturer.pushBitmap$lambda$8$lambda$7(BitmapFrameCapturer.this, bitmap);
                    }
                }));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pushBitmap$lambda$8$lambda$7(BitmapFrameCapturer this$0, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bitmap, "$bitmap");
        Surface surface = this$0.surface;
        Canvas lockHardwareCanvas = surface != null ? surface.lockHardwareCanvas() : null;
        if (lockHardwareCanvas != null) {
            lockHardwareCanvas.drawBitmap(bitmap, new Matrix(), new Paint());
            Surface surface2 = this$0.surface;
            if (surface2 != null) {
                surface2.unlockCanvasAndPost(lockHardwareCanvas);
            }
        }
    }
}
