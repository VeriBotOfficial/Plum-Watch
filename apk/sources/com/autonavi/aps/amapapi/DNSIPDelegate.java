package com.autonavi.aps.amapapi;

/* JADX INFO: loaded from: classes16.dex */
public class DNSIPDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String[] f6671a;
    private String b;
    private String c;
    private boolean d = false;
    private boolean e = false;

    public String getCacheIp() {
        return this.c;
    }

    public String[] getLocationIPs() {
        return this.f6671a;
    }

    public String getUseIp() {
        return this.b;
    }

    public boolean isHasLocalCache() {
        return this.d;
    }

    public boolean isIsDNSOK() {
        return this.e;
    }

    public void setCacheIp(String str) {
        this.c = str;
    }

    public void setHasLocalCache(boolean z) {
        this.d = z;
    }

    public void setIsDNSOK(boolean z) {
        this.e = z;
    }

    public void setLocationIPs(String[] strArr) {
        this.f6671a = strArr;
    }

    public void setUseIp(String str) {
        this.b = str;
    }
}
