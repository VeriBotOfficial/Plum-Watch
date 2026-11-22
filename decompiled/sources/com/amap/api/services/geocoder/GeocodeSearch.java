package com.amap.api.services.geocoder;

import android.content.Context;
import com.amap.api.col.p0003sl.g8;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.interfaces.IGeocodeSearch;
import java.util.List;

/* loaded from: classes11.dex */
public final class GeocodeSearch {
    public static final String AMAP = "autonavi";
    public static final String EXTENSIONS_ALL = "all";
    public static final String EXTENSIONS_BASE = "base";
    public static final String GPS = "gps";

    /* renamed from: a, reason: collision with root package name */
    private IGeocodeSearch f2118a;

    public interface OnGeocodeSearchListener {
        void onGeocodeSearched(GeocodeResult geocodeResult, int i);

        void onRegeocodeSearched(RegeocodeResult regeocodeResult, int i);
    }

    public GeocodeSearch(Context context) throws AMapException {
        if (this.f2118a == null) {
            try {
                this.f2118a = new g8(context);
            } catch (Exception e) {
                e.printStackTrace();
                if (e instanceof AMapException) {
                    throw ((AMapException) e);
                }
            }
        }
    }

    public RegeocodeAddress getFromLocation(RegeocodeQuery regeocodeQuery) throws AMapException {
        IGeocodeSearch iGeocodeSearch = this.f2118a;
        if (iGeocodeSearch != null) {
            return iGeocodeSearch.getFromLocation(regeocodeQuery);
        }
        return null;
    }

    public void getFromLocationAsyn(RegeocodeQuery regeocodeQuery) {
        IGeocodeSearch iGeocodeSearch = this.f2118a;
        if (iGeocodeSearch != null) {
            iGeocodeSearch.getFromLocationAsyn(regeocodeQuery);
        }
    }

    public List<GeocodeAddress> getFromLocationName(GeocodeQuery geocodeQuery) throws AMapException {
        IGeocodeSearch iGeocodeSearch = this.f2118a;
        if (iGeocodeSearch != null) {
            return iGeocodeSearch.getFromLocationName(geocodeQuery);
        }
        return null;
    }

    public void getFromLocationNameAsyn(GeocodeQuery geocodeQuery) {
        IGeocodeSearch iGeocodeSearch = this.f2118a;
        if (iGeocodeSearch != null) {
            iGeocodeSearch.getFromLocationNameAsyn(geocodeQuery);
        }
    }

    public void setOnGeocodeSearchListener(OnGeocodeSearchListener onGeocodeSearchListener) {
        IGeocodeSearch iGeocodeSearch = this.f2118a;
        if (iGeocodeSearch != null) {
            iGeocodeSearch.setOnGeocodeSearchListener(onGeocodeSearchListener);
        }
    }
}
