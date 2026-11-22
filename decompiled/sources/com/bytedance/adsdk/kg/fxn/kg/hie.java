package com.bytedance.adsdk.kg.fxn.kg;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* loaded from: classes13.dex */
public class hie extends sg<PointF> {
    private final PathMeasure bh;
    private final PointF hm;
    private final float[] rb;

    /* renamed from: sg, reason: collision with root package name */
    private jq f9244sg;

    public hie(List<? extends com.bytedance.adsdk.kg.sg.fxn<PointF>> list) {
        super(list);
        this.hm = new PointF();
        this.rb = new float[2];
        this.bh = new PathMeasure();
    }

    @Override // com.bytedance.adsdk.kg.fxn.kg.fxn
    /* renamed from: kg, reason: merged with bridge method [inline-methods] */
    public PointF fxn(com.bytedance.adsdk.kg.sg.fxn<PointF> fxnVar, float f) {
        jq jqVar = (jq) fxnVar;
        Path kg = jqVar.kg();
        if (kg == null) {
            return fxnVar.fxn;
        }
        if (this.gff != null) {
            jqVar.f9267sg.floatValue();
            hm();
            tw();
            throw null;
        }
        if (this.f9244sg != jqVar) {
            this.bh.setPath(kg, false);
            this.f9244sg = jqVar;
        }
        PathMeasure pathMeasure = this.bh;
        pathMeasure.getPosTan(f * pathMeasure.getLength(), this.rb, null);
        PointF pointF = this.hm;
        float[] fArr = this.rb;
        pointF.set(fArr[0], fArr[1]);
        return this.hm;
    }
}
