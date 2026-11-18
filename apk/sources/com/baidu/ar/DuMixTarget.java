package com.baidu.ar;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;

/* JADX INFO: loaded from: classes16.dex */
public class DuMixTarget {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
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

    public DuMixTarget(SurfaceTexture surfaceTexture, SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener, int r3, int r4, boolean z) {
        this.f6744a = surfaceTexture;
        this.b = onFrameAvailableListener;
        this.d = r3;
        this.e = r4;
        this.g = z;
    }

    public DuMixTarget(SurfaceHolder surfaceHolder, int r2, int r3, boolean z) {
        this.c = surfaceHolder;
        this.d = r2;
        this.e = r3;
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

    public void setTargetHeight(int r1) {
        this.e = r1;
    }

    public void setTargetWidth(int r1) {
        this.d = r1;
    }
}
