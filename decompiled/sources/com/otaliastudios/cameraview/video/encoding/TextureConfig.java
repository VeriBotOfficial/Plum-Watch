package com.otaliastudios.cameraview.video.encoding;

import android.opengl.EGLContext;
import com.otaliastudios.cameraview.overlay.Overlay;
import com.otaliastudios.cameraview.overlay.OverlayDrawer;

/* loaded from: classes17.dex */
public class TextureConfig extends VideoConfig {
    public EGLContext eglContext;
    public OverlayDrawer overlayDrawer;
    public int overlayRotation;
    public Overlay.Target overlayTarget;
    public float scaleX;
    public float scaleY;
    public int textureId;

    TextureConfig copy() {
        TextureConfig textureConfig = new TextureConfig();
        copy(textureConfig);
        textureConfig.textureId = this.textureId;
        textureConfig.overlayDrawer = this.overlayDrawer;
        textureConfig.overlayTarget = this.overlayTarget;
        textureConfig.overlayRotation = this.overlayRotation;
        textureConfig.scaleX = this.scaleX;
        textureConfig.scaleY = this.scaleY;
        textureConfig.eglContext = this.eglContext;
        return textureConfig;
    }

    boolean hasOverlay() {
        return this.overlayDrawer != null;
    }
}
