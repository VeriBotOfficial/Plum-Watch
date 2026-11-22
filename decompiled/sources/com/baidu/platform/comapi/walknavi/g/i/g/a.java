package com.baidu.platform.comapi.walknavi.g.i.g;

import com.baidu.platform.comapi.walknavi.g.i.e.b;
import com.iflytek.cloud.SpeechUtility;
import com.phancy.mini.api.file.FileSystemManager;
import io.nats.client.support.ApiConstants;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ParserJson.java */
/* loaded from: classes13.dex */
public final class a {
    public static b a(JSONObject jSONObject) {
        b bVar = new b();
        try {
            if (jSONObject.has(ApiConstants.ERR_CODE)) {
                bVar.a(jSONObject.getInt(ApiConstants.ERR_CODE));
            }
            if (jSONObject.has("err_msg")) {
                bVar.c(jSONObject.getString("err_msg"));
            }
            if (jSONObject.has(SpeechUtility.TAG_RESOURCE_RET)) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(SpeechUtility.TAG_RESOURCE_RET);
                if (jSONObject2.has("ar_key")) {
                    bVar.d(jSONObject2.getString("ar_key"));
                }
                if (jSONObject2.has("ar_resource")) {
                    bVar.f(jSONObject2.getString("ar_resource"));
                }
                if (jSONObject2.has("ar_resource_urls")) {
                    JSONArray jSONArray = jSONObject2.getJSONArray("ar_resource_urls");
                    String[] strArr = new String[jSONArray.length()];
                    for (int i = 0; i < jSONArray.length(); i++) {
                        strArr[i] = jSONArray.getString(i);
                    }
                    bVar.a(strArr);
                }
                if (jSONObject2.has("redirect_url")) {
                    bVar.e(jSONObject2.getString("redirect_url"));
                }
                if (jSONObject2.has("version_code")) {
                    bVar.g(jSONObject2.getString("version_code"));
                }
                if (jSONObject2.has("ar_type")) {
                    bVar.b(Integer.parseInt(jSONObject2.getString("ar_type")));
                }
                if (jSONObject2.has(FileSystemManager.DIGEST_MD5)) {
                    bVar.h(jSONObject2.getString(FileSystemManager.DIGEST_MD5));
                }
                if (jSONObject2.has("hardware_satisfied")) {
                    bVar.a(jSONObject2.getBoolean("hardware_satisfied"));
                }
                if (jSONObject2.has("ac_id")) {
                    bVar.a(jSONObject2.getString("ac_id"));
                }
                if (jSONObject2.has("refused")) {
                    if (Integer.parseInt(jSONObject2.getString("refused")) == 1) {
                        bVar.b(true);
                    } else {
                        bVar.b(false);
                    }
                }
                bVar.b(jSONObject2.optString("ar_code_url"));
            }
        } catch (Exception unused) {
        }
        return bVar;
    }
}
