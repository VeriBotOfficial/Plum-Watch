package com.baidu.mapapi.map.offline;

import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapsdkplatform.comapi.map.j;
import com.baidu.mapsdkplatform.comapi.map.l;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes13.dex */
public class OfflineMapUtil {
    public static MKOLSearchRecord getSearchRecordFromLocalCityInfo(j jVar) {
        if (jVar == null) {
            return null;
        }
        MKOLSearchRecord mKOLSearchRecord = new MKOLSearchRecord();
        mKOLSearchRecord.cityID = jVar.f8376a;
        mKOLSearchRecord.cityName = jVar.b;
        mKOLSearchRecord.cityType = jVar.d;
        long j = 0;
        if (jVar.a() != null) {
            ArrayList<MKOLSearchRecord> arrayList = new ArrayList<>();
            Iterator<j> it = jVar.a().iterator();
            while (it.hasNext()) {
                arrayList.add(getSearchRecordFromLocalCityInfo(it.next()));
                j += r5.c;
                mKOLSearchRecord.childCities = arrayList;
            }
        }
        if (mKOLSearchRecord.cityType == 1) {
            mKOLSearchRecord.dataSize = j;
            return mKOLSearchRecord;
        }
        mKOLSearchRecord.dataSize = jVar.c;
        return mKOLSearchRecord;
    }

    public static MKOLUpdateElement getUpdatElementFromLocalMapElement(l lVar) {
        if (lVar == null) {
            return null;
        }
        MKOLUpdateElement mKOLUpdateElement = new MKOLUpdateElement();
        mKOLUpdateElement.cityID = lVar.f8379a;
        mKOLUpdateElement.cityName = lVar.b;
        GeoPoint geoPoint = lVar.g;
        if (geoPoint != null) {
            mKOLUpdateElement.geoPt = CoordUtil.mc2ll(geoPoint);
        }
        mKOLUpdateElement.level = lVar.e;
        int i = lVar.i;
        mKOLUpdateElement.ratio = i;
        int i2 = lVar.h;
        mKOLUpdateElement.serversize = i2;
        if (i == 100) {
            mKOLUpdateElement.size = i2;
        } else {
            mKOLUpdateElement.size = (i2 / 100) * i;
        }
        mKOLUpdateElement.status = lVar.l;
        mKOLUpdateElement.update = lVar.j;
        return mKOLUpdateElement;
    }
}
