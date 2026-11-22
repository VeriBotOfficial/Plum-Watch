package com.bytedance.adsdk.ugeno.rb;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes13.dex */
public class gff {
    int bh;
    int ckl;
    float dgx;
    float hie;
    boolean je;
    int jq;
    int mvp;
    int rb;
    int rlu;
    boolean rmu;

    /* renamed from: sg, reason: collision with root package name */
    int f9298sg;
    int tw;
    int xdg;
    int fxn = Integer.MAX_VALUE;
    int kg = Integer.MAX_VALUE;
    int gff = Integer.MIN_VALUE;
    int hm = Integer.MIN_VALUE;
    List<Integer> zu = new ArrayList();

    gff() {
    }

    public int fxn() {
        return this.f9298sg;
    }

    public int kg() {
        return this.tw - this.jq;
    }

    void fxn(View view, int i, int i2, int i3, int i4) {
        kg kgVar = (kg) view.getLayoutParams();
        this.fxn = Math.min(this.fxn, (view.getLeft() - kgVar.rlu()) - i);
        this.kg = Math.min(this.kg, (view.getTop() - kgVar.zu()) - i2);
        this.gff = Math.max(this.gff, view.getRight() + kgVar.ckl() + i3);
        this.hm = Math.max(this.hm, view.getBottom() + kgVar.xdg() + i4);
    }
}
