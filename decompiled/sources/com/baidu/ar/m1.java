package com.baidu.ar;

import com.facebook.common.util.UriUtil;
import com.phancy.mini.api.file.FileSystemManager;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class m1 {

    /* renamed from: a, reason: collision with root package name */
    public String f7074a;
    public Map<String, gc> b;

    public m1(String str) {
        this.f7074a = str;
    }

    public gc a(String str) {
        Map<String, gc> a2 = a();
        if (a2.containsKey(str)) {
            return a2.get(str);
        }
        return null;
    }

    public final Map<String, gc> a() {
        Map<String, gc> map = this.b;
        if (map != null) {
            return map;
        }
        this.b = new HashMap();
        File file = new File(this.f7074a.concat(File.separator).concat("res_config.json"));
        if (file.exists()) {
            try {
                JSONArray optJSONArray = new JSONObject(j4.k(file)).optJSONArray(UriUtil.LOCAL_RESOURCE_SCHEME);
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    int length = optJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        if (optJSONObject != null) {
                            gc gcVar = new gc();
                            gcVar.f6949a = optJSONObject.getString("resPath");
                            gcVar.b = optJSONObject.optString("resId");
                            gcVar.c = optJSONObject.optString("encoding");
                            optJSONObject.optString(FileSystemManager.DIGEST_MD5);
                            this.b.put(gcVar.f6949a, gcVar);
                        }
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return this.b;
    }
}
