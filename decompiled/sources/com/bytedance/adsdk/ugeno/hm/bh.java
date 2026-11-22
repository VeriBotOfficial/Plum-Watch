package com.bytedance.adsdk.ugeno.hm;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class bh {
    private fxn fxn;
    private List<fxn> kg;

    public fxn fxn() {
        return this.fxn;
    }

    public List<fxn> kg() {
        return this.kg;
    }

    public static class fxn {
        private Map<String, Object> bh;
        private String fxn;
        private String gff = "global";
        private String hm;
        private String kg;
        private Map<String, String> rb;

        public String fxn() {
            return this.gff;
        }

        public void fxn(String str) {
            this.gff = str;
        }

        public String kg() {
            return this.hm;
        }

        public void kg(String str) {
            this.hm = str;
        }

        public Map<String, String> gff() {
            return this.rb;
        }

        public void fxn(Map<String, String> map) {
            this.rb = map;
        }

        public void gff(String str) {
            this.fxn = str;
        }

        public String hm() {
            return this.fxn;
        }

        public void hm(String str) {
            this.kg = str;
        }

        public String rb() {
            return this.kg;
        }

        public void kg(Map<String, Object> map) {
            this.bh = map;
        }

        public String toString() {
            return "Action{scheme='" + this.gff + "', name='" + this.hm + "', params=" + this.rb + ", host='" + this.kg + "', origin='" + this.fxn + "', extra=" + this.bh + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public static bh fxn(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null) {
            return null;
        }
        bh bhVar = new bh();
        String optString = jSONObject.optString("on");
        JSONArray optJSONArray = jSONObject.optJSONArray("handlers");
        bhVar.fxn = mvp.fxn(optString, jSONObject2);
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            fxn fxn2 = mvp.fxn(optJSONArray.optString(i), jSONObject2);
            if (fxn2 != null) {
                arrayList.add(fxn2);
            }
        }
        bhVar.kg = arrayList;
        return bhVar;
    }
}
