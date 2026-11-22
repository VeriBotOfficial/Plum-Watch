package com.baidu.ar;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.baidu.ar.arplay.representation.Matrix;
import com.baidu.ar.arplay.representation.Matrixf4x4;
import com.baidu.ar.arplay.representation.Quaternion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;

/* loaded from: classes12.dex */
public abstract class u9 extends Observable implements SensorEventListener {
    public static final String m = "u9";
    public SensorManager g;
    public float[] l;

    /* renamed from: a, reason: collision with root package name */
    public Object f7241a = new Object();
    public Boolean b = Boolean.TRUE;
    public final Object c = new Object();
    public List<Sensor> d = new ArrayList();
    public boolean h = false;
    public final Matrixf4x4 e = new Matrixf4x4();
    public final Quaternion f = new Quaternion();
    public final Matrixf4x4 i = new Matrixf4x4();
    public final Matrixf4x4 j = new Matrixf4x4();
    public final Matrixf4x4 k = new Matrixf4x4();

    public u9(SensorManager sensorManager) {
        this.g = sensorManager;
        h.a(m, "sensorList size " + String.valueOf(this.d.size()));
        if (this.d.size() > 120) {
            this.d.clear();
        }
    }

    public static void a(float[] fArr, float[] fArr2, float[] fArr3) {
        float[] fArr4 = new float[16];
        Matrix.setIdentityM(fArr4, 0);
        Matrix.invertM(fArr4, 0, fArr3, 0);
        Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr4, 0);
    }

    public static boolean a(float[] fArr, float[] fArr2) {
        float f;
        float[] fArr3 = new float[4];
        float[] fArr4 = {1.0f, 0.0f, 0.0f, 0.0f};
        Matrix.multiplyMV(fArr3, fArr2, fArr4);
        if (Float.compare(fArr3[0], fArr4[0]) == 0 && Float.compare(fArr3[1], fArr4[1]) == 0 && Float.compare(fArr3[2], fArr4[2]) == 0) {
            return false;
        }
        float f2 = 0.0f;
        int compare = Float.compare(fArr3[0], 0.0f);
        int compare2 = Float.compare(fArr3[1], 0.0f);
        if (compare != 0) {
            double d = fArr3[1] / fArr3[0];
            f2 = (compare <= 0 || compare2 < 0) ? (compare <= 0 || compare2 >= 0) ? ((float) ((Math.atan(d) * 180.0d) / 3.141592653589793d)) + 180.0f : 360.0f + ((float) ((Math.atan(d) * 180.0d) / 3.141592653589793d)) : (float) ((Math.atan(d) * 180.0d) / 3.141592653589793d);
        } else if (Float.compare(fArr3[1], 1.0f) != 0 && Float.compare(fArr3[1], -1.0f) == 0) {
            f = 180.0f;
            h.a(m, "orientation: outputV[0] = " + fArr3[0] + ", outputV[1] = " + fArr3[1] + ", angleZ = " + f);
            Matrix.setIdentityM(fArr, 0);
            Matrix.rotateM(fArr, 0, f, 0.0f, 0.0f, 1.0f);
            return true;
        }
        f = f2;
        h.a(m, "orientation: outputV[0] = " + fArr3[0] + ", outputV[1] = " + fArr3[1] + ", angleZ = " + f);
        Matrix.setIdentityM(fArr, 0);
        Matrix.rotateM(fArr, 0, f, 0.0f, 0.0f, 1.0f);
        return true;
    }

    public static void b(float[] fArr, float[] fArr2) {
        System.arraycopy(fArr2, 0, fArr, 0, fArr2.length);
    }

    public Matrixf4x4 a() {
        return this.k;
    }

    public float[] b() {
        return this.l;
    }

    public boolean c() {
        Iterator<Sensor> it = this.d.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                return false;
            }
        }
        return true;
    }

    public void d() {
        deleteObservers();
        Iterator<Sensor> it = this.d.iterator();
        while (it.hasNext()) {
            this.g.unregisterListener(this, it.next());
        }
        this.d.clear();
    }

    public void e() {
        Iterator<Sensor> it = this.d.iterator();
        while (it.hasNext()) {
            this.g.registerListener(this, it.next(), 1);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }
}
