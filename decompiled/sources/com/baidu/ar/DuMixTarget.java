package com.baidu.ar;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;

/* loaded from: classes12.dex */
public class DuMixTarget {

    /* renamed from: a, reason: collision with root package name */
    public SurfaceTexture f6744a;
    public SurfaceTexture.OnFrameAvailableListener b;
    public SurfaceHolder c;
    public int d;
    public int e;
    public a f;
    public boolean g;

    public enum a {
        MATRIX,
        FIT_XY,
        FIT_START,
        FIT_CENTER,
        FIT_END,
        CENTER,
        CENTER_CROP,
        CENTER_INSIDE
    }

    public DuMixTarget(SurfaceTexture surfaceTexture, SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener, int i, int i2, boolean z) {
        this.f6744a = surfaceTexture;
        this.b = onFrameAvailableListener;
        this.d = i;
        this.e = i2;
        this.g = z;
    }

    public DuMixTarget(SurfaceHolder surfaceHolder, int i, int i2, boolean z) {
        this.c = surfaceHolder;
        this.d = i;
        this.e = i2;
        this.g = z;
    }

    public SurfaceTexture getDrawTarget() {
        return this.f6744a;
    }

    public a getScaleType() {
        return this.f;
    }

    public SurfaceHolder getSurfaceHolder() {
        return this.c;
    }

    public SurfaceTexture.OnFrameAvailableListener getTargetFrameAvailableListener() {
        return this.b;
    }

    public int getTargetHeight() {
        return this.e;
    }

    public int getTargetWidth() {
        return this.d;
    }

    public boolean isDrawPreview() {
        return this.g;
    }

    public void setDrawPreview(boolean z) {
        this.g = z;
    }

    public void setDrawTarget(SurfaceTexture surfaceTexture) {
        this.f6744a = surfaceTexture;
    }

    public void setScaleType(a aVar) {
        this.f = aVar;
    }

    public void setSurfaceHolder(SurfaceHolder surfaceHolder) {
        this.c = surfaceHolder;
    }

    public void setTargetFrameAvailableListener(SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener) {
        this.b = onFrameAvailableListener;
    }

    public void setTargetHeight(int i) {
        this.e = i;
    }

    public void setTargetWidth(int i) {
        this.d = i;
    }
}
