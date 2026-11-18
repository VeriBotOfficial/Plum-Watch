package com.bytedance.sdk.openadsdk.ckl.fxn;

import java.math.BigDecimal;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes11.dex */
public class fxn {
    int bh;
    String ckl;
    float dgx;
    String fxn;
    float gff;
    int hie;
    float hm;
    float jq;
    int kg;
    float mvp;
    float rb;
    float rlu;
    int rmu;

    /* JADX INFO: renamed from: sg, reason: collision with root package name */
    float f9426sg;
    float tw;
    float xdg;
    int zu;
    int je = -1;
    String ud = "";

    public int fxn() {
        return this.je;
    }

    public void fxn(int r1) {
        this.je = r1;
    }

    public String kg() {
        return this.ud;
    }

    public void fxn(String str) {
        this.ud = str;
    }

    public String gff() {
        return this.fxn;
    }

    public void kg(String str) {
        this.fxn = str;
    }

    public int hm() {
        return this.kg;
    }

    public void kg(int r1) {
        this.kg = r1;
    }

    public float rb() {
        return this.gff;
    }

    public void fxn(float f) {
        this.gff = f;
    }

    public float bh() {
        return this.hm;
    }

    public void kg(float f) {
        this.hm = f;
    }

    public float sg() {
        return this.rb;
    }

    public void gff(float f) {
        this.rb = f;
    }

    public int tw() {
        return this.bh;
    }

    public void gff(int r1) {
        this.bh = r1;
    }

    public float jq() {
        return this.f9426sg;
    }

    public void hm(float f) {
        this.f9426sg = f;
    }

    public float hie() {
        return this.tw;
    }

    public void rb(float f) {
        this.tw = f;
    }

    public float dgx() {
        return this.jq;
    }

    public void bh(float f) {
        this.jq = f;
    }

    public int mvp() {
        return this.hie;
    }

    public void hm(int r1) {
        this.hie = r1;
    }

    public float rlu() {
        return this.dgx;
    }

    public void sg(float f) {
        this.dgx = f;
    }

    public float zu() {
        return this.mvp;
    }

    public void tw(float f) {
        this.mvp = f;
    }

    public BigDecimal ckl() {
        return new BigDecimal(this.rlu).setScale(3, RoundingMode.HALF_UP);
    }

    public void jq(float f) {
        this.rlu = f;
    }

    public int xdg() {
        return this.zu;
    }

    public void rb(int r1) {
        this.zu = r1;
    }

    public String rmu() {
        return this.ckl;
    }

    public void gff(String str) {
        this.ckl = str;
    }

    public float je() {
        return this.xdg;
    }

    public void hie(float f) {
        this.xdg = f;
    }

    public int ud() {
        return this.rmu;
    }

    public void bh(int r1) {
        this.rmu = r1;
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ckl.fxn.fxn$fxn, reason: collision with other inner class name */
    public static class C0582fxn {
        fxn fxn = new fxn();

        public C0582fxn fxn(String str) {
            this.fxn.kg(str);
            return this;
        }

        public C0582fxn fxn(int r2) {
            this.fxn.kg(r2);
            return this;
        }

        public C0582fxn fxn(float f) {
            this.fxn.fxn(f);
            return this;
        }

        public C0582fxn kg(float f) {
            this.fxn.kg(f);
            return this;
        }

        public C0582fxn gff(float f) {
            this.fxn.gff(f);
            return this;
        }

        public C0582fxn hm(float f) {
            this.fxn.hm(f);
            return this;
        }

        public C0582fxn rb(float f) {
            this.fxn.rb(f);
            return this;
        }

        public C0582fxn bh(float f) {
            this.fxn.bh(f);
            return this;
        }

        public C0582fxn sg(float f) {
            this.fxn.sg(f);
            return this;
        }

        public C0582fxn tw(float f) {
            this.fxn.tw(f);
            return this;
        }

        public C0582fxn jq(float f) {
            this.fxn.jq(f);
            return this;
        }

        public C0582fxn kg(int r2) {
            this.fxn.rb(r2);
            return this;
        }

        public C0582fxn kg(String str) {
            this.fxn.gff(str);
            return this;
        }

        public C0582fxn hie(float f) {
            this.fxn.hie(f);
            return this;
        }

        public C0582fxn gff(int r2) {
            this.fxn.bh(r2);
            return this;
        }

        public fxn fxn() {
            return this.fxn;
        }
    }
}
