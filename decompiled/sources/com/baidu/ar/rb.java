package com.baidu.ar;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.umeng.analytics.pro.ak;
import java.util.LinkedList;

/* loaded from: classes12.dex */
public class rb implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    public SensorManager f7146a;
    public Sensor b;
    public a c;
    public Context d;
    public boolean e = true;
    public LinkedList<Double> f = new LinkedList<>();
    public LinkedList<Float> g = new LinkedList<>();
    public LinkedList<Float> h = new LinkedList<>();
    public LinkedList<Float> i = new LinkedList<>();
    public int j = 10;
    public double k = 0.0d;
    public boolean l = true;
    public boolean m = false;

    public interface a {
        void a(float f, float f2, float f3, float f4);

        void destroy();
    }

    public rb(Context context) {
        this.d = context;
    }

    public void a() {
        SensorManager sensorManager;
        SensorManager sensorManager2 = (SensorManager) this.d.getSystemService(ak.ac);
        this.f7146a = sensorManager2;
        if (sensorManager2 != null) {
            Sensor defaultSensor = sensorManager2.getDefaultSensor(10);
            this.b = defaultSensor;
            if (defaultSensor == null) {
                this.b = this.f7146a.getDefaultSensor(1);
                this.m = true;
            }
        }
        Sensor sensor = this.b;
        if (sensor == null || (sensorManager = this.f7146a) == null) {
            return;
        }
        sensorManager.registerListener(this, sensor, 1);
    }

    public void a(float f, float f2, float f3) {
        a aVar;
        double sqrt = Math.sqrt((f * f) + (f2 * f2) + (f3 * f3));
        if (sqrt > this.k) {
            this.k = sqrt;
        }
        h.a("max acc is : " + this.k);
        a(this.f, sqrt);
        a((LinkedList) this.g, Math.abs(f));
        a((LinkedList) this.h, Math.abs(f2));
        a((LinkedList) this.i, Math.abs(f3));
        if (this.f.size() == this.j) {
            float f4 = 0.0f;
            double d = 0.0d;
            float f5 = 0.0f;
            float f6 = 0.0f;
            for (int i = 0; i < this.f.size(); i++) {
                d += this.f.get(i).doubleValue();
                f6 += this.g.get(i).floatValue();
                f5 += this.h.get(i).floatValue();
                f4 += this.i.get(i).floatValue();
            }
            int i2 = this.j;
            double d2 = d / i2;
            float f7 = i2;
            float f8 = f6 / f7;
            float f9 = f5 / f7;
            float f10 = f4 / f7;
            if (this.m) {
                if (!this.l) {
                    if (d2 < 10.0d) {
                        this.l = true;
                        aVar = this.c;
                        if (aVar == null) {
                            return;
                        }
                        aVar.a(f8, f9, f10, (float) this.k);
                        this.k = 0.0d;
                    }
                    return;
                }
                if (d2 <= 10.0d) {
                    return;
                }
                this.l = false;
            }
            if (this.l) {
                if (d2 <= 5.0d) {
                    return;
                }
                this.l = false;
            } else if (d2 < 5.0d) {
                this.l = true;
                aVar = this.c;
                if (aVar == null) {
                    return;
                }
                aVar.a(f8, f9, f10, (float) this.k);
                this.k = 0.0d;
            }
        }
    }

    public void a(a aVar) {
        this.c = aVar;
    }

    public void a(LinkedList linkedList, double d) {
        if (linkedList.size() >= this.j) {
            linkedList.poll();
        }
        linkedList.offer(Double.valueOf(d));
    }

    public void a(LinkedList linkedList, float f) {
        if (linkedList.size() >= this.j) {
            linkedList.poll();
        }
        linkedList.offer(Float.valueOf(f));
    }

    public void a(boolean z) {
        this.e = z;
    }

    public void b() {
        a aVar = this.c;
        if (aVar != null) {
            aVar.destroy();
            this.c = null;
        }
        SensorManager sensorManager = this.f7146a;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
            this.f7146a = null;
        }
        this.m = false;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (this.e) {
            float[] fArr = sensorEvent.values;
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            a(f, f2, f3);
            h.a("acc  x : " + f + " , y : " + f2 + ", z : " + f3);
        }
    }
}
