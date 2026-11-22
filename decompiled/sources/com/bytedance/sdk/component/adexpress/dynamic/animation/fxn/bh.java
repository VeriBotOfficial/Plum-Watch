package com.bytedance.sdk.component.adexpress.dynamic.animation.fxn;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes13.dex */
public class bh extends hm {
    public bh(View view, com.bytedance.sdk.component.adexpress.dynamic.hm.fxn fxnVar) {
        super(view, fxnVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.fxn.hm
    List<ObjectAnimator> fxn() {
        float f = this.gff.getLayoutParams().width;
        this.gff.setTranslationX(f);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.gff, "translationX", f, 0.0f).setDuration((int) (this.kg.hie() * 1000.0d));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.gff, "alpha", 0.0f, 1.0f).setDuration((int) (this.kg.hie() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(fxn(duration));
        arrayList.add(fxn(duration2));
        return arrayList;
    }
}
