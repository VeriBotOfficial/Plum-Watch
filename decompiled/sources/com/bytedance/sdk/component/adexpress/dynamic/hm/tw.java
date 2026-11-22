package com.bytedance.sdk.component.adexpress.dynamic.hm;

import android.text.TextUtils;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class tw {
    private float bh;
    private tw dgx;
    private String fxn;
    private float gff;
    private List<tw> hie;
    private float hm;
    private rb jq;
    private float kg;
    private List<List<tw>> mvp;
    private float rb;
    private String rlu;

    /* renamed from: sg, reason: collision with root package name */
    private float f9335sg;
    private float tw;
    private boolean zu;
    private Map<String, String> ckl = new HashMap();
    private Map<Integer, String> xdg = new HashMap();

    public String fxn() {
        return this.rlu;
    }

    public void fxn(String str) {
        this.rlu = str;
    }

    public Map<Integer, String> kg() {
        return this.xdg;
    }

    public void fxn(JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                if (jSONArray.length() == 0) {
                    return;
                }
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    this.xdg.put(Integer.valueOf(optJSONObject.optInt("id")), optJSONObject.optString("value"));
                }
            } catch (Throwable unused) {
            }
        }
    }

    public String gff() {
        return this.fxn;
    }

    public void kg(String str) {
        this.fxn = str;
    }

    public float hm() {
        return this.hm;
    }

    public void fxn(float f) {
        this.hm = f;
    }

    public float rb() {
        return this.rb;
    }

    public void kg(float f) {
        this.rb = f;
    }

    public float bh() {
        return this.kg;
    }

    public void gff(float f) {
        this.kg = f;
    }

    public float sg() {
        return this.gff;
    }

    public void hm(float f) {
        this.gff = f;
    }

    public float tw() {
        return this.bh;
    }

    public void rb(float f) {
        this.bh = f;
    }

    public float jq() {
        return this.f9335sg;
    }

    public void bh(float f) {
        this.f9335sg = f;
    }

    public void sg(float f) {
        this.tw = f;
    }

    public rb hie() {
        return this.jq;
    }

    public void fxn(rb rbVar) {
        this.jq = rbVar;
    }

    public List<tw> dgx() {
        return this.hie;
    }

    public void fxn(List<tw> list) {
        this.hie = list;
    }

    public void fxn(tw twVar) {
        this.dgx = twVar;
    }

    public tw mvp() {
        return this.dgx;
    }

    public int rlu() {
        bh rb = this.jq.rb();
        return rb.pjf() + rb.xtn();
    }

    public int zu() {
        bh rb = this.jq.rb();
        return rb.deg() + rb.np();
    }

    public float ckl() {
        bh rb = this.jq.rb();
        return rlu() + rb.ckl() + rb.xdg() + (rb.mvp() * 2.0f);
    }

    public float xdg() {
        bh rb = this.jq.rb();
        return zu() + rb.rmu() + rb.zu() + (rb.mvp() * 2.0f);
    }

    public void kg(List<List<tw>> list) {
        this.mvp = list;
    }

    public List<List<tw>> rmu() {
        return this.mvp;
    }

    public boolean je() {
        List<tw> list = this.hie;
        return list == null || list.size() <= 0;
    }

    public boolean ud() {
        return this.zu;
    }

    public void fxn(boolean z) {
        this.zu = z;
    }

    public Map<String, String> dx() {
        return this.ckl;
    }

    public void fxn(String str, String str2) {
        this.ckl.put(str, str2);
    }

    public void ums() {
        List<List<tw>> list = this.mvp;
        if (list == null || list.size() <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (List<tw> list2 : this.mvp) {
            if (list2 != null && list2.size() > 0) {
                arrayList.add(list2);
            }
        }
        this.mvp = arrayList;
    }

    public boolean iwp() {
        return TextUtils.equals(this.jq.rb().zn(), ViewProps.FLEX);
    }

    public String jz() {
        return this.jq.rb().jz();
    }

    public void gff(String str) {
        this.jq.rb().bh(str);
    }

    public String toString() {
        return "DynamicLayoutUnit{id='" + this.fxn + "', x=" + this.kg + ", y=" + this.gff + ", width=" + this.bh + ", height=" + this.f9335sg + ", remainWidth=" + this.tw + ", rootBrick=" + this.jq + ", childrenBrickUnits=" + this.hie + AbstractJsonLexerKt.END_OBJ;
    }

    public boolean bx() {
        return this.jq.rb().gs() < 0 || this.jq.rb().fa() < 0 || this.jq.rb().ig() < 0 || this.jq.rb().mcr() < 0;
    }

    public String fxn(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.jq.kg());
        sb.append(":");
        sb.append(this.fxn);
        if (this.jq.rb() != null) {
            sb.append(":");
            sb.append(this.jq.rb().op());
        }
        sb.append(":");
        sb.append(i);
        return sb.toString();
    }
}
