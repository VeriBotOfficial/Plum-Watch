package com.wakeup.module.video.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.wakeup.common.log.LogUtils;
import com.wakeup.commonui.utils.UIHelper;
import com.wakeup.module.video.R;
import com.wakeup.module.video.interfaces.OnRangeSeekBarListener;
import com.wakeup.module.video.view.Thumb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RangeSeekBarView.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010%\u001a\u00020&H\u0002J\u0006\u0010'\u001a\u00020&J\u000e\u0010(\u001a\u00020&2\u0006\u0010)\u001a\u00020\u0016J\u0018\u0010*\u001a\u00020&2\u0006\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u0007H\u0014J\u0010\u0010-\u001a\u00020&2\u0006\u0010.\u001a\u00020/H\u0014J\u0010\u00100\u001a\u00020\u001f2\u0006\u00101\u001a\u000202H\u0017J0\u00103\u001a\u00020&2\u0006\u00104\u001a\u00020\r2\u0006\u00105\u001a\u00020\r2\u0006\u00106\u001a\u00020\u00162\u0006\u00107\u001a\u00020\u00162\u0006\u00108\u001a\u00020\u001fH\u0002J\u0010\u00109\u001a\u00020\u00072\u0006\u0010:\u001a\u00020\u0007H\u0002J\u0018\u0010;\u001a\u00020\u00162\u0006\u0010:\u001a\u00020\u00072\u0006\u0010<\u001a\u00020\u0016H\u0002J\u0018\u0010=\u001a\u00020\u00162\u0006\u0010:\u001a\u00020\u00072\u0006\u0010>\u001a\u00020\u0016H\u0002J\u0010\u0010?\u001a\u00020&2\u0006\u0010:\u001a\u00020\u0007H\u0002J\u0010\u0010@\u001a\u00020&2\u0006\u0010:\u001a\u00020\u0007H\u0002J\u0010\u0010A\u001a\u00020\u00162\u0006\u0010:\u001a\u00020\u0007H\u0002J\u0016\u0010B\u001a\u00020&2\u0006\u0010:\u001a\u00020\u00072\u0006\u0010C\u001a\u00020\u0016J\u0018\u0010D\u001a\u00020&2\u0006\u0010:\u001a\u00020\u00072\u0006\u0010E\u001a\u00020\u0016H\u0002J\u0010\u0010F\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u0016H\u0002J\u0010\u0010G\u001a\u00020&2\u0006\u0010.\u001a\u00020/H\u0002J\u0010\u0010H\u001a\u00020&2\u0006\u0010.\u001a\u00020/H\u0002J\u0010\u0010I\u001a\u00020&2\u0006\u0010.\u001a\u00020/H\u0002J\u000e\u0010J\u001a\u00020&2\u0006\u0010K\u001a\u00020\u0014J \u0010L\u001a\u00020&2\u0006\u0010M\u001a\u00020\u00002\u0006\u0010:\u001a\u00020\u00072\u0006\u0010C\u001a\u00020\u0016H\u0002J \u0010N\u001a\u00020&2\u0006\u0010M\u001a\u00020\u00002\u0006\u0010:\u001a\u00020\u00072\u0006\u0010C\u001a\u00020\u0016H\u0002J \u0010O\u001a\u00020&2\u0006\u0010M\u001a\u00020\u00002\u0006\u0010:\u001a\u00020\u00072\u0006\u0010C\u001a\u00020\u0016H\u0002J \u0010P\u001a\u00020&2\u0006\u0010M\u001a\u00020\u00002\u0006\u0010:\u001a\u00020\u00072\u0006\u0010C\u001a\u00020\u0016H\u0002R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006Q"}, d2 = {"Lcom/wakeup/module/video/view/RangeSeekBarView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mHeightTimeLine", "thumbs", "", "Lcom/wakeup/module/video/view/Thumb;", "getThumbs", "()Ljava/util/List;", "setThumbs", "(Ljava/util/List;)V", "mListeners", "", "Lcom/wakeup/module/video/interfaces/OnRangeSeekBarListener;", "mMaxWidth", "", "mMinWidth", "mThumbWidth", "mThumbHeight", "mViewWidth", "mPixelRangeMin", "mPixelRangeMax", "mScaleRangeMax", "mFirstRun", "", "mShadow", "Landroid/graphics/Paint;", "mLine", "mBgPaint", "currentThumb", "init", "", "initMaxWidth", "initMinWidth", "minDuration", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onTouchEvent", "ev", "Landroid/view/MotionEvent;", "checkPositionThumb", "mThumbLeft", "mThumbRight", "dx", "coordinate", "isLeftMove", "getUnstuckFrom", "index", "pixelToScale", "pixelValue", "scaleToPixel", "scaleValue", "calculateThumbValue", "calculateThumbPos", "getThumbValue", "setThumbValue", "value", "setThumbPos", "pos", "getClosestThumb", "drawShadow", "drawBg", "drawThumbs", "addOnRangeSeekBarListener", "listener", "onCreate", "rangeSeekBarView", "onSeek", "onSeekStart", "onSeekStop", "module-video_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RangeSeekBarView extends View {
    private int currentThumb;
    private final Paint mBgPaint;
    private boolean mFirstRun;
    private int mHeightTimeLine;
    private final Paint mLine;
    private List<OnRangeSeekBarListener> mListeners;
    private float mMaxWidth;
    private float mMinWidth;
    private float mPixelRangeMax;
    private float mPixelRangeMin;
    private float mScaleRangeMax;
    private final Paint mShadow;
    private float mThumbHeight;
    private float mThumbWidth;
    private int mViewWidth;
    public List<Thumb> thumbs;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RangeSeekBarView(Context context, AttributeSet attrs) {
        this(context, attrs, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    public /* synthetic */ RangeSeekBarView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RangeSeekBarView(Context context, AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.mShadow = new Paint();
        this.mLine = new Paint();
        this.mBgPaint = new Paint();
        init();
    }

    public final List<Thumb> getThumbs() {
        List<Thumb> list = this.thumbs;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("thumbs");
        return null;
    }

    public final void setThumbs(List<Thumb> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.thumbs = list;
    }

    private final void init() {
        Thumb.Companion companion = Thumb.INSTANCE;
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        setThumbs(companion.initThumbs(resources));
        this.mThumbWidth = Thumb.INSTANCE.getWidthBitmap(getThumbs());
        this.mThumbHeight = Thumb.INSTANCE.getHeightBitmap(getThumbs());
        this.mScaleRangeMax = 100.0f;
        this.mHeightTimeLine = getContext().getResources().getDimensionPixelOffset(R.dimen.frames_video_height);
        setFocusable(true);
        setFocusableInTouchMode(true);
        this.mFirstRun = true;
        int color = getContext().getColor(R.color.shadow_color);
        this.mShadow.setAntiAlias(true);
        this.mShadow.setColor(color);
        this.mShadow.setAlpha(177);
        int color2 = getContext().getColor(R.color.line_color);
        this.mLine.setAntiAlias(true);
        this.mLine.setColor(color2);
        this.mLine.setAlpha(200);
        this.mBgPaint.setAntiAlias(true);
        this.mBgPaint.setColor(Color.parseColor("#ff7300"));
        this.mBgPaint.setStyle(Paint.Style.STROKE);
        this.mBgPaint.setStrokeWidth(UIHelper.dp2px(3.0f));
    }

    public final void initMaxWidth() {
        this.mMaxWidth = getThumbs().get(1).getPos() - getThumbs().get(0).getPos();
        onSeekStop(this, 0, getThumbs().get(0).getValue());
        onSeekStop(this, 1, getThumbs().get(1).getValue());
    }

    public final void initMinWidth(float minDuration) {
        float f = (minDuration * this.mPixelRangeMax) / 100;
        this.mMinWidth = f;
        LogUtils.d("RangeSeekBarView", "mMinWidth = " + f);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        this.mViewWidth = View.resolveSizeAndState(getPaddingLeft() + getPaddingRight() + getSuggestedMinimumWidth(), widthMeasureSpec, 1);
        setMeasuredDimension(this.mViewWidth, View.resolveSizeAndState(getPaddingBottom() + getPaddingTop() + ((int) this.mThumbHeight) + this.mHeightTimeLine, heightMeasureSpec, 1));
        this.mPixelRangeMin = 0.0f;
        this.mPixelRangeMax = this.mViewWidth - this.mThumbWidth;
        if (this.mFirstRun) {
            int size = getThumbs().size();
            for (int i = 0; i < size; i++) {
                Thumb thumb = getThumbs().get(i);
                float f = i;
                thumb.setValue(this.mScaleRangeMax * f);
                thumb.setPos(this.mPixelRangeMax * f);
            }
            int i2 = this.currentThumb;
            onCreate(this, i2, getThumbValue(i2));
            this.mFirstRun = false;
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        drawShadow(canvas);
        drawBg(canvas);
        drawThumbs(canvas);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent ev) {
        RangeSeekBarView rangeSeekBarView;
        Intrinsics.checkNotNullParameter(ev, "ev");
        float x = ev.getX();
        int action = ev.getAction();
        if (action == 0) {
            int closestThumb = getClosestThumb(x);
            this.currentThumb = closestThumb;
            if (closestThumb == -1) {
                return false;
            }
            Thumb thumb = getThumbs().get(this.currentThumb);
            thumb.setLastTouchX(x);
            onSeekStart(this, this.currentThumb, thumb.getValue());
            return true;
        }
        if (action == 1) {
            if (this.currentThumb == -1) {
                return false;
            }
            onSeekStop(this, this.currentThumb, getThumbs().get(this.currentThumb).getValue());
            return true;
        }
        if (action != 2) {
            return false;
        }
        Thumb thumb2 = getThumbs().get(this.currentThumb);
        Thumb thumb3 = getThumbs().get(this.currentThumb == 0 ? 1 : 0);
        float lastTouchX = x - thumb2.getLastTouchX();
        float pos = thumb2.getPos() + lastTouchX;
        if (this.currentThumb == 0) {
            float f = this.mPixelRangeMin;
            if (pos <= f) {
                thumb2.setPos(f);
                setThumbPos(this.currentThumb, thumb2.getPos());
                invalidate();
                return true;
            }
            rangeSeekBarView = this;
            rangeSeekBarView.checkPositionThumb(thumb2, thumb3, lastTouchX, x, true);
        } else {
            rangeSeekBarView = this;
            float f2 = rangeSeekBarView.mPixelRangeMax;
            if (pos >= f2) {
                thumb2.setPos(f2);
                setThumbPos(rangeSeekBarView.currentThumb, thumb2.getPos());
            } else {
                rangeSeekBarView.checkPositionThumb(thumb3, thumb2, lastTouchX, x, false);
            }
        }
        invalidate();
        return true;
    }

    private final void checkPositionThumb(Thumb mThumbLeft, Thumb mThumbRight, float dx, float coordinate, boolean isLeftMove) {
        float pos = mThumbLeft.getPos() + dx;
        float pos2 = mThumbRight.getPos() + dx;
        float widthBitmap = this.mMinWidth + mThumbLeft.getWidthBitmap();
        if (isLeftMove) {
            float f = this.mMaxWidth;
            float pos3 = mThumbRight.getPos() - pos;
            if (widthBitmap <= pos3 && pos3 <= f) {
                mThumbLeft.setPos(pos);
                mThumbLeft.setLastTouchX(coordinate);
                setThumbPos(0, mThumbLeft.getPos());
                return;
            }
            if (mThumbRight.getPos() - pos > this.mMaxWidth) {
                mThumbLeft.setPos(pos);
                mThumbLeft.setLastTouchX(coordinate);
                setThumbPos(0, mThumbLeft.getPos());
                mThumbRight.setPos(pos + this.mMaxWidth);
                setThumbPos(1, mThumbRight.getPos());
                return;
            }
            if (mThumbRight.getPos() - pos >= widthBitmap || pos2 > this.mPixelRangeMax) {
                return;
            }
            mThumbLeft.setPos(pos);
            mThumbLeft.setLastTouchX(coordinate);
            setThumbPos(0, mThumbLeft.getPos());
            mThumbRight.setPos(pos + widthBitmap);
            setThumbPos(1, mThumbRight.getPos());
            return;
        }
        float f2 = this.mMaxWidth;
        float pos4 = pos2 - mThumbLeft.getPos();
        if (widthBitmap <= pos4 && pos4 <= f2) {
            mThumbRight.setPos(pos2);
            mThumbRight.setLastTouchX(coordinate);
            setThumbPos(1, mThumbRight.getPos());
            return;
        }
        if (pos2 - mThumbLeft.getPos() > this.mMaxWidth) {
            mThumbRight.setPos(pos2);
            mThumbRight.setLastTouchX(coordinate);
            setThumbPos(1, mThumbRight.getPos());
            mThumbLeft.setPos(pos2 - this.mMaxWidth);
            setThumbPos(0, mThumbLeft.getPos());
            return;
        }
        if (pos2 - mThumbLeft.getPos() >= widthBitmap || pos < this.mPixelRangeMin) {
            return;
        }
        mThumbRight.setPos(pos2);
        mThumbRight.setLastTouchX(coordinate);
        setThumbPos(1, mThumbRight.getPos());
        mThumbLeft.setPos(pos2 - widthBitmap);
        setThumbPos(0, mThumbLeft.getPos());
    }

    private final int getUnstuckFrom(int index) {
        float value = getThumbs().get(index).getValue();
        do {
            index--;
            if (-1 >= index) {
                return 0;
            }
        } while (getThumbs().get(index).getValue() == value);
        return index + 1;
    }

    private final float pixelToScale(int index, float pixelValue) {
        float f = 100;
        float f2 = this.mPixelRangeMax;
        float f3 = (pixelValue * f) / f2;
        if (index == 0) {
            return f3 + ((((this.mThumbWidth * f3) / f) * f) / f2);
        }
        return f3 - (((((f - f3) * this.mThumbWidth) / f) * f) / f2);
    }

    private final float scaleToPixel(int index, float scaleValue) {
        float f = 100;
        float f2 = (this.mPixelRangeMax * scaleValue) / f;
        if (index == 0) {
            return f2 - ((scaleValue * this.mThumbWidth) / f);
        }
        return f2 + (((f - scaleValue) * this.mThumbWidth) / f);
    }

    private final void calculateThumbValue(int index) {
        if (index >= getThumbs().size() || getThumbs().isEmpty()) {
            return;
        }
        Thumb thumb = getThumbs().get(index);
        thumb.setValue(pixelToScale(index, thumb.getPos()));
        onSeek(this, index, thumb.getValue());
    }

    private final void calculateThumbPos(int index) {
        if (index >= getThumbs().size() || getThumbs().isEmpty()) {
            return;
        }
        Thumb thumb = getThumbs().get(index);
        thumb.setPos(scaleToPixel(index, thumb.getValue()));
    }

    private final float getThumbValue(int index) {
        return getThumbs().get(index).getValue();
    }

    public final void setThumbValue(int index, float value) {
        LogUtils.d("RangeSeekBarView", "index = " + index + " ; value = " + value);
        getThumbs().get(index).setValue(value);
        calculateThumbPos(index);
        invalidate();
    }

    private final void setThumbPos(int index, float pos) {
        getThumbs().get(index).setPos(pos);
        calculateThumbValue(index);
        invalidate();
    }

    private final int getClosestThumb(float coordinate) {
        int i = -1;
        if (!getThumbs().isEmpty()) {
            int size = getThumbs().size();
            for (int i2 = 0; i2 < size; i2++) {
                float pos = getThumbs().get(i2).getPos() + this.mThumbWidth;
                if (coordinate >= getThumbs().get(i2).getPos() && coordinate <= pos) {
                    i = getThumbs().get(i2).getIndex();
                }
            }
        }
        return i;
    }

    private final void drawShadow(Canvas canvas) {
        if (getThumbs().isEmpty()) {
            return;
        }
        for (Thumb thumb : getThumbs()) {
            if (thumb.getIndex() == 0) {
                float pos = thumb.getPos() + getPaddingLeft();
                if (pos > this.mPixelRangeMin) {
                    float f = this.mThumbWidth;
                    canvas.drawRect(new Rect((int) f, 0, (int) (pos + f), this.mHeightTimeLine), this.mShadow);
                }
            } else {
                float pos2 = thumb.getPos() - getPaddingRight();
                if (pos2 < this.mPixelRangeMax) {
                    canvas.drawRect(new Rect((int) pos2, 0, (int) (this.mViewWidth - this.mThumbWidth), this.mHeightTimeLine), this.mShadow);
                }
            }
        }
    }

    private final void drawBg(Canvas canvas) {
        if (getThumbs().isEmpty()) {
            return;
        }
        RectF rectF = new RectF();
        rectF.top = 0.0f;
        rectF.left = getThumbs().get(0).getPos() + 20;
        rectF.bottom = getThumbs().get(0).getHeightBitmap();
        rectF.right = getThumbs().get(getThumbs().size() - 1).getPos() - getPaddingRight();
        canvas.drawRect(rectF, this.mBgPaint);
    }

    private final void drawThumbs(Canvas canvas) {
        if (getThumbs().isEmpty()) {
            return;
        }
        for (Thumb thumb : getThumbs()) {
            if (thumb.getIndex() == 0) {
                if (thumb.getBitmap() != null) {
                    Bitmap bitmap = thumb.getBitmap();
                    Intrinsics.checkNotNull(bitmap);
                    canvas.drawBitmap(bitmap, thumb.getPos() + getPaddingLeft(), 0.0f, (Paint) null);
                }
            } else if (thumb.getBitmap() != null) {
                Bitmap bitmap2 = thumb.getBitmap();
                Intrinsics.checkNotNull(bitmap2);
                canvas.drawBitmap(bitmap2, thumb.getPos() - getPaddingRight(), 0.0f, (Paint) null);
            }
        }
    }

    public final void addOnRangeSeekBarListener(OnRangeSeekBarListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (this.mListeners == null) {
            this.mListeners = new ArrayList();
        }
        List<OnRangeSeekBarListener> list = this.mListeners;
        if (list != null) {
            list.add(listener);
        }
    }

    private final void onCreate(RangeSeekBarView rangeSeekBarView, int index, float value) {
        List<OnRangeSeekBarListener> list = this.mListeners;
        if (list == null) {
            return;
        }
        Intrinsics.checkNotNull(list);
        Iterator<OnRangeSeekBarListener> it = list.iterator();
        while (it.hasNext()) {
            it.next().onCreate(rangeSeekBarView, index, value);
        }
    }

    private final void onSeek(RangeSeekBarView rangeSeekBarView, int index, float value) {
        List<OnRangeSeekBarListener> list = this.mListeners;
        if (list == null) {
            return;
        }
        Intrinsics.checkNotNull(list);
        Iterator<OnRangeSeekBarListener> it = list.iterator();
        while (it.hasNext()) {
            it.next().onSeek(rangeSeekBarView, index, value);
        }
    }

    private final void onSeekStart(RangeSeekBarView rangeSeekBarView, int index, float value) {
        List<OnRangeSeekBarListener> list = this.mListeners;
        if (list == null) {
            return;
        }
        Intrinsics.checkNotNull(list);
        Iterator<OnRangeSeekBarListener> it = list.iterator();
        while (it.hasNext()) {
            it.next().onSeekStart(rangeSeekBarView, index, value);
        }
    }

    private final void onSeekStop(RangeSeekBarView rangeSeekBarView, int index, float value) {
        List<OnRangeSeekBarListener> list = this.mListeners;
        if (list == null) {
            return;
        }
        Intrinsics.checkNotNull(list);
        Iterator<OnRangeSeekBarListener> it = list.iterator();
        while (it.hasNext()) {
            it.next().onSeekStop(rangeSeekBarView, index, value);
        }
    }
}
