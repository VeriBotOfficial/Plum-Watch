package com.autonavi.aps.amapapi.filters;

import com.amap.api.location.AMapLocation;

/* loaded from: classes12.dex */
public class FilterEntity {

    /* renamed from: a, reason: collision with root package name */
    double f6672a;
    double b;
    long c;
    float d;
    float e;
    int f;
    String g;

    public FilterEntity(AMapLocation aMapLocation, int i) {
        this.f6672a = aMapLocation.getLatitude();
        this.b = aMapLocation.getLongitude();
        this.c = aMapLocation.getTime();
        this.d = aMapLocation.getAccuracy();
        this.e = aMapLocation.getSpeed();
        this.f = i;
        this.g = aMapLocation.getProvider();
    }

    public boolean equals(Object obj) {
        try {
            if (!(obj instanceof FilterEntity)) {
                return false;
            }
            FilterEntity filterEntity = (FilterEntity) obj;
            if (this.f6672a == filterEntity.f6672a && this.b == filterEntity.b) {
                return this.f == filterEntity.f;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public int hashCode() {
        return Double.valueOf(this.f6672a).hashCode() + Double.valueOf(this.b).hashCode() + this.f;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f6672a);
        stringBuffer.append(",");
        stringBuffer.append(this.b);
        stringBuffer.append(",");
        stringBuffer.append(this.d);
        stringBuffer.append(",");
        stringBuffer.append(this.c);
        stringBuffer.append(",");
        stringBuffer.append(this.e);
        stringBuffer.append(",");
        stringBuffer.append(this.f);
        stringBuffer.append(",");
        stringBuffer.append(this.g);
        return stringBuffer.toString();
    }
}
