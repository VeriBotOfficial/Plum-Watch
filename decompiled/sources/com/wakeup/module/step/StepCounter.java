package com.wakeup.module.step;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* loaded from: classes4.dex */
class StepCounter implements SensorEventListener {
    private int firstStep = 0;
    private int counterStep = 0;
    private boolean isRunning = true;

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    StepCounter() {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() != 19) {
            return;
        }
        int i = (int) sensorEvent.values[0];
        if (this.firstStep == 0 || !this.isRunning) {
            this.firstStep = i;
        }
        int i2 = this.firstStep;
        if (i - i2 > 0) {
            this.counterStep += i - i2;
            this.firstStep = i;
        }
    }

    public int getCurrentStep() {
        return this.counterStep;
    }

    public void setCounterStep(int i) {
        this.counterStep = i;
    }

    public void setRunning(boolean z) {
        this.isRunning = z;
    }

    public void resetData() {
        this.isRunning = false;
        this.firstStep = 0;
        this.counterStep = 0;
    }
}
