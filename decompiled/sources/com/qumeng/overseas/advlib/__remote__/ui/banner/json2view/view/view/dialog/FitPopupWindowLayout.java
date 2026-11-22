package com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.view.dialog;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.s;
import com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.utils.g;

/* loaded from: classes17.dex */
public class FitPopupWindowLayout extends RelativeLayout {
    public static final int DISLIKE_RADIUS = 10;
    public static final int DOWN = 4;
    public static final int LEFT = 3;
    public static final int RIGHT = 2;
    public static final int SHARP_HEIGHT = 8;
    public static final int SHARP_WIDTH = 20;
    public static final int UP = 1;
    private int mHorizontal;
    private Paint mPaint;
    private Path mPath;
    private float mRadius;
    private RectF mRectF;
    public int mSharpHeight;
    private Path mSharpPath;
    public int mSharpWidth;
    private int mVertical;
    private int mXoffset;

    public FitPopupWindowLayout(Context context) {
        this(context, null);
    }

    private Path makeSharpPath() {
        this.mSharpPath.moveTo(this.mXoffset, getMeasuredHeight());
        this.mSharpPath.quadTo(this.mXoffset + ((this.mSharpWidth * 3) / 5), getMeasuredHeight() - this.mSharpHeight, this.mSharpWidth + this.mXoffset, getMeasuredHeight() - this.mSharpHeight);
        this.mSharpPath.lineTo(this.mXoffset - (this.mSharpHeight / 3), getMeasuredHeight() - this.mSharpHeight);
        this.mSharpPath.quadTo(this.mXoffset + (this.mSharpHeight / 2), getMeasuredHeight() - this.mSharpHeight, this.mXoffset, getMeasuredHeight());
        return this.mSharpPath;
    }

    private void scaleChild(float f, float f2) {
        for (int i = 0; i < getChildCount(); i++) {
            getChildAt(i).setScaleX(f);
            getChildAt(i).setScaleY(f2);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        Path path = new Path();
        RectF rectF = new RectF(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - this.mSharpHeight);
        float f = this.mRadius;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        this.mPath.reset();
        this.mRectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - this.mSharpHeight);
        Path path = this.mPath;
        RectF rectF = this.mRectF;
        float f = this.mRadius;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        this.mPath.addPath(makeSharpPath());
        canvas.drawPath(this.mPath, this.mPaint);
        int i = this.mHorizontal;
        if (i == 3 && this.mVertical == 1) {
            setScaleX(1.0f);
            setScaleY(1.0f);
            return;
        }
        if (i == 3 && this.mVertical == 4) {
            setScaleX(1.0f);
            setScaleY(-1.0f);
            scaleChild(1.0f, -1.0f);
        } else if (i == 2 && this.mVertical == 1) {
            setScaleX(-1.0f);
            setScaleY(1.0f);
            scaleChild(-1.0f, 1.0f);
        } else if (i == 2 && this.mVertical == 4) {
            setScaleX(-1.0f);
            setScaleY(-1.0f);
            scaleChild(-1.0f, -1.0f);
        }
    }

    public void setOrientation(int i, int i2, int i3) {
        this.mHorizontal = i;
        this.mVertical = i2;
        this.mXoffset = (int) (i3 + ((s.c(getContext()) - g.a(getContext(), 330.0f)) / 2.0f));
        invalidate();
    }

    public FitPopupWindowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FitPopupWindowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mHorizontal = 3;
        this.mVertical = 4;
        this.mPath = new Path();
        this.mSharpPath = new Path();
        this.mRectF = new RectF();
        this.mXoffset = 20;
        this.mRadius = s.a(getContext(), 10.0f);
        this.mSharpWidth = (int) g.a(getContext(), 20.0f);
        this.mSharpHeight = (int) g.a(getContext(), 8.0f);
        setBackgroundColor(0);
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setColor(-1);
        this.mPaint.setStyle(Paint.Style.FILL);
        this.mPaint.setAntiAlias(true);
    }
}
