package com.wakeup.commonui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.wakeup.commonui.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class DiffuseView extends View {
    private final List<Integer> mAlphas;
    private Bitmap mBitmap;
    private int mColor;
    private int mCoreColor;
    private int mCoreRadius;
    private int mDiffuseWidth;
    private boolean mIsDiffuse;
    private Integer mMaxWidth;
    private Paint mPaint;
    private final List<Integer> mWidths;

    public DiffuseView(Context context) {
        this(context, null);
    }

    public DiffuseView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public DiffuseView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mAlphas = new ArrayList();
        this.mWidths = new ArrayList();
        this.mColor = getResources().getColor(R.color.colorAccent);
        this.mCoreColor = getResources().getColor(R.color.colorPrimary);
        this.mCoreRadius = 150;
        this.mDiffuseWidth = 3;
        this.mMaxWidth = 313;
        this.mIsDiffuse = false;
        init();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.DiffuseView, i, 0);
        this.mColor = obtainStyledAttributes.getColor(R.styleable.DiffuseView_diffuse_color, this.mColor);
        this.mCoreColor = obtainStyledAttributes.getColor(R.styleable.DiffuseView_diffuse_coreColor, this.mCoreColor);
        this.mCoreRadius = obtainStyledAttributes.getInt(R.styleable.DiffuseView_diffuse_coreRadius, this.mCoreRadius);
        this.mDiffuseWidth = obtainStyledAttributes.getInt(R.styleable.DiffuseView_diffuse_width, this.mDiffuseWidth);
        this.mMaxWidth = Integer.valueOf(obtainStyledAttributes.getInt(R.styleable.DiffuseView_diffuse_maxWidth, this.mMaxWidth.intValue()));
        int resourceId = obtainStyledAttributes.getResourceId(R.styleable.DiffuseView_diffuse_coreImage, -1);
        if (resourceId != -1) {
            this.mBitmap = BitmapFactory.decodeResource(getResources(), resourceId);
        }
        obtainStyledAttributes.recycle();
    }

    private void init() {
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setAntiAlias(true);
        this.mAlphas.add(255);
        this.mWidths.add(0);
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.mPaint.setColor(this.mColor);
        for (int i = 0; i < this.mAlphas.size(); i++) {
            Integer num = this.mAlphas.get(i);
            this.mPaint.setAlpha(num.intValue());
            Integer num2 = this.mWidths.get(i);
            canvas.drawCircle(getWidth() / 2, getHeight() / 2, this.mCoreRadius + num2.intValue(), this.mPaint);
            if (num.intValue() > 0 && num2.intValue() < this.mMaxWidth.intValue()) {
                this.mAlphas.set(i, Integer.valueOf(num.intValue() - 1));
                this.mWidths.set(i, Integer.valueOf(num2.intValue() + 1));
            }
        }
        if (this.mWidths.get(r1.size() - 1).intValue() == this.mMaxWidth.intValue() / this.mDiffuseWidth) {
            this.mAlphas.add(255);
            this.mWidths.add(0);
        }
        if (this.mWidths.size() >= 10) {
            this.mWidths.remove(0);
            this.mAlphas.remove(0);
        }
        this.mPaint.setAlpha(255);
        this.mPaint.setColor(this.mCoreColor);
        canvas.drawCircle(getWidth() / 2, getHeight() / 2, this.mCoreRadius, this.mPaint);
        Bitmap bitmap = this.mBitmap;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, (getWidth() / 2) - (this.mBitmap.getWidth() / 2), (getHeight() / 2) - (this.mBitmap.getHeight() / 2), this.mPaint);
        }
        if (this.mIsDiffuse) {
            invalidate();
        }
    }

    public void start() {
        this.mIsDiffuse = true;
        invalidate();
    }

    public void stop() {
        this.mIsDiffuse = false;
    }

    public boolean isDiffuse() {
        return this.mIsDiffuse;
    }

    public void setColor(int i) {
        this.mColor = i;
    }

    public void setCoreColor(int i) {
        this.mCoreColor = i;
    }

    public void setCoreImage(int i) {
        this.mBitmap = BitmapFactory.decodeResource(getResources(), i);
    }

    public void setCoreRadius(int i) {
        this.mCoreRadius = i;
    }

    public void setDiffuseWidth(int i) {
        this.mDiffuseWidth = i;
    }

    public void setMaxWidth(int i) {
        this.mMaxWidth = Integer.valueOf(i);
    }
}
