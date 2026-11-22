package com.bytedance.sdk.component.adexpress.dynamic.animation.fxn;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ij;
import com.caverock.androidsvg.SVGParser;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes13.dex */
public abstract class hm implements ij {
    public View gff;
    com.bytedance.sdk.component.adexpress.dynamic.hm.fxn kg;
    private Set<ScheduledFuture<?>> hm = new HashSet();
    public List<ObjectAnimator> fxn = fxn();

    abstract List<ObjectAnimator> fxn();

    public hm(View view, com.bytedance.sdk.component.adexpress.dynamic.hm.fxn fxnVar) {
        this.gff = view;
        this.kg = fxnVar;
    }

    public void gff() {
        List<ObjectAnimator> list = this.fxn;
        if (list == null) {
            return;
        }
        for (final ObjectAnimator objectAnimator : list) {
            objectAnimator.start();
            if (this.kg.rmu() > 0.0d) {
                objectAnimator.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.fxn.hm.1
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                        objectAnimator.pause();
                        fxn fxnVar = hm.this.new fxn(objectAnimator);
                        ScheduledFuture<?> fxn2 = com.bytedance.sdk.component.adexpress.hm.hm.fxn(fxnVar, (long) (hm.this.kg.rmu() * 1000.0d), TimeUnit.MILLISECONDS);
                        fxnVar.fxn(fxn2);
                        hm.this.hm.add(fxn2);
                    }
                });
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ij
    public void kg() {
        List<ObjectAnimator> list = this.fxn;
        if (list == null) {
            return;
        }
        for (ObjectAnimator objectAnimator : list) {
            objectAnimator.cancel();
            objectAnimator.removeAllUpdateListeners();
        }
        Iterator<ScheduledFuture<?>> it = this.hm.iterator();
        while (it.hasNext()) {
            it.next().cancel(true);
        }
    }

    ObjectAnimator fxn(final ObjectAnimator objectAnimator) {
        objectAnimator.setStartDelay((long) (this.kg.zu() * 1000.0d));
        if (this.kg.ckl() > 0) {
            objectAnimator.setRepeatCount(this.kg.ckl() - 1);
        } else {
            objectAnimator.setRepeatCount(-1);
        }
        if (!"normal".equals(this.kg.xdg())) {
            if (SVGParser.XML_STYLESHEET_ATTR_ALTERNATE.equals(this.kg.xdg()) || "alternate-reverse".equals(this.kg.xdg())) {
                objectAnimator.setRepeatMode(2);
            } else {
                objectAnimator.setRepeatMode(1);
            }
        }
        if ("ease-in-out".equals(this.kg.rlu())) {
            objectAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        } else if ("ease-in".equals(this.kg.xdg())) {
            objectAnimator.setInterpolator(new AccelerateInterpolator());
        } else if ("ease-out".equals(this.kg.xdg())) {
            objectAnimator.setInterpolator(new DecelerateInterpolator());
        } else {
            objectAnimator.setInterpolator(new LinearInterpolator());
        }
        objectAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.fxn.hm.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (valueAnimator.getCurrentPlayTime() > 0) {
                    hm.this.gff.setVisibility(0);
                    if (hm.this.gff.getParent() instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bh) {
                        ((View) hm.this.gff.getParent()).setVisibility(0);
                    }
                    objectAnimator.removeAllUpdateListeners();
                }
            }
        });
        return objectAnimator;
    }

    public class fxn implements Runnable {
        ObjectAnimator fxn;
        ScheduledFuture<?> kg;

        fxn(ObjectAnimator objectAnimator) {
            this.fxn = objectAnimator;
        }

        public void fxn(ScheduledFuture<?> scheduledFuture) {
            this.kg = scheduledFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.bytedance.sdk.component.adexpress.fxn.fxn.fxn.fxn().gff() != null) {
                com.bytedance.sdk.component.adexpress.fxn.fxn.fxn.fxn().gff().gff().post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.fxn.hm.fxn.1
                    @Override // java.lang.Runnable
                    public void run() {
                        fxn.this.fxn.resume();
                    }
                });
                if (this.kg != null) {
                    hm.this.hm.remove(this.kg);
                }
            }
        }
    }
}
