package com.wakeup.feature.friend.model;

/* loaded from: classes3.dex */
public class ShareItemModel {
    public static final int TYPE_BLOODOXYGEN = 5;
    public static final int TYPE_BLOODPRESSURE = 6;
    public static final int TYPE_BREATH = 10;
    public static final int TYPE_FATIGUE = 9;
    public static final int TYPE_GLUCOSE = 8;
    public static final int TYPE_HEART = 4;
    public static final int TYPE_HEAT = 3;
    public static final int TYPE_MILEAGE = 2;
    public static final int TYPE_SLEEP = 7;
    public static final int TYPE_STEP = 1;
    private float data1;
    private float data2;
    private int type;

    public ShareItemModel(int i, float f) {
        this.type = i;
        this.data1 = f;
    }

    public ShareItemModel(int i, float f, float f2) {
        this.type = i;
        this.data1 = f;
        this.data2 = f2;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int i) {
        this.type = i;
    }

    public float getData1() {
        return this.data1;
    }

    public void setData1(float f) {
        this.data1 = f;
    }

    public float getData2() {
        return this.data2;
    }

    public void setData2(float f) {
        this.data2 = f;
    }
}
