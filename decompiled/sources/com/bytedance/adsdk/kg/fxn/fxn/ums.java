package com.bytedance.adsdk.kg.fxn.fxn;

import com.bytedance.adsdk.kg.fxn.kg.fxn;
import com.bytedance.adsdk.kg.gff.kg.ud;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes13.dex */
public class ums implements gff, fxn.InterfaceC0453fxn {
    private final com.bytedance.adsdk.kg.fxn.kg.fxn<?, Float> bh;
    private final String fxn;
    private final List<fxn.InterfaceC0453fxn> gff = new ArrayList();
    private final ud.fxn hm;
    private final boolean kg;
    private final com.bytedance.adsdk.kg.fxn.kg.fxn<?, Float> rb;

    /* renamed from: sg, reason: collision with root package name */
    private final com.bytedance.adsdk.kg.fxn.kg.fxn<?, Float> f9239sg;

    @Override // com.bytedance.adsdk.kg.fxn.fxn.gff
    public void fxn(List<gff> list, List<gff> list2) {
    }

    public ums(com.bytedance.adsdk.kg.gff.gff.fxn fxnVar, com.bytedance.adsdk.kg.gff.kg.ud udVar) {
        this.fxn = udVar.fxn();
        this.kg = udVar.bh();
        this.hm = udVar.kg();
        com.bytedance.adsdk.kg.fxn.kg.fxn<Float, Float> fxn = udVar.hm().fxn();
        this.rb = fxn;
        com.bytedance.adsdk.kg.fxn.kg.fxn<Float, Float> fxn2 = udVar.gff().fxn();
        this.bh = fxn2;
        com.bytedance.adsdk.kg.fxn.kg.fxn<Float, Float> fxn3 = udVar.rb().fxn();
        this.f9239sg = fxn3;
        fxnVar.fxn(fxn);
        fxnVar.fxn(fxn2);
        fxnVar.fxn(fxn3);
        fxn.fxn(this);
        fxn2.fxn(this);
        fxn3.fxn(this);
    }

    @Override // com.bytedance.adsdk.kg.fxn.kg.fxn.InterfaceC0453fxn
    public void fxn() {
        for (int i = 0; i < this.gff.size(); i++) {
            this.gff.get(i).fxn();
        }
    }

    void fxn(fxn.InterfaceC0453fxn interfaceC0453fxn) {
        this.gff.add(interfaceC0453fxn);
    }

    ud.fxn kg() {
        return this.hm;
    }

    public com.bytedance.adsdk.kg.fxn.kg.fxn<?, Float> gff() {
        return this.rb;
    }

    public com.bytedance.adsdk.kg.fxn.kg.fxn<?, Float> hm() {
        return this.bh;
    }

    public com.bytedance.adsdk.kg.fxn.kg.fxn<?, Float> rb() {
        return this.f9239sg;
    }

    public boolean bh() {
        return this.kg;
    }
}
