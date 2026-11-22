package com.amap.api.services.geocoder;

/* loaded from: classes11.dex */
public class RegeocodeResult {

    /* renamed from: a, reason: collision with root package name */
    private RegeocodeQuery f2122a;
    private RegeocodeAddress b;

    public RegeocodeResult(RegeocodeQuery regeocodeQuery, RegeocodeAddress regeocodeAddress) {
        this.f2122a = regeocodeQuery;
        this.b = regeocodeAddress;
    }

    public RegeocodeAddress getRegeocodeAddress() {
        return this.b;
    }

    public RegeocodeQuery getRegeocodeQuery() {
        return this.f2122a;
    }

    public void setRegeocodeAddress(RegeocodeAddress regeocodeAddress) {
        this.b = regeocodeAddress;
    }

    public void setRegeocodeQuery(RegeocodeQuery regeocodeQuery) {
        this.f2122a = regeocodeQuery;
    }
}
