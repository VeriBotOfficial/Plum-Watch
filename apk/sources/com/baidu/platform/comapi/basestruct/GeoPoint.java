package com.baidu.platform.comapi.basestruct;

/* JADX INFO: loaded from: classes15.dex */
public class GeoPoint {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double f8505a;
    private double b;

    public GeoPoint(int r3, int r4) {
        this.f8505a = r3;
        this.b = r4;
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        GeoPoint geoPoint = (GeoPoint) obj;
        return Math.abs(this.f8505a - geoPoint.f8505a) <= 1.0E-6d && Math.abs(this.b - geoPoint.b) <= 1.0E-6d;
    }

    public double getLatitude() {
        return this.f8505a;
    }

    public double getLatitudeE6() {
        return this.f8505a;
    }

    public double getLongitude() {
        return this.b;
    }

    public double getLongitudeE6() {
        return this.b;
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public void setLatitude(double d) {
        this.f8505a = d;
    }

    public void setLatitudeE6(double d) {
        this.f8505a = d;
    }

    public void setLongitude(double d) {
        this.b = d;
    }

    public void setLongitudeE6(double d) {
        this.b = d;
    }

    public String toString() {
        return "GeoPoint: Latitude: " + this.f8505a + ", Longitude: " + this.b;
    }

    public void setLatitude(int r3) {
        this.f8505a = r3;
    }

    public void setLongitude(int r3) {
        this.b = r3;
    }

    public GeoPoint(double d, double d2) {
        this.f8505a = d;
        this.b = d2;
    }
}
