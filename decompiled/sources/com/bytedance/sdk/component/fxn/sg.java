package com.bytedance.sdk.component.fxn;

import com.autonavi.aps.amapapi.config.Const;
import java.lang.reflect.Type;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes13.dex */
class sg {
    private hie fxn;

    static sg fxn(hie hieVar) {
        return new sg(hieVar);
    }

    private sg(hie hieVar) {
        this.fxn = hieVar;
    }

    <T> T fxn(String str, Type type) throws JSONException {
        fxn(str);
        if (type.equals(JSONObject.class) || ((type instanceof Class) && JSONObject.class.isAssignableFrom((Class) type))) {
            return (T) new JSONObject(str);
        }
        return (T) this.fxn.fxn(str, type);
    }

    <T> String fxn(T t) {
        String obj;
        if (t == null) {
            return "{}";
        }
        if ((t instanceof JSONObject) || (t instanceof JSONArray)) {
            obj = t.toString();
        } else {
            obj = this.fxn.fxn(t);
        }
        fxn(obj);
        return obj;
    }

    private static void fxn(String str) {
        if (str.startsWith(Const.STR_MART_JSON_BEGIN) && str.endsWith("}")) {
            return;
        }
        tw.fxn(new IllegalArgumentException("Param is not allowed to be List or JSONArray, rawString:\n ".concat(String.valueOf(str))));
    }
}
