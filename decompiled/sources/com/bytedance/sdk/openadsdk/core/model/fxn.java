package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class fxn {
    private uhw bh;
    private String dgx;
    private String fxn;
    private String gff;
    private iwp hie;
    private int jq;
    private int kg;
    private jz mvp;
    private jz rb;
    private List<jz> hm = new ArrayList();

    /* renamed from: sg, reason: collision with root package name */
    private JSONObject f9496sg = new JSONObject();
    private volatile boolean tw = false;

    public JSONObject fxn() {
        return this.f9496sg;
    }

    public void fxn(JSONObject jSONObject) {
        this.f9496sg = jSONObject;
    }

    public String kg() {
        jz bh = bh();
        if (bh != null) {
            return bh.etc();
        }
        return "";
    }

    public void fxn(String str) {
        this.fxn = str;
    }

    public int gff() {
        return this.kg;
    }

    public void fxn(int i) {
        this.kg = i;
    }

    public void kg(String str) {
        this.gff = str;
    }

    public List<jz> hm() {
        return this.hm;
    }

    public void fxn(jz jzVar) {
        this.hm.add(jzVar);
        if (this.mvp == null) {
            this.mvp = jzVar;
        }
    }

    public void fxn(List<jz> list) {
        this.hm = list;
        if (list.isEmpty()) {
            return;
        }
        this.mvp = list.get(0);
    }

    public static Map<String, jz> fxn(fxn fxnVar) {
        if (fxnVar == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (jz jzVar : fxnVar.hm()) {
            if (!TextUtils.isEmpty(jzVar.wh())) {
                hashMap.put(jzVar.wh(), jzVar);
            }
        }
        if (hashMap.size() != 0) {
            return hashMap;
        }
        return null;
    }

    public boolean rb() {
        List<jz> list = this.hm;
        return list != null && list.size() > 0;
    }

    public jz bh() {
        if (this.hm.size() > 0) {
            return this.hm.get(0);
        }
        return null;
    }

    public iwp sg() {
        return this.hie;
    }

    public void fxn(iwp iwpVar) {
        this.hie = iwpVar;
    }

    public boolean tw() {
        return this.tw;
    }

    public void jq() {
        this.tw = false;
    }

    public void kg(int i) {
        this.jq = i;
    }

    public boolean hie() {
        return this.jq == 1;
    }

    public jz dgx() {
        return this.mvp;
    }

    public void fxn(uhw uhwVar) {
        this.bh = uhwVar;
    }

    public uhw mvp() {
        return this.bh;
    }

    public JSONObject rlu() {
        try {
            JSONObject jSONObject = new JSONObject();
            iwp sg2 = sg();
            if (sg2 != null) {
                jSONObject.put("loop_config", sg2.dgx());
            }
            uhw mvp = mvp();
            if (mvp != null) {
                jSONObject.put("multi_ad_config", mvp.rmu());
            }
            List<jz> list = this.hm;
            if (list != null && list.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < this.hm.size(); i++) {
                    jSONArray.put(this.hm.get(i).jf());
                }
                jSONObject.put("creatives", jSONArray);
            }
            jSONObject.put("multi_ad_style", this.jq);
            jSONObject.put("request_id", this.fxn);
            return jSONObject;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.dx.fxn("AdInfo", "toJsonObj: ", th);
            return null;
        }
    }

    public static fxn kg(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            fxn fxnVar = new fxn();
            fxnVar.fxn(iwp.fxn(jSONObject.optJSONObject("loop_config")));
            fxnVar.kg(jSONObject.optInt("multi_ad_style", 0));
            JSONArray optJSONArray = jSONObject.optJSONArray("creatives");
            if (optJSONArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    jz fxn = com.bytedance.sdk.openadsdk.core.kg.fxn(optJSONArray.optJSONObject(i), null, null, fxnVar, i);
                    if (fxn != null) {
                        arrayList.add(fxn);
                    }
                }
                fxnVar.fxn(arrayList);
            }
            fxnVar.fxn(jSONObject.optString("request_id", ""));
            String optString = jSONObject.optString("multi_ad_config");
            if (!TextUtils.isEmpty(optString)) {
                fxnVar.fxn(uhw.fxn(optString));
            }
            return fxnVar;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.dx.fxn("AdInfo", "fromJson: ", th);
            return null;
        }
    }

    public void gff(String str) {
        this.dgx = str;
    }

    public String zu() {
        return this.dgx;
    }

    public jz ckl() {
        return this.rb;
    }

    public void kg(jz jzVar) {
        this.rb = jzVar;
    }
}
