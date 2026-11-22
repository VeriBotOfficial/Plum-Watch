package com.bytedance.sdk.component.adexpress.dynamic.rb;

import com.anythink.expressad.foundation.d.t;
import com.bytedance.sdk.component.adexpress.kg.rlu;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class sg implements tw {
    private com.bytedance.sdk.component.adexpress.dynamic.bh.kg fxn;

    @Override // com.bytedance.sdk.component.adexpress.dynamic.rb.tw
    public void fxn(com.bytedance.sdk.component.adexpress.dynamic.bh.kg kgVar) {
        this.fxn = kgVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.rb.tw
    public void fxn(final rlu rluVar) {
        if (rluVar.mvp() == 1) {
            kg(rluVar);
        } else {
            com.bytedance.sdk.component.adexpress.hm.hm.fxn(new com.bytedance.sdk.component.tw.tw("dynamicparse") { // from class: com.bytedance.sdk.component.adexpress.dynamic.rb.sg.1
                @Override // java.lang.Runnable
                public void run() {
                    sg.this.kg(rluVar);
                }
            }, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kg(rlu rluVar) {
        try {
            JSONObject gff = rluVar.gff();
            JSONObject jSONObject = new JSONObject(gff.optString("template_Plugin"));
            JSONObject optJSONObject = gff.optJSONObject(t.aD);
            com.bytedance.sdk.component.adexpress.dynamic.hm.tw fxn = new bh(jSONObject, optJSONObject, gff.optJSONObject("AdSize"), new JSONObject(gff.optString("diff_template_Plugin"))).fxn(rluVar.kg(), rluVar.hie(), optJSONObject.optDouble("score_exact_i18n"), optJSONObject.optString("comment_num_i18n"), rluVar);
            try {
                JSONObject jSONObject2 = new JSONObject(optJSONObject.optString("dynamic_creative"));
                fxn.fxn(jSONObject2.optString("color"));
                fxn.fxn(jSONObject2.optJSONArray("material_center"));
            } catch (Throwable unused) {
            }
            this.fxn.fxn(fxn);
        } catch (Exception unused2) {
        }
    }
}
