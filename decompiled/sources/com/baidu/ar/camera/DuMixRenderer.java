package com.baidu.ar.camera;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.Log;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes12.dex */
public class DuMixRenderer implements GLSurfaceView.Renderer {
    public static final String h = "DuMixRenderer";

    /* renamed from: a, reason: collision with root package name */
    public SurfaceTexture f6855a;
    public DuMixDrawer c;
    public SurfaceTexture d;
    public a f;
    public int b = -1;
    public int e = -1;
    public boolean g = true;

    public interface a {
        void a(SurfaceTexture surfaceTexture, SurfaceTexture surfaceTexture2);

        void onSurfaceChanged(int i, int i2);
    }

    public DuMixRenderer(a aVar) {
        this.f = aVar;
    }

    public final int a(int i) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(i, iArr[0]);
        GLES20.glTexParameterf(i, 10241, 9729.0f);
        GLES20.glTexParameterf(i, 10240, 9729.0f);
        GLES20.glTexParameteri(i, 10242, 33071);
        GLES20.glTexParameteri(i, 10243, 33071);
        return iArr[0];
    }

    public final void a() {
        if (this.g) {
            try {
                this.d.detachFromGLContext();
            } catch (Exception e) {
                Log.e(h, "onSurfaceChanged attachToGLContext error!!!");
                e.printStackTrace();
            }
            try {
                this.f6855a.detachFromGLContext();
            } catch (Exception e2) {
                Log.e(h, "onSurfaceChanged attachToGLContext error!!!");
                e2.printStackTrace();
            }
            try {
                this.d.attachToGLContext(this.e);
            } catch (Exception e3) {
                Log.e(h, "onSurfaceChanged attachToGLContext error!!!");
                e3.printStackTrace();
            }
            this.g = false;
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        a();
        GLES20.glClearColor(1.0f, 1.0f, 1.0f, 1.0f);
        GLES20.glClear(16640);
        try {
            SurfaceTexture surfaceTexture = this.d;
            if (surfaceTexture != null) {
                surfaceTexture.updateTexImage();
                float[] fArr = new float[16];
                this.d.getTransformMatrix(fArr);
                this.c.draw(fArr);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
        a aVar = this.f;
        if (aVar != null) {
            aVar.onSurfaceChanged(i, i2);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        this.b = a(3553);
        this.f6855a = new SurfaceTexture(this.b);
        this.e = a(3553);
        this.d = new SurfaceTexture(this.e);
        this.c = new DuMixDrawer(this.e, 3553);
        a aVar = this.f;
        if (aVar != null) {
            aVar.a(this.f6855a, this.d);
        }
    }

    public void release() {
        this.c = null;
        SurfaceTexture surfaceTexture = this.f6855a;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.f6855a = null;
        }
        SurfaceTexture surfaceTexture2 = this.d;
        if (surfaceTexture2 != null) {
            surfaceTexture2.release();
            this.d = null;
        }
        this.f = null;
    }
}
