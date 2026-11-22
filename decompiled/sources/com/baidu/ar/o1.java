package com.baidu.ar;

import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import com.baidu.ar.arplay.representation.Quaternion;

/* loaded from: classes12.dex */
public class o1 extends u9 {
    public static final String r = "o1";
    public final Quaternion n;
    public long o;
    public int p;

    /* renamed from: q, reason: collision with root package name */
    public double f7100q;

    public o1(SensorManager sensorManager) {
        super(sensorManager);
        this.n = new Quaternion();
        this.p = 0;
        this.f7100q = 0.0d;
        h.a(r, "sensorList size " + String.valueOf(this.d.size()));
        if (this.d.size() > 120) {
            this.d.clear();
        }
        this.d.add(sensorManager.getDefaultSensor(4));
    }

    public final void f() {
        if (this.h) {
            u9.a(this.k.matrix, this.e.matrix, this.i.matrix);
            return;
        }
        float[] fArr = this.e.matrix;
        float[] fArr2 = this.i.matrix;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        Matrix.setIdentityM(this.k.matrix, 0);
        this.h = true;
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 4) {
            if (this.o != 0) {
                float f = (sensorEvent.timestamp - r0) * 1.0E-9f;
                float[] fArr = sensorEvent.values;
                float f2 = fArr[0];
                float f3 = fArr[1];
                float f4 = fArr[2];
                double sqrt = Math.sqrt((f2 * f2) + (f3 * f3) + (f4 * f4));
                this.f7100q = sqrt;
                if (sqrt > 0.10000000149011612d) {
                    f2 = (float) (f2 / sqrt);
                    f3 = (float) (f3 / sqrt);
                    f4 = (float) (f4 / sqrt);
                }
                double d = (sqrt * f) / 2.0d;
                double sin = Math.sin(d);
                double cos = Math.cos(d);
                this.n.setX((float) (f2 * sin));
                this.n.setY((float) (f3 * sin));
                this.n.setZ((float) (sin * f4));
                this.n.setW(-((float) cos));
                synchronized (this.c) {
                    Quaternion quaternion = this.n;
                    Quaternion quaternion2 = this.f;
                    quaternion.multiplyByQuat(quaternion2, quaternion2);
                }
                Quaternion m7197clone = this.f.m7197clone();
                m7197clone.w(-m7197clone.w());
                synchronized (this.c) {
                    SensorManager.getRotationMatrixFromVector(this.e.matrix, m7197clone.toArray());
                }
            }
            this.o = sensorEvent.timestamp;
            int i = this.p + 1;
            this.p = i;
            if (i > 20) {
                f();
                setChanged();
                notifyObservers();
            }
        }
    }
}
