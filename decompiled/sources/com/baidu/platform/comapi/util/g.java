package com.baidu.platform.comapi.util;

import android.text.TextUtils;
import com.baidu.mapapi.map.EncodePointType;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapsdkplatform.comapi.map.t;
import java.util.ArrayList;

/* compiled from: EncryptionUtil.java */
/* loaded from: classes13.dex */
public class g {

    /* compiled from: EncryptionUtil.java */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static g f8680a = new g();
    }

    public static g a() {
        return a.f8680a;
    }

    private ArrayList<LatLng> c(String str) {
        return new t().e(str);
    }

    public ArrayList<LatLng> b(String str) {
        return new t().d(str);
    }

    public ArrayList<LatLng> a(String str, int i) {
        if (!TextUtils.isEmpty(str) && i != EncodePointType.NONE.ordinal()) {
            if (i == EncodePointType.BUILDINGINFO.ordinal()) {
                return b(str);
            }
            if (i == EncodePointType.AOI.ordinal()) {
                return a(str);
            }
            if (i == EncodePointType.RECOGNIZE_AOI.ordinal()) {
                return c(str);
            }
        }
        return null;
    }

    private ArrayList<LatLng> a(String str) {
        return new t().b(str);
    }
}
