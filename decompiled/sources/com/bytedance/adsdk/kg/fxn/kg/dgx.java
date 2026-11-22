package com.bytedance.adsdk.kg.fxn.kg;

import android.graphics.PointF;
import java.util.List;

/* loaded from: classes13.dex */
public class dgx extends sg<PointF> {
    private final PointF hm;

    public dgx(List<com.bytedance.adsdk.kg.sg.fxn<PointF>> list) {
        super(list);
        this.hm = new PointF();
    }

    @Override // com.bytedance.adsdk.kg.fxn.kg.fxn
    /* renamed from: kg, reason: merged with bridge method [inline-methods] */
    public PointF fxn(com.bytedance.adsdk.kg.sg.fxn<PointF> fxnVar, float f) {
        return fxn(fxnVar, f, f, f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.adsdk.kg.fxn.kg.fxn
    /* renamed from: kg, reason: merged with bridge method [inline-methods] */
    public PointF fxn(com.bytedance.adsdk.kg.sg.fxn<PointF> fxnVar, float f, float f2, float f3) {
        if (fxnVar.fxn == null || fxnVar.kg == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF = fxnVar.fxn;
        PointF pointF2 = fxnVar.kg;
        if (this.gff != null) {
            fxnVar.f9267sg.floatValue();
            hm();
            tw();
            throw null;
        }
        this.hm.set(pointF.x + (f2 * (pointF2.x - pointF.x)), pointF.y + (f3 * (pointF2.y - pointF.y)));
        return this.hm;
    }
}
