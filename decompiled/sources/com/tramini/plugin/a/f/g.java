package com.tramini.plugin.a.f;

import java.lang.reflect.Method;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class g extends f {
    public static com.tramini.plugin.a.d.a a(JSONObject jSONObject, com.tramini.plugin.a.d.c cVar, String str) {
        return a(a(jSONObject.optString("in_na"), str), "", jSONObject.optString("pre"), jSONObject.optString("mena"), jSONObject.optString("agu"), jSONObject.optString("agu_v2"), jSONObject.optString("agu_v3"), jSONObject, cVar.e);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.tramini.plugin.a.d.a a(java.lang.Object r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, org.json.JSONObject r26, org.json.JSONArray r27) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tramini.plugin.a.f.g.a(java.lang.Object, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, org.json.JSONObject, org.json.JSONArray):com.tramini.plugin.a.d.a");
    }

    private static Method[] c(Object obj, String str) {
        try {
            ArrayList arrayList = new ArrayList();
            for (Method method : obj.getClass().getDeclaredMethods()) {
                if (method.getGenericReturnType().toString().contains(str)) {
                    arrayList.add(method);
                }
            }
            return (Method[]) arrayList.toArray(new Method[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    private static String a(String str, JSONObject jSONObject) {
        String[] split;
        int i;
        try {
            split = str.split(":");
            i = 0;
        } catch (Throwable unused) {
            return "";
        }
        while (i < split.length) {
            int i2 = i + 1;
            if (i2 == split.length) {
                return jSONObject.optString(split[i]);
            }
            try {
                jSONObject = new JSONObject(jSONObject.optString(split[i]));
            } catch (JSONException unused2) {
                jSONObject = new JSONArray(jSONObject.optString(split[i])).getJSONObject(0);
            }
            i = i2;
            return "";
        }
        return "";
    }
}
