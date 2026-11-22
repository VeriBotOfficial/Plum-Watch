package com.yandex.mobile.ads.impl;

import io.nats.client.support.ApiConstants;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class vn1 {
    public static un1 a(String readyResponse) throws JSONException {
        Intrinsics.checkNotNullParameter(readyResponse, "readyResponse");
        JSONObject jSONObject = new JSONObject(yj.b(readyResponse));
        HashMap hashMap = new HashMap();
        String string = jSONObject.getString("body");
        JSONObject jSONObject2 = jSONObject.getJSONObject(ApiConstants.HEADERS);
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String string2 = jSONObject2.getString(next);
            Intrinsics.checkNotNull(next);
            Intrinsics.checkNotNull(string2);
            hashMap.put(next, string2);
        }
        Intrinsics.checkNotNull(string);
        return new un1(string, hashMap);
    }
}
