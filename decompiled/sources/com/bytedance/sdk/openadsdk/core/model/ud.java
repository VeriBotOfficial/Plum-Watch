package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONObject;

/* loaded from: classes14.dex */
public class ud {
    public static int fxn = 1;
    public static int kg = 2;
    private int gff = 5;
    private int hm = 30;
    private int rb = 70;
    private int bh = 1;

    /* renamed from: sg, reason: collision with root package name */
    private int f9506sg = fxn;
    private int tw = 0;
    private int jq = 0;
    private int hie = 3;

    public int fxn() {
        return this.hie;
    }

    public void fxn(int i) {
        this.hie = i;
    }

    public int kg() {
        return this.jq;
    }

    public void kg(int i) {
        this.jq = i;
    }

    public int gff() {
        return this.tw;
    }

    public void gff(int i) {
        this.tw = i;
    }

    public int hm() {
        return this.gff;
    }

    public void hm(int i) {
        this.gff = i;
    }

    public int rb() {
        return this.hm;
    }

    public void rb(int i) {
        this.hm = i;
    }

    public int bh() {
        return this.rb;
    }

    public void bh(int i) {
        this.rb = i;
    }

    public int sg() {
        return this.bh;
    }

    public void sg(int i) {
        this.bh = i;
    }

    public int tw() {
        return this.f9506sg;
    }

    public void tw(int i) {
        this.f9506sg = i;
    }

    public boolean fxn(boolean z) {
        if (z) {
            int i = this.tw;
            return i == 1 || i == 3;
        }
        int i2 = this.tw;
        return i2 == 3 || i2 == 2;
    }

    public JSONObject fxn(JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("ceiling_time", this.gff);
            jSONObject.put("ceiling_ratio", this.hm);
            jSONObject.put("expand_ratio", this.rb);
            jSONObject.put("back_type", this.bh);
            jSONObject.put("boc_return_type", this.f9506sg);
            jSONObject.put("pre_render_status", this.tw);
            jSONObject.put("pre_render_use_gecko", this.jq);
            jSONObject.put("pre_render_add_type", this.hie);
            return jSONObject;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.dx.gff("InteractionParams", th.getMessage());
            return jSONObject;
        }
    }
}
