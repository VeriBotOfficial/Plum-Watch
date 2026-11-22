package com.wakeup.module.data.entity.convert;

import com.wakeup.common.log.LogUtils;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes4.dex */
public class JsonArrConverter {
    private static final String TAG = "HealthConverter";

    public JSONArray getValue(String value) {
        try {
            return new JSONArray(value);
        } catch (JSONException unused) {
            LogUtils.e(TAG, "getValue JSONException value: ", value);
            return new JSONArray();
        }
    }

    public String storeValue(JSONArray value) {
        return value.toString();
    }
}
