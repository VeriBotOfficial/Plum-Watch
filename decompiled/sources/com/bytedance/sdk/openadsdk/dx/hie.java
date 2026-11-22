package com.bytedance.sdk.openadsdk.dx;

import android.content.Context;
import android.hardware.SensorEventListener;
import android.os.Vibrator;
import java.lang.ref.WeakReference;

/* loaded from: classes14.dex */
public class hie {
    public static WeakReference<fxn> fxn;
    protected static final float[] kg = new float[3];
    protected static final float[] gff = new float[3];
    protected static final float[] hm = new float[9];
    protected static final float[] rb = new float[3];

    public static void fxn(Context context, SensorEventListener sensorEventListener) {
    }

    public static void fxn(fxn fxnVar) {
        fxn = new WeakReference<>(fxnVar);
    }

    public static void fxn(Context context, SensorEventListener sensorEventListener, int i) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            WeakReference<fxn> weakReference = fxn;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (Throwable th) {
            sg.fxn("SensorHub", "startListenAccelerometer error", th);
        }
    }

    public static void kg(Context context, SensorEventListener sensorEventListener, int i) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            WeakReference<fxn> weakReference = fxn;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (Throwable th) {
            sg.fxn("SensorHub", "startListenGyroscope error", th);
        }
    }

    public static void gff(Context context, SensorEventListener sensorEventListener, int i) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            WeakReference<fxn> weakReference = fxn;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (Throwable th) {
            sg.fxn("SensorHub", "startListenLinearAcceleration error", th);
        }
    }

    public static void hm(Context context, SensorEventListener sensorEventListener, int i) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            WeakReference<fxn> weakReference = fxn;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (Throwable th) {
            sg.fxn("SensorHub", "startListenRotationVector err", th);
        }
    }

    public static void fxn(Context context, long j) {
        if (context == null) {
            return;
        }
        ((Vibrator) context.getSystemService("vibrator")).vibrate(j);
    }
}
