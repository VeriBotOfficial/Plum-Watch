package com.anythink.expressad.foundation.h;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f4923a = "JSONUtils";

    public static ArrayList<String> a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        ArrayList<String> arrayList = new ArrayList<>(length);
        for (int r2 = 0; r2 < length; r2++) {
            arrayList.add(jSONArray.optString(r2));
        }
        return arrayList;
    }

    public static String a(int r5, int r6, int r7, int r8, int r9) {
        JSONObject jSONObject = new JSONObject();
        try {
            try {
                jSONObject.put("code", 0);
                jSONObject.put("message", "Sucess");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("rotateAngle", r5);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("left", r6);
                jSONObject3.put("right", r7);
                jSONObject3.put("top", r8);
                jSONObject3.put("bottom", r9);
                jSONObject2.put("cutoutInfo", jSONObject3);
                jSONObject.put("data", jSONObject2);
            } catch (Exception e) {
                e.getMessage();
            }
        } catch (Throwable th) {
            th.getMessage();
            try {
                jSONObject.put("code", 1);
                jSONObject.put("message", "Fail");
            } catch (JSONException e2) {
                e2.getMessage();
            }
        }
        return jSONObject.toString();
    }
}
