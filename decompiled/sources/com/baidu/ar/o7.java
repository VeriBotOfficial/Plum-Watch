package com.baidu.ar;

import android.hardware.SensorManager;
import com.baidu.ar.arplay.representation.Matrix;
import java.util.Observable;
import java.util.Observer;

/* loaded from: classes12.dex */
public class o7 implements Observer {
    public static final String m = "o7";
    public static final float[] n = {-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    public static final float[] o = {0.0f, 0.0f, -1.0f, 0.0f};

    /* renamed from: a, reason: collision with root package name */
    public u9 f7104a;
    public q7 b;
    public n7 c;
    public float d;
    public float[] h;
    public float[] e = new float[16];
    public float f = -1.0f;
    public float g = 10000.0f;
    public boolean i = true;
    public boolean j = false;
    public float[] k = new float[4];
    public float[] l = new float[16];

    public o7() {
        float[] fArr = new float[16];
        this.h = fArr;
        Matrix.setIdentityM(fArr, 0);
    }

    public final float a(float[] fArr) {
        Matrix.multiplyMV(this.k, 0, fArr, 0, o, 0);
        float[] fArr2 = this.k;
        if (fArr2[2] > 0.0f) {
            return -1.0f;
        }
        float f = fArr2[0];
        float f2 = fArr2[1];
        return 90.0f - ((float) ((Math.atan(Math.abs(this.k[2]) / ((float) Math.sqrt((f * f) + (f2 * f2)))) / 3.141592653589793d) * 180.0d));
    }

    public final u9 a(com.baidu.ar.imu.a aVar, SensorManager sensorManager) {
        u9 bVar;
        if (aVar != com.baidu.ar.imu.a.RELATIVE) {
            bVar = this.b.c() ? new com.baidu.ar.imu.b(sensorManager) : new k7(sensorManager);
        } else if (this.b.f()) {
            bVar = new l7(sensorManager);
            if (!this.i) {
                bVar.h = true;
                bVar.i.matrix = this.h;
            }
            this.i = false;
        } else {
            bVar = new o1(sensorManager);
        }
        bVar.addObserver(this);
        return bVar;
    }

    public final void a() {
        u9 u9Var = this.f7104a;
        if (u9Var != null) {
            u9Var.d();
            this.f7104a = null;
        }
    }

    public boolean a(SensorManager sensorManager, q7 q7Var, n7 n7Var) {
        if (q7Var == null) {
            return false;
        }
        this.b = q7Var;
        this.c = n7Var;
        if (q7Var.a() == com.baidu.ar.imu.a.RELATIVE && !this.b.f()) {
            this.i = true;
        }
        try {
            if (this.f7104a == null) {
                this.f7104a = a(this.b.a(), sensorManager);
            }
            if (!this.f7104a.c()) {
                return false;
            }
            this.f7104a.e();
            return true;
        } catch (Throwable th) {
            h.b(m, "IMUController start: " + th.getMessage());
            return false;
        }
    }

    public final float b(float[] fArr) {
        float f = -fArr[0];
        float f2 = -fArr[1];
        if (f2 == 0.0f && f < 0.0f) {
            return 0.0f;
        }
        if (f2 == 0.0f && f > 0.0f) {
            return 180.0f;
        }
        if (f == 0.0f && f2 < 0.0f) {
            return 90.0f;
        }
        if (f == 0.0f && f2 > 0.0f) {
            return 270.0f;
        }
        float atan = (float) ((Math.atan(Math.abs(f2) / Math.abs(f)) / 3.141592653589793d) * 180.0d);
        if (f > 0.0f && f2 < 0.0f) {
            atan = 180.0f - atan;
        }
        if (f > 0.0f && f2 > 0.0f) {
            atan += 180.0f;
        }
        return (f >= 0.0f || f2 <= 0.0f) ? atan : 360.0f - atan;
    }

    public void b() {
        q7 q7Var;
        if (this.f7104a != null && (q7Var = this.b) != null && q7Var.a() == com.baidu.ar.imu.a.RELATIVE && !this.j && this.b.f()) {
            this.h = this.f7104a.i.matrix;
            this.j = true;
        }
        try {
            a();
            this.c = null;
            this.b = null;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void c(float[] fArr) {
        Matrix.invertM(this.e, 0, fArr, 0);
        Matrix.multiplyMM(this.l, 0, n, 0, this.e, 0);
        float a2 = a(this.l);
        this.f = a2;
        if (a2 > 0.0f) {
            float pow = (float) (Math.pow(1.13d, a2) + 600.0d);
            this.g = pow;
            if (pow > 15000.0f) {
                this.g = 15000.0f;
            }
        }
        Matrix.multiplyMV(this.k, 0, this.l, 0, new float[]{0.0f, 0.0f, -this.g, 1.0f}, 0);
        float[] fArr2 = this.l;
        float[] fArr3 = this.k;
        fArr2[12] = -fArr3[0];
        fArr2[13] = -fArr3[1];
        fArr2[14] = -fArr3[2];
        Matrix.invertM(this.e, 0, fArr2, 0);
        float b = b(this.k);
        this.d = b;
        Matrix.rotateM(this.e, 0, b, 0.0f, 0.0f, 1.0f);
    }

    @Override // java.util.Observer
    public void update(Observable observable, Object obj) {
        try {
            if (this.b != null && this.c != null) {
                float[] fArr = this.f7104a.a().matrix;
                if (this.b.d() || this.b.e()) {
                    c(fArr);
                }
                float[] b = this.f7104a.b();
                m7 m7Var = new m7();
                if (this.b.e()) {
                    m7Var.b(this.e);
                } else {
                    m7Var.b(fArr);
                }
                m7Var.a(this.d);
                m7Var.a(this.b.b());
                m7Var.a(b);
                this.c.onImuUpdate(m7Var);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
