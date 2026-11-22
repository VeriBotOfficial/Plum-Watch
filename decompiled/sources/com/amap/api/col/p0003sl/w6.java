package com.amap.api.col.p0003sl;

import android.content.Context;
import com.amap.api.services.core.AMapException;

/* compiled from: NearbyDeleteHandler.java */
/* loaded from: classes11.dex */
public class w6 extends d6<String, Integer> {
    private Context u;
    private String v;

    public w6(Context context, String str) {
        super(context, str);
        this.u = context;
        this.v = str;
    }

    @Override // com.amap.api.col.p0003sl.c6
    protected Object b(String str) throws AMapException {
        return 0;
    }

    @Override // com.amap.api.col.p0003sl.ob
    public String getURL() {
        return k6.f(this.u) + "/nearby/data/delete";
    }

    @Override // com.amap.api.col.p0003sl.d6
    protected String h() {
        StringBuffer stringBuffer = new StringBuffer("key=");
        stringBuffer.append(z8.e(this.u));
        stringBuffer.append("&userid=").append(this.v);
        return stringBuffer.toString();
    }
}
