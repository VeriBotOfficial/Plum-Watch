package com.bytedance.sdk.component.adexpress.dynamic.animation.fxn;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes13.dex */
public class dgx extends hm {
    public dgx(View view, com.bytedance.sdk.component.adexpress.dynamic.hm.fxn fxnVar) {
        super(view, fxnVar);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
            if (viewGroup2 == null || !(viewGroup2 instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rb)) {
                return;
            }
            viewGroup2.setClipChildren(false);
            viewGroup2.setClipToPadding(false);
            ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getParent();
            if (viewGroup3 == null || !(viewGroup3 instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rb)) {
                return;
            }
            viewGroup3.setClipChildren(false);
            viewGroup3.setClipToPadding(false);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.fxn.hm
    List<ObjectAnimator> fxn() {
        float f;
        float dgx = (float) this.kg.dgx();
        float mvp = (float) this.kg.mvp();
        String xdg = this.kg.xdg();
        float f2 = 1.0f;
        if ("reverse".equals(xdg) || "alternate-reverse".equals(xdg)) {
            f = 1.0f;
        } else {
            f = mvp;
            mvp = 1.0f;
            f2 = dgx;
            dgx = 1.0f;
        }
        this.gff.setTag(2097610710, this.kg.kg());
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.gff, "scaleX", dgx, f2).setDuration((int) (this.kg.hie() * 1000.0d));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.gff, "scaleY", mvp, f).setDuration((int) (this.kg.hie() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(fxn(duration));
        arrayList.add(fxn(duration2));
        return arrayList;
    }
}
