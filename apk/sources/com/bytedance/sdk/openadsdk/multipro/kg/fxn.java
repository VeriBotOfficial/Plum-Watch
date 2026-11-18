package com.bytedance.sdk.openadsdk.multipro.kg;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class fxn {
    public long bh;
    public boolean fxn;
    public boolean gff;
    public boolean hm;
    public boolean kg;
    public long rb;

    /* JADX INFO: renamed from: sg, reason: collision with root package name */
    public long f9566sg;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.multipro.kg.fxn$fxn, reason: collision with other inner class name */
    public interface InterfaceC0631fxn {
        fxn bh();
    }

    public fxn fxn(boolean z) {
        this.hm = z;
        return this;
    }

    public fxn kg(boolean z) {
        this.fxn = z;
        return this;
    }

    public fxn gff(boolean z) {
        this.kg = z;
        return this;
    }

    public fxn hm(boolean z) {
        this.gff = z;
        return this;
    }

    public fxn fxn(long j) {
        this.rb = j;
        return this;
    }

    public fxn kg(long j) {
        this.bh = j;
        return this;
    }

    public fxn gff(long j) {
        this.f9566sg = j;
        return this;
    }

    public JSONObject fxn() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isCompleted", this.fxn);
            jSONObject.put("isFromVideoDetailPage", this.kg);
            jSONObject.put("isFromDetailPage", this.gff);
            jSONObject.put("duration", this.rb);
            jSONObject.put("totalPlayDuration", this.bh);
            jSONObject.put("currentPlayPosition", this.f9566sg);
            jSONObject.put("isAutoPlay", this.hm);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static fxn fxn(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        fxn fxnVar = new fxn();
        fxnVar.kg(jSONObject.optBoolean("isCompleted"));
        fxnVar.gff(jSONObject.optBoolean("isFromVideoDetailPage"));
        fxnVar.hm(jSONObject.optBoolean("isFromDetailPage"));
        fxnVar.fxn(jSONObject.optLong("duration"));
        fxnVar.kg(jSONObject.optLong("totalPlayDuration"));
        fxnVar.gff(jSONObject.optLong("currentPlayPosition"));
        fxnVar.fxn(jSONObject.optBoolean("isAutoPlay"));
        return fxnVar;
    }
}
