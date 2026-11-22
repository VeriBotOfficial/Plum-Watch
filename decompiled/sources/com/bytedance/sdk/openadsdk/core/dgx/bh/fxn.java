package com.bytedance.sdk.openadsdk.core.dgx.bh;

import com.bytedance.adsdk.ugeno.core.je;
import com.bytedance.sdk.component.adexpress.kg.rlu;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class fxn extends rlu {
    private JSONObject fxn;
    private float gff;
    private float hm;
    private je kg;
    private boolean rb;

    public fxn(C0501fxn c0501fxn) {
        super(c0501fxn);
        this.fxn = c0501fxn.fxn;
        this.kg = c0501fxn.kg;
        this.gff = c0501fxn.gff;
        this.hm = c0501fxn.hm;
        this.rb = c0501fxn.rb;
    }

    public float ggo() {
        return this.gff;
    }

    public float ax() {
        return this.hm;
    }

    public JSONObject ci() {
        return this.fxn;
    }

    public je rz() {
        return this.kg;
    }

    public boolean ils() {
        return this.rb;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.dgx.bh.fxn$fxn, reason: collision with other inner class name */
    public static class C0501fxn extends rlu.fxn {
        private JSONObject fxn;
        private float gff;
        private float hm;
        private je kg;
        private boolean rb;

        public C0501fxn fxn(JSONObject jSONObject) {
            this.fxn = jSONObject;
            return this;
        }

        public C0501fxn fxn(je jeVar) {
            this.kg = jeVar;
            return this;
        }

        public C0501fxn fxn(float f) {
            this.gff = f;
            return this;
        }

        public C0501fxn kg(float f) {
            this.hm = f;
            return this;
        }

        public C0501fxn bh(boolean z) {
            this.rb = z;
            return this;
        }

        @Override // com.bytedance.sdk.component.adexpress.kg.rlu.fxn
        /* renamed from: kg, reason: merged with bridge method [inline-methods] */
        public fxn fxn() {
            return new fxn(this);
        }
    }
}
