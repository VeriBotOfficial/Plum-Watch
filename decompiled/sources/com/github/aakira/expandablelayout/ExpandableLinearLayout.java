package com.github.aakira.expandablelayout;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes14.dex */
public class ExpandableLinearLayout extends LinearLayout implements ExpandableLayout {
    private List<Integer> childSizeList;
    private int closePosition;
    private int defaultChildIndex;
    private boolean defaultExpanded;
    private int defaultPosition;
    private int duration;
    private boolean inRecyclerView;
    private TimeInterpolator interpolator;
    private boolean isAnimating;
    private boolean isArranged;
    private boolean isCalculatedSize;
    private boolean isExpanded;
    private int layoutSize;
    private ExpandableLayoutListener listener;
    private ViewTreeObserver.OnGlobalLayoutListener mGlobalLayoutListener;
    private boolean recyclerExpanded;
    private ExpandableSavedState savedState;

    public ExpandableLinearLayout(Context context) {
        this(context, null);
    }

    public ExpandableLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ExpandableLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.interpolator = new LinearInterpolator();
        this.closePosition = 0;
        this.layoutSize = 0;
        this.inRecyclerView = false;
        this.isArranged = false;
        this.isCalculatedSize = false;
        this.isAnimating = false;
        this.recyclerExpanded = false;
        this.childSizeList = new ArrayList();
        init(context, attributeSet, i);
    }

    public ExpandableLinearLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.interpolator = new LinearInterpolator();
        this.closePosition = 0;
        this.layoutSize = 0;
        this.inRecyclerView = false;
        this.isArranged = false;
        this.isCalculatedSize = false;
        this.isAnimating = false;
        this.recyclerExpanded = false;
        this.childSizeList = new ArrayList();
        init(context, attributeSet, i);
    }

    private void init(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.expandableLayout, i, 0);
        this.duration = obtainStyledAttributes.getInteger(R.styleable.expandableLayout_ael_duration, 300);
        this.defaultExpanded = obtainStyledAttributes.getBoolean(R.styleable.expandableLayout_ael_expanded, false);
        this.defaultChildIndex = obtainStyledAttributes.getInteger(R.styleable.expandableLayout_ael_defaultChildIndex, Integer.MAX_VALUE);
        this.defaultPosition = obtainStyledAttributes.getDimensionPixelSize(R.styleable.expandableLayout_ael_defaultPosition, Integer.MIN_VALUE);
        int integer = obtainStyledAttributes.getInteger(R.styleable.expandableLayout_ael_interpolator, 8);
        obtainStyledAttributes.recycle();
        this.interpolator = Utils.createInterpolator(integer);
        this.isExpanded = this.defaultExpanded;
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int paddingLeft;
        int paddingRight;
        int measuredWidth;
        int i4;
        super.onMeasure(i, i2);
        if (!this.isCalculatedSize) {
            this.childSizeList.clear();
            int childCount = getChildCount();
            if (childCount > 0) {
                int i5 = 0;
                for (int i6 = 0; i6 < childCount; i6++) {
                    View childAt = getChildAt(i6);
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                    if (i6 > 0) {
                        i5 = this.childSizeList.get(i6 - 1).intValue();
                    }
                    List<Integer> list = this.childSizeList;
                    if (isVertical()) {
                        measuredWidth = childAt.getMeasuredHeight() + layoutParams.topMargin;
                        i4 = layoutParams.bottomMargin;
                    } else {
                        measuredWidth = childAt.getMeasuredWidth() + layoutParams.leftMargin;
                        i4 = layoutParams.rightMargin;
                    }
                    list.add(Integer.valueOf(measuredWidth + i4 + i5));
                }
                int intValue = this.childSizeList.get(childCount - 1).intValue();
                if (isVertical()) {
                    paddingLeft = getPaddingTop();
                    paddingRight = getPaddingBottom();
                } else {
                    paddingLeft = getPaddingLeft();
                    paddingRight = getPaddingRight();
                }
                this.layoutSize = intValue + paddingLeft + paddingRight;
                this.isCalculatedSize = true;
            } else {
                throw new IllegalStateException("The expandableLinearLayout must have at least one child");
            }
        }
        if (this.isArranged) {
            return;
        }
        if (!this.defaultExpanded) {
            setLayoutSize(this.closePosition);
        }
        if (this.inRecyclerView) {
            setLayoutSize(this.recyclerExpanded ? this.layoutSize : this.closePosition);
        }
        int size = this.childSizeList.size();
        int i7 = this.defaultChildIndex;
        if (size > i7 && size > 0) {
            moveChild(i7, 0L, null);
        }
        int i8 = this.defaultPosition;
        if (i8 > 0 && (i3 = this.layoutSize) >= i8 && i3 > 0) {
            move(i8, 0L, null);
        }
        this.isArranged = true;
        ExpandableSavedState expandableSavedState = this.savedState;
        if (expandableSavedState == null) {
            return;
        }
        setLayoutSize(expandableSavedState.getSize());
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        ExpandableSavedState expandableSavedState = new ExpandableSavedState(super.onSaveInstanceState());
        expandableSavedState.setSize(getCurrentPosition());
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
        if (this.closePosition < getCurrentPosition()) {
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
        createExpandAnimator(getCurrentPosition(), this.layoutSize, this.duration, this.interpolator).start();
    }

    @Override // com.github.aakira.expandablelayout.ExpandableLayout
    public void expand(long j, TimeInterpolator timeInterpolator) {
        if (this.isAnimating) {
            return;
        }
        if (j <= 0) {
            move(this.layoutSize, j, timeInterpolator);
        } else {
            createExpandAnimator(getCurrentPosition(), this.layoutSize, j, timeInterpolator).start();
        }
    }

    @Override // com.github.aakira.expandablelayout.ExpandableLayout
    public void collapse() {
        if (this.isAnimating) {
            return;
        }
        createExpandAnimator(getCurrentPosition(), this.closePosition, this.duration, this.interpolator).start();
    }

    @Override // com.github.aakira.expandablelayout.ExpandableLayout
    public void collapse(long j, TimeInterpolator timeInterpolator) {
        if (this.isAnimating) {
            return;
        }
        if (j <= 0) {
            move(this.closePosition, j, timeInterpolator);
        } else {
            createExpandAnimator(getCurrentPosition(), this.closePosition, j, timeInterpolator).start();
        }
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
        if (this.inRecyclerView) {
            this.recyclerExpanded = z;
        }
        int currentPosition = getCurrentPosition();
        if (z && currentPosition == this.layoutSize) {
            return;
        }
        if (z || currentPosition != this.closePosition) {
            this.isExpanded = z;
            setLayoutSize(z ? this.layoutSize : this.closePosition);
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

    public void initLayout() {
        this.closePosition = 0;
        this.layoutSize = 0;
        this.isArranged = false;
        this.isCalculatedSize = false;
        this.savedState = null;
        if (isVertical()) {
            measure(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeight(), 0));
        } else {
            measure(View.MeasureSpec.makeMeasureSpec(getWidth(), 0), View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824));
        }
    }

    public void move(int i) {
        move(i, this.duration, this.interpolator);
    }

    public void move(int i, long j, TimeInterpolator timeInterpolator) {
        if (this.isAnimating || i < 0 || this.layoutSize < i) {
            return;
        }
        if (j <= 0) {
            this.isExpanded = i > this.closePosition;
            setLayoutSize(i);
            requestLayout();
            notifyListeners();
            return;
        }
        int currentPosition = getCurrentPosition();
        if (timeInterpolator == null) {
            timeInterpolator = this.interpolator;
        }
        createExpandAnimator(currentPosition, i, j, timeInterpolator).start();
    }

    public void moveChild(int i) {
        moveChild(i, this.duration, this.interpolator);
    }

    public void moveChild(int i, long j, TimeInterpolator timeInterpolator) {
        if (this.isAnimating) {
            return;
        }
        int childPosition = getChildPosition(i) + (isVertical() ? getPaddingBottom() : getPaddingRight());
        if (j <= 0) {
            this.isExpanded = childPosition > this.closePosition;
            setLayoutSize(childPosition);
            requestLayout();
            notifyListeners();
            return;
        }
        int currentPosition = getCurrentPosition();
        if (timeInterpolator == null) {
            timeInterpolator = this.interpolator;
        }
        createExpandAnimator(currentPosition, childPosition, j, timeInterpolator).start();
    }

    public int getChildPosition(int i) {
        if (i < 0 || this.childSizeList.size() <= i) {
            throw new IllegalArgumentException("There aren't the view having this index.");
        }
        return this.childSizeList.get(i).intValue();
    }

    public int getClosePosition() {
        return this.closePosition;
    }

    public void setClosePosition(int i) {
        this.closePosition = i;
    }

    public int getCurrentPosition() {
        return isVertical() ? getMeasuredHeight() : getMeasuredWidth();
    }

    public void setClosePositionIndex(int i) {
        this.closePosition = getChildPosition(i);
    }

    public void setInRecyclerView(boolean z) {
        this.inRecyclerView = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isVertical() {
        return getOrientation() == 1;
    }

    private void setLayoutSize(int i) {
        if (isVertical()) {
            getLayoutParams().height = i;
        } else {
            getLayoutParams().width = i;
        }
    }

    private ValueAnimator createExpandAnimator(int i, final int i2, long j, TimeInterpolator timeInterpolator) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.setDuration(j);
        ofInt.setInterpolator(timeInterpolator);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.github.aakira.expandablelayout.ExpandableLinearLayout.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (ExpandableLinearLayout.this.isVertical()) {
                    ExpandableLinearLayout.this.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                } else {
                    ExpandableLinearLayout.this.getLayoutParams().width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                }
                ExpandableLinearLayout.this.requestLayout();
            }
        });
        ofInt.addListener(new AnimatorListenerAdapter() { // from class: com.github.aakira.expandablelayout.ExpandableLinearLayout.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ExpandableLinearLayout.this.isAnimating = true;
                if (ExpandableLinearLayout.this.listener == null) {
                    return;
                }
                ExpandableLinearLayout.this.listener.onAnimationStart();
                if (ExpandableLinearLayout.this.layoutSize == i2) {
                    ExpandableLinearLayout.this.listener.onPreOpen();
                } else if (ExpandableLinearLayout.this.closePosition == i2) {
                    ExpandableLinearLayout.this.listener.onPreClose();
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ExpandableLinearLayout.this.isAnimating = false;
                ExpandableLinearLayout expandableLinearLayout = ExpandableLinearLayout.this;
                expandableLinearLayout.isExpanded = i2 > expandableLinearLayout.closePosition;
                if (ExpandableLinearLayout.this.listener == null) {
                    return;
                }
                ExpandableLinearLayout.this.listener.onAnimationEnd();
                if (i2 == ExpandableLinearLayout.this.layoutSize) {
                    ExpandableLinearLayout.this.listener.onOpened();
                } else if (i2 == ExpandableLinearLayout.this.closePosition) {
                    ExpandableLinearLayout.this.listener.onClosed();
                }
            }
        });
        return ofInt;
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
        this.mGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.github.aakira.expandablelayout.ExpandableLinearLayout.3
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                ExpandableLinearLayout.this.getViewTreeObserver().removeOnGlobalLayoutListener(ExpandableLinearLayout.this.mGlobalLayoutListener);
                ExpandableLinearLayout.this.listener.onAnimationEnd();
                if (ExpandableLinearLayout.this.isExpanded) {
                    ExpandableLinearLayout.this.listener.onOpened();
                } else {
                    ExpandableLinearLayout.this.listener.onClosed();
                }
            }
        };
        getViewTreeObserver().addOnGlobalLayoutListener(this.mGlobalLayoutListener);
    }
}
