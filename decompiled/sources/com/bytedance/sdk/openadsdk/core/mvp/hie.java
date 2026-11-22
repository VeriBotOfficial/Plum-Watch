package com.bytedance.sdk.openadsdk.core.mvp;

import android.text.TextUtils;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class hie {
    private final String fxn;
    private final String gff;
    private final String hm;
    private final URL kg;

    private hie(String str, String str2, String str3, String str4) throws MalformedURLException {
        this.fxn = str2;
        this.kg = new URL(str);
        this.gff = str3;
        this.hm = str4;
    }

    public String fxn() {
        return this.fxn;
    }

    public String kg() {
        return this.gff;
    }

    public URL gff() {
        return this.kg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hie)) {
            return false;
        }
        hie hieVar = (hie) obj;
        if (fxn(this.fxn, hieVar.fxn) && fxn(this.kg, hieVar.kg) && fxn(this.gff, hieVar.gff)) {
            return fxn(this.hm, hieVar.hm);
        }
        return false;
    }

    public int hashCode() {
        String str = this.fxn;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.kg.hashCode()) * 31;
        String str2 = this.gff;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.hm;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    private boolean fxn(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public JSONObject hm() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("apiFramework", "omid");
            jSONObject.put("javascriptResourceUrl", this.kg.toString());
            if (!TextUtils.isEmpty(this.fxn)) {
                jSONObject.put("vendorKey", this.fxn);
            }
            if (!TextUtils.isEmpty(this.gff)) {
                jSONObject.put("verificationParameters", this.gff);
            }
            if (!TextUtils.isEmpty(this.hm)) {
                jSONObject.put("verificationNotExecuted", this.hm);
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static hie fxn(String str, String str2, String str3, String str4) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new hie(str, str2, str3, str4);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static hie fxn(JSONObject jSONObject) {
        try {
            String optString = jSONObject.optString("apiFramework");
            String optString2 = jSONObject.optString("javascriptResourceUrl");
            if ("omid".equalsIgnoreCase(optString) && !TextUtils.isEmpty(optString2)) {
                return new hie(optString2, jSONObject.optString("vendorKey"), jSONObject.optString("verificationParameters"), jSONObject.optString("verificationNotExecuted"));
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static HashSet<hie> fxn(JSONArray jSONArray) {
        HashSet<hie> hashSet = new HashSet<>();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    hashSet.add(fxn(jSONArray.getJSONObject(i)));
                } catch (Throwable unused) {
                }
            }
        }
        return hashSet;
    }
}
