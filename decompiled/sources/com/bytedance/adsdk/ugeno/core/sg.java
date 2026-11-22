package com.bytedance.adsdk.ugeno.core;

import android.text.TextUtils;
import com.facebook.react.uimanager.ViewProps;
import com.umeng.analytics.pro.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmind.core.internal.dom.DOMConstants;

/* loaded from: classes13.dex */
public class sg {
    private JSONObject bh;
    private JSONObject fxn;
    private String gff;
    private JSONObject hm;
    private float jq;
    private JSONObject kg;
    private String rb;

    /* renamed from: sg, reason: collision with root package name */
    private boolean f9278sg;
    private float tw;

    public sg(JSONObject jSONObject, JSONObject jSONObject2) {
        this(jSONObject, jSONObject2, null);
    }

    public sg(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        JSONObject optJSONObject;
        if (jSONObject != null) {
            if (jSONObject.has("body")) {
                this.fxn = jSONObject.optJSONObject("body");
            } else {
                this.fxn = jSONObject.optJSONObject("main_template");
            }
            this.kg = jSONObject.optJSONObject("sub_templates");
            if (jSONObject.has("meta")) {
                optJSONObject = jSONObject.optJSONObject("meta");
            } else {
                optJSONObject = jSONObject.optJSONObject("template_info");
            }
            if (optJSONObject != null) {
                if (jSONObject.has("body")) {
                    this.f9278sg = true;
                    String optString = optJSONObject.optString("version");
                    this.gff = optString;
                    if (TextUtils.isEmpty(optString)) {
                        this.gff = "3.0";
                    }
                } else {
                    this.gff = optJSONObject.optString("sdk_version");
                }
                if (optJSONObject.has("adType")) {
                    this.rb = optJSONObject.optString("adType");
                }
            } else if (jSONObject.has("body")) {
                this.gff = "3.0";
                this.f9278sg = true;
            }
            this.hm = jSONObject2;
            this.bh = jSONObject3;
        }
    }

    public fxn fxn() {
        return rb();
    }

    public void fxn(float f, float f2) {
        this.tw = f;
        this.jq = f2;
    }

    private fxn rb() {
        if (!hm()) {
            return fxn(this.fxn, (fxn) null);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ViewProps.FLEX_DIRECTION, "row");
            jSONObject.put(ViewProps.JUSTIFY_CONTENT, "flex_start");
            jSONObject.put(ViewProps.ALIGN_ITEMS, "flex_start");
            jSONObject.put("clickable", false);
            jSONObject.put("width", "match_parent");
            jSONObject.put("height", "wrap_content");
            float f = this.tw;
            if (f > 0.0f) {
                jSONObject.put("width", f);
            }
            float f2 = this.jq;
            if (f2 > 0.0f) {
                jSONObject.put("height", f2);
            }
            String optString = this.hm.optString("xSize");
            if (!TextUtils.isEmpty(optString)) {
                JSONObject jSONObject2 = new JSONObject(optString);
                if (jSONObject2.optInt("width") > 0) {
                    jSONObject.put("width", jSONObject2.optInt("width"));
                }
                if (jSONObject2.optInt("height") > 0) {
                    jSONObject.put("height", jSONObject2.optInt("height"));
                }
            }
        } catch (JSONException unused) {
        }
        fxn fxnVar = new fxn();
        fxnVar.kg = "View";
        fxnVar.fxn = "virtualNode";
        fxnVar.gff = jSONObject;
        fxnVar.bh = null;
        fxnVar.f9279sg = this.gff;
        fxnVar.tw = this.rb;
        fxnVar.fxn(fxn(this.fxn, fxnVar));
        return fxnVar;
    }

    public String kg() {
        return this.gff;
    }

    public List<fxn> gff() {
        if (this.kg == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = this.kg.keys();
        while (keys.hasNext()) {
            fxn fxn2 = fxn(this.kg.optJSONObject(keys.next()), (fxn) null);
            if (fxn2 != null) {
                arrayList.add(fxn2);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.bytedance.adsdk.ugeno.core.sg.fxn fxn(org.json.JSONObject r12, com.bytedance.adsdk.ugeno.core.sg.fxn r13) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.core.sg.fxn(org.json.JSONObject, com.bytedance.adsdk.ugeno.core.sg$fxn):com.bytedance.adsdk.ugeno.core.sg$fxn");
    }

    public boolean fxn(fxn fxnVar) {
        JSONObject hm;
        if (fxnVar == null || (hm = fxnVar.hm()) == null) {
            return false;
        }
        return TextUtils.equals(hm.optString("width"), "match_parent");
    }

    public boolean kg(fxn fxnVar) {
        JSONObject hm;
        if (fxnVar == null || (hm = fxnVar.hm()) == null) {
            return false;
        }
        return TextUtils.equals(hm.optString("height"), "match_parent");
    }

    public boolean gff(fxn fxnVar) {
        JSONObject hm;
        if (fxnVar == null || (hm = fxnVar.hm()) == null) {
            return false;
        }
        return TextUtils.equals(hm.optString("position"), "absolute");
    }

    public boolean hm() {
        return this.f9278sg;
    }

    private void fxn(JSONObject jSONObject, JSONObject jSONObject2) {
        if (this.bh == null || jSONObject2 == null) {
            return;
        }
        try {
            String optString = this.bh.optString(jSONObject2.optString("targetId"));
            if (TextUtils.isEmpty(optString)) {
                return;
            }
            JSONObject jSONObject3 = new JSONObject(optString);
            JSONObject optJSONObject = jSONObject2.optJSONObject("targetProps");
            if (optJSONObject != null) {
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    Object opt = optJSONObject.opt(next);
                    if (TextUtils.equals(next, d.ar) && jSONObject3.has(d.ar)) {
                        if (opt instanceof JSONArray) {
                            com.bytedance.adsdk.ugeno.sg.kg.fxn(jSONObject3.optJSONArray(d.ar), (JSONArray) opt);
                        }
                    } else {
                        jSONObject3.put(next, opt);
                    }
                }
                JSONArray optJSONArray = jSONObject.optJSONArray(DOMConstants.TAG_CHILDREN);
                if (optJSONArray == null) {
                    optJSONArray = new JSONArray();
                }
                optJSONArray.put(jSONObject3);
                if (jSONObject.has(DOMConstants.TAG_CHILDREN)) {
                    return;
                }
                jSONObject.put(DOMConstants.TAG_CHILDREN, optJSONArray);
            }
        } catch (JSONException unused) {
        }
    }

    public static boolean hm(fxn fxnVar) {
        return (fxnVar == null || fxnVar.gff == null) ? false : true;
    }

    public static class fxn {
        private fxn bh;
        private String fxn;
        private JSONObject gff;
        private boolean hie;
        private JSONObject hm;
        private boolean jq;
        private String kg;
        private LinkedList<fxn> rb;

        /* renamed from: sg, reason: collision with root package name */
        private String f9279sg;
        private String tw;

        public String fxn() {
            return this.fxn;
        }

        public String kg() {
            return this.f9279sg;
        }

        public String gff() {
            return this.kg;
        }

        public void fxn(String str) {
            this.kg = str;
        }

        public void fxn(boolean z) {
            this.jq = z;
        }

        public void kg(boolean z) {
            this.hie = z;
        }

        public JSONObject hm() {
            return this.gff;
        }

        public List<fxn> rb() {
            return this.rb;
        }

        public void fxn(fxn fxnVar) {
            if (this.rb == null) {
                this.rb = new LinkedList<>();
            }
            this.rb.add(fxnVar);
        }

        public void kg(fxn fxnVar) {
            if (this.rb == null) {
                this.rb = new LinkedList<>();
            }
            this.rb.addLast(fxnVar);
        }

        public void fxn(int i, fxn fxnVar) {
            if (this.rb == null) {
                this.rb = new LinkedList<>();
            }
            this.rb.add(i, fxnVar);
        }

        public JSONObject bh() {
            return this.hm;
        }

        public String toString() {
            return "UGNode{id='" + this.fxn + "', name='" + this.kg + "'}";
        }
    }
}
