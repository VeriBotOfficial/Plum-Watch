package com.bytedance.sdk.component.adexpress.dynamic.animation.fxn;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes13.dex */
public class hie extends hm {
    private float bh;
    private fxn hm;
    private float rb;

    public hie(View view, com.bytedance.sdk.component.adexpress.dynamic.hm.fxn fxnVar) {
        super(view, fxnVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.fxn.hm
    List<ObjectAnimator> fxn() {
        int i;
        String str;
        if ((this.gff instanceof ImageView) && (this.gff.getParent() instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rb)) {
            this.gff = (View) this.gff.getParent();
        }
        this.gff.setAlpha(0.0f);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.gff, "alpha", 0.0f, 1.0f).setDuration((int) (this.kg.hie() * 1000.0d));
        this.hm = new fxn(this.gff);
        final int i2 = this.gff.getLayoutParams().height;
        this.rb = i2;
        this.bh = this.gff.getLayoutParams().width;
        if ("left".equals(this.kg.fxn()) || "right".equals(this.kg.fxn())) {
            i = (int) this.bh;
            str = "width";
        } else {
            str = "height";
            i = i2;
        }
        ObjectAnimator duration2 = ObjectAnimator.ofInt(this.hm, str, 0, i).setDuration((int) (this.kg.hie() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(fxn(duration));
        arrayList.add(fxn(duration2));
        ((ObjectAnimator) arrayList.get(0)).addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.fxn.hie.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator, boolean z) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator, boolean z) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                hie.this.hm.fxn(i2);
            }
        });
        return arrayList;
    }

    private class fxn {
        private View kg;

        public fxn(View view) {
            this.kg = view;
        }

        public void fxn(int i) {
            if ("top".equals(hie.this.kg.fxn())) {
                if (hie.this.gff instanceof ViewGroup) {
                    for (int i2 = 0; i2 < ((ViewGroup) hie.this.gff).getChildCount(); i2++) {
                        ((ViewGroup) hie.this.gff).getChildAt(i2).setTranslationY(i - hie.this.rb);
                    }
                }
                hie.this.gff.setTranslationY(hie.this.rb - i);
                return;
            }
            ViewGroup.LayoutParams layoutParams = this.kg.getLayoutParams();
            layoutParams.height = i;
            this.kg.setLayoutParams(layoutParams);
            this.kg.requestLayout();
        }
    }
}
