package com.baidu.mapapi.util;

import android.text.TextUtils;
import com.baidu.mapapi.map.EncodePointType;
import com.baidu.mapapi.model.LatLng;
import com.baidu.platform.comapi.util.g;
import java.util.ArrayList;

/* loaded from: classes13.dex */
public class EncryptSpatialRelationUtil {
    private static boolean a(LatLng latLng, String str, EncodePointType encodePointType) {
        boolean z;
        ArrayList<LatLng> arrayList;
        boolean z2 = false;
        if (encodePointType == null) {
            return false;
        }
        ArrayList<LatLng> a2 = g.a().a(str, encodePointType.ordinal());
        if (a2 == null || a2.size() == 0 || latLng == null) {
            return false;
        }
        for (int i = 0; i < a2.size(); i++) {
            if (latLng.longitude == a2.get(i).longitude && latLng.latitude == a2.get(i).latitude) {
                return true;
            }
        }
        int size = a2.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            LatLng latLng2 = a2.get(i2);
            i2++;
            LatLng latLng3 = a2.get(i2 % size);
            double d = latLng2.latitude;
            double d2 = latLng3.latitude;
            if (d != d2 && latLng.latitude >= Math.min(d, d2) && latLng.latitude < Math.max(latLng2.latitude, latLng3.latitude)) {
                double d3 = latLng.latitude;
                double d4 = latLng2.latitude;
                double d5 = latLng3.longitude;
                z = z2;
                arrayList = a2;
                double d6 = latLng2.longitude;
                double d7 = (((d3 - d4) * (d5 - d6)) / (latLng3.latitude - d4)) + d6;
                double d8 = latLng.longitude;
                if (d7 == d8) {
                    return true;
                }
                if (d7 < d8) {
                    i3++;
                }
            } else {
                z = z2;
                arrayList = a2;
            }
            a2 = arrayList;
            z2 = z;
        }
        boolean z3 = z2;
        if (i3 % 2 == 1) {
            return true;
        }
        return z3;
    }

    public static boolean isEncodedGeoPointsContainsPoint(LatLng latLng, String str, EncodePointType encodePointType) {
        if (latLng == null || TextUtils.isEmpty(str) || encodePointType == null) {
            return false;
        }
        return a(latLng, str, encodePointType);
    }
}
