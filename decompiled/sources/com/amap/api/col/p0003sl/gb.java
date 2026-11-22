package com.amap.api.col.p0003sl;

import com.amap.api.col.p0003sl.ob;
import java.util.Map;

/* compiled from: ADIURequest.java */
/* loaded from: classes11.dex */
public class gb extends ob {
    private byte[] o;
    private Map<String, String> p;

    public gb(byte[] bArr, Map<String, String> map) {
        this.o = bArr;
        this.p = map;
        setDegradeAbility(ob.a.SINGLE);
        setHttpProtocol(ob.c.HTTPS);
    }

    @Override // com.amap.api.col.p0003sl.ob
    public byte[] getEntityBytes() {
        return this.o;
    }

    @Override // com.amap.api.col.p0003sl.ob
    public Map<String, String> getParams() {
        return this.p;
    }

    @Override // com.amap.api.col.p0003sl.ob
    public Map<String, String> getRequestHead() {
        return null;
    }

    @Override // com.amap.api.col.p0003sl.ob
    public String getURL() {
        return "https://adiu.amap.com/ws/device/adius";
    }
}
