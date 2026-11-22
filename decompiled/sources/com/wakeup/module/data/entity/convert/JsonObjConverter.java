package com.wakeup.module.data.entity.convert;

import com.wakeup.common.log.LogUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class JsonObjConverter {
    private static final String TAG = "JsonObjConverter";

    public JSONObject getValue(String value) {
        try {
            return new JSONObject(value);
        } catch (JSONException unused) {
            LogUtils.e(TAG, "getValue JSONException value: ", value);
            return new JSONObject();
        }
    }

    public String storeValue(JSONObject value) {
        return value.toString();
    }
}
