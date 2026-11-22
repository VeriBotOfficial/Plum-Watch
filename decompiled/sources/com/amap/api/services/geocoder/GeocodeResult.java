package com.amap.api.services.geocoder;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public class GeocodeResult {

    /* renamed from: a, reason: collision with root package name */
    private GeocodeQuery f2117a;
    private List<GeocodeAddress> b;

    public GeocodeResult(GeocodeQuery geocodeQuery, List<GeocodeAddress> list) {
        new ArrayList();
        this.f2117a = geocodeQuery;
        this.b = list;
    }

    public List<GeocodeAddress> getGeocodeAddressList() {
        return this.b;
    }

    public GeocodeQuery getGeocodeQuery() {
        return this.f2117a;
    }

    public void setGeocodeAddressList(List<GeocodeAddress> list) {
        this.b = list;
    }

    public void setGeocodeQuery(GeocodeQuery geocodeQuery) {
        this.f2117a = geocodeQuery;
    }
}
