package com.bytedance.sdk.component.adexpress.dynamic.rb;

import android.text.TextUtils;
import com.baidu.ar.statistic.StatisticConstants;
import com.bytedance.sdk.component.adexpress.dynamic.rb.rb;
import com.bytedance.sdk.component.adexpress.kg.rlu;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmind.core.ITopic;
import org.xmind.core.internal.dom.DOMConstants;

/* loaded from: classes13.dex */
public class bh {

    /* renamed from: sg, reason: collision with root package name */
    private static HashMap<String, String> f9336sg;
    private com.bytedance.sdk.component.adexpress.dynamic.hm.hm bh;
    private JSONObject fxn;
    private com.bytedance.sdk.component.adexpress.dynamic.hm.gff gff;
    private fxn hm;
    private JSONObject kg;
    private gff rb;

    static {
        HashMap<String, String> hashMap = new HashMap<>();
        f9336sg = hashMap;
        hashMap.put("subtitle", "description");
        f9336sg.put("source", "source|app.app_name");
        f9336sg.put(StatisticConstants.SCREENSHOT, "dynamic_creative.screenshot");
    }

    public bh(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        this.fxn = jSONObject;
        this.kg = jSONObject2;
        this.gff = new com.bytedance.sdk.component.adexpress.dynamic.hm.gff(jSONObject2);
        this.hm = fxn.fxn(jSONObject3);
        this.bh = com.bytedance.sdk.component.adexpress.dynamic.hm.hm.fxn(jSONObject4);
    }

    public com.bytedance.sdk.component.adexpress.dynamic.hm.tw fxn(double d, int i, double d2, String str, rlu rluVar) {
        JSONObject jSONObject;
        this.gff.fxn();
        try {
            jSONObject = new JSONObject(this.bh.kg);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        com.bytedance.sdk.component.adexpress.dynamic.hm.tw fxn2 = fxn(hm.fxn(this.fxn, jSONObject), (com.bytedance.sdk.component.adexpress.dynamic.hm.tw) null);
        fxn(fxn2);
        rb rbVar = new rb(d, i, d2, str, rluVar);
        rb.fxn fxnVar = new rb.fxn();
        fxnVar.fxn = this.hm.fxn;
        fxnVar.kg = this.hm.kg;
        fxnVar.gff = 0.0f;
        rbVar.fxn(fxnVar);
        rbVar.fxn(fxn2, 0.0f, 0.0f);
        rbVar.fxn();
        if (rbVar.fxn.hm == 65536.0f) {
            return null;
        }
        return rbVar.fxn.bh;
    }

    private void fxn(com.bytedance.sdk.component.adexpress.dynamic.hm.tw twVar) {
        int fxn2;
        if (twVar == null) {
            return;
        }
        if (com.bytedance.sdk.component.adexpress.fxn.fxn.fxn.fxn().gff() != null) {
            fxn2 = com.bytedance.sdk.component.adexpress.fxn.fxn.fxn.fxn().gff().ckl();
        } else {
            fxn2 = com.bytedance.sdk.component.adexpress.hm.sg.fxn(com.bytedance.sdk.component.adexpress.hm.fxn());
        }
        float min = this.hm.gff ? this.hm.fxn : Math.min(this.hm.fxn, com.bytedance.sdk.component.adexpress.hm.sg.kg(com.bytedance.sdk.component.adexpress.hm.fxn(), fxn2));
        if (this.hm.kg == 0.0f) {
            twVar.rb(min);
            twVar.hie().rb().hie("auto");
            twVar.bh(0.0f);
        } else {
            twVar.rb(min);
            twVar.bh(this.hm.gff ? this.hm.kg : Math.min(this.hm.kg, com.bytedance.sdk.component.adexpress.hm.sg.kg(com.bytedance.sdk.component.adexpress.hm.fxn(), com.bytedance.sdk.component.adexpress.hm.sg.kg(com.bytedance.sdk.component.adexpress.hm.fxn()))));
            twVar.hie().rb().hie("fixed");
        }
    }

    public com.bytedance.sdk.component.adexpress.dynamic.hm.tw fxn(JSONObject jSONObject, com.bytedance.sdk.component.adexpress.dynamic.hm.tw twVar) {
        int length;
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("type");
        if (TextUtils.equals(optString, "custom-component-vessel")) {
            int optInt = jSONObject.optInt("componentId");
            if (this.bh != null) {
                gff gffVar = new gff();
                this.rb = gffVar;
                JSONObject fxn2 = gffVar.fxn(this.bh.fxn, optInt, jSONObject);
                if (fxn2 != null) {
                    jSONObject = fxn2;
                }
            }
        }
        com.bytedance.sdk.component.adexpress.dynamic.hm.tw fxn3 = fxn(jSONObject);
        fxn3.fxn(twVar);
        JSONArray optJSONArray = jSONObject.optJSONArray(DOMConstants.TAG_CHILDREN);
        if (optJSONArray == null) {
            fxn3.fxn((List<com.bytedance.sdk.component.adexpress.dynamic.hm.tw>) null);
            return fxn3;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONArray optJSONArray2 = optJSONArray.optJSONArray(i);
            if (optJSONArray2 != null) {
                ArrayList arrayList3 = new ArrayList();
                if (TextUtils.equals(optString, "tag-group")) {
                    length = fxn3.hie().rb().rns();
                } else {
                    length = optJSONArray2.length();
                }
                for (int i2 = 0; i2 < length; i2++) {
                    com.bytedance.sdk.component.adexpress.dynamic.hm.tw fxn4 = fxn(optJSONArray2.optJSONObject(i2), fxn3);
                    if (com.bytedance.sdk.component.adexpress.hm.kg() && "skip-with-time".equals(fxn3.hie().kg()) && !"transparent".equals(fxn3.jz()) && !TextUtils.isEmpty(fxn3.jz())) {
                        fxn4.gff(fxn3.jz());
                    }
                    arrayList.add(fxn4);
                    arrayList3.add(fxn4);
                }
                arrayList2.add(arrayList3);
            }
        }
        if (arrayList.size() > 0) {
            fxn3.fxn(arrayList);
        }
        if (arrayList2.size() > 0) {
            fxn3.kg(arrayList2);
        }
        return fxn3;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.hm.tw fxn(JSONObject jSONObject) {
        String fxn2;
        JSONObject jSONObject2;
        String optString = jSONObject.optString("type");
        String optString2 = jSONObject.optString("id");
        JSONObject optJSONObject = jSONObject.optJSONObject("values");
        jq.fxn(optString, optJSONObject);
        JSONObject fxn3 = jq.fxn(optString, jq.fxn(jSONObject.optJSONArray("sceneValues")), optJSONObject);
        com.bytedance.sdk.component.adexpress.dynamic.hm.tw twVar = new com.bytedance.sdk.component.adexpress.dynamic.hm.tw();
        if (TextUtils.isEmpty(optString2)) {
            twVar.kg(String.valueOf(twVar.hashCode()));
        } else {
            twVar.kg(optString2);
        }
        if (optJSONObject != null) {
            kg(twVar);
            twVar.gff((float) optJSONObject.optDouble("x"));
            twVar.hm((float) optJSONObject.optDouble("y"));
            twVar.rb((float) optJSONObject.optDouble("width"));
            twVar.bh((float) optJSONObject.optDouble("height"));
            twVar.sg(optJSONObject.optInt("remainWidth"));
            com.bytedance.sdk.component.adexpress.dynamic.hm.rb rbVar = new com.bytedance.sdk.component.adexpress.dynamic.hm.rb();
            rbVar.fxn(optString);
            rbVar.kg(optJSONObject.optString("data"));
            rbVar.gff(optJSONObject.optString("dataExtraInfo"));
            com.bytedance.sdk.component.adexpress.dynamic.hm.bh fxn4 = com.bytedance.sdk.component.adexpress.dynamic.hm.bh.fxn(optJSONObject);
            rbVar.fxn(fxn4);
            com.bytedance.sdk.component.adexpress.dynamic.hm.bh fxn5 = com.bytedance.sdk.component.adexpress.dynamic.hm.bh.fxn(fxn3);
            if (fxn5 == null) {
                rbVar.kg(fxn4);
            } else {
                rbVar.kg(fxn5);
            }
            fxn(fxn4);
            fxn(fxn5);
            if (TextUtils.equals(optString, "video-image-budget") && (jSONObject2 = this.kg) != null) {
                fxn(rbVar, jSONObject2.optInt("image_mode"));
            }
            String kg = rbVar.kg();
            com.bytedance.sdk.component.adexpress.dynamic.hm.bh rb = rbVar.rb();
            if (f9336sg.containsKey(kg) && !rb.fqt()) {
                rb.dx(f9336sg.get(kg));
            }
            if (rb.fqt()) {
                fxn2 = rbVar.gff();
            } else {
                fxn2 = fxn(rbVar.gff());
            }
            if (com.bytedance.sdk.component.adexpress.hm.kg()) {
                if (TextUtils.equals(kg, "star") || TextUtils.equals(kg, "text_star")) {
                    fxn2 = fxn("dynamic_creative.score_exact_i18n|");
                }
                if (TextUtils.equals(kg, "score-count") || TextUtils.equals(kg, "score-count-type-1") || TextUtils.equals(kg, "score-count-type-2")) {
                    fxn2 = fxn("dynamic_creative.comment_num_i18n|");
                }
                if (ITopic.ROOT.equals(kg) && fxn4.jch()) {
                    fxn2 = fxn("image.0.url");
                }
            }
            if (!TextUtils.isEmpty(fxn()) && (TextUtils.equals("logo-union", optString) || TextUtils.equals("logo", optString))) {
                rbVar.kg(fxn2 + "adx:" + fxn());
            } else {
                rbVar.kg(fxn2);
            }
            twVar.fxn(rbVar);
        }
        return twVar;
    }

    private void kg(com.bytedance.sdk.component.adexpress.dynamic.hm.tw twVar) {
        com.bytedance.sdk.component.adexpress.dynamic.hm.gff gffVar;
        Object fxn2;
        Object fxn3;
        Object fxn4;
        Object fxn5;
        if (twVar == null || (gffVar = this.gff) == null || (fxn2 = gffVar.fxn("image.0.url")) == null) {
            return;
        }
        String valueOf = String.valueOf(fxn2);
        if (TextUtils.isEmpty(valueOf) || (fxn3 = this.gff.fxn("title")) == null) {
            return;
        }
        String valueOf2 = String.valueOf(fxn3);
        if (TextUtils.isEmpty(valueOf2) || (fxn4 = this.gff.fxn("description")) == null) {
            return;
        }
        String valueOf3 = String.valueOf(fxn4);
        if (TextUtils.isEmpty(valueOf3) || (fxn5 = this.gff.fxn("icon")) == null) {
            return;
        }
        String valueOf4 = String.valueOf(fxn5);
        if (TextUtils.isEmpty(valueOf4)) {
            return;
        }
        Object fxn6 = this.gff.fxn("app.app_name");
        Object fxn7 = this.gff.fxn("source");
        if (fxn6 == null && fxn7 == null) {
            return;
        }
        if (fxn6 == null) {
            fxn6 = fxn7;
        }
        String valueOf5 = String.valueOf(fxn6);
        if (TextUtils.isEmpty(valueOf5)) {
            return;
        }
        twVar.fxn("imageUrl", valueOf);
        twVar.fxn("title", valueOf2);
        twVar.fxn("description", valueOf3);
        twVar.fxn("icon", valueOf4);
        twVar.fxn("app_name", valueOf5);
        twVar.fxn(true);
    }

    private void fxn(com.bytedance.sdk.component.adexpress.dynamic.hm.rb rbVar, int i) {
        int lastIndexOf;
        if (i == 5 || i == 15 || i == 50 || i == 154) {
            rbVar.fxn("video");
            String fxn2 = jq.fxn("video");
            rbVar.rb().dx(fxn2);
            String fxn3 = jq.fxn("video", "clickArea");
            if (!TextUtils.isEmpty(fxn3)) {
                rbVar.rb().ckl(fxn3);
                rbVar.sg().ckl(fxn3);
            }
            rbVar.sg().dx(fxn2);
            rbVar.kg(fxn2);
            rbVar.rb().rhk();
            return;
        }
        rbVar.fxn("image");
        String fxn4 = jq.fxn("image");
        com.bytedance.sdk.component.adexpress.dynamic.hm.bh rb = rbVar.rb();
        rb.dx(fxn4);
        rbVar.sg().dx(fxn4);
        String fxn5 = jq.fxn("image", "clickArea");
        if (!TextUtils.isEmpty(fxn5)) {
            rb.ckl(fxn5);
            rbVar.sg().ckl(fxn5);
        }
        JSONObject ib = rb.ib();
        if (ib != null) {
            rb.jz(ib.optString("imageLottieTosPath"));
            rb.mvp(ib.optBoolean("animationsLoop"));
            rb.ke(ib.optInt("lottieAppNameMaxLength"));
            rb.zn(ib.optInt("lottieAdDescMaxLength"));
            rb.mve(ib.optInt("lottieAdTitleMaxLength"));
        }
        rbVar.kg(fxn4);
        if (fxn4 != null && (lastIndexOf = fxn4.lastIndexOf(".")) > 0) {
            String substring = fxn4.substring(0, lastIndexOf);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("width", fxn(substring + ".width"));
                jSONObject.put("height", fxn(substring + ".height"));
            } catch (JSONException unused) {
            }
            rbVar.gff(jSONObject.toString());
        }
        rb.mq();
    }

    private String fxn(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        for (String str2 : str.split("\\|")) {
            if (this.gff.kg(str2)) {
                String valueOf = String.valueOf(this.gff.fxn(str2));
                if (!TextUtils.isEmpty(valueOf)) {
                    return valueOf;
                }
            }
        }
        return "";
    }

    private String fxn() {
        Object fxn2;
        com.bytedance.sdk.component.adexpress.dynamic.hm.gff gffVar = this.gff;
        return (gffVar == null || (fxn2 = gffVar.fxn("adx_name")) == null) ? "" : String.valueOf(fxn2);
    }

    private void fxn(com.bytedance.sdk.component.adexpress.dynamic.hm.bh bhVar) {
        if (bhVar == null) {
            return;
        }
        String ggo = bhVar.ggo();
        if (com.bytedance.sdk.component.adexpress.hm.kg()) {
            String gff = com.bytedance.sdk.component.adexpress.hm.sg.gff(com.bytedance.sdk.component.adexpress.hm.fxn());
            if ("zh".equals(gff)) {
                gff = "cn";
            }
            if (!TextUtils.isEmpty(gff) && bhVar.bh() != null) {
                String optString = bhVar.bh().optString(gff);
                if (!TextUtils.isEmpty(optString)) {
                    ggo = optString;
                }
            }
        }
        if (TextUtils.isEmpty(ggo)) {
            return;
        }
        int indexOf = ggo.indexOf("{{");
        int indexOf2 = ggo.indexOf("}}");
        if (indexOf < 0 || indexOf2 < 0 || indexOf2 < indexOf) {
            bhVar.mvp(ggo);
            return;
        }
        String fxn2 = fxn(ggo.substring(indexOf + 2, indexOf2));
        StringBuilder sb = new StringBuilder(ggo.substring(0, indexOf));
        if (!TextUtils.isEmpty(fxn2)) {
            sb.append(fxn2);
        }
        sb.append(ggo.substring(indexOf2 + 2));
        bhVar.mvp(sb.toString());
    }

    static class fxn {
        float fxn;
        boolean gff;
        float kg;

        public static fxn fxn(JSONObject jSONObject) {
            fxn fxnVar = new fxn();
            if (jSONObject != null) {
                fxnVar.fxn = (float) jSONObject.optDouble("width");
                fxnVar.kg = (float) jSONObject.optDouble("height");
                fxnVar.gff = jSONObject.optBoolean("isLandscape");
            }
            return fxnVar;
        }
    }
}
