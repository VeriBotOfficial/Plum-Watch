package com.baidu.ar;

import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import com.baidu.ar.arplay.representation.Quaternion;

/* loaded from: classes12.dex */
public class l7 extends u9 {
    public static final String v = "l7";
    public final Quaternion n;
    public Quaternion o;
    public Quaternion p;

    /* renamed from: q, reason: collision with root package name */
    public long f7062q;
    public double r;
    public boolean s;
    public int t;
    public int u;

    public l7(SensorManager sensorManager) {
        super(sensorManager);
        this.n = new Quaternion();
        this.o = new Quaternion();
        this.p = new Quaternion();
        this.r = 0.0d;
        this.s = false;
        this.u = 0;
        this.d.add(sensorManager.getDefaultSensor(4));
        this.d.add(sensorManager.getDefaultSensor(11));
    }

    public static void c(float[] fArr, float[] fArr2) {
        if (fArr2.length >= 4) {
            fArr[0] = fArr2[3];
        } else {
            float f = fArr2[0];
            float f2 = 1.0f - (f * f);
            float f3 = fArr2[1];
            float f4 = f2 - (f3 * f3);
            float f5 = fArr2[2];
            float f6 = f4 - (f5 * f5);
            fArr[0] = f6;
            fArr[0] = f6 > 0.0f ? (float) Math.sqrt(f6) : 0.0f;
        }
        fArr[1] = fArr2[0];
        fArr[2] = fArr2[1];
        fArr[3] = fArr2[2];
    }

    public final void a(Quaternion quaternion) {
        Quaternion m7197clone = quaternion.m7197clone();
        m7197clone.w(-m7197clone.w());
        synchronized (this.c) {
            this.f.copyVec4(quaternion);
            SensorManager.getRotationMatrixFromVector(this.e.matrix, m7197clone.toArray());
            int i = this.u + 1;
            this.u = i;
            if (i > 20) {
                f();
                setChanged();
                notifyObservers();
            }
        }
    }

    public void f() {
        if (this.h) {
            u9.a(this.k.matrix, this.e.matrix, this.i.matrix);
            return;
        }
        this.h = true;
        float[] fArr = this.e.matrix;
        System.arraycopy(fArr, 0, this.i.matrix, 0, fArr.length);
        Matrix.setIdentityM(this.k.matrix, 0);
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() != 11) {
            if (sensorEvent.sensor.getType() == 4) {
                synchronized (this.f7241a) {
                    if (this.b.booleanValue()) {
                        if (this.f7062q != 0) {
                            float f = (sensorEvent.timestamp - r0) * 1.0E-9f;
                            float[] fArr = sensorEvent.values;
                            float f2 = fArr[0];
                            float f3 = fArr[1];
                            float f4 = fArr[2];
                            double sqrt = Math.sqrt((f2 * f2) + (f3 * f3) + (f4 * f4));
                            this.r = sqrt;
                            if (sqrt > 0.10000000149011612d) {
                                f2 = (float) (f2 / sqrt);
                                f3 = (float) (f3 / sqrt);
                                f4 = (float) (f4 / sqrt);
                            } else {
                                this.r = 0.0d;
                            }
                            double d = (this.r * f) / 2.0d;
                            double sin = Math.sin(d);
                            double cos = Math.cos(d);
                            this.n.setX((float) (f2 * sin));
                            this.n.setY((float) (f3 * sin));
                            this.n.setZ((float) (sin * f4));
                            this.n.setW(-((float) cos));
                            Quaternion quaternion = this.n;
                            Quaternion quaternion2 = this.o;
                            quaternion.multiplyByQuat(quaternion2, quaternion2);
                            float dotProduct = this.o.dotProduct(this.p);
                            if (Math.abs(dotProduct) < 0.0f) {
                                if (Math.abs(dotProduct) < 0.0f) {
                                    this.t++;
                                }
                                a(this.o);
                            } else {
                                Quaternion quaternion3 = new Quaternion();
                                this.o.slerp(this.p, quaternion3, (float) (this.r * 0.009999999776482582d));
                                a(quaternion3);
                                this.o.copyVec4(quaternion3);
                                this.t = 0;
                            }
                            if (this.t > 60) {
                                String str = v;
                                h.a(str, "Rotation VectorPanic counter is bigger than threshold; this indicates a Gyroscope failure. Panic reset is imminent.");
                                double d2 = this.r;
                                if (d2 < 3.0d) {
                                    h.a(str, "Rotation VectorPerforming Panic-reset. Resetting orientation to rotation-vector value.");
                                    a(this.p);
                                    this.o.copyVec4(this.p);
                                    this.t = 0;
                                } else {
                                    h.a(str, "Rotation Vector" + String.format("Panic reset delayed due to ongoing motion (user is still shaking the device). Gyroscope Velocity: %.2f > 3", Double.valueOf(d2)));
                                }
                            }
                        }
                        this.f7062q = sensorEvent.timestamp;
                        return;
                    }
                    return;
                }
            }
            return;
        }
        synchronized (this.f7241a) {
            int i = 0;
            while (true) {
                float[] fArr2 = sensorEvent.values;
                if (i >= fArr2.length) {
                    float[] fArr3 = new float[4];
                    try {
                        SensorManager.getQuaternionFromVector(fArr3, fArr2);
                    } catch (Exception unused) {
                        c(fArr3, sensorEvent.values);
                    }
                    this.p.setXYZW(fArr3[1], fArr3[2], fArr3[3], -fArr3[0]);
                    if (this.s) {
                        return;
                    }
                    this.o.set(this.p);
                    this.s = true;
                    return;
                }
                if (Float.isNaN(fArr2[i])) {
                    this.b = Boolean.FALSE;
                    return;
                }
                i++;
            }
        }
    }
}
