package com.amap.api.col.p0003sl;

import android.content.Context;
import com.amap.api.col.p0003sl.g9;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: PrivacyUploadRequest.java */
/* loaded from: classes11.dex */
public final class qa extends h9 {
    public JSONObject o = null;
    public Context p = null;

    @Override // com.amap.api.col.p0003sl.ob
    public final byte[] getEntityBytes() {
        try {
            StringBuffer stringBuffer = new StringBuffer();
            JSONObject jSONObject = this.o;
            if (jSONObject != null) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    stringBuffer.append(next + "=" + URLEncoder.encode(this.o.get(next).toString(), "utf-8") + "&");
                }
            }
            stringBuffer.append("output=json");
            String e = z8.e(this.p);
            stringBuffer.append("&key=".concat(String.valueOf(e)));
            String a2 = c9.a();
            stringBuffer.append("&ts=".concat(String.valueOf(a2)));
            stringBuffer.append("&scode=" + c9.a(this.p, a2, "key=".concat(String.valueOf(e))));
            return stringBuffer.toString().getBytes("utf-8");
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    @Override // com.amap.api.col.p0003sl.ob
    public final Map<String, String> getParams() {
        return null;
    }

    @Override // com.amap.api.col.p0003sl.ob
    public final Map<String, String> getRequestHead() {
        HashMap hashMap = new HashMap();
        hashMap.put("Content-Type", "application/x-www-form-urlencoded");
        hashMap.put("Accept-Encoding", "gzip");
        hashMap.put("User-Agent", "AMAP SDK Android core 4.4.1.23");
        hashMap.put("X-INFO", c9.a(this.p));
        hashMap.put("platinfo", String.format("platform=Android&sdkversion=%s&product=%s", "4.4.1.23", "core"));
        hashMap.put("logversion", "2.1");
        return hashMap;
    }

    @Override // com.amap.api.col.p0003sl.ob
    public final String getSDKName() {
        return "core";
    }

    @Override // com.amap.api.col.p0003sl.ob
    public final String getURL() {
        return g9.a.f1667a.b() ? "https://restsdk.amap.com/sdk/compliance/params" : "http://restsdk.amap.com/sdk/compliance/params";
    }
}
