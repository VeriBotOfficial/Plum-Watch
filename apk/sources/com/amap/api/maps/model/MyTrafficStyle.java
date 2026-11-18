package com.amap.api.maps.model;

/* JADX INFO: loaded from: classes7.dex */
public class MyTrafficStyle {
    private int extremelySmoothColor = -15229099;
    private int smoothColor = -16735735;
    private int slowColor = -35576;
    private int congestedColor = -1441006;
    private int seriousCongestedColor = -7208950;
    private float ratio = 0.8f;
    private int trafficRoadBackgroundColor = -1;

    public int getCongestedColor() {
        return this.congestedColor;
    }

    public int getExtremelySmoothColor() {
        return this.extremelySmoothColor;
    }

    public float getRatio() {
        return this.ratio;
    }

    public int getSeriousCongestedColor() {
        return this.seriousCongestedColor;
    }

    public int getSlowColor() {
        return this.slowColor;
    }

    public int getSmoothColor() {
        return this.smoothColor;
    }

    public int getTrafficRoadBackgroundColor() {
        return this.trafficRoadBackgroundColor;
    }

    public void setCongestedColor(int r1) {
        this.congestedColor = r1;
    }

    public void setExtremelySmoothColor(int r1) {
        this.extremelySmoothColor = r1;
    }

    public void setRatio(float f) {
        this.ratio = f;
    }

    public void setSeriousCongestedColor(int r1) {
        this.seriousCongestedColor = r1;
    }

    public void setSlowColor(int r1) {
        this.slowColor = r1;
    }

    public void setSmoothColor(int r1) {
        this.smoothColor = r1;
    }

    public void setTrafficRoadBackgroundColor(int r1) {
        this.trafficRoadBackgroundColor = r1;
    }
}
