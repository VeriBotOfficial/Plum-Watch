package com.wakeup.feature.wkvideo.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.wakeup.feature.wkvideo.R;

/* loaded from: classes3.dex */
public class CommentLoadingView extends LinearLayout {
    private RotateAnimation animation;
    private final ViewTreeObserver.OnGlobalLayoutListener globalLayoutListener;
    private ImageView imageView;
    private TextView textView;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        if (getGlobalVisibleRect(new Rect()) && this.imageView.getVisibility() == 0) {
            this.animation.start();
        } else if (this.animation.hasStarted()) {
            this.animation.cancel();
        }
    }

    public CommentLoadingView(Context context) {
        this(context, null);
    }

    public CommentLoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CommentLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.animation = new RotateAnimation(0.0f, 360.0f);
        this.globalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.wakeup.feature.wkvideo.view.CommentLoadingView$$ExternalSyntheticLambda0
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                CommentLoadingView.this.lambda$new$0();
            }
        };
        initView();
    }

    public void showImageView() {
        this.imageView.setVisibility(0);
        this.textView.setVisibility(8);
    }

    public void showTextView() {
        this.imageView.setVisibility(8);
        this.textView.setVisibility(0);
        this.animation.cancel();
    }

    public void hideAll() {
        this.imageView.setVisibility(8);
        this.textView.setVisibility(8);
        this.animation.cancel();
    }

    private void initView() {
        setOrientation(1);
        setGravity(17);
        ImageView imageView = new ImageView(getContext());
        this.imageView = imageView;
        imageView.setImageResource(R.drawable.ic_comment_loading);
        this.animation.setRepeatMode(-1);
        this.animation.setDuration(3000L);
        this.animation.setInterpolator(new LinearInterpolator());
        this.animation.setFillAfter(false);
        this.imageView.setVisibility(8);
        addView(this.imageView, new ViewGroup.LayoutParams(-2, -1));
        TextView textView = new TextView(getContext());
        this.textView = textView;
        textView.setText(com.wakeup.commonui.R.string.comment_bottom);
        this.textView.setTextColor(getContext().getColor(com.wakeup.commonui.R.color.color_999999));
        this.textView.setTextSize(12.0f);
        this.textView.setVisibility(8);
        addView(this.textView, new ViewGroup.LayoutParams(-2, -1));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        getViewTreeObserver().addOnGlobalLayoutListener(this.globalLayoutListener);
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        if (getViewTreeObserver().isAlive()) {
            getViewTreeObserver().removeOnGlobalLayoutListener(this.globalLayoutListener);
        }
        super.onDetachedFromWindow();
    }
}
