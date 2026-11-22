package com.bytedance.sdk.openadsdk.hm;

import org.json.JSONObject;

/* loaded from: classes14.dex */
public class sg {
    private long fxn;
    private long gff;
    private long hm;
    private long kg;
    private long rb;

    public void fxn(long j) {
        if (this.fxn <= 0) {
            this.fxn = j;
        }
    }

    public void kg(long j) {
        if (this.kg <= 0) {
            this.kg = j;
        }
    }

    public void gff(long j) {
        if (this.gff <= 0) {
            this.gff = j;
        }
    }

    public void hm(long j) {
        if (this.hm <= 0) {
            this.hm = j;
        }
    }

    public void rb(long j) {
        if (this.rb <= 0) {
            this.rb = j;
        }
    }

    public boolean fxn() {
        return this.fxn > 0;
    }

    public void fxn(long j, float f) {
        if (f > 0.0f) {
            fxn(j);
        }
        double d = f;
        if (d >= 0.25d) {
            fxn(j);
            kg(j);
        }
        if (d >= 0.5d) {
            fxn(j);
            kg(j);
            gff(j);
        }
        if (d >= 0.75d) {
            fxn(j);
            kg(j);
            gff(j);
            hm(j);
        }
        if (f >= 1.0f) {
            fxn(j);
            kg(j);
            gff(j);
            hm(j);
            rb(j);
        }
    }

    public JSONObject kg() {
        return fxn((JSONObject) null);
    }

    public JSONObject fxn(JSONObject jSONObject) {
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
            } catch (Exception unused) {
            }
        }
        long j = this.fxn;
        if (j > 0) {
            jSONObject.put("show_start", j);
            long j2 = this.kg;
            if (j2 > 0) {
                jSONObject.put("show_firstQuartile", j2);
                long j3 = this.gff;
                if (j3 > 0) {
                    jSONObject.put("show_mid", j3);
                    long j4 = this.hm;
                    if (j4 > 0) {
                        jSONObject.put("show_thirdQuartile", j4);
                        long j5 = this.rb;
                        if (j5 > 0) {
                            jSONObject.put("show_full", j5);
                        }
                    }
                }
            }
        }
        return jSONObject;
    }
}
