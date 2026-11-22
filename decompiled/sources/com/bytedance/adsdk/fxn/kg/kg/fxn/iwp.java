package com.bytedance.adsdk.fxn.kg.kg.fxn;

import android.text.TextUtils;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class iwp implements com.bytedance.adsdk.fxn.kg.kg.fxn {
    private final String fxn;

    public iwp(String str) {
        this.fxn = str;
    }

    @Override // com.bytedance.adsdk.fxn.kg.kg.fxn
    public Object fxn(Map<String, JSONObject> map) {
        Object fxn;
        if (map == null || map.size() <= 0 || (fxn = fxn(this.fxn, map.get("default_key"))) == JSONObject.NULL) {
            return null;
        }
        return fxn;
    }

    @Override // com.bytedance.adsdk.fxn.kg.kg.fxn
    public com.bytedance.adsdk.fxn.kg.hm.rb fxn() {
        return com.bytedance.adsdk.fxn.kg.hm.bh.VARIABLE;
    }

    public String toString() {
        return "VariableNode [literals=" + this.fxn + "]";
    }

    @Override // com.bytedance.adsdk.fxn.kg.kg.fxn
    public String kg() {
        return this.fxn;
    }

    public Object fxn(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return fxn(str.split("\\."), 0, jSONObject);
    }

    private Object fxn(String[] strArr, int i, JSONObject jSONObject) {
        Object opt;
        if (strArr != null && strArr.length > 0 && i < strArr.length && jSONObject != null) {
            String str = strArr[i];
            int indexOf = str.indexOf("[");
            int indexOf2 = str.indexOf("]");
            if (indexOf < 0 || indexOf2 < 0 || indexOf > indexOf2) {
                opt = jSONObject.opt(str);
            } else {
                String substring = str.substring(0, indexOf);
                try {
                    int parseInt = Integer.parseInt(str.substring(indexOf + 1, indexOf2));
                    Object opt2 = jSONObject.opt(substring);
                    opt = opt2 instanceof JSONArray ? ((JSONArray) opt2).opt(parseInt) : null;
                } catch (NumberFormatException unused) {
                    return null;
                }
            }
            if (i != strArr.length - 1) {
                if (opt instanceof String) {
                    try {
                        return fxn(strArr, i + 1, new JSONObject((String) opt));
                    } catch (JSONException unused2) {
                    }
                } else if (opt instanceof JSONObject) {
                    return fxn(strArr, i + 1, (JSONObject) opt);
                }
            }
            return opt;
        }
        return null;
    }
}
