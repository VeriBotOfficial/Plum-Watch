package com.bytedance.sdk.openadsdk.core.model;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class bh {

    /* renamed from: sg, reason: collision with root package name */
    private int f9492sg;
    private String fxn = "";
    private String kg = "";
    private String gff = "";
    private String hm = "";
    private double rb = -1.0d;
    private int bh = -1;

    public String fxn() {
        return this.fxn;
    }

    public void fxn(String str) {
        this.fxn = str;
    }

    public String kg() {
        return this.kg;
    }

    public void kg(String str) {
        this.kg = str;
    }

    public String gff() {
        return this.gff;
    }

    public void gff(String str) {
        this.gff = str;
    }

    public double hm() {
        return this.rb;
    }

    public void fxn(double d) {
        if (d < 1.0d || d > 5.0d) {
            this.rb = -1.0d;
        } else {
            this.rb = d;
        }
    }

    public int rb() {
        return this.bh;
    }

    public void fxn(int i) {
        if (i <= 0) {
            this.bh = -1;
        } else {
            this.bh = i;
        }
    }

    public int bh() {
        return this.f9492sg;
    }

    public void kg(int i) {
        this.f9492sg = i;
    }

    public String sg() {
        return this.hm;
    }

    public void hm(String str) {
        this.hm = str;
    }

    public JSONObject tw() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("app_name", kg());
            jSONObject.put("app_size", bh());
            jSONObject.put("comment_num", rb());
            jSONObject.put(DownloadModel.DOWNLOAD_URL, fxn());
            jSONObject.put("package_name", gff());
            jSONObject.put(FirebaseAnalytics.Param.SCORE, hm());
            jSONObject.put("app_category", sg());
            return jSONObject;
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.dx.gff(e.toString(), new Object[0]);
            return jSONObject;
        }
    }
}
