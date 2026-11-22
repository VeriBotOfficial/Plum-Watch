package com.bytedance.sdk.component.adexpress.dynamic.animation.fxn;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes13.dex */
public class sg extends hm {
    public sg(View view, com.bytedance.sdk.component.adexpress.dynamic.hm.fxn fxnVar) {
        super(view, fxnVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.fxn.hm
    List<ObjectAnimator> fxn() {
        this.gff.setTag(2097610709, Integer.valueOf(this.kg.gff()));
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.gff, "marqueeValue", 0.0f, 1.0f).setDuration((int) (this.kg.hie() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(fxn(duration));
        return arrayList;
    }
}
