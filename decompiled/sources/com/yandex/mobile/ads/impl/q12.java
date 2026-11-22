package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import com.yandex.mobile.ads.impl.nf1;
import com.yandex.mobile.ads.impl.t52;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes5.dex */
public final class q12 extends GLSurfaceView {

    /* renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArrayList<b> f16622a;
    private final SensorManager b;
    private final Sensor c;
    private final nf1 d;
    private final Handler e;
    private final nt1 f;
    private SurfaceTexture g;
    private Surface h;
    private boolean i;
    private boolean j;
    private boolean k;

    public interface b {
        void a(Surface surface);

        void b();
    }

    public q12(Context context) {
        this(context, null);
    }

    public final se2 b() {
        return this.f;
    }

    public final wn a() {
        return this.f;
    }

    public void setDefaultStereoMode(int i) {
        this.f.a(i);
    }

    public void setUseSensorRotation(boolean z) {
        this.i = z;
        d();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.j = true;
        d();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.j = false;
        d();
        super.onPause();
    }

    public q12(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16622a = new CopyOnWriteArrayList<>();
        this.e = new Handler(Looper.getMainLooper());
        SensorManager sensorManager = (SensorManager) hg.a(context.getSystemService(com.umeng.analytics.pro.ak.ac));
        this.b = sensorManager;
        Sensor defaultSensor = f92.f15466a >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.c = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        nt1 nt1Var = new nt1();
        this.f = nt1Var;
        a aVar = new a(nt1Var);
        View.OnTouchListener t52Var = new t52(context, aVar);
        this.d = new nf1(((WindowManager) hg.a((WindowManager) context.getSystemService("window"))).getDefaultDisplay(), t52Var, aVar);
        this.i = true;
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setOnTouchListener(t52Var);
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.q12$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                q12.this.c();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Surface surface = this.h;
        if (surface != null) {
            Iterator<b> it = this.f16622a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
        SurfaceTexture surfaceTexture = this.g;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
        this.g = null;
        this.h = null;
    }

    private void d() {
        boolean z = this.i && this.j;
        Sensor sensor = this.c;
        if (sensor == null || z == this.k) {
            return;
        }
        if (z) {
            this.b.registerListener(this.d, sensor, 0);
        } else {
            this.b.unregisterListener(this.d);
        }
        this.k = z;
    }

    final class a implements GLSurfaceView.Renderer, t52.a, nf1.a {

        /* renamed from: a, reason: collision with root package name */
        private final nt1 f16623a;
        private final float[] d;
        private final float[] e;
        private final float[] f;
        private float g;
        private float h;
        private final float[] b = new float[16];
        private final float[] c = new float[16];
        private final float[] i = new float[16];
        private final float[] j = new float[16];

        public a(nt1 nt1Var) {
            float[] fArr = new float[16];
            this.d = fArr;
            float[] fArr2 = new float[16];
            this.e = fArr2;
            float[] fArr3 = new float[16];
            this.f = fArr3;
            this.f16623a = nt1Var;
            Matrix.setIdentityM(fArr, 0);
            Matrix.setIdentityM(fArr2, 0);
            Matrix.setIdentityM(fArr3, 0);
            this.h = 3.1415927f;
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            q12.this.b(this.f16623a.a());
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
            GLES20.glViewport(0, 0, i, i2);
            float f = i / i2;
            Matrix.perspectiveM(this.b, 0, f > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f)) * 2.0d) : 90.0f, f, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onDrawFrame(GL10 gl10) {
            synchronized (this) {
                Matrix.multiplyMM(this.j, 0, this.d, 0, this.f, 0);
                Matrix.multiplyMM(this.i, 0, this.e, 0, this.j, 0);
            }
            Matrix.multiplyMM(this.c, 0, this.b, 0, this.i, 0);
            this.f16623a.a(this.c);
        }

        @Override // com.yandex.mobile.ads.impl.nf1.a
        public final synchronized void a(float[] fArr, float f) {
            float[] fArr2 = this.d;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            float f2 = -f;
            this.h = f2;
            Matrix.setRotateM(this.e, 0, -this.g, (float) Math.cos(f2), (float) Math.sin(this.h), 0.0f);
        }

        public final synchronized void a(PointF pointF) {
            float f = pointF.y;
            this.g = f;
            Matrix.setRotateM(this.e, 0, -f, (float) Math.cos(this.h), (float) Math.sin(this.h), 0.0f);
            Matrix.setRotateM(this.f, 0, -pointF.x, 0.0f, 1.0f, 0.0f);
        }

        public final boolean a(MotionEvent motionEvent) {
            return q12.this.performClick();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final SurfaceTexture surfaceTexture) {
        this.e.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.q12$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                q12.this.a(surfaceTexture);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = this.g;
        Surface surface = this.h;
        Surface surface2 = new Surface(surfaceTexture);
        this.g = surfaceTexture;
        this.h = surface2;
        Iterator<b> it = this.f16622a.iterator();
        while (it.hasNext()) {
            it.next().a(surface2);
        }
        if (surfaceTexture2 != null) {
            surfaceTexture2.release();
        }
        if (surface != null) {
            surface.release();
        }
    }
}
