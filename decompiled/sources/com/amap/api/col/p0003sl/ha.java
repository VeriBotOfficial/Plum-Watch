package com.amap.api.col.p0003sl;

import com.amap.api.col.p0003sl.ob;
import java.util.HashMap;
import java.util.Map;
import no.nordicsemi.android.dfu.DfuBaseService;

/* compiled from: LogUpdateRequest.java */
/* loaded from: classes11.dex */
public class ha extends h9 {
    private byte[] o;
    private String p;

    public ha(byte[] bArr, String str) {
        this.p = "1";
        this.o = (byte[]) bArr.clone();
        this.p = str;
        setDegradeAbility(ob.a.SINGLE);
        setHttpProtocol(ob.c.HTTP);
    }

    @Override // com.amap.api.col.p0003sl.ob
    public byte[] getEntityBytes() {
        return this.o;
    }

    @Override // com.amap.api.col.p0003sl.ob
    public Map<String, String> getParams() {
        return null;
    }

    @Override // com.amap.api.col.p0003sl.ob
    public Map<String, String> getRequestHead() {
        HashMap hashMap = new HashMap();
        hashMap.put("Content-Type", DfuBaseService.MIME_TYPE_ZIP);
        hashMap.put("Content-Length", String.valueOf(this.o.length));
        return hashMap;
    }

    @Override // com.amap.api.col.p0003sl.ob
    public String getURL() {
        boolean z = ba.b;
        String b = m9.b("IaHR0cDovL2xvZ3MuYW1hcC5jb20vd3MvbG9nL3VwbG9hZD9wcm9kdWN0PSVzJnR5cGU9JXMmcGxhdGZvcm09JXMmY2hhbm5lbD0lcyZzaWduPSVz");
        String str = this.p;
        byte[] e = m9.e("9aj&#k81");
        byte[] bArr = new byte[e.length + 50];
        System.arraycopy(this.o, 0, bArr, 0, 50);
        System.arraycopy(e, 0, bArr, 50, e.length);
        return String.format(b, "1", str, "1", "open", i9.a(bArr));
    }

    @Override // com.amap.api.col.p0003sl.ob
    public boolean isHostToIP() {
        return false;
    }
}
