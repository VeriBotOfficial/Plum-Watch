package com.baidu.ar;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.util.Log;
import com.baidu.ar.arrender.Texture;
import com.baidu.ar.bean.Size;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes12.dex */
public class le implements GLSurfaceView.Renderer {

    /* renamed from: a, reason: collision with root package name */
    public Texture f7069a;
    public he b;
    public float[] c;
    public float[] d;
    public he e;
    public SurfaceTexture f;
    public int g = -1;
    public boolean h = true;
    public boolean i = false;
    public a j;
    public int k;
    public int l;
    public int m;
    public int n;

    public interface a {
        void onDrawFrame();

        void onSurfaceChanged(int i, int i2);

        void onSurfaceCreated(Texture texture);

        void onSurfaceCreated(Texture texture, SurfaceTexture surfaceTexture, int i, int i2);
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

    public final Size a(int i, int i2, int i3, int i4) {
        Size size = new Size(i, i2);
        if (i > 0 && i2 > 0 && i3 > 0 && i4 > 0) {
            float f = i;
            float f2 = i2;
            float f3 = f / f2;
            float f4 = i3 / i4;
            if (f3 > f4) {
                size.setWidth((int) (f2 * f4));
                size.setHeight(i2);
                return size;
            }
            if (f3 < f4) {
                size.setWidth(i);
                size.setHeight((int) (f / f4));
            }
        }
        return size;
    }

    public void a() {
        this.b = null;
        this.e = null;
        this.f7069a = null;
        SurfaceTexture surfaceTexture = this.f;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.f = null;
        }
        this.c = null;
        this.d = null;
        this.j = null;
    }

    public void a(int i, int i2) {
        this.k = i;
        this.l = i2;
    }

    public void a(a aVar) {
        this.j = aVar;
    }

    public void a(boolean z) {
        this.i = z;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        GLES20.glClearColor(1.0f, 1.0f, 1.0f, 1.0f);
        GLES20.glClear(16640);
        a aVar = this.j;
        if (aVar != null) {
            aVar.onDrawFrame();
        }
        try {
            if (this.i) {
                SurfaceTexture surfaceTexture = this.f;
                if (surfaceTexture == null || this.g <= -1) {
                    return;
                }
                surfaceTexture.updateTexImage();
                this.e.a(null, null, this.g, 0);
                return;
            }
            if (this.f7069a != null) {
                if (this.d == null) {
                    float[] fArr = new float[16];
                    this.d = fArr;
                    Matrix.setIdentityM(fArr, 0);
                    Matrix.scaleM(this.d, 0, (((this.k / a(this.l, this.k, this.m, this.n).getWidth()) - 1.0f) / 2.0f) + 1.0f, 1.0f, 1.0f);
                }
                if (this.c == null) {
                    float[] fArr2 = new float[16];
                    this.c = fArr2;
                    Matrix.setIdentityM(fArr2, 0);
                    Matrix.rotateM(this.c, 0, 270.0f, 0.0f, 0.0f, 1.0f);
                    Matrix.translateM(this.c, 0, -1.0f, 0.0f, 0.0f);
                }
                this.b.a(this.d, this.c, this.f7069a.getId(), 0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        Log.d("VpasRenderer", "onSurfaceChanged() width * " + i + " * " + i2);
        GLES20.glViewport(0, 0, i, i2);
        this.m = i;
        this.n = i2;
        he heVar = this.b;
        if (heVar != null) {
            heVar.a(i, i2);
        }
        he heVar2 = this.e;
        if (heVar2 != null) {
            heVar2.a(i, i2);
        }
        a aVar = this.j;
        if (aVar != null) {
            if (!this.h) {
                aVar.onSurfaceChanged(i, i2);
            } else {
                aVar.onSurfaceCreated(this.f7069a, this.f, i, i2);
                this.h = false;
            }
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        Log.d("VpasRenderer", "onSurfaceCreated()");
        this.f7069a = new Texture(a(36197), 36197);
        this.b = new he(36197, 0);
        this.g = a(36197);
        this.f = new SurfaceTexture(this.g);
        this.e = new he(36197, 0);
        a aVar = this.j;
        if (aVar != null) {
            aVar.onSurfaceCreated(this.f7069a);
        }
    }
}
