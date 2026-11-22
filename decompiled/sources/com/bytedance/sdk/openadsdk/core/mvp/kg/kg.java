package com.bytedance.sdk.openadsdk.core.mvp.kg;

import com.bytedance.sdk.openadsdk.core.mvp.kg.gff;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class kg extends gff implements Comparable<kg> {
    private final float fxn;

    private kg(float f, String str, gff.EnumC0520gff enumC0520gff, Boolean bool) {
        super(str, enumC0520gff, bool);
        this.fxn = f;
    }

    public boolean fxn(float f) {
        return this.fxn <= f && !rb();
    }

    @Override // java.lang.Comparable
    /* renamed from: fxn, reason: merged with bridge method [inline-methods] */
    public int compareTo(kg kgVar) {
        if (kgVar == null) {
            return 1;
        }
        float f = this.fxn;
        float f2 = kgVar.fxn;
        if (f > f2) {
            return 1;
        }
        return f < f2 ? -1 : 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.mvp.kg.gff
    public void j_() {
        super.j_();
    }

    public static class fxn {
        private final String fxn;
        private gff.EnumC0520gff gff = gff.EnumC0520gff.TRACKING_URL;
        private boolean hm = false;
        private final float kg;

        public fxn(String str, float f) {
            this.fxn = str;
            this.kg = f;
        }

        public kg fxn() {
            return new kg(this.kg, this.fxn, this.gff, Boolean.valueOf(this.hm));
        }
    }

    public JSONObject kg() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("content", gff());
        jSONObject.put("trackingFraction", this.fxn);
        return jSONObject;
    }

    public String toString() {
        return super.toString();
    }
}
