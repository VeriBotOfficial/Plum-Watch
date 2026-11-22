package com.bytedance.sdk.openadsdk.core.model;

import android.util.SparseArray;
import com.bytedance.sdk.openadsdk.core.gff.gff;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class xdg implements com.bytedance.sdk.component.adexpress.gff {
    public final long bh;
    public int ckl;
    public final boolean dgx;
    public final float fxn;
    public final float gff;
    public SparseArray<gff.fxn> hie;
    public final float hm;
    public JSONObject jq;
    public final float kg;
    public int mvp;
    public final long rb;
    public JSONObject rlu;

    /* renamed from: sg, reason: collision with root package name */
    public final String f9508sg;
    public int tw;
    public boolean zu;

    private xdg(fxn fxnVar) {
        this.zu = false;
        this.fxn = fxnVar.f9509sg;
        this.kg = fxnVar.bh;
        this.gff = fxnVar.rb;
        this.hm = fxnVar.hm;
        this.rb = fxnVar.gff;
        this.bh = fxnVar.kg;
        this.f9508sg = fxnVar.jq;
        this.hie = fxnVar.fxn;
        this.dgx = fxnVar.ckl;
        this.tw = fxnVar.hie;
        this.jq = fxnVar.dgx;
        this.mvp = fxnVar.mvp;
        this.rlu = fxnVar.rlu;
        this.zu = fxnVar.zu;
        this.ckl = fxnVar.tw;
    }

    public static class fxn {
        private float bh;
        private boolean ckl;
        private JSONObject dgx;
        private long gff;
        private int hie;
        private float hm;
        private String jq;
        private long kg;
        private int mvp;
        private float rb;
        private JSONObject rlu;

        /* renamed from: sg, reason: collision with root package name */
        private float f9509sg;
        private int tw;
        private boolean zu = false;
        protected SparseArray<gff.fxn> fxn = new SparseArray<>();

        public fxn fxn(int i) {
            this.mvp = i;
            return this;
        }

        public fxn kg(int i) {
            this.hie = i;
            return this;
        }

        public fxn fxn(JSONObject jSONObject) {
            this.dgx = jSONObject;
            return this;
        }

        public fxn fxn(boolean z) {
            this.ckl = z;
            return this;
        }

        public fxn gff(int i) {
            this.tw = i;
            return this;
        }

        public fxn fxn(long j) {
            this.kg = j;
            return this;
        }

        public fxn kg(long j) {
            this.gff = j;
            return this;
        }

        public fxn fxn(float f) {
            this.hm = f;
            return this;
        }

        public fxn kg(float f) {
            this.rb = f;
            return this;
        }

        public fxn gff(float f) {
            this.bh = f;
            return this;
        }

        public fxn hm(float f) {
            this.f9509sg = f;
            return this;
        }

        public fxn fxn(String str) {
            this.jq = str;
            return this;
        }

        public fxn fxn(SparseArray<gff.fxn> sparseArray) {
            this.fxn = sparseArray;
            return this;
        }

        public fxn kg(JSONObject jSONObject) {
            this.rlu = jSONObject;
            return this;
        }

        public fxn kg(boolean z) {
            this.zu = z;
            return this;
        }

        public xdg fxn() {
            return new xdg(this);
        }
    }
}
