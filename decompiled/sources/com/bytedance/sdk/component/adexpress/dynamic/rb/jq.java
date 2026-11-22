package com.bytedance.sdk.component.adexpress.dynamic.rb;

import com.luck.picture.lib.config.PictureMimeType;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class jq {
    public static void fxn(String str, JSONObject jSONObject) {
        JSONObject bfa = com.bytedance.sdk.component.adexpress.kg.bfa(str);
        if (bfa == null) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        JSONObject optJSONObject = bfa.optJSONObject("values");
        if (optJSONObject == null) {
            return;
        }
        fxn(optJSONObject, jSONObject);
    }

    public static JSONObject fxn(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject bfa = com.bytedance.sdk.component.adexpress.kg.bfa(str);
        if (bfa == null) {
            return null;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        return fxn(jSONObject2, bfa.optJSONObject("themeValues"), jSONObject);
    }

    private static void fxn(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        if (jSONObject == null) {
            return;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!jSONObject2.has(next)) {
                try {
                    jSONObject2.put(next, jSONObject.opt(next));
                } catch (JSONException unused) {
                }
            }
        }
    }

    public static JSONObject fxn(JSONObject... jSONObjectArr) {
        JSONObject jSONObject = new JSONObject();
        for (JSONObject jSONObject2 : jSONObjectArr) {
            if (jSONObject2 != null) {
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    try {
                        jSONObject.put(next, jSONObject2.opt(next));
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        return jSONObject;
    }

    public static String fxn(String str) {
        JSONObject optJSONObject;
        JSONObject bfa = com.bytedance.sdk.component.adexpress.kg.bfa(str);
        if (bfa == null || (optJSONObject = bfa.optJSONObject("values")) == null) {
            return null;
        }
        return optJSONObject.optString("data");
    }

    public static String fxn(String str, String str2) {
        JSONObject optJSONObject;
        JSONObject bfa = com.bytedance.sdk.component.adexpress.kg.bfa(str);
        if (bfa == null || (optJSONObject = bfa.optJSONObject("values")) == null) {
            return null;
        }
        return optJSONObject.optString(str2);
    }

    public static JSONObject fxn(JSONArray jSONArray) {
        JSONObject optJSONObject;
        if (jSONArray == null || jSONArray.length() <= 0 || (optJSONObject = jSONArray.optJSONObject(0)) == null) {
            return null;
        }
        return optJSONObject.optJSONObject("values");
    }

    public static String kg(String str, String str2) {
        if (com.bytedance.sdk.component.adexpress.hm.kg()) {
            if (str.indexOf(46) < 0) {
                str = str + PictureMimeType.PNG;
            }
            return str2 + "static/images/" + str;
        }
        return fxn.fxn(str);
    }
}
