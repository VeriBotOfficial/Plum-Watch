package com.baidu.vi;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Message;
import com.umeng.analytics.pro.ak;
import java.util.List;

/* loaded from: classes13.dex */
public class VCompass {

    /* renamed from: a, reason: collision with root package name */
    private static final Handler f9042a = new a();
    private float c;
    private SensorManager b = null;
    private float d = 2.0f;
    private int e = 0;
    private SensorEventListener f = new b();

    static class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            VCompass vCompass = (VCompass) message.obj;
            if (vCompass == null) {
                return;
            }
            int i = message.what;
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                vCompass.b.unregisterListener(vCompass.f);
                return;
            }
            Context context = VIContext.getContext();
            if (vCompass.b == null) {
                vCompass.b = (SensorManager) context.getSystemService(ak.ac);
            }
            List<Sensor> sensorList = vCompass.b.getSensorList(3);
            if (sensorList.size() > 0) {
                vCompass.b.registerListener(vCompass.f, sensorList.get(0), 1);
            }
        }
    }

    class b implements SensorEventListener {
        b() {
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            if (sensorEvent.sensor.getType() != 3) {
                return;
            }
            VCompass.this.updateCompass((int) VCompass.this.a(sensorEvent.values[0]));
        }
    }

    private float a(float f, float f2, float f3) {
        float f4 = f - f2;
        return (f4 > 180.0f || f4 < -180.0f) ? f2 : (f4 < (-f3) || f3 < f4) ? (f + f2) / 2.0f : f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void updateCompass(int i);

    /* JADX INFO: Access modifiers changed from: private */
    public float a(float f) {
        float a2 = a(this.c, f, this.d);
        this.c = a2;
        return a2;
    }
}
