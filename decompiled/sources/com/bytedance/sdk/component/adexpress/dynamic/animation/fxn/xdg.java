package com.bytedance.sdk.component.adexpress.dynamic.animation.fxn;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes13.dex */
public class xdg extends hm {
    public xdg(View view, com.bytedance.sdk.component.adexpress.dynamic.hm.fxn fxnVar) {
        super(view, fxnVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.fxn.hm
    List<ObjectAnimator> fxn() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.gff, "translationX", 0.0f, com.bytedance.sdk.component.adexpress.hm.sg.fxn(com.bytedance.sdk.component.adexpress.hm.fxn(), 20.0f), 0.0f, -com.bytedance.sdk.component.adexpress.hm.sg.fxn(com.bytedance.sdk.component.adexpress.hm.fxn(), 20.0f), 0.0f).setDuration((int) (this.kg.hie() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(fxn(duration));
        return arrayList;
    }
}
