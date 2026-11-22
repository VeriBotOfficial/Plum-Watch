package com.bytedance.sdk.component.bh.fxn.hm.fxn;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class fxn implements com.bytedance.sdk.component.bh.fxn.hm.fxn {
    private long bh;
    private String dgx;
    protected JSONObject fxn;
    private byte gff;
    private byte hie;
    private byte hm;
    private String jq;
    private kg kg;
    private int mvp;
    private long rb;

    /* renamed from: sg, reason: collision with root package name */
    private long f9356sg;
    private String tw;

    public fxn(String str, JSONObject jSONObject) {
        this.jq = str;
        this.fxn = jSONObject;
    }

    public fxn(String str, kg kgVar) {
        this.jq = str;
        this.kg = kgVar;
    }

    @Override // com.bytedance.sdk.component.bh.fxn.hm.fxn
    public kg fxn() {
        return this.kg;
    }

    private fxn() {
    }

    public String dgx() {
        return this.dgx;
    }

    @Override // com.bytedance.sdk.component.bh.fxn.hm.fxn
    public synchronized JSONObject sg() {
        kg kgVar;
        if (this.fxn == null && (kgVar = this.kg) != null) {
            this.fxn = kgVar.fxn(dgx());
        }
        return this.fxn;
    }

    @Override // com.bytedance.sdk.component.bh.fxn.hm.fxn
    public void fxn(JSONObject jSONObject) {
        this.fxn = jSONObject;
    }

    public static com.bytedance.sdk.component.bh.fxn.hm.fxn gff(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("type");
            int optInt2 = jSONObject.optInt("priority");
            fxn fxnVar = new fxn();
            fxnVar.fxn((byte) optInt);
            fxnVar.kg((byte) optInt2);
            fxnVar.fxn(jSONObject.optJSONObject("event"));
            fxnVar.fxn(jSONObject.optString("localId"));
            fxnVar.kg(jSONObject.optString("genTime"));
            fxnVar.fxn(jSONObject.optInt("channel"));
            return fxnVar;
        } catch (JSONException unused) {
            return null;
        }
    }

    public void gff(byte b) {
        this.hie = b;
    }

    @Override // com.bytedance.sdk.component.bh.fxn.hm.fxn
    public byte kg() {
        return this.hie;
    }

    @Override // com.bytedance.sdk.component.bh.fxn.hm.fxn
    public String gff() {
        return this.jq;
    }

    @Override // com.bytedance.sdk.component.bh.fxn.hm.fxn
    public byte hm() {
        return this.gff;
    }

    @Override // com.bytedance.sdk.component.bh.fxn.hm.fxn
    public void fxn(byte b) {
        this.gff = b;
    }

    @Override // com.bytedance.sdk.component.bh.fxn.hm.fxn
    public void fxn(String str) {
        this.jq = str;
    }

    @Override // com.bytedance.sdk.component.bh.fxn.hm.fxn
    public void kg(String str) {
        this.tw = str;
    }

    @Override // com.bytedance.sdk.component.bh.fxn.hm.fxn
    public void fxn(long j) {
        this.rb = j;
    }

    @Override // com.bytedance.sdk.component.bh.fxn.hm.fxn
    public long tw() {
        return this.rb;
    }

    @Override // com.bytedance.sdk.component.bh.fxn.hm.fxn
    public void kg(long j) {
        this.bh = j;
    }

    @Override // com.bytedance.sdk.component.bh.fxn.hm.fxn
    public long jq() {
        return this.bh;
    }

    @Override // com.bytedance.sdk.component.bh.fxn.hm.fxn
    public void gff(long j) {
        this.f9356sg = j;
    }

    @Override // com.bytedance.sdk.component.bh.fxn.hm.fxn
    public int hie() {
        return this.mvp;
    }

    @Override // com.bytedance.sdk.component.bh.fxn.hm.fxn
    public void fxn(int i) {
        this.mvp = i;
    }

    public String mvp() {
        return this.tw;
    }

    @Override // com.bytedance.sdk.component.bh.fxn.hm.fxn
    public void kg(byte b) {
        this.hm = b;
    }

    @Override // com.bytedance.sdk.component.bh.fxn.hm.fxn
    public byte rb() {
        return this.hm;
    }

    @Override // com.bytedance.sdk.component.bh.fxn.hm.fxn
    public String bh() {
        if (TextUtils.isEmpty(this.jq)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("localId", this.jq);
            jSONObject.put("event", sg());
            jSONObject.put("genTime", mvp());
            jSONObject.put("priority", (int) this.hm);
            jSONObject.put("type", (int) this.gff);
            jSONObject.put("channel", this.mvp);
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }
}
