package com.bytedance.adsdk.kg.gff.fxn;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes13.dex */
public class gff extends zu<com.bytedance.adsdk.kg.gff.kg.hm, com.bytedance.adsdk.kg.gff.kg.hm> {
    @Override // com.bytedance.adsdk.kg.gff.fxn.zu, com.bytedance.adsdk.kg.gff.fxn.rlu
    public /* bridge */ /* synthetic */ List gff() {
        return super.gff();
    }

    @Override // com.bytedance.adsdk.kg.gff.fxn.zu, com.bytedance.adsdk.kg.gff.fxn.rlu
    public /* bridge */ /* synthetic */ boolean kg() {
        return super.kg();
    }

    @Override // com.bytedance.adsdk.kg.gff.fxn.zu
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public gff(List<com.bytedance.adsdk.kg.sg.fxn<com.bytedance.adsdk.kg.gff.kg.hm>> list) {
        super(fxn(list));
    }

    private static List<com.bytedance.adsdk.kg.sg.fxn<com.bytedance.adsdk.kg.gff.kg.hm>> fxn(List<com.bytedance.adsdk.kg.sg.fxn<com.bytedance.adsdk.kg.gff.kg.hm>> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, fxn(list.get(i)));
        }
        return list;
    }

    private static com.bytedance.adsdk.kg.sg.fxn<com.bytedance.adsdk.kg.gff.kg.hm> fxn(com.bytedance.adsdk.kg.sg.fxn<com.bytedance.adsdk.kg.gff.kg.hm> fxnVar) {
        com.bytedance.adsdk.kg.gff.kg.hm hmVar = fxnVar.fxn;
        com.bytedance.adsdk.kg.gff.kg.hm hmVar2 = fxnVar.kg;
        if (hmVar == null || hmVar2 == null || hmVar.fxn().length == hmVar2.fxn().length) {
            return fxnVar;
        }
        float[] fxn = fxn(hmVar.fxn(), hmVar2.fxn());
        return fxnVar.fxn(hmVar.fxn(fxn), hmVar2.fxn(fxn));
    }

    static float[] fxn(float[] fArr, float[] fArr2) {
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
        System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
        Arrays.sort(fArr3);
        float f = Float.NaN;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            float f2 = fArr3[i2];
            if (f2 != f) {
                fArr3[i] = f2;
                i++;
                f = fArr3[i2];
            }
        }
        return Arrays.copyOfRange(fArr3, 0, i);
    }

    @Override // com.bytedance.adsdk.kg.gff.fxn.rlu
    public com.bytedance.adsdk.kg.fxn.kg.fxn<com.bytedance.adsdk.kg.gff.kg.hm, com.bytedance.adsdk.kg.gff.kg.hm> fxn() {
        return new com.bytedance.adsdk.kg.fxn.kg.rb(this.fxn);
    }
}
