package com.baidu.ar;

import android.graphics.Canvas;
import android.graphics.SurfaceTexture;
import android.util.Log;
import android.view.Surface;

/* loaded from: classes12.dex */
public class lc {
    public static final String g = "lc";

    /* renamed from: a, reason: collision with root package name */
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

    public Surface a(int i, int i2, int i3) {
        this.f = i;
        this.e = new SurfaceTexture(i);
        a(i2, i3);
        Surface surface = new Surface(this.e);
        this.c = surface;
        return surface;
    }

    public void a(int i, int i2) {
        this.f7067a = i;
        this.b = i2;
        this.e.setDefaultBufferSize(i, i2);
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
