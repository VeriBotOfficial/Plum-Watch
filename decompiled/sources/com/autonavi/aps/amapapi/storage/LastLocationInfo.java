package com.autonavi.aps.amapapi.storage;

import com.amap.api.col.p0003sl.ta;
import com.amap.api.col.p0003sl.ua;
import com.amap.api.location.AMapLocation;

@ta(tableName = "c")
/* loaded from: classes12.dex */
public class LastLocationInfo {

    /* renamed from: a, reason: collision with root package name */
    @ua(fieldName = SdCardDbCreator.FIELD_LASTLOC_INFO, fieldType = 6)
    private String f6691a;

    @ua(fieldName = SdCardDbCreator.FIELD_LASTLOC_TIME, fieldType = 5)
    private long b;

    @ua(fieldName = SdCardDbCreator.FIELD_LASTLOC_NB, fieldType = 6)
    private String c;
    private AMapLocation d;

    public AMapLocation getAmapLocation() {
        return this.d;
    }

    public String getLocInfo() {
        return this.f6691a;
    }

    public String getNb() {
        return this.c;
    }

    public long getTime() {
        return this.b;
    }

    public void setAmapLocation(AMapLocation aMapLocation) {
        this.d = aMapLocation;
    }

    public void setLocInfo(String str) {
        this.f6691a = str;
    }

    public void setNb(String str) {
        this.c = str;
    }

    public void setTime(long j) {
        this.b = j;
    }
}
