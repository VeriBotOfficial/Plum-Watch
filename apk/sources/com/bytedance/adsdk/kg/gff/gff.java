package com.bytedance.adsdk.kg.gff;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes15.dex */
public class gff {
    private final String fxn;
    private final String gff;
    private final float hm;
    private final String kg;
    private Typeface rb;

    public gff(String str, String str2, String str3, float f) {
        this.fxn = str;
        this.kg = str2;
        this.gff = str3;
        this.hm = f;
    }

    public String fxn() {
        return this.fxn;
    }

    public String kg() {
        return this.kg;
    }

    public String gff() {
        return this.gff;
    }

    public Typeface hm() {
        return this.rb;
    }

    public void fxn(Typeface typeface) {
        this.rb = typeface;
    }
}
