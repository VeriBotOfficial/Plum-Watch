package com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.cache;

import android.text.TextUtils;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.z;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public class b {
    public static boolean a(JSONObject jSONObject, String str, int i, String str2) {
        return b(jSONObject, str) && c(jSONObject, String.valueOf(i)) && a(jSONObject, str2) && a(jSONObject);
    }

    private static boolean b(JSONObject jSONObject, String str) {
        try {
            return jSONObject.get("styleId").equals(str);
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }
    }

    private static boolean c(JSONObject jSONObject, String str) {
        String str2;
        if (!jSONObject.has("type")) {
            return true;
        }
        try {
            str2 = (String) jSONObject.get("type");
        } catch (JSONException e) {
            e.printStackTrace();
            str2 = null;
        }
        return TextUtils.isEmpty(str2) || str2.equals(str);
    }

    private static boolean a(JSONObject jSONObject, String str) {
        String str2;
        if (!jSONObject.has("interaction_type")) {
            return true;
        }
        try {
            str2 = (String) jSONObject.get("interaction_type");
        } catch (JSONException e) {
            e.printStackTrace();
            str2 = null;
        }
        return TextUtils.isEmpty(str2) || str2.equals(str);
    }

    private static boolean a(JSONObject jSONObject) {
        double doubleValue;
        try {
            Object obj = jSONObject.get("minSdkVersion");
            if (obj instanceof Double) {
                doubleValue = ((Double) obj).doubleValue();
            } else if (obj instanceof Integer) {
                doubleValue = new Double(((Integer) obj).intValue()).doubleValue();
            } else {
                doubleValue = Double.valueOf(obj.toString()).doubleValue();
            }
            if (doubleValue != 0.0d) {
                return Double.valueOf(z.b("1.049")).doubleValue() >= doubleValue;
            }
            return true;
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }
    }
}
