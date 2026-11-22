package com.amap.api.col.p0003sl;

import android.content.Context;
import com.amap.api.maps.model.LatLng;
import com.autonavi.amap.mapcore.DPoint;
import com.autonavi.util.a;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: OffsetUtil.java */
/* loaded from: classes11.dex */
public class m1 {

    /* renamed from: a, reason: collision with root package name */
    private static final List<LatLng> f1762a = new ArrayList(Arrays.asList(new LatLng(23.379947d, 119.757001d), new LatLng(24.983296d, 120.474496d), new LatLng(25.518722d, 121.359866d), new LatLng(25.41329d, 122.443582d), new LatLng(24.862708d, 122.288354d), new LatLng(24.461292d, 122.188319d), new LatLng(21.584761d, 120.968923d), new LatLng(21.830837d, 120.654445d)));
    public static double b = 6378245.0d;
    public static double c = 0.006693421622965943d;

    public static LatLng a(Context context, LatLng latLng) {
        try {
            if (!q4.b(latLng.latitude, latLng.longitude)) {
                return latLng;
            }
            double d = ((long) (latLng.longitude * 100000.0d)) % 36000000;
            double d2 = ((long) (latLng.latitude * 100000.0d)) % 36000000;
            DPoint obtain = DPoint.obtain(((int) (((-b((int) ((-b(d, d2)) + d), (int) ((-c(d, d2)) + d2))) + d) + (d > 0.0d ? 1 : -1))) / 100000.0d, ((int) (((-c(r2, r11)) + d2) + (d2 > 0.0d ? 1 : -1))) / 100000.0d);
            LatLng b2 = b(context, new LatLng(obtain.y, obtain.x, false));
            obtain.recycle();
            return b2;
        } catch (Throwable th) {
            th.printStackTrace();
            return latLng;
        }
    }

    public static LatLng b(Context context, LatLng latLng) {
        if (context == null) {
            return null;
        }
        DPoint obtain = DPoint.obtain(latLng.longitude, latLng.latitude);
        try {
            double[] a2 = a.a(obtain.x, obtain.y);
            obtain.recycle();
            obtain = DPoint.obtain(a2[0], a2[1]);
        } catch (Throwable unused) {
        }
        LatLng latLng2 = new LatLng(obtain.y, obtain.x, false);
        obtain.recycle();
        return latLng2;
    }

    public static double c(double d, double d2) {
        return (Math.sin(d2 / 100000.0d) * (d / 18000.0d)) + (Math.cos(d / 100000.0d) * (d2 / 9000.0d));
    }

    public static double b(double d, double d2) {
        return (Math.cos(d2 / 100000.0d) * (d / 18000.0d)) + (Math.sin(d / 100000.0d) * (d2 / 9000.0d));
    }

    public static LatLng a(LatLng latLng) {
        if (latLng != null) {
            try {
                if (q4.b(latLng.latitude, latLng.longitude)) {
                    DPoint a2 = a(latLng.longitude, latLng.latitude, 2);
                    LatLng latLng2 = new LatLng(a2.y, a2.x, false);
                    a2.recycle();
                    return latLng2;
                }
                if (t4.a(new LatLng(latLng.latitude, latLng.longitude), f1762a)) {
                    DPoint a3 = a(latLng.longitude, latLng.latitude, 2);
                    return a(a3.y, a3.x);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return latLng;
    }

    private static double a(double d, int i) {
        return new BigDecimal(d).setScale(i, 4).doubleValue();
    }

    private static DPoint a(double d, double d2, int i) {
        double d3 = 0.006401062d;
        double d4 = 0.0060424805d;
        DPoint dPoint = null;
        int i2 = 0;
        while (i2 < i) {
            dPoint = DPoint.obtain();
            double d5 = d - d3;
            double d6 = d2 - d4;
            DPoint obtain = DPoint.obtain();
            double d7 = d5 * 3000.0d * 0.017453292519943295d;
            double d8 = 3000.0d * d6 * 0.017453292519943295d;
            double d9 = (d5 * d5) + (d6 * d6);
            double cos = (Math.cos((Math.cos(d7) * 3.0E-6d) + Math.atan2(d6, d5)) * ((Math.sin(d8) * 2.0E-5d) + Math.sqrt(d9))) + 0.0065d;
            double sin = (Math.sin((Math.cos(d7) * 3.0E-6d) + Math.atan2(d6, d5)) * ((Math.sin(d8) * 2.0E-5d) + Math.sqrt(d9))) + 0.006d;
            obtain.x = a(cos, 8);
            obtain.y = a(sin, 8);
            dPoint.x = a((d + d5) - obtain.x, 8);
            double a2 = a((d2 + d6) - obtain.y, 8);
            dPoint.y = a2;
            i2++;
            d4 = d2 - a2;
            d3 = d - dPoint.x;
        }
        return dPoint;
    }

    private static LatLng a(double d, double d2) {
        double d3 = d2 - 105.0d;
        double d4 = d - 35.0d;
        double d5 = d3 * 2.0d;
        double d6 = d3 * 0.1d;
        double d7 = d6 * d4;
        double sqrt = (-100.0d) + d5 + (d4 * 3.0d) + (d4 * 0.2d * d4) + d7 + (Math.sqrt(Math.abs(d3)) * 0.2d);
        double d8 = 6.0d * d3 * 3.141592653589793d;
        double d9 = d5 * 3.141592653589793d;
        double d10 = d4 * 3.141592653589793d;
        double sin = sqrt + ((((Math.sin(d8) * 20.0d) + (Math.sin(d9) * 20.0d)) * 2.0d) / 3.0d) + ((((Math.sin(d10) * 20.0d) + (Math.sin((d4 / 3.0d) * 3.141592653589793d) * 40.0d)) * 2.0d) / 3.0d) + ((((Math.sin((d4 / 12.0d) * 3.141592653589793d) * 160.0d) + (Math.sin(d10 / 30.0d) * 320.0d)) * 2.0d) / 3.0d);
        double sqrt2 = d3 + 300.0d + (d4 * 2.0d) + (d6 * d3) + d7 + (Math.sqrt(Math.abs(d3)) * 0.1d) + ((((Math.sin(d8) * 20.0d) + (Math.sin(d9) * 20.0d)) * 2.0d) / 3.0d) + ((((Math.sin(d3 * 3.141592653589793d) * 20.0d) + (Math.sin((d3 / 3.0d) * 3.141592653589793d) * 40.0d)) * 2.0d) / 3.0d) + ((((Math.sin((d3 / 12.0d) * 3.141592653589793d) * 150.0d) + (Math.sin((d3 / 30.0d) * 3.141592653589793d) * 300.0d)) * 2.0d) / 3.0d);
        double d11 = (d / 180.0d) * 3.141592653589793d;
        double sin2 = Math.sin(d11);
        double d12 = 1.0d - ((c * sin2) * sin2);
        double sqrt3 = Math.sqrt(d12);
        double d13 = b;
        LatLng latLng = new LatLng(d + ((sin * 180.0d) / ((((1.0d - c) * d13) / (d12 * sqrt3)) * 3.141592653589793d)), d2 + ((sqrt2 * 180.0d) / (((d13 / sqrt3) * Math.cos(d11)) * 3.141592653589793d)));
        return new LatLng((d * 2.0d) - latLng.latitude, (d2 * 2.0d) - latLng.longitude);
    }
}
