package com.bytedance.sdk.openadsdk.core.model;

import com.bytedance.sdk.openadsdk.utils.swx;

/* loaded from: classes14.dex */
public class ci {
    private long bh;
    private int dgx;
    public boolean fxn;
    private long hie;
    private long jq;
    public long kg;
    private long rb;

    /* renamed from: sg, reason: collision with root package name */
    private long f9493sg;
    private long tw;
    private swx gff = swx.gff();
    private swx hm = swx.gff();

    public void fxn(swx swxVar, swx swxVar2, int i, swx swxVar3) {
        this.rb = swxVar.fxn(this.gff);
        this.bh = swxVar2.fxn(swxVar);
        this.f9493sg = i;
        this.tw = swxVar3.fxn(swxVar2);
    }

    public void fxn(swx swxVar) {
        this.gff = swxVar;
    }

    public void kg(swx swxVar) {
        this.hm = swxVar;
        this.jq = swxVar.fxn(this.gff);
    }

    public swx fxn() {
        return this.gff;
    }

    public long kg() {
        return this.rb;
    }

    public long gff() {
        return this.bh;
    }

    public long hm() {
        return this.f9493sg;
    }

    public long rb() {
        return this.tw;
    }

    public long bh() {
        return this.jq;
    }

    public long sg() {
        return this.hie;
    }

    public void fxn(long j) {
        this.hie = j;
    }

    public int tw() {
        return this.dgx;
    }

    public void fxn(int i) {
        this.dgx = i;
    }
}
