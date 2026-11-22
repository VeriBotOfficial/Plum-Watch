package com.bytedance.sdk.component.bh.fxn.bh;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes13.dex */
public class hm {
    private final String bh;
    private boolean dgx;
    private final String fxn;
    private final boolean gff;
    private final String kg;
    private final int rb;

    /* renamed from: sg, reason: collision with root package name */
    private String f9348sg;
    private String tw;
    private int hm = -1;
    private int jq = 0;
    private String hie = null;

    hm(String str, String str2, boolean z, int i, String str3) {
        this.fxn = str;
        this.kg = str2;
        this.gff = z;
        this.rb = i;
        this.bh = str3;
    }

    public String fxn() {
        return this.fxn;
    }

    public String kg() {
        return this.kg;
    }

    public boolean gff() {
        return this.gff;
    }

    public int hm() {
        return this.hm;
    }

    public void fxn(int i) {
        this.hm = i;
    }

    public int rb() {
        return this.rb;
    }

    public String bh() {
        return this.bh;
    }

    public void fxn(String str) {
        this.f9348sg = str;
    }

    public String sg() {
        return this.f9348sg;
    }

    public void kg(int i) {
        this.jq = i;
        if (i == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f9348sg)) {
            this.f9348sg = String.valueOf(this.jq);
        } else {
            this.f9348sg += "," + this.jq;
        }
    }

    public int tw() {
        return this.jq;
    }

    public void kg(String str) {
        this.tw = str;
    }

    public String jq() {
        return this.tw;
    }

    public void gff(String str) {
        this.hie = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.isEmpty(this.tw)) {
            this.tw = String.valueOf(this.hie);
        } else {
            this.tw += "," + this.hie;
        }
    }

    public void fxn(boolean z) {
        this.dgx = z;
    }

    public boolean hie() {
        return this.dgx;
    }

    public Runnable fxn(String str, Map<String, String> map) {
        return fxn.fxn().fxn(this, str, map);
    }

    public boolean dgx() {
        return this.hm == -1;
    }
}
