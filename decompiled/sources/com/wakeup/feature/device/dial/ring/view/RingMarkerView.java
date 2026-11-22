package com.wakeup.feature.device.dial.ring.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.wakeup.commonui.R;
import com.wakeup.commonui.utils.UIHelper;

/* loaded from: classes3.dex */
public class RingMarkerView extends View {
    private Paint mBackBgPaint;
    private Paint mLinePaint;
    private MarkerListener mListener;
    private int mVelocity;
    private int space10;

    public interface MarkerListener {
        void markerDraw();

        default void markerEnter(RingMarkerView ringMarkerView) {
        }

        void markerFocus(RingMarkerView ringMarkerView);

        void markerKeyUp();

        default void markerLeft(RingMarkerView ringMarkerView, int i) {
        }

        default void markerRight(RingMarkerView ringMarkerView, int i) {
        }

        void markerTouchEnd(RingMarkerView ringMarkerView);

        void markerTouchMove(RingMarkerView ringMarkerView, float f);

        void markerTouchStart(RingMarkerView ringMarkerView, float f);
    }

    public RingMarkerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setFocusable(true);
        this.mVelocity = 0;
        this.mListener = null;
        initView(context);
    }

    private void initView(Context context) {
        this.space10 = UIHelper.dp2px(10.0f);
        Paint paint = new Paint();
        this.mBackBgPaint = paint;
        paint.setAntiAlias(false);
        this.mBackBgPaint.setStrokeWidth(this.space10);
        this.mBackBgPaint.setColor(ContextCompat.getColor(context, R.color.color_FFA153));
        Paint paint2 = new Paint();
        this.mLinePaint = paint2;
        paint2.setAntiAlias(false);
        this.mLinePaint.setStrokeWidth(UIHelper.dp2px(1.0f));
        this.mLinePaint.setColor(ContextCompat.getColor(context, R.color.color_FFA153));
    }

    public void setListener(MarkerListener markerListener) {
        this.mListener = markerListener;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            requestFocus();
            this.mListener.markerTouchStart(this, motionEvent.getRawX());
        } else if (action == 1) {
            this.mListener.markerTouchEnd(this);
        } else if (action == 2) {
            this.mListener.markerTouchMove(this, motionEvent.getRawX());
        }
        return true;
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z, int i, Rect rect) {
        MarkerListener markerListener;
        if (z && (markerListener = this.mListener) != null) {
            markerListener.markerFocus(this);
        }
        super.onFocusChanged(z, i, rect);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        MarkerListener markerListener = this.mListener;
        if (markerListener != null) {
            markerListener.markerDraw();
        }
        int width = getWidth();
        float f = width / 3.0f;
        float height = getHeight() * 1.0f;
        canvas.drawLine(f, this.space10 - UIHelper.dp2px(1.0f), f, height - UIHelper.dp2px(19.0f), this.mBackBgPaint);
        canvas.drawLine(f, this.space10 - UIHelper.dp2px(1.0f), f, height, this.mLinePaint);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        this.mVelocity = this.mVelocity + 1;
        int sqrt = (int) Math.sqrt((r0 / 2) + 1);
        MarkerListener markerListener = this.mListener;
        if (markerListener != null) {
            if (i == 21) {
                markerListener.markerLeft(this, sqrt);
                return true;
            }
            if (i == 22) {
                markerListener.markerRight(this, sqrt);
                return true;
            }
            if (i == 23) {
                markerListener.markerEnter(this);
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        this.mVelocity = 0;
        MarkerListener markerListener = this.mListener;
        if (markerListener != null) {
            markerListener.markerKeyUp();
        }
        return super.onKeyDown(i, keyEvent);
    }
}
