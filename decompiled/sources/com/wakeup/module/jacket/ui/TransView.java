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
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransView.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u00103\u001a\u000204H\u0002J\u0010\u00105\u001a\u0002042\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0018\u00106\u001a\u0002042\u0006\u00107\u001a\u00020\u00072\u0006\u00108\u001a\u00020\u0007H\u0014J\u0010\u00109\u001a\u0002042\u0006\u0010:\u001a\u00020;H\u0014J\b\u0010<\u001a\u0004\u0018\u00010\u000bR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0014X\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\u00020\u0007X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u001eX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\u00020\u0007X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\u0014\u0010&\u001a\u00020\u0007X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001cR\u0014\u0010(\u001a\u00020\u0007X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001cR\u0014\u0010*\u001a\u00020\u0007X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001cR\u000e\u0010,\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0014X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0014X\u0082D¢\u0006\u0002\n\u0000R\u0010\u00100\u001a\u0004\u0018\u000101X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00102\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006="}, d2 = {"Lcom/wakeup/module/jacket/ui/TransView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bitmap", "Landroid/graphics/Bitmap;", "blurredBitmap", "matrix", "Landroid/graphics/Matrix;", "borderPaint", "Landroid/graphics/Paint;", "cornerPaint", "linePaint", "lineLength", "", "overlayPaint", "cornerRadius", "extendLength", "cropRect", "Landroid/graphics/RectF;", "EDGE_CENTER", "getEDGE_CENTER", "()I", "isDragging", "", "touchTolerance", "lastTouchPoint", "Landroid/graphics/PointF;", "activeEdge", "currentScale", "EDGE_LEFT", "getEDGE_LEFT", "EDGE_TOP", "getEDGE_TOP", "EDGE_RIGHT", "getEDGE_RIGHT", "EDGE_BOTTOM", "getEDGE_BOTTOM", "initialCropWidth", "initialCropHeight", "minCropWidth", "minCropHeight", "onTouchListener", "Landroid/view/View$OnTouchListener;", "croppedBitmap", "init", "", "setImageBitmap", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onDraw", "canvas", "Landroid/graphics/Canvas;", "getCroppedBitmap", "feature-jacket_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TransView extends View {
    private final int EDGE_BOTTOM;
    private final int EDGE_CENTER;
    private final int EDGE_LEFT;
    private final int EDGE_RIGHT;
    private final int EDGE_TOP;
    private int activeEdge;
    private Bitmap bitmap;
    private Bitmap blurredBitmap;
    private Paint borderPaint;
    private Paint cornerPaint;
    private float cornerRadius;
    private RectF cropRect;
    private Bitmap croppedBitmap;
    private float currentScale;
    private final float extendLength;
    private float initialCropHeight;
    private float initialCropWidth;
    private final boolean isDragging;
    private PointF lastTouchPoint;
    private float lineLength;
    private Paint linePaint;
    private Matrix matrix;
    private final float minCropHeight;
    private final float minCropWidth;
    private View.OnTouchListener onTouchListener;
    private Paint overlayPaint;
    private float touchTolerance;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TransView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TransView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ TransView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.extendLength = 15.0f;
        this.EDGE_CENTER = 4;
        this.touchTolerance = 100.0f;
        this.activeEdge = -1;
        this.currentScale = 1.0f;
        this.EDGE_TOP = 1;
        this.EDGE_RIGHT = 2;
        this.EDGE_BOTTOM = 3;
        this.minCropWidth = 400.0f;
        this.minCropHeight = 400.0f;
        init();
    }

    public final int getEDGE_CENTER() {
        return this.EDGE_CENTER;
    }

    public final int getEDGE_LEFT() {
        return this.EDGE_LEFT;
    }

    public final int getEDGE_TOP() {
        return this.EDGE_TOP;
    }

    public final int getEDGE_RIGHT() {
        return this.EDGE_RIGHT;
    }

    public final int getEDGE_BOTTOM() {
        return this.EDGE_BOTTOM;
    }

    private final void init() {
        this.matrix = new Matrix();
        Paint paint = new Paint();
        this.borderPaint = paint;
        Intrinsics.checkNotNull(paint);
        paint.setColor(Color.parseColor("#96000000"));
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        Paint paint2 = this.borderPaint;
        Intrinsics.checkNotNull(paint2);
        paint2.setStrokeWidth(1.0f);
        Paint paint3 = this.borderPaint;
        Intrinsics.checkNotNull(paint3);
        paint3.setStyle(Paint.Style.STROKE);
        this.cornerRadius = 90.0f;
        Paint paint4 = new Paint();
        this.cornerPaint = paint4;
        Intrinsics.checkNotNull(paint4);
        paint4.setColor(Color.parseColor("#F5F5F5"));
        float applyDimension = TypedValue.applyDimension(1, 3.0f, displayMetrics);
        Paint paint5 = this.cornerPaint;
        Intrinsics.checkNotNull(paint5);
        paint5.setStrokeWidth(applyDimension);
        Paint paint6 = this.cornerPaint;
        Intrinsics.checkNotNull(paint6);
        paint6.setStyle(Paint.Style.STROKE);
        Paint paint7 = this.cornerPaint;
        Intrinsics.checkNotNull(paint7);
        paint7.setStrokeCap(Paint.Cap.ROUND);
        this.lineLength = 150.0f;
        Paint paint8 = new Paint();
        this.linePaint = paint8;
        Intrinsics.checkNotNull(paint8);
        paint8.setColor(Color.parseColor("#F5F5F5"));
        Paint paint9 = this.linePaint;
        Intrinsics.checkNotNull(paint9);
        paint9.setStrokeWidth(applyDimension);
        Paint paint10 = this.linePaint;
        Intrinsics.checkNotNull(paint10);
        paint10.setStyle(Paint.Style.STROKE);
        Paint paint11 = this.linePaint;
        Intrinsics.checkNotNull(paint11);
        paint11.setStrokeWidth(2.0f);
        Paint paint12 = this.linePaint;
        Intrinsics.checkNotNull(paint12);
        paint12.setStrokeCap(Paint.Cap.ROUND);
        Paint paint13 = new Paint();
        this.overlayPaint = paint13;
        Intrinsics.checkNotNull(paint13);
        paint13.setColor(Color.parseColor("#96000000"));
        Paint paint14 = this.overlayPaint;
        Intrinsics.checkNotNull(paint14);
        paint14.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
        this.touchTolerance = TypedValue.applyDimension(1, 50.0f, getResources().getDisplayMetrics());
    }

    public final void setImageBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
        if (bitmap != null) {
            this.blurredBitmap = BlurBuilder.blur(getContext(), bitmap);
        }
        requestLayout();
        invalidate();
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (this.bitmap != null) {
            int size = View.MeasureSpec.getSize(widthMeasureSpec);
            int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
            Bitmap bitmap = this.bitmap;
            Intrinsics.checkNotNull(bitmap);
            int width = bitmap.getWidth();
            Bitmap bitmap2 = this.bitmap;
            Intrinsics.checkNotNull(bitmap2);
            float f = width;
            float height = bitmap2.getHeight();
            float min = Math.min(size / f, size2 / height);
            setMeasuredDimension((int) (f * min), (int) (height * min));
            return;
        }
        setMeasuredDimension(getSuggestedMinimumWidth(), getSuggestedMinimumHeight());
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (this.bitmap != null) {
            int width = getWidth();
            int height = getHeight();
            Bitmap bitmap = this.bitmap;
            Intrinsics.checkNotNull(bitmap);
            int width2 = bitmap.getWidth();
            Bitmap bitmap2 = this.bitmap;
            Intrinsics.checkNotNull(bitmap2);
            float f = width;
            float f2 = width2;
            float f3 = height;
            float height2 = bitmap2.getHeight();
            float min = Math.min(f / f2, f3 / height2);
            this.currentScale = min;
            Matrix matrix = this.matrix;
            Intrinsics.checkNotNull(matrix);
            matrix.reset();
            Matrix matrix2 = this.matrix;
            Intrinsics.checkNotNull(matrix2);
            matrix2.postScale(min, min);
            Matrix matrix3 = this.matrix;
            Intrinsics.checkNotNull(matrix3);
            float f4 = f2 * min;
            float f5 = 2;
            float f6 = (f - f4) / f5;
            float f7 = height2 * min;
            float f8 = (f3 - f7) / f5;
            matrix3.postTranslate(f6, f8);
            Bitmap bitmap3 = this.bitmap;
            Intrinsics.checkNotNull(bitmap3);
            Matrix matrix4 = this.matrix;
            Intrinsics.checkNotNull(matrix4);
            canvas.drawBitmap(bitmap3, matrix4, null);
            float applyDimension = TypedValue.applyDimension(1, 28.0f, getResources().getDisplayMetrics());
            if (this.cropRect == null) {
                RectF rectF = new RectF(f6 + applyDimension, f8 + applyDimension, ((f + f4) / f5) - applyDimension, ((f3 + f7) / f5) - applyDimension);
                this.cropRect = rectF;
                Intrinsics.checkNotNull(rectF);
                this.initialCropWidth = rectF.width();
                RectF rectF2 = this.cropRect;
                Intrinsics.checkNotNull(rectF2);
                this.initialCropHeight = rectF2.height();
            }
            canvas.save();
            Path path = new Path();
            RectF rectF3 = this.cropRect;
            Intrinsics.checkNotNull(rectF3);
            float f9 = rectF3.right - (this.cornerRadius * f5);
            RectF rectF4 = this.cropRect;
            Intrinsics.checkNotNull(rectF4);
            float f10 = rectF4.top;
            RectF rectF5 = this.cropRect;
            Intrinsics.checkNotNull(rectF5);
            float f11 = rectF5.right;
            RectF rectF6 = this.cropRect;
            Intrinsics.checkNotNull(rectF6);
            path.arcTo(new RectF(f9, f10, f11, rectF6.top + (this.cornerRadius * f5)), 270.0f, 90.0f);
            RectF rectF7 = this.cropRect;
            Intrinsics.checkNotNull(rectF7);
            float f12 = rectF7.right - (this.cornerRadius * f5);
            RectF rectF8 = this.cropRect;
            Intrinsics.checkNotNull(rectF8);
            float f13 = rectF8.bottom - (this.cornerRadius * f5);
            RectF rectF9 = this.cropRect;
            Intrinsics.checkNotNull(rectF9);
            float f14 = rectF9.right;
            RectF rectF10 = this.cropRect;
            Intrinsics.checkNotNull(rectF10);
            path.arcTo(new RectF(f12, f13, f14, rectF10.bottom), 0.0f, 90.0f);
            RectF rectF11 = this.cropRect;
            Intrinsics.checkNotNull(rectF11);
            float f15 = rectF11.left;
            RectF rectF12 = this.cropRect;
            Intrinsics.checkNotNull(rectF12);
            float f16 = rectF12.bottom - (this.cornerRadius * f5);
            RectF rectF13 = this.cropRect;
            Intrinsics.checkNotNull(rectF13);
            float f17 = rectF13.left + (this.cornerRadius * f5);
            RectF rectF14 = this.cropRect;
            Intrinsics.checkNotNull(rectF14);
            path.arcTo(new RectF(f15, f16, f17, rectF14.bottom), 90.0f, 90.0f);
            RectF rectF15 = this.cropRect;
            Intrinsics.checkNotNull(rectF15);
            float f18 = rectF15.left;
            RectF rectF16 = this.cropRect;
            Intrinsics.checkNotNull(rectF16);
            float f19 = rectF16.top;
            RectF rectF17 = this.cropRect;
            Intrinsics.checkNotNull(rectF17);
            float f20 = rectF17.left + (this.cornerRadius * f5);
            RectF rectF18 = this.cropRect;
            Intrinsics.checkNotNull(rectF18);
            path.arcTo(new RectF(f18, f19, f20, rectF18.top + (this.cornerRadius * f5)), 180.0f, 90.0f);
            path.close();
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            Paint paint = this.overlayPaint;
            Intrinsics.checkNotNull(paint);
            canvas.drawRect(f6, f8, (f + f4) / f5, (f3 + f7) / f5, paint);
            canvas.restore();
            Paint paint2 = this.borderPaint;
            Intrinsics.checkNotNull(paint2);
            canvas.drawPath(path, paint2);
            RectF rectF19 = this.cropRect;
            Intrinsics.checkNotNull(rectF19);
            float f21 = rectF19.left;
            RectF rectF20 = this.cropRect;
            Intrinsics.checkNotNull(rectF20);
            float f22 = rectF20.top;
            RectF rectF21 = this.cropRect;
            Intrinsics.checkNotNull(rectF21);
            float f23 = rectF21.right;
            RectF rectF22 = this.cropRect;
            Intrinsics.checkNotNull(rectF22);
            float f24 = rectF22.bottom;
            Path path2 = new Path();
            path2.moveTo(f21, this.cornerRadius + f22 + this.extendLength);
            path2.lineTo(f21, this.cornerRadius + f22);
            float f25 = this.cornerRadius;
            path2.arcTo(new RectF(f21, f22, (f5 * f25) + f21, (f25 * f5) + f22), 180.0f, 90.0f);
            path2.lineTo(this.cornerRadius + f21 + this.extendLength, f22);
            Paint paint3 = this.cornerPaint;
            Intrinsics.checkNotNull(paint3);
            canvas.drawPath(path2, paint3);
            path2.reset();
            path2.moveTo((f23 - this.cornerRadius) - this.extendLength, f22);
            path2.lineTo(f23 - this.cornerRadius, f22);
            float f26 = this.cornerRadius;
            path2.arcTo(new RectF(f23 - (f5 * f26), f22, f23, (f26 * f5) + f22), 270.0f, 90.0f);
            path2.lineTo(f23, this.cornerRadius + f22 + this.extendLength);
            Paint paint4 = this.cornerPaint;
            Intrinsics.checkNotNull(paint4);
            canvas.drawPath(path2, paint4);
            path2.reset();
            path2.moveTo(this.cornerRadius + f21 + this.extendLength, f24);
            path2.lineTo(this.cornerRadius + f21, f24);
            float f27 = this.cornerRadius;
            path2.arcTo(new RectF(f21, f24 - (f5 * f27), (f27 * f5) + f21, f24), 90.0f, 90.0f);
            path2.lineTo(f21, (f24 - this.cornerRadius) - this.extendLength);
            Paint paint5 = this.cornerPaint;
            Intrinsics.checkNotNull(paint5);
            canvas.drawPath(path2, paint5);
            path2.reset();
            path2.moveTo(f23, (f24 - this.cornerRadius) - this.extendLength);
            path2.lineTo(f23, f24 - this.cornerRadius);
            float f28 = this.cornerRadius;
            path2.arcTo(new RectF(f23 - (f5 * f28), f24 - (f5 * f28), f23, f24), 0.0f, 90.0f);
            path2.lineTo((f23 - this.cornerRadius) - this.extendLength, f24);
            Paint paint6 = this.cornerPaint;
            Intrinsics.checkNotNull(paint6);
            canvas.drawPath(path2, paint6);
            float f29 = this.cornerRadius;
            float f30 = this.extendLength;
            Paint paint7 = this.linePaint;
            Intrinsics.checkNotNull(paint7);
            canvas.drawLine(f21 + f29 + f30, f22, (f23 - f29) - f30, f22, paint7);
            float f31 = this.cornerRadius;
            float f32 = this.extendLength;
            Paint paint8 = this.linePaint;
            Intrinsics.checkNotNull(paint8);
            canvas.drawLine(f21 + f31 + f32, f24, (f23 - f31) - f32, f24, paint8);
            float f33 = this.cornerRadius;
            float f34 = this.extendLength;
            Paint paint9 = this.linePaint;
            Intrinsics.checkNotNull(paint9);
            canvas.drawLine(f21, f22 + f33 + f34, f21, (f24 - f33) - f34, paint9);
            float f35 = this.cornerRadius;
            float f36 = this.extendLength;
            Paint paint10 = this.linePaint;
            Intrinsics.checkNotNull(paint10);
            canvas.drawLine(f23, f22 + f35 + f36, f23, (f24 - f35) - f36, paint10);
        }
    }

    public final Bitmap getCroppedBitmap() {
        if (this.bitmap == null || this.cropRect == null) {
            return null;
        }
        Matrix matrix = new Matrix();
        Matrix matrix2 = this.matrix;
        Intrinsics.checkNotNull(matrix2);
        matrix2.invert(matrix);
        matrix.mapRect(new RectF(), this.cropRect);
        int floor = (int) Math.floor(r1.left);
        int floor2 = (int) Math.floor(r1.top);
        int ceil = (int) Math.ceil(r1.right);
        int ceil2 = (int) Math.ceil(r1.bottom);
        if (floor > 0 && floor2 > 0) {
            Bitmap bitmap = this.bitmap;
            Intrinsics.checkNotNull(bitmap);
            this.croppedBitmap = Bitmap.createBitmap(bitmap, floor, floor2, ceil - floor, ceil2 - floor2);
        }
        return this.croppedBitmap;
    }
}
