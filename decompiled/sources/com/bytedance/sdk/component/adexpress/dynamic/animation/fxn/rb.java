package com.bytedance.sdk.component.adexpress.dynamic.animation.fxn;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.BounceInterpolator;
import android.view.animation.LinearInterpolator;
import com.anythink.expressad.foundation.g.a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes13.dex */
public class rb extends hm {
    public rb(View view, com.bytedance.sdk.component.adexpress.dynamic.hm.fxn fxnVar) {
        super(view, fxnVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.fxn.hm
    List<ObjectAnimator> fxn() {
        char c;
        ArrayList arrayList = new ArrayList();
        String ums = this.kg.ums();
        switch (ums.hashCode()) {
            case 3029889:
                if (ums.equals(a.u)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 3387192:
                if (ums.equals("none")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 483313230:
                if (ums.equals("forwards")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1356771568:
                if (ums.equals("backwards")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            fxn(arrayList);
            return arrayList;
        }
        if (c == 1) {
            hm(arrayList);
            return arrayList;
        }
        if (c == 2) {
            kg(arrayList);
            return arrayList;
        }
        gff(arrayList);
        return arrayList;
    }

    private void fxn(List<ObjectAnimator> list) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.gff, "translationY", 0.0f, -com.bytedance.sdk.component.adexpress.hm.sg.fxn(com.bytedance.sdk.component.adexpress.hm.fxn(), this.kg.dx())).setDuration(((int) (this.kg.hie() * 1000.0d)) / 2);
        duration.setInterpolator(new LinearInterpolator());
        duration.setRepeatMode(2);
        this.kg.bh(this.kg.ckl() * 2);
        list.add(fxn(duration));
    }

    private void kg(List<ObjectAnimator> list) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.gff, "translationY", 0.0f, -com.bytedance.sdk.component.adexpress.hm.sg.fxn(com.bytedance.sdk.component.adexpress.hm.fxn(), this.kg.dx())).setDuration((int) (this.kg.hie() * 1000.0d));
        duration.setInterpolator(new BounceInterpolator());
        duration.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.fxn.rb.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                rb.this.gff.setTranslationY(0.0f);
            }
        });
        list.add(fxn(duration));
    }

    private void gff(List<ObjectAnimator> list) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.gff, "translationY", 0.0f, -com.bytedance.sdk.component.adexpress.hm.sg.fxn(com.bytedance.sdk.component.adexpress.hm.fxn(), this.kg.dx())).setDuration((int) (this.kg.hie() * 1000.0d));
        duration.setInterpolator(new BounceInterpolator());
        duration.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.fxn.rb.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                rb.this.gff.setTranslationY(0.0f);
            }
        });
        list.add(fxn(duration));
    }

    private void hm(List<ObjectAnimator> list) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.gff, "translationY", 0.0f, -com.bytedance.sdk.component.adexpress.hm.sg.fxn(com.bytedance.sdk.component.adexpress.hm.fxn(), this.kg.dx())).setDuration((int) (this.kg.hie() * 1000.0d));
        duration.setInterpolator(new BounceInterpolator());
        list.add(fxn(duration));
    }
}
