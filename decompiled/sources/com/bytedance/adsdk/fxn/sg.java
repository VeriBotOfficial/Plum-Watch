package com.bytedance.adsdk.fxn;

import org.json.JSONObject;

/* loaded from: classes13.dex */
public class sg implements tw {
    @Override // com.bytedance.adsdk.fxn.tw
    /* renamed from: kg, reason: merged with bridge method [inline-methods] */
    public Boolean fxn(JSONObject jSONObject, Object[] objArr) {
        if (objArr == null || objArr.length <= 0) {
            return Boolean.FALSE;
        }
        try {
            Double.parseDouble(String.valueOf(objArr[0]));
            return Boolean.TRUE;
        } catch (NumberFormatException unused) {
            return Boolean.FALSE;
        }
    }
}
