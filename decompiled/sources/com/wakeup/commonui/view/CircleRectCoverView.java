package com.wakeup.commonui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.View;
import com.blankj.utilcode.util.ScreenUtils;
import com.blankj.utilcode.util.SizeUtils;
import com.wakeup.commonui.R;

/* loaded from: classes2.dex */
public class CircleRectCoverView extends View {
    private Paint borderPaint;
    private Paint borderPaint2;
    private int mBackgroundColor;
    private Paint mEraser;
    private Bitmap mEraserBitmap;
    private Canvas mEraserCanvas;
    private float mRadius;
    private float mRx;
    private float mRy;
    private float mStrokeWidth;

    public CircleRectCoverView(Context context) {
        super(context);
        this.mStrokeWidth = 8.0f;
        this.borderPaint = new Paint();
        this.borderPaint2 = new Paint();
    }

    public CircleRectCoverView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mStrokeWidth = 8.0f;
        this.borderPaint = new Paint();
        this.borderPaint2 = new Paint();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CircleRectCoverView);
        this.mBackgroundColor = obtainStyledAttributes.getColor(R.styleable.CircleRectCoverView_background_color, -1);
        this.mRadius = obtainStyledAttributes.getDimensionPixelSize(R.styleable.CircleRectCoverView_hole_radius, 60);
        this.mRx = obtainStyledAttributes.getDimensionPixelSize(R.styleable.CircleRectCoverView_radius_x, 0);
        this.mRy = obtainStyledAttributes.getDimensionPixelSize(R.styleable.CircleRectCoverView_radius_y, 0);
        this.mStrokeWidth = obtainStyledAttributes.getDimensionPixelSize(R.styleable.CircleRectCoverView_stroke_width, 3);
        init(null, 0);
        obtainStyledAttributes.recycle();
    }

    public CircleRectCoverView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mStrokeWidth = 8.0f;
        this.borderPaint = new Paint();
        this.borderPaint2 = new Paint();
    }

    public CircleRectCoverView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mStrokeWidth = 8.0f;
        this.borderPaint = new Paint();
        this.borderPaint2 = new Paint();
    }

    public CircleRectCoverView(Context context, int i, int i2, int i3, int i4) {
        this(context);
        this.mBackgroundColor = i;
        this.mRadius = i2;
        this.mRx = i3;
        this.mRy = i4;
        init(null, 0);
    }

    private void init(AttributeSet attributeSet, int i) {
        setWillNotDraw(false);
        Point point = new Point();
        point.x = ScreenUtils.getScreenWidth();
        point.y = ScreenUtils.getScreenHeight();
        float f = this.mRx;
        if (f == 0.0f) {
            f = point.x / 2;
        }
        this.mRx = f;
        float f2 = this.mRy;
        if (f2 == 0.0f) {
            f2 = point.y / 2;
        }
        this.mRy = f2;
        float f3 = this.mRadius;
        if (f3 == 0.0f) {
            f3 = 150.0f;
        }
        this.mRadius = f3;
        int i2 = this.mBackgroundColor;
        if (i2 == -1) {
            i2 = Color.parseColor("#55000000");
        }
        this.mBackgroundColor = i2;
        this.mEraserBitmap = Bitmap.createBitmap(point.x, point.y, Bitmap.Config.ARGB_8888);
        this.mEraserCanvas = new Canvas(this.mEraserBitmap);
        Paint paint = new Paint();
        this.mEraser = paint;
        paint.setColor(-1);
        this.mEraser.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.mEraser.setFlags(1);
        this.borderPaint.setStyle(Paint.Style.STROKE);
        this.borderPaint.setColor(Color.parseColor("#FF8DA1B3"));
        this.borderPaint.setStrokeWidth(this.mStrokeWidth);
        this.borderPaint.setAntiAlias(true);
        this.borderPaint2.setStyle(Paint.Style.STROKE);
        this.borderPaint2.setColor(0);
        this.borderPaint2.setAlpha(120);
        this.borderPaint2.setStrokeWidth(SizeUtils.dp2px(15.0f));
        this.borderPaint2.setAntiAlias(true);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.mEraserBitmap.eraseColor(0);
        this.mEraserCanvas.drawColor(this.mBackgroundColor);
        this.mEraserCanvas.drawCircle(this.mRx, this.mRy, this.mRadius, this.mEraser);
        canvas.drawBitmap(this.mEraserBitmap, 0.0f, 0.0f, (Paint) null);
        canvas.drawCircle(this.mRx, this.mRy, this.mRadius, this.borderPaint);
        canvas.drawCircle(this.mRx, this.mRy, this.mRadius - this.mStrokeWidth, this.borderPaint2);
    }
}
