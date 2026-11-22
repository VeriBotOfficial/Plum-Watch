package com.bytedance.adsdk.kg.fxn.kg;

import android.graphics.PointF;
import java.util.Collections;

/* loaded from: classes13.dex */
public class zu extends fxn<PointF, PointF> {
    private final PointF bh;
    protected com.bytedance.adsdk.kg.sg.kg<Float> hm;
    private final fxn<Float, Float> jq;
    protected com.bytedance.adsdk.kg.sg.kg<Float> rb;

    /* renamed from: sg, reason: collision with root package name */
    private final PointF f9246sg;
    private final fxn<Float, Float> tw;

    public zu(fxn<Float, Float> fxnVar, fxn<Float, Float> fxnVar2) {
        super(Collections.emptyList());
        this.bh = new PointF();
        this.f9246sg = new PointF();
        this.tw = fxnVar;
        this.jq = fxnVar2;
        fxn(tw());
    }

    @Override // com.bytedance.adsdk.kg.fxn.kg.fxn
    public void fxn(float f) {
        this.tw.fxn(f);
        this.jq.fxn(f);
        this.bh.set(this.tw.sg().floatValue(), this.jq.sg().floatValue());
        for (int i = 0; i < this.fxn.size(); i++) {
            this.fxn.get(i).fxn();
        }
    }

    @Override // com.bytedance.adsdk.kg.fxn.kg.fxn
    /* renamed from: jq, reason: merged with bridge method [inline-methods] */
    public PointF sg() {
        return fxn(null, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.bytedance.adsdk.kg.fxn.kg.fxn
    /* renamed from: kg, reason: merged with bridge method [inline-methods] */
    public PointF fxn(com.bytedance.adsdk.kg.sg.fxn<PointF> fxnVar, float f) {
        com.bytedance.adsdk.kg.sg.fxn<Float> gff;
        com.bytedance.adsdk.kg.sg.fxn<Float> gff2;
        if (this.hm != null && (gff2 = this.tw.gff()) != null) {
            this.tw.rb();
            Float f2 = gff2.f9267sg;
            if (f2 == null) {
                throw null;
            }
            f2.floatValue();
            throw null;
        }
        if (this.rb != null && (gff = this.jq.gff()) != null) {
            this.jq.rb();
            Float f3 = gff.f9267sg;
            if (f3 == null) {
                throw null;
            }
            f3.floatValue();
            throw null;
        }
        this.f9246sg.set(this.bh.x, 0.0f);
        PointF pointF = this.f9246sg;
        pointF.set(pointF.x, this.bh.y);
        return this.f9246sg;
    }
}
