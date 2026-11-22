package com.amap.api.col.p0003sl;

import java.util.Hashtable;
import java.util.Map;

/* compiled from: OfflineDownloadRequest.java */
/* loaded from: classes11.dex */
public class a3 extends z3 {
    private String o;

    public a3(String str) {
        this.o = str;
    }

    @Override // com.amap.api.col.p0003sl.ob
    public String getIPV6URL() {
        return this.o;
    }

    @Override // com.amap.api.col.p0003sl.z3, com.amap.api.col.p0003sl.ob
    public Map<String, String> getParams() {
        return null;
    }

    @Override // com.amap.api.col.p0003sl.ob
    public Map<String, String> getRequestHead() {
        Hashtable hashtable = new Hashtable(32);
        hashtable.put("User-Agent", "MAC=channel:amapapi");
        return hashtable;
    }

    @Override // com.amap.api.col.p0003sl.ob
    public String getURL() {
        return this.o;
    }

    @Override // com.amap.api.col.p0003sl.ob
    public boolean isSupportIPV6() {
        return false;
    }
}
