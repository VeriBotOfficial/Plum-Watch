package com.wakeup.commonui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;
import com.wakeup.common.log.LogUtils;
import com.wakeup.commonui.R;
import com.wakeup.commonui.utils.RandomIndexManager;
import com.wakeup.commonui.utils.UIHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustomTextBannerView.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u00012B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\u001f\u001a\u00020 2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010!\u001a\u00020\rH\u0002J\b\u0010\"\u001a\u00020 H\u0014J\b\u0010#\u001a\u00020 H\u0014J\u0018\u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\rH\u0002J\u0016\u0010'\u001a\u00020 2\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u001aJ\u000e\u0010)\u001a\u00020 2\u0006\u0010&\u001a\u00020\rJ\b\u0010*\u001a\u0004\u0018\u00010\u000fJ\u0006\u0010+\u001a\u00020\rJ\u001c\u0010,\u001a\u00020 2\b\b\u0001\u0010\u0016\u001a\u00020\r2\b\b\u0001\u0010-\u001a\u00020\rH\u0002J\u0006\u00100\u001a\u00020 J\u0006\u00101\u001a\u00020 R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\rX\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u00020\r8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u00020\r8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\rX\u0082D¢\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010.\u001a\u00060/R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/wakeup/commonui/view/CustomTextBannerView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mViewFlipper", "Landroid/widget/ViewFlipper;", "mTextView", "Landroid/widget/TextView;", "mInterval", "", "TAG", "", "isSingleLine", "", "mTextColor", "mTextSize", "mDefaultText", "mGravity", "inAnimResId", "outAnimResId", "animDuration", "mDatas", "", "isStarted", "isDetachedFromWindow", "randomIndexManager", "Lcom/wakeup/commonui/utils/RandomIndexManager;", "init", "", "defStyleAttr", "onAttachedToWindow", "onDetachedFromWindow", "setTextView", "textView", "position", "setDatas", "datas", "setShowPosition", "getCurrentText", "getCurrentPosition", "setInAndOutAnimation", "outAnimResID", "mRunnable", "Lcom/wakeup/commonui/view/CustomTextBannerView$AnimRunnable;", "stopViewAnimator", "startViewAnimator", "AnimRunnable", "commonui_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CustomTextBannerView extends FrameLayout {
    private final String TAG;
    private final int animDuration;
    private final int inAnimResId;
    private boolean isDetachedFromWindow;
    private final boolean isSingleLine;
    private boolean isStarted;
    private List<String> mDatas;
    private String mDefaultText;
    private final int mGravity;
    private final int mInterval;
    private final AnimRunnable mRunnable;
    private int mTextColor;
    private int mTextSize;
    private TextView mTextView;
    private ViewFlipper mViewFlipper;
    private final int outAnimResId;
    private RandomIndexManager randomIndexManager;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CustomTextBannerView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CustomTextBannerView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomTextBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mInterval = 5000;
        this.TAG = "CustomTextBannerView";
        this.isSingleLine = true;
        this.mTextColor = 6710886;
        this.mTextSize = UIHelper.px2dp(14.0f);
        this.mDefaultText = "";
        this.mGravity = 16;
        this.inAnimResId = R.anim.anim_bottom_in;
        this.outAnimResId = R.anim.anim_top_out;
        this.animDuration = 500;
        this.randomIndexManager = new RandomIndexManager();
        init(context, attributeSet, 0);
        this.mRunnable = new AnimRunnable();
    }

    private final void init(Context context, AttributeSet attrs, int defStyleAttr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.CustomSearchTextBannerView, defStyleAttr, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        if (obtainStyledAttributes.hasValue(R.styleable.CustomSearchTextBannerView_setTextColor)) {
            this.mTextColor = obtainStyledAttributes.getColor(R.styleable.CustomSearchTextBannerView_setTextColor, this.mTextColor);
        }
        if (obtainStyledAttributes.hasValue(R.styleable.CustomSearchTextBannerView_setTextSize)) {
            int dimension = (int) obtainStyledAttributes.getDimension(R.styleable.CustomSearchTextBannerView_setTextSize, this.mTextSize);
            this.mTextSize = dimension;
            this.mTextSize = UIHelper.px2dp(dimension);
        }
        if (obtainStyledAttributes.hasValue(R.styleable.CustomSearchTextBannerView_setDefaultText)) {
            this.mDefaultText = String.valueOf(obtainStyledAttributes.getString(R.styleable.CustomSearchTextBannerView_setDefaultText));
        }
        TextView textView = new TextView(context);
        this.mTextView = textView;
        textView.setText(this.mDefaultText);
        TextView textView2 = this.mTextView;
        if (textView2 != null) {
            textView2.setSingleLine(this.isSingleLine);
        }
        TextView textView3 = this.mTextView;
        if (textView3 != null) {
            textView3.setEllipsize(TextUtils.TruncateAt.END);
        }
        TextView textView4 = this.mTextView;
        if (textView4 != null) {
            textView4.setTextColor(this.mTextColor);
        }
        TextView textView5 = this.mTextView;
        if (textView5 != null) {
            textView5.setTextSize(this.mTextSize);
        }
        TextView textView6 = this.mTextView;
        if (textView6 != null) {
            textView6.setGravity(this.mGravity);
        }
        TextView textView7 = this.mTextView;
        if (textView7 != null) {
            textView7.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        }
        addView(this.mTextView);
        ViewFlipper viewFlipper = new ViewFlipper(getContext());
        this.mViewFlipper = viewFlipper;
        Intrinsics.checkNotNull(viewFlipper);
        viewFlipper.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(this.mViewFlipper);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.isDetachedFromWindow = false;
        List<String> list = this.mDatas;
        if (list != null) {
            Intrinsics.checkNotNull(list);
            if (list.size() > 0) {
                ViewFlipper viewFlipper = this.mViewFlipper;
                Intrinsics.checkNotNull(viewFlipper);
                if (viewFlipper.getChildCount() > 0) {
                    startViewAnimator();
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.isDetachedFromWindow = true;
    }

    private final void setTextView(TextView textView, int position) {
        List<String> list = this.mDatas;
        Intrinsics.checkNotNull(list);
        if (position >= list.size()) {
            return;
        }
        List<String> list2 = this.mDatas;
        Intrinsics.checkNotNull(list2);
        textView.setText(list2.get(position));
        textView.setSingleLine(this.isSingleLine);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextColor(this.mTextColor);
        textView.setTextSize(this.mTextSize);
        textView.setGravity(this.mGravity);
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
    }

    public final void setDatas(List<String> datas) {
        this.mDatas = datas;
        if (datas != null) {
            Intrinsics.checkNotNull(datas);
            if (datas.size() > 0) {
                ViewFlipper viewFlipper = this.mViewFlipper;
                if (viewFlipper != null) {
                    viewFlipper.setVisibility(0);
                }
                TextView textView = this.mTextView;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ViewFlipper viewFlipper2 = this.mViewFlipper;
                if (viewFlipper2 != null) {
                    viewFlipper2.removeAllViews();
                }
                List<String> list = this.mDatas;
                Intrinsics.checkNotNull(list);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    TextView textView2 = new TextView(getContext());
                    setTextView(textView2, i);
                    ViewFlipper viewFlipper3 = this.mViewFlipper;
                    if (viewFlipper3 != null) {
                        viewFlipper3.addView(textView2, i);
                    }
                }
                RandomIndexManager randomIndexManager = this.randomIndexManager;
                Intrinsics.checkNotNull(this.mDatas);
                randomIndexManager.setRandomMaxNumber(r0.size() - 1);
                startViewAnimator();
                return;
            }
        }
        ViewFlipper viewFlipper4 = this.mViewFlipper;
        if (viewFlipper4 != null) {
            viewFlipper4.setVisibility(8);
        }
        TextView textView3 = this.mTextView;
        if (textView3 != null) {
            textView3.setVisibility(0);
        }
    }

    public final void setShowPosition(int position) {
        ViewFlipper viewFlipper;
        List<String> list = this.mDatas;
        if (list != null) {
            Intrinsics.checkNotNull(list);
            if (list.size() <= 0 || position <= -1 || (viewFlipper = this.mViewFlipper) == null) {
                return;
            }
            viewFlipper.setDisplayedChild(position);
        }
    }

    public final String getCurrentText() {
        ViewFlipper viewFlipper;
        List<String> list;
        List<String> list2 = this.mDatas;
        if (list2 != null) {
            Intrinsics.checkNotNull(list2);
            if (list2.size() != 0 && (viewFlipper = this.mViewFlipper) != null && (list = this.mDatas) != null) {
                Intrinsics.checkNotNull(viewFlipper);
                return list.get(viewFlipper.getDisplayedChild());
            }
        }
        return null;
    }

    public final int getCurrentPosition() {
        ViewFlipper viewFlipper;
        List<String> list = this.mDatas;
        if (list == null) {
            return -1;
        }
        Intrinsics.checkNotNull(list);
        if (list.size() == 0 || (viewFlipper = this.mViewFlipper) == null) {
            return -1;
        }
        Intrinsics.checkNotNull(viewFlipper);
        return viewFlipper.getDisplayedChild();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setInAndOutAnimation(int inAnimResId, int outAnimResID) {
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), inAnimResId);
        loadAnimation.setDuration(this.animDuration);
        ViewFlipper viewFlipper = this.mViewFlipper;
        Intrinsics.checkNotNull(viewFlipper);
        viewFlipper.setInAnimation(loadAnimation);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(getContext(), outAnimResID);
        loadAnimation2.setDuration(this.animDuration);
        ViewFlipper viewFlipper2 = this.mViewFlipper;
        Intrinsics.checkNotNull(viewFlipper2);
        viewFlipper2.setOutAnimation(loadAnimation2);
    }

    /* compiled from: CustomTextBannerView.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lcom/wakeup/commonui/view/CustomTextBannerView$AnimRunnable;", "Ljava/lang/Runnable;", "<init>", "(Lcom/wakeup/commonui/view/CustomTextBannerView;)V", "run", "", "commonui_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private final class AnimRunnable implements Runnable {
        public AnimRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (CustomTextBannerView.this.isStarted) {
                CustomTextBannerView customTextBannerView = CustomTextBannerView.this;
                customTextBannerView.setInAndOutAnimation(customTextBannerView.inAnimResId, CustomTextBannerView.this.outAnimResId);
                ViewFlipper viewFlipper = CustomTextBannerView.this.mViewFlipper;
                Intrinsics.checkNotNull(viewFlipper);
                viewFlipper.showNext();
                CustomTextBannerView.this.postDelayed(this, r0.mInterval + CustomTextBannerView.this.animDuration);
                return;
            }
            CustomTextBannerView.this.stopViewAnimator();
        }
    }

    public final void stopViewAnimator() {
        if (this.isStarted) {
            removeCallbacks(this.mRunnable);
            this.isStarted = false;
            RandomIndexManager randomIndexManager = this.randomIndexManager;
            ViewFlipper viewFlipper = this.mViewFlipper;
            Intrinsics.checkNotNull(viewFlipper);
            randomIndexManager.setShowPosition(viewFlipper.getDisplayedChild());
        }
    }

    public final void startViewAnimator() {
        ViewFlipper viewFlipper;
        List<String> list = this.mDatas;
        if (list != null) {
            Intrinsics.checkNotNull(list);
            if (list.size() == 0 || (viewFlipper = this.mViewFlipper) == null) {
                return;
            }
            Intrinsics.checkNotNull(viewFlipper);
            if (viewFlipper.getChildCount() <= 0 || this.isStarted || this.isDetachedFromWindow) {
                return;
            }
            this.isStarted = true;
            RandomIndexManager randomIndexManager = this.randomIndexManager;
            List<String> list2 = this.mDatas;
            Intrinsics.checkNotNull(list2);
            randomIndexManager.setRandomMaxNumber(list2.size() - 1);
            setShowPosition(this.randomIndexManager.getRandomShowPosition());
            LogUtils.i(this.TAG, "random:" + this.randomIndexManager.getShowPosition() + " randomMaxNumber : " + this.randomIndexManager.getRandomMaxNumber());
            postDelayed(this.mRunnable, this.mInterval);
        }
    }
}
