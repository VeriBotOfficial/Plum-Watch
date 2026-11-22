package com.bytedance.adsdk.ugeno.yoga;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes13.dex */
public abstract class YogaNodeJNIBase extends hie implements Cloneable {
    private float[] arr;
    private Object bh;
    protected long fxn;
    private List<YogaNodeJNIBase> gff;
    private sg hm;
    private YogaNodeJNIBase kg;
    private int mLayoutDirection;
    private kg rb;

    /* renamed from: sg, reason: collision with root package name */
    private boolean f9303sg;

    private YogaNodeJNIBase(long j) {
        this.arr = null;
        this.mLayoutDirection = 0;
        this.f9303sg = true;
        if (j == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
        this.fxn = j;
    }

    YogaNodeJNIBase() {
        this(YogaNative.jni_YGNodeNewJNI());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.hie
    public int fxn() {
        List<YogaNodeJNIBase> list = this.gff;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.hie
    /* renamed from: gff, reason: merged with bridge method [inline-methods] */
    public YogaNodeJNIBase fxn(int i) {
        List<YogaNodeJNIBase> list = this.gff;
        if (list == null) {
            throw new IllegalStateException("YogaNode does not have children");
        }
        return list.get(i);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.hie
    public void fxn(hie hieVar, int i) {
        if (hieVar instanceof YogaNodeJNIBase) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) hieVar;
            if (yogaNodeJNIBase.kg != null) {
                throw new IllegalStateException("Child already has a parent, it must be removed first.");
            }
            if (this.gff == null) {
                this.gff = new ArrayList(4);
            }
            this.gff.add(i, yogaNodeJNIBase);
            yogaNodeJNIBase.kg = this;
            YogaNative.jni_YGNodeInsertChildJNI(this.fxn, yogaNodeJNIBase.fxn, i);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.hie
    /* renamed from: hm, reason: merged with bridge method [inline-methods] */
    public YogaNodeJNIBase kg(int i) {
        List<YogaNodeJNIBase> list = this.gff;
        if (list == null) {
            throw new IllegalStateException("Trying to remove a child of a YogaNode that does not have children");
        }
        YogaNodeJNIBase remove = list.remove(i);
        remove.kg = null;
        YogaNative.jni_YGNodeRemoveChildJNI(this.fxn, remove.fxn);
        return remove;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.hie
    /* renamed from: dgx, reason: merged with bridge method [inline-methods] */
    public YogaNodeJNIBase kg() {
        return this.kg;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.hie
    public int fxn(hie hieVar) {
        List<YogaNodeJNIBase> list = this.gff;
        if (list == null) {
            return -1;
        }
        return list.indexOf(hieVar);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.hie
    public void fxn(float f, float f2) {
        kg((hie) null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        for (int i = 0; i < arrayList.size(); i++) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) arrayList.get(i);
            List<YogaNodeJNIBase> list = yogaNodeJNIBase.gff;
            if (list != null) {
                for (YogaNodeJNIBase yogaNodeJNIBase2 : list) {
                    yogaNodeJNIBase2.kg(yogaNodeJNIBase);
                    arrayList.add(yogaNodeJNIBase2);
                }
            }
        }
        YogaNodeJNIBase[] yogaNodeJNIBaseArr = (YogaNodeJNIBase[]) arrayList.toArray(new YogaNodeJNIBase[arrayList.size()]);
        long[] jArr = new long[yogaNodeJNIBaseArr.length];
        for (int i2 = 0; i2 < yogaNodeJNIBaseArr.length; i2++) {
            jArr[i2] = yogaNodeJNIBaseArr[i2].fxn;
        }
        YogaNative.jni_YGNodeCalculateLayoutJNI(this.fxn, f, f2, jArr, yogaNodeJNIBaseArr);
    }

    private void kg(hie hieVar) {
        hie();
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.hie
    public void fxn(gff gffVar) {
        YogaNative.jni_YGNodeStyleSetDirectionJNI(this.fxn, gffVar.fxn());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.hie
    public void fxn(rb rbVar) {
        YogaNative.jni_YGNodeStyleSetFlexDirectionJNI(this.fxn, rbVar.fxn());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.hie
    public void fxn(bh bhVar) {
        YogaNative.jni_YGNodeStyleSetJustifyContentJNI(this.fxn, bhVar.fxn());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.hie
    public void fxn(fxn fxnVar) {
        YogaNative.jni_YGNodeStyleSetAlignItemsJNI(this.fxn, fxnVar.fxn());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.hie
    public void kg(fxn fxnVar) {
        YogaNative.jni_YGNodeStyleSetAlignSelfJNI(this.fxn, fxnVar.fxn());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.hie
    public void gff(fxn fxnVar) {
        YogaNative.jni_YGNodeStyleSetAlignContentJNI(this.fxn, fxnVar.fxn());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.hie
    public void fxn(rlu rluVar) {
        YogaNative.jni_YGNodeStyleSetPositionTypeJNI(this.fxn, rluVar.fxn());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.hie
    public void fxn(zu zuVar) {
        YogaNative.jni_YGNodeStyleSetFlexWrapJNI(this.fxn, zuVar.fxn());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.hie
    public void fxn(float f) {
        YogaNative.jni_YGNodeStyleSetFlexGrowJNI(this.fxn, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.hie
    public void kg(float f) {
        YogaNative.jni_YGNodeStyleSetFlexShrinkJNI(this.fxn, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.hie
    public void gff(float f) {
        YogaNative.jni_YGNodeStyleSetFlexBasisJNI(this.fxn, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.hie
    public void gff() {
        YogaNative.jni_YGNodeStyleSetFlexBasisAutoJNI(this.fxn);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.hie
    public void fxn(hm hmVar, float f) {
        YogaNative.jni_YGNodeStyleSetMarginJNI(this.fxn, hmVar.fxn(), f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.hie
    public void kg(hm hmVar, float f) {
        YogaNative.jni_YGNodeStyleSetPaddingJNI(this.fxn, hmVar.fxn(), f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.hie
    public void gff(hm hmVar, float f) {
        YogaNative.jni_YGNodeStyleSetPositionJNI(this.fxn, hmVar.fxn(), f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.hie
    public void hm(float f) {
        YogaNative.jni_YGNodeStyleSetWidthJNI(this.fxn, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.hie
    public void rb(float f) {
        YogaNative.jni_YGNodeStyleSetWidthPercentJNI(this.fxn, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.hie
    public void hm() {
        YogaNative.jni_YGNodeStyleSetWidthAutoJNI(this.fxn);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.hie
    public void bh(float f) {
        YogaNative.jni_YGNodeStyleSetHeightJNI(this.fxn, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.hie
    public void sg(float f) {
        YogaNative.jni_YGNodeStyleSetHeightPercentJNI(this.fxn, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.hie
    public void rb() {
        YogaNative.jni_YGNodeStyleSetHeightAutoJNI(this.fxn);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.hie
    public void tw(float f) {
        YogaNative.jni_YGNodeStyleSetMinWidthJNI(this.fxn, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.hie
    public void jq(float f) {
        YogaNative.jni_YGNodeStyleSetMinHeightJNI(this.fxn, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.hie
    public void hie(float f) {
        YogaNative.jni_YGNodeStyleSetMaxWidthJNI(this.fxn, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.hie
    public void dgx(float f) {
        YogaNative.jni_YGNodeStyleSetMaxHeightJNI(this.fxn, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.hie
    public void mvp(float f) {
        YogaNative.jni_YGNodeStyleSetAspectRatioJNI(this.fxn, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.hie
    public void fxn(sg sgVar) {
        this.hm = sgVar;
        YogaNative.jni_YGNodeSetHasMeasureFuncJNI(this.fxn, sgVar != null);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.hie
    public void fxn(boolean z) {
        YogaNative.jni_YGNodeSetAlwaysFormsContainingBlockJNI(this.fxn, z);
    }

    public final long measure(float f, int i, float f2, int i2) {
        if (!mvp()) {
            throw new RuntimeException("Measure function isn't defined!");
        }
        return this.hm.fxn(this, f, tw.fxn(i), f2, tw.fxn(i2));
    }

    public final float baseline(float f, float f2) {
        return this.rb.fxn(this, f, f2);
    }

    public boolean mvp() {
        return this.hm != null;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.hie
    public void fxn(Object obj) {
        this.bh = obj;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.hie
    public Object hie() {
        return this.bh;
    }

    private final long replaceChild(YogaNodeJNIBase yogaNodeJNIBase, int i) {
        List<YogaNodeJNIBase> list = this.gff;
        if (list == null) {
            throw new IllegalStateException("Cannot replace child. YogaNode does not have children");
        }
        list.remove(i);
        this.gff.add(i, yogaNodeJNIBase);
        yogaNodeJNIBase.kg = this;
        return yogaNodeJNIBase.fxn;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.hie
    public float bh() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[3];
        }
        return 0.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.hie
    public float sg() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[4];
        }
        return 0.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.hie
    public float tw() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[1];
        }
        return 0.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.hie
    public float jq() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[2];
        }
        return 0.0f;
    }
}
