package com.bytedance.sdk.openadsdk.core.model;

import android.content.Intent;
import android.text.TextUtils;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class zn {
    private String bh;
    private int dgx;
    private String fxn;
    private int gff;
    private String hie;
    private int hm;
    private String jq;
    private String kg;
    private String rb;

    /* renamed from: sg, reason: collision with root package name */
    private String f9510sg;
    private int tw;

    public String fxn() {
        return this.f9510sg;
    }

    public void fxn(String str) {
        this.f9510sg = str;
    }

    public void fxn(int i) {
        this.dgx = i;
    }

    public int kg() {
        return this.tw;
    }

    public void kg(int i) {
        this.tw = i;
    }

    public String gff() {
        return this.jq;
    }

    public void kg(String str) {
        this.jq = str;
    }

    public void gff(String str) {
        this.hie = str;
    }

    public String hm() {
        return this.rb;
    }

    public void hm(String str) {
        this.rb = str;
    }

    public String rb() {
        return this.bh;
    }

    public void rb(String str) {
        this.bh = str;
    }

    public void bh(String str) {
        this.fxn = str;
    }

    public void sg(String str) {
        this.kg = str;
    }

    public void gff(int i) {
        this.gff = i;
    }

    public int bh() {
        return this.hm;
    }

    public void hm(int i) {
        this.hm = i;
    }

    public boolean sg() {
        return this.hm == 1;
    }

    public boolean tw() {
        return this.dgx == 1;
    }

    public static zn fxn(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        zn znVar = new zn();
        try {
            znVar.bh(jSONObject.optString("market_dpl", ""));
            znVar.sg(jSONObject.optString("market_dpl_auto", ""));
            znVar.gff(jSONObject.optInt("exec_type", 0));
            znVar.hm(jSONObject.optInt("oem_vendor_type", 0));
            znVar.hm(jSONObject.optString("market_pkg", ""));
            znVar.rb(jSONObject.optString("regex", ""));
            znVar.kg(jSONObject.optInt("overlay", 1));
            znVar.kg(jSONObject.optString("caller_id", ""));
            znVar.gff(jSONObject.optString("ext_map", null));
            znVar.fxn(jSONObject.optInt("gp_card", 0));
            znVar.fxn(jSONObject.optString("app_pkg", ""));
            return znVar;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.dx.gff("OemModel", th.getMessage());
            return znVar;
        }
    }

    public String jq() {
        if (this.gff == 2) {
            return this.kg;
        }
        return this.fxn;
    }

    public JSONObject hie() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.fxn)) {
                jSONObject.put("market_dpl", this.fxn);
            }
            if (!TextUtils.isEmpty(this.kg)) {
                jSONObject.put("market_dpl_auto", this.kg);
            }
            if (!TextUtils.isEmpty(this.rb)) {
                jSONObject.put("market_pkg", this.rb);
            }
            if (!TextUtils.isEmpty(this.f9510sg)) {
                jSONObject.put("app_pkg", this.f9510sg);
            }
            if (!TextUtils.isEmpty(this.bh)) {
                jSONObject.put("regex", this.bh);
            }
            jSONObject.put("exec_type", this.gff);
            jSONObject.put("oem_vendor_type", this.hm);
            jSONObject.put("overlay", this.tw);
            jSONObject.put("gp_card", this.dgx);
            if (!TextUtils.isEmpty(this.jq)) {
                jSONObject.put("caller_id", this.jq);
            }
            if (!TextUtils.isEmpty(this.hie)) {
                jSONObject.put("ext_map", this.hie);
            }
            return jSONObject;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.dx.gff("OemModel", th.getMessage());
            return null;
        }
    }

    public void fxn(Intent intent) {
        if (TextUtils.isEmpty(this.hie)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(this.hie);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof String) {
                    intent.putExtra(next, (String) obj);
                } else if (obj instanceof Integer) {
                    intent.putExtra(next, (Integer) obj);
                } else if (obj instanceof Boolean) {
                    intent.putExtra(next, (Boolean) obj);
                } else if (obj instanceof Long) {
                    intent.putExtra(next, (Long) obj);
                } else if (obj instanceof Double) {
                    intent.putExtra(next, (Double) obj);
                } else if (obj instanceof Float) {
                    intent.putExtra(next, (Float) obj);
                } else {
                    new Object[]{"Unsupported type ", next, obj};
                }
            }
        } catch (Throwable th) {
            new Object[]{th};
        }
    }
}
