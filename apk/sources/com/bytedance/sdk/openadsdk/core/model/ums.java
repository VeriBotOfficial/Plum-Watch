package com.bytedance.sdk.openadsdk.core.model;

/* JADX INFO: loaded from: classes11.dex */
public class ums {
    private long fxn = 10000;
    private long kg = 10000;
    private long gff = 10;
    private long hm = 20;
    private String rb = "";

    public long fxn() {
        return this.fxn;
    }

    public void fxn(long j) {
        if (j <= 0) {
            this.fxn = 10L;
        } else {
            this.fxn = j;
        }
    }

    public long kg() {
        return this.kg;
    }

    public void kg(long j) {
        if (j < 0) {
            this.kg = 20L;
        } else {
            this.kg = j;
        }
    }

    public long gff() {
        return this.gff;
    }

    public void gff(long j) {
        if (j <= 0) {
            this.gff = 10L;
        } else {
            this.gff = j;
        }
    }

    public long hm() {
        return this.hm;
    }

    public void hm(long j) {
        if (j < 0) {
            this.hm = 20L;
        } else {
            this.hm = j;
        }
    }

    public String rb() {
        return this.rb;
    }

    public void fxn(String str) {
        this.rb = str;
    }
}
