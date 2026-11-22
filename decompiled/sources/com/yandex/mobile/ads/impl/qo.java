package com.yandex.mobile.ads.impl;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
final class qo {
    public static byte[] a(byte[] bArr) {
        if (f92.f15466a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(f92.a(bArr));
            StringBuilder sb = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray("keys");
            for (int i = 0; i < jSONArray.length(); i++) {
                if (i != 0) {
                    sb.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                sb.append("{\"k\":\"");
                sb.append(jSONObject2.getString("k").replace('-', '+').replace('_', '/'));
                sb.append("\",\"kid\":\"");
                sb.append(jSONObject2.getString("kid").replace('-', '+').replace('_', '/'));
                sb.append("\",\"kty\":\"");
                sb.append(jSONObject2.getString("kty"));
                sb.append("\"}");
            }
            sb.append("]}");
            return f92.c(sb.toString());
        } catch (JSONException e) {
            et0.a("ClearKeyUtil", "Failed to adjust response data: ".concat(f92.a(bArr)), e);
            return bArr;
        }
    }
}
