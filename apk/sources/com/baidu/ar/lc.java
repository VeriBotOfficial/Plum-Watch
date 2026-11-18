package com.baidu.ar;

import android.graphics.Canvas;
import android.graphics.SurfaceTexture;
import android.util.Log;
import android.view.Surface;

/* JADX INFO: loaded from: classes16.dex */
public class lc {
    public static final String g = "lc";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7067a = 500;
    public int b = 500;
    public Surface c;
    public Canvas d;
    public SurfaceTexture e;
    public int f;

    public Canvas a() {
        this.d = null;
        Surface surface = this.c;
        if (surface != null) {
            try {
                this.d = surface.lockCanvas(null);
            } catch (Exception e) {
                Log.e(g, "error while rendering view to gl: " + e);
            }
        }
        return this.d;
    }

    public Surface a(int r2, int r3, int r4) {
        this.f = r2;
        this.e = new SurfaceTexture(r2);
        a(r3, r4);
        Surface surface = new Surface(this.e);
        this.c = surface;
        return surface;
    }

    public void a(int r2, int r3) {
        this.f7067a = r2;
        this.b = r3;
        this.e.setDefaultBufferSize(r2, r3);
    }

    public void b() {
        Surface surface = this.c;
        if (surface != null) {
            surface.release();
        }
        SurfaceTexture surfaceTexture = this.e;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        this.c = null;
        this.e = null;
    }

    public void c() {
        Canvas canvas = this.d;
        if (canvas != null) {
            this.c.unlockCanvasAndPost(canvas);
        }
        this.d = null;
    }

    public void d() {
        try {
            this.e.updateTexImage();
        } catch (Exception e) {
            Log.e(g, "error while update view to gl: " + e);
        }
    }
}
