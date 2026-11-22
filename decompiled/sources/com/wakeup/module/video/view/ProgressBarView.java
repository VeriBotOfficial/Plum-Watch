package com.wakeup.module.video.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.applovin.sdk.AppLovinMediationProvider;
import com.wakeup.module.video.R;
import com.wakeup.module.video.interfaces.OnProgressVideoListener;
import com.wakeup.module.video.interfaces.OnRangeSeekBarListener;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProgressBarView.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B#\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0014J\u0010\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001bH\u0014J\u0010\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J \u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020#H\u0016J \u0010$\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020#H\u0016J \u0010%\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020#H\u0016J \u0010&\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020#H\u0016J\u0018\u0010'\u001a\u00020\u00152\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020#H\u0002J \u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020#2\u0006\u0010*\u001a\u00020#2\u0006\u0010+\u001a\u00020#H\u0016R\u000e\u0010\f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/wakeup/module/video/view/ProgressBarView;", "Landroid/view/View;", "Lcom/wakeup/module/video/interfaces/OnRangeSeekBarListener;", "Lcom/wakeup/module/video/interfaces/OnProgressVideoListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mProgressHeight", "mViewWidth", "mBackgroundColor", "Landroid/graphics/Paint;", "mProgressColor", "mBackgroundRect", "Landroid/graphics/Rect;", "mProgressRect", "init", "", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onDraw", "canvas", "Landroid/graphics/Canvas;", "drawLineBackground", "drawLineProgress", "onCreate", "rangeSeekBarView", "Lcom/wakeup/module/video/view/RangeSeekBarView;", "index", "value", "", "onSeek", "onSeekStart", "onSeekStop", "updateBackgroundRect", "updateProgress", "time", AppLovinMediationProvider.MAX, "scale", "module-video_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProgressBarView extends View implements OnRangeSeekBarListener, OnProgressVideoListener {
    private final Paint mBackgroundColor;
    private Rect mBackgroundRect;
    private final Paint mProgressColor;
    private int mProgressHeight;
    private Rect mProgressRect;
    private int mViewWidth;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProgressBarView(Context context, AttributeSet attrs) {
        this(context, attrs, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressBarView(Context context, AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.mBackgroundColor = new Paint();
        this.mProgressColor = new Paint();
        init();
    }

    public /* synthetic */ ProgressBarView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void init() {
        int color = getContext().getColor(R.color.progress_color);
        int color2 = getContext().getColor(R.color.background_progress_color);
        this.mProgressHeight = getContext().getResources().getDimensionPixelOffset(R.dimen.progress_video_line_height);
        this.mBackgroundColor.setAntiAlias(true);
        this.mBackgroundColor.setColor(color2);
        this.mProgressColor.setAntiAlias(true);
        this.mProgressColor.setColor(color);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        this.mViewWidth = View.resolveSizeAndState(getPaddingLeft() + getPaddingRight() + getSuggestedMinimumWidth(), widthMeasureSpec, 1);
        setMeasuredDimension(this.mViewWidth, View.resolveSizeAndState(getPaddingBottom() + getPaddingTop() + this.mProgressHeight, heightMeasureSpec, 1));
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        drawLineBackground(canvas);
        drawLineProgress(canvas);
    }

    private final void drawLineBackground(Canvas canvas) {
        Rect rect = this.mBackgroundRect;
        if (rect != null) {
            Intrinsics.checkNotNull(rect);
            canvas.drawRect(rect, this.mBackgroundColor);
        }
    }

    private final void drawLineProgress(Canvas canvas) {
        Rect rect = this.mProgressRect;
        if (rect != null) {
            Intrinsics.checkNotNull(rect);
            canvas.drawRect(rect, this.mProgressColor);
        }
    }

    @Override // com.wakeup.module.video.interfaces.OnRangeSeekBarListener
    public void onCreate(RangeSeekBarView rangeSeekBarView, int index, float value) {
        Intrinsics.checkNotNullParameter(rangeSeekBarView, "rangeSeekBarView");
        updateBackgroundRect(index, value);
    }

    @Override // com.wakeup.module.video.interfaces.OnRangeSeekBarListener
    public void onSeek(RangeSeekBarView rangeSeekBarView, int index, float value) {
        Intrinsics.checkNotNullParameter(rangeSeekBarView, "rangeSeekBarView");
        updateBackgroundRect(index, value);
    }

    @Override // com.wakeup.module.video.interfaces.OnRangeSeekBarListener
    public void onSeekStart(RangeSeekBarView rangeSeekBarView, int index, float value) {
        Intrinsics.checkNotNullParameter(rangeSeekBarView, "rangeSeekBarView");
        updateBackgroundRect(index, value);
    }

    @Override // com.wakeup.module.video.interfaces.OnRangeSeekBarListener
    public void onSeekStop(RangeSeekBarView rangeSeekBarView, int index, float value) {
        Intrinsics.checkNotNullParameter(rangeSeekBarView, "rangeSeekBarView");
        updateBackgroundRect(index, value);
    }

    private final void updateBackgroundRect(int index, float value) {
        Rect rect;
        if (this.mBackgroundRect == null) {
            this.mBackgroundRect = new Rect(0, 0, this.mViewWidth, this.mProgressHeight);
        }
        int i = (int) ((this.mViewWidth * value) / 100);
        if (index == 0) {
            Rect rect2 = this.mBackgroundRect;
            Intrinsics.checkNotNull(rect2);
            int i2 = rect2.top;
            Rect rect3 = this.mBackgroundRect;
            Intrinsics.checkNotNull(rect3);
            int i3 = rect3.right;
            Rect rect4 = this.mBackgroundRect;
            Intrinsics.checkNotNull(rect4);
            rect = new Rect(i, i2, i3, rect4.bottom);
        } else {
            Rect rect5 = this.mBackgroundRect;
            Intrinsics.checkNotNull(rect5);
            int i4 = rect5.left;
            Rect rect6 = this.mBackgroundRect;
            Intrinsics.checkNotNull(rect6);
            int i5 = rect6.top;
            Rect rect7 = this.mBackgroundRect;
            Intrinsics.checkNotNull(rect7);
            rect = new Rect(i4, i5, i, rect7.bottom);
        }
        this.mBackgroundRect = rect;
        updateProgress(0.0f, 0.0f, 0.0f);
    }

    @Override // com.wakeup.module.video.interfaces.OnProgressVideoListener
    public void updateProgress(float time, float max, float scale) {
        Rect rect;
        if (this.mBackgroundRect != null) {
            if (scale == 0.0f) {
                Rect rect2 = this.mBackgroundRect;
                Intrinsics.checkNotNull(rect2);
                int i = rect2.top;
                Rect rect3 = this.mBackgroundRect;
                Intrinsics.checkNotNull(rect3);
                rect = new Rect(0, i, 0, rect3.bottom);
            } else {
                int i2 = (int) ((this.mViewWidth * scale) / 100);
                Rect rect4 = this.mBackgroundRect;
                Intrinsics.checkNotNull(rect4);
                int i3 = rect4.left;
                Rect rect5 = this.mBackgroundRect;
                Intrinsics.checkNotNull(rect5);
                int i4 = rect5.top;
                Rect rect6 = this.mBackgroundRect;
                Intrinsics.checkNotNull(rect6);
                rect = new Rect(i3, i4, i2, rect6.bottom);
            }
            this.mProgressRect = rect;
        }
        invalidate();
    }
}
