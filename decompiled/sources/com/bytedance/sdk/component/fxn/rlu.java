package com.bytedance.sdk.component.fxn;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public final class rlu {
    private final Map<String, Object> fxn = new ConcurrentHashMap();

    public static rlu fxn() {
        return new rlu();
    }

    private rlu() {
    }

    public rlu fxn(String str, Object obj) {
        if (!TextUtils.isEmpty(str) && obj != null) {
            this.fxn.put(str, obj);
        }
        return this;
    }

    public String kg() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, Object> entry : this.fxn.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }
}
