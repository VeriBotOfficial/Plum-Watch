package com.bytedance.adsdk.kg.bh;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes13.dex */
public abstract class fxn extends ValueAnimator {
    private final Set<ValueAnimator.AnimatorUpdateListener> fxn = new CopyOnWriteArraySet();
    private final Set<Animator.AnimatorListener> kg = new CopyOnWriteArraySet();
    private final Set<Animator.AnimatorPauseListener> gff = new CopyOnWriteArraySet();

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setStartDelay(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public ValueAnimator setDuration(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator
    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.fxn.add(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator
    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.fxn.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator
    public void removeAllUpdateListeners() {
        this.fxn.clear();
    }

    @Override // android.animation.Animator
    public void addListener(Animator.AnimatorListener animatorListener) {
        this.kg.add(animatorListener);
    }

    @Override // android.animation.Animator
    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.kg.remove(animatorListener);
    }

    @Override // android.animation.Animator
    public void removeAllListeners() {
        this.kg.clear();
    }

    void fxn(boolean z) {
        Iterator<Animator.AnimatorListener> it = this.kg.iterator();
        while (it.hasNext()) {
            it.next().onAnimationStart(this, z);
        }
    }

    @Override // android.animation.Animator
    public void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.gff.add(animatorPauseListener);
    }

    @Override // android.animation.Animator
    public void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.gff.remove(animatorPauseListener);
    }

    void fxn() {
        Iterator<Animator.AnimatorListener> it = this.kg.iterator();
        while (it.hasNext()) {
            it.next().onAnimationRepeat(this);
        }
    }

    void kg(boolean z) {
        Iterator<Animator.AnimatorListener> it = this.kg.iterator();
        while (it.hasNext()) {
            it.next().onAnimationEnd(this, z);
        }
    }

    void kg() {
        Iterator<Animator.AnimatorListener> it = this.kg.iterator();
        while (it.hasNext()) {
            it.next().onAnimationCancel(this);
        }
    }

    void gff() {
        Iterator<ValueAnimator.AnimatorUpdateListener> it = this.fxn.iterator();
        while (it.hasNext()) {
            it.next().onAnimationUpdate(this);
        }
    }

    void hm() {
        Iterator<Animator.AnimatorPauseListener> it = this.gff.iterator();
        while (it.hasNext()) {
            it.next().onAnimationPause(this);
        }
    }

    void rb() {
        Iterator<Animator.AnimatorPauseListener> it = this.gff.iterator();
        while (it.hasNext()) {
            it.next().onAnimationResume(this);
        }
    }
}
