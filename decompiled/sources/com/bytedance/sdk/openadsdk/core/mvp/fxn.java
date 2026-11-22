package com.bytedance.sdk.openadsdk.core.mvp;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.jz;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class fxn {
    private String bh;
    gff gff;
    private int hie;
    private String hm;
    private int jq;
    kg kg;
    private String mvp;
    private String rb;

    /* renamed from: sg, reason: collision with root package name */
    private String f9511sg;
    private double tw;
    final com.bytedance.sdk.openadsdk.core.model.hm fxn = new com.bytedance.sdk.openadsdk.core.model.hm();
    private String dgx = "VAST_ACTION_BUTTON";

    public hm fxn() {
        return this.fxn.fxn();
    }

    public kg kg() {
        return this.kg;
    }

    public gff gff() {
        return this.gff;
    }

    public String hm() {
        return this.hm;
    }

    public String rb() {
        return this.rb;
    }

    public String bh() {
        return this.bh;
    }

    public String sg() {
        return this.f9511sg;
    }

    public void fxn(kg kgVar) {
        if (kgVar != null) {
            kgVar.fxn(this.f9511sg);
        }
        this.kg = kgVar;
    }

    public void fxn(gff gffVar) {
        if (gffVar != null) {
            gffVar.fxn(this.f9511sg);
        }
        this.gff = gffVar;
    }

    public void fxn(String str) {
        this.hm = str;
    }

    public void kg(String str) {
        this.rb = str;
    }

    public void gff(String str) {
        this.bh = str;
    }

    public void hm(String str) {
        this.f9511sg = str;
    }

    public double tw() {
        return this.tw;
    }

    public void fxn(double d) {
        this.tw = d;
    }

    public String jq() {
        gff gffVar;
        String str = this.bh;
        if (!TextUtils.isEmpty(this.mvp)) {
            String str2 = this.mvp;
            this.mvp = null;
            return str2;
        }
        String str3 = this.dgx;
        str3.hashCode();
        if (str3.equals("VAST_ICON")) {
            kg kgVar = this.kg;
            if (kgVar != null && !TextUtils.isEmpty(kgVar.tw)) {
                str = this.kg.tw;
            }
        } else if (str3.equals("VAST_END_CARD") && (gffVar = this.gff) != null && !TextUtils.isEmpty(gffVar.tw)) {
            str = this.gff.tw;
        }
        this.dgx = "VAST_ACTION_BUTTON";
        return str;
    }

    public void rb(String str) {
        this.dgx = str;
    }

    public JSONObject hie() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        hm fxn = this.fxn.fxn();
        if (fxn != null) {
            jSONObject.put("videoTrackers", fxn.fxn());
        }
        kg kgVar = this.kg;
        if (kgVar != null) {
            jSONObject.put("vastIcon", kgVar.fxn());
        }
        gff gffVar = this.gff;
        if (gffVar != null) {
            jSONObject.put("endCard", gffVar.fxn());
        }
        jSONObject.put("title", this.hm);
        jSONObject.put("description", this.rb);
        jSONObject.put("clickThroughUrl", this.bh);
        jSONObject.put("videoUrl", this.f9511sg);
        jSONObject.put("videDuration", this.tw);
        jSONObject.put("videoWidth", this.jq);
        jSONObject.put("videoHeight", this.hie);
        jSONObject.put("viewabilityVendor", ckl());
        return jSONObject;
    }

    private JSONArray ckl() {
        Set<hie> kg = this.fxn.kg();
        if (kg == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (hie hieVar : kg) {
            if (hieVar != null) {
                jSONArray.put(hieVar.hm());
            }
        }
        return jSONArray;
    }

    public static fxn fxn(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        fxn fxnVar = new fxn();
        hm fxn = fxnVar.fxn.fxn();
        if (fxn == null) {
            fxn = new hm();
            fxnVar.fxn.fxn(fxn);
        }
        fxn.fxn(jSONObject.optJSONObject("videoTrackers"));
        fxnVar.kg = kg.fxn(jSONObject.optJSONObject("vastIcon"));
        fxnVar.gff = gff.kg(jSONObject.optJSONObject("endCard"));
        fxnVar.hm = jSONObject.optString("title");
        fxnVar.rb = jSONObject.optString("description");
        fxnVar.bh = jSONObject.optString("clickThroughUrl");
        fxnVar.f9511sg = jSONObject.optString("videoUrl");
        fxnVar.tw = jSONObject.optDouble("videDuration");
        fxnVar.jq = jSONObject.optInt("videoWidth");
        fxnVar.jq = jSONObject.optInt("videoHeight");
        Set<hie> kg = fxnVar.fxn.kg();
        if (kg == null) {
            kg = new HashSet<>();
            fxnVar.fxn.fxn(kg);
        }
        kg.addAll(hie.fxn(jSONObject.optJSONArray("viewabilityVendor")));
        return fxnVar;
    }

    public void fxn(jz jzVar) {
        this.fxn.fxn(jzVar);
        kg kgVar = this.kg;
        if (kgVar != null) {
            kgVar.fxn(jzVar);
        }
        gff gffVar = this.gff;
        if (gffVar != null) {
            gffVar.fxn(jzVar);
        }
    }

    public void fxn(int i) {
        this.jq = i;
    }

    public void kg(int i) {
        this.hie = i;
    }

    public int dgx() {
        return this.jq;
    }

    public int mvp() {
        return this.hie;
    }

    public void fxn(Set<hie> set) {
        this.fxn.kg(set);
    }

    public Set<hie> rlu() {
        return this.fxn.kg();
    }

    public void bh(String str) {
        this.mvp = str;
    }

    public com.bytedance.sdk.openadsdk.core.model.hm zu() {
        return this.fxn;
    }
}
