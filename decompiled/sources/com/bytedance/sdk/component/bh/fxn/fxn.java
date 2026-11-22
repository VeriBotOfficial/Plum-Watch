package com.bytedance.sdk.component.bh.fxn;

/* loaded from: classes13.dex */
public class fxn {
    private com.bytedance.sdk.component.bh.fxn.hm.kg.fxn bh;
    private int dgx;
    private com.bytedance.sdk.component.bh.fxn.fxn.rb fxn;
    private com.bytedance.sdk.component.bh.fxn.hm.kg.fxn gff;
    private boolean hie;
    private com.bytedance.sdk.component.bh.fxn.hm.kg.fxn hm;
    private rb jq;
    private com.bytedance.sdk.component.bh.fxn.kg.gff kg;
    private int mvp;
    private com.bytedance.sdk.component.bh.fxn.hm.kg.fxn rb;
    private long rlu;

    /* renamed from: sg, reason: collision with root package name */
    private com.bytedance.sdk.component.bh.fxn.hm.kg.fxn f9349sg;
    private boolean tw;

    private fxn() {
        this.dgx = 200;
        this.mvp = 10;
    }

    public com.bytedance.sdk.component.bh.fxn.fxn.rb fxn() {
        return this.fxn;
    }

    public com.bytedance.sdk.component.bh.fxn.hm.kg.fxn kg() {
        return this.bh;
    }

    public boolean gff() {
        return this.hie;
    }

    public rb hm() {
        return this.jq;
    }

    public long rb() {
        return this.rlu;
    }

    public com.bytedance.sdk.component.bh.fxn.hm.kg.fxn bh() {
        return this.f9349sg;
    }

    public com.bytedance.sdk.component.bh.fxn.hm.kg.fxn sg() {
        return this.gff;
    }

    public com.bytedance.sdk.component.bh.fxn.hm.kg.fxn tw() {
        return this.hm;
    }

    public com.bytedance.sdk.component.bh.fxn.hm.kg.fxn jq() {
        return this.rb;
    }

    public com.bytedance.sdk.component.bh.fxn.kg.gff hie() {
        return this.kg;
    }

    public boolean dgx() {
        return this.tw;
    }

    public int mvp() {
        return this.dgx;
    }

    public int rlu() {
        return this.mvp;
    }

    /* renamed from: com.bytedance.sdk.component.bh.fxn.fxn$fxn, reason: collision with other inner class name */
    public static class C0476fxn {
        private boolean bh;
        private com.bytedance.sdk.component.bh.fxn.kg.gff fxn;
        private com.bytedance.sdk.component.bh.fxn.hm.kg.fxn gff;
        private com.bytedance.sdk.component.bh.fxn.hm.kg.fxn hm;
        private boolean jq;
        private com.bytedance.sdk.component.bh.fxn.hm.kg.fxn kg;
        private long mvp;
        private com.bytedance.sdk.component.bh.fxn.hm.kg.fxn rb;

        /* renamed from: sg, reason: collision with root package name */
        private rb f9351sg;
        private com.bytedance.sdk.component.bh.fxn.fxn.rb tw;
        private int hie = 5000;
        private int dgx = 10;

        public C0476fxn fxn(long j) {
            this.mvp = j;
            return this;
        }

        public C0476fxn fxn(com.bytedance.sdk.component.bh.fxn.fxn.rb rbVar) {
            this.tw = rbVar;
            return this;
        }

        public C0476fxn fxn(rb rbVar) {
            this.f9351sg = rbVar;
            return this;
        }

        public C0476fxn fxn(boolean z) {
            this.bh = z;
            return this;
        }

        public C0476fxn fxn(com.bytedance.sdk.component.bh.fxn.hm.kg.fxn fxnVar) {
            this.kg = fxnVar;
            return this;
        }

        public C0476fxn kg(com.bytedance.sdk.component.bh.fxn.hm.kg.fxn fxnVar) {
            this.gff = fxnVar;
            return this;
        }

        public C0476fxn gff(com.bytedance.sdk.component.bh.fxn.hm.kg.fxn fxnVar) {
            this.hm = fxnVar;
            return this;
        }

        public C0476fxn fxn(com.bytedance.sdk.component.bh.fxn.kg.gff gffVar) {
            this.fxn = gffVar;
            return this;
        }

        public C0476fxn fxn(int i) {
            this.hie = i;
            return this;
        }

        public C0476fxn kg(int i) {
            this.dgx = i;
            return this;
        }

        public fxn fxn() {
            fxn fxnVar = new fxn();
            fxnVar.kg = this.fxn;
            fxnVar.gff = this.kg;
            fxnVar.hm = this.gff;
            fxnVar.rb = this.hm;
            fxnVar.bh = this.rb;
            fxnVar.tw = this.bh;
            fxnVar.jq = this.f9351sg;
            fxnVar.fxn = this.tw;
            fxnVar.hie = this.jq;
            fxnVar.mvp = this.dgx;
            fxnVar.dgx = this.hie;
            fxnVar.rlu = this.mvp;
            return fxnVar;
        }
    }
}
