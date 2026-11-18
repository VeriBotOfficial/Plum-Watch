package com.baidu.ar.marker.model;

import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
public class Existance {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f7087a;
    public double[] b;
    public String c;
    public String d;

    public String getDirectionType() {
        return this.d;
    }

    public double[] getLatlng() {
        return this.b;
    }

    public String getStreetName() {
        return this.c;
    }

    public String getType() {
        return this.f7087a;
    }

    public void setDirectionType(String str) {
        this.d = str;
    }

    public void setLatlng(double[] dArr) {
        this.b = dArr;
    }

    public void setStreetName(String str) {
        this.c = str;
    }

    public void setType(String str) {
        this.f7087a = str;
    }

    public String toString() {
        return "Existance{type='" + this.f7087a + "', latlng=" + Arrays.toString(this.b) + ", streetName='" + this.c + "', directionType='" + this.d + "'}";
    }
}
