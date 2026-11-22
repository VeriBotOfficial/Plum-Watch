package com.wakeup.commonui.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.wakeup.commonui.databinding.LayoutViewSlideUnlockBinding;
import com.wakeup.commonui.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SlideUnlockView.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001%B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ(\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0007H\u0014J\u0010\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u0007H\u0016J\b\u0010\u001f\u001a\u00020\u0018H\u0002J\u0010\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\"H\u0002J\u000e\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u0012R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/wakeup/commonui/view/SlideUnlockView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "style", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mBinding", "Lcom/wakeup/commonui/databinding/LayoutViewSlideUnlockBinding;", "mMaxDis", "mActionDownX", "mLastX", "mIsUnLocked", "", "mCallback", "Lcom/wakeup/commonui/view/SlideUnlockView$UnlockCallback;", "arrowAnim", "Landroid/graphics/drawable/AnimationDrawable;", "mTouchListener", "Landroid/view/View$OnTouchListener;", "onSizeChanged", "", "w", "h", "oldw", "oldh", "setVisibility", "visibility", "unlock", "scrollToLeft", "v", "Landroid/view/View;", "setCallback", "callback", "UnlockCallback", "commonui_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SlideUnlockView extends FrameLayout {
    private AnimationDrawable arrowAnim;
    private int mActionDownX;
    private LayoutViewSlideUnlockBinding mBinding;
    private UnlockCallback mCallback;
    private boolean mIsUnLocked;
    private int mLastX;
    private int mMaxDis;
    private final View.OnTouchListener mTouchListener;

    /* compiled from: SlideUnlockView.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/wakeup/commonui/view/SlideUnlockView$UnlockCallback;", "", "onUnlock", "", "commonui_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface UnlockCallback {
        void onUnlock();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SlideUnlockView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SlideUnlockView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SlideUnlockView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? -1 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlideUnlockView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        View.OnTouchListener onTouchListener = new View.OnTouchListener() { // from class: com.wakeup.commonui.view.SlideUnlockView$$ExternalSyntheticLambda1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean mTouchListener$lambda$0;
                mTouchListener$lambda$0 = SlideUnlockView.mTouchListener$lambda$0(SlideUnlockView.this, view, motionEvent);
                return mTouchListener$lambda$0;
            }
        };
        this.mTouchListener = onTouchListener;
        LayoutViewSlideUnlockBinding inflate = LayoutViewSlideUnlockBinding.inflate(LayoutInflater.from(context), this, true);
        this.mBinding = inflate;
        inflate.ivSlider.setOnTouchListener(onTouchListener);
        Drawable background = this.mBinding.ivAnim.getBackground();
        Intrinsics.checkNotNull(background, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
        AnimationDrawable animationDrawable = (AnimationDrawable) background;
        this.arrowAnim = animationDrawable;
        animationDrawable.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean mTouchListener$lambda$0(SlideUnlockView slideUnlockView, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                Intrinsics.checkNotNull(view);
                slideUnlockView.scrollToLeft(view);
            } else if (action == 2) {
                int rawX = ((int) motionEvent.getRawX()) - slideUnlockView.mLastX;
                int rawX2 = ((int) motionEvent.getRawX()) - slideUnlockView.mActionDownX;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin + rawX, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                view.setLayoutParams(marginLayoutParams);
                slideUnlockView.mLastX = (int) motionEvent.getRawX();
                if (rawX2 >= slideUnlockView.mMaxDis) {
                    slideUnlockView.unlock();
                }
            }
        } else {
            if (slideUnlockView.mIsUnLocked) {
                return false;
            }
            slideUnlockView.mLastX = (int) motionEvent.getRawX();
            slideUnlockView.mActionDownX = (int) motionEvent.getRawX();
        }
        return true;
    }

    @Override // android.view.View
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.mMaxDis = w - UIHelper.dp2px(50.0f);
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
        super.setVisibility(visibility);
        if (visibility == 0) {
            this.arrowAnim.start();
            this.mIsUnLocked = false;
        } else {
            if (visibility != 8) {
                return;
            }
            this.arrowAnim.stop();
        }
    }

    private final void unlock() {
        if (this.mIsUnLocked) {
            return;
        }
        this.mIsUnLocked = true;
        UnlockCallback unlockCallback = this.mCallback;
        if (unlockCallback != null) {
            unlockCallback.onUnlock();
        }
    }

    private final void scrollToLeft(final View v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        final int i = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        ValueAnimator ofInt = ValueAnimator.ofInt(i);
        ofInt.setDuration(200L);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.wakeup.commonui.view.SlideUnlockView$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SlideUnlockView.scrollToLeft$lambda$1(i, v, valueAnimator);
            }
        });
        ofInt.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scrollToLeft$lambda$1(int i, View view, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = i - ((Integer) animatedValue).intValue();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.leftMargin = intValue;
        view.setLayoutParams(marginLayoutParams);
    }

    public final void setCallback(UnlockCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.mCallback = callback;
    }
}
