package com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.view.overrideview;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.qumeng.overseas.advlib.__remote__.framework.imageloader.l;

/* loaded from: classes17.dex */
public class FlashImageView extends FrameLayout {
    private ImageView dstImg;
    private String flashUrl;
    private ImageView srcImg;

    public FlashImageView(Context context) {
        super(context);
        this.flashUrl = "https://cdn.adseye.com/nsdk/res/imgstatic/icon_incite_flash.png";
        initSrc();
    }

    private void initDst() {
        this.dstImg = new ImageView(getContext());
        this.dstImg.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        l.c().url(this.flashUrl).into(this.dstImg);
        addView(this.dstImg);
    }

    private void initSrc() {
        this.srcImg = new ImageView(getContext());
        this.srcImg.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(this.srcImg);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        Path path = new Path();
        path.addOval(new RectF(1.0f, 1.0f, getWidth() - 1, getHeight() - 1), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild;
    }

    public ImageView getSrcImg() {
        return this.srcImg;
    }

    public void startAnimation() {
        if (this.dstImg == null) {
            initDst();
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.dstImg, TokenNames.X, 0 - getWidth(), getWidth());
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.dstImg, "Y", 0 - getHeight(), getHeight());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(1000L);
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.start();
    }

    public void startScaleAnimation() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "scaleY", 1.0f, 1.2f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "scaleX", 1.0f, 1.2f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(300L);
        animatorSet.playTogether(ofFloat2, ofFloat);
        animatorSet.start();
    }

    public FlashImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.flashUrl = "https://cdn.adseye.com/nsdk/res/imgstatic/icon_incite_flash.png";
        initSrc();
    }
}
