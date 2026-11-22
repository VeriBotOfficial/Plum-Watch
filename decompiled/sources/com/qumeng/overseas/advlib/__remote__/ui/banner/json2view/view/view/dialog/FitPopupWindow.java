package com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.view.dialog;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import androidx.core.view.GravityCompat;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.s;
import com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.utils.g;

/* loaded from: classes17.dex */
public class FitPopupWindow extends PopupWindow implements PopupWindow.OnDismissListener {
    private static final float BG_WINDOW_ALPHA = 0.6f;
    private static final int PADDING = 0;
    private static final int POP_START_TIME = 140;
    private View mAnchorView;
    private Context mContext;
    private FitPopupWindowLayout mFitPopupWindowLayout;
    private int mHorizontal;
    private int mSharpHeight;
    private int mVertical;
    private int[] mWindowPos;
    private int mWindowWidth;
    private int mXCoordinate;

    public FitPopupWindow(Context context, int i, int i2) {
        init(context, i, i2);
    }

    private int getHorizontal() {
        return this.mHorizontal;
    }

    private int getVertical() {
        return this.mVertical;
    }

    private void init(Context context, int i, int i2) {
        this.mContext = context;
        this.mWindowWidth = i;
        this.mSharpHeight = (int) g.a(context, 8.0f);
        setWidth(i);
        setHeight(i2);
        setBackgroundDrawable(new ColorDrawable(0));
        setOutsideTouchable(true);
        setFocusable(true);
        setOnDismissListener(this);
    }

    private void setHorizontal(int i) {
        this.mHorizontal = i;
    }

    private void setVertical(int i) {
        this.mVertical = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWindowBackgroundAlpha(float f) {
        Context context = this.mContext;
        if (context != null && (context instanceof Activity)) {
            Window window = ((Activity) context).getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.alpha = f;
            window.setAttributes(attributes);
        }
    }

    private void startPopAnimation() {
        this.mFitPopupWindowLayout.clearAnimation();
        this.mFitPopupWindowLayout.measure(0, 0);
        AnimationSet animationSet = new AnimationSet(true);
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.0f, 0.0f, 1.0f, 1, getWidth(), 0, getVertical() == 1 ? this.mWindowPos[1] : 0.0f);
        scaleAnimation.setDuration(140L);
        scaleAnimation.setInterpolator(new DecelerateInterpolator());
        scaleAnimation.setFillAfter(true);
        animationSet.addAnimation(scaleAnimation);
        this.mFitPopupWindowLayout.startAnimation(animationSet);
    }

    public void changeView(View view, boolean z) {
        this.mFitPopupWindowLayout.removeAllViews();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, getHeight() - this.mSharpHeight);
        layoutParams.bottomMargin = this.mSharpHeight;
        view.setLayoutParams(layoutParams);
        this.mFitPopupWindowLayout.setOrientation(getHorizontal(), getVertical(), getXCoordinate());
        this.mFitPopupWindowLayout.addView(view);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, TokenNames.X, z ? -getWidth() : getWidth(), 0.0f);
        ofFloat.setDuration(120L);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.start();
        this.mWindowPos = calculatePopWindowPos(this.mAnchorView, view);
        update();
    }

    public int getXCoordinate() {
        if (this.mXCoordinate > this.mWindowWidth / 2) {
            this.mXCoordinate = (int) (((r1 - r0) - ((this.mAnchorView.getWidth() * 7) / 8)) + g.a(this.mContext, 20.0f));
        }
        return this.mXCoordinate;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.6f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.view.dialog.FitPopupWindow.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                FitPopupWindow.this.setWindowBackgroundAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        ofFloat.setDuration(140L);
        ofFloat.start();
    }

    public void setView(View view, View view2) {
        this.mAnchorView = view2;
        this.mWindowPos = calculatePopWindowPos(view2, view);
        this.mFitPopupWindowLayout = new FitPopupWindowLayout(this.mContext);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, getHeight() - this.mSharpHeight);
        layoutParams.bottomMargin = this.mSharpHeight;
        view.setLayoutParams(layoutParams);
        this.mFitPopupWindowLayout.setOrientation(getHorizontal(), getVertical(), getXCoordinate());
        this.mFitPopupWindowLayout.addView(view);
        setContentView(this.mFitPopupWindowLayout);
    }

    protected int[] calculatePopWindowPos(View view, View view2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int height = view.getHeight();
        view.getWidth();
        this.mXCoordinate = iArr[0];
        int b = s.b(view.getContext());
        int c = s.c(view.getContext());
        view2.measure(0, 0);
        view2.getMeasuredHeight();
        int i = this.mWindowWidth;
        if (i <= 0) {
            i = view2.getMeasuredWidth();
        }
        this.mWindowWidth = i;
        boolean z = (b - iArr[1]) - height < b / 2;
        setHorizontal(iArr[0] < i / 2 ? 3 : 2);
        setVertical(z ? 1 : 4);
        return new int[]{(c - this.mWindowWidth) / 2, z ? (b - iArr[1]) + this.mSharpHeight + ((height * 3) / 4) : iArr[1] + height};
    }

    public void show() {
        startPopAnimation();
        View view = this.mAnchorView;
        int i = (getVertical() == 1 ? 80 : 48) | GravityCompat.END;
        int[] iArr = this.mWindowPos;
        showAtLocation(view, i, iArr[0], iArr[1]);
        update();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.6f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.view.dialog.FitPopupWindow.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                FitPopupWindow.this.setWindowBackgroundAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        ofFloat.setDuration(140L);
        ofFloat.start();
    }
}
