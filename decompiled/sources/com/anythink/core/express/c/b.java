package com.anythink.core.express.c;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;

/* loaded from: classes12.dex */
public abstract class b implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    public static final int f4554a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public float d = 0.0f;
    public float e = 0.0f;
    public float f = 0.0f;
    public long g = 0;
    private int h;
    private int i;

    public abstract void a();

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public b(int i, int i2) {
        this.h = i;
        this.i = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
    
        if (java.lang.Math.abs(r9 - r2) > r8.h) goto L14;
     */
    @Override // android.hardware.SensorEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSensorChanged(android.hardware.SensorEvent r9) {
        /*
            r8 = this;
            float[] r9 = r9.values
            r0 = 0
            r0 = r9[r0]
            float r0 = -r0
            r1 = 1
            r1 = r9[r1]
            float r1 = -r1
            r2 = 2
            r9 = r9[r2]
            float r9 = -r9
            int r2 = (int) r0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = (int) r1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r4 = (int) r9
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3, r4}
            java.lang.String r3 = "mtg handleSensorData lastx:%d,lasty:%d,lastz:%d"
            java.lang.String.format(r3, r2)
            float r2 = r8.d
            r3 = 0
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 == 0) goto L3a
            float r2 = r0 - r2
            float r2 = java.lang.Math.abs(r2)
            int r4 = r8.h
            float r4 = (float) r4
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 > 0) goto L60
        L3a:
            float r2 = r8.e
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 == 0) goto L4d
            float r2 = r1 - r2
            float r2 = java.lang.Math.abs(r2)
            int r4 = r8.h
            float r4 = (float) r4
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 > 0) goto L60
        L4d:
            float r2 = r8.f
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 == 0) goto L74
            float r2 = r9 - r2
            float r2 = java.lang.Math.abs(r2)
            int r3 = r8.h
            float r3 = (float) r3
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L74
        L60:
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r8.g
            long r4 = r2 - r4
            int r6 = r8.i
            long r6 = (long) r6
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 <= 0) goto L74
            r8.g = r2
            r8.a()
        L74:
            r8.d = r0
            r8.e = r1
            r8.f = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.express.c.b.onSensorChanged(android.hardware.SensorEvent):void");
    }
}
