package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes11.dex */
public class je {
    private String bh;
    private String fxn;
    private int gff;
    private double hm;
    private int kg;
    private boolean rb;

    public String fxn() {
        return this.fxn;
    }

    public void fxn(String str) {
        this.fxn = str;
    }

    public int kg() {
        return this.kg;
    }

    public void fxn(int r1) {
        this.kg = r1;
    }

    public int gff() {
        return this.gff;
    }

    public void kg(int r1) {
        this.gff = r1;
    }

    public double hm() {
        return this.hm;
    }

    public boolean rb() {
        return !TextUtils.isEmpty(this.fxn) && this.kg > 0 && this.gff > 0;
    }

    public boolean bh() {
        return this.rb;
    }

    public void fxn(boolean z) {
        this.rb = z;
    }

    public String sg() {
        return this.bh;
    }

    public void kg(String str) {
        this.bh = str;
    }
}
