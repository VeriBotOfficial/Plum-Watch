package com.qumeng.overseas.advlib.__remote__.utils;

import com.qumeng.overseas.advlib.__remote__.core.proto.response.AdsObject;
import com.qumeng.overseas.advlib.__remote__.core.proto.response.Response;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public class l {
    public static <T> T a(JSONObject jSONObject, Class<T> cls) {
        try {
            T t = (T) e.a(jSONObject, cls);
            a(jSONObject, t);
            return t;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static String b(Object obj) {
        try {
            return a(obj).toString();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private static void a(JSONObject jSONObject, Object obj) {
        if (obj instanceof AdsObject) {
            try {
                ((AdsObject) obj).initStash(jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            ((AdsObject) obj).initArgs();
        }
    }

    public static Response a(JSONObject jSONObject, String str) {
        Response response = (Response) a(jSONObject, Response.class);
        if (response != null) {
            if (str != null) {
                response.setAdslotId(str);
            }
            response.initArgs();
        }
        return response;
    }

    public static <T> T a(String str, Class<T> cls) {
        try {
            return (T) a(new JSONObject(str), (Class) cls);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static JSONObject a(Object obj) {
        try {
            return e.d(obj);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}
