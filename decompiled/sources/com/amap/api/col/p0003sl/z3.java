package com.amap.api.col.p0003sl;

import com.amap.api.col.p0003sl.j9;
import com.amap.api.col.p0003sl.ob;
import com.amap.api.maps.MapsInitializer;
import java.util.Map;

/* compiled from: AbstractAMapRequest.java */
/* loaded from: classes11.dex */
public abstract class z3 extends ob {
    protected boolean isPostFlag = true;

    @Override // com.amap.api.col.p0003sl.ob
    public Map<String, String> getParams() {
        return null;
    }

    protected byte[] makeHttpRequest() throws y8 {
        pb makeHttpRequestNeedHeader = makeHttpRequestNeedHeader();
        if (makeHttpRequestNeedHeader != null) {
            return makeHttpRequestNeedHeader.f1837a;
        }
        return null;
    }

    protected pb makeHttpRequestNeedHeader() throws y8 {
        if (a1.f != null && j9.a(a1.f, t4.b()).f1729a != j9.e.SuccessCode) {
            return null;
        }
        setHttpProtocol(MapsInitializer.getProtocol() == 1 ? ob.c.HTTP : ob.c.HTTPS);
        nb b = nb.b(false);
        return this.isPostFlag ? b.a(this) : b.e(this);
    }

    public byte[] makeHttpRequestWithInterrupted() throws y8 {
        setDegradeAbility(ob.a.INTERRUPT_IO);
        return makeHttpRequest();
    }
}
