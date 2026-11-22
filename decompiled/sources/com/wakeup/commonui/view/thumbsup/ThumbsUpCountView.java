package com.wakeup.commonui.view.thumbsup;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.wakeup.commonui.R;

/* loaded from: classes2.dex */
public class ThumbsUpCountView extends LinearLayout {
    public static long ANIM_DURATION = 200;
    private int mCircleColor;
    private int mPriseCount;
    private boolean mShowCircle;
    private boolean mShowDecoration;
    private int mTextOffColor;
    private int mTextOnColor;
    private float mTextSize;
    private boolean mThumbsUp;
    private Bitmap mThumbsUpDecoration;
    private Bitmap mThumbsUpOff;
    private Bitmap mThumbsUpOn;
    private PriseCountView priseCountView;
    private ThumbsUpView thumbsUpView;

    public void setAnimDuration(long j) {
    }

    public ThumbsUpCountView(Context context) {
        this(context, null);
    }

    public ThumbsUpCountView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ThumbsUpCountView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(attributeSet);
    }

    private void init(AttributeSet attributeSet) {
        setOrientation(0);
        setGravity(16);
        setClipChildren(false);
        removeAllViews();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ThumbsUpCountView);
            Drawable drawable = obtainStyledAttributes.getDrawable(R.styleable.ThumbsUpCountView_thumbsup_on_drawable);
            if (drawable != null) {
                this.mThumbsUpOn = ((BitmapDrawable) drawable).getBitmap();
            } else {
                this.mThumbsUpOn = BitmapFactory.decodeResource(getResources(), R.mipmap.thumbs_on);
            }
            Drawable drawable2 = obtainStyledAttributes.getDrawable(R.styleable.ThumbsUpCountView_thumbsup_off_drawable);
            if (drawable2 != null) {
                this.mThumbsUpOff = ((BitmapDrawable) drawable2).getBitmap();
            } else {
                this.mThumbsUpOff = BitmapFactory.decodeResource(getResources(), R.mipmap.thumbs_off);
            }
            Drawable drawable3 = obtainStyledAttributes.getDrawable(R.styleable.ThumbsUpCountView_thumbsup_on_decoration_drawable);
            if (drawable3 != null) {
                this.mThumbsUpOn = ((BitmapDrawable) drawable3).getBitmap();
            } else {
                this.mThumbsUpDecoration = BitmapFactory.decodeResource(getResources(), R.mipmap.thumbs_decoration);
            }
            this.mShowCircle = obtainStyledAttributes.getBoolean(R.styleable.ThumbsUpCountView_thumbsup_on_show_circle, true);
            this.mShowDecoration = obtainStyledAttributes.getBoolean(R.styleable.ThumbsUpCountView_thumbsup_on_show_decoration, true);
            this.mCircleColor = obtainStyledAttributes.getColor(R.styleable.ThumbsUpCountView_thumbsup_on_circle_color, getResources().getColor(R.color.thumbs_circle_color));
            this.mTextOnColor = obtainStyledAttributes.getColor(R.styleable.ThumbsUpCountView_thumbsup_on_text_color, getResources().getColor(R.color.thumbs_text_color));
            this.mTextOffColor = obtainStyledAttributes.getColor(R.styleable.ThumbsUpCountView_thumbsup_off_text_color, getResources().getColor(R.color.thumbs_text_color));
            this.mTextSize = obtainStyledAttributes.getDimension(R.styleable.ThumbsUpCountView_thumbsup_text_size, getResources().getDimension(R.dimen.prise_count_text_size));
            obtainStyledAttributes.recycle();
        } else {
            this.mThumbsUpOn = BitmapFactory.decodeResource(getResources(), R.mipmap.thumbs_on);
            this.mThumbsUpOff = BitmapFactory.decodeResource(getResources(), R.mipmap.thumbs_off);
            this.mThumbsUpDecoration = BitmapFactory.decodeResource(getResources(), R.mipmap.thumbs_decoration);
            this.mTextOnColor = getResources().getColor(R.color.thumbs_text_color);
            this.mTextOffColor = getResources().getColor(R.color.thumbs_text_color);
            this.mTextSize = getResources().getDimension(R.dimen.prise_count_text_size);
            this.mShowCircle = true;
            this.mShowDecoration = true;
            this.mCircleColor = getResources().getColor(R.color.thumbs_circle_color);
        }
        ThumbsUpView thumbsUpView = new ThumbsUpView(getContext(), this.mThumbsUpOn, this.mThumbsUpOff, this.mThumbsUpDecoration);
        this.thumbsUpView = thumbsUpView;
        thumbsUpView.setShowCircle(this.mShowCircle);
        this.thumbsUpView.setCircleColor(this.mCircleColor);
        this.thumbsUpView.setShowDecoration(this.mShowDecoration);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = (int) getResources().getDimension(R.dimen.thumbs_child_margin);
        addView(this.thumbsUpView, layoutParams);
        this.priseCountView = new PriseCountView(getContext(), this.mPriseCount, this.mTextOnColor, this.mTextOffColor, this.mTextSize);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.leftMargin = getResources().getDimensionPixelSize(R.dimen.prise_count_left_margin);
        layoutParams2.rightMargin = (int) getResources().getDimension(R.dimen.thumbs_child_margin);
        addView(this.priseCountView, layoutParams2);
    }

    public void initData(boolean z, int i) {
        this.mThumbsUp = z;
        this.mPriseCount = i;
        this.thumbsUpView.initThumbsUpOn(z);
        this.priseCountView.setCount(i, z);
    }

    public void priseChange() {
        boolean z = this.mThumbsUp;
        if (z) {
            this.mPriseCount--;
        } else {
            this.mPriseCount++;
        }
        boolean z2 = !z;
        this.mThumbsUp = z2;
        this.thumbsUpView.setThumbsUpOn(z2);
        this.priseCountView.setCount(this.mPriseCount, this.mThumbsUp);
    }

    public int getPriseCount() {
        return this.mPriseCount;
    }

    public boolean isPriseOn() {
        return this.mThumbsUp;
    }
}
