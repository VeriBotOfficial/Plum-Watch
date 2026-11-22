package com.bytedance.adsdk.fxn;

import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class hie implements tw {
    @Override // com.bytedance.adsdk.fxn.tw
    public Object fxn(JSONObject jSONObject, Object[] objArr) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        if (objArr == null || objArr.length != 0) {
            return null;
        }
        String valueOf = String.valueOf(objArr[2]);
        String valueOf2 = String.valueOf(objArr[1]);
        String valueOf3 = String.valueOf(objArr[0]);
        if (!TextUtils.isEmpty(valueOf3) && jSONObject != null && (optJSONObject = jSONObject.optJSONObject("i18n")) != null && (optJSONObject2 = optJSONObject.optJSONObject(valueOf2)) != null) {
            String optString = optJSONObject2.optString(valueOf3);
            if (!TextUtils.isEmpty(optString)) {
                return optString;
            }
        }
        return valueOf;
    }
}
