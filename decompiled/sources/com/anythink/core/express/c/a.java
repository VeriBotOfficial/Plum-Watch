package com.anythink.core.express.c;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.anythink.core.common.d.t;
import com.umeng.analytics.pro.ak;

/* loaded from: classes12.dex */
public class a {
    private static volatile a d;

    /* renamed from: a, reason: collision with root package name */
    Sensor f4553a;
    private final String b = "a";
    private SensorManager c;
    private float[] e;

    private a() {
        Context g = t.b().g();
        if (g != null) {
            try {
                if (this.c == null) {
                    this.c = (SensorManager) g.getSystemService(ak.ac);
                }
                if (this.f4553a == null) {
                    this.f4553a = this.c.getDefaultSensor(1);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static a a() {
        if (d == null) {
            synchronized (a.class) {
                if (d == null) {
                    d = new a();
                }
            }
        }
        return d;
    }

    public final boolean b() {
        return this.f4553a != null;
    }

    public final void a(SensorEventListener sensorEventListener) {
        try {
            this.c.registerListener(sensorEventListener, this.f4553a, 2);
            sensorEventListener.hashCode();
        } catch (Throwable unused) {
        }
    }

    public final void b(SensorEventListener sensorEventListener) {
        SensorManager sensorManager = this.c;
        if (sensorManager != null) {
            try {
                sensorManager.unregisterListener(sensorEventListener);
                sensorEventListener.hashCode();
            } catch (Throwable unused) {
            }
        }
    }

    public final synchronized float[] c() {
        return this.e;
    }

    public final synchronized void a(float[] fArr) {
        this.e = fArr;
    }
}
