package com.bytedance.adsdk.fxn;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class bh implements tw {
    @Override // com.bytedance.adsdk.fxn.tw
    /* renamed from: kg, reason: merged with bridge method [inline-methods] */
    public String fxn(JSONObject jSONObject, Object[] objArr) {
        if (objArr == null || objArr.length < 2) {
            return null;
        }
        String valueOf = String.valueOf(objArr[0]);
        if (TextUtils.isEmpty(valueOf)) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(valueOf);
            String valueOf2 = String.valueOf(objArr[1]);
            if (TextUtils.isEmpty(valueOf2)) {
                return null;
            }
            Object fxn = com.bytedance.adsdk.fxn.kg.fxn.fxn(valueOf2).fxn(jSONObject2);
            if (TextUtils.isEmpty(String.valueOf(fxn))) {
                if (objArr.length >= 3) {
                    return String.valueOf(objArr[2]);
                }
                return null;
            }
            return String.valueOf(fxn);
        } catch (JSONException unused) {
            return null;
        }
    }
}
