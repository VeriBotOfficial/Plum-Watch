package com.autonavi.aps.amapapi.trans;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.col.p0003sl.ib;
import com.amap.api.col.p0003sl.l9;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes12.dex */
public class LocationRequest extends ib {
    Map<String, String> o;
    private String p;

    /* renamed from: q, reason: collision with root package name */
    String f6696q;
    String r;
    byte[] s;
    byte[] t;
    boolean u;
    String v;
    Map<String, String> w;
    boolean x;

    public LocationRequest(Context context, l9 l9Var) {
        super(context, l9Var);
        this.o = null;
        this.p = "";
        this.f6696q = "";
        this.r = "";
        this.s = null;
        this.t = null;
        this.u = false;
        this.v = null;
        this.w = null;
        this.x = false;
    }

    @Override // com.amap.api.col.p0003sl.ob
    public String getIPDNSName() {
        return this.p;
    }

    @Override // com.amap.api.col.p0003sl.h9, com.amap.api.col.p0003sl.ob
    public String getIPV6URL() {
        return this.r;
    }

    @Override // com.amap.api.col.p0003sl.ib, com.amap.api.col.p0003sl.ob
    public Map<String, String> getParams() {
        return this.w;
    }

    @Override // com.amap.api.col.p0003sl.ib
    public String getPlatInfo() {
        return this.v;
    }

    public String getPlatinfo() {
        return this.v;
    }

    @Override // com.amap.api.col.p0003sl.ib
    public byte[] getRawDatas() {
        return this.s;
    }

    @Override // com.amap.api.col.p0003sl.ib, com.amap.api.col.p0003sl.ob
    public Map<String, String> getRequestHead() {
        return this.o;
    }

    @Override // com.amap.api.col.p0003sl.ib
    public byte[] getRsaAesRawDatas() {
        return this.t;
    }

    @Override // com.amap.api.col.p0003sl.ob
    public String getSDKName() {
        return "loc";
    }

    @Override // com.amap.api.col.p0003sl.ib, com.amap.api.col.p0003sl.ob
    public String getURL() {
        return this.f6696q;
    }

    @Override // com.amap.api.col.p0003sl.ib
    public boolean getXinfoFlag() {
        return this.u;
    }

    @Override // com.amap.api.col.p0003sl.ib
    protected boolean isLocRequest() {
        return this.x;
    }

    public void setAesEntity(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                if (bArr != null) {
                    try {
                        byteArrayOutputStream.write(getDatasLength(bArr));
                        byteArrayOutputStream.write(bArr);
                    } catch (Throwable th) {
                        th = th;
                        try {
                            th.printStackTrace();
                            if (byteArrayOutputStream != null) {
                                byteArrayOutputStream.close();
                                return;
                            }
                            return;
                        } catch (Throwable th2) {
                            if (byteArrayOutputStream != null) {
                                try {
                                    byteArrayOutputStream.close();
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            }
                            throw th2;
                        }
                    }
                }
                this.t = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
        }
    }

    public void setDnsHostName(String str) {
        if (TextUtils.isEmpty(str)) {
            this.p = "";
        } else {
            this.p = str;
        }
    }

    public void setEntity(byte[] bArr) {
        this.s = bArr;
    }

    public void setHead(Map<String, String> map) {
        this.o = map;
    }

    public void setIPV6Url(String str) {
        this.r = str;
    }

    public void setIsXinfo(boolean z) {
        this.u = z;
    }

    public void setLocRequest(boolean z) {
        this.x = z;
    }

    public void setParamsMap(Map<String, String> map) {
        this.w = map;
    }

    public void setPlatinfo(String str) {
        this.v = str;
    }

    public void setUrl(String str) {
        this.f6696q = str;
    }
}
