package com.bytedance.sdk.component.adexpress.dynamic.animation.fxn;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes13.dex */
public class tw extends hm {
    public tw(View view, com.bytedance.sdk.component.adexpress.dynamic.hm.fxn fxnVar) {
        super(view, fxnVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.fxn.hm
    List<ObjectAnimator> fxn() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.gff, "rippleValue", 0.0f, 1.0f).setDuration((int) (this.kg.hie() * 1000.0d));
        ((ViewGroup) this.gff.getParent()).setClipChildren(false);
        ((ViewGroup) this.gff.getParent().getParent()).setClipChildren(false);
        ((ViewGroup) this.gff.getParent().getParent().getParent()).setClipChildren(false);
        this.gff.setTag(2097610712, this.kg.tw());
        ArrayList arrayList = new ArrayList();
        arrayList.add(fxn(duration));
        return arrayList;
    }
}
