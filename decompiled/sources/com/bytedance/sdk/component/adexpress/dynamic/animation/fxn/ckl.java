package com.bytedance.sdk.component.adexpress.dynamic.animation.fxn;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes13.dex */
public class ckl extends hm {
    public ckl(View view, com.bytedance.sdk.component.adexpress.dynamic.hm.fxn fxnVar) {
        super(view, fxnVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.fxn.hm
    List<ObjectAnimator> fxn() {
        float f;
        float fxn = com.bytedance.sdk.component.adexpress.hm.sg.fxn(com.bytedance.sdk.component.adexpress.hm.fxn(), this.kg.bh());
        float fxn2 = com.bytedance.sdk.component.adexpress.hm.sg.fxn(com.bytedance.sdk.component.adexpress.hm.fxn(), this.kg.sg());
        float f2 = 0.0f;
        if ("reverse".equals(this.kg.xdg())) {
            f = fxn2;
            fxn2 = 0.0f;
            f2 = fxn;
            fxn = 0.0f;
        } else {
            f = 0.0f;
        }
        if (com.bytedance.sdk.component.adexpress.hm.kg.fxn(this.gff.getContext())) {
            fxn = -fxn;
            f2 = -f2;
        }
        this.gff.setTranslationX(fxn);
        this.gff.setTranslationY(fxn2);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.gff, "translationX", fxn, f2).setDuration((int) (this.kg.hie() * 1000.0d));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.gff, "translationY", fxn2, f).setDuration((int) (this.kg.hie() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(fxn(duration));
        arrayList.add(fxn(duration2));
        return arrayList;
    }
}
