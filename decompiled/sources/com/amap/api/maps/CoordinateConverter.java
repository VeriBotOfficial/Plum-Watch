package com.amap.api.maps;

import android.content.Context;
import com.amap.api.col.p0003sl.ja;
import com.amap.api.col.p0003sl.m1;
import com.amap.api.col.p0003sl.q4;
import com.amap.api.col.p0003sl.r4;
import com.amap.api.maps.model.LatLng;
import com.qumeng.overseas.advlib.core.ADEvent;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;

/* loaded from: classes11.dex */
public class CoordinateConverter {
    private static final String TAG = "CoordinateConverter";
    private Context ctx;
    private CoordType coordType = null;
    private LatLng sourceLatLng = null;

    public enum CoordType {
        BAIDU,
        MAPBAR,
        GPS,
        MAPABC,
        SOSOMAP,
        ALIYUN,
        GOOGLE
    }

    public CoordinateConverter(Context context) {
        this.ctx = context;
    }

    public static boolean isAMapDataAvailable(double d, double d2) {
        return q4.b(d, d2);
    }

    public LatLng convert() {
        String str;
        LatLng b;
        String str2;
        CoordType coordType = this.coordType;
        LatLng latLng = null;
        if (coordType == null || this.sourceLatLng == null) {
            return null;
        }
        try {
            switch (coordType) {
                case BAIDU:
                    latLng = m1.a(this.sourceLatLng);
                    str = ADEvent.BAIDU;
                    break;
                case MAPBAR:
                    latLng = m1.a(this.ctx, this.sourceLatLng);
                    str = "mapbar";
                    break;
                case GPS:
                    b = m1.b(this.ctx, this.sourceLatLng);
                    str2 = "gps";
                    String str3 = str2;
                    latLng = b;
                    str = str3;
                    break;
                case MAPABC:
                    b = this.sourceLatLng;
                    str2 = "mapabc";
                    String str32 = str2;
                    latLng = b;
                    str = str32;
                    break;
                case SOSOMAP:
                    b = this.sourceLatLng;
                    str2 = "sosomap";
                    String str322 = str2;
                    latLng = b;
                    str = str322;
                    break;
                case ALIYUN:
                    b = this.sourceLatLng;
                    str2 = "aliyun";
                    String str3222 = str2;
                    latLng = b;
                    str = str3222;
                    break;
                case GOOGLE:
                    b = this.sourceLatLng;
                    str2 = AndroidStaticDeviceInfoDataSource.STORE_GOOGLE;
                    String str32222 = str2;
                    latLng = b;
                    str = str32222;
                    break;
                default:
                    str = "";
                    break;
            }
            r4.a(this.ctx, str);
            return latLng;
        } catch (Throwable th) {
            th.printStackTrace();
            ja.a(th, TAG, "convert");
            return this.sourceLatLng;
        }
    }

    public CoordinateConverter coord(LatLng latLng) {
        this.sourceLatLng = latLng;
        return this;
    }

    public CoordinateConverter from(CoordType coordType) {
        this.coordType = coordType;
        return this;
    }
}
