package com.wakeup.commonui.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.wakeup.commonui.R;
import com.wakeup.commonui.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SportStopView.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u00011B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ(\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u0007H\u0014J\u0010\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020&H\u0014J\u0010\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0016J \u0010+\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020\u00122\u0006\u0010.\u001a\u00020\u0012H\u0002J\u000e\u0010/\u001a\u00020\u001f2\u0006\u00100\u001a\u00020\u001aR\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0015\u001a\n \u0017*\u0004\u0018\u00010\u00160\u0016X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0018R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/wakeup/commonui/view/SportStopView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "style", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mProgress", "mWidth", "mHeight", "mPaint", "Landroid/graphics/Paint;", "bgColor", "progressColor", "dp2", "", "dp24", "dp30", "mAnim", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "Landroid/animation/ValueAnimator;", "mCallback", "Lcom/wakeup/commonui/view/SportStopView$FinishCallback;", "bgBtm", "Landroid/graphics/Bitmap;", "progressBtm", "onSizeChanged", "", "w", "h", "oldw", "oldh", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onTouchEvent", "", "event", "Landroid/view/MotionEvent;", "zoomBitmap", "bitmap", "newWidth", "newHeight", "setCallback", "callback", "FinishCallback", "commonui_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SportStopView extends View {
    private final Bitmap bgBtm;
    private final int bgColor;
    private final float dp2;
    private final float dp24;
    private final float dp30;
    private final ValueAnimator mAnim;
    private FinishCallback mCallback;
    private int mHeight;
    private final Paint mPaint;
    private int mProgress;
    private int mWidth;
    private final Bitmap progressBtm;
    private final int progressColor;

    /* compiled from: SportStopView.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/wakeup/commonui/view/SportStopView$FinishCallback;", "", "onFinish", "", "commonui_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface FinishCallback {
        void onFinish();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SportStopView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SportStopView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SportStopView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? -1 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportStopView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint(1);
        this.mPaint = paint;
        this.bgColor = Color.parseColor("#CECECE");
        this.progressColor = Color.parseColor("#4C4752");
        this.dp2 = UIHelper.dp2px(2.0f);
        this.dp24 = UIHelper.dp2px(29.0f);
        this.dp30 = UIHelper.dp2px(35.0f);
        ValueAnimator ofInt = ValueAnimator.ofInt(100);
        ofInt.setDuration(600L);
        this.mAnim = ofInt;
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.wakeup.commonui.view.SportStopView$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SportStopView._init_$lambda$1(SportStopView.this, valueAnimator);
            }
        });
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(UIHelper.dp2px(2.0f));
        Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), R.drawable.btn_sport_finish);
        Intrinsics.checkNotNull(decodeResource);
        this.bgBtm = zoomBitmap(decodeResource, UIHelper.dp2px(70.0f), UIHelper.dp2px(70.0f));
        this.progressBtm = zoomBitmap(decodeResource, UIHelper.dp2px(58.0f), UIHelper.dp2px(58.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(SportStopView sportStopView, ValueAnimator it) {
        FinishCallback finishCallback;
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        sportStopView.mProgress = ((Integer) animatedValue).intValue();
        sportStopView.invalidate();
        if (sportStopView.mProgress != 100 || (finishCallback = sportStopView.mCallback) == null) {
            return;
        }
        finishCallback.onFinish();
    }

    @Override // android.view.View
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.mWidth = w;
        this.mHeight = h;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (this.mAnim.isRunning()) {
            this.mPaint.setColor(this.bgColor);
            float f = this.dp2;
            canvas.drawArc(f, f, this.mWidth - f, this.mHeight - f, -90.0f, 360.0f, false, this.mPaint);
            this.mPaint.setColor(this.progressColor);
            float f2 = this.dp2;
            canvas.drawArc(f2, f2, this.mWidth - f2, this.mHeight - f2, -90.0f, (this.mProgress / 100.0f) * 360.0f, false, this.mPaint);
            Bitmap bitmap = this.progressBtm;
            int i = this.mWidth;
            float f3 = this.dp24;
            canvas.drawBitmap(bitmap, (i / 2) - f3, (i / 2) - f3, this.mPaint);
            return;
        }
        Bitmap bitmap2 = this.bgBtm;
        int i2 = this.mWidth;
        float f4 = this.dp30;
        canvas.drawBitmap(bitmap2, (i2 / 2) - f4, (i2 / 2) - f4, this.mPaint);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int action = event.getAction();
        if (action == 0) {
            this.mAnim.start();
        } else if (action == 1 || action == 3) {
            this.mAnim.cancel();
            this.mProgress = 0;
            invalidate();
        }
        return true;
    }

    private final Bitmap zoomBitmap(Bitmap bitmap, float newWidth, float newHeight) {
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(newWidth / width, newHeight / height);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, (int) width, (int) height, matrix, true);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        return createBitmap;
    }

    public final void setCallback(FinishCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.mCallback = callback;
    }
}
