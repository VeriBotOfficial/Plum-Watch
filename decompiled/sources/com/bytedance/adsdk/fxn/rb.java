package com.bytedance.adsdk.fxn;

import android.text.TextUtils;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class rb implements tw {
    @Override // com.bytedance.adsdk.fxn.tw
    public Object fxn(JSONObject jSONObject, Object[] objArr) {
        if (objArr != null && objArr.length > 0) {
            for (Object obj : objArr) {
                String valueOf = String.valueOf(obj);
                if (!TextUtils.isEmpty(valueOf) && !TextUtils.equals(valueOf, AbstractJsonLexerKt.NULL)) {
                    return valueOf;
                }
            }
        }
        return null;
    }
}
