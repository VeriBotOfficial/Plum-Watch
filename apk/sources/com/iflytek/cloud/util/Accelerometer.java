package com.iflytek.cloud.util;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.umeng.analytics.pro.ak;

/* JADX INFO: loaded from: classes2.dex */
public class Accelerometer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static CLOCKWISE_ANGLE f11221a;
    private SensorManager b;
    private boolean c = false;
    private SensorEventListener d = new a();

    public enum CLOCKWISE_ANGLE {
        Deg0(0),
        Deg90(1),
        Deg180(2),
        Deg270(3);

        private int value;

        CLOCKWISE_ANGLE(int r3) {
            this.value = r3;
        }

        public int getValue() {
            return this.value;
        }
    }

    class a implements SensorEventListener {
        a() {
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int r2) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            if (sensorEvent.sensor.getType() == 1) {
                float[] fArr = sensorEvent.values;
                float f = fArr[0];
                float f2 = fArr[1];
                float f3 = fArr[2];
                if (Math.abs(f) > 3.0f || Math.abs(f2) > 3.0f) {
                    if (Math.abs(f) > Math.abs(f2)) {
                        if (f > 0.0f) {
                            CLOCKWISE_ANGLE unused = Accelerometer.f11221a = CLOCKWISE_ANGLE.Deg0;
                            return;
                        } else {
                            CLOCKWISE_ANGLE unused2 = Accelerometer.f11221a = CLOCKWISE_ANGLE.Deg180;
                            return;
                        }
                    }
                    if (f2 > 0.0f) {
                        CLOCKWISE_ANGLE unused3 = Accelerometer.f11221a = CLOCKWISE_ANGLE.Deg90;
                    } else {
                        CLOCKWISE_ANGLE unused4 = Accelerometer.f11221a = CLOCKWISE_ANGLE.Deg270;
                    }
                }
            }
        }
    }

    public Accelerometer(Context context) {
        this.b = null;
        this.b = (SensorManager) context.getSystemService(ak.ac);
        f11221a = CLOCKWISE_ANGLE.Deg0;
    }

    public static int getDirection() {
        return f11221a.getValue();
    }

    public void start() {
        if (this.c) {
            return;
        }
        this.c = true;
        f11221a = CLOCKWISE_ANGLE.Deg0;
        SensorManager sensorManager = this.b;
        sensorManager.registerListener(this.d, sensorManager.getDefaultSensor(1), 3);
    }

    public void stop() {
        if (this.c) {
            this.c = false;
            this.b.unregisterListener(this.d);
        }
    }
}
