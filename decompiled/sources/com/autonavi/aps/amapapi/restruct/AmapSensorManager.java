package com.autonavi.aps.amapapi.restruct;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import com.autonavi.aps.amapapi.utils.CoreUtil;
import com.autonavi.aps.amapapi.utils.Utils;
import com.umeng.analytics.pro.ak;

/* loaded from: classes12.dex */
public class AmapSensorManager implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    private Context f6678a;
    SensorManager b;
    Sensor c;
    Sensor d;
    Sensor e;
    public boolean isRegisterSensorEventListener = false;
    public double mAltitude = 0.0d;
    public float mPressure = 0.0f;
    private float f = 1013.25f;
    private float g = 0.0f;
    Handler h = new Handler();
    double i = 0.0d;
    double j = 0.0d;
    double k = 0.0d;
    double l = 0.0d;
    double[] m = new double[3];
    volatile double n = 0.0d;
    long o = 0;
    long p = 0;

    public AmapSensorManager(Context context) {
        this.f6678a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        try {
            this.f6678a = context;
            if (this.b == null) {
                this.b = (SensorManager) context.getSystemService(ak.ac);
            }
            try {
                this.c = this.b.getDefaultSensor(6);
            } catch (Throwable unused) {
            }
            try {
                this.d = this.b.getDefaultSensor(11);
            } catch (Throwable unused2) {
            }
            try {
                this.e = this.b.getDefaultSensor(1);
            } catch (Throwable unused3) {
            }
        } catch (Throwable th) {
            CoreUtil.reportError(th, "AMapSensorManager", "<init>");
        }
    }

    private void a(float[] fArr) {
        double[] dArr = this.m;
        double d = dArr[0] * 0.800000011920929d;
        float f = fArr[0];
        double d2 = d + (f * 0.19999999f);
        dArr[0] = d2;
        double d3 = dArr[1] * 0.800000011920929d;
        float f2 = fArr[1];
        double d4 = d3 + (f2 * 0.19999999f);
        dArr[1] = d4;
        double d5 = dArr[2] * 0.800000011920929d;
        float f3 = fArr[2];
        double d6 = d5 + (0.19999999f * f3);
        dArr[2] = d6;
        this.i = f - d2;
        this.j = f2 - d4;
        this.k = f3 - d6;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.o < 100) {
            return;
        }
        double d7 = this.i;
        double d8 = this.j;
        double d9 = (d7 * d7) + (d8 * d8);
        double d10 = this.k;
        double sqrt = Math.sqrt(d9 + (d10 * d10));
        this.p++;
        this.o = currentTimeMillis;
        this.n += sqrt;
        if (this.p >= 30) {
            this.l = this.n / this.p;
            this.n = 0.0d;
            this.p = 0L;
        }
    }

    public void destroy() {
        try {
            stopListener();
            this.c = null;
            this.d = null;
            this.b = null;
            this.e = null;
            this.isRegisterSensorEventListener = false;
        } catch (Throwable th) {
            CoreUtil.reportError(th, "AMapSensorManager", "destroy");
        }
    }

    public double getAltitude() {
        return this.mAltitude;
    }

    public float getBearing() {
        return this.g;
    }

    public float getPressure() {
        return this.mPressure;
    }

    public double getSpeed() {
        return this.l;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr;
        if (sensorEvent == null) {
            return;
        }
        try {
            int type = sensorEvent.sensor.getType();
            if (type == 1) {
                if (this.e != null) {
                    a((float[]) sensorEvent.values.clone());
                    return;
                }
                return;
            }
            if (type == 6) {
                if (this.c != null) {
                    float[] fArr2 = (float[]) sensorEvent.values.clone();
                    if (fArr2 != null) {
                        this.mPressure = fArr2[0];
                    }
                    if (fArr2 != null) {
                        this.mAltitude = Utils.formatFloatKeep2Point(SensorManager.getAltitude(this.f, fArr2[0]));
                        return;
                    }
                    return;
                }
                return;
            }
            if (type != 11 || this.d == null || (fArr = (float[]) sensorEvent.values.clone()) == null) {
                return;
            }
            float[] fArr3 = new float[9];
            SensorManager.getRotationMatrixFromVector(fArr3, fArr);
            SensorManager.getOrientation(fArr3, new float[3]);
            float degrees = (float) Math.toDegrees(r4[0]);
            this.g = degrees;
            if (degrees <= 0.0f) {
                degrees += 360.0f;
            }
            this.g = (float) Math.floor(degrees);
        } catch (Throwable unused) {
        }
    }

    public void startListener() {
        SensorManager sensorManager = this.b;
        if (sensorManager == null || this.isRegisterSensorEventListener) {
            return;
        }
        this.isRegisterSensorEventListener = true;
        try {
            Sensor sensor = this.c;
            if (sensor != null) {
                sensorManager.registerListener(this, sensor, 3, this.h);
            }
        } catch (Throwable th) {
            CoreUtil.reportError(th, "AMapSensorManager", "registerListener mPressure");
        }
        try {
            Sensor sensor2 = this.d;
            if (sensor2 != null) {
                this.b.registerListener(this, sensor2, 3, this.h);
            }
        } catch (Throwable th2) {
            CoreUtil.reportError(th2, "AMapSensorManager", "registerListener mRotationVector");
        }
        try {
            Sensor sensor3 = this.e;
            if (sensor3 != null) {
                this.b.registerListener(this, sensor3, 3, this.h);
            }
        } catch (Throwable th3) {
            CoreUtil.reportError(th3, "AMapSensorManager", "registerListener mAcceleroMeterVector");
        }
    }

    public void stopListener() {
        SensorManager sensorManager = this.b;
        if (sensorManager == null || !this.isRegisterSensorEventListener) {
            return;
        }
        this.isRegisterSensorEventListener = false;
        try {
            Sensor sensor = this.c;
            if (sensor != null) {
                sensorManager.unregisterListener(this, sensor);
            }
        } catch (Throwable unused) {
        }
        try {
            Sensor sensor2 = this.d;
            if (sensor2 != null) {
                this.b.unregisterListener(this, sensor2);
            }
        } catch (Throwable unused2) {
        }
        try {
            Sensor sensor3 = this.e;
            if (sensor3 != null) {
                this.b.unregisterListener(this, sensor3);
            }
        } catch (Throwable unused3) {
        }
    }
}
