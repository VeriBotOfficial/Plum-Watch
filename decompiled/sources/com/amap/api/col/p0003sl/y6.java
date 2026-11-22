package com.amap.api.col.p0003sl;

import android.content.Context;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.nearby.UploadInfo;

/* compiled from: NearbyUpdateHandler.java */
/* loaded from: classes11.dex */
public class y6 extends d6<UploadInfo, Integer> {
    private Context u;
    private UploadInfo v;

    public y6(Context context, UploadInfo uploadInfo) {
        super(context, uploadInfo);
        this.u = context;
        this.v = uploadInfo;
    }

    @Override // com.amap.api.col.p0003sl.c6
    protected Object b(String str) throws AMapException {
        return 0;
    }

    @Override // com.amap.api.col.p0003sl.ob
    public String getURL() {
        return k6.f(this.u) + "/nearby/data/create";
    }

    @Override // com.amap.api.col.p0003sl.d6
    protected String h() {
        StringBuffer stringBuffer = new StringBuffer("key=");
        stringBuffer.append(z8.e(this.u));
        stringBuffer.append("&userid=").append(this.v.getUserID());
        LatLonPoint point = this.v.getPoint();
        stringBuffer.append("&location=").append(((int) (point.getLongitude() * 1000000.0d)) / 1000000.0f).append(",").append(((int) (point.getLatitude() * 1000000.0d)) / 1000000.0f);
        stringBuffer.append("&coordtype=").append(this.v.getCoordType());
        return stringBuffer.toString();
    }
}
