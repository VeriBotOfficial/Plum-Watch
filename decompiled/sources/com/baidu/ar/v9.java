package com.baidu.ar;

import android.text.TextUtils;
import com.baidu.ar.bean.DuMixRes;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class v9 {
    public static DuMixRes a(String str) {
        Exception e;
        DuMixRes duMixRes = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            DuMixRes duMixRes2 = new DuMixRes();
            try {
                if (jSONObject.has("arType")) {
                    duMixRes2.setArType(jSONObject.getInt("arType"));
                }
                if (jSONObject.has(DuMixRes.JSON_SUPPORT_FRONT_CAMERA)) {
                    duMixRes2.setSupportFrontCamera(jSONObject.getBoolean(DuMixRes.JSON_SUPPORT_FRONT_CAMERA));
                }
                if (jSONObject.has(DuMixRes.JSON_CONTAIN_MUSIC)) {
                    duMixRes2.setContainMusic(jSONObject.getBoolean(DuMixRes.JSON_CONTAIN_MUSIC));
                }
                return duMixRes2;
            } catch (Exception e2) {
                e = e2;
                duMixRes = duMixRes2;
                e.printStackTrace();
                return duMixRes;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }
}
