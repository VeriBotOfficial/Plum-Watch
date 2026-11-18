package com.bytedance.sdk.openadsdk.core.model;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class iwp {
    private String fxn = "horizontal";
    private int kg = 1;
    private int gff = 1;
    private int hm = 0;
    private int rb = 0;
    private int bh = 0;

    /* JADX INFO: renamed from: sg, reason: collision with root package name */
    private int f9499sg = 0;
    private int tw = 5000;
    private int jq = 500;
    private int hie = 0;

    public String fxn() {
        return this.fxn;
    }

    public int kg() {
        return this.kg;
    }

    public int gff() {
        return this.gff;
    }

    public int hm() {
        return this.hm;
    }

    public int rb() {
        return this.rb;
    }

    public int bh() {
        return this.bh;
    }

    public int sg() {
        return this.f9499sg;
    }

    public int tw() {
        return this.tw;
    }

    public int jq() {
        return this.jq;
    }

    public int hie() {
        return this.hie;
    }

    public static iwp fxn(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new iwp();
        }
        iwp iwpVar = new iwp();
        iwpVar.fxn = jSONObject.optString(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "horizontal");
        iwpVar.kg = jSONObject.optInt("auto_loop", 1);
        iwpVar.gff = jSONObject.optInt("allow_manual_loop", 1);
        iwpVar.hm = jSONObject.optInt("unlimited_loop", 0);
        iwpVar.rb = jSONObject.optInt("left_margin", 0);
        iwpVar.bh = jSONObject.optInt("right_margin", 0);
        iwpVar.f9499sg = jSONObject.optInt("ad_margin", 0);
        iwpVar.tw = jSONObject.optInt("loop_interval_time", 5000);
        iwpVar.jq = jSONObject.optInt("flip_speed", 500);
        iwpVar.hie = jSONObject.optInt("stop_auto_loop", 0);
        return iwpVar;
    }

    public JSONObject dgx() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, this.fxn);
            jSONObject.put("auto_loop", this.kg);
            jSONObject.put("allow_manual_loop", this.gff);
            jSONObject.put("unlimited_loop", this.hm);
            jSONObject.put("left_margin", this.rb);
            jSONObject.put("right_margin", this.bh);
            jSONObject.put("ad_margin", this.f9499sg);
            jSONObject.put("loop_interval_time", this.tw);
            jSONObject.put("flip_speed", this.jq);
            jSONObject.put("stop_auto_loop", this.hie);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
