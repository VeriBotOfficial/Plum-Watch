package com.github.aakira.expandablelayout;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* loaded from: classes14.dex */
public class ExpandableWeightLayout extends RelativeLayout implements ExpandableLayout {
    private boolean defaultExpanded;
    private int duration;
    private TimeInterpolator interpolator;
    private boolean isAnimating;
    private boolean isArranged;
    private boolean isCalculatedSize;
    private boolean isExpanded;
    private float layoutWeight;
    private ExpandableLayoutListener listener;
    private ViewTreeObserver.OnGlobalLayoutListener mGlobalLayoutListener;
    private ExpandableSavedState savedState;

    public ExpandableWeightLayout(Context context) {
        this(context, null);
    }

    public ExpandableWeightLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ExpandableWeightLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.interpolator = new LinearInterpolator();
        this.layoutWeight = 0.0f;
        this.isArranged = false;
        this.isCalculatedSize = false;
        this.isAnimating = false;
        init(context, attributeSet, i);
    }

    public ExpandableWeightLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.interpolator = new LinearInterpolator();
        this.layoutWeight = 0.0f;
        this.isArranged = false;
        this.isCalculatedSize = false;
        this.isAnimating = false;
        init(context, attributeSet, i);
    }

    private void init(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.expandableLayout, i, 0);
        this.duration = obtainStyledAttributes.getInteger(R.styleable.expandableLayout_ael_duration, 300);
        this.defaultExpanded = obtainStyledAttributes.getBoolean(R.styleable.expandableLayout_ael_expanded, false);
        int integer = obtainStyledAttributes.getInteger(R.styleable.expandableLayout_ael_interpolator, 8);
        obtainStyledAttributes.recycle();
        this.interpolator = Utils.createInterpolator(integer);
        this.isExpanded = this.defaultExpanded;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!(getLayoutParams() instanceof LinearLayout.LayoutParams)) {
            throw new AssertionError("You must arrange in LinearLayout.");
        }
        if (0.0f >= getCurrentWeight()) {
            throw new AssertionError("You must set a weight than 0.");
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.isCalculatedSize) {
            this.layoutWeight = getCurrentWeight();
            this.isCalculatedSize = true;
        }
        if (this.isArranged) {
            return;
        }
        setWeight(this.defaultExpanded ? this.layoutWeight : 0.0f);
        this.isArranged = true;
        ExpandableSavedState expandableSavedState = this.savedState;
        if (expandableSavedState == null) {
            return;
        }
        setWeight(expandableSavedState.getWeight());
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        ExpandableSavedState expandableSavedState = new ExpandableSavedState(super.onSaveInstanceState());
        expandableSavedState.setWeight(getCurrentWeight());
        return expandableSavedState;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExpandableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExpandableSavedState expandableSavedState = (ExpandableSavedState) parcelable;
        super.onRestoreInstanceState(expandableSavedState.getSuperState());
        this.savedState = expandableSavedState;
    }

    @Override // com.github.aakira.expandablelayout.ExpandableLayout
    public void setListener(ExpandableLayoutListener expandableLayoutListener) {
        this.listener = expandableLayoutListener;
    }

    @Override // com.github.aakira.expandablelayout.ExpandableLayout
    public void toggle() {
        toggle(this.duration, this.interpolator);
    }

    @Override // com.github.aakira.expandablelayout.ExpandableLayout
    public void toggle(long j, TimeInterpolator timeInterpolator) {
        if (0.0f < getCurrentWeight()) {
            collapse(j, timeInterpolator);
        } else {
            expand(j, timeInterpolator);
        }
    }

    @Override // com.github.aakira.expandablelayout.ExpandableLayout
    public void expand() {
        if (this.isAnimating) {
            return;
        }
        createExpandAnimator(0.0f, this.layoutWeight, this.duration, this.interpolator).start();
    }

    @Override // com.github.aakira.expandablelayout.ExpandableLayout
    public void expand(long j, TimeInterpolator timeInterpolator) {
        if (this.isAnimating) {
            return;
        }
        if (j <= 0) {
            this.isExpanded = true;
            setWeight(this.layoutWeight);
            requestLayout();
            notifyListeners();
            return;
        }
        createExpandAnimator(getCurrentWeight(), this.layoutWeight, j, timeInterpolator).start();
    }

    @Override // com.github.aakira.expandablelayout.ExpandableLayout
    public void collapse() {
        if (this.isAnimating) {
            return;
        }
        createExpandAnimator(getCurrentWeight(), 0.0f, this.duration, this.interpolator).start();
    }

    @Override // com.github.aakira.expandablelayout.ExpandableLayout
    public void collapse(long j, TimeInterpolator timeInterpolator) {
        if (this.isAnimating) {
            return;
        }
        if (j <= 0) {
            this.isExpanded = false;
            setWeight(0.0f);
            requestLayout();
            notifyListeners();
            return;
        }
        createExpandAnimator(getCurrentWeight(), 0.0f, j, timeInterpolator).start();
    }

    @Override // com.github.aakira.expandablelayout.ExpandableLayout
    public void setDuration(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Animators cannot have negative duration: " + i);
        }
        this.duration = i;
    }

    @Override // com.github.aakira.expandablelayout.ExpandableLayout
    public void setExpanded(boolean z) {
        float currentWeight = getCurrentWeight();
        if (z && currentWeight == this.layoutWeight) {
            return;
        }
        if (z || currentWeight != 0.0f) {
            this.isExpanded = z;
            setWeight(z ? this.layoutWeight : 0.0f);
            requestLayout();
        }
    }

    @Override // com.github.aakira.expandablelayout.ExpandableLayout
    public boolean isExpanded() {
        return this.isExpanded;
    }

    @Override // com.github.aakira.expandablelayout.ExpandableLayout
    public void setInterpolator(TimeInterpolator timeInterpolator) {
        this.interpolator = timeInterpolator;
    }

    public void setExpandWeight(float f) {
        this.layoutWeight = f;
    }

    public float getCurrentWeight() {
        return ((LinearLayout.LayoutParams) getLayoutParams()).weight;
    }

    public void move(float f) {
        move(f, this.duration, this.interpolator);
    }

    public void move(float f, long j, TimeInterpolator timeInterpolator) {
        if (this.isAnimating) {
            return;
        }
        if (j <= 0) {
            this.isExpanded = f > 0.0f;
            setWeight(f);
            requestLayout();
            notifyListeners();
            return;
        }
        createExpandAnimator(getCurrentWeight(), f, j, timeInterpolator).start();
    }

    private ValueAnimator createExpandAnimator(float f, final float f2, long j, TimeInterpolator timeInterpolator) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        ofFloat.setDuration(j);
        if (timeInterpolator == null) {
            timeInterpolator = this.interpolator;
        }
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.github.aakira.expandablelayout.ExpandableWeightLayout.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                ExpandableWeightLayout.this.setWeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ExpandableWeightLayout.this.requestLayout();
            }
        });
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.github.aakira.expandablelayout.ExpandableWeightLayout.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ExpandableWeightLayout.this.isAnimating = true;
                if (ExpandableWeightLayout.this.listener == null) {
                    return;
                }
                ExpandableWeightLayout.this.listener.onAnimationStart();
                float f3 = ExpandableWeightLayout.this.layoutWeight;
                float f4 = f2;
                if (f3 == f4) {
                    ExpandableWeightLayout.this.listener.onPreOpen();
                } else if (0.0f == f4) {
                    ExpandableWeightLayout.this.listener.onPreClose();
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ExpandableWeightLayout.this.isAnimating = false;
                ExpandableWeightLayout.this.isExpanded = f2 > 0.0f;
                if (ExpandableWeightLayout.this.listener == null) {
                    return;
                }
                ExpandableWeightLayout.this.listener.onAnimationEnd();
                if (f2 == ExpandableWeightLayout.this.layoutWeight) {
                    ExpandableWeightLayout.this.listener.onOpened();
                } else if (f2 == 0.0f) {
                    ExpandableWeightLayout.this.listener.onClosed();
                }
            }
        });
        return ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWeight(float f) {
        ((LinearLayout.LayoutParams) getLayoutParams()).weight = f;
    }

    private void notifyListeners() {
        ExpandableLayoutListener expandableLayoutListener = this.listener;
        if (expandableLayoutListener == null) {
            return;
        }
        expandableLayoutListener.onAnimationStart();
        if (this.isExpanded) {
            this.listener.onPreOpen();
        } else {
            this.listener.onPreClose();
        }
        this.mGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.github.aakira.expandablelayout.ExpandableWeightLayout.3
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                ExpandableWeightLayout.this.getViewTreeObserver().removeOnGlobalLayoutListener(ExpandableWeightLayout.this.mGlobalLayoutListener);
                ExpandableWeightLayout.this.listener.onAnimationEnd();
                if (ExpandableWeightLayout.this.isExpanded) {
                    ExpandableWeightLayout.this.listener.onOpened();
                } else {
                    ExpandableWeightLayout.this.listener.onClosed();
                }
            }
        };
        getViewTreeObserver().addOnGlobalLayoutListener(this.mGlobalLayoutListener);
    }
}
