package com.bytedance.sdk.openadsdk.hm;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
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

    /* JADX WARN: Code duplicated, block: B:10:0x0026 A[Catch: Exception -> 0x0042, TryCatch #0 {Exception -> 0x0042, blocks: (B:3:0x0002, B:4:0x0008, B:6:0x0010, B:8:0x001b, B:10:0x0026, B:12:0x0031, B:14:0x003c), top: B:17:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:12:0x0031 A[Catch: Exception -> 0x0042, TryCatch #0 {Exception -> 0x0042, blocks: (B:3:0x0002, B:4:0x0008, B:6:0x0010, B:8:0x001b, B:10:0x0026, B:12:0x0031, B:14:0x003c), top: B:17:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:14:0x003c A[Catch: Exception -> 0x0042, TRY_LEAVE, TryCatch #0 {Exception -> 0x0042, blocks: (B:3:0x0002, B:4:0x0008, B:6:0x0010, B:8:0x001b, B:10:0x0026, B:12:0x0031, B:14:0x003c), top: B:17:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:6:0x0010 A[Catch: Exception -> 0x0042, TryCatch #0 {Exception -> 0x0042, blocks: (B:3:0x0002, B:4:0x0008, B:6:0x0010, B:8:0x001b, B:10:0x0026, B:12:0x0031, B:14:0x003c), top: B:17:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001b A[Catch: Exception -> 0x0042, TryCatch #0 {Exception -> 0x0042, blocks: (B:3:0x0002, B:4:0x0008, B:6:0x0010, B:8:0x001b, B:10:0x0026, B:12:0x0031, B:14:0x003c), top: B:17:0x0002 }] */
    public JSONObject fxn(JSONObject jSONObject) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
                j = this.fxn;
                if (j > 0) {
                    jSONObject.put("show_start", j);
                    j2 = this.kg;
                    if (j2 > 0) {
                        jSONObject.put("show_firstQuartile", j2);
                        j3 = this.gff;
                        if (j3 > 0) {
                            jSONObject.put("show_mid", j3);
                            j4 = this.hm;
                            if (j4 > 0) {
                                jSONObject.put("show_thirdQuartile", j4);
                                j5 = this.rb;
                                if (j5 > 0) {
                                    jSONObject.put("show_full", j5);
                                }
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        } else {
            j = this.fxn;
            if (j > 0) {
                jSONObject.put("show_start", j);
                j2 = this.kg;
                if (j2 > 0) {
                    jSONObject.put("show_firstQuartile", j2);
                    j3 = this.gff;
                    if (j3 > 0) {
                        jSONObject.put("show_mid", j3);
                        j4 = this.hm;
                        if (j4 > 0) {
                            jSONObject.put("show_thirdQuartile", j4);
                            j5 = this.rb;
                            if (j5 > 0) {
                                jSONObject.put("show_full", j5);
                            }
                        }
                    }
                }
            }
        }
        return jSONObject;
    }
}
