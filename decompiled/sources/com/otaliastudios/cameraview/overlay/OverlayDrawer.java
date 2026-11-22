package com.otaliastudios.cameraview.overlay;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.view.Surface;
import com.otaliastudios.cameraview.CameraLogger;
import com.otaliastudios.cameraview.internal.GlTextureDrawer;
import com.otaliastudios.cameraview.internal.Issue514Workaround;
import com.otaliastudios.cameraview.overlay.Overlay;
import com.otaliastudios.cameraview.size.Size;

/* loaded from: classes17.dex */
public class OverlayDrawer {
    private Issue514Workaround mIssue514Workaround;
    private Overlay mOverlay;
    private Surface mSurface;
    private SurfaceTexture mSurfaceTexture;
    private static final String TAG = "OverlayDrawer";
    private static final CameraLogger LOG = CameraLogger.create(TAG);
    private final Object mIssue514WorkaroundLock = new Object();
    GlTextureDrawer mTextureDrawer = new GlTextureDrawer();

    public OverlayDrawer(Overlay overlay, Size size) {
        this.mOverlay = overlay;
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.mTextureDrawer.getTexture().getId());
        this.mSurfaceTexture = surfaceTexture;
        surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
        this.mSurface = new Surface(this.mSurfaceTexture);
        this.mIssue514Workaround = new Issue514Workaround(this.mTextureDrawer.getTexture().getId());
    }

    public void draw(Overlay.Target target) {
        Canvas lockCanvas;
        try {
            if (this.mOverlay.getHardwareCanvasEnabled()) {
                lockCanvas = this.mSurface.lockHardwareCanvas();
            } else {
                lockCanvas = this.mSurface.lockCanvas(null);
            }
            lockCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
            this.mOverlay.drawOn(target, lockCanvas);
            this.mSurface.unlockCanvasAndPost(lockCanvas);
        } catch (Surface.OutOfResourcesException e) {
            LOG.w("Got Surface.OutOfResourcesException while drawing video overlays", e);
        }
        synchronized (this.mIssue514WorkaroundLock) {
            this.mIssue514Workaround.beforeOverlayUpdateTexImage();
            this.mSurfaceTexture.updateTexImage();
        }
        this.mSurfaceTexture.getTransformMatrix(this.mTextureDrawer.getTextureTransform());
    }

    public float[] getTransform() {
        return this.mTextureDrawer.getTextureTransform();
    }

    public void render(long j) {
        GLES20.glDisable(2884);
        GLES20.glDisable(2929);
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(770, 771);
        synchronized (this.mIssue514WorkaroundLock) {
            this.mTextureDrawer.draw(j);
        }
    }

    public void release() {
        Issue514Workaround issue514Workaround = this.mIssue514Workaround;
        if (issue514Workaround != null) {
            issue514Workaround.end();
            this.mIssue514Workaround = null;
        }
        SurfaceTexture surfaceTexture = this.mSurfaceTexture;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.mSurfaceTexture = null;
        }
        Surface surface = this.mSurface;
        if (surface != null) {
            surface.release();
            this.mSurface = null;
        }
        GlTextureDrawer glTextureDrawer = this.mTextureDrawer;
        if (glTextureDrawer != null) {
            glTextureDrawer.release();
            this.mTextureDrawer = null;
        }
    }
}
