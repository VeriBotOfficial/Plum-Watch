package com.bytedance.sdk.component.adexpress.dynamic.animation.fxn;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes13.dex */
public class zu extends hm {
    public zu(View view, com.bytedance.sdk.component.adexpress.dynamic.hm.fxn fxnVar) {
        super(view, fxnVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.fxn.hm
    List<ObjectAnimator> fxn() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.gff, "rotation", 0.0f, this.kg.rb(), 0.0f, this.kg.rb(), 0.0f).setDuration((int) (this.kg.hie() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(fxn(duration));
        return arrayList;
    }
}
