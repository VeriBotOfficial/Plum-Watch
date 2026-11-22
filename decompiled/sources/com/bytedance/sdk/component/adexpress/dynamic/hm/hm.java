package com.bytedance.sdk.component.adexpress.dynamic.hm;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class hm {
    public List<fxn> fxn;
    public String gff;
    public String hm;
    public String kg;

    public static class fxn {
        public int fxn;
        public JSONObject kg;
    }

    public static hm fxn(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        hm hmVar = new hm();
        String optString = jSONObject.optString("custom_components");
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(optString);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    fxn fxnVar = new fxn();
                    fxnVar.fxn = optJSONObject.optInt("id");
                    fxnVar.kg = new JSONObject(optJSONObject.optString("componentLayout"));
                    arrayList.add(fxnVar);
                }
            }
        } catch (JSONException unused) {
        }
        hmVar.fxn = arrayList;
        hmVar.kg = jSONObject.optString("diff_data");
        hmVar.gff = jSONObject.optString("style_diff");
        hmVar.hm = jSONObject.optString("tag_diff");
        return hmVar;
    }
}
