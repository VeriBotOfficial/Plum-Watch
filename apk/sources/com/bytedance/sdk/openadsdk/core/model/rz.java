package com.bytedance.sdk.openadsdk.core.model;

import com.phancy.mini.api.file.FileSystemManager;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class rz {
    private fxn bh;
    private String fxn;
    private String gff;
    private String hm;
    private String kg;
    private JSONObject rb;

    public String fxn() {
        return this.fxn;
    }

    public String kg() {
        return this.kg;
    }

    public String gff() {
        return this.gff;
    }

    public String hm() {
        return this.hm;
    }

    public JSONObject rb() {
        return this.rb;
    }

    public fxn bh() {
        return this.bh;
    }

    public static rz fxn(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        rz rzVar = new rz();
        rzVar.fxn = jSONObject.optString("id");
        rzVar.hm = jSONObject.optString("data");
        rzVar.gff = jSONObject.optString("url");
        rzVar.kg = jSONObject.optString(FileSystemManager.DIGEST_MD5);
        rzVar.rb = jSONObject.optJSONObject("custom_components");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("preload");
        if (jSONObjectOptJSONObject != null) {
            rzVar.bh = fxn.fxn(jSONObjectOptJSONObject);
        }
        return rzVar;
    }

    public JSONObject sg() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.fxn);
            jSONObject.put(FileSystemManager.DIGEST_MD5, this.kg);
            jSONObject.put("url", this.gff);
            jSONObject.put("data", this.hm);
            jSONObject.put("custom_components", this.rb);
            fxn fxnVar = this.bh;
            if (fxnVar != null) {
                jSONObject.put("preload", fxnVar.hm());
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static class fxn {
        private JSONArray fxn;
        private JSONArray gff;
        private JSONArray kg;

        public JSONArray fxn() {
            return this.fxn;
        }

        public void fxn(JSONArray jSONArray) {
            this.fxn = jSONArray;
        }

        public JSONArray kg() {
            return this.kg;
        }

        public void kg(JSONArray jSONArray) {
            this.kg = jSONArray;
        }

        public JSONArray gff() {
            return this.gff;
        }

        public void gff(JSONArray jSONArray) {
            this.gff = jSONArray;
        }

        public static fxn fxn(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("image");
            fxn fxnVar = new fxn();
            fxnVar.fxn(jSONArrayOptJSONArray);
            fxnVar.kg(jSONObject.optJSONArray("fetch"));
            fxnVar.gff(jSONObject.optJSONArray("script"));
            return fxnVar;
        }

        public JSONObject hm() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("image", this.fxn);
                jSONObject.put("fetch", this.kg);
                jSONObject.put("script", this.gff);
            } catch (JSONException e) {
                e.getMessage();
            }
            return jSONObject;
        }
    }
}
