package com.otaliastudios.cameraview.preview;

import android.graphics.SurfaceTexture;
import com.otaliastudios.cameraview.filter.Filter;

/* loaded from: classes17.dex */
public interface RendererFrameCallback {
    void onRendererFilterChanged(Filter filter);

    void onRendererFrame(SurfaceTexture surfaceTexture, int i, float f, float f2);

    void onRendererTextureCreated(int i);
}
