package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class uhw {
    private int bh;
    private boolean dgx;
    private int fxn;
    private int gff;
    private int hm;
    private rz je;
    private String jq;
    private JSONObject mvp;
    private int rb;
    private int rlu;

    /* renamed from: sg, reason: collision with root package name */
    private JSONObject f9507sg;
    private int zu;
    private int kg = 10;
    private int tw = 1;
    private fxn hie = new fxn();
    private int ckl = 1;
    private String xdg = "Next Ad";
    private String rmu = "Next ad in %1$ds";

    public static uhw fxn(String str) {
        uhw uhwVar = new uhw();
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                uhwVar.fxn = jSONObject.optInt("auto_switch");
                uhwVar.kg = jSONObject.optInt("playable_preload_count");
                uhwVar.gff = jSONObject.optInt("disable_on_interaction");
                uhwVar.hm = jSONObject.optInt("ceiling_type");
                uhwVar.rb = jSONObject.optInt("can_loop");
                uhwVar.bh = jSONObject.optInt("multi_skip_time", -1);
                uhwVar.tw = jSONObject.optInt("load_more_strategy");
                uhwVar.ckl = jSONObject.optInt("report_show_by_percent", 1);
                JSONObject optJSONObject = jSONObject.optJSONObject("gesture_tpl_info");
                uhwVar.f9507sg = optJSONObject;
                if (optJSONObject != null) {
                    rz fxn2 = rz.fxn(optJSONObject);
                    uhwVar.je = fxn2;
                    if (fxn2 != null && !TextUtils.isEmpty(fxn2.gff())) {
                        com.bytedance.sdk.openadsdk.core.dgx.fxn.kg.fxn().fxn(new com.bytedance.sdk.openadsdk.core.dgx.tw.fxn().fxn(uhwVar.je.fxn()).kg(uhwVar.je.kg()).gff(uhwVar.je.gff()).hm(uhwVar.je.hm()), "guide");
                    }
                    int optInt = uhwVar.f9507sg.optInt("delay_show_time", 5);
                    uhwVar.rlu = optInt;
                    if (optInt < 0) {
                        uhwVar.rlu = 5;
                    }
                    int optInt2 = uhwVar.f9507sg.optInt("dismiss_after_idle_time", 3);
                    uhwVar.zu = optInt2;
                    if (optInt2 <= 0) {
                        uhwVar.zu = 3;
                    }
                }
                uhwVar.jq = jSONObject.optString("agg_endcard_url");
                uhwVar.dgx = jSONObject.optBoolean("has_more");
                uhwVar.mvp = jSONObject.optJSONObject("session_params");
                uhwVar.hie = fxn.fxn(jSONObject.optJSONObject("layout_config"));
            } catch (JSONException unused) {
            }
        }
        return uhwVar;
    }

    public boolean fxn() {
        return this.ckl == 1;
    }

    public JSONObject kg() {
        rz rzVar = this.je;
        if (rzVar == null) {
            return null;
        }
        try {
            String hm = rzVar.hm();
            if (!TextUtils.isEmpty(hm)) {
                return new JSONObject(hm);
            }
            String fxn2 = com.bytedance.sdk.openadsdk.core.dgx.fxn.kg.fxn().fxn("guide", this.je.fxn(), this.je.kg());
            if (TextUtils.isEmpty(fxn2)) {
                return null;
            }
            return new JSONObject(fxn2);
        } catch (JSONException unused) {
            return null;
        }
    }

    public JSONObject gff() {
        rz rzVar = this.je;
        if (rzVar == null) {
            return null;
        }
        return rzVar.rb();
    }

    public int hm() {
        return this.rlu;
    }

    public int rb() {
        return this.zu;
    }

    public fxn bh() {
        return this.hie;
    }

    public String sg() {
        return this.jq;
    }

    public int tw() {
        return this.tw;
    }

    public int jq() {
        return this.bh;
    }

    public boolean hie() {
        return this.rb == 1;
    }

    public boolean dgx() {
        return this.hm == 1;
    }

    public JSONObject mvp() {
        return this.mvp;
    }

    public boolean rlu() {
        return this.dgx;
    }

    public boolean zu() {
        return this.gff == 1;
    }

    public boolean ckl() {
        return this.fxn == 1;
    }

    public int xdg() {
        return this.kg;
    }

    public JSONObject rmu() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("auto_switch", this.fxn);
            jSONObject.put("playable_preload_count", this.kg);
            jSONObject.put("disable_on_interaction", this.gff);
            jSONObject.put("ceiling_type", this.hm);
            jSONObject.put("can_loop", this.rb);
            jSONObject.put("multi_skip_time", this.bh);
            jSONObject.put("load_more_strategy", this.tw);
            jSONObject.put("report_show_by_percent", this.ckl);
            jSONObject.put("gesture_tpl_info", this.f9507sg);
            jSONObject.put("agg_endcard_url", this.jq);
            jSONObject.put("layoutConfig", this.hie.bh());
            jSONObject.put("has_more", this.dgx);
            jSONObject.put("session_params", this.mvp);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static class fxn {
        private int fxn;
        private int gff;
        private int hm;
        private int kg;
        private int rb;

        public static fxn fxn(JSONObject jSONObject) {
            fxn fxnVar = new fxn();
            if (jSONObject == null) {
                return fxnVar;
            }
            fxnVar.fxn = Math.max(0, jSONObject.optInt("padding_left", 0));
            fxnVar.kg = Math.max(0, jSONObject.optInt("padding_right", 0));
            fxnVar.gff = Math.max(0, jSONObject.optInt("padding_top", 0));
            fxnVar.hm = Math.max(0, jSONObject.optInt("padding_bottom", 0));
            fxnVar.rb = Math.max(0, jSONObject.optInt("card_spacing", 0));
            return fxnVar;
        }

        public int fxn() {
            return this.hm;
        }

        public int kg() {
            return this.gff;
        }

        public int gff() {
            return this.fxn;
        }

        public int hm() {
            return this.kg;
        }

        public int rb() {
            return this.rb;
        }

        public JSONObject bh() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("padding_left", this.fxn);
                jSONObject.put("padding_right", this.kg);
                jSONObject.put("padding_top", this.gff);
                jSONObject.put("padding_bottom", this.hm);
                jSONObject.put("card_spacing", this.rb);
            } catch (JSONException unused) {
            }
            return jSONObject;
        }
    }
}
