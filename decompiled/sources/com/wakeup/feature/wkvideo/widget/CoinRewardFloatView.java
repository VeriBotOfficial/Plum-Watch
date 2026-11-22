package com.wakeup.feature.wkvideo.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.autonavi.aps.amapapi.config.Const;
import com.wakeup.common.dfx.PayFeedbackLogHelper;
import com.wakeup.commonui.progress.CircleProgressBar;
import com.wakeup.feature.wkvideo.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: CoinRewardFloatView.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0007J\u0018\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u00072\b\b\u0002\u0010!\u001a\u00020\u0019J\u0010\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020\u0019H\u0016J\b\u0010&\u001a\u00020\u001dH\u0002J\u001a\u0010'\u001a\u00020\u001d2\b\b\u0002\u0010(\u001a\u00020\u00072\b\b\u0002\u0010)\u001a\u00020\u0007J\b\u0010*\u001a\u00020\u001dH\u0002J\u0010\u0010+\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\u0007H\u0002J\u0010\u0010-\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u0014H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/wakeup/feature/wkvideo/widget/CoinRewardFloatView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", PayFeedbackLogHelper.BIZ_RING, "Lcom/wakeup/commonui/progress/CircleProgressBar;", "piggy", "Landroid/widget/ImageView;", "countText", "Landroid/widget/TextView;", "currentCount", "currentProgress", "touchSlop", "downRawX", "", "downRawY", "downTransX", "downTransY", "isDragging", "", "snapAnimator", "Landroid/animation/ValueAnimator;", "setCount", "", Const.SP_KEY_CALL_LOC_COUNT, "setProgress", "progress", "animate", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "performClick", "snapToEdge", "playCoinFly", "coins", "progressDelta", "bumpPiggy", "animateCountIncrement", "delta", "dp", "value", "feature-wkvideo_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CoinRewardFloatView extends FrameLayout {
    private final TextView countText;
    private int currentCount;
    private int currentProgress;
    private float downRawX;
    private float downRawY;
    private float downTransX;
    private float downTransY;
    private boolean isDragging;
    private final ImageView piggy;
    private final CircleProgressBar ring;
    private ValueAnimator snapAnimator;
    private final int touchSlop;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CoinRewardFloatView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CoinRewardFloatView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CoinRewardFloatView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoinRewardFloatView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.touchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        LayoutInflater.from(context).inflate(R.layout.layout_coin_reward_float, (ViewGroup) this, true);
        this.ring = (CircleProgressBar) findViewById(R.id.coinRewardRing);
        this.piggy = (ImageView) findViewById(R.id.coinRewardPiggy);
        this.countText = (TextView) findViewById(R.id.coinRewardCount);
        setClipChildren(false);
        setClipToPadding(false);
    }

    public final void setCount(int count) {
        this.currentCount = count;
        this.countText.setText(String.valueOf(count));
    }

    public static /* synthetic */ void setProgress$default(CoinRewardFloatView coinRewardFloatView, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        coinRewardFloatView.setProgress(i, z);
    }

    public final void setProgress(int progress, boolean animate) {
        int i;
        int coerceIn = RangesKt.coerceIn(progress, 0, 100);
        this.currentProgress = coerceIn;
        this.ring.setProgressA(coerceIn, animate);
        ImageView imageView = this.piggy;
        if (coerceIn >= 100) {
            i = R.drawable.ic_reward_envelope_open;
        } else {
            i = R.drawable.ic_reward_envelope;
        }
        imageView.setImageResource(i);
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
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.wakeup.feature.wkvideo.widget.CoinRewardFloatView$$ExternalSyntheticLambda1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                CoinRewardFloatView.snapToEdge$lambda$1$lambda$0(CoinRewardFloatView.this, valueAnimator2);
            }
        });
        ofFloat.start();
        this.snapAnimator = ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void snapToEdge$lambda$1$lambda$0(CoinRewardFloatView coinRewardFloatView, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        coinRewardFloatView.setTranslationX(((Float) animatedValue).floatValue());
    }

    public static /* synthetic */ void playCoinFly$default(CoinRewardFloatView coinRewardFloatView, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 3;
        }
        if ((i3 & 2) != 0) {
            i2 = 5;
        }
        coinRewardFloatView.playCoinFly(i, i2);
    }

    public final void playCoinFly(int coins, int progressDelta) {
        View rootView = getRootView();
        final ViewGroup viewGroup = rootView instanceof ViewGroup ? (ViewGroup) rootView : null;
        if (viewGroup == null) {
            ViewParent parent = getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 == null) {
                return;
            } else {
                viewGroup = viewGroup2;
            }
        }
        char c = 1;
        int coerceIn = RangesKt.coerceIn(coins, 1, 8);
        int i = 2;
        this.piggy.getLocationInWindow(new int[2]);
        viewGroup.getLocationInWindow(new int[2]);
        char c2 = 0;
        float f = 2.0f;
        float width = (r5[0] - r6[0]) + (this.piggy.getWidth() / 2.0f);
        float height = (r5[1] - r6[1]) + (this.piggy.getHeight() / 2.0f);
        int i2 = 0;
        while (i2 < coerceIn) {
            final ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(R.drawable.ic_reward_coin);
            int dp = dp(20.0f);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(dp, dp));
            imageView.setAlpha(0.0f);
            viewGroup.addView(imageView);
            float dp2 = (width - dp(10.0f)) + ((i2 - (coerceIn / f)) * dp(24.0f));
            float dp3 = (height - dp(160.0f)) - ((i2 % 3) * dp(18.0f));
            imageView.setTranslationX(dp2);
            imageView.setTranslationY(dp3);
            imageView.setScaleX(0.6f);
            imageView.setScaleY(0.6f);
            float[] fArr = new float[i];
            fArr[c2] = dp2;
            fArr[c] = width - dp(10.0f);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, "translationX", fArr);
            float[] fArr2 = new float[i];
            fArr2[c2] = dp3;
            fArr2[c] = height - dp(10.0f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView, "translationY", fArr2);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(imageView, "scaleX", 0.6f, 1.1f, 0.5f);
            char c3 = c;
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(imageView, "scaleY", 0.6f, 1.1f, 0.5f);
            char c4 = c2;
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(imageView, "alpha", 0.0f, 1.0f, 1.0f, 0.0f);
            float[] fArr3 = new float[i];
            // fill-array-data instruction
            fArr3[0] = 0.0f;
            fArr3[1] = 360.0f;
            int i3 = i;
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(imageView, "rotation", fArr3);
            AnimatorSet animatorSet = new AnimatorSet();
            Animator[] animatorArr = new Animator[6];
            animatorArr[c4] = ofFloat;
            animatorArr[c3] = ofFloat2;
            animatorArr[i3] = ofFloat3;
            animatorArr[3] = ofFloat4;
            animatorArr[4] = ofFloat5;
            animatorArr[5] = ofFloat6;
            animatorSet.playTogether(animatorArr);
            animatorSet.setDuration(700L);
            animatorSet.setStartDelay(i2 * 90);
            animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
            animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.wakeup.feature.wkvideo.widget.CoinRewardFloatView$playCoinFly$1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                    viewGroup.removeView(imageView);
                    this.bumpPiggy();
                }
            });
            animatorSet.start();
            i2++;
            c2 = c4;
            c = c3;
            i = i3;
            f = 2.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bumpPiggy() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.piggy, "scaleX", 1.0f, 1.18f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.piggy, "scaleY", 1.0f, 1.18f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.setDuration(260L);
        animatorSet.setInterpolator(new OvershootInterpolator());
        animatorSet.start();
    }

    private final void animateCountIncrement(int delta) {
        int i = this.currentCount;
        int i2 = delta + i;
        this.currentCount = i2;
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.setDuration(400L);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.wakeup.feature.wkvideo.widget.CoinRewardFloatView$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CoinRewardFloatView.animateCountIncrement$lambda$8$lambda$7(CoinRewardFloatView.this, valueAnimator);
            }
        });
        ofInt.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateCountIncrement$lambda$8$lambda$7(CoinRewardFloatView coinRewardFloatView, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        TextView textView = coinRewardFloatView.countText;
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        textView.setText(String.valueOf(((Integer) animatedValue).intValue()));
    }

    private final int dp(float value) {
        return (int) ((value * getResources().getDisplayMetrics().density) + 0.5f);
    }
}
