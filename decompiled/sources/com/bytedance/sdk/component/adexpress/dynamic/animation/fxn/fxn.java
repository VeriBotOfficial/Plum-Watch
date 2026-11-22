package com.bytedance.sdk.component.adexpress.dynamic.animation.fxn;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes13.dex */
public class fxn extends hm {
    public fxn(View view, com.bytedance.sdk.component.adexpress.dynamic.hm.fxn fxnVar) {
        super(view, fxnVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.fxn.hm
    List<ObjectAnimator> fxn() {
        float je = this.kg.je() / 100.0f;
        float ud = this.kg.ud() / 100.0f;
        if ("reverse".equals(this.kg.xdg()) && this.kg.zu() <= 0.0d) {
            ud = je;
            je = ud;
        }
        this.gff.setAlpha(je);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.gff, "alpha", je, ud).setDuration((int) (this.kg.hie() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(fxn(duration));
        return arrayList;
    }
}
