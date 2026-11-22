package com.wakeup.feature.course.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.wakeup.feature.course.R;
import xyz.doikki.videoplayer.controller.ControlWrapper;
import xyz.doikki.videoplayer.controller.IControlComponent;

/* loaded from: classes2.dex */
public class TrainVideoPreloadView extends FrameLayout implements IControlComponent {
    private ControlWrapper mControlWrapper;
    private final int mScaledTouchSlop;
    private int mStartX;
    private int mStartY;
    private final ImageView thumb;

    @Override // xyz.doikki.videoplayer.controller.IControlComponent
    public View getView() {
        return this;
    }

    @Override // xyz.doikki.videoplayer.controller.IControlComponent
    public void onLockStateChanged(boolean z) {
    }

    @Override // xyz.doikki.videoplayer.controller.IControlComponent
    public void onPlayerStateChanged(int i) {
    }

    @Override // xyz.doikki.videoplayer.controller.IControlComponent
    public void onVisibilityChanged(boolean z, Animation animation) {
    }

    @Override // xyz.doikki.videoplayer.controller.IControlComponent
    public void setProgress(int i, int i2) {
    }

    public TrainVideoPreloadView(Context context) {
        super(context);
        LayoutInflater.from(getContext()).inflate(R.layout.layout_train_video, (ViewGroup) this, true);
        this.thumb = (ImageView) findViewById(R.id.iv_thumb);
        this.mScaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    public TrainVideoPreloadView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(getContext()).inflate(R.layout.layout_train_video, (ViewGroup) this, true);
        this.thumb = (ImageView) findViewById(R.id.iv_thumb);
        this.mScaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    public TrainVideoPreloadView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(getContext()).inflate(R.layout.layout_train_video, (ViewGroup) this, true);
        this.thumb = (ImageView) findViewById(R.id.iv_thumb);
        this.mScaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    public void loadPreImageBg(Bitmap bitmap) {
        this.thumb.setImageBitmap(bitmap);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mStartX = (int) motionEvent.getX();
            this.mStartY = (int) motionEvent.getY();
            return true;
        }
        if (action != 1) {
            return false;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (Math.abs(x - this.mStartX) >= this.mScaledTouchSlop || Math.abs(y - this.mStartY) >= this.mScaledTouchSlop) {
            return false;
        }
        performClick();
        return false;
    }

    @Override // xyz.doikki.videoplayer.controller.IControlComponent
    public void attach(ControlWrapper controlWrapper) {
        this.mControlWrapper = controlWrapper;
    }

    @Override // xyz.doikki.videoplayer.controller.IControlComponent
    public void onPlayStateChanged(int i) {
        if (i == 0) {
            this.thumb.setVisibility(0);
        } else if (i == 3 || i == 4) {
            this.thumb.setVisibility(8);
        }
    }
}
