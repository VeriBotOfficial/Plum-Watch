package com.bytedance.sdk.component.adexpress.dynamic.hm;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes15.dex */
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
        String strOptString = jSONObject.optString("custom_components");
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(strOptString);
            for (int r1 = 0; r1 < jSONArray.length(); r1++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(r1);
                if (jSONObjectOptJSONObject != null) {
                    fxn fxnVar = new fxn();
                    fxnVar.fxn = jSONObjectOptJSONObject.optInt("id");
                    fxnVar.kg = new JSONObject(jSONObjectOptJSONObject.optString("componentLayout"));
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
