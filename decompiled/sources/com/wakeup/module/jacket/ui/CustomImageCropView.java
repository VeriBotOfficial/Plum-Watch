package com.wakeup.module.jacket.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes4.dex */
public class CustomImageCropView extends View {
    public static final int EDGE_BOTTOM = 3;
    public static final int EDGE_CENTER = 4;
    public static final int EDGE_LEFT = 0;
    public static final int EDGE_RIGHT = 2;
    public static final int EDGE_TOP = 1;
    private int activeEdge;
    private Bitmap bitmap;
    private Bitmap blurredBitmap;
    private Paint borderPaint;
    private Paint cornerPaint;
    private float cornerRadius;
    private RectF cropRect;
    private Bitmap croppedBitmap;
    private float currentScale;
    private float extendLength;
    private float initialCropHeight;
    private float initialCropWidth;
    private boolean isDragging;
    private PointF lastTouchPoint;
    private float lineLength;
    private Paint linePaint;
    private Matrix matrix;
    private float minCropHeight;
    private float minCropWidth;
    private OnTouchListener onTouchListener;
    private Paint overlayPaint;
    private float touchTolerance;

    public interface OnTouchListener {
        void onTouchEnd();

        void onTouchStart();
    }

    public CustomImageCropView(Context context) {
        super(context);
        this.extendLength = 15.0f;
        this.isDragging = false;
        this.touchTolerance = 100.0f;
        this.activeEdge = -1;
        this.currentScale = 1.0f;
        this.minCropWidth = 400.0f;
        this.minCropHeight = 400.0f;
        init();
    }

    public CustomImageCropView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.extendLength = 15.0f;
        this.isDragging = false;
        this.touchTolerance = 100.0f;
        this.activeEdge = -1;
        this.currentScale = 1.0f;
        this.minCropWidth = 400.0f;
        this.minCropHeight = 400.0f;
        init();
    }

    public CustomImageCropView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.extendLength = 15.0f;
        this.isDragging = false;
        this.touchTolerance = 100.0f;
        this.activeEdge = -1;
        this.currentScale = 1.0f;
        this.minCropWidth = 400.0f;
        this.minCropHeight = 400.0f;
        init();
    }

    private void init() {
        this.matrix = new Matrix();
        Paint paint = new Paint();
        this.borderPaint = paint;
        paint.setColor(Color.parseColor("#96000000"));
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.borderPaint.setStrokeWidth(1.0f);
        this.borderPaint.setStyle(Paint.Style.STROKE);
        this.cornerRadius = 80.0f;
        Paint paint2 = new Paint();
        this.cornerPaint = paint2;
        paint2.setColor(Color.parseColor("#F5F5F5"));
        float applyDimension = TypedValue.applyDimension(1, 3.0f, displayMetrics);
        this.cornerPaint.setStrokeWidth(applyDimension);
        this.cornerPaint.setStyle(Paint.Style.STROKE);
        this.cornerPaint.setStrokeCap(Paint.Cap.ROUND);
        this.lineLength = 100.0f;
        Paint paint3 = new Paint();
        this.linePaint = paint3;
        paint3.setColor(Color.parseColor("#F5F5F5"));
        this.linePaint.setStrokeWidth(applyDimension);
        this.linePaint.setStyle(Paint.Style.STROKE);
        this.linePaint.setStrokeWidth(2.0f);
        this.linePaint.setStrokeCap(Paint.Cap.ROUND);
        Paint paint4 = new Paint();
        this.overlayPaint = paint4;
        paint4.setColor(Color.parseColor("#96000000"));
        this.overlayPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
        this.touchTolerance = TypedValue.applyDimension(1, 50.0f, getResources().getDisplayMetrics());
    }

    public void setOnTouchListener(OnTouchListener onTouchListener) {
        this.onTouchListener = onTouchListener;
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
        if (bitmap != null) {
            this.blurredBitmap = BlurBuilder.blur(getContext(), bitmap);
        }
        requestLayout();
        invalidate();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.bitmap != null) {
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            float width = this.bitmap.getWidth();
            float height = this.bitmap.getHeight();
            float min = Math.min(size / width, size2 / height);
            setMeasuredDimension((int) (width * min), (int) (height * min));
            return;
        }
        setMeasuredDimension(getSuggestedMinimumWidth(), getSuggestedMinimumHeight());
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.bitmap != null) {
            int width = getWidth();
            int height = getHeight();
            float f = width;
            float width2 = this.bitmap.getWidth();
            float f2 = height;
            float height2 = this.bitmap.getHeight();
            float min = Math.min(f / width2, f2 / height2);
            this.currentScale = min;
            this.matrix.reset();
            this.matrix.postScale(min, min);
            float f3 = width2 * min;
            float f4 = (f - f3) / 2.0f;
            float f5 = height2 * min;
            float f6 = (f2 - f5) / 2.0f;
            this.matrix.postTranslate(f4, f6);
            canvas.drawBitmap(this.bitmap, this.matrix, null);
            float applyDimension = TypedValue.applyDimension(1, 28.0f, getResources().getDisplayMetrics());
            if (this.cropRect == null) {
                RectF rectF = new RectF(f4 + applyDimension, f6 + applyDimension, ((f + f3) / 2.0f) - applyDimension, ((f2 + f5) / 2.0f) - applyDimension);
                this.cropRect = rectF;
                this.initialCropWidth = rectF.width();
                this.initialCropHeight = this.cropRect.height();
            }
            canvas.save();
            Path path = new Path();
            path.arcTo(new RectF(this.cropRect.right - (this.cornerRadius * 2.0f), this.cropRect.top, this.cropRect.right, this.cropRect.top + (this.cornerRadius * 2.0f)), 270.0f, 90.0f);
            path.arcTo(new RectF(this.cropRect.right - (this.cornerRadius * 2.0f), this.cropRect.bottom - (this.cornerRadius * 2.0f), this.cropRect.right, this.cropRect.bottom), 0.0f, 90.0f);
            path.arcTo(new RectF(this.cropRect.left, this.cropRect.bottom - (this.cornerRadius * 2.0f), this.cropRect.left + (this.cornerRadius * 2.0f), this.cropRect.bottom), 90.0f, 90.0f);
            path.arcTo(new RectF(this.cropRect.left, this.cropRect.top, this.cropRect.left + (this.cornerRadius * 2.0f), this.cropRect.top + (this.cornerRadius * 2.0f)), 180.0f, 90.0f);
            path.close();
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawRect(f4, f6, (f + f3) / 2.0f, (f2 + f5) / 2.0f, this.overlayPaint);
            canvas.restore();
            canvas.drawPath(path, this.borderPaint);
            float f7 = this.cropRect.left;
            float f8 = this.cropRect.top;
            float f9 = this.cropRect.right;
            float f10 = this.cropRect.bottom;
            Path path2 = new Path();
            path2.moveTo(f7, this.cornerRadius + f8 + this.extendLength);
            path2.lineTo(f7, this.cornerRadius + f8);
            float f11 = this.cornerRadius;
            path2.arcTo(new RectF(f7, f8, (f11 * 2.0f) + f7, (f11 * 2.0f) + f8), 180.0f, 90.0f);
            path2.lineTo(this.cornerRadius + f7 + this.extendLength, f8);
            canvas.drawPath(path2, this.cornerPaint);
            path2.reset();
            path2.moveTo((f9 - this.cornerRadius) - this.extendLength, f8);
            path2.lineTo(f9 - this.cornerRadius, f8);
            float f12 = this.cornerRadius;
            path2.arcTo(new RectF(f9 - (f12 * 2.0f), f8, f9, (f12 * 2.0f) + f8), 270.0f, 90.0f);
            path2.lineTo(f9, this.cornerRadius + f8 + this.extendLength);
            canvas.drawPath(path2, this.cornerPaint);
            path2.reset();
            path2.moveTo(this.cornerRadius + f7 + this.extendLength, f10);
            path2.lineTo(this.cornerRadius + f7, f10);
            float f13 = this.cornerRadius;
            path2.arcTo(new RectF(f7, f10 - (f13 * 2.0f), (f13 * 2.0f) + f7, f10), 90.0f, 90.0f);
            path2.lineTo(f7, (f10 - this.cornerRadius) - this.extendLength);
            canvas.drawPath(path2, this.cornerPaint);
            path2.reset();
            path2.moveTo(f9, (f10 - this.cornerRadius) - this.extendLength);
            path2.lineTo(f9, f10 - this.cornerRadius);
            float f14 = this.cornerRadius;
            path2.arcTo(new RectF(f9 - (f14 * 2.0f), f10 - (f14 * 2.0f), f9, f10), 0.0f, 90.0f);
            path2.lineTo((f9 - this.cornerRadius) - this.extendLength, f10);
            canvas.drawPath(path2, this.cornerPaint);
            float f15 = this.cornerRadius;
            float f16 = this.extendLength;
            canvas.drawLine(f7 + f15 + f16, f8, (f9 - f15) - f16, f8, this.linePaint);
            float f17 = this.cornerRadius;
            float f18 = this.extendLength;
            canvas.drawLine(f7 + f17 + f18, f10, (f9 - f17) - f18, f10, this.linePaint);
            float f19 = this.cornerRadius;
            float f20 = this.extendLength;
            canvas.drawLine(f7, f8 + f19 + f20, f7, (f10 - f19) - f20, this.linePaint);
            float f21 = this.cornerRadius;
            float f22 = this.extendLength;
            canvas.drawLine(f9, f8 + f21 + f22, f9, (f10 - f21) - f22, this.linePaint);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.activeEdge = getActiveEdge(x, y);
            this.lastTouchPoint = new PointF(x, y);
            OnTouchListener onTouchListener = this.onTouchListener;
            if (onTouchListener != null) {
                onTouchListener.onTouchStart();
            }
            return true;
        }
        if (action == 1) {
            this.activeEdge = -1;
            getParent().requestDisallowInterceptTouchEvent(false);
            OnTouchListener onTouchListener2 = this.onTouchListener;
            if (onTouchListener2 != null) {
                onTouchListener2.onTouchEnd();
            }
            return true;
        }
        if (action == 2) {
            if (this.activeEdge != -1) {
                updateCropRect(x, y);
                invalidate();
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            OnTouchListener onTouchListener3 = this.onTouchListener;
            if (onTouchListener3 != null) {
                onTouchListener3.onTouchStart();
            }
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    private int getActiveEdge(float f, float f2) {
        RectF rectF = this.cropRect;
        if (rectF == null) {
            return -1;
        }
        float f3 = this.touchTolerance * this.currentScale;
        float abs = Math.abs(f - rectF.left);
        float abs2 = Math.abs(f2 - this.cropRect.top);
        float abs3 = Math.abs(f - this.cropRect.right);
        float min = Math.min(Math.min(abs, abs3), Math.min(abs2, Math.abs(f2 - this.cropRect.bottom)));
        if (min > f3) {
            return -1;
        }
        if (abs == min) {
            return 0;
        }
        if (abs3 == min) {
            return 2;
        }
        return abs2 == min ? 1 : 3;
    }

    private void updateCropRect(float f, float f2) {
        float f3 = f - this.lastTouchPoint.x;
        float f4 = f2 - this.lastTouchPoint.y;
        RectF rectF = new RectF((getWidth() - (this.bitmap.getWidth() * this.currentScale)) / 2.0f, (getHeight() - (this.bitmap.getHeight() * this.currentScale)) / 2.0f, (getWidth() + (this.bitmap.getWidth() * this.currentScale)) / 2.0f, (getHeight() + (this.bitmap.getHeight() * this.currentScale)) / 2.0f);
        int i = this.activeEdge;
        if (i == 0) {
            this.cropRect.left = Math.max(rectF.left, Math.min(this.cropRect.left + f3, this.cropRect.right - this.minCropWidth));
        } else if (i == 1) {
            this.cropRect.top = Math.max(rectF.top, Math.min(this.cropRect.top + f4, this.cropRect.bottom - this.minCropHeight));
        } else if (i == 2) {
            this.cropRect.right = Math.min(rectF.right, Math.max(this.cropRect.right + f3, this.cropRect.left + this.minCropWidth));
        } else if (i == 3) {
            this.cropRect.bottom = Math.min(rectF.bottom, Math.max(this.cropRect.bottom + f4, this.cropRect.top + this.minCropHeight));
        }
        this.lastTouchPoint.set(f, f2);
    }

    public Bitmap getCroppedBitmap() {
        if (this.bitmap == null || this.cropRect == null) {
            return null;
        }
        Matrix matrix = new Matrix();
        this.matrix.invert(matrix);
        matrix.mapRect(new RectF(), this.cropRect);
        int floor = (int) Math.floor(r1.left);
        int floor2 = (int) Math.floor(r1.top);
        int ceil = (int) Math.ceil(r1.right);
        int ceil2 = (int) Math.ceil(r1.bottom);
        if (floor > 0 && floor2 > 0) {
            this.croppedBitmap = Bitmap.createBitmap(this.bitmap, floor, floor2, ceil - floor, ceil2 - floor2);
        }
        return this.croppedBitmap;
    }

    public RectF getCropRect() {
        return this.cropRect;
    }
}
