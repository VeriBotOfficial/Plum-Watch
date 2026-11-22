package com.baidu.ar;

import android.util.Log;

/* loaded from: classes12.dex */
public class t2 {

    /* renamed from: a, reason: collision with root package name */
    public float[] f7206a;
    public float b = -1.0f;
    public float c;

    public boolean a(float f) {
        float f2 = this.b;
        if (f2 == -1.0f) {
            this.b = f;
            return false;
        }
        if (f <= f2) {
            return false;
        }
        Log.e("CoordinateStrategy", "The condition of rebinding coordinate system is satisfied: heading accuracy > localAccuracy");
        this.b = f;
        return true;
    }

    public boolean a(float[] fArr, float f) {
        if (this.f7206a == null) {
            this.f7206a = fArr;
        }
        if (f < this.c) {
            Log.e("CoordinateStrategy", "The condition of rebinding coordinate system is satisfied: accuracy < mLatlonAcuracy: accuracy:" + f + ", mLatlonAcuracy:" + this.c);
            this.c = f;
            return true;
        }
        float[] fArr2 = this.f7206a;
        float a2 = u8.a(fArr2[0], fArr2[1], fArr[0], fArr[1]);
        Log.e("CoordinateStrategy", "distance:" + a2);
        if (a2 < 20.0f) {
            return false;
        }
        this.f7206a = fArr;
        Log.e("CoordinateStrategy", "The condition of rebinding coordinate system is satisfied: latlng diatance >=20");
        return true;
    }
}
