package com.amap.api.services.route;

/* JADX INFO: loaded from: classes7.dex */
public class Cost {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f2155a;
    private float b;
    private String c;
    private float d;
    private int e;

    public float getDuration() {
        return this.f2155a;
    }

    public float getTollDistance() {
        return this.b;
    }

    public String getTollRoad() {
        return this.c;
    }

    public float getTolls() {
        return this.d;
    }

    public int getTrafficLights() {
        return this.e;
    }

    public void setDuration(float f) {
        this.f2155a = f;
    }

    public void setTollDistance(float f) {
        this.b = f;
    }

    public void setTollRoad(String str) {
        this.c = str;
    }

    public void setTolls(float f) {
        this.d = f;
    }

    public void setTrafficLights(int r1) {
        this.e = r1;
    }
}
