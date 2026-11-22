package com.bytedance.sdk.component.bh.fxn;

import android.content.Context;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes13.dex */
public class tw {
    private static volatile com.bytedance.sdk.component.bh.fxn.rb.fxn hie;
    private static tw rlu;
    private volatile com.bytedance.sdk.component.bh.fxn.hm.kg.fxn bh;
    private long ckl;
    private volatile com.bytedance.sdk.component.bh.fxn.kg.gff dgx;
    private volatile Context fxn;
    private volatile com.bytedance.sdk.component.bh.fxn.hm.kg.fxn gff;
    private volatile com.bytedance.sdk.component.bh.fxn.hm.kg.fxn hm;
    private volatile rb jq;
    private volatile com.bytedance.sdk.component.bh.fxn.hm.kg.fxn kg;
    private volatile Map<Integer, com.bytedance.sdk.component.bh.fxn.kg.gff> mvp;
    private volatile com.bytedance.sdk.component.bh.fxn.hm.kg.fxn rb;

    /* renamed from: sg, reason: collision with root package name */
    private volatile com.bytedance.sdk.component.bh.fxn.fxn.rb f9360sg;
    private volatile boolean tw;
    private final AtomicBoolean zu = new AtomicBoolean(false);

    public boolean fxn() {
        return this.zu.get();
    }

    public void fxn(boolean z) {
        this.zu.set(z);
    }

    public boolean kg() {
        return this.tw;
    }

    public void kg(boolean z) {
        this.tw = z;
    }

    public Map<Integer, com.bytedance.sdk.component.bh.fxn.kg.gff> gff() {
        return this.mvp;
    }

    public com.bytedance.sdk.component.bh.fxn.fxn.rb hm() {
        return this.f9360sg;
    }

    public static com.bytedance.sdk.component.bh.fxn.rb.fxn rb() {
        if (hie == null) {
            synchronized (tw.class) {
                if (hie == null) {
                    hie = new com.bytedance.sdk.component.bh.fxn.rb.kg();
                }
            }
        }
        return hie;
    }

    public void fxn(com.bytedance.sdk.component.bh.fxn.fxn.rb rbVar) {
        this.f9360sg = rbVar;
    }

    public Context bh() {
        return this.fxn;
    }

    public void fxn(Context context) {
        this.fxn = context;
    }

    private tw() {
    }

    public static synchronized tw sg() {
        tw twVar;
        synchronized (tw.class) {
            if (rlu == null) {
                rlu = new tw();
            }
            twVar = rlu;
        }
        return twVar;
    }

    public void fxn(com.bytedance.sdk.component.bh.fxn.kg.gff gffVar) {
        this.dgx = gffVar;
    }

    public com.bytedance.sdk.component.bh.fxn.kg.gff tw() {
        return this.dgx;
    }

    public void jq() {
        com.bytedance.sdk.component.bh.fxn.kg.hm.fxn.kg();
    }

    public com.bytedance.sdk.component.bh.fxn.hm.kg.fxn hie() {
        return this.bh;
    }

    public void fxn(com.bytedance.sdk.component.bh.fxn.hm.kg.fxn fxnVar) {
        this.bh = fxnVar;
    }

    public void dgx() {
        com.bytedance.sdk.component.bh.fxn.kg.hm.fxn.gff();
    }

    public void fxn(com.bytedance.sdk.component.bh.fxn.hm.fxn fxnVar) {
        if (fxnVar == null) {
            return;
        }
        fxnVar.fxn(System.currentTimeMillis());
        com.bytedance.sdk.component.bh.fxn.kg.hm.fxn.fxn(fxnVar, fxnVar.hm());
    }

    public void fxn(String str, boolean z) {
        com.bytedance.sdk.component.bh.fxn.bh.fxn.fxn().fxn(str, z);
    }

    public void fxn(String str, List<String> list, boolean z, Map<String, String> map, int i, String str2) {
        com.bytedance.sdk.component.bh.fxn.bh.fxn.fxn().fxn(str, list, z, map, i, str2);
    }

    public void kg(com.bytedance.sdk.component.bh.fxn.hm.kg.fxn fxnVar) {
        this.kg = fxnVar;
    }

    public com.bytedance.sdk.component.bh.fxn.hm.kg.fxn mvp() {
        return this.kg;
    }

    public void gff(com.bytedance.sdk.component.bh.fxn.hm.kg.fxn fxnVar) {
        this.gff = fxnVar;
    }

    public com.bytedance.sdk.component.bh.fxn.hm.kg.fxn rlu() {
        return this.gff;
    }

    public void hm(com.bytedance.sdk.component.bh.fxn.hm.kg.fxn fxnVar) {
        this.hm = fxnVar;
    }

    public com.bytedance.sdk.component.bh.fxn.hm.kg.fxn zu() {
        return this.hm;
    }

    public com.bytedance.sdk.component.bh.fxn.hm.kg.fxn ckl() {
        return this.rb;
    }

    public void rb(com.bytedance.sdk.component.bh.fxn.hm.kg.fxn fxnVar) {
        this.rb = fxnVar;
    }

    public void fxn(rb rbVar) {
        this.jq = rbVar;
    }

    public rb xdg() {
        return this.jq;
    }

    public void fxn(long j) {
        this.ckl = j;
    }

    public long rmu() {
        return this.ckl * 86400000;
    }
}
