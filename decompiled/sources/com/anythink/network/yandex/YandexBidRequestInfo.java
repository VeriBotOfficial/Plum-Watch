package com.anythink.network.yandex;

import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATBidRequestInfo;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class YandexBidRequestInfo extends ATBidRequestInfo {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f5935a;

    public YandexBidRequestInfo(Map<String, Object> map, String str) {
        JSONObject jSONObject = new JSONObject();
        this.f5935a = jSONObject;
        try {
            Object obj = map.get("unit_id");
            if (obj != null) {
                jSONObject.put("unit_id", obj.toString());
            }
            jSONObject.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BID_TOKEN, str);
        } catch (Exception unused) {
        }
    }

    public void setAdWidthHeight(int i, int i2) {
        try {
            this.f5935a.put("ad_width", i);
            this.f5935a.put("ad_height", i2);
        } catch (JSONException unused) {
        }
    }

    @Override // com.anythink.core.api.ATBidRequestInfo
    public JSONObject toRequestJSONObject() {
        return this.f5935a;
    }
}
