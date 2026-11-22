package com.bytedance.sdk.openadsdk.core.dgx.tw;

import com.phancy.mini.api.file.FileSystemManager;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class fxn {
    private String fxn;
    private String gff;
    private String hm;
    private String kg;
    private String rb;

    public String fxn() {
        return this.fxn;
    }

    public fxn fxn(String str) {
        this.fxn = str;
        return this;
    }

    public String kg() {
        return this.kg;
    }

    public fxn kg(String str) {
        this.kg = str;
        return this;
    }

    public String gff() {
        return this.gff;
    }

    public fxn gff(String str) {
        this.gff = str;
        return this;
    }

    public String hm() {
        return this.hm;
    }

    public fxn hm(String str) {
        this.hm = str;
        return this;
    }

    public String rb() {
        return this.rb;
    }

    public fxn rb(String str) {
        this.rb = str;
        return this;
    }

    public JSONObject fxn(fxn fxnVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.fxn);
            jSONObject.put(FileSystemManager.DIGEST_MD5, this.kg);
            jSONObject.put("url", this.gff);
            if (fxnVar != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("id", fxnVar.fxn());
                jSONObject2.put(FileSystemManager.DIGEST_MD5, fxnVar.kg());
                jSONObject2.put("url", fxnVar.gff());
                jSONObject.put("overlay", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
