package com.king.zxing;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.preference.PreferenceManager;
import com.king.zxing.camera.CameraManager;
import com.king.zxing.camera.FrontLightMode;
import com.umeng.analytics.pro.ak;

/* loaded from: classes17.dex */
final class AmbientLightManager implements SensorEventListener {
    protected static final float BRIGHT_ENOUGH_LUX = 100.0f;
    protected static final float TOO_DARK_LUX = 45.0f;
    private CameraManager cameraManager;
    private final Context context;
    private Sensor lightSensor;
    private float tooDarkLux = TOO_DARK_LUX;
    private float brightEnoughLux = 100.0f;

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    AmbientLightManager(Context context) {
        this.context = context;
    }

    void start(CameraManager cameraManager) {
        this.cameraManager = cameraManager;
        if (FrontLightMode.readPref(PreferenceManager.getDefaultSharedPreferences(this.context)) == FrontLightMode.AUTO) {
            SensorManager sensorManager = (SensorManager) this.context.getSystemService(ak.ac);
            Sensor defaultSensor = sensorManager.getDefaultSensor(5);
            this.lightSensor = defaultSensor;
            if (defaultSensor != null) {
                sensorManager.registerListener(this, defaultSensor, 3);
            }
        }
    }

    void stop() {
        if (this.lightSensor != null) {
            ((SensorManager) this.context.getSystemService(ak.ac)).unregisterListener(this);
            this.cameraManager = null;
            this.lightSensor = null;
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        float f = sensorEvent.values[0];
        CameraManager cameraManager = this.cameraManager;
        if (cameraManager != null) {
            if (f <= this.tooDarkLux) {
                cameraManager.sensorChanged(true, f);
            } else if (f >= this.brightEnoughLux) {
                cameraManager.sensorChanged(false, f);
            }
        }
    }

    public void setTooDarkLux(float f) {
        this.tooDarkLux = f;
    }

    public void setBrightEnoughLux(float f) {
        this.brightEnoughLux = f;
    }
}
