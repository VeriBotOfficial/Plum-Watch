package com.baidu.ar;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.util.Log;
import com.umeng.analytics.pro.ak;
import com.wakeup.module.record.Constants;

/* loaded from: classes12.dex */
public class j0 implements SensorEventListener {
    public static j0 f;

    /* renamed from: a, reason: collision with root package name */
    public SensorManager f6999a;
    public float b = 0.0f;
    public float c = 0.0f;
    public float d = 0.0f;
    public k0 e;

    public static synchronized j0 a() {
        j0 j0Var;
        synchronized (j0.class) {
            if (f == null) {
                f = new j0();
            }
            j0Var = f;
        }
        return j0Var;
    }

    public void a(Context context, k0 k0Var) {
        Log.e("Accelerometer", Constants.ON_START_KEY);
        if (this.e != null) {
            return;
        }
        if (this.f6999a == null) {
            this.f6999a = (SensorManager) context.getSystemService(ak.ac);
        }
        SensorManager sensorManager = this.f6999a;
        sensorManager.registerListener(this, sensorManager.getDefaultSensor(1), 3);
        this.e = k0Var;
    }

    public void b() {
        Log.e("Accelerometer", "onStop");
        SensorManager sensorManager = this.f6999a;
        if (sensorManager == null) {
            return;
        }
        sensorManager.unregisterListener(this);
        this.e = null;
        this.f6999a = null;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 1) {
            float[] fArr = sensorEvent.values;
            float f2 = fArr[0];
            this.b = f2;
            float f3 = fArr[1];
            this.c = f3;
            float f4 = fArr[2];
            this.d = f4;
            this.e.a(f2, f3, f4);
        }
    }
}
