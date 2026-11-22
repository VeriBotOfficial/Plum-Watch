package com.autonavi.aps.amapapi.trans;

import android.text.TextUtils;
import com.amap.api.col.p0003sl.h9;
import java.util.Map;

/* loaded from: classes12.dex */
public class HttpRequest extends h9 {
    Map<String, String> o = null;
    Map<String, String> p = null;

    /* renamed from: q, reason: collision with root package name */
    String f6694q = "";
    byte[] r = null;
    private String s = null;

    @Override // com.amap.api.col.p0003sl.ob
    public byte[] getEntityBytes() {
        return this.r;
    }

    @Override // com.amap.api.col.p0003sl.h9, com.amap.api.col.p0003sl.ob
    public String getIPV6URL() {
        return !TextUtils.isEmpty(this.s) ? this.s : super.getIPV6URL();
    }

    @Override // com.amap.api.col.p0003sl.ob
    public Map<String, String> getParams() {
        return this.p;
    }

    @Override // com.amap.api.col.p0003sl.ob
    public Map<String, String> getRequestHead() {
        return this.o;
    }

    @Override // com.amap.api.col.p0003sl.ob
    public String getURL() {
        return this.f6694q;
    }

    public void setEntity(byte[] bArr) {
        this.r = bArr;
    }

    public void setHead(Map<String, String> map) {
        this.o = map;
    }

    public void setIpv6Url(String str) {
        this.s = str;
    }

    public void setParams(Map<String, String> map) {
        this.p = map;
    }

    public void setUrl(String str) {
        this.f6694q = str;
    }
}
