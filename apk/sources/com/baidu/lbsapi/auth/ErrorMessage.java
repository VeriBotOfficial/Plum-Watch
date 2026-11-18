package com.baidu.lbsapi.auth;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes15.dex */
class ErrorMessage {
    ErrorMessage() {
    }

    static String a(int r2, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", r2);
            jSONObject.put("message", str);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    static String a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", -1);
            jSONObject.put("message", str);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }
}
