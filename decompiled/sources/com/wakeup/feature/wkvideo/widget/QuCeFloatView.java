package com.wakeup.feature.wkvideo.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.wakeup.feature.wkvideo.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: QuCeFloatView.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0011H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\fH\u0002R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/wakeup/feature/wkvideo/widget/QuCeFloatView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "touchSlop", "downRawX", "", "downRawY", "downTransX", "downTransY", "isDragging", "", "snapAnimator", "Landroid/animation/ValueAnimator;", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "performClick", "snapToEdge", "", "dp", "value", "feature-wkvideo_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class QuCeFloatView extends FrameLayout {
    private float downRawX;
    private float downRawY;
    private float downTransX;
    private float downTransY;
    private boolean isDragging;
    private ValueAnimator snapAnimator;
    private final int touchSlop;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QuCeFloatView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QuCeFloatView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ QuCeFloatView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuCeFloatView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.touchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        LayoutInflater.from(context).inflate(R.layout.layout_quce_float, (ViewGroup) this, true);
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            this.downRawX = event.getRawX();
            this.downRawY = event.getRawY();
            this.downTransX = getTranslationX();
            this.downTransY = getTranslationY();
            this.isDragging = false;
            ValueAnimator valueAnimator = this.snapAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            return true;
        }
        if (actionMasked == 1) {
            ViewParent parent2 = getParent();
            if (parent2 != null) {
                parent2.requestDisallowInterceptTouchEvent(false);
            }
            if (this.isDragging) {
                snapToEdge();
                return true;
            }
            return performClick();
        }
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                ViewParent parent3 = getParent();
                if (parent3 != null) {
                    parent3.requestDisallowInterceptTouchEvent(false);
                }
                if (this.isDragging) {
                    snapToEdge();
                }
                return true;
            }
            return super.onTouchEvent(event);
        }
        float rawX = event.getRawX() - this.downRawX;
        float rawY = event.getRawY() - this.downRawY;
        if (!this.isDragging && ((float) Math.hypot(rawX, rawY)) > this.touchSlop) {
            this.isDragging = true;
        }
        if (this.isDragging) {
            ViewParent parent4 = getParent();
            ViewGroup viewGroup = parent4 instanceof ViewGroup ? (ViewGroup) parent4 : null;
            if (viewGroup == null) {
                return true;
            }
            int dp = dp(12.0f);
            int dp2 = dp(24.0f);
            int coerceAtLeast = RangesKt.coerceAtLeast((viewGroup.getWidth() - getWidth()) - dp, dp);
            int coerceAtLeast2 = RangesKt.coerceAtLeast((viewGroup.getHeight() - getHeight()) - dp2, dp2);
            float left = getLeft() + this.downTransX + rawX;
            float top2 = getTop() + this.downTransY + rawY;
            float coerceIn = RangesKt.coerceIn(left, dp, coerceAtLeast);
            float coerceIn2 = RangesKt.coerceIn(top2, dp2, coerceAtLeast2);
            setTranslationX(coerceIn - getLeft());
            setTranslationY(coerceIn2 - getTop());
        }
        return true;
    }

    @Override // android.view.View
    public boolean performClick() {
        return super.performClick();
    }

    private final void snapToEdge() {
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return;
        }
        float dp = ((((float) getLeft()) + getTranslationX()) + (((float) getWidth()) / 2.0f) < ((float) viewGroup.getWidth()) / 2.0f ? dp(12.0f) : (viewGroup.getWidth() - getWidth()) - r1) - getLeft();
        ValueAnimator valueAnimator = this.snapAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(getTranslationX(), dp);
        ofFloat.setDuration(260L);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.wakeup.feature.wkvideo.widget.QuCeFloatView$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                QuCeFloatView.snapToEdge$lambda$1$lambda$0(QuCeFloatView.this, valueAnimator2);
            }
        });
        ofFloat.start();
        this.snapAnimator = ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void snapToEdge$lambda$1$lambda$0(QuCeFloatView quCeFloatView, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        quCeFloatView.setTranslationX(((Float) animatedValue).floatValue());
    }

    private final int dp(float value) {
        return (int) ((value * getResources().getDisplayMetrics().density) + 0.5f);
    }
}
