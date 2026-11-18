package com.anythink.basead.d;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* JADX INFO: loaded from: classes7.dex */
public abstract class d implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f2328a = 0;
    private long b = 2000;

    public abstract boolean a(SensorEvent sensorEvent);

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int r2) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f2328a <= this.b || !a(sensorEvent)) {
            return;
        }
        this.f2328a = jCurrentTimeMillis;
    }
}
