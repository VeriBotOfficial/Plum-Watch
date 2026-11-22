package com.baidu.platform.comapi.wnplatform.k;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Message;
import android.view.Display;
import android.view.WindowManager;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: WNewSensorManager.java */
/* loaded from: classes13.dex */
public class c extends a implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    private Context f8922a;
    private SensorManager e;
    private Sensor f;
    private boolean g;
    private Handler i;

    /* renamed from: q, reason: collision with root package name */
    private com.baidu.platform.comapi.wnplatform.model.datastruct.a f8923q;
    private double r;
    private double s;
    private double t;
    private int b = -1;
    private float[] c = new float[3];
    private float[] d = new float[9];
    private Object h = new Object();
    private ArrayList<b> j = new ArrayList<>();
    private float[] k = new float[3];
    private float[] l = new float[3];
    private com.baidu.platform.comapi.wnplatform.model.datastruct.a m = new com.baidu.platform.comapi.wnplatform.model.datastruct.a();
    private com.baidu.platform.comapi.wnplatform.model.datastruct.a n = new com.baidu.platform.comapi.wnplatform.model.datastruct.a();
    private float[] o = new float[9];
    private float[] p = new float[3];

    public c() {
        this.e = null;
        this.f = null;
        Context a2 = com.baidu.platform.comapi.wnplatform.p.q.a.a();
        this.f8922a = a2;
        try {
            SensorManager sensorManager = (SensorManager) a2.getSystemService(ak.ac);
            this.e = sensorManager;
            this.f = sensorManager.getDefaultSensor(11);
        } catch (Exception unused) {
            this.e = null;
            this.f = null;
        }
        this.g = false;
    }

    private double a(double d) {
        return (((d + 90.0d) / 90.0d) * (-30.0d)) + d;
    }

    private boolean c() {
        synchronized (this.h) {
            if (this.g) {
                return true;
            }
            if (((SensorManager) this.f8922a.getSystemService(ak.ac)) == null) {
                return false;
            }
            boolean b = b();
            this.g = b;
            return b;
        }
    }

    private void e() {
        synchronized (this.h) {
            if (this.g) {
                SensorManager sensorManager = (SensorManager) this.f8922a.getSystemService(ak.ac);
                if (sensorManager == null) {
                    return;
                }
                this.g = false;
                try {
                    sensorManager.unregisterListener(this);
                } catch (Exception unused) {
                }
            }
        }
    }

    public void a(Context context, Handler handler) {
        c();
        this.i = handler;
    }

    public void b(b bVar) {
        this.j.remove(bVar);
    }

    public void d() {
        e();
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
        Handler handler;
        if ((i == 1 || i == 0 || i == -1) && (handler = this.i) != null) {
            handler.sendEmptyMessage(3);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        com.baidu.platform.comapi.wnplatform.d.a.b("onSensorChanged acc:" + sensorEvent.accuracy);
        if (this.e == null) {
            return;
        }
        com.baidu.platform.comapi.wnplatform.model.datastruct.a b = sensorEvent.sensor.getType() == 11 ? b(sensorEvent) : (sensorEvent.sensor.getType() == 1 || sensorEvent.sensor.getType() == 2) ? a(sensorEvent) : null;
        Iterator<b> it = this.j.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (b != null) {
                next.a(b);
            }
        }
    }

    @Override // com.baidu.platform.comapi.walknavi.a
    public boolean ready() {
        return false;
    }

    @Override // com.baidu.platform.comapi.walknavi.a
    public void release() {
        d();
    }

    private boolean b() {
        SensorManager sensorManager;
        boolean registerListener;
        try {
            sensorManager = (SensorManager) this.f8922a.getSystemService(ak.ac);
        } catch (Exception unused) {
            sensorManager = null;
        }
        if (sensorManager == null) {
            return false;
        }
        Sensor defaultSensor = sensorManager.getDefaultSensor(11);
        Sensor defaultSensor2 = sensorManager.getDefaultSensor(1);
        Sensor defaultSensor3 = sensorManager.getDefaultSensor(2);
        if (defaultSensor != null) {
            try {
                registerListener = sensorManager.registerListener(this, defaultSensor, 2);
            } catch (Exception unused2) {
            }
            if (!registerListener && defaultSensor2 != null && defaultSensor3 != null) {
                try {
                    return sensorManager.registerListener(this, defaultSensor2, 2) && sensorManager.registerListener(this, defaultSensor3, 2);
                } catch (Exception unused3) {
                }
            }
            return registerListener;
        }
        registerListener = false;
        if (!registerListener) {
            if (sensorManager.registerListener(this, defaultSensor2, 2)) {
                return false;
            }
        }
        return registerListener;
    }

    public void a(b bVar) {
        this.j.add(bVar);
    }

    private com.baidu.platform.comapi.wnplatform.model.datastruct.a a(SensorEvent sensorEvent) {
        com.baidu.platform.comapi.wnplatform.model.datastruct.a clone;
        com.baidu.platform.comapi.wnplatform.d.a.a("onSensorChanged type:" + sensorEvent.sensor.getType());
        sensorEvent.values.clone();
        int type = sensorEvent.sensor.getType();
        if (1 == type) {
            this.k = a((float[]) sensorEvent.values.clone(), this.k);
        }
        if (2 == type) {
            this.l = a((float[]) sensorEvent.values.clone(), this.l);
        }
        SensorManager.getRotationMatrix(this.o, null, this.k, this.l);
        SensorManager.getOrientation(this.o, this.p);
        synchronized (this.n) {
            com.baidu.platform.comapi.wnplatform.model.datastruct.a aVar = this.n;
            float[] fArr = this.k;
            aVar.f8930a = fArr[0];
            aVar.b = fArr[1];
            aVar.c = fArr[2];
            float degrees = (float) Math.toDegrees(this.p[0]);
            if (degrees < 0.0f && degrees > -180.0f) {
                degrees += 360.0f;
            }
            this.n.d = degrees;
            this.n.e = (float) Math.toDegrees(this.p[1]);
            float degrees2 = (float) Math.toDegrees(this.p[2]);
            com.baidu.platform.comapi.wnplatform.model.datastruct.a aVar2 = this.n;
            aVar2.f = degrees2;
            clone = aVar2.clone();
            this.m = clone;
        }
        return clone;
    }

    private com.baidu.platform.comapi.wnplatform.model.datastruct.a b(SensorEvent sensorEvent) {
        c cVar;
        WindowManager windowManager;
        Display defaultDisplay;
        double degrees;
        int type = sensorEvent.sensor.getType();
        if (this.f == null || 11 != type) {
            cVar = this;
        } else {
            try {
                SensorManager.getRotationMatrixFromVector(this.d, sensorEvent.values);
                SensorManager.getOrientation(this.d, this.c);
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                windowManager = (WindowManager) this.f8922a.getSystemService("window");
            } catch (Exception unused) {
                windowManager = null;
            }
            if (windowManager == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) {
                return null;
            }
            try {
                int rotation = defaultDisplay.getRotation() * 90;
                int i = 0;
                if (type == 11) {
                    if (rotation == 0) {
                        float[] fArr = this.c;
                        degrees = Math.toDegrees(fArr[0] - fArr[2]);
                    } else {
                        float[] fArr2 = this.c;
                        degrees = Math.toDegrees(fArr2[0] - fArr2[1]);
                    }
                    i = ((((int) degrees) + rotation) + 360) % 360;
                }
                this.b = i;
                double d = i;
                cVar = this;
                cVar.a(d, Math.toDegrees(this.c[1]), Math.toDegrees(this.c[2]));
                com.baidu.platform.comapi.wnplatform.model.datastruct.a aVar = new com.baidu.platform.comapi.wnplatform.model.datastruct.a();
                cVar.f8923q = aVar;
                aVar.d = d;
                aVar.e = a(cVar.s - 90.0d);
                com.baidu.platform.comapi.wnplatform.model.datastruct.a aVar2 = cVar.f8923q;
                aVar2.f = 0.0d;
                aVar2.g = sensorEvent.accuracy;
                if (cVar.i != null) {
                    Message message = new Message();
                    message.what = 2;
                    message.obj = cVar.f8923q;
                    cVar.i.sendMessage(message);
                }
            } catch (ArrayIndexOutOfBoundsException unused2) {
                return null;
            }
        }
        return cVar.f8923q;
    }

    private void a(double d, double d2, double d3) {
        double atan2;
        double d4;
        double d5;
        double radians = Math.toRadians(d);
        double radians2 = 0.0d - Math.toRadians(d2);
        double radians3 = Math.toRadians(d3);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double cos2 = Math.cos(radians2);
        double sin2 = Math.sin(radians2);
        double cos3 = Math.cos(radians3);
        double sin3 = Math.sin(radians3);
        double d6 = cos * sin2;
        double[] dArr = {(sin * sin3) - (d6 * cos3), (-cos) * cos2, (d6 * sin3) + (sin * cos3), cos2 * cos3, -sin2, (-cos2) * sin3, (sin * sin2 * cos3) + (cos * sin3), cos2 * sin, ((-sin) * sin2 * sin3) + (cos * cos3)};
        double d7 = dArr[3];
        if (d7 > 0.9999d) {
            atan2 = Math.atan2(dArr[2], dArr[8]);
            d5 = 1.5707963267948966d;
        } else if (d7 < -0.9999d) {
            atan2 = Math.atan2(dArr[2], dArr[8]);
            d5 = -1.5707963267948966d;
        } else {
            atan2 = Math.atan2(-dArr[6], dArr[0]);
            double atan22 = Math.atan2(-dArr[5], dArr[4]);
            double asin = Math.asin(dArr[3]);
            if (Double.isNaN(asin)) {
                d4 = atan22;
                d5 = 0.0d;
            } else {
                d4 = atan22;
                d5 = asin;
            }
            this.r = (atan2 * 180.0d) / 3.141592653589793d;
            this.s = (d5 * 180.0d) / 3.141592653589793d;
            this.t = (d4 * 180.0d) / 3.141592653589793d;
        }
        d4 = 0.0d;
        this.r = (atan2 * 180.0d) / 3.141592653589793d;
        this.s = (d5 * 180.0d) / 3.141592653589793d;
        this.t = (d4 * 180.0d) / 3.141592653589793d;
    }

    private float[] a(float[] fArr, float[] fArr2) {
        if (fArr2 == null || fArr == null) {
            return fArr;
        }
        int length = fArr2.length <= fArr.length ? fArr2.length : fArr.length;
        for (int i = 0; i < length; i++) {
            float f = fArr2[i];
            fArr2[i] = f + ((fArr[i] - f) * 0.1f);
        }
        return fArr2;
    }
}
