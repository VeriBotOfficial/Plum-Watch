package com.anythink.basead.handler;

import android.hardware.SensorEvent;
import com.anythink.core.common.d.t;
import com.anythink.core.common.u.e;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public class DuplicateShakeSensorChangeHandler extends BaseShakeSensorChangeHandlerImp {
    List<Double> d;
    long e;
    ATShackSensorListener m;
    float n;
    float o;
    float p;
    public long lastCallBackTimeMs = 0;
    private long s = 0;

    /* renamed from: q, reason: collision with root package name */
    String f2816q = "";
    List<Double> j = new ArrayList();
    List<Double> k = new ArrayList();
    List<Double> l = new ArrayList();
    long f = 0;
    int g = 0;
    int h = 0;
    int i = 0;
    boolean r = false;

    @Override // com.anythink.basead.handler.IShackSensorChangeHandler
    public void initSetting(ShakeSensorSetting shakeSensorSetting) {
        if (shakeSensorSetting != null) {
            this.s = shakeSensorSetting.getShakeTimeMs();
            this.d = shakeSensorSetting.getShakeStrengthList();
            this.e = shakeSensorSetting.getShakeDetectDurationTime();
            this.f2816q = shakeSensorSetting.toString();
        }
    }

    @Override // com.anythink.basead.handler.IShackSensorChangeHandler
    public void setListener(ATShackSensorListener aTShackSensorListener) {
        this.m = aTShackSensorListener;
    }

    @Override // com.anythink.basead.handler.IShackSensorChangeHandler
    public boolean handleSensorData(SensorEvent sensorEvent) {
        if (this.m != null && sensorEvent.values != null && sensorEvent.values.length >= 3) {
            try {
                float[] fArr = sensorEvent.values;
                float f = this.n;
                if (f == 0.0f) {
                    this.n = -fArr[0];
                    this.o = -fArr[1];
                    this.p = -fArr[2];
                    return false;
                }
                float f2 = (-fArr[0]) - f;
                float f3 = (-fArr[1]) - this.o;
                float f4 = (-fArr[2]) - this.p;
                a(sensorEvent);
                if (this.f == 0) {
                    this.f = a(f2, f3, f4);
                } else if (System.currentTimeMillis() - this.f > this.e) {
                    c();
                } else {
                    if (this.g > 0 && this.j.size() > 0) {
                        if (this.g >= this.j.size()) {
                            c();
                            return d();
                        }
                        double doubleValue = this.j.get(this.g).doubleValue();
                        if (f2 * doubleValue > 0.0d && Math.abs(f2) > Math.abs(doubleValue)) {
                            this.g++;
                        }
                    }
                    if (this.h > 0 && this.k.size() > 0) {
                        if (this.h >= this.k.size()) {
                            c();
                            return d();
                        }
                        double doubleValue2 = this.k.get(this.h).doubleValue();
                        if (f3 * doubleValue2 > 0.0d && Math.abs(f3) > Math.abs(doubleValue2)) {
                            this.h++;
                        }
                    }
                    if (this.i > 0 && this.l.size() > 0) {
                        if (this.i >= this.l.size()) {
                            c();
                            return d();
                        }
                        double doubleValue3 = this.l.get(this.i).doubleValue();
                        if (f4 * doubleValue3 > 0.0d && Math.abs(f4) > Math.abs(doubleValue3)) {
                            this.i++;
                        }
                    }
                    a(f2, f3, f4);
                }
            } catch (Throwable th) {
                if (!this.r) {
                    e.b("ShakeHandler", "Throwable:" + th.getMessage() + ",params:" + this.f2816q, t.b().r());
                    this.r = true;
                }
            }
        }
        return false;
    }

    private void c() {
        this.f = 0L;
        this.g = 0;
        this.j.clear();
        this.h = 0;
        this.k.clear();
        this.i = 0;
        this.l.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private long a(float r12, float r13, float r14) {
        /*
            r11 = this;
            r0 = 0
            double r1 = r11.a(r0)
            int r3 = r11.g
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L25
            float r3 = java.lang.Math.abs(r12)
            double r7 = (double) r3
            int r3 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r3 < 0) goto L25
            r11.a(r0, r12)
            r11.g = r4
            long r7 = r11.f
            int r12 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r12 != 0) goto L25
            long r7 = java.lang.System.currentTimeMillis()
            goto L26
        L25:
            r7 = r5
        L26:
            int r12 = r11.h
            if (r12 != 0) goto L42
            float r12 = java.lang.Math.abs(r13)
            double r9 = (double) r12
            int r12 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r12 < 0) goto L42
            r11.a(r4, r13)
            r11.h = r4
            long r12 = r11.f
            int r12 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r12 != 0) goto L42
            long r7 = java.lang.System.currentTimeMillis()
        L42:
            int r12 = r11.i
            if (r12 != 0) goto L60
            float r12 = java.lang.Math.abs(r14)
            double r12 = (double) r12
            int r12 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r12 < 0) goto L60
            r12 = 2
            r11.a(r12, r14)
            r11.i = r4
            long r12 = r11.f
            int r12 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r12 != 0) goto L60
            long r12 = java.lang.System.currentTimeMillis()
            return r12
        L60:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.handler.DuplicateShakeSensorChangeHandler.a(float, float, float):long");
    }

    private boolean d() {
        if (this.m == null) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.lastCallBackTimeMs <= this.s) {
            return false;
        }
        b();
        if (!this.m.onShakeTrigger()) {
            return false;
        }
        this.lastCallBackTimeMs = currentTimeMillis;
        a();
        return true;
    }

    private void a(int i, float f) {
        List<Double> list;
        if (i == 1) {
            list = this.k;
        } else if (i == 2) {
            list = this.l;
        } else {
            list = this.j;
        }
        list.clear();
        for (int i2 = 0; i2 < this.d.size() - 1; i2++) {
            double a2 = a(i2);
            if (f < 0.0f) {
                list.add(Double.valueOf((-1.0d) * a2));
                list.add(Double.valueOf(a2 * 1.0d));
            } else {
                list.add(Double.valueOf(1.0d * a2));
                list.add(Double.valueOf(a2 * (-1.0d)));
            }
        }
        double a3 = a(this.d.size() - 1);
        if (f < 0.0f) {
            list.add(Double.valueOf(a3 * (-1.0d)));
        } else {
            list.add(Double.valueOf(a3 * 1.0d));
        }
    }

    private double a(int i) {
        List<Double> list = this.d;
        if (list == null || list.size() <= i) {
            return Double.MAX_VALUE;
        }
        return this.d.get(i).doubleValue();
    }

    @Override // com.anythink.basead.handler.BaseShakeSensorChangeHandlerImp
    protected final void a() {
        super.a();
        c();
    }
}
