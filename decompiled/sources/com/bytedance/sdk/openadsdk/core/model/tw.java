package com.bytedance.sdk.openadsdk.core.model;

import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class tw {
    private int bh;
    private int fxn;
    private List<Integer> gff;
    private int hm;
    private int kg;
    private List<String> rb;

    /* renamed from: sg, reason: collision with root package name */
    private int f9505sg;

    public boolean fxn() {
        return this.bh == 1;
    }

    public void fxn(int i) {
        this.bh = i;
    }

    public int kg() {
        int i = this.f9505sg;
        if (i >= 2) {
            return i;
        }
        return 0;
    }

    public void kg(int i) {
        this.f9505sg = i;
    }

    public List<String> gff() {
        return this.rb;
    }

    public void fxn(List<String> list) {
        this.rb = list;
    }

    public int hm() {
        return this.fxn;
    }

    public void gff(int i) {
        this.fxn = i;
    }

    public int rb() {
        return this.kg;
    }

    public void hm(int i) {
        this.kg = i;
    }

    public List<Integer> bh() {
        return this.gff;
    }

    public void kg(List<Integer> list) {
        this.gff = list;
    }

    public int sg() {
        return this.hm;
    }

    public void rb(int i) {
        this.hm = i;
    }

    public JSONObject tw() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("interceptor_x", this.fxn);
            jSONObject.put("interceptor_y", this.kg);
            if (this.gff != null) {
                JSONArray jSONArray = new JSONArray();
                Iterator<Integer> it = this.gff.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().intValue());
                }
                jSONObject.put("interceptor_page", jSONArray);
            }
            jSONObject.put("interceptor_interval_time", this.hm);
            if (this.rb != null) {
                JSONArray jSONArray2 = new JSONArray();
                Iterator<String> it2 = this.rb.iterator();
                while (it2.hasNext()) {
                    jSONArray2.put(it2.next());
                }
                jSONObject.put("url_regular", jSONArray2);
            }
            jSONObject.put("is_act", this.bh);
            jSONObject.put("boc_index", this.f9505sg);
            return jSONObject;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.dx.gff(th.getMessage(), new Object[0]);
            return jSONObject;
        }
    }
}
