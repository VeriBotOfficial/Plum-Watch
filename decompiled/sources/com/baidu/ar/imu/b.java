package com.baidu.ar.imu;

import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import com.baidu.ar.k7;

/* loaded from: classes12.dex */
public class b extends k7 {
    public float[] w;
    public float[] x;

    public b(SensorManager sensorManager) {
        super(sensorManager);
        this.d.add(sensorManager.getDefaultSensor(9));
        this.d.add(sensorManager.getDefaultSensor(4));
        this.d.add(sensorManager.getDefaultSensor(11));
    }

    @Override // com.baidu.ar.k7, android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr;
        if (sensorEvent.sensor.getType() == 11 || sensorEvent.sensor.getType() == 4) {
            super.onSensorChanged(sensorEvent);
        } else if (sensorEvent.sensor.getType() == 2) {
            this.w = (float[]) sensorEvent.values.clone();
        } else if (sensorEvent.sensor.getType() == 9) {
            float[] fArr2 = (float[]) sensorEvent.values.clone();
            this.x = fArr2;
            this.l = fArr2;
        }
        float[] fArr3 = this.w;
        if (fArr3 == null || (fArr = this.x) == null) {
            return;
        }
        SensorManager.getRotationMatrix(this.e.matrix, new float[16], fArr, fArr3);
        this.f.setRowMajor(this.e.matrix);
    }
}
