package com.bytedance.adsdk.ugeno.core;

import android.content.Context;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes15.dex */
public class dgx {
    private Context fxn;
    private JSONObject gff;
    private Map<String, Object> hm;
    private JSONObject kg;

    public void fxn(Context context) {
        this.fxn = context;
    }

    public void fxn(JSONObject jSONObject) {
        this.kg = jSONObject;
    }

    public JSONObject fxn() {
        return this.gff;
    }

    public void kg(JSONObject jSONObject) {
        this.gff = jSONObject;
    }

    public Map<String, Object> kg() {
        return this.hm;
    }

    public void fxn(Map<String, Object> map) {
        this.hm = map;
    }
}
