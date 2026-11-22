package com.baidu.location.indoor;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes13.dex */
public class k {
    private SensorManager c;
    private int d;
    private Sensor e;
    private Sensor f;
    private Set<b> b = Collections.synchronizedSet(new HashSet());
    private boolean g = true;
    private float[] h = new float[3];
    private float[] i = new float[9];
    private float j = -1.0f;
    private int k = 0;
    private String l = null;
    private long m = 0;
    private long n = 3000;
    private ArrayList<Long> o = new ArrayList<>();

    /* renamed from: a, reason: collision with root package name */
    public SensorEventListener f7778a = new SensorEventListener() { // from class: com.baidu.location.indoor.k.1
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            String a2;
            int type = sensorEvent.sensor.getType();
            if (type != 1) {
                if (type != 11) {
                    return;
                }
                SensorManager.getRotationMatrixFromVector(k.this.i, (float[]) sensorEvent.values.clone());
                SensorManager.getOrientation(k.this.i, k.this.h);
                float[] fArr = new float[3];
                double degrees = Math.toDegrees(k.this.h[0]);
                if (degrees < 0.0d) {
                    fArr[2] = ((float) (degrees + 360.0d)) % 360.0f;
                } else {
                    fArr[2] = (float) degrees;
                }
                k.this.j = fArr[2];
                fArr[0] = (float) Math.toDegrees(k.this.h[1]);
                fArr[1] = (float) Math.toDegrees(k.this.h[2]);
                if (k.this.g && com.baidu.location.indoor.mapversion.a.c()) {
                    com.baidu.location.indoor.mapversion.a.a(5, fArr, System.currentTimeMillis());
                    return;
                }
                return;
            }
            float[] fArr2 = (float[]) sensorEvent.values.clone();
            k.this.m = System.currentTimeMillis();
            if (!k.this.g || !com.baidu.location.indoor.mapversion.a.c() || (a2 = com.baidu.location.indoor.mapversion.a.a(1, fArr2, System.currentTimeMillis())) == null || a2.length() <= 1) {
                return;
            }
            float d = com.baidu.location.indoor.mapversion.a.d();
            if (d > 0.01f) {
                k.b(k.this);
            }
            try {
                synchronized (k.this.b) {
                    Iterator it = k.this.b.iterator();
                    while (it.hasNext()) {
                        ((b) it.next()).a(d, k.this.j, k.this.j, System.currentTimeMillis(), a2);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    };

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static k f7780a = new k();
    }

    public interface b {
        void a(double d, double d2, double d3, long j, String str);
    }

    public k() {
        a(com.baidu.location.f.getServiceContext(), 1);
    }

    public static k a() {
        return a.f7780a;
    }

    private void a(Context context, int i) {
        try {
            SensorManager sensorManager = (SensorManager) context.getSystemService(ak.ac);
            this.c = sensorManager;
            this.d = i;
            this.e = sensorManager.getDefaultSensor(1);
            this.f = this.c.getDefaultSensor(11);
            e();
        } catch (Exception unused) {
        }
    }

    static /* synthetic */ int b(k kVar) {
        int i = kVar.k;
        kVar.k = i + 1;
        return i;
    }

    private void e() {
        int intValue;
        try {
            List<Sensor> sensorList = this.c.getSensorList(-1);
            HashMap hashMap = new HashMap();
            hashMap.put(1, 0);
            hashMap.put(10, 1);
            hashMap.put(9, 2);
            hashMap.put(4, 3);
            hashMap.put(2, 4);
            hashMap.put(11, 5);
            hashMap.put(6, 6);
            hashMap.put(14, 7);
            hashMap.put(16, 8);
            int size = hashMap.size();
            char[] cArr = new char[size];
            for (int i = 0; i < size; i++) {
                cArr[i] = '0';
            }
            Iterator<Sensor> it = sensorList.iterator();
            while (it.hasNext()) {
                int type = it.next().getType();
                if (hashMap.get(Integer.valueOf(type)) != null && (intValue = ((Integer) hashMap.get(Integer.valueOf(type))).intValue()) < size) {
                    cArr[intValue] = '1';
                }
            }
            this.l = new String(cArr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void a(b bVar) {
        synchronized (this.b) {
            if (!this.b.contains(bVar)) {
                this.b.add(bVar);
            }
            if (this.b.size() == 1) {
                Sensor sensor = this.e;
                if (sensor != null) {
                    try {
                        this.c.registerListener(this.f7778a, sensor, this.d);
                    } catch (Exception unused) {
                        this.g = false;
                    }
                    if (com.baidu.location.indoor.mapversion.a.c()) {
                        com.baidu.location.indoor.mapversion.a.a();
                    }
                }
                Sensor sensor2 = this.f;
                if (sensor2 != null) {
                    try {
                        this.c.registerListener(this.f7778a, sensor2, this.d);
                    } catch (Exception unused2) {
                        this.g = false;
                    }
                }
            }
        }
    }

    public synchronized int b() {
        return this.k;
    }

    public void b(b bVar) {
        synchronized (this.b) {
            if (this.b.contains(bVar)) {
                this.b.remove(bVar);
            }
            if (this.b.size() == 0) {
                try {
                    this.c.unregisterListener(this.f7778a);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (com.baidu.location.indoor.mapversion.a.c()) {
                    com.baidu.location.indoor.mapversion.a.b();
                }
            }
        }
    }

    public double c() {
        return this.j;
    }

    protected String d() {
        return this.l;
    }
}
